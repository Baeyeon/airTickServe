package com.baeyeon.book.test;

import com.baeyeon.book.pojo.Belonging;
import com.baeyeon.book.service.BelongingService;
import com.baeyeon.book.service.impl.BelongingServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class BelongingServiceImplTest {

    private BelongingService belongingService = new BelongingServiceImpl();

        @Test
    public void addBelonging() {
        belongingService.addBelonging(new Belonging(5,"2000000"));
    }

    @Test
    public void queryBelongingByInfo() {
        System.out.println(belongingService.queryBelongingByInfo(new Belonging(3,null)));
    }
}