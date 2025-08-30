package nosotros.models;

public class nosotros {
      //Atrubutos
    private String nombreSistema;
    private String mision;
    private String vision;
    private String descripcionSistema;

    //Constructor
    public nosotros(String nombreSistema, String mision, String vision, String descripcionSistema){
        this.nombreSistema = nombreSistema;
        this.mision = mision;
        this.vision = vision;
        this.descripcionSistema = descripcionSistema;
    }

    //Setters
    public void setNombreSistema(String nombreSistema){
        this.nombreSistema = nombreSistema;
    }

    public void setMision(String mision){
        this.mision = mision;
    }

    public void setVision(String vision){
        this.vision = vision;
    }

    public void setDescripcionSistema(String descripcionSistema){
        this.descripcionSistema = descripcionSistema;
    }

    //Getters
    public String getNombreSistema(){
        return nombreSistema;
    }

    public String getMision(){
        return mision;
    }

    public String getVision(){
        return vision;
    }

    public String getDescripcionSistema(){
        return descripcionSistema;
    }
}
