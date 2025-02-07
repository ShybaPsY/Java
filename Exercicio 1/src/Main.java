import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exemplo Paises\n");

        List <Pais>listPaises = new ArrayList();

        Pais Brasil = new Pais("ISO 3166-1", "Brasil", 193946886, 8515767.049);

        listPaises.add(Brasil);

        for(int i=0; i<listPaises.size(); i++){
            System.out.println("Densidade do pais, "+listPaises.get(i).getNome()+"\tDensidade:"+listPaises.get(i).getDensidade());
        }

    }
}