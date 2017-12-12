package com.hallgat.notes.controller;

import com.hallgat.notes.model.NoteView;
import com.hallgat.notes.requests.CreateNoteRequest;
import com.hallgat.notes.requests.DeleteNoteRequest;
import com.hallgat.notes.service.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
        testList.add(new NoteView(666, "Valami"));
        testList.add(new NoteView(777, "Valami2"));

        mv.addObject("notesList", noteService.getAllNotes());
        mv.addObject("crequest", new CreateNoteRequest());
        mv.addObject("drequest", new DeleteNoteRequest());
        return mv;
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public ModelAndView saveNote(Model model, @ModelAttribute("request") CreateNoteRequest request) {
        noteService.SaveNote(request);
        ModelAndView mv = new ModelAndView("redirect:/");
        mv.clear();
        return mv;
    }

    @RequestMapping(path = "/del", method = RequestMethod.POST)
    public ModelAndView deleteNote(Model model, @ModelAttribute("request") DeleteNoteRequest request) {
        noteService.DeleteNote(request);
        ModelAndView mv = new ModelAndView("redirect:/");
        mv.clear();
        return mv;
    }

}
