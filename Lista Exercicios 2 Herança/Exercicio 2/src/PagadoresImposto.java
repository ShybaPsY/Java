import java.util.ArrayList;
import java.util.List;

public class PagadoresImposto {
    private List<Contribuinte> contribuintes;

    public PagadoresImposto() {
        contribuintes = new ArrayList<>();
    }

    public void adicionarContribuinte(Contribuinte contribuinte) {
        contribuintes.add(contribuinte);
    }

    public double calcularTotalImposto() {
        double total = 0;
        for (Contribuinte c : contribuintes) {
            total += c.calcImposto();
        }
        return total;
    }

    public double calcularPercentualFeminino() {
        int totalPessoas = 0, totalFeminino = 0;
        for (Contribuinte c : contribuintes) {
            if (c instanceof PessoaFisica) {
                totalPessoas++;
                if (((PessoaFisica) c).getSexo() == 'F') {
                    totalFeminino++;
                }
            }
        }
        return (totalPessoas == 0) ? 0 : (totalFeminino * 100.0 / totalPessoas);
    }
}