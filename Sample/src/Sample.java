/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class Sample {

    /**
     * the command line arguments
     */
    
    
    public static void main(String[] args) {
    Pair a = new Pair(2,5);
    Swapper two=new Swapper();
    System.out.println("Heeeyyy solon");
    two.swap(a);
    System.out.println(a.getFirst());
    System.out.println( a.getSecond());
   
    /* Δεν αλλάζουν
    two.swap(a.getFirst(),a.getSecond());
    System.out.println(a.getFirst());
    System.out.println(a.getSecond())
    */
    
    
    }
    
}
