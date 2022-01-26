package com.book.demo.api.service;

import com.book.demo.persistence.BusinessService;
import com.book.demo.persistence.DataService;
import com.book.demo.persistence.model.Data;
import com.book.demo.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    DataService dataService;

    public long calculateSum(User user)
    {
        long sum = 0;
        for(Data data : dataService.retrieveData(user))
        {
            sum += data.getValue();
        }
        return sum;
    }

    public void setDataService(DataService dataService)
    {
        this.dataService = dataService;
    }
}
