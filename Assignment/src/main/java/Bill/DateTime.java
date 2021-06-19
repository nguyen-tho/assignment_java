/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

/**
 *
 * @author MyPC
 */
public class DateTime {
    int day;
    int month;
    int year; 
    int hour;
    int minute;
    
    public DateTime(int day, int month, int year, int hour, int minute)
    {
        this.day=day;
        this.month=month;
        this.year=year;
        this.hour=hour;
        this.minute=minute;
    }
    
    public int getDay()
    {
        return day;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getYear(){
        return year;
    }
    
    public int getHour()
    {
        return hour;
    }
    
    public int getMinute()
    {
        return minute;
    }
    
    @Override
    public String toString()
    {
        return String.format("%02d/%02d/%4d  %02d:%02d", day, month, year, hour, minute );
    }
    
    public void setDay(int day)
    {
        this.day=day;
    }
    
    public void setMonth(int month)
    {
        this.month=month;
    }
    
    public void setYear(int year)
    {
        this.year=year;
    }
    
    public void setHour(int hour)
    {
        this.hour=hour;
    }
    
    public void setMinute(int minute)
    {
        this.minute=minute;
    }
}
