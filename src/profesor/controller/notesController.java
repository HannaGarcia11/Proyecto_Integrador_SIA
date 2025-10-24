package profesor.controller;
import profesor.models.Notes;
import profesor.useCase.registerNotesUseCase;


public class notesController {
        private registerNotesUseCase useCase;

        public void notesController (registerNotesUseCase useCase){
            this.useCase=useCase;
        }


        public void registerNotes(String name, double notes){
            boolean save= useCase.addNotes( new Notes("Mariana", 4.6) );
            System.out.println("La nota: " + save + "quedó registrada correctamente");;
        }

}

