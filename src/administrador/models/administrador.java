package administrador.models;

import users.models.user;

public class administrador extends user {
    private String registrarEstudiante;
    private String registrarProfesor;
    private String registrarMateria;
    private String asignarMateriaDocente;
    private String actualizarUsuario;
    private String eliminarUsuario;
    private String listarUsuario;

    public administrador( String id, String name, String email, String password, String cellphone, String profile, String registrarEstudiante, String registrarProfesor) {
        super(id, name, email, password, cellphone, profile);
        this.registrarEstudiante = registrarEstudiante;
        this.registrarProfesor = registrarProfesor;

    }

    //setters

    public void setRegistrarEstudiante(String registrarEstudiante){
        this.registrarEstudiante = registrarEstudiante;
    }
    public void setRegistrarProfesor(String registrarProfesor){
        this.registrarProfesor = registrarProfesor;
    }

    public void setRegistrarMateria(String registrarMateria){
        this.registrarMateria = registrarMateria;
    }

    public void setActualizarUsuario(String actualizarUsuario){
        this.actualizarUsuario = actualizarUsuario;
    }

    public void setEliminarUsuario(String eliminarUsuario){
        this.eliminarUsuario = eliminarUsuario;
    }

    public void setListarUsuario(String listarUsuario){
        this.listarUsuario = listarUsuario;
    }

    //Getters


    public String getRegistrarEstudiante(){
        return registrarEstudiante;
    }
    public String getRegistrarProfesor(){
        return registrarProfesor;
    }

    public String getRegistrarMateria(){
        return registrarMateria;
    }

    public String getAsignarMateriaDocente(){
        return asignarMateriaDocente;
    }

    public String getActualizarUsuario(){
        return actualizarUsuario;
    }

    public String getEliminarUsuario(){
        return eliminarUsuario;
    }

    public String getListarUsuario(){
        return listarUsuario;
    }
}
