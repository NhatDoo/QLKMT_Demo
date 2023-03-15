
package qlmttest;

import java.io.Serializable;
import java.util.Date;


public class PC1 implements Serializable
{
    public String tenmt,tttk,sl;
    public String mmt;
    public Date ngay;
    
    public String dienten()
    {
        return tenmt;
    }
    public void luuten(String tenmt)
    {
        this.tenmt = tenmt;
    
    }
    public String diensl()
    {
        return sl;
    }
    public void luusl(String sl)
    {
       this.sl =sl;
    }
    public String dientttk()
    {
        return tttk;
    }
    public void luutttk(String tttk)
    {
       this.tttk = tttk;
    }
    public String dienmmt()
    {
        return mmt;
    }
    public void luummt(String mmt)
    {
       this.mmt=mmt;
    }
    public Date dienngay()
    {
       return ngay;
    }
    public void luungay (Date ngay)
    {
      this.ngay=ngay;
    }
   
   
}
