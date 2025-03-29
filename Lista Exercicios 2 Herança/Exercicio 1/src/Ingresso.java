import java.time.LocalDate;

public abstract class Ingresso {
    protected String nomeShow;
    protected double valor;
    protected LocalDate dataShow;

    public Ingresso(String nomeShow, double valor, LocalDate dataShow) {
        this.nomeShow = nomeShow;
        this.valor = valor;
        this.dataShow = dataShow;
    }

    public String getShow() {
        return nomeShow;
    }

    public LocalDate getData() {
        return dataShow;
    }

    public abstract double getValor();
}