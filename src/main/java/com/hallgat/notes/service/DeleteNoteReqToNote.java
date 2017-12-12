package com.hallgat.notes.service;

import com.hallgat.notes.model.Note;
import com.hallgat.notes.requests.DeleteNoteRequest;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DeleteNoteReqToNote implements Converter<DeleteNoteRequest, Note> {
    @Override
    public Note convert(DeleteNoteRequest deleteNoteRequest) {
        return new Note(deleteNoteRequest.getId());
    }
}
