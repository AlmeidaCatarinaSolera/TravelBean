package com.TravelBean.Price.Request.repository;
import com.TravelBean.Price.Request.model.PriceRequestModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface PriceRequestRepository extends CrudRepository<PriceRequestModel, Integer> {

    Optional<PriceRequestModel> findById(int id);

    @Query("SELECT DISTINCT origin FROM PriceRequestModel")
    List<String> findDistinctOrigins();


}
