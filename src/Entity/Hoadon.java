/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Thanh Nhan
 */
public class Hoadon {
    private String mahoadon;
     private Khachhang makhachhang;
    private Date ngaylaphd;

    public Hoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public Hoadon() {
    }

    public Hoadon(String mahoadon, Khachhang makhachhang, Date ngaylaphd) {
        this.mahoadon = mahoadon;
        this.makhachhang = makhachhang;
        this.ngaylaphd = ngaylaphd;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public Khachhang getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(Khachhang makhachhang) {
        this.makhachhang = makhachhang;
    }

    public Date getNgaylaphd() {
        return ngaylaphd;
    }

    public void setNgaylaphd(Date ngaylaphd) {
        this.ngaylaphd = ngaylaphd;
    }

    @Override
    public String toString() {
        return "Hoadon{" + "mahoadon=" + mahoadon + ", makhachhang=" + makhachhang + ", ngaylaphd=" + ngaylaphd + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.mahoadon);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hoadon other = (Hoadon) obj;
        if (!Objects.equals(this.mahoadon, other.mahoadon)) {
            return false;
        }
        return true;
    }
   
}
