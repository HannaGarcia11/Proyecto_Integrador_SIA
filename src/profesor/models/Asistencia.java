package profesor.models;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Asistencia {

private String IdAsistencia;
private String IdGrupo;
private String IdEstudiante;
private LocalDate fecha;
private String Estado;


public Asistencia (String IdAsistencia, String IdGrupo, String IdEstudiante, LocalDate fecha, String Estado, String IdEstudiante){
    this.IdAsistencia=IdAsistencia;
    this.IdGrupo=IdGrupo;
    this.IdEstudiante=IdEstudiante;
    this.fecha=fecha;
    this.Estado=Estado;
    this.IdEstudiante=IdEstudiante;
}


public String getIdAsistencia() {
    return IdAsistencia;
}


public void setIdAsistencia(String idAsistencia) {
    IdAsistencia = idAsistencia;
}


public String getIdGrupo() {
    return IdGrupo;
}


public void setIdGrupo(String idGrupo) {
    IdGrupo = idGrupo;
}


public String getIdEstudiante() {
    return IdEstudiante;
}


public void setIdEstudiante(String idEstudiante) {
    IdEstudiante = idEstudiante;
}


public LocalDate getFecha() {
    return fecha;
}


public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
}


public String getEstado() {
    return Estado;
}


public void setEstado(String estado) {
    Estado = estado;
}



}
