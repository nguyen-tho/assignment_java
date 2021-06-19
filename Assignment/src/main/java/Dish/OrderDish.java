/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dish;

import Bill.Bill;
import java.util.Scanner;
import Menu.*;
/**
 *
 * @author MyPC
 */
public class OrderDish {
    static meat[] meats;
    static Extra [] dish;
    static Bill b;
    static int q1=0, q2=0, q3=0,qe=0, qty;
    
    static SmallBowl b1=new SmallBowl();
    static LargeBowl b2= new LargeBowl();
    static SpecialBowl b3= new SpecialBowl();

    public static void MeatChoose(int choose2) {
        meats= new meat[30];
        meats[0]=new meat("Tai");
        meats[1]=new meat("Nam");
        meats[2]=new meat("Gau");
        meats[3]=new meat("Gan");
        meats[4]=new meat("Vien");
        meats[5]=new meat("Tai, Nam");
        meats[6]=new meat("Tai, Gau");
        meats[7]=new meat("Tai, Gan");
        meats[8]=new meat("Tai, Vien");
        meats[9]=new meat("Nam, Gau");
        meats[10]=new meat("Nam, Gan");
        meats[11]=new meat("Nam, Vien");
        meats[12]=new meat("Gau, Gan");
        meats[13]=new meat("Gau, Vien");
        meats[14]=new meat("Gan, Vien");
        meats[15]=new meat("Tai, Nam, Gau");
        meats[16]=new meat("Tai, Nam, Gan");
        meats[17]=new meat("Tai, Nam, Vien");
        meats[18]=new meat("Nam, Gau, Gan");
        meats[19]=new meat("Nam, Gau, Vien");
        meats[20]=new meat("Gau, Gan, Vien");
        meats[21]=new meat("Tai, Gau, Gan");
        meats[22]=new meat("Tai, Gau, Vien");
        meats[23]=new meat("Tai, Gan, Vien");
        meats[24]=new meat("Nam, Gan, Vien");
        meats[25]=new meat("Tai, Nam, Gau, Gan");
        meats[26]=new meat("Tai, Nam, Gau, Vien");
        meats[27]=new meat("Tai, Gau, Gan, Vien");
        meats[28]=new meat("Nam, Gau, Gan, Vien");
        meats[29]=new meat("Tai, Nam, Gan, Vien");
        
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<meats.length;i++){
            if(i==choose2)
            {
                System.out.print(meats[i].getMeatName());
            }
        }
    }
    
    public static void chooseSmall()
    {
        int chooseM;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Chon tu 0 den 14");
                chooseM=sc.nextInt();
               while(chooseM<0 || chooseM>14){
                  System.out.println("Khong hop le. Xin Nhap lại: ");
                  chooseM=sc.nextInt();
                }
               System.out.println("Dat mon thanh cong");
               MeatChoose(chooseM);
               System.out.println(" (To nho)");
    }
    
    public static void chooseLarge()
    {
        int chooseM;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Chọn từ 0 den 24");
                chooseM=sc.nextInt();
               while(chooseM<0 || chooseM>24){
                  System.out.println("Khong hop le. Xin Nhap lại: ");
                  chooseM=sc.nextInt();
                }
               System.out.println("Dat mon thanh cong");
               MeatChoose(chooseM);
               System.out.println(" (To lon)");
    }
    
    public static void chooseSpecial()
    {
        int chooseM;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Chon tu 0 den 29");
                chooseM=sc.nextInt();
               while(chooseM<0 || chooseM>29){
                  System.out.println("Khong hop le. Xin Nhap lại: ");
                  chooseM=sc.nextInt();
                }
               System.out.println("Dat mon thanh cong");
               MeatChoose(chooseM);
               System.out.println(" (To dac biet)");
    }
    
     public static void chooseExtra(){
        int qty, choose3;
        Extra [] dish;
        dish = new Extra[7];
        dish[1]=new Extra("Banh quay", "cai", 5);
        dish[2]=new Extra("Trung ga", "cai", 5);
        dish[3]=new Extra("Banh pho them", "phan", 15);
        dish[4]=new Extra("Tiet", "chen", 10);
        dish[5]=new Extra("Tiet trung", "chen", 15);
        dish[6]=new Extra("Thit them","chen", 15);
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap món ăn");
        choose3=sc.nextInt();
        while(choose3 <0|| choose3 >6 )
        {
           System.out.println("Không có trong thực đơn. Xin Nhap lại !");
           choose3=sc.nextInt();
        }
            
        do{
            System.out.println("Nhap so luong");
            qty=sc.nextInt();
            if(choose3==0)break;
            else
               for(int i=1; i<dish.length;i++)
        {
            if(choose3==i)
                System.out.println(dish[i].getName()+ " so luong: "+qty+" "+ dish[i].getUnit()+ " Don gia: "+dish[i].getPrice()+" (nghin dong)");  
        }
        qe=qe+Bill.ExtraPrice(dish[choose3].getName(), qty);
            
            System.out.println("Ban co muon dung them mon khac khong?");
            choose3=sc.nextInt();
        }while(choose3>=0 && choose3<=6);        
}
 
    public static void chooseDishes()
    {
        int choose;
         SmallBowl b1=new SmallBowl();
         LargeBowl b2= new LargeBowl();
         SpecialBowl b3= new SpecialBowl();
         Scanner sc= new Scanner(System.in);
        System.out.println("Xin chon thuc don. Chung toi dang ghi nhan va phuc vu ");
        System.out.println("1. To nho\n2. To lon\n3. To dac biet\n4. Mon them");
        choose=sc.nextInt();
        
        while(choose <1 || choose>4)
        {
            System.out.println("Khong hop le. Xin nhap lai!");
            choose=sc.nextInt();            
        }
        
        do{
            switch(choose)
            {
                case 1: 
                {
                    q1++;                    
                    chooseSmall();
                    
                    break;
                }
                
                case 2:
                {
                    q2++;                    
                    chooseLarge();
                    break;
                }
                
                case 3:
                {
                    q3++;
                    chooseSpecial();
                    break;
                }
                case 4:
                {
                    chooseExtra();
                }
                
                default:  break;
            }
            System.out.println("Ban muon chon them khong?");
            choose=sc.nextInt();
        }while(choose<=4 && choose>=1);           
    }
        
    
    public static int amountSmall()
    {
        return q1;
    }
    
    public static int amountLarge()
    {
        return q2;
    }
    
    public static int amountSpecial()
    {
        return q3;
    }
    
    public static int totalExtraPrice(){
        return qe;
    }
}

