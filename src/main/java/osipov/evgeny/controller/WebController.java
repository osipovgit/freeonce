package osipov.evgeny.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    private static final Logger log = Logger.getLogger(WebController.class.getName());

    @RequestMapping("/")
    public String auth(Model model) {
        return "auth";
    }

    @RequestMapping("/registration")
    public String registration(Model model) {
        return "registration";
    }

    @RequestMapping("/all_orders")
    public String allOrders(Model model) {
        return "all_orders";
    }

    @RequestMapping("/create_order")
    public String createOrder(Model model) {
        return "create_order";
    }

    @RequestMapping("/show_order")
    public String showOrder(Model model) {
        return "show_order";
    }

    @RequestMapping("/show_profile")
    public String showProfile(Model model) {
        return "show_profile";
    }
}
