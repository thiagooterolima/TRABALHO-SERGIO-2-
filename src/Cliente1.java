import java.util.logging.Logger;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.System.Logger.Level;
import java.net.Socket;

public class Cliente1 {
    private static final Logger LOGGER = Logger.getLogger("Cliente");
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Requisicao1 requisicao = new Requisicao1();
        requisicao.setC(0.0);
        requisicao.setF(32.0);
        requisicao.setOperacaoA('+');
        requisicao.setOperacaoA('/');
        requisicao.setOperacaoA('*');



        LOGGER.log(java.util.logging.Level.INFO, "Conectando ao servidor");
        Socket conexao = new Socket("127.0.0.1", 50000);


        LOGGER.log(java.util.logging.Level.INFO, "Criando os objetos de comunicação");
        ObjectInputStream entrada = new ObjectInputStream(conexao.getInputStream());
        ObjectOutputStream saida = new ObjectOutputStream(conexao.getOutputStream());

        LOGGER.log(java.util.logging.Level.INFO, "Enviando a requisição");
        saida.writeObject(requisicao);

        LOGGER.log(java.util.logging.Level.INFO, "Recebendo uma resposta");
        Resposta1 resposta = (Resposta1) entrada.readObject();

        System.out.println("X: " + requisicao.getC());
        System.out.println("Resultado: " + requisicao.getResultado1());
        System.out.println ("Y " + requisicao.getF());


        System.out.println("Resultado: " + resposta.getResultado());
        System.out.println("Horario: " + resposta.getHorario());
        System.out.println ("Status: " + resposta.getStatus());
        System.out.println("Menssagem:" + resposta.getMensagem());



    }

}
