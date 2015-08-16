/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package emp_sell_prod;

/**
 *
 * @author admin
 */
public class Sell {
     private double bs,st,sa;
    void setData(double _bs,double _st,double _sa)
    { 
        bs=_bs;
        st=_st;
        sa=_sa;
    }
    double CalFS(){
        return(bs+(bs*0.4)+(bs*0.1));
    }
    double CalBS(){
     if((sa-st)>0){
             return((sa-st)*1000);
            }
            else{
                return 0;
            }
    }
    double CalTS(){
    return(CalFS()+CalBS());
    }
}
