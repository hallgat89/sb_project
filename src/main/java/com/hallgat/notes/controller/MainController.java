package com.hallgat.notes.controller;

import com.hallgat.notes.model.NoteView;
import com.hallgat.notes.requests.CreateNoteRequest;
import com.hallgat.notes.requests.DeleteNoteRequest;
import com.hallgat.notes.service.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    INoteService noteService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("name", "World");

        List<NoteView> testList = noteService.getAllNotes();
        mv.addObject("notesList", noteService.getAllNotes());
        mv.addObject("crequest", new CreateNoteRequest());
        mv.addObject("drequest", new DeleteNoteRequest());
        return mv;
    }

    @RequestMapping(path = "/api/save", method = RequestMethod.PUT)
    public RedirectView saveNote(@ModelAttribute("request") CreateNoteRequest request) {
        noteService.saveNote(request);
        return new RedirectView("/");
    }

    @RequestMapping(path = "/api/del", method = RequestMethod.DELETE)
    public RedirectView deleteNote(@ModelAttribute("request") DeleteNoteRequest request) {
        noteService.deleteNote(request);
        return new RedirectView("/");
    }

}
