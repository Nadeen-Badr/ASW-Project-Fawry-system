package com.example.demo.Providers;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternetController {
    @RequestMapping(value = "/VodafoneForm", method = RequestMethod.POST)
    public String fillWeForm(@RequestBody Vodafone vodafone) {
        return "Success Fill Form";
    }

    @RequestMapping(value="/getVodafoneForm",method=RequestMethod.GET)
    public String getFormVodafone(){
        return "Name\n"+"Email\n"+"Address\n"+"Amount";

    }

    @RequestMapping(value = "/WeForm", method = RequestMethod.POST)
    public String fillWeForm(@RequestBody We we) {
        return "Success Fill Form";
    }

    @RequestMapping(value="/getWeForm",method=RequestMethod.GET)
    public String getFormWe(){
        return "Name\n"+"Email\n"+"Amount";

    }
    
    @RequestMapping(value = "/OrangeForm", method = RequestMethod.POST)
    public String fillOrangeForm(@RequestBody Orange orange) {
        return "Success Fill Form";
    }

    @RequestMapping(value="/getOrangeForm",method=RequestMethod.GET)
    public String getFormOrange(){
        return "Name\n"+"Address\n"+"Amount";

    }


    @RequestMapping(value = "/EtisalateForm", method = RequestMethod.POST)
    public String fillEtisaleForm(@RequestBody Etisalate etisalate) {
        return "Success Fill Form";
    }

    @RequestMapping(value="/getEtisalateForm",method=RequestMethod.GET)
    public String getEtisaleForm(){
        return "Name\n"+"phone\n"+"Amount";

    }
}
