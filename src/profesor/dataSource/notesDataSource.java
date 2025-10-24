package profesor.dataSource;
import java.util.ArrayList;
import java.util.List;

import profesor.models.Notes;

public class notesDataSource {
     private List<Notes> _notes = new ArrayList<>();

public notesDataSource(){
        _notes.add(new Notes("Mariana", 4.5));
        _notes.add(new Notes("Luis", 3.5));
        _notes.add(new Notes("Federico", 2.5));
    }

public boolean addNotes(Notes notes){
    _notes.add(notes);
    return true;
}

}


