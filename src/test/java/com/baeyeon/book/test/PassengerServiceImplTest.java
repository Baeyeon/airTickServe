package com.baeyeon.book.test;

import com.baeyeon.book.pojo.Passenger;
import com.baeyeon.book.service.PassengerService;
import com.baeyeon.book.service.impl.PassengerServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerServiceImplTest {
    private PassengerService passengerService = new PassengerServiceImpl();

    @Test
    public void addPassenger() {
        passengerService.addPassenger(new Passenger("500107200005152430",0,"言言","18996500055"));
    }
}