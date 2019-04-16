package com.parking.wchat;
import com.parking.wchat.Entity.Parkinglot;
import com.parking.wchat.mappers.ParkMapper;
import com.parking.wchat.mappers.ParkinglotMapper;
import com.parking.wchat.servce.AdminerServce;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingServceApplicationTests {
@Autowired
AdminerServce adminerServce;
@Autowired
    ParkinglotMapper parkinglotMapper;
@Autowired
    ParkMapper parkMapper;

    @Test
    public void contextLoads() {
        System.out.println("login in right");
        System.out.println(adminerServce.login("2017211001000130","123456"));
        System.out.println("login in mistake");
        System.out.println(adminerServce.login("2017211001000130","123457"));
        String id="2017211001000130";
        String password="123456";
        String message=adminerServce.login(id,password);
        System.out.println("{'message':"+message+"}");
        for(Parkinglot p:parkinglotMapper.selectAllPl())
        System.out.println(p.getPlname()+" "+p.getPlstate()+" "+p.getPltype());
        System.out.println(parkMapper.getAllPark().get(0).getPlname());
        for(Parkinglot l:parkinglotMapper.selectAllPl())
            System.out.println(l.getPlname()+" "+l.getPlstate()+" "+l.getPltype());
        /**System.out.println("After change:");
        String plname="华东交大1停车场";
        String plstate="紧张";
        parkinglotMapper.changePlstate(plstate,plname);
        for(Parkinglot l:parkinglotMapper.selectAllPl())
            System.out.println(l.getPlname()+" "+l.getPlstate()+" "+l.getPltype());*/
        for(Parkinglot t:parkinglotMapper.selectCanPark())
            System.out.println(t.getPlname()+" "+t.getPlstate()+" "+t.getPltype());;
    }

}
