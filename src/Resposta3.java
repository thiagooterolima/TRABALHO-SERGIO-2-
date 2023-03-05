import java.io.Serializable;
import java.time.LocalDateTime;

public class Resposta3 implements Serializable {
    private Double resultado;

    private Double resultado1;

    private  Double resultado3;

    public Double getResultado3() {
        return resultado3;
    }

    public void setResultado3(Double resultado3) {
        this.resultado3 = resultado3;
    }

    public Double getResultado1() {
        return resultado1;
    }

    public void setResultado1(Double resultado1) {
        this.resultado1 = resultado1;
    }

    public Double getResultado2() {
        return resultado2;
    }

    public void setResultado2(Double resultado2) {
        this.resultado2 = resultado2;
    }

    private  Double resultado2;
    private String mensagem;
    private LocalDateTime horario;


    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }





}
