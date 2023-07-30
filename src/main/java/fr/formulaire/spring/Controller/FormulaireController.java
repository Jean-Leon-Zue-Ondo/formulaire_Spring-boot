package fr.formulaire.spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.formulaire.spring.DTO.FormulaireDTO;

@Controller
public class FormulaireController {
    
    
    @GetMapping("/formulaire")
    public String voirformulaire(Model model) {
        model.addAttribute("formulairedto", new FormulaireDTO());
        return "formulaire";
        
    }
    
    @PostMapping("/formulaire")
    public String soumttreformulaire( @ModelAttribute FormulaireDTO formulairedto, Model model ) {
        model.addAttribute("formulairedto", formulairedto);
        return"resformulaire";
    }

}
