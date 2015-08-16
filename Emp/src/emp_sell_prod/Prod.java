/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package emp_sell_prod;

/**
 *
 * @author admin
 */
public class Prod {
    private double bs,pt,pa;
    void setData(double _bs,double _pt,double _pa)
    { 
        bs=_bs;
        pt=_pt;
        pa=_pa;
    }
    double CalFS(){
        return(bs+(bs*0.4)+(bs*0.1));
    }
    double CalBS(){
    if((pt-pa)>0){
            return((pt-pa)*50);
            }
            else{
            return 0;
            }
    }
    double CalTS(){
    return(CalFS()+CalBS());
    }
}
