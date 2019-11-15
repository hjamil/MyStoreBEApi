package com.hjamil.mystore.controller;

import com.hjamil.mystore.impl.ShippingAPIImpl;
import com.hjamil.mystore.model.domain.Shipping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/v1/mystore/shipping")
public class ShippingAPI {

    @Autowired
    private ShippingAPIImpl controllerImpl;

    // GET: /v1/school/test/student
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    List<Shipping> getShippings(HttpServletRequest request) throws Exception {

        return controllerImpl.getShippings();
    }
}
