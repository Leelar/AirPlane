/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

public class AirPlane {
    private ArrayList<Seat> seats;
    
    //constructor
    public AirPlane(){
        this.seats = new ArrayList<Seat>();
        for(int i = 1; i <= 20; i++){
            Seat tmp_seat = new Seat();
            tmp_seat.setSeatId(i);
            tmp_seat.setIsBooked(false);
            tmp_seat.setSeat_type(SeatType.HIGH_CLASS);
            tmp_seat.setSeat_price(600);
            this.seats.add(tmp_seat);
        }
        for(int i = 21; i <= 40; i++){
            Seat tmp_seat = new Seat();
            tmp_seat.setSeatId(i);
            tmp_seat.setIsBooked(false);
            tmp_seat.setSeat_type(SeatType.BUSSINESS);
            tmp_seat.setSeat_price(450);
            this.seats.add(tmp_seat);
        }
        for(int i = 41; i <= 80; i++){
            Seat tmp_seat = new Seat();
            tmp_seat.setSeatId(i);
            tmp_seat.setIsBooked(false);
            tmp_seat.setSeat_type(SeatType.ECONOMIC);
            tmp_seat.setSeat_price(300);
            this.seats.add(tmp_seat);
        }
              
    }
    public void bookSeat(int bookID){
        for (Seat s : this.seats ){
            if(s.getSeatId() == bookID ){
                s.seatBooked();
                System.out.println("Booking successful: bookID: "+s.getSeatId());
            }
            
        }
    }
    public void cancelSeat(int bookID){
        for (Seat s : this.seats ){
            if(s.getSeatId() == bookID ){
                s.seatReleased();
                System.out.println("Booking canceled successful: bookID: "+s.getSeatId());
            }
            
        }
    }
    public int getNumberSeatBooked(){
        return Seat.numberBooked;
    }
}
