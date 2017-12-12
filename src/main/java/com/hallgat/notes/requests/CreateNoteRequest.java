package com.hallgat.notes.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class CreateNoteRequest {
    @Getter @Setter private String note;
}
