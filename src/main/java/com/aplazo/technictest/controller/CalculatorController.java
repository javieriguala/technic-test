package com.aplazo.technictest.controller;


import com.aplazo.technictest.model.Request;
import com.aplazo.technictest.model.Response;
import com.aplazo.technictest.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @PostMapping("/calculate")
    public ArrayList<Response> crearEntidad(@RequestBody Request request) {
        return calculatorService.calculate(request);
    }
}