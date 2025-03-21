public class Funcionario extends Colaborador {
    private int ctps;
    private String nome;
    protected double vlrHora;
    protected int nhTrab;

    //construtor vazio
    public Funcionario() {
        this(0,"",0,0);
    }

    public Funcionario(int ctps, String nome, double vlrHora, int nhTrab) {
        super(nome);
        this.ctps = ctps;
        this.vlrHora = vlrHora;
        this.nhTrab = nhTrab;
    }

    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
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

}
