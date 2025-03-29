public class TermoSimples extends Termo {
    private String pronuncia;

    public TermoSimples(String palavra, String traducao, String pronuncia) {
        super(palavra, traducao);
        this.pronuncia = pronuncia;
    }

    public String getPronuncia() {
        return pronuncia;
    }
}