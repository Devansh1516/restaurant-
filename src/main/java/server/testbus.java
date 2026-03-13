package server;

import dao.res_dao;
import dao.res_imp;
import hiber.input;

public class testbus {

    public static void main(String[] args) {
res_dao dao=new res_imp();
ser_imp service=new ser_imp(dao);
input hi=new input();
    input r1=new input();
    r1.setId(1);
    r1.setName("devansh");
    r1.setPeople(5);
    service.save(r1);
    System.out.println("pending reservation");
    System.out.println(service.getAllInputs());
    System.out.println(r1.getId());
    service.approveResevation(1);
    System.out.println("after approval");
    System.out.println(service.getAllInputs());
    

    }
}