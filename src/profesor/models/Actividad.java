package profesor.models;

public class Actividad {

    private String IdActividad;
    private String NombreActividad;
    private String IdGrupo; 

    public Actividad(String IdActividad, String NombreActividad, String IdGrupo){

        this.IdActividad=IdActividad;
        this.NombreActividad=NombreActividad;
        this.IdGrupo=IdGrupo;
    }

    public String getIdActividad() {
        return IdActividad;
    }

    public void setIdActividad(String idActividad) {
        IdActividad = idActividad;
    }

    public String getNombreActividad() {
        return NombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        NombreActividad = nombreActividad;
    }

    public String getIdGrupo() {
        return IdGrupo;
    }

    public void setIdGrupo(String idGrupo) {
        IdGrupo = idGrupo;
    }

    
    
}
