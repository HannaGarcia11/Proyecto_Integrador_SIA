package login.useCases;

import login.dataSource.loginDataSource;
import login.models.login;

public class loginUseCase {
    private loginDataSource dataSource;

    public loginUseCase(loginDataSource dataSource){
        this.dataSource =  dataSource;
    }

    public login validar(String correo, String contraseña){
        return dataSource.validarUsuario(correo, contraseña);
    }
    
}

