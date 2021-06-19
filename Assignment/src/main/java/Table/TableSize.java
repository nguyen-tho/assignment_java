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
abstract class TableSize {
    String type;
    int capacity;

    public TableSize(String type, int capacity) {
        this.type=type;
        this.capacity=capacity;
    }
    
    public TableSize(int capacity)
    {
        this.capacity=capacity;
    }
    
    public abstract void setSize(String type);
        
    public abstract void setCap(int capacity);
    
    public String getType(){
        return type;
    }
    
    public int getCap(){
        return capacity;
    }
}

