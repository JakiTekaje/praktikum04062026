/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum04062026;

/**
 *
 * @author Jaki
 */
public abstract class AlatMusik {
    protected String nama;
    protected String jenis;

    public AlatMusik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void info(){
        System.out.println("Nama Alat Musik : "+nama+" Jenis = "+jenis);
    }
    
    //contoh method polymormorphism
    public abstract void mainkan();  
    public abstract void stem();
}
