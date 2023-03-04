

import java.io.Serializable;
import java.time.LocalDateTime;

public class Requisicao1 implements Serializable{
    private Double resultado;

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
