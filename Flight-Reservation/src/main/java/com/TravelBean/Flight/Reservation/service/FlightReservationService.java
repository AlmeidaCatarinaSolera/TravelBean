package com.TravelBean.Flight.Reservation.service;

import com.TravelBean.Flight.Reservation.model.FlightReservationModel;
import com.TravelBean.Flight.Reservation.repository.FlightReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightReservationService {

    @Autowired
    FlightReservationRepository flightReservationRepository;



    public List<FlightReservationModel> getAllFlightReservations() {
        List<FlightReservationModel> allFlightReservations = new ArrayList<>();
        flightReservationRepository.findAll().forEach(reservation -> allFlightReservations.add(reservation));
        return allFlightReservations;
    }


    public FlightReservationModel getFlightReservationById(int id) {
        return flightReservationRepository.findById(id).get();
    }


    public void deleteFlightReservation(int id) {
        flightReservationRepository.deleteById(id);
    }


    public void saveOrUpdateFlightReservation(FlightReservationModel reservation) {
         flightReservationRepository.save(reservation);
    }
}


