/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.junit.Assert;



/**
 *
 * @author abouf
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int standardRooms = 12;
        int suites = 5;
        int apparts = 15;
        Hotel hotel = new Hotel(standardRooms, suites, apparts);
        Event  event = new Event(hotel);
       event.fillStandardRooms(12);

        Assert.assertEquals(true, event.register("TRINGA", "Mohammed"));
        Assert.assertEquals("Apart N°201", hotel.getRoomFor("Mohammed"));
        Assert.assertEquals("Standard rooms: 0|Suites: 5|Aparts: 14", hotel.checkAvailibility());
    }
    
}
