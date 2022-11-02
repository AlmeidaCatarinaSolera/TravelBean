package com.TravelBean.Flight.Reservation.repository;

import com.TravelBean.Flight.Reservation.model.FlightReservationModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FlightReservationRepository extends CrudRepository <FlightReservationModel, Integer> {

    Optional<FlightReservationModel> findById(int id);


}
