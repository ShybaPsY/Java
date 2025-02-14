import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exemplo Paises\n\n");

        List <Pais>listPaises = new ArrayList();

        Pais brasil = new Pais("ISO 3166-1", "Brasil", 193946886, 8515767.049);
        Pais paraguai = new Pais("ISO 3166-2", "Paraguai", 6862000, 406752);

        brasil.addVizinho(paraguai);

        for(Pais pais: brasil.getVizinhos()){

        }

        /*listPaises.add(Brasil);

        for(int i=0; i<listPaises.size(); i++){
            System.out.println("Densidade do pais, "+listPaises.get(i).getNome()+"\tDensidade:"+listPaises.get(i).getDensidade());
        }

        for(Pais pais: listPaises){
            System.out.println("Densidade do "+pais.getNome()+"é"+pais.getDensidade());
        }*/

    }
}