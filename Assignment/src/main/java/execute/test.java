/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execute;

/**
 *
 * @author MyPC
 */
import Table.*;
import Menu.*;
import Dish.*;
import Bill.Bill;
import java.util.Scanner;

public class test {
    public static void main(String agrs[]){
        int ch;
        System.out.println("--------------------------MENU--------------------------------");
        System.out.println("Xin chon thao tac");
        System.out.println("1. Dat ban\n2. Chon mon va tinh tien\n3. Kiem tra tinh trang ban");
        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();
        do
        {
            switch(ch)
            {
            
                case 0: break;
                case 1: 
                {
                    System.out.println("Bat dau chon ban");
                    TableBooking.booking();
                    break;
                }
                case 2: 
                {
                    System.out.println("Chon mon va in hoa don");
                                                           
                    Bill.BillInfo();// Nhap thong tin cua hoa don( ma hoa don, phuc vu, thu ngan, ngay xuat hoa don
                    
                    Bill.cash();// Chon mon va tinh tong so tien 

                    Bill.purchaseMethod();//yeu cau phuong thuc thanh toan
                    
                    
                    break;
                }
                
                case 3:
                {
                    TableBooking.manageStatus();
                    break;
                }
            }
            System.out.println("Ban muon tiep tuc thao tac khac ?");
            ch=sc.nextInt();
        }while(ch>=0&& 4>=ch);
    }
}
