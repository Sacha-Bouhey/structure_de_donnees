/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure;

/**
 *
 * @author s.bouhey
 */
public class Node {
    private int value;
    private Node left;
    private Node right;
    
    
    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
    
    public int getValue() {
        return value;
    } 
    
    public void setLeft(Node newLeft) {
        this.left = newLeft;
    }
    
    public void setRight(Node newRight) {
        this.right = newRight;
    }
    
    public Node getLeft(){
        return this.left;
    }
    
    public Node getRight() {
        return this.right;
    }
}
