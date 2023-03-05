
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.System.Logger;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.logging.Level;


public class Servidor1 {


    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger("Servidor");
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LOGGER.log(java.util.logging.Level.INFO, "Iniciando o servidor");
        ServerSocket servidor = new ServerSocket(50000);

        while (true) {
            LOGGER.log(java.util.logging.Level.INFO, "Aguardando conexão");
            Socket conexao = servidor.accept();

            LOGGER.log(java.util.logging.Level.INFO, "Criando os objetos de comunicação");
            ObjectOutputStream saida = new ObjectOutputStream(conexao.getOutputStream());
            ObjectInputStream entrada = new ObjectInputStream(conexao.getInputStream());

            LOGGER.log(java.util.logging.Level.INFO, "Recebendo uma requisição");
            Requisicao1 requisicao = (Requisicao1) entrada.readObject();

            LOGGER.log(java.util.logging.Level.INFO, "Processando a requisição");
            Resposta1 resposta = new Resposta1();
            resposta.setHorario(LocalDateTime.now());

            switch (requisicao.getOperacaoA()) {
                case '+' :
                    resposta.setResultado(requisicao.getC() + requisicao.getF());
                    resposta.setStatus(200);
                    resposta.setMensagem("A operação de adição foi realizada com sucesso");
                    break;

                case '-' :
                    break;

                case '*' :
                    break;

                case '/' :
                    break;

                default:
                    resposta.setResultado(null);
                    resposta.setStatus(500);
                    resposta.setMensagem("Operação inválida");
                    break;
            }

            LOGGER.log(Level.INFO, "Enviando a resposta");
            saida.writeObject(resposta);
        }
    }


}
