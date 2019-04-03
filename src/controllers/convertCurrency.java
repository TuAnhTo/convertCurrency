package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class convertCurrency {
    @PostMapping("/convert")
    public String convert (HttpServletRequest request, HttpServletResponse response, ModelMap modelMap){
        float usd = Float.parseFloat(request.getParameter("currencyUSA"));
        double vnd = (double) usd *230000;
        modelMap.addAttribute(vnd + "=",usd);
        modelMap.addAttribute(usd + "",vnd);
        modelMap.addAttribute("message" , "Success!");
        return "homepage";
    }
}
