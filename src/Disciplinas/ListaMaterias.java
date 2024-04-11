package Disciplinas;

public class ListaMaterias {
    private Materia primeiro;

    public ListaMaterias() {
        this.primeiro = null;
    }

    public void addMateria(String nome) {
        if (this.primeiro == null) {
            this.primeiro = new Materia(nome);
        } else {
            Materia materiaAtual = primeiro;
            while (materiaAtual.getProxMateria() != null) {
                materiaAtual = materiaAtual.getProxMateria();
            }
            materiaAtual.setProxMateria(new Materia(nome));
        }
    }

    public void removerMateria(String nomeMateria){
        boolean flag = false;

        Materia materiaAtual = primeiro;
        Materia inicio = null;


        while (materiaAtual.getProxMateria() != null) {
            if (materiaAtual.getMateria() == nomeMateria){
                inicio = materiaAtual.getProxMateria();
                flag = true;

                this.primeiro = inicio;
                break;
            }

            inicio = materiaAtual;
            materiaAtual = materiaAtual.getProxMateria();
        }
        if (flag){
            System.out.println("Matéria removida com Sucesso!");
        }
    }

    public Materia getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Materia primeiro) {
        this.primeiro = primeiro;
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();

        Materia materiaSeguinte = primeiro;
        while (materiaSeguinte != null) {
            message.append(materiaSeguinte.toString()).append(", ");
            materiaSeguinte = materiaSeguinte.getProxMateria();
        }

        if (message.length() > 0) {
            message.delete(message.length() - 2, message.length());
        }

        return message.toString();
    }


}
