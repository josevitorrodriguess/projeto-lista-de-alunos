import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



    ListaAlunos lista = new ListaAlunos();

    lista.adicionarAluno(123, "ze");
    lista.adicionarAluno(456, "andrade");
    lista.adicionarAluno(789, "luigi");

    lista.getAluno(123).addMateria("Inteligencia Artificial");
    lista.getAluno(123).addMateria("Pensamento Computacional");
    lista.getAluno(123).addMateria("Banco de dados");



    lista.getAluno(456).addMateria("Sistemas Operacionais");
    lista.getAluno(789).addMateria("Valorant");




        System.out.println(lista);


        System.out.println("ALUNO BUSCADO:");
        lista.buscarAluno(456);

        lista.removerAluno(789);
        System.out.println("LISTA APOS REMOVER luigi:");
        System.out.println(lista);

        System.out.println("BUSCAR LUIGI APOS REMOCAO:");
        lista.buscarAluno(789);


        sc.close();

    }
}