/*

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.System.Logger.Level;
import java.net.Socket;

public class Cliente1 {
    public static void main(String[] args) {
        Requisicao1 requisicao = new Requisicao1();
        requisicao.setX(20.0);
        requisicao.setY(10.0);
        requisicao.setOperacao('+');


        LOGGER.log(Level.INFO, msg:"Conectando ao servidor");
        Socket conexao = new Socket(host: "127.0.0.1", port:4000);


        LOGGER.log(Level.INFO, msg:"Criando os objetos de comunicaçao");
        ObjectInputStream entrada = new ObjectInputStream(conexao.getInputStream());
        ObjectOutputStream saida = new ObjectOutputStream(conexao.getOutputStream());

        LOGGER.log(Level.INFO, msg: "Enviado a requisiçao");
        saida.wirteObject(requisicao);

        LOGGER.log(Level.INFO, msg:"Recebendo uma resposta");
        Resposta resposta = (Resposta) entrada.readObject();

        System.out.println("X: " + requisicao.getX());
        System.out.println("Operaçao: " + requisicao.getOperacao());
        System.out.println ("Y " + requisicao.getY());


        System.out.println("Resultado: " + resposta.getResultado());
        System.out.println("Horario: " + resposta.getHorario());
        System.out.println ("Status: " + resposta.getStatus());
        System.out.println("Menssagem:" + resposta.getMenssagem());

        LOGGER.log(Level.INFO, msg: "Enviando a requisiçao");

    }

}
*/