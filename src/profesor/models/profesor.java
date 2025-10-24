package profesor.models;

public class Profesor {
        //Atributos
    private String IdProfesor;
    private String TipoDocProfesor;
    private String PrimerNombreProfesor;
    private String SegundoNombreProfesor;
    private String PrimerApellidoProfesor;
    private String SegundoApellidoProfesor;
    private String CelularProfesor;
    private String DireccionProfesor;
    private String EmailProfesor;
    private String ContraseñaProfesor;

    //Constructor
    public Profesor(String IdProfesor, String TipoDocProfesor, String PrimerNombreProfesor, String SegundoNombreProfesor, String PrimerApellidoProfesor,String SegundoApellidoProfesor, String CelularProfesor, String DireccionProfesor, String EmailProfesor, String ContraseñaProfesor ){
        this.IdProfesor=IdProfesor;
        this.TipoDocProfesor=TipoDocProfesor;
        this.PrimerNombreProfesor = PrimerNombreProfesor;
        this.SegundoNombreProfesor = SegundoNombreProfesor;
        this.PrimerApellidoProfesor = PrimerApellidoProfesor;
        this.SegundoApellidoProfesor = SegundoApellidoProfesor;
        this.CelularProfesor = CelularProfesor;
        this.DireccionProfesor = DireccionProfesor;
        this.EmailProfesor = EmailProfesor;
        this.ContraseñaProfesor = ContraseñaProfesor;
    }

    public String getIdProfesor() {
        return IdProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        IdProfesor = idProfesor;
    }

    public String getTipoDocProfesor() {
        return TipoDocProfesor;
    }

    public void setTipoDocProfesor(String tipoDocProfesor) {
        TipoDocProfesor = tipoDocProfesor;
    }

    public String getPrimerNombreProfesor() {
        return PrimerNombreProfesor;
    }

    public void setPrimerNombreProfesor(String primerNombreProfesor) {
        PrimerNombreProfesor = primerNombreProfesor;
    }

    public String getSegundoNombreProfesor() {
        return SegundoNombreProfesor;
    }

    public void setSegundoNombreProfesor(String segundoNombreProfesor) {
        SegundoNombreProfesor = segundoNombreProfesor;
    }

    public String getPrimerApellidoProfesor() {
        return PrimerApellidoProfesor;
    }

    public void setPrimerApellidoProfesor(String primerApellidoProfesor) {
        PrimerApellidoProfesor = primerApellidoProfesor;
    }

    public String getSegundoApellidoProfesor() {
        return SegundoApellidoProfesor;
    }

    public void setSegundoApellidoProfesor(String segundoApellidoProfesor) {
        SegundoApellidoProfesor = segundoApellidoProfesor;
    }

    public String getCelularProfesor() {
        return CelularProfesor;
    }

    public void setCelularProfesor(String celularProfesor) {
        CelularProfesor = celularProfesor;
    }

    public String getDireccionProfesor() {
        return DireccionProfesor;
    }

    public void setDireccionProfesor(String direccionProfesor) {
        DireccionProfesor = direccionProfesor;
    }

    public String getEmailProfesor() {
        return EmailProfesor;
    }

    public void setEmailProfesor(String emailProfesor) {
        EmailProfesor = emailProfesor;
    }

    public String getContraseñaProfesor() {
        return ContraseñaProfesor;
    }

    public void setContraseñaProfesor(String contraseñaProfesor) {
        ContraseñaProfesor = contraseñaProfesor;
    }

   
    


    
}
