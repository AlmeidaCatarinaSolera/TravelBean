package com.TravelBean.Price.Request.controller;

import com.TravelBean.Price.Request.model.PriceRequestModel;
import com.TravelBean.Price.Request.service.PriceRequestService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    @CrossOrigin(origins="*")
    private List<String> getAllOrigins() {
        return priceRequestService.getAllOrigins();
    }

    @GetMapping("/price")
    @CrossOrigin(origins="*")
    private List<String> getPriceByOriginAndDestination(@RequestParam("origin") String origin, @RequestParam("destination") String destination) {
       return priceRequestService.getPriceRequest(origin, destination);
    }



}
