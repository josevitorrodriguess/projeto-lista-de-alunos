import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ListaAlunos listaAlunos = new ListaAlunos();

        System.out.print("Quantos alunos adicionar na lista? ");
        int tamanho = input.nextInt();

        if (tamanho > 60 || tamanho <= 0) {
            System.out.println("Tamanho inválido!");
            System.exit(0);
        }

        input.nextLine();

        //cria um aluno com nome rgm e matéria
        for (int i = 0; i < tamanho; i++){


            System.out.printf("  Digite o nome do aluno[%d]: ", i+1);
            String nome = input.nextLine();

            System.out.printf("  Digite o rgm de [%s]: ", nome);
            int rgm = input.nextInt();

            listaAlunos.adicionarAluno(rgm, nome);

            input.nextLine();

            while (true){
                System.out.print("    Digite uma matéria: ");
                String materia = input.nextLine();
                listaAlunos.getAluno(rgm).addMateria(materia);

                System.out.print("    Quer adicionar mais matérias [sim/não]? ");
                String resposta = input.nextLine().toLowerCase();

                if (resposta.equals("não")) {
                    break;
                }
            }
        }

        System.out.println(listaAlunos);

        System.out.print("\nDigite um rgm para buscar o aluno na lista: ");
        int buscaAluno = input.nextInt();
        listaAlunos.buscarAluno(buscaAluno);

        System.out.print("\nDigite um RGM para remover um aluno da lista: ");
        int removeAluno = input.nextInt();
        listaAlunos.removerAluno(removeAluno);

        System.out.println(listaAlunos);

        input.close();
    }
}