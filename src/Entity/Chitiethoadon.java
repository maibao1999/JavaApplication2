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
public class Chitiethoadon {
    private Dia madia;
    private Hoadon mahoadon;
    private double dongiathue;

    public Chitiethoadon(Dia madia, Hoadon mahoadon, double dongiathue) {
        this.madia = madia;
        this.mahoadon = mahoadon;
        this.dongiathue = dongiathue;
    }

    public Chitiethoadon() {
    }

    public Dia getMadia() {
        return madia;
    }

    public void setMadia(Dia madia) {
        this.madia = madia;
    }

    public Hoadon getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(Hoadon mahoadon) {
        this.mahoadon = mahoadon;
    }

    public double getDongiathue() {
        return dongiathue;
    }

    public void setDongiathue(double dongiathue) {
        this.dongiathue = dongiathue;
    }

    @Override
    public String toString() {
        return "Chitiethoadon{" + "madia=" + madia + ", mahoadon=" + mahoadon + ", dongiathue=" + dongiathue + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.madia);
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
        final Chitiethoadon other = (Chitiethoadon) obj;
        if (!Objects.equals(this.madia, other.madia)) {
            return false;
        }
        return true;
    }
    
    
}
