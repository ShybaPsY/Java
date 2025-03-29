public class PessoaFisica extends Contribuinte {
    private char sexo;

    public PessoaFisica(String nome, String documento, double rendaBruta, char sexo) {
        super(nome, documento, rendaBruta);
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public double calcImposto() {
        if (rendaBruta <= 1400) return 0;
        else if (rendaBruta <= 2100) return rendaBruta * 0.10 - 100;
        else if (rendaBruta <= 2800) return rendaBruta * 0.15 - 270;
        else if (rendaBruta <= 3600) return rendaBruta * 0.25 - 500;
        else return rendaBruta * 0.30 - 700;
    }
}
