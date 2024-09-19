/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure;
import java.util.LinkedList;
import java.util.Deque;

/**
 *
 * @author s.bouhey
 */
public class Printer {
    private Deque<File> waitingList;
    
    public Printer() {
        this.waitingList = new LinkedList<>();
    }
    
    
    
    //Add new element do waitingList
    public void addToWaitingList(File fileToAdd) {
        this.waitingList.addLast(fileToAdd);
    }   
    
    public void print() {
        
        while(!this.waitingList.isEmpty()) {
            waitingList.poll().print();
            try {
                Thread.sleep(2000);}
            catch(InterruptedException e){}
        }
    }
}