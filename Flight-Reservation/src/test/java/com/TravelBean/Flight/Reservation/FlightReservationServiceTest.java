package com.TravelBean.Flight.Reservation;

import com.TravelBean.Flight.Reservation.service.FlightReservationService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class FlightReservationServiceTest {

    @TestConfiguration
    static class FlightReservationConfiguration {

    }

    @Autowired
    FlightReservationService flightReservationService;
}
