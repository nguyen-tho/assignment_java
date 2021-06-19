/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import Dish.OrderDish;
import static Dish.OrderDish.chooseLarge;
import static Dish.OrderDish.chooseSmall;
import static Dish.OrderDish.chooseSpecial;
import Employee.*;
import Menu.*;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Bill {
    static String id;
    static staff s[];
    static waiter w[];
    static DateTime datetime;
    static SmallBowl b1=new SmallBowl();
    static LargeBowl b2= new LargeBowl();
    static SpecialBowl b3= new SpecialBowl();
    
    public static int SmallPrice(int qty)
    {
        return qty*b1.getPrice();
    }
    
    public static int LargePrice(int qty){
        return qty*b2.getPrice();
    }
    
    public static int SpecialPrice(int qty){
        return qty*b3.getPrice();
    }
    
    public static int ExtraPrice(String name,int qty)
    {
        Extra [] dish;
        dish = new Extra[7];
        dish[1]=new Extra("Banh quay", "cai", 5);
        dish[2]=new Extra("Trung ga", "cai", 5);
        dish[3]=new Extra("Banh pho them", "phan", 15);
        dish[4]=new Extra("Tiet", "chen", 10);
        dish[5]=new Extra("Tiet trung", "chen", 15);
        dish[6]=new Extra("Thit them","chen", 15);
        int cash=0;
        for(int i=1;i<dish.length;i++)
        {
            if(name.equalsIgnoreCase(dish[i].getName()))
                cash=qty*dish[i].getPrice();
        }
        return cash;
    }
    
    public static String WaiterName(String id)
    {
        Scanner sc= new Scanner(System.in);
        String name=null;
        
        w= new waiter[3];
        w[0]=new waiter("W001", "Nguyen Van D");
        w[1]=new waiter("W002", "Nguyen Van E");
        w[2]=new waiter("W001", "Nguyen Van F");
        
        for(int i=0;i<w.length;i++)
        {
            if(w[i].id.equalsIgnoreCase(id))
            name=w[i].name;
        }
        return name;
    }
    
    public static String StaffName(String id)
    {
       String name=null;
        
        s= new staff[3];
        s[0]=new staff("S001", "Nguyen Van A");
        s[1]=new staff("S002", "Nguyen Van B");
        s[2]=new staff("S003", "Nguyen Van c");
        
        for(int i=0;i<s.length;i++)
        {
            if(s[i].id.equalsIgnoreCase(id))
            name=s[i].name;
        }
        return name;
    }
    
    public static int total()
    {
        return SmallPrice(OrderDish.amountSmall()) + 
                LargePrice(OrderDish.amountLarge())+
                SpecialPrice(OrderDish.amountSpecial())+
                OrderDish.totalExtraPrice();
    }
    
    public static void BillInfo()
    {
        
        int d,m,y,hr,mi;
        
        String id1, id2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ma hoa don: ");
        id=sc.nextLine();
        
        System.out.println("Nhap ID nhan vien thu ngan: ");
        id1=sc.nextLine();
        
        System.out.println("Nhap ID nhan vien phuc vu: ");
        id2=sc.nextLine();
        
        System.out.println("Nhap ngay xuat hoa don theo trinh tu d/m/y hr:mi");
        d=sc.nextInt();
        m=sc.nextInt();
        y=sc.nextInt();
        hr=sc.nextInt();
        mi=sc.nextInt();
        
        datetime= new DateTime(d, m, y, hr, mi);
 
        System.out.println("Nhan vien phuc vu: "+StaffName(id1));
        System.out.println("Nhan vien phuc vu: "+WaiterName(id2));
        System.out.println("Ngay xuat hoa don: "+ datetime.toString());
        System.out.println("---------------------------------------------------");
        
    }
    public static void cash() {
        
        OrderDish.chooseDishes();
        System.out.println("So to nho "+OrderDish.amountSmall()+" to"+" Don gia: "+b1.getPrice()*1000+" Thanh tien: "+SmallPrice(OrderDish.amountSmall())+" (nghin dong)");
        System.out.println("So to lon "+OrderDish. amountLarge()+" to"+" Don gia: "+b2.getPrice()*1000+" Thanh tien: "+LargePrice(OrderDish.amountLarge())+" (nghin dong)");
        System.out.println("So to dac biet "+OrderDish.amountSpecial()+" to"+ " Don gia: "+b3.getPrice()*1000 +" Thanh tien: "+SpecialPrice(OrderDish.amountLarge())+" (nghin dong)");
        System.out.println("Tong tien mon them: "+ OrderDish.totalExtraPrice() +" (nghin dong)");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Xin moi thanh toan");
        System.out.println("Tong tien cua quy khach la: "+total()+" (nghin dong)");
    }
    
    public static void purchaseMethod() {
        Scanner sc= new Scanner(System.in);
        int choose;
        System.out.println("Quy khach muon thanh toan nhu the nao");
        System.out.println("1. Bang tien mat\n2. Bang the\n3. Bang vi dien tu");
        choose=sc.nextInt();
        switch(choose)
        {
            case 1:
            {
                System.out.println("Thanh toan bang tien mat");
                System.out.println("Thanh toan thanh cong");
                break;
            }
            
            case 2:
            {
                System.out.println("Thanh toan bang the");
                System.out.println("Thanh toan thanh cong");
                break;
            }
            
            case 3:
            {
                System.out.println("Thanh toan bang vi dien tu");
                System.out.println("Thanh toan thanh cong");
                break;
            }
            
            default: break;
        }
    }
}
