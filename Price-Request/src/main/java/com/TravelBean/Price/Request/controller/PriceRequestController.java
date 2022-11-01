package com.TravelBean.Price.Request.controller;

import com.TravelBean.Price.Request.model.PriceRequestModel;
import com.TravelBean.Price.Request.service.PriceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PriceRequestController {

    @Autowired
    PriceRequestService priceRequestService;

    @GetMapping("/priceRequests")
    @CrossOrigin(origins = "*")
    private List<PriceRequestModel> getAllPriceRequests(){
       return priceRequestService.getAllPriceRequests();
    }

    @GetMapping("/priceRequest/{id}")
    private PriceRequestModel getPriceRequestsById(@PathVariable("id") int id) {
        return priceRequestService.getPriceRequestById(id);
    }

    @DeleteMapping("/priceRequest/{id}")
    private void deletePriceRequest(@PathVariable("id") int id) {
        priceRequestService.deletePriceRequest(id);
    }

    @PostMapping("/priceRequest")
    @CrossOrigin(origins="*")
    private int saveOrUpdatePriceRequest(@RequestBody PriceRequestModel request) {
        priceRequestService.saveOrUpdatePriceRequest(request);
        return request.getId();
    }

    @GetMapping("/origins")
    private List<String> getAllOrigins() {
        return priceRequestService.getAllOrigins();
    }


}
