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
public class Barang 
{
    private int id_barang;
    private String nama_barang;
    private int harga_barang;
    private String merk_barang;
    private String jumlah_barang;
    
    public Barang (String nama_barang,String merk_barang,int id_barang, int harga_barang)
    {
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.harga_barang = harga_barang;
        this.merk_barang = merk_barang;
    }
    //metode
    public void info ()
    {
        System.out.println("Id Barang:"+this.id_barang);
        System.out.println("Nama Barang:"+this.nama_barang);
        System.out.println("Harga Barang:"+this.harga_barang);
        System.out.println("Merk Barang:"+this.merk_barang);
    }
}
