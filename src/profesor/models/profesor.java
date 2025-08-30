package profesor.models;

public class profesor {
        //Atributos
    private String nombre;
    private String materia;
    private String correo;
    private String contacto;
    private String curso;
    private String asistencia;
    private String calificaciones;

    //Constructor
    public profesor(String nombre, String materia, String correo, String contacto, String curso, String asistencia, String calificaciones){
        this.nombre = nombre;
        this.materia = materia;
        this.correo = correo;
        this.contacto = contacto;
        this.curso = curso;
        this.asistencia = asistencia;
        this.calificaciones = calificaciones;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setContacto(String contacto){
        this.contacto = contacto;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public void setAsistencia(String asistencia){
        this.asistencia = asistencia;
    }
    public void setCalificaciones(String calificaciones){
        this.calificaciones = calificaciones;
    }

    //Getters

    public String getNombre(){
        return nombre;
    }

    public String getMateria(){
        return materia;
    }

    public String getCorreo(){
        return correo;
    }

    public String getContacto(){
        return contacto;
    }
    public String getCurso(){
        return curso;
    }
    public String getAsistencia(){
        return asistencia;
    }
    public String getCalificaciones(){
        return calificaciones;
    }
}
