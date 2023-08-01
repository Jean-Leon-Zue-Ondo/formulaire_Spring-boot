package fr.formulaire.spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import fr.formulaire.spring.DTO.PersonForm;
import jakarta.validation.Valid;

@Controller
public class WebController {


    @GetMapping("/formulaire")
    public String voirformulaire(PersonForm personForm) {
        return"form";
    }
    
    @PostMapping("/formulaire")
    public String soumttreformulaire( @Valid PersonForm personForm, BindingResult result) {
        
        if(result.hasErrors()) {
            return"form";
        }
        return"redirect:/results";
    }
}
