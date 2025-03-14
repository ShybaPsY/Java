public class Gerente extends Funcionario{
    private double adicional;

    public Gerente(int ctps, String nome, double vlrHora, int nhTrab, double adicional){
        super(ctps,nome,vlrHora,nhTrab);
        this.adicional=adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    @Override
    public double getSalario()
    {
        //return nhTrab*vlrHora*(1+adicional/100);
        //return getNhTrab()*getVlrHora()*(1+adicional/100);
        return super.getSalario()*(1+adicional/100);
    }
}
