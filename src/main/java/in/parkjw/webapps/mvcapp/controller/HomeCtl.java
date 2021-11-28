package in.parkjw.webapps.mvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtl {
    @RequestMapping(value = "/")
    public String main() {
        String test = "";
        return "index";
    }
}
