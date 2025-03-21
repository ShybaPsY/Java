import java.time.LocalDate;

public class IngressoVip extends Ingresso{

    private double adicional;

    public IngressoVip(String show, LocalDate data, double valor, double adicional){
        super(show,data,valor);
        this.adicional = adicional;
    }

    @Override
    public double getValor() {
        return getValor()+adicional;
    }
}
