/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayList;

/**
 *
 * @author s.bouhey
 */
public class Printer {
    private String name;
    private Deque<File> waitingList = new LinkedList<>();
    private static ArrayList<String> usedName = new ArrayList<>();
    
    //Default name constructor
    public Printer() {
        String name = "Default name";
        checkName(name);
    }
    
    //Constructor to add name
    public Printer(String name) {
        checkName(name);
    } 
    
    
    
    //Name getter
    public String getName() {
        return this.name;
    }


    //Print a text with the size of the list
    public void printNumberWaiting() {
        System.out.println("There are " + waitingList.size() + " files in " + this.name + "'s " + "waiting list");
    }
    
    //Add new element do waitingList
    public void addToWaitingList(File fileToAdd) {
        this.waitingList.addLast(fileToAdd);
    }   
    
    //Print name and remove the element from the waiting list
    public void print() {
        if(this.waitingList.isEmpty()) {
            System.out.println("There's nothing to print");
        }
        while(!this.waitingList.isEmpty()) {
            waitingList.poll().print();
            try {
                Thread.sleep(2000);}
            catch(InterruptedException e){}
            
        }
    }
    
    private void checkName(String name){
        int count = 0;
        while(usedName.contains(name)){
            name = name + String.valueOf(count);
            count++;
        }
        this.name = name;
        this.usedName.add(name);
    }
}