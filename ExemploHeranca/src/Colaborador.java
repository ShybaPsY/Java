abstract public class Colaborador {
    private String nome;

    public Colaborador(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    abstract public double getSalario();

    @Override
    public String toString(){
        return getNome();
    }
}
