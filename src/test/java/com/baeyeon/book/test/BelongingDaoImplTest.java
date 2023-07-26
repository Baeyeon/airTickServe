package com.baeyeon.book.test;

import com.baeyeon.book.dao.BelongingDao;
import com.baeyeon.book.dao.impl.BelongingDaoImpl;
import com.baeyeon.book.pojo.Belonging;
import org.junit.Test;

import static org.junit.Assert.*;

public class BelongingDaoImplTest {

    private BelongingDao belongingDao = new BelongingDaoImpl();

    @Test
    public void addBelonging() {
        belongingDao.addBelonging(new Belonging(5,"6666666666666"));
    }

    @Test
    public void queryBelongingByInfo() {
        System.out.println(belongingDao.queryBelongingByInfo(new Belonging(3,null)));
    }
}