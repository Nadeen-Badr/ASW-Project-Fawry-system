package com.example.demo.Providers;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {
    @RequestMapping(value = "/VodafoneMobileForm", method = RequestMethod.POST)
    public String fillWeForm(@RequestBody VodafoneMobile vodafone) {
        return "Success Fill Form";
    }

    @RequestMapping(value="/getVodafoneMobileForm",method=RequestMethod.GET)
    public String getFormVodafone(){
        return "Name\n"+"Phone\n"+"Address\n"+"Amount";

    }

    @RequestMapping(value = "/WeMobileForm", method = RequestMethod.POST)
    public String fillWeForm(@RequestBody WeMobile we) {
        return "Success Fill Form";
    }

    @RequestMapping(value="/getWeMobileForm",method=RequestMethod.GET)
    public String getFormWe(){
        return "Name\n"+"Amount";

    }
    
    @RequestMapping(value = "/OrangeMobileForm", method = RequestMethod.POST)
    public String fillOrangeForm(@RequestBody OrangeMobile orange) {
        return "Success Fill Form";
    }

    @RequestMapping(value="/getOrangeMobileForm",method=RequestMethod.GET)
    public String getFormOrange(){
        return "Name\n"+"Address\n"+"Amount";

    }


    @RequestMapping(value = "/EtisalateMobileForm", method = RequestMethod.POST)
    public String fillEtisaleForm(@RequestBody EstisalteMobile etisalate) {
        return "Success Fill Form";
    }

    @RequestMapping(value="/getEtisalateMobileForm",method=RequestMethod.GET)
    public String getEtisaleForm(){
        return "Name\n"+"Email\n"+"Address\n"+"Amount";

    }
}
