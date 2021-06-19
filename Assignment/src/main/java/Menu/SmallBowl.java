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
public class SmallBowl extends BowlType{
    int qty=0;
    public SmallBowl() {
        super("Nho", 45);
        this.qty=0;
    }
    
    public SmallBowl(int qty){
        super("Nho", 45);
        this.qty=qty;
    }
    
    @Override
    public String getSize(){
        return "Nho";
    }
    
    /**
     *
     * @param size
     */
    @Override
    public void setSize(String size){
        this.size="Nho";
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getPrice(){
        return 45;
    }
    
    /**
     *
     * @param price
     */
    @Override
    public void setPrice(int price){
        this.price=45;
    }
     public int getQty(){
        return qty;
    }
    
    public void setQty(int qty){
        this.qty=qty;
    }
}
