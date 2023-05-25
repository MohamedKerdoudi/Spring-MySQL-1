package com.management.controllers;


import com.management.entities.Reservation;
import com.management.services.ReservationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ReservationController {

    @Autowired
     ReservationService reservationService;

    @RequestMapping("/createReservation")
    public String createReservation(){
        return  "CreateReservation";
    }



    @RequestMapping("/saveReservation")
    public String saveReservation(@Valid Reservation reservation , BindingResult bindingResult){
        if (bindingResult.hasErrors() ) return "CreateReservation";
        reservationService.saveReservation(reservation);
        return "CreateReservation";
    }

    @RequestMapping("/reservationList")
    public String reservationList(ModelMap modelMap){
        List<Reservation> reservationController = reservationService.getAllReservations();
        modelMap.addAttribute("reservationJsp",reservationController);
        return "ReservationList";
    }



    @RequestMapping("/updateReservation")
    public String updateReservation(@ModelAttribute("reservation") Reservation reservation) {
        reservationService.updateReservation(reservation);
        return "CreateReservation";
    }

}
