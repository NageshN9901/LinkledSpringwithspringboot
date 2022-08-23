package com.frankmoley.lil.learningspring.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository //thius is data reposity
public interface RoomRepositry extends CrudRepository<Room, Long> {// Room measn entity and long means Id type
// becsue id is priamr number
	
}
