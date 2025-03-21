import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class IngressoNormal extends Ingresso{

    public IngressoNormal(String show, LocalDate data, double valor){
        super(show,data,valor);
    }


    @Override
    public double getValor(){
        LocalDate hoje = LocalDate.now();
        long diferenca = hoje.until(getData(), ChronoUnit.DAYS);
        if(diferenca > 5){
            return getValor();
        }
        else{
            double valor = getValor();
            for (long i = diferenca; i < 5; i++) {
                valor = valor *1.1;
            }
            return valor;
        }
    }

}
