package users.useCases;
import users.models.user;
import java.util.ArrayList;
import java.util.List;

public class UserUseCase {
    private final List<user> users;

    public UserUseCase() {
        this.users = new ArrayList<>();
    }

    // Consultar todas las tareas
    public List<user> all() {
        return this.users;
    }

    // Consultar una tarea por índice
    public user getByIndex(int index) {
        return this.users.get(index); 
    }

    // Crear la tarea
    public user create(user newUser) {
        this.users.add(newUser);
        return newUser;
    }

    // Actualizar tarea
    public user update(int index, user updated) {
        user user = null;
        for (int i = 0; i < this.users.size(); i++) {
            if (index == i) {
                this.users.set(i, updated);
                user = updated;
            }
        }
        return user;
    }

    // Eliminar tarea
    public void deleteById(int index) {
        this.users.remove(index);
    }
    
}
