import java.util.ArrayList;


public class ListaAlunos {
    private ArrayList<Aluno> listaAlunos = new ArrayList<>(60);
    private int contador = 0;





    public Aluno getAluno(int rgm){
        for (Aluno aluno : listaAlunos) {
            if (aluno.getRgm() == rgm) {
                return aluno;
            }
        }
        return null;
    }

    public void adicionarAluno(int rgm, String nome) {
        Aluno novoAluno = new Aluno(rgm, nome);
        if (contador<=60){
        listaAlunos.add(novoAluno);
        contador++;
        } else {
            System.out.println("A sala está cheia, não foi possível adicionar mais um aluno!");
        }
    }

    public void removerAluno(int rgm) {
        for (int i = 0; i < listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getRgm() == rgm) {
                listaAlunos.remove(i);
                break;
            }
        }
    }


    @Override
    public String toString() {
        return " Lista De Alunos{\n" + listaAlunos +'}';
    }
}
