
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor1 {


    private static final Logger LOGGER = Logger.getLogger(name:"Servidor");

    public static void main(String[] args) throws IOException {
        LOGGER.log(Level.INFO, msg:"Iniciando o servidor");
        ServerSocket servidor = new ServerSocket(port: 4000);

        LOGGER.(Level.INFO, msg:"Aguardando conexao");
        Socket conexao = servidor.accept();

        LOGGER.log(Level.INFO, msg:"Criando os objetos de comunicaçao");
        ObjectInputStream entrada = new ObjectInputStream(conexao.getInputStream());
        ObjectOutputStream saida = new ObjectOutputStream(conexao.getOutputStream());

        LOGGER.log(Level.INFO, msg:"Recebendo uma requisiçao";
        Requisicao requisicao = (Requisicao) entrada.readObject();

        LOGGER.log(level.INFO, msg:"Processa a requisiçao");

        Respota resposta = new Resposta();
        resposta.setHorario(LocalDateTime.now());

        switch(requisicao.getOperador()) {

            case '+':
                resposta.setResultado(requisicao.getC() + requisicao.getY());
                resposta.setStatus(200);
                resposta.SetMenssagem("A operaçao de adiçao foi realizada com sucesso");
                break;

            case '-':
                break;

            case '*':
                break;

            case '/':
                break;

            defaut:
            resposta.setResultado(null);
            resposta.setStatus(500);
            resposta.setMensagem("Operaçao invalida");
            break;
        }

        LOGGER.log(Level.INFO,)
    }


}
