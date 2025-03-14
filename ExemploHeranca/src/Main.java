public class Main {
    public static void main(String[] args) {
        Funcionario[] equipe = new Funcionario[10];
        int tl=0;

        Funcionario f1=new Funcionario(123,"Vanderglayson Silva",40,40);
        Funcionario f2=new Funcionario(985,"Frederico Oliveira",25,40);
        Gerente g=new Gerente(910,"Bernardo Rocha",40,40,10);
        Supervisor s=new Supervisor(458, "Fabson Jr", 40,40,5,18);

        equipe[tl++] = f1;
        equipe[tl++] = f2;
        equipe[tl++] = g;
        equipe[tl++] = s;
        equipe[tl++] = new Funcionario(877,"Kerolyne Veiga",40,20);

        for (int i = 0; i < tl; i++) {
            mostraFuncionario(equipe[i]);
        }
    }
    static void mostraFuncionario(Funcionario f){
        System.out.println("* "+f.getNome()+" Ganha R$ "+String.format("%.2f",f.getSalario())+" *");
        if(f instanceof Gerente){
            System.out.println("       Adicional de "+((Gerente)f).getAdicional()+"%");
        }
    }
}