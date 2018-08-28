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
public class Transaksi extends Pembeli
{
    public int total;
    public int jumlah_barang;
    public Transaksi (String nama_barang,String merk_barang,int id_barang, int harga_barang,String nama_pembeli,String alamat,String no_telp,int id_pembeli, String jumlah_barang)
    {
        super(nama_barang,merk_barang,id_barang,harga_barang,nama_pembeli,alamat,no_telp,id_pembeli,jumlah_barang);
    }

    public void cetak()
    {
        super.info();
        System.out.println("Total Harga: "+this.total);
        System.out.println("Jumlah Barang: "+this.jumlah_barang);
    }

    public int getTotal() {
        return total;
    }

    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }
    
    public static void main(String[]args)
    {
        System.out.println("Data Pembelian Barang: ");
        Transaksi a = new Transaksi("Coklat","Silver Queen",2, 15000,"Nanda", "Lesanpuro", "0895333801170" , 112, "1");
        a.setJumlah_barang(4);
        a.setTotal(60000);
        a.cetak();
    }
}