package login.models;

public class login {
    //Atributos
    private String correo;
    private String contraseña;
    private String rol;

    //Constructor
    public login(String correo, String contraseña, String rol){
        this.correo = correo;
        this.contraseña = contraseña;
    }

    //Setters
    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }

    public void setRol(String rol){
        this.rol = rol;
    }
    

    //Getters
    public String getCorreo(){
        return correo;
    }

    public String getContraseña(){
        return contraseña;
    }

    public String getRol(){
        return rol;
    }
}
