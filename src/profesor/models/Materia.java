package profesor.models;

public class Materia {
    private String IdMateria;
    private String NombMateria;


public Materia(String IdMateria,  String NombMateria ){
    this.IdMateria=IdMateria;
    this.NombMateria=NombMateria;
}


public String getIdMateria() {
    return IdMateria;
}


public void setIdMateria(String idMateria) {
    IdMateria = idMateria;
}


public String getNombMateria() {
    return NombMateria;
}


public void setNombMateria(String nombMateria) {
    NombMateria = nombMateria;
}


}
