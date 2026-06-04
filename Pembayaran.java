/*
Nama    : Ahmad Zaky, NIM  : 2501082008
Desk    : 
 */
package praktikum21052026;

/**
 *
 * @author Jaki
 */
public abstract class Pembayaran {
    protected double jumlahBayar;
    protected String idTransaksi;
    
    public Pembayaran() {
        
    }

    public Pembayaran(double jumlahBayar, String idTransaksi) {
        this.jumlahBayar = jumlahBayar;
        this.idTransaksi = idTransaksi;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }
    
    //konsep polymorphism
    public abstract void prosesPembayaran();
    
    
    
}