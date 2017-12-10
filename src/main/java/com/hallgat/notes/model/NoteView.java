package com.hallgat.notes.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;


public class NoteView {
    @Getter @Setter private Integer id;
    @Getter @Setter private String note;
}
