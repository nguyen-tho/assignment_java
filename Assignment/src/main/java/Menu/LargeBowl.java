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
public class LargeBowl extends BowlType{
    
    public LargeBowl() {
        super("Lon", 60);
    }
    
    @Override
    public String getSize(){
        return "Lon";
    }
    
    /**
     *
     * @param size
     */
    @Override
    public void setSize(String size){
        this.size="Lon";
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getPrice(){
        return 60;
    }
    
    /**
     *
     * @param price
     */
    @Override
    public void setPrice(int price){
        this.price=60;
    }
}
