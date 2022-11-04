package com.TravelBean.Price.Request;

import com.TravelBean.Price.Request.model.PriceRequestModel;
import com.TravelBean.Price.Request.repository.PriceRequestRepository;
import com.TravelBean.Price.Request.service.PriceRequestService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
public class PriceRequestServiceTest {

    @TestConfiguration
    static class PriceRequestConfiguration {

        @Bean
        public PriceRequestService priceRequestService() {
            return new PriceRequestService();
        }


    }


    @Autowired
    PriceRequestService priceRequestService;

    @MockBean
    PriceRequestRepository priceRequestRepository;

    @Test
    public void priceRequestServiceTestGetAllOrigins() {
        List<String> result = priceRequestService.getAllOrigins();
        Assertions.assertEquals(2, result.size());
    }

    @Test
    public void priceRequestServiceTestGetPriceRequest() {
        String origin = "Italy";
        String destination = "Portugal";
        List<String> result = priceRequestService.getPriceRequest(origin, destination);
        Assertions.assertEquals(3, result.size());
    }

    @Before
    public void setup() {

        List<String> listOrigin = new ArrayList<>();
        listOrigin.add("Portugal");
        listOrigin.add("Spain");

        List<String> listPrice = new ArrayList<>();
        listPrice.add("TAP,150");
        listPrice.add("Ryanair,120");
        listPrice.add("Easyjet,125");

        Mockito.when(priceRequestRepository.findDistinctOrigins()).thenReturn(listOrigin);
        Mockito.when(priceRequestRepository.findPrice("Italy", "Portugal")).thenReturn(listPrice);

    }
}
