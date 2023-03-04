import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor3 {

    private static final Logger LOGGER = Logger.getLogger("Servidor");
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LOGGER.log(Level.INFO,"Inicando o servidor");
        ServerSocket servidor = new ServerSocket(40000);

        LOGGER.log(Level.INFO,"Aguardando conexão");
        Socket conexao = servidor.accept();

        LOGGER.log(Level.INFO,"Criando os objetos de comunicação");
        ObjectInputStream entrada = new ObjectInputStream(conexao.getInputStream());
        ObjectOutputStream saida = new ObjectOutputStream(conexao.getOutputStream());

        LOGGER.log(Level.INFO,"Recebendo uma requisição");
        Requisicao3 requisicao = (Requisicao3) entrada.readObject();

        LOGGER.log(Level.INFO,"Processando a requisição");

        Resposta3 resposta = new Resposta3();
        resposta.setHorario(LocalDateTime.now());

        switch (requisicao.getOperacao()){
            case '/':
                resposta.setResultado(requisicao.getReal() / requisicao.getDolar());

                resposta.setStatus(200);
                resposta.setMensagem("O Valor em Dolar ");
                break;

        }
        LOGGER.log(Level.INFO,"Enviando a resposta");
        saida.writeObject(resposta);

    }
}
