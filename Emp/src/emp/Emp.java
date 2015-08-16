/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Emp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sell_Prod o=new Sell_Prod();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the basic salary:");
        double bs=s.nextDouble();
        System.out.println("Enter the employee type:");
        double et=s.nextDouble();
        System.out.println("Enter the actual sales:");
        double sa=s.nextDouble();
        System.out.println("Enter the target sales:");
        double st=s.nextDouble();
        System.out.println("Enter the actual prod:");
        double pa=s.nextDouble();
        System.out.println("Enter the target prod:");
        double pt=s.nextDouble();
        o.setData(bs, st, sa, pt, pa, et);
        double ts=o.calTS();
        System.out.println("Target Salary:"+ts);
    }
}
