import java.util.ArrayList;
import java.util.List;

public class Pais {

    private String codIso;
    private String nome;
    private int populacao;
    private double dimensao;
    private List <Pais> vizinhos = new ArrayList();

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
    public boolean addVizinho(Pais novoVizinho){

        if(!isVizinho(novoVizinho)) {
            vizinhos.add(novoVizinho);
            return true;
        }
        return false;
    }
    public boolean isVizinho(Pais outroPais){
        boolean encontrou = false;
        for(Pais pais : vizinhos){
            if(isEqual(pais, outroPais)){
                encontrou = true;
            }
        }
        return encontrou;
    }


}
