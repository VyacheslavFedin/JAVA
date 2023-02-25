package HOMEWORK2.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository{

    private NoteMapper mapper = new NoteMapper();
    private FileOperationable fileOperation;

    
    public RepositoryFile(FileOperationable fileOperation) {
        this.fileOperation = fileOperation;
    }

    private void saveNote(Note note) {
        List<String> lines = new ArrayList<>();
        List<Note> notes = getAllNotes();
        for (Note item: notes) {
            if(note.getId().equals(item.getId())) {
                lines.add(mapper.map(note));
            }
            else {
                lines.add(mapper.map(note));
            }
        }
        fileOperation.saveAllLines(lines);
    }

    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public String CreateNote(Note note) {
        List<Note> notes = getAllNotes();
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        List<String> lines = new ArrayList<>();
        for (Note item: notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
        return id;
    }

    @Override
    public void UpdateNote(Note note, Fields field, String param) {
        if(field == Fields.HEADER) {
            note.setHeader(param);
        }
        else if(field == Fields.CONTENT) {
            note.setContent(param);
        }
        saveNote(note);
        
    }

    @Override
    public void deleteNote(String id) {
        List<String> lines = new ArrayList<>();
        List<Note> notes = getAllNotes();
        for (Note item: notes) {
            if(!item.getId().equals(id)) {
                lines.add(mapper.map(item));
            }
        }
        fileOperation.saveAllLines(lines);
    }
        
    
}
