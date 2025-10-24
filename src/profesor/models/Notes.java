package profesor.models;

public class Notes {
    private String IdNota;
    private double IdActividad;
    private double IdEstudiante;
    private double ValorNota;
  

public Notes(String IdNota, double IdActividad, double IdEstudiante, double ValorNota){
    this.IdNota=IdNota;
    this.IdActividad=IdActividad;
    this.IdEstudiante=IdEstudiante;
    this.ValorNota=ValorNota;

}


public String getIdNota() {
    return IdNota;
}


public void setIdNota(String idNota) {
    IdNota = idNota;
}


public double getIdActividad() {
    return IdActividad;
}


public void setIdActividad(double idActividad) {
    IdActividad = idActividad;
}


public double getIdEstudiante() {
    return IdEstudiante;
}


public void setIdEstudiante(double idEstudiante) {
    IdEstudiante = idEstudiante;
}


public double getValorNota() {
    return ValorNota;
}


public void setValorNota(double valorNota) {
    ValorNota = valorNota;
}





}

