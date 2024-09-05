/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure;

/**
 *
 * @author s.bouhey
 */
public class Vehicule {
    //Initialize members
    private String name;
    private String ownerName;
    
    public Vehicule(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }
    
    //Get name
    public String getName(){
        return this.name;
    }
    
    //Set name
    public void setName(String newName) {
        this.name = newName;
    }
    
    //Print name
    public void print(){
        System.out.println(this.name);
    }
}
