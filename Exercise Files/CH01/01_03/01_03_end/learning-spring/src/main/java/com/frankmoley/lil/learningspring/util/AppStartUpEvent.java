package com.frankmoley.lil.learningspring.util;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.frankmoley.lil.learningspring.data.Guest;
import com.frankmoley.lil.learningspring.data.GuestRepo;
import com.frankmoley.lil.learningspring.data.RESERVATIONREPOSITRY;
import com.frankmoley.lil.learningspring.data.RESERVATIONSENTITY;
import com.frankmoley.lil.learningspring.data.Room;
import com.frankmoley.lil.learningspring.data.RoomRepositry;





@Component
public class AppStartUpEvent implements ApplicationListener<ApplicationReadyEvent> {

	private final RoomRepositry roomRepository;// thisb repo are intefaces
	private final RESERVATIONREPOSITRY  reservationrepo;
	private final  GuestRepo guestrepo;
	
	// constructer by source
	
	public AppStartUpEvent(RoomRepositry roomRepository, RESERVATIONREPOSITRY reservationrepo, GuestRepo guestrepo) {
		super();
		this.roomRepository = roomRepository;
		this.reservationrepo = reservationrepo;
		this.guestrepo = guestrepo;
	}

	@Override// implneted method from interface
	public void onApplicationEvent(ApplicationReadyEvent event) {
	Iterable<Room>rooms=this.roomRepository.findAll();
		rooms.forEach(System.out::println);// now well get data repostry
		Iterable<RESERVATIONSENTITY>resrvaton=this.reservationrepo.findAll();
		resrvaton.forEach(System.out::println);// now well get data repostry
		Iterable<Guest>guests=this.guestrepo.findAll();
		rooms.forEach(System.out::println);// now well get data repostry
	}
// below one iam implented

	

}
