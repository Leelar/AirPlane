/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import models.AirPlane;

/**
 *
 * @author Namngiep1
 */
public class AirplaneJavaApp {
    
    public static void main(String[] args) {
        //create airpline obj
        AirPlane appAirplane = new AirPlane();
        //book seat nummber 11, 22, 33, 88, 99
        appAirplane.bookSeat(11);
        appAirplane.bookSeat(22);
        appAirplane.bookSeat(33);
        appAirplane.bookSeat(44);
        appAirplane.bookSeat(55);
        appAirplane.bookSeat(66);
        System.out.println("6 Seats was booked");
        System.out.println("Check number booked: "+ appAirplane.getNumberSeatBooked());
        System.out.println("Next step is cancelling......");
        appAirplane.cancelSeat(33);
        appAirplane.cancelSeat(44);
        System.out.println("Check number booked: "+ appAirplane.getNumberSeatBooked());
    }
    
}
