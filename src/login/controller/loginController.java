package login.controller;

import login.models.login;
import login.useCases.loginUseCase;

public class loginController {
    private loginUseCase useCase;

    public loginController(loginUseCase useCase){
        this.useCase = useCase;
    }

    public void login(String correo, String contraseña){
        login user = useCase.validar(correo, contraseña);
        if(user != null){
            System.out.println("Login exitoso. Rol: " + user.getRol());
        } else {
            System.out.println("Credenciales incorrectas.");
        }
    }
}
