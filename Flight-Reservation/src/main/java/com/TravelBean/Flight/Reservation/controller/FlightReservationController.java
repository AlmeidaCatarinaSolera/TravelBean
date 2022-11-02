package com.TravelBean.Flight.Reservation.controller;

import com.TravelBean.Flight.Reservation.model.FlightReservationModel;
import com.TravelBean.Flight.Reservation.service.FlightReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightReservationController {

    @Autowired
    FlightReservationService flightReservationService;


    @GetMapping("/flightReservations")
    @CrossOrigin(origins = "*")
    private List<FlightReservationModel> getAllFlightReservations(){
        return flightReservationService.getAllFlightReservations();
    }


    @GetMapping("/flightReservation/{id}")
    private FlightReservationModel getFlightReservationById(@PathVariable("id") int id) {
        return flightReservationService.getFlightReservationById(id);
    }


    @DeleteMapping("/flightReservation/{id}")
    private void deleteFlightReservation(@PathVariable("id") int id) {
        flightReservationService.deleteFlightReservation(id);
    }

    @PostMapping("/flightReservation")
    @CrossOrigin(origins="*")
    private int saveOrUpdateFlightReservation(@RequestBody FlightReservationModel reservation) {
        flightReservationService.saveOrUpdateFlightReservation(reservation);
        return reservation.getId();
    }

}
