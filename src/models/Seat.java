/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import models.SeatType;


public class Seat {
    private int seatId;
    private boolean booked;
    private SeatType seat_type;
    private double seat_price;
    public static int numberBooked = 0;
    //construct 
    public Seat(){
    }
    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public void setIsBooked(boolean isBooked) {
        this.booked = isBooked;
    }

    public void setSeat_type(SeatType seat_type) {
        this.seat_type = seat_type;
    }

    public void setSeat_price(double seat_price) {
        this.seat_price = seat_price;
    }
    
    public int getSeatId() {
        return seatId;
    }

    public boolean isBooked() {
        return booked;
    }

    public SeatType getSeat_type() {
        return seat_type;
    }

    public double getSeat_price() {
        return seat_price;
    }
    public void seatBooked(){
        this.booked = true;
        Seat.numberBooked++;
    }
    public void seatReleased(){
        this.booked = false;
        Seat.numberBooked--;
    }
    public int getNoOfSeatBooked(){
        return Seat.numberBooked;
    }
    
    
    
    
}
