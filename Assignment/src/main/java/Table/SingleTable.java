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
public  class SingleTable extends TableSize{
    int amount,id;
    boolean status;
    
    public SingleTable( int capacity, int amount,int id, boolean status) {
        super( capacity);
        this.amount=amount;
        this.status=status;
        this.id=id;
    }

    @Override
    public void setSize(String type) {
        this.type="Single";
    }

    @Override
    public void setCap(int capacity) {
        this.capacity=1;
    }
    
    public void setAmount(int amount)
    {
        this.amount=30;
    }
    
    @Override
    public String getType(){
        return "Single";
    }
    
    @Override
    public int getCap(){
        return 1;
    }
    
    public int getAmount()
    {
        return 30;
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
