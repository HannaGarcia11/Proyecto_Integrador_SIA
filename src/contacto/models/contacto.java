package contacto.models;

public class contacto {
    private String nombre;
    private String correo;
    private String asunto;
    private String mensaje;

    public contacto(String nombre, String correo, String asunto, String mensaje) {
        this.nombre = nombre;
        this.correo = correo;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setAsunto(String asunto){
        this.asunto = asunto;
    }

    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }

    //Getters

    public String getNombre(){
        return nombre;
    }

    public String getCorreo(){
        return correo;
    }

    public String getAsunto(){
        return asunto;
    }

    public String getMensaje(){
        return mensaje;
    }
}
