package com.hallgat.notes.service;

import com.hallgat.notes.model.Note;
import com.hallgat.notes.requests.CreateNoteRequest;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CreateNoteReqToNote implements Converter<CreateNoteRequest, Note> {
    @Override
    public Note convert(CreateNoteRequest createNoteRequest) {
        return new Note(createNoteRequest.getNote());
    }
}
