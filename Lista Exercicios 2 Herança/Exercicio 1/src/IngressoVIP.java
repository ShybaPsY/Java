import java.time.LocalDate;

public class IngressoVIP extends Ingresso {
    private double adicional;

    public IngressoVIP(String nomeShow, double valor, LocalDate dataShow, double adicional) {
        super(nomeShow, valor, dataShow);
        this.adicional = adicional;
    }

    @Override
    public double getValor() {
        return valor + adicional;
    }
}
