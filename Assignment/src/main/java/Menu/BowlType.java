/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/**
 *
 * @author MyPC
 */
abstract class BowlType {
    String size;
    int price;
    
    public BowlType(String size, int price)
    {
        this.size=size;
        this.price=price;
    }
    
    public String getSize(){
        return size;
    }
    
    public abstract void setSize(String size);
    
    public int getPrice(){
        return price;
    }
    
    public abstract void setPrice(int price);
    
    @Override
    public String toString(){
        return "Size: "+ size +" Price: "+price;
    }
}
