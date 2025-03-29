import java.util.ArrayList;
import java.util.List;

public class Dicionario implements IDic {
    private List<Termo> termos;

    public Dicionario() {
        this.termos = new ArrayList<>();
    }

    @Override
    public boolean inserir(Termo termo) {
        for (Termo t : termos) {
            if (t.getPalavra().equalsIgnoreCase(termo.getPalavra())) {
                return false; // Não permite termos repetidos
            }
        }
        termos.add(termo);
        return true;
    }

    @Override
    public String traduzir(String palavra) {
        for (Termo t : termos) {
            if (t.getPalavra().equalsIgnoreCase(palavra)) {
                return t.getTraducao();
            }
        }
        return "Palavra não encontrada";
    }

    @Override
    public boolean remover(String palavra) {
        for (int i = 0; i < termos.size(); i++) {
            if (termos.get(i).getPalavra().equalsIgnoreCase(palavra)) {
                termos.remove(i);
                return true;
            }
        }
        return false;
    }
}