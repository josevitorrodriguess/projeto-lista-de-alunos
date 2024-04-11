public class ListaAlunos {
    private Aluno[] listaAlunos = new Aluno[60];
    private int contador = 0;

    public Aluno getAluno(int rgm) {
        for (Aluno aluno : listaAlunos) {
            if (aluno != null && aluno.getRgm() == rgm) {
                return aluno;
            }
        }
        return null;
    }

    public void adicionarAluno(int rgm, String nome) {
        if (contador < 60) {
            Aluno novoAluno = new Aluno(rgm, nome);
            listaAlunos[contador] = novoAluno;
            contador++;
        } else {
            System.out.println("A sala está cheia, não foi possível adicionar mais um aluno!");
        }
    }

    public void removerAluno(int rgm) {
        for (int i = 0; i < contador; i++) {
            if (listaAlunos[i].getRgm() == rgm) {
                // Move o último aluno para a posição a ser removida
                listaAlunos[i] = listaAlunos[contador - 1];
                listaAlunos[contador - 1] = null; // Limpa a última posição
                contador--;
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista De Alunos{\n");
        for (int i = 0; i < contador; i++) {
            sb.append(listaAlunos[i]).append('\n');
        }
        sb.append('}');
        return sb.toString();
    }
}
