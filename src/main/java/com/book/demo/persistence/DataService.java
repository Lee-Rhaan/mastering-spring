package com.book.demo.persistence;

import com.book.demo.persistence.model.Data;
import com.book.demo.persistence.model.User;

import java.util.List;

public interface DataService {
    List<Data> retrieveData(User user);
}
