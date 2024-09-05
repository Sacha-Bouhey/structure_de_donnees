/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure;

import java.util.LinkedList;

/**
 *
 * @author s.bouhey
 */
public class Garage {
    private LinkedList<Vehicule> vehiculeList;
    
    public Garage() {
    
    }
    
    //Get vehiculeList
    public LinkedList<Vehicule> getVehiculeList(){
        return vehiculeList;
    }
    
    //Get vehicule
    public Vehicule getVehicule(int index) {
        return this.vehiculeList.get(index);
    }
    
    //Add vehicule
    public void addVehicule(Vehicule vehiculeToAdd) {
        this.vehiculeList.addLast(vehiculeToAdd);
    }
}
