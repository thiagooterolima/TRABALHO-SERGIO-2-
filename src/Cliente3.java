import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cliente3 {

    private static final Logger LOGGER = Logger.getLogger("Cliente");
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Requisicao3 requisicao = new Requisicao3();
        requisicao.setDolar(5.20);
        requisicao.setReal(1.0);
        requisicao.setEuro(5.53);
        requisicao.setValor(1.0);
        requisicao.setOperacao('/');


        LOGGER.log(Level.INFO,"Conectando ao servidor");
        Socket conexao = new Socket("127.0.0.1",40000);

        LOGGER.log(Level.INFO,"Criando os objetos de comunicação");
        ObjectOutputStream saida = new ObjectOutputStream(conexao.getOutputStream());
        ObjectInputStream entrada = new ObjectInputStream(conexao.getInputStream());

        LOGGER.log(Level.INFO,"Enviando a requisição");
        saida.writeObject(requisicao);

        LOGGER.log(Level.INFO,"Recebendo uma resposta");
        Resposta3 resposta = (Resposta3) entrada.readObject();

        System.out.println("Valor Do Real " + requisicao.getReal());
        System.out.println("Valor Do Dolar " + requisicao.getDolar());
        System.out.println("Valor Do Euro " + requisicao.getEuro() + "\n");

        System.out.println("Real Convertido em Dolar: " + resposta.getResultado());
        System.out.println("Real Convertido em Euro: " + resposta.getResultado1());
        System.out.println("Dolar Convertido em Real: " + resposta.getResultado2());
        System.out.println("Euro Convertido em Real: " + resposta.getResultado3() + "\n");
        System.out.println("Horario: " + resposta.getHorario());
        System.out.println("Mensagem : " +resposta.getMensagem());


    }


}
