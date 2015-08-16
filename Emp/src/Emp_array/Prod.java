/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Emp_array;

/**
 *
 * @author admin
 */
public class Prod extends Emp {
  private double pa,pt;
  void setData(double _bs,double _pa,double _pt){
   bs=_bs;
   pa=_pa;
   pt=_pt;
  }
  double calBS(){
   if((pt-pa)>0){
    return((pt-pa)*50);
   }
   else{
    return 0;
   }
  }
  double calTS(){
   return(calFS()+calBS());
  }
}
