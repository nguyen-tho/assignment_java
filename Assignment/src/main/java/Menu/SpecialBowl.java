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
public class SpecialBowl extends BowlType{
   
    
    public SpecialBowl() {
        super("Dac biet", 75);
       
        
    }
    
    public SpecialBowl(int qty){
        super("Dac biet", 75);
    }
    
    @Override
    public String getSize(){
        return "Dac biet";
    }
    
    /**
     *
     * @param size
     */
    @Override
    public void setSize(String size){
        this.size="Dac biet";
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getPrice(){
        return 75;
    }
    
    /**
     *
     * @param price
     */
    @Override
    public void setPrice(int price){
        this.price=75;
    } 
}
