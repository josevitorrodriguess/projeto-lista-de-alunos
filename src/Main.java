import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaAlunos lista = new ListaAlunos();


        lista.adicionarAluno(123,"jose");
        lista.adicionarAluno(1234,"gui");
        lista.adicionarAluno(525, "Igor");
        lista.adicionarAluno(525555, "Matheus");


        System.out.println(lista);

        lista.removerAluno(123);

        System.out.println(lista);



        sc.close();

    }
}