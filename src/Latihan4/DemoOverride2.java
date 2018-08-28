/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author WINDOWS
 */
public class DemoOverride2 
{
    public static void main (String[] args)
    {
        B obj = new B();
    
     
        obj.setA(50);
        obj.setB(150);
        obj.setC(200);
        obj.setD(100);
        obj.tampilkanNilai();
        obj.tampilkanNilaic();
        obj.tampilkanNilaiD();
        obj.total();
    }
}
