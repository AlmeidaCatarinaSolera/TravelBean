package com.TravelBean.Passenger.Information.controller;

import com.TravelBean.Passenger.Information.model.PassengerModel;
import com.TravelBean.Passenger.Information.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @GetMapping("/passengers")
    @CrossOrigin(origins = "*")
    private List<PassengerModel> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @GetMapping("/passenger/{id}")
    private PassengerModel getPassengerById(@PathVariable("id") int id) {
        return passengerService.getPassengerById(id);

    }

    @DeleteMapping("/passenger/{id}")
    private void deletePassenger(@PathVariable("id") int id) {
        passengerService.deletePassenger(id);
    }

    @PostMapping("/passenger")
    @CrossOrigin(origins="*")
    private int saveOrUpdatePassenger(@RequestBody PassengerModel passenger) {
        passengerService.saveOrUpdatePassenger(passenger);
        return passenger.getId();
    }

}
