package com.javanaitei.phoneshop.controller.admin;

import com.javanaitei.phoneshop.entity.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
    @RequestMapping(value={"/admin"}, produces="application/json;charset=UTF-8")
public class AdminController {
    @GetMapping(value = {"/dashboard", "/"})
    public String about() {
        return "admin/dashboard";
    }

    @GetMapping("/analytics")
    public String staticPage() {
        return "admin/static/static";
    }

    @GetMapping("/profile")
    public String profile() {
        return "admin/admin-profile";
    }
}
