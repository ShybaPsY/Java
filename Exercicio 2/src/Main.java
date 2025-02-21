import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Adega adega = new Adega();
        adega.addVinho(new Vinho("tinto","sangue de boi", 1000, LocalDate.of(2024,2,20),11), 5,11);
        adega.addVinho(new Vinho("branco","Xabuletrania", 1000, LocalDate.of(1999,2,20),25), 3,1);
        adega.addVinho(new Vinho("tinto","Zigirigidum", 1000, LocalDate.of(1498,2,20),11), 3,5);

        System.out.println(adega);
        System.out.println(adega.getVinhoMaisAntigo().getMarca());
    }
}
