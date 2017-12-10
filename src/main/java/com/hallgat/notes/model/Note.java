package com.hallgat.notes.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Integer id;
    @Getter @Setter private String note;
    @Enumerated(EnumType.STRING)
    @Getter @Setter private NoteType type;

    public Note(String note, NoteType type) {
        this.note = note;
        this.type = type;
    }

    public Note(String note) {
        this.note = note;
        this.type = NoteType.DATA;
    }
}