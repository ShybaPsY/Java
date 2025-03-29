public class PessoaJuridica extends Contribuinte {
    private int anoDeFundacao;

    public PessoaJuridica(String nome, String documento, double rendaBruta, int anoDeFundacao) {
        super(nome, documento, rendaBruta);
        this.anoDeFundacao = anoDeFundacao;
    }

    public int getAnoDeFundacao() {
        return anoDeFundacao;
    }
    public void setAnoDeFundacao(int anoDeFundacao) {
        this.anoDeFundacao = anoDeFundacao;
    }

    @Override
    public double calcImposto() {
        return rendaBruta * 0.10;
    }
}
