import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        paises = new ArrayList();
    }
    public boolean addPais(Pais pais){
        return paises.add(pais);
    }
    public double getDimensao() {
        double dim = 0;
        for (Pais pais : paises)
            dim += pais.getDimensao();
        return dim;
    }
    public Pais getPaisMaiorDimensao(){
        Pais aux = null;
        if(paises.size()>0){
            aux = new Pais();
        }
        aux.setDimensao(0);
        for(Pais pais : paises)
            if(pais.getDimensao() > aux.getDimensao())
                aux = pais;
        return aux;
    }
    public double getPopulacao(){
        double populacao = 0;
        for(Pais pais : paises){
            populacao += pais.getPopulacao();
        }
        return populacao;
    }
    public double getDensidade(){
        return getPopulacao() / getDimensao();
    }
    public Pais getPaisMaiorPopulacao(){
        Pais aux = null;
        if (paises.size()>0){
            aux = new Pais();
        }
        aux.setPopulacao(0);
        for(Pais pais : paises)
            if(pais.getPopulacao() > aux.getPopulacao())
                aux = pais;
        return aux;
    }
}
