
package com.frankmoley.lil.learningspring.data;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.Columns;

@Entity
@Table(name="ROOM")//  here we have used @tabel becsue to specffy the table name
public class Room {
	
	
	// normal quary  thius wrten below in the from of spring
//	ROOM_ID BIGSERIAL PRIMARY KEY,
//	  NAME VARCHAR(16) NOT NULL,
//	  ROOM_NUMBER CHAR(2) NOT NULL UNIQUE,
//	  BED_INFO CHAR(2) NOT NULL
	// above code simply writeen in below in the form spring
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="Room_ID")// room id
	private long id;
	@Column(name="NAME")// name
	private String name;
	@Column(name="Room_NUMBER")
	private String roomnumber;// room number
	@Column(name="BED_INFO")
	private long bedinfo; //bedinfo
	
	// setters anf geteters in automati way
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public String getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	
	public void setBedinfo(long bedinfo) {
		this.bedinfo = bedinfo;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getBedinfo() {
		return bedinfo;
	}
	// now need tostring method to override
	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", roomnumber=" + roomnumber + ", bedinfo=" + bedinfo + "]";
	}
	// now room class is done
}
