/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

/**
 *
 * @author admin
 */
public class Sell_Prod {
    private double bs,st,sa,pt,pa,et;
    void setData(double _bs,double _st,double _sa,double _pt,double _pa,double _et)
    { 
        bs=_bs;
        st=_st;
        sa=_sa;
        pt=_pt;
        pa=_pa;
        et=_et;
    }
    double CalFS(){
        return(bs+(bs*0.4)+(bs*0.1));
    }
    double CalBS(){
        if(et==0)
        {
            if((sa-st)>0){
             return((sa-st)*1000);
            }
            else{
                return 0;
            }
        }
        else if(et==1){
            if((pt-pa)>0){
            return((pt-pa)*50);
            }
            else{
            return 0;
            }
        }
        else{
           return 0;
        }
    }

double calTS(){
    return(CalBS()+CalFS());
}

}


