public class Estagiario extends Colaborador{
    private int contrato;

    public Estagiario(int contrato, String nome) {
        super(nome);
        this.contrato = contrato;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    @Override
    public double getSalario(){
        return 800;
    }
}
