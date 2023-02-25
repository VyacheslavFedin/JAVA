package HOMEWORK2.controllers;

import java.util.List;

import HOMEWORK2.model.Fields;
import HOMEWORK2.model.Note;
import HOMEWORK2.model.Repository;
import HOMEWORK2.utils.NotFoundException;
import HOMEWORK2.utils.Validate;


public class UserController {
    private final Repository repository;
    private final Validate validate;

    public UserController(Repository repository, Validate validate) {
        this.repository = repository;
        this.validate = validate;
    }

    public void saveNote(Note note) throws Exception {
        validate.checkField(note.getHeader());
        validate.checkField(note.getContent());
        repository.CreateNote(note);
    }

    public void updateNote(Note note, Fields field, String param) throws Exception {
        if (field == Fields.HEADER) {
            validate.checkField(param);
        } else if (field == Fields.CONTENT) {
            validate.checkField(param);
        } 
        repository.UpdateNote(note, field, param);

    }

    public Note readNote(String noteId) throws Exception {
        List<Note> notes = repository.getAllNotes();
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                return note;
            }
        }

        throw new NotFoundException("Записка не найдена");
    }

    public List<Note> getNotes() throws Exception {
        return repository.getAllNotes();
    }

    /**
     * @param userId
     * @throws Exception
     */
    public void delNote(String noteId) throws Exception {

        repository.deleteNote(noteId);

    }
}
