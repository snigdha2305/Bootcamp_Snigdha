package com.example.controller;

import com.example.dao.CarDAO;
import com.example.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;
import static org.springframework.util.MimeTypeUtils.APPLICATION_XML_VALUE;
import static org.springframework.util.MimeTypeUtils.TEXT_PLAIN_VALUE;

@RestController
public class CarResourceController {

    @Autowired
    CarDAO carDAO;

   // @RequestMapping(value = "/car",produces = "text/plain",method = RequestMethod.GET)
   @RequestMapping(value = "/car",produces = TEXT_PLAIN_VALUE,method = RequestMethod.GET)
    public String readCar() {
        return "Vin = 100, Model = Q7, Make = Audi, Price = 78000000.00, Qty = 10";
    }

    @RequestMapping(value = "/car",produces = APPLICATION_XML_VALUE,method = RequestMethod.GET)
    public Car readCarasXML() {
        Car car = carDAO.selectByVin(1000);
        return car;
    }

    /*@RequestMapping(value = "/car",produces = APPLICATION_XML_VALUE,method = RequestMethod.GET)
    public String readCarasXML() {
        //return "<car><vin>100</vin><model>Q7</model><make>Audi</make>";
    }*/

    @RequestMapping(value = "/car",produces = APPLICATION_JSON_VALUE,method = RequestMethod.GET)
    public Car readCarasJson() {
        //return "{\"vin\":100,\"model\":\"Q7\",\"make\":\"Audi\",\"price\":7800000,\"qty\":10}";
        Car car = carDAO.selectByVin(1000);
        return car;
    }

    /*@RequestMapping(value = "/car",produces = APPLICATION_JSON_VALUE,method = RequestMethod.GET)
    public String readCarasJson() {
        return "{\"vin\":100,\"model\":\"Q7\",\"make\":\"Audi\",\"price\":7800000,\"qty\":10}";
    }*/
}
