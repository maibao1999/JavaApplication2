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
public class Tieude {
    private String matieude;
    private String tentieude;
    private int soluong;
    private String trangthai;
    private double dongiathue;
    private Loai maloai;

    public Tieude(String matieude) {
        this.matieude = matieude;
    }

    public Tieude(String matieude, String tentieude, int soluong, String trangthai, double dongiathue, Loai maloai) {
        this.matieude = matieude;
        this.tentieude = tentieude;
        this.soluong = soluong;
        this.trangthai = trangthai;
        this.dongiathue = dongiathue;
        this.maloai = maloai;
    }

    public Tieude() {
    }

    public String getMatieude() {
        return matieude;
    }

    public void setMatieude(String matieude) {
        this.matieude = matieude;
    }

    public String getTentieude() {
        return tentieude;
    }

    public void setTentieude(String tentieude) {
        this.tentieude = tentieude;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public double getDongiathue() {
        return dongiathue;
    }

    public void setDongiathue(double dongiathue) {
        this.dongiathue = dongiathue;
    }

    public Loai getMaloai() {
        return maloai;
    }

    public void setMaloai(Loai maloai) {
        this.maloai = maloai;
    }

    @Override
    public String toString() {
        return "Tieude{" + "matieude=" + matieude + ", tentieude=" + tentieude + ", soluong=" + soluong + ", trangthai=" + trangthai + ", dongiathue=" + dongiathue + ", maloai=" + maloai + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.matieude);
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
        final Tieude other = (Tieude) obj;
        if (!Objects.equals(this.matieude, other.matieude)) {
            return false;
        }
        return true;
    }
    
    
}
