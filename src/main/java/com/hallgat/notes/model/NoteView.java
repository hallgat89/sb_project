package com.hallgat.notes.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class NoteView {
    @Getter @Setter private Integer id;
    @Getter @Setter private String note;
}
