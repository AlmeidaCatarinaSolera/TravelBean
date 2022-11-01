package com.TravelBean.Price.Request.service;

import com.TravelBean.Price.Request.model.PriceRequestModel;
import com.TravelBean.Price.Request.repository.PriceRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PriceRequestService {

    @Autowired
    PriceRequestRepository priceRequestRepository;

    public List<PriceRequestModel> getAllPriceRequests() {
        List<PriceRequestModel> allPriceRequests = new ArrayList<>();
        priceRequestRepository.findAll().forEach(request -> allPriceRequests.add(request));
        return allPriceRequests;
    }


    public PriceRequestModel getPriceRequestById(int id) {
        return priceRequestRepository.findById(id).get();
    }


    public void deletePriceRequest(int id) {
        priceRequestRepository.deleteById(id);
    }


    public void saveOrUpdatePriceRequest(PriceRequestModel request) {
        priceRequestRepository.save(request);
    }

    public List<String> getAllOrigins() {
        return priceRequestRepository.findDistinctOrigins();
    }
}
