import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bilheteria {
    private List<Ingresso> ingressos;

    public Bilheteria(int quantidadeTotal, String nomeShow, double valorIngresso, double adicionalVIP, LocalDate dataShow) {
        ingressos = new ArrayList<>();
        int qtdVIP = (int) (quantidadeTotal * 0.2);
        int qtdNormais = quantidadeTotal - qtdVIP;

        for (int i = 0; i < qtdNormais; i++) {
            ingressos.add(new IngressoNormal(nomeShow, valorIngresso, dataShow));
        }
        for (int i = 0; i < qtdVIP; i++) {
            ingressos.add(new IngressoVIP(nomeShow, valorIngresso, dataShow, adicionalVIP));
        }
    }

    public Ingresso vender(char tipo) {
        for (Ingresso ingresso : ingressos) {
            if ((tipo == 'n' && ingresso instanceof IngressoNormal) || (tipo == 'v' && ingresso instanceof IngressoVIP)) {
                ingressos.remove(ingresso);
                return ingresso;
            }
        }
        return null; // Se não houver ingressos disponíveis do tipo desejado
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Ingresso ingresso : ingressos) {
            total += ingresso.getValor();
        }
        return total;
    }
}