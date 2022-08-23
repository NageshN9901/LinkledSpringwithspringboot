package com.frankmoley.lil.learningspring.data;

import java.sql.Date;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RESERVATIONREPOSITRY extends JpaRepository<RESERVATIONSENTITY, Long>{// here rESERVSTION IS CLASS ANME 
// here crusREpo><E,wrppreTypeofpriamrykeycolumn type>rESERVATIONENTITY IS CLASS AND lONG IS WRAPER CALSS BECSUE THAT CLASS ATBE`L PRIMARY KEY IS ID NBUT ID IS TYPE OF lang WE ARE REPSETNING THE 
	//LonG int wrappercalss
Iterable<RESERVATIONSENTITY> findReservationByReservationDate(Date date);
}
 