/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class TableBooking {
   static int id;
   public static void Single(int id)
   {
       
       Scanner sc= new Scanner(System.in);
       
       SingleTable table1= new SingleTable( 1,id, 30, true);
       if(id>30 || table1.status==false)
           System.out.println("Dat cho that bai!");
       for(int i=1; i<=30; i++)
       {
           if(i==id && table1.status==true)
           {
               
               table1.status=false;
               
               break;
           }
           else
           {
               i++;
           }
       }       
   }
   
   public static void Group(int id){
       int  capacity;
       Scanner sc= new Scanner(System.in);
       System.out.println("Nhap so luong cho ngoi quy khach can");
       capacity=sc.nextInt();
       GroupTable table2= new GroupTable( capacity,id, 20, true);
       
       if(id>51 ||id<30 || table2.status==false)
           System.out.println("Dat cho that bai!");
       for(int i=31; i<=50; i++)
       {
           if(i==id && table2.status==true)
           {
               System.out.println("Dat cho thanh cong!");
               table2.status=false;
     
               break;
           }
           else
           {
               i++;
           }
       } 
   }

    public static int bookedID() {
          return id;
    }
   
   
   
   
    public static void booking() {
       int choose;
       Scanner sc= new Scanner(System.in);
        System.out.println("Quy khach ngoi loai ban nao? ");
        System.out.println("1. Ban don\n2. Ban nhom");
        choose=sc.nextInt();
        id=bookedID();
        switch(choose)
        {
            case 1:
            {
                
                System.out.println("Nhap ID ban\n Nhap tu 1 den 30");
                id= sc.nextInt();
                Single(id);
                System.out.println("Dat cho thanh cong!");
                System.out.println("Ban cua quy khach la ban so "+ id);
                break;
            }
            
            case 2:
            {
                System.out.println("Nhap ID ban\n Nhap tu 31 den 50");
                id= sc.nextInt();
                Group(id);
                break;
            }
            
            default:
            {
                System.out.println("Khong hop le");
                System.out.println("Dat cho thanh cong!");
                System.out.println("Ban cua quy khach la ban so "+ id);
                break;
            }
        }
    }
    
    public static String convert(boolean status)
    {
        if(status== true)
            return ("Con trong");
        else
            return ("Da co khach");
    }
    
    public static void manageStatus(){
        boolean stat;
        for(int i=1; i<=50;i++)
        {
            if(bookedID()==i)
                stat=false;
            else
                stat=true;
            
            System.out.println("Ban: "+i+" Trang thai: "+ convert(stat));
        }
    } 
}
