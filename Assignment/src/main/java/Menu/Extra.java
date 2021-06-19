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
public class Extra {
    String name;
    String unit;
    int price;

    public Extra(String name, String unit, int price) {
        this.name = name;
        this.unit = unit;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public String getUnit(){
        return unit;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setUnit(String unit){
        this.unit=unit;
    }
    
    public void setPrice(int price){
        this.price=price;
    }
    
}
