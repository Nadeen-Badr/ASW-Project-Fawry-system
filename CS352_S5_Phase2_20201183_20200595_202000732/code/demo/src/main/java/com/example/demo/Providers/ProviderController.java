package com.example.demo.Providers;


import com.example.demo.Forms.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
@Service
@RestController
public class ProviderController
{
    @Autowired
    ServiceController serviceController ;
    @PostMapping(value = "/Schools/Cal_Service")
    public float  SchoolHandler( @RequestBody SchoolForm schoolForm)
    {
       return serviceController.calcalte_service("Schools" ,schoolForm.getAmount()) ;
    }
    @PostMapping (value = "/NFOS/Cal_Service")
    public float  NFOSHandler(@RequestBody NGOSForm  NGOSForm)
    {
        return serviceController.calcalte_service("NGOS" ,NGOSForm.getAmount()) ;
    }
    @PostMapping(value = "/CancerHospital/Cal_Service")
    public float  CancerHandler( @RequestBody CancerHospitalForm CancerHospitalForm )
    {
        return serviceController.calcalte_service("CancerHospital" ,CancerHospitalForm.getAmount()) ;
    }
    @PostMapping(value = "/MonthlyReceipt/Cal_Service")
    public float  MonthlyHandler(@RequestBody LandLineForm landLineForm)
    {
        return serviceController.calcalte_service("MonthlyReceipt" ,landLineForm.getAmount()) ;
    }
    @PostMapping(value = "/QuarterReceipt/Cal_Service")
    public float QuarterHandler ( @RequestBody LandLineForm landLineForm )
    {
        return serviceController.calcalte_service("QuarterReceipt" ,landLineForm.getAmount()) ;
    }
    @PostMapping(value = "/WeInternet/Cal_Service")
    public float WeInternetHandler ( @RequestBody InternetForm internetForm)
    {
        return serviceController.calcalte_service("We" ,internetForm.getAmount()) ;
    }
    @PostMapping(value = "/OrangeInternet/Cal_Service")
    public float OrangeInternetHandler ( @RequestBody  InternetForm internetForm)
    {
        return serviceController.calcalte_service("Orange" , internetForm .getAmount()) ;
    }
    @PostMapping(value = "/EtisalateInternet/Cal_Service")
    public float EtisalateIternetHandler ( @RequestBody InternetForm internetForm )
    {
        return serviceController.calcalte_service("Etisalate" , internetForm .getAmount()) ;
    }
    @PostMapping(value = "/VodafoneInternet/Cal_Service")
    public float VodafoneIternetHandler ( @RequestBody InternetForm internetForm )
    {
        return serviceController.calcalte_service("Vodafone" , internetForm .getAmount()) ;
    }

    @PostMapping(value = "/WeMOBILE/Cal_service")
    public float WeMobileHandler ( @RequestBody MobileForm mobileForm)
    {
        return serviceController.calcalte_service("WeMobile" , mobileForm.getAmount()) ;
    }
    @PostMapping(value = "/OrangeMobiles/Cal_service")
    public float OrangeMobiletHandler ( @RequestBody  MobileForm mobileForm)
    {
        return serviceController.calcalte_service("OrangeMobile" ,  mobileForm .getAmount()) ;
    }
    @PostMapping(value = "/EtisalateMobile/Cal_service")
    public float EtisalateMobileHandler ( @RequestBody MobileForm mobileForm )
    {
        return serviceController.calcalte_service("EtsalateMobile" , mobileForm .getAmount()) ;
    }
    @PostMapping(value = "/VodafoneMobile/Cal_teservice")
    public float VodafoneMobileHandler ( @RequestBody MobileForm mobileForm)
    {
        return serviceController.calcalte_service("VodafoneMobile", mobileForm .getAmount()) ;
    }



}
    
    

