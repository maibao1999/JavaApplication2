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
public class Dia {
    private String madia;
    private Tieude matieude;
    private String trangthai;

    public Dia(String madia) {
        this.madia = madia;
    }

    public Dia() {
    }

    public Dia(String madia, Tieude matieude, String trangthai) {
        this.madia = madia;
        this.matieude = matieude;
        this.trangthai = trangthai;
    }

    public String getMadia() {
        return madia;
    }

    public void setMadia(String madia) {
        this.madia = madia;
    }

    public Tieude getMatieude() {
        return matieude;
    }

    public void setMatieude(Tieude matieude) {
        this.matieude = matieude;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "Dia{" + "madia=" + madia + ", matieude=" + matieude + ", trangthai=" + trangthai + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Dia other = (Dia) obj;
        if (!Objects.equals(this.madia, other.madia)) {
            return false;
        }
        return true;
    }
    
    
}
