/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static main.Event.ClientList;

/**
 *
 * @author abouf
 */
public class Hotel {
    private int standardRooms;
    private int suites;
    private int apparts;

    public Hotel(int standardRooms, int suites, int apparts) {
        this.standardRooms = standardRooms;
        this.suites = suites;
        this.apparts = apparts;
    }

    public int getStandardRooms() {
        return standardRooms;
    }

    public void setStandardRooms(int standardRooms) {
        this.standardRooms = standardRooms;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getApparts() {
        return apparts;
    }

    public void setApparts(int apparts) {
        this.apparts = apparts;
    }
    
    public String checkAvailibility(){
     return "Standard rooms: "+this.standardRooms+"|Suites: "+this.suites+"|Aparts: "+this.apparts;
    }
    
    public String getRoomFor(String ClientName){
        String result="";
        for(Client c : ClientList){
            if(ClientName.equals(c.getName())){
               result = result+c.getRoom()+" N°"+c.getRoomNumber();
            }
        }
     return result;
    }
}
