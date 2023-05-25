package com.management.controllers;

import com.management.entities.Parking;
import com.management.services.ParkingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ParkingController {
    @Autowired
    ParkingService parkingService;


    @RequestMapping("/createParking")
    public String createParking(){
        return  "CreateParking";
    }



    @RequestMapping("/saveParking")
    public String saveParking(@Valid Parking parking , BindingResult bindingResult){
        if (bindingResult.hasErrors() ) return "CreateParking";
        parkingService.saveParking(parking);
        return "CreateParking";
    }

    @RequestMapping("/parkingList")
    public String parkingList(ModelMap modelMap){
        List<Parking> parkingController = parkingService.getAllParking();
        modelMap.addAttribute("parkingJsp",parkingController);
        return "ParkingList";
    }



    @RequestMapping("/updateParking")
    public String updateParking(@ModelAttribute("parking") Parking parking) {
        parkingService.updateParking(parking);
        return "CreateParking";
    }
    @RequestMapping("/deleteParking")
    public String deleteParking(@ModelAttribute("parking") Parking parking) {
        parkingService.deleteParking(parking);
        return "CreateParking";
    }


}