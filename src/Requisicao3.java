import java.io.Serializable;

public class Requisicao3 implements Serializable {

    private Double Real;
    private Double Dolar;
    private Double Euro;

    public Double getReal() {
        return Real;
    }

    public void setReal(Double real) {
        Real = real;
    }

    public Double getDolar() {
        return Dolar;
    }

    public void setDolar(Double dolar) {
        Dolar = dolar;
    }

    public Double getEuro() {
        return Euro;
    }

    public void setEuro(Double euro) {
        Euro = euro;
    }

    public Character getOperacao() {
        return operacao;
    }

    public void setOperacao(Character operacao) {
        this.operacao = operacao;
    }

    private Character operacao;

}
