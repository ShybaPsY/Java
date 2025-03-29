public class Main {
    public static void main(String[] args) {
        PagadoresImposto pagadores = new PagadoresImposto();

        pagadores.adicionarContribuinte(new PessoaFisica("Ana", "123.456.789-00", 2500, 'F'));
        pagadores.adicionarContribuinte(new PessoaFisica("Carlos", "987.654.321-00", 3500, 'M'));
        pagadores.adicionarContribuinte(new PessoaJuridica("Empresa X", "12.345.678/0001-99", 50000, 1995));

        System.out.println("Total de impostos devidos: R$ " + pagadores.calcularTotalImposto());
        System.out.println("Percentual de contribuintes femininos: " + pagadores.calcularPercentualFeminino() + "%");
    }
}
