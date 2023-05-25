package com.management.controllers;

import com.management.entities.Facture;
import com.management.services.FactureService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
public class FactureController {

    private final FactureService factureService;

    @Autowired
    public FactureController(FactureService factureService) {
        this.factureService = factureService;
    }

    @GetMapping("/createFacture")
    public String createFacture(Model model) {
        model.addAttribute("factures", new Facture());
        return "CreateFacture";
    }

    @PostMapping("/saveFacture")
    public String saveFacture(@Valid @ModelAttribute("facture") Facture facture, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "CreateFacture";
        }
        factureService.saveFacture(facture);
        return "redirect:/createFacture";
    }

    @PostMapping("/updateFacture")
    public String updateFacture(@Valid @ModelAttribute("facture") Facture facture, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "UpdateFacture";
        }
        factureService.updateFacture(facture);
        return "redirect:/createFacture";
    }
}
