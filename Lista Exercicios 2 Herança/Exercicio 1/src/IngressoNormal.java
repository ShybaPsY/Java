import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class IngressoNormal extends Ingresso {
    public IngressoNormal(String nomeShow, double valor, LocalDate dataShow) {
        super(nomeShow, valor, dataShow);
    }

    @Override
    public double getValor() {
        long diasParaShow = ChronoUnit.DAYS.between(LocalDate.now(), dataShow);
        if (diasParaShow > 5) {
            return valor;
        } else {
            return valor * Math.pow(1.1, (5 - diasParaShow));
        }
    }
}