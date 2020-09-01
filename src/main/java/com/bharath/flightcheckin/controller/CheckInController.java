package com.bharath.flightcheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bharath.flightcheckin.integration.ReservationRestClient;
import com.bharath.flightcheckin.integration.dto.Reservation;

@Controller
public class CheckInController {
	@Autowired
	ReservationRestClient restClient;
	
	@RequestMapping("/showStartCheckin")
	public String showStartCheckin()
	{
		
		return "startCheckIn";
	}
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap modelMap)
	{
		Reservation reservation = restClient.findReservation(reservationId);
		modelMap.addAttribute("reservation",reservation);
		return "displayReservationDetails";
		
	}

}
