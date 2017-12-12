package com.hallgat.notes.service;

import com.hallgat.notes.model.Note;
import com.hallgat.notes.model.NoteView;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class NoteToNoteViewConverter implements Converter<Note, NoteView> {
    @Override
    public NoteView convert(Note note) {
        return new NoteView(note.getId(), note.getNote());
    }
}
