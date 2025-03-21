import java.time.LocalDate;

public abstract class Ingresso {
    private String show;
    private LocalDate data;
    private double valor;

    public Ingresso(){
        this.show = "Sem Nome";
        this.data = LocalDate.now();
        this.valor = 0;
    }

    public Ingresso(String show, LocalDate data, double valor) {
        this.show = show;
        this.data = data;
        this.valor = valor;
    }


    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public String getShow() {
        return show;
    }
}
