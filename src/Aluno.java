import Disciplinas.Materia;

public class Aluno {
    private String nome;
    private int  rgm;
    private Materia materias;

    public Aluno(int rgm, String nome) {
        this.rgm = rgm;
        this.nome = nome;
    }

    public int getRgm() {
        return rgm;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", rgm=" + rgm +
                ", materias=" + materias +
                '}';
    }
}
