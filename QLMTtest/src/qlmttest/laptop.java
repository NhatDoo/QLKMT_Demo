
package qlmttest;

import java.io.Serializable;
import java.util.Date;

public class laptop implements Serializable
{
    public String tenlaptop;
    public String hanglaptop;
    public String malaptop;
    public String sl;
    public Date ngaynhap;

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getTenlaptop() {
        return tenlaptop;
    }

    public void setTenlaptop(String tenlaptop) {
        this.tenlaptop = tenlaptop;
    }

    public String getHanglaptop() {
        return hanglaptop;
    }

    public void setHanglaptop(String hanglaptop) {
        this.hanglaptop = hanglaptop;
    }

    public String getMalaptop() {
        return malaptop;
    }

    public void setMalaptop(String malaptop) {
        this.malaptop = malaptop;
    }

    public String getSl() {
        return sl;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }

   
}
