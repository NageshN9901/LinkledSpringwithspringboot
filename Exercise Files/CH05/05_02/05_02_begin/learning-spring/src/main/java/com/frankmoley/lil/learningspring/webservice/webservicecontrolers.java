package com.frankmoley.lil.learningspring.webservice;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.frankmoley.lil.learningspring.business.ReservationService;
import com.frankmoley.lil.learningspring.business.RoomReservation;
import com.frankmoley.lil.learningspring.util.DateUtils;
        
@RestController  
@RequestMapping ("/api")
public class webservicecontrolers {
private final DateUtils dataUtils;
private final ReservationService reservationService;


public webservicecontrolers(DateUtils dataUtils, ReservationService reservationService) {
	super();
	this.dataUtils = dataUtils;
	this.reservationService = reservationService;
}


@RequestMapping(path= "/reservations", method= RequestMethod.GET)
public List<RoomReservation>getReservation(@RequestParam(value="date",required = false)String dateString)
{

Date date =this.dataUtils.createDateFromDateString(dateString);
return this.reservationService.getRoomReservationsForDate(date);
}
}
