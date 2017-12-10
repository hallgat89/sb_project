package com.hallgat.notes.service;

import com.hallgat.notes.data.INoteDao;
import com.hallgat.notes.model.NoteView;
import com.hallgat.notes.requests.CreateNoteRequest;
import com.hallgat.notes.requests.DeleteNoteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface INoteService {
    List<NoteView> getAllNotes();

    void SaveNote(CreateNoteRequest request);

    void DeleteNote(DeleteNoteRequest request);
}
