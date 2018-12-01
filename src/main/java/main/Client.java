/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author abouf
 */
public class Client {
    public String Reservation;
    public String Name;
    public String Room;
    public int RoomNumber;

    public Client(String Reservation, String Name, String Room, int RoomNumber) {
        this.Reservation = Reservation;
        this.Name = Name;
        this.Room = Room;
        this.RoomNumber = RoomNumber;
    }
  
    public String getReservation() {
        return Reservation;
    }

    public void setReservation(String Reservation) {
        this.Reservation = Reservation;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String Room) {
        this.Room = Room;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }
    
    
    
    
    
}
