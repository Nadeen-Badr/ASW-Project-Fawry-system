package com.example.demo.Discount;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscountController {
    // Overall overall=new Overall();

    @RequestMapping(value = "/OverallDiscount", method = RequestMethod.POST)
    public String addOverallDiscount(@RequestBody Overall overall) {
        return "Success Add Overall Discont";
    }

    @RequestMapping(value = "/SpicificDiscount", method = RequestMethod.POST)
    public String addOverallDiscount(@RequestBody Specific spicific) {
        return "Success Add Spicific Discont";
    }
}