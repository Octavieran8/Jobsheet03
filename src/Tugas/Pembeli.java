/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author WINDOWS
 */
public class Pembeli extends Barang 
{
    private int id_pembeli;
    private String nama_pembeli;
    private String alamat;
    private String no_telp;
    private int total;
    
    public Pembeli (String nama_barang,String merk_barang,int id_barang, int harga_barang,String nama_pembeli,String alamat,String no_telp,int id_pembeli, String jumlah_barang)
    {
        
        super(nama_barang,merk_barang,id_barang, harga_barang);
        this.id_pembeli = id_pembeli;
        this.nama_pembeli = nama_pembeli;
        this.alamat = alamat;
        this.no_telp = no_telp;
    }
    //metode
    public void info ()
    {
        System.out.println("Id Pembeli:"+this.id_pembeli);
        System.out.println("Nama Pembeli:"+this.nama_pembeli);
        System.out.println("Alamat:"+this.alamat);
        System.out.println("No Telepon:"+this.no_telp);
        super.info();
    }
}
