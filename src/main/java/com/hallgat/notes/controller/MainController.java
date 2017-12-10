package com.hallgat.notes.controller;

import com.hallgat.notes.requests.CreateNoteRequest;
import com.hallgat.notes.requests.DeleteNoteRequest;
import com.hallgat.notes.service.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    INoteService noteService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(path = "/save", method = RequestMethod.PUT)
    public String saveNote(Model model, @RequestParam CreateNoteRequest request) {
        noteService.SaveNote(request);
        return "index";
    }

    @RequestMapping(path = "/del", method = RequestMethod.DELETE)
    public String deleteNote(Model model, @RequestParam DeleteNoteRequest request) {
        noteService.DeleteNote(request);
        return "index";
    }

}
