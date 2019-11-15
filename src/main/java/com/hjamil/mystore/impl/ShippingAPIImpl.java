package com.hjamil.mystore.impl;

import com.hjamil.mystore.model.domain.Shipping;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ShippingAPIImpl {

    static List<Shipping> SHIPPINGS = Arrays.asList(
            new Shipping("Overnight", 26)
            , new Shipping("2-Day", 10)
            , new Shipping("Postal", 3)
            , new Shipping("Giveaway", 1)
    );

    public List<Shipping> getShippings() {
        return SHIPPINGS;
    }
}
