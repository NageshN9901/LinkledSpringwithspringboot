package com.frankmoley.lil.learningspring.web;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.frankmoley.lil.learningspring.business.ReservationService;
import com.frankmoley.lil.learningspring.business.RoomReservation;
import com.frankmoley.lil.learningspring.util.DateUtils;




@Controller
@RequestMapping("/reservationsh")
public class RoomReservationControler {
	
private final DateUtils dateUtils;
private final ReservationService  reservationServics;
public RoomReservationControler(DateUtils dateUtils, ReservationService reservationServics) {

	this.dateUtils = dateUtils;
	this.reservationServics = reservationServics;
}

// need mmmeethod
@RequestMapping(method=RequestMethod.GET)
// below @Requestparam is where that value is coming
public String getReservation(@RequestParam(value="date", required = false)    String  dateString  , Model model) {
	// now need to create instance for data
	java.util.Date date =this.dateUtils.createDateFromDateString(dateString);
	List<RoomReservation> roomResravtion =this. reservationServics.getRoomReservationsForDate(date);
	// add attribute to model and model is live
	model.addAttribute("roomResravtion ",roomResravtion );
	
	
	
	return "roomres";///  we are returning string as templte  name we nned crete 
	
	
}



}
