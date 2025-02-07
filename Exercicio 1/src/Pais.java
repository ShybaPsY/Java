public class Pais {

    String codIso;
    String nome;
    int populacao;
    double dimensao;

    public Pais(String codIso, String nome, int populacao, double dimensao){
        this.codIso = codIso;
        this.nome = nome;
        setPopulacao(populacao);
        this.dimensao = dimensao;
    }
    public Pais(){
        this("","",0,0);
    }
    public String getCodIso(){
        return codIso;
    }
    public  void setCodIso(String codIso){
        this.codIso = codIso;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getPopulacao(){
        return  populacao;
    }
    public void setPopulacao(int populacao){
        if(populacao>=0) {
            this.populacao = populacao;
        }
    }
    public double getDimensao(){
        return dimensao;
    }
    public void setDimensao(double dimensao){
        if(dimensao>=0){
            this.dimensao = dimensao;
        }
    }
    public double getDensidade(){
        return populacao/dimensao;
    }
    public boolean isEqual(Pais pais1, Pais pais2){
        return pais1.getCodIso().equals(pais2.getCodIso());
    }
}
