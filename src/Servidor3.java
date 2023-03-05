import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor3 {


    private static final Logger LOGGER = Logger.getLogger("Servidor");
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String usuario;
        int senha;

        String Vusuario;
        int Vsenha;

        LOGGER.log(Level.INFO, "Inicando o servidor");
        ServerSocket servidor = new ServerSocket(40000);

        Scanner ler = new Scanner((System.in));

        System.out.println("Cadatre o Usuario");
        usuario = ler.next();

        System.out.println("Cadastre a Senha");
        senha = ler.nextInt();

        System.out.println("Digite Seu Usuario");
        Vusuario = ler.next();

        System.out.println("Digite Sua Senha");
        Vsenha = ler.nextInt();

        LOGGER.log(Level.INFO, "Aguardando conexão");
        Socket conexao = servidor.accept();
        for (int count = 0 ; count > 1 ; count++) {
            if ((senha == Vsenha) && (usuario == Vusuario)) {
            }
        }

            LOGGER.log(Level.INFO, "Criando os objetos de comunicação");
            ObjectInputStream entrada = new ObjectInputStream(conexao.getInputStream());
            ObjectOutputStream saida = new ObjectOutputStream(conexao.getOutputStream());

            LOGGER.log(Level.INFO, "Recebendo uma requisição");
            Requisicao3 requisicao = (Requisicao3) entrada.readObject();

            LOGGER.log(Level.INFO, "Processando a requisição");

            Resposta3 resposta = new Resposta3();
            resposta.setHorario(LocalDateTime.now());

            switch (requisicao.getOperacao()) {
                case '/':
                    resposta.setResultado(requisicao.getReal() / requisicao.getDolar());
                    resposta.setResultado1(requisicao.getReal() / requisicao.getEuro());
                    resposta.setResultado2(requisicao.getReal() * requisicao.getDolar());
                    resposta.setResultado3(requisicao.getEuro() * requisicao.getReal());


                    resposta.setMensagem("O Valor Convertidos ");
                    break;

            }
            LOGGER.log(Level.INFO, "Enviando a resposta");
            saida.writeObject(resposta);


    }
}
