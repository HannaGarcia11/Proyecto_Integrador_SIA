package login.dataSource;

import java.util.ArrayList;
import java.util.List;

import login.models.login;

public class loginDataSource {
    private List<login> users = new ArrayList<>();

    public loginDataSource(){
        users.add(new login("mariana@correo.com", "1234", "profesor"));
        users.add(new login("didier@correo.com", "7890", "estudiante"));
        users.add(new login("jeronimo@correo.com", "4567", "admin"));
    }

    public login validarUsuario(String correo, String contraseña){
        for(login user : users){
            if(user.getCorreo().equals(correo) && user.getContraseña().equals(contraseña)){
                return user;
            }
        }
        return null;
    }
}

