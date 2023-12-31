package com.driver.services;


import com.driver.model.Passenger;
import com.driver.model.Ticket;
import com.driver.repository.PassengerRepository;
import com.driver.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    TicketRepository ticketRepository;

    public Integer addPassenger(Passenger passenger){
        //Add the passenger Object in the passengerDb and return the passegnerId that has been returned
        passengerRepository.save(passenger);

        List<Ticket> bookedTickets = passenger.getBookedTickets();

        return passenger.getPassengerId();
    }

}
