package fr.formulaire.spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.formulaire.spring.DTO.FormulaireDTO;
import jakarta.validation.Valid;

@Controller
public class FormulaireController {
    
    
    @GetMapping("/formulaire")
    public String voirformulaire(Model model) {
        model.addAttribute("formulairedto", new FormulaireDTO());
        return "formulaire";
        
    }
    
    @PostMapping("/formulaire")
    public String soumttreformulaire( @Valid FormulaireDTO formulairedto, BindingResult result, Model model ) {
        
        if(result.hasErrors()) {
            return"formulaire";
        }
        model.addAttribute("formulairedto", formulairedto);
        return"resformulaire";
    }

}
