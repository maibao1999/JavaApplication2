/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Objects;

/**
 *
 * @author Thanh Nhan
 */
public class Khachhang {
    private String makh;
    private String tenkh;
    private String sdt;
    private String diachi;

    public Khachhang() {
    }

    public Khachhang(String makh) {
        this.makh = makh;
    }

    public Khachhang(String makh, String tenkh, String sdt, String diachi) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "Khachhang{" + "makh=" + makh + ", tenkh=" + tenkh + ", sdt=" + sdt + ", diachi=" + diachi + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.makh);
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
        final Khachhang other = (Khachhang) obj;
        if (!Objects.equals(this.makh, other.makh)) {
            return false;
        }
        return true;
    }
    
    
}
