/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.LinkedList;

/**
 *
 * @author abouf
 */
public class Event {
    
    private Hotel hotel;
    static public LinkedList<Client> ClientList;
    static int STANDARD_ROOM_NUMBER;
    static int STANDARD_ROOM_CONFERENCE_NUMBER;
    static int SUITE_ROOM_NUMBER;
    static int APARTEMENTS_ROOM_NUMBER;
    public Event(Hotel hotel) {
        STANDARD_ROOM_NUMBER=1;
        STANDARD_ROOM_CONFERENCE_NUMBER=1;
        SUITE_ROOM_NUMBER=101;
        APARTEMENTS_ROOM_NUMBER=201;
        this.hotel = hotel;
        ClientList = new LinkedList<>();
        
    }
    
    public LinkedList getClientList(){
       return ClientList;
    }
    
    public boolean register(String Reservation,String Name){
        String room;
        int roomNumber = 0;
        boolean  isCreated = false;
        for(Client c : ClientList){
            if(Name.equals(c.getName()) && Reservation.equals(c.getReservation())){
               return isCreated;
            }
        }
        switch(Reservation){
            case "TRINGA" :  if(this.hotel.getStandardRooms()==0 && this.hotel.getApparts()!=0){
                                 room = "Apart";
                                 if(APARTEMENTS_ROOM_NUMBER<=201){
                                  roomNumber = APARTEMENTS_ROOM_NUMBER;
                                  Client c = new Client(Reservation,Name,room,roomNumber);
                                  APARTEMENTS_ROOM_NUMBER++;
                                  hotel.setApparts(hotel.getApparts()-1);
                                  
                                  isCreated = true;
                                  ClientList.add(c);
                                 }
                                } else if(this.hotel.getStandardRooms()!=0){
                                    room = "Standard room";
                                    if(STANDARD_ROOM_NUMBER<=100){
                                        roomNumber = STANDARD_ROOM_NUMBER;
                                        Client c = new Client(Reservation,Name,room,roomNumber);
                                        STANDARD_ROOM_NUMBER++;
                                        STANDARD_ROOM_CONFERENCE_NUMBER++;
                                        hotel.setStandardRooms(hotel.getStandardRooms()-1);
                                        isCreated = true;
                                        ClientList.add(c);
                                       }
                                }
                            break;
            case "CONF" :  if(this.hotel.getStandardRooms()==0 && this.hotel.getApparts()!=0){
                                 room = "Apart";
                                 if(APARTEMENTS_ROOM_NUMBER<=201){
                                  roomNumber = APARTEMENTS_ROOM_NUMBER;
                                  Client c = new Client(Reservation,Name,room,roomNumber);
                                  APARTEMENTS_ROOM_NUMBER++;
                                  hotel.setApparts(hotel.getApparts()-1);
                                  isCreated =  true;
                                  ClientList.add(c);
                                 }
                                } else if(this.hotel.getStandardRooms()!=0){
                                    room = "Standard room";
                                    if(STANDARD_ROOM_CONFERENCE_NUMBER<=100){
                                        roomNumber = STANDARD_ROOM_CONFERENCE_NUMBER;
                                        Client c = new Client(Reservation,Name,room,roomNumber);
                                        STANDARD_ROOM_NUMBER++;
                                        hotel.setStandardRooms(hotel.getStandardRooms()-1);
                                        isCreated =  true;
                                        ClientList.add(c);
                                       }
                                }
                            break;  
            case "STAFF" :  if(this.hotel.getStandardRooms()==0 && this.hotel.getApparts()!=0){
                                 room = "Apart";
                                 if(APARTEMENTS_ROOM_NUMBER<=201){
                                  roomNumber = APARTEMENTS_ROOM_NUMBER;
                                  Client c = new Client(Reservation,Name,room,roomNumber);
                                  APARTEMENTS_ROOM_NUMBER++;
                                  hotel.setApparts(hotel.getApparts()-1);
                                   isCreated =  true;
                                 }
                                } else if(this.hotel.getStandardRooms()!=0){
                                    room = "Standard room";
                                    if(STANDARD_ROOM_CONFERENCE_NUMBER<=100){
                                        roomNumber = STANDARD_ROOM_CONFERENCE_NUMBER;
                                        Client c = new Client(Reservation,Name,room,roomNumber);
                                        STANDARD_ROOM_NUMBER++;
                                        hotel.setStandardRooms(hotel.getStandardRooms()-1);
                                         isCreated =  true;
                                         ClientList.add(c);
                                       }
                                }
                            break;
            case "SPEAKER":if(this.hotel.getSuites()!=0 ){
                                 room = "Suite";
                                 if(SUITE_ROOM_NUMBER<=200){
                                  roomNumber = SUITE_ROOM_NUMBER;
                                  Client c = new Client(Reservation,Name,room,roomNumber);
                                  SUITE_ROOM_NUMBER++;
                                  hotel.setSuites(hotel.getSuites()-1);
                                  
                                   isCreated =  true;
                                   ClientList.add(c);
                                 }
                            }
                            break;
                            
            case "DEEP DIVE" :  if(this.hotel.getStandardRooms()==0 && this.hotel.getApparts()!=0){
                                 room = "Apart";
                                 if(APARTEMENTS_ROOM_NUMBER<=300){
                                  roomNumber = APARTEMENTS_ROOM_NUMBER;
                                  Client c = new Client(Reservation,Name,room,roomNumber);
                                  APARTEMENTS_ROOM_NUMBER++;
                                  hotel.setApparts(hotel.getApparts()-1);
                                   isCreated =  true;
                                   ClientList.add(c);
                                 }
                                } else if(this.hotel.getStandardRooms()!=0){
                                    room = "Standard room";
                                    if(STANDARD_ROOM_CONFERENCE_NUMBER<=100){
                                        roomNumber = STANDARD_ROOM_CONFERENCE_NUMBER;
                                        Client c = new Client(Reservation,Name,room,roomNumber);
                                        STANDARD_ROOM_NUMBER++;
                                        hotel.setStandardRooms(hotel.getStandardRooms()-1);
                                         isCreated =  true;
                                         ClientList.add(c);
                                       }
                                }
                            break; 
            case "Together" : room = "Apart";
                                 if(APARTEMENTS_ROOM_NUMBER<=300){
                                  roomNumber = APARTEMENTS_ROOM_NUMBER;
                                  Client c = new Client(Reservation,Name,room,roomNumber);
                                  APARTEMENTS_ROOM_NUMBER++;
                                  hotel.setApparts(hotel.getApparts()-1);
                                   isCreated =  true;
                                   ClientList.add(c);
                                 }
                            break;
        }
        return  isCreated;
    }
    
    public boolean register(String Reservation,String Name1,String Name2){
          return register( Reservation, Name1) & register( Reservation, Name2);
    }
    
    public boolean register(String Reservation,String Name1,String Name2,String Name3){
          String Res = "Together";
          if(hotel.getStandardRooms()< 3){
            return register( Res, Name1) & register( Res, Name2) & register( Res, Name3);
          }else{
              return register( Reservation, Name1) & register( Reservation, Name2) & register( Reservation, Name2);  
          }
          
    }
    
    protected void fillStandardRooms(int standardRooms) {
        for (int i = 0; i < standardRooms; i++) {
            String name = "Name" + i;
            this.register("TRINGA", name);
        }
    }
    
    
}
