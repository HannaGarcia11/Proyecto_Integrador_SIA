package login.models;

public class login {
    //Atributos
    private String correo;
    private String contraseña;

    //Constructor
    public login(String correo, String contraseña){
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

    //Getters
    public String getCorreo(){
        return correo;
    }

    public String getContraseña(){
        return contraseña;
    }
}
