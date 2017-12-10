package com.hallgat.notes.service;

import com.hallgat.notes.data.INoteDao;
import com.hallgat.notes.model.Note;
import com.hallgat.notes.model.NoteView;
import com.hallgat.notes.requests.CreateNoteRequest;
import com.hallgat.notes.requests.DeleteNoteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService implements INoteService {

    @Autowired
    INoteDao noteDao;

    @Autowired
    ConversionService conversionService;

    @Override
    public List<NoteView> getAllNotes() {
        throw new RuntimeException("not implemented");
    }

    @Override
    public void SaveNote(CreateNoteRequest request) {
        noteDao.addNote(conversionService.convert(request, Note.class));
    }

    @Override
    public void DeleteNote(DeleteNoteRequest request) {
        noteDao.deleteNote(conversionService.convert(request, Note.class));
    }

}
