/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

/**
 *
 * @author MyPC
 */
public class GroupTable extends TableSize{
    int amount,id;
    boolean status;

    public GroupTable( int capacity, int id, int amount, boolean status) {
        super(capacity);
        this.amount=amount;
        this.status=status;
        this.id=id;
    }
    
    
    @Override
    public void setSize(String type) {
        this.type="Gruop";
    }

    @Override
    public void setCap(int capacity) {
        this.capacity=capacity;
    }
    
    public void setAmount(int amount)
    {
        this.amount=20;
    }
    
    @Override
    public String getType(){
        return "Gruop";
    }
    
    @Override
    public int getCap(){
        return capacity;
    }
    
    public int getAmount()
    {
        return 20;
    }
    
    public boolean getStat(){
        return status;
    }
    
    public void setStat(boolean status){
        this.status= status;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }
}
