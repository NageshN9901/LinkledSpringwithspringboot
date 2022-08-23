package com.frankmoley.lil.learningspring.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// this all about create data repositry 1
	//CREATE TABLE RESERVATION(
//			  RESERVATION_ID BIGSERIAL PRIMARY KEY,
//			  ROOM_ID BIGINT NOT NULL,
//			  GUEST_ID BIGINT NOT NULL,
//			  RES_DATE DATE
	@Entity
	@Table(name="RESERVATION")// this to take that tabel adn name
	public class RESERVATIONSENTITY {
		@Id
		@GeneratedValue(strategy =GenerationType.AUTO)
		@Column(name=" RESERVATION_ID")
	      private long reservationId;
		
		@Column(name="ROOM_ID")
		private long  roomId;
		
		@Column(name="GUEST_ID ")
		private long guestId;
		
		@Column(name="RES_DATE ")
		private String ReservationDate;
		// now to reprsent private fields need getter and seters

		public long getReservationId() {
			return reservationId;
		}

		public long getRoomId() {
			return roomId;
		}

		public long getGuestId() {
			return guestId;
		}

		public String getReservationDate() {
			return ReservationDate;
		}

		public void setReservationId(long reservationId) {
			this.reservationId = reservationId;
		}

		public void setRoomId(long roomId) {
			this.roomId = roomId;
		}

		public void setGuestId(long guestId) {
			this.guestId = guestId;
		}

		public void setReservationDate(String reservationDate) {
			ReservationDate = reservationDate;
		}
		// now need tostring for repsernt data above

		@Override
		public String toString() {
			return "RESERVATION [reservationId=" + reservationId + 
					", roomId=" + roomId + 
					", guestId=" + guestId
					+ ", ReservationDate=" + ReservationDate + "]";
		}
		
		
}
