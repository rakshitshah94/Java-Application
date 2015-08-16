/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Emp_inherit;

import java.util.Scanner;

/**
 *
 * @author admin
 * 
 */
public class Emp_main {
    public static void main(String[] args) {
        Sell s=new Sell();
        Prod p=new Prod();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Basic salary:");
        double bs=sc.nextDouble();
        System.out.println("Enter the employee type(0/1):");
        double et=sc.nextDouble();
        if(et==0){
            System.out.println("Enter the actual sales:");
            double sa=sc.nextDouble();
            System.out.println("Enter the target sales:");
            double st=sc.nextDouble();
            s.setData(bs,sa,st);
            double ts=s.calTS();
            System.out.println("Total salary of sales employee:"+ts);
        }
        else if(et==1){
            System.out.println("Enter the actual prod:");
            double pa=sc.nextDouble();
            System.out.println("Enter the target prod:");
            double pt=sc.nextDouble();
            p.setData(bs,pt,pa);
            double ts1=p.calTS();
            System.out.println("Total salary of prod employee:"+ts1);
        
        }
         else{
            System.out.println("Jo Baka!!Invalid choice!!!");
        }
  }
}