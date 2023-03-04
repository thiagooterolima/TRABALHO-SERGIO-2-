

import java.io.Serializable;
import java.time.LocalDateTime;

public class Requisicao1 implements Serializable{
   private Integer c;

   private Integer f;
   private Integer resultado1;
   private Character operacaoA;
   private Character operacaoB;
   private Character operacaoC;


    public Character getOperacaoC() {
        return operacaoC;
    }

    public void setOperacaoC(Character operacaoC) {
        this.operacaoC = operacaoC;
    }

    public Character getOperacaoA() {
        return operacaoA;
    }

    public void setOperacaoA(Character operacaoA) {
        this.operacaoA = operacaoA;
    }

    public Character getOperacaoB() {
        return operacaoB;
    }

    public void setOperacaoB(Character operacaoB) {
        this.operacaoB = operacaoB;
    }

    public Integer getResultado1() {
        return resultado1;
    }

    public void setResultado1(Integer resultado) {
        this.resultado1 = resultado;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public Integer getF() {
        return f;
    }

    public void setF(Integer f) {
        this.f = f;
    }
}
