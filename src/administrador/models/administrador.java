package administrador.models;

public class administrador {
    private String nombre;
    private String contacto;
    private String correo;
    private String contraseña;
    private String registrarEstudiante;
    private String registrarProfesor;

    public administrador(String nombre, String contacto, String correo, String contraseña, String registrarEstudiante, String registrarProfesor) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.correo = correo;
        this.contraseña = contraseña;
        this.registrarEstudiante = registrarEstudiante;
        this.registrarProfesor = registrarProfesor;
    }

    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setContacto(String contacto){
        this.contacto = contacto;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    public void setRegistrarEstudiante(String registrarEstudiante){
        this.registrarEstudiante = registrarEstudiante;
    }
    public void setRegistrarProfesor(String registrarProfesor){
        this.registrarProfesor = registrarProfesor;
    }

    //Getters

    public String getNombre(){
        return nombre;
    }

    public String getContacto(){
        return contacto;
    }

    public String getCorreo(){
        return correo;
    }

    public String getContraseña(){
        return contraseña;
    }
    public String getRegistrarEstudiante(){
        return registrarEstudiante;
    }
    public String getRegistrarProfesor(){
        return registrarProfesor;
    }
}
