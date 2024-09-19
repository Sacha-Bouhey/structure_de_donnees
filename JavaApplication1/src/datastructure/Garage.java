/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure;

import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author s.bouhey
 */
public class Garage {
    private LinkedList<Vehicule> vehiculeList;
    
    public Garage() {
        this.vehiculeList = new LinkedList<>();
    }
    
    //Get vehicule
    public Vehicule getVehicule(int index) {
        return this.vehiculeList.get(index);
    }
    
    //Add vehicule
    public void addVehicule(Vehicule vehiculeToAdd) {
        
        this.vehiculeList.addLast(vehiculeToAdd);
    }
    
    //Print all elements of vehiculeList
    public void printAllVehicules(){
        Iterator<Vehicule> itvehicule = this.vehiculeList.iterator();
        
        System.out.println("\nStart of elements of garage"); 
        while(itvehicule.hasNext()) {    
            itvehicule.next().print();
        }
    }
}
