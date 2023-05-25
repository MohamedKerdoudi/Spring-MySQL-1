package com.management.controllers;


import com.management.entities.Vehicule;
import com.management.services.VehiculeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class VehiculeController {
    @Autowired
    VehiculeService vehiculeService;


    @RequestMapping("/createVehicule")
    public String createVehicule(){
        return  "CreateVehicule";
    }



    @RequestMapping("/saveVehicule")
    public String saveVehicule(@Valid Vehicule vehicule , BindingResult bindingResult){
        if (bindingResult.hasErrors() ) return "CreateVehicule";
        vehiculeService.saveVehicule(vehicule);
        return "CreateVehicule";
    }

    @RequestMapping("/vehiculeList")
    public String vehiculeList(ModelMap modelMap){
        List<Vehicule> vehiculeController = vehiculeService.getAllVehicule();
        modelMap.addAttribute("vehiculeJsp",vehiculeController);
        return "VehiculeList";
    }



    @RequestMapping("/updateVehicule")
    public String updateClient(@ModelAttribute("vehicule") Vehicule vehicule ) {
        vehiculeService.updateVehicule(vehicule);
        return "CreateVehicule";
    }


}