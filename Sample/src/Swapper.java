/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @PanosPapastergiou
 */
public class Swapper {
    //Pair one = new Pair(2,5);
   
    
 public void Swapper(){}
 
 public void swap(Pair a){
 int temp=a.getFirst();
 a.setFirst(a.getSecond());
 a.setSecond(temp);
 }

 public void swap(int a,int b){
     int temp=a;
     a=b;
     b=temp;
 }
 
 
    
}
