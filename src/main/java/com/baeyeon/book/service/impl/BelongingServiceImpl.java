package com.baeyeon.book.service.impl;

import com.baeyeon.book.dao.BelongingDao;
import com.baeyeon.book.dao.impl.BelongingDaoImpl;
import com.baeyeon.book.pojo.Belonging;
import com.baeyeon.book.service.BelongingService;

import java.util.List;

public class BelongingServiceImpl implements BelongingService {

    private BelongingDao belongingDao = new BelongingDaoImpl();

    @Override
    public void addBelonging(Belonging belonging) {
        belongingDao.addBelonging(belonging);
    }

    @Override
    public List<Belonging> queryBelongingByInfo(Belonging belonging) {
        return belongingDao.queryBelongingByInfo(belonging);
    }
}
