package com.aplazo.technictest.service;

import com.aplazo.technictest.model.Request;
import com.aplazo.technictest.model.Response;
import com.aplazo.technictest.repository.RequestRepository;
import com.aplazo.technictest.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@Service
public class CalculatorService {

    @Autowired
    RequestRepository requestRepository;

    @Autowired
    ResponseRepository responseRepository;

    public ArrayList<Response> calculate(Request request){

        requestRepository.save(request);

        ArrayList<Response> responseArrayList = new ArrayList<>();
        Double capitalEarned = request.getAmount() * (request.getRate()/100);
        Double amount = (request.getAmount()/request.getTerms()) + capitalEarned;
        Date payment_date = new Date();

        for (int i = 1; i <= request.getTerms(); i++){
            payment_date = addDays(payment_date, 7);
            Response response = new Response(i, amount, payment_date);
            responseArrayList.add(response);
            responseRepository.save(response);
        }
        return responseArrayList;

    }

    public Date addDays(Date date, int days){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, days);
        return calendar.getTime();
    }
}
