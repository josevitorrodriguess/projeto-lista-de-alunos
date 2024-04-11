package Disciplinas;

public class Materia {
    private  String materia;

    private Materia proxMateria;

    public Materia(String materia) {
        this.materia = materia;
        this.proxMateria = null;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }


    public Materia getProxMateria() {
        return proxMateria;
    }

    public void setProxMateria(Materia proxMateria) {
        this.proxMateria = proxMateria;
    }

    @Override
    public String toString() {
        return materia ;

    }

}
