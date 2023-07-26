package com.baeyeon.book.service;

import com.baeyeon.book.pojo.Belonging;

import java.util.List;

public interface BelongingService {
    public void addBelonging(Belonging belonging);

    public List<Belonging> queryBelongingByInfo(Belonging belonging);
}
