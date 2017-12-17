package com.hallgat.notes.service;

import com.hallgat.notes.model.NoteView;
import com.hallgat.notes.requests.CreateNoteRequest;
import com.hallgat.notes.requests.DeleteNoteRequest;

import java.util.List;

public interface INoteService {
    List<NoteView> getAllNotes();

    void saveNote(CreateNoteRequest request);

    void deleteNote(DeleteNoteRequest request);
}
