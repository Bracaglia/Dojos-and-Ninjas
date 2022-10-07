package com.sam.dojosninjas.controllers;

import com.sam.dojosninjas.models.Dojo;
import com.sam.dojosninjas.models.Ninja;
import com.sam.dojosninjas.services.DojoService;
import com.sam.dojosninjas.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;


@Controller
public class MainController {
    @Autowired
    DojoService dojoService;
    @Autowired
    NinjaService ninjaService;

    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos", dojos);
        return "dojos/new.jsp";
    }

    @PostMapping("/dojos")
    public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Dojo> dojos = dojoService.allDojos();
            model.addAttribute("dojos", dojos);
            return "dojos/dojos/new.jsp";
        } else {
            dojoService.createDojo(dojo);
            return "redirect:/dojos/new";
        }
    }

        @GetMapping("/dojos/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Dojo dojo = dojoService.findDojo(id);
        model.addAttribute("dojo", dojo);
        return "dojos/show.jsp";
    }
/////////////////////////////////////////////////////NINJAS////////////////////////////////////////////////////////////////
    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos", dojos);
        return "ninjas/new.jsp";
    }

    @PostMapping("/ninjas")
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Ninja> ninjas = ninjaService.allNinjas();
            model.addAttribute("ninjas", ninjas);
            return "ninjas/new.jsp";
        } else {
            ninjaService.createNinja(ninja);
            return "redirect:/ninjas/new";
        }
    }
}