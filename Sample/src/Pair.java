/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Pair {
    
private int x;
private int y;

public void setBoth(int a,int b){
x=a;
y=b;
}
public void setFirst(int a){
x=a;
}
public void setSecond(int a){
y=a;
}
public int getFirst(){
return x;
}
public int getSecond(){
return y;
}
public Pair(int a,int b){
x=a;
y=b;
}

}
