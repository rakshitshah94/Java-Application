/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Emp_array;

/**
 *
 * @author admin
 */
public class Sell extends Emp{
    private double sa,st;
    void setData(double _bs,double _sa,double _st){
     bs=_bs;
     sa=_sa;
     st=_st;
    }
    double calBS(){
       if((sa-st)>0){
        return((sa-st)*1000);
       }
       else{
        return 0;
       }
    }
    double calTS(){
        return(calFS()+calBS());
    }
}
