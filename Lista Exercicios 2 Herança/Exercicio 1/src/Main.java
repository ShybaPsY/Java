import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dataShow = LocalDate.of(2025, 5, 10);
        Bilheteria bilheteria = new Bilheteria(100, "Rock in Java", 100.0, 50.0, dataShow);

        System.out.println("Valor total antes da venda: " + bilheteria.calcularValorTotal());

        Ingresso vendido = bilheteria.vender('n');
        if (vendido != null) {
            System.out.println("Ingresso vendido por: " + vendido.getValor());
        }
        System.out.println("Valor total após a venda: " + bilheteria.calcularValorTotal());
    }
}
