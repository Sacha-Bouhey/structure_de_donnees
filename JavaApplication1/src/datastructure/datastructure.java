/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure;
import java.util.LinkedList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Hashtable;

public class datastructure {
    public static void main(String[] args) {
        
        Garage sachaGarage = new Garage();
        
        //Initialization Objects Vehicule
        Vehicule voiture = new Vehicule("Voiture", "sacha");
        Vehicule camion = new Vehicule("Camion", "Sacha");
        Vehicule camionnette = new Vehicule("Camionnette", "Sacha");
        
        
        //Add Vehicule in garage
        sachaGarage.addVehicule(new Vehicule("Moto", "Hugo"));
        sachaGarage.addVehicule(voiture);
        
        //Print all Vehicule of Garage
        sachaGarage.printAllVehicules();
        
        //Intialization of my frist Deque
        Deque<Vehicule> vehiculeDeque = new LinkedList<>();
        
        //Intialization of my second Deque
        Deque<Vehicule> vehiculeDeque2 = new LinkedList<>();
        
        //Adding Vehicule in the Deque
        vehiculeDeque.add(voiture);
        vehiculeDeque.add(camion);
        vehiculeDeque.add(camionnette);
        
        //Print name of the elements of my first list
        Iterator<Vehicule> it = vehiculeDeque.iterator();
        System.out.println("\nStart of my first deque");
        while(it.hasNext()) {
            it.next().print();
        }
        
        //Inverse la pile
        while(!vehiculeDeque.isEmpty()){
            vehiculeDeque2.push(vehiculeDeque.pop());
        }
        
        //Print name of the elements of my second list
        Iterator<Vehicule> it2 = vehiculeDeque2.iterator();
        System.out.println("\nStart of my second deque");
        while(it2.hasNext()) {
            it2.next().print();
        }
        
        //Initialization of my printers
        Printer sachaPrinter = new Printer("Sacha");
        Printer HugoPrinter = new Printer("Hugo");
        Printer RobertPrinter = new Printer();
        Printer RobertPrinter2 = new Printer();
        Printer RobertPrinter3 = new Printer();
        
        
        sachaPrinter.addToWaitingList(new File("coucou.txt"));
        sachaPrinter.addToWaitingList(new File("text.txt"));
        sachaPrinter.addToWaitingList(new File("lol.png"));
        
        //System.out.println("\nStart of printer function");
        //sachaPrinter.print();
        //sachaPrinter.print();
        
        //Creating Hashtable for printers
        Hashtable<String, Printer> printerTable = new Hashtable<>();
        
        //Adding printer to my hashtable
        printerTable.put(sachaPrinter.getName(), sachaPrinter);
        printerTable.put(HugoPrinter.getName(), HugoPrinter);
        printerTable.put(RobertPrinter.getName(), RobertPrinter);
        printerTable.put(RobertPrinter2.getName(), RobertPrinter);
        printerTable.put(RobertPrinter3.getName(), RobertPrinter);
        
        //Adding file to my Printers
        sachaPrinter.addToWaitingList(new File("lol.png"));
        HugoPrinter.addToWaitingList(new File("fichier1.png"));
        HugoPrinter.addToWaitingList(new File("fichier2.png"));
        
        //Retrieving Printer from Hashtable
        System.out.println("\nPrint number of waiting list for each printers");
        printerTable.get(sachaPrinter.getName()).printNumberWaiting();
        printerTable.get(HugoPrinter.getName()).printNumberWaiting();
        printerTable.get(RobertPrinter.getName()).printNumberWaiting();
        printerTable.get(RobertPrinter2.getName()).printNumberWaiting();
        printerTable.get(RobertPrinter3.getName()).printNumberWaiting();
        
        Bstnode binarytree = new Bstnode();
    
        binarytree.add(5);
        binarytree.add(3);
        binarytree.add(4);
        binarytree.add(8);
        binarytree.add(7);
        binarytree.add(5);
        
        binarytree.printTree();
        System.out.println(binarytree.countNode());
    }
    
}
