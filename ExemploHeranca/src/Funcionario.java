public class Funcionario {
    private int ctps;
    private String nome;
    protected double vlrHora;
    protected int nhTrab;

    //construtor vazio
    public Funcionario() {
        this(0,"",0,0);
    }

    public Funcionario(int ctps, String nome, double vlrHora, int nhTrab) {
        this.ctps = ctps;
        this.nome = nome;
        this.vlrHora = vlrHora;
        this.nhTrab = nhTrab;
    }

    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVlrHora() {
        return vlrHora;
    }

    public void setVlrHora(double vlrHora) {
        this.vlrHora = vlrHora;
    }

    public int getNhTrab() {
        return nhTrab;
    }

    public void setNhTrab(int nhTrab) {
        this.nhTrab = nhTrab;
    }

    public double getSalario()
    {
        return nhTrab*vlrHora;
    }
    @Override
    public String toString(){
        return nome;
    }
}
