/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure;

/**
 *
 * @author s.bouhey
 */
public class Bstnode {
    //Initialization of first node
    private Node top;
    
    //Launch function to set nodes.
    public void add(int value) {
        this.top = addNewNode(this.top, value);
    }
    
    
    //Adding node recursivly
    private Node addNewNode(Node currentNode, int value) {
        
        //If the current node is null, I create a new node with the desired value
        if(currentNode == null) {            
            return new Node(value);
        }
        //If the desired value is lower than the current node value, the value goes left.
        if(value < currentNode.getValue()) {
            
            //Recalling the function to add the new node deeper in the tree
            currentNode.setLeft(addNewNode(currentNode.getLeft(), value));
            
            //If the desired value is higher than the current node value, the value goes right.
        } else if(value > currentNode.getValue()) {
            
            //Recalling the function to add the new node deeper in the tree
            currentNode.setRight(addNewNode(currentNode.getRight(), value));
        
        //This is if the value is equal to the current one, we return the current node so it will have no effect on the tree 
        } else{
            return currentNode;
        }
        return currentNode;
    }
    
    public void printTree() {
        //Used to launch the function to print the tree as the user doesn't know the root Node
        printAllTree(this.top);
    }
    
    
    //
    public void printAllTree(Node currentNode) {
        //if the node is not null print it's value
        if(currentNode != null) {
            //This will go as deep as possible before printing the value. So I can print it from lowest to highest
            printAllTree(currentNode.getLeft());
            System.out.println("Node value = " + currentNode.getValue());
            printAllTree(currentNode.getRight());
        }
    }
    //Used to launch the function to count all the nodes as the user doesn't know the root Node
    public int countNode() {
        return totalNode(this.top);
    } 
    
    private int totalNode(Node currentNode) {
        //If node is null return 0
        if(currentNode == null) {
            return 0;
        }
        //Adds 1 every time there's a non null value
        int left = totalNode(currentNode.getLeft());
        int right = totalNode(currentNode.getRight());
        
        return 1 + left + right;
    }
    
}
