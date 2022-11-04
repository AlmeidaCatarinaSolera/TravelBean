package com.TravelBean.Passenger.Information.service;

import com.TravelBean.Passenger.Information.model.PassengerModel;
import com.TravelBean.Passenger.Information.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;
    public List<PassengerModel> getAllPassengers() {
        List<PassengerModel> allPassengers =  new ArrayList<>();
        passengerRepository.findAll().forEach(passenger -> allPassengers.add(passenger));
        return allPassengers;
    }

    public PassengerModel getPassengerById(int id) {
       return passengerRepository.findById(id).get();
    }

    public void deletePassenger(int id) {
        passengerRepository.deleteById(id);
    }


    public void saveOrUpdatePassenger(PassengerModel passenger) {
        passengerRepository.save(passenger);
    }
}
