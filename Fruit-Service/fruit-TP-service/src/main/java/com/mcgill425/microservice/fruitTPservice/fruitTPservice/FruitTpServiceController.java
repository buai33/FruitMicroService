package com.mcgill425.microservice.fruitTPservice.fruitTPservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
public class FruitTpServiceController {
    @GetMapping("/fruit-total-price/fruit/{fruit}/{month}/quantity/{quantity}")
    public FruitTotalPrice calculateTotalPrice(@PathVariable String fruit,
                                               @PathVariable String month,
                                               @PathVariable Integer quantity) {
        HashMap<String, String> uriVariables = new HashMap<>();
        uriVariables.put("fruit", fruit);
        uriVariables.put("month", month);

        ResponseEntity<FruitTotalPrice> responseEntity = new RestTemplate().getForEntity(
                "http://localhost:8000/currency-exchange/from/{from}/to/{to}",
                FruitTotalPrice.class, uriVariables);

        FruitTotalPrice fruitTotalPrice = responseEntity.getBody();
        return new FruitTotalPrice(fruitTotalPrice.getId(), fruit, month, fruitTotalPrice.getFmp(), fruitTotalPrice.getQuantity(), quantity*fruitTotalPrice.getTotalPrice(), fruitTotalPrice.getEnvironment() + " " + "rest template");

    }
}
