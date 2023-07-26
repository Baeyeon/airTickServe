package com.baeyeon.book.dao;

import com.baeyeon.book.dao.impl.BaseDao;
import com.baeyeon.book.pojo.Airline;
import com.baeyeon.book.pojo.Belonging;

import java.util.List;

public interface BelongingDao {
    public int addBelonging(Belonging belonging);

    public List<Belonging> queryBelongingByInfo(Belonging belonging);
}
