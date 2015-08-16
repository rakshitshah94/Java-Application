/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Emp_array;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Emp_main {
    public static void main(String[] args) {
        Sell s[]=new Sell[3];
        Prod p[]=new Prod[3];
        int sc=0,pc=0,et;
        double ts,bs;
//        System.out.println("Enter the no. of employes:");
        Scanner inp=new Scanner(System.in);
//        int n=inp.nextInt();
        for(int i=0;i<3;i++){
            System.out.print("Enter the basic salary:");
            bs=inp.nextDouble();
            System.out.print("Enter the employee type(0/1):");
            et=inp.nextInt();
            if(et==0){
                s[i]=new Sell();
                System.out.print("Enter the actual sells:");
                double sa=inp.nextDouble();
                System.out.print("Enter the target sells:");
                double st=inp.nextDouble();
                s[sc].setData(bs, sa, st);
                sc++;
                }
            else if(et==1){
                p[i]=new Prod();
                System.out.print("Enter the actual prod:");
                double pa=inp.nextDouble();
                System.out.print("Enter the target prod:");
                double pt=inp.nextDouble();
                p[pc].setData(bs, pa, pt);
                pc++;
               }
            else
            {
                System.out.println("Invalid choice:");
            }
        }
        for(int i=0;i<sc;i++){
            ts=s[i].calTS();
            System.out.println("Total salary of sell emp:"+ts);
        }
        for(int i=0;i<pc;i++){
             ts=p[i].calTS();
            System.out.println("Total salary of sell emp:"+ts);
        }
      }
   }
