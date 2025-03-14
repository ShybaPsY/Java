public class Supervisor extends Funcionario{
    private int diasSupervisao;
    private double valorSupervisao;

    public Supervisor(int ctps, String nome, double vlrHora, int nhTrab, int diasSupervisao, double valorSupervisao){
        super(ctps, nome, vlrHora, nhTrab);
        this.diasSupervisao = diasSupervisao;
        this.valorSupervisao = valorSupervisao;
    }

    public int getDiasSupervisao() {
        return diasSupervisao;
    }

    public double getValorSupervisao() {
        return valorSupervisao;
    }

    public void setDiasSupervisao(int diasSupervisao) {
        this.diasSupervisao = diasSupervisao;
    }

    public void setValorSupervisao(double valorSupervisao) {
        this.valorSupervisao = valorSupervisao;
    }

    @Override
    public double getSalario() {
        return super.getSalario()+(diasSupervisao*valorSupervisao);
    }
}
