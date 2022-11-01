package com.TravelBean.Price.Request;

import com.TravelBean.Price.Request.model.PriceRequestModel;
import com.TravelBean.Price.Request.service.PriceRequestService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PriceRequestServiceTest {

    @TestConfiguration
    static class PriceRequestConfiguration {


    }


    @Autowired
    PriceRequestService priceRequestService;

    public void priceRequestServiceTestGetAllOrigins() {

    }



    public void setup() {
        PriceRequestModel request = new PriceRequestModel();

    }
}
