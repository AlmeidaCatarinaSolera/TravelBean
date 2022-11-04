package com.TravelBean.Passenger.Information.repository;

import com.TravelBean.Passenger.Information.model.PassengerModel;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<PassengerModel, Integer> {


}
