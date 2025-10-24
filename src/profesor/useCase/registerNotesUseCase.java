package profesor.useCase;
import profesor.dataSource.notesDataSource;
import profesor.models.Notes;
import java.util.ArrayList;
import java.util.List;

public class registerNotesUseCase {
    private notesDataSource dataSource;
    private List<Notes> _notes = new ArrayList<>();

    public registerNotesUseCase(notesDataSource dataSource){
        this.dataSource=dataSource;
    }


    //Agregar notas:
public boolean addNotes(Notes notes){
    _notes.add(notes);
    return true;
}

}




