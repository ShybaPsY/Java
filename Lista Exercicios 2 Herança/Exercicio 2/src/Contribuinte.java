public abstract class Contribuinte implements ITributacao {
    protected String nome;
    protected String documento;
    protected double rendaBruta;

    public Contribuinte(String nome, String documento, double rendaBruta) {
        this.nome = nome;
        this.documento = documento;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return nome;
    }
    public String getDocumento() {
        return documento;
    }
    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
}
