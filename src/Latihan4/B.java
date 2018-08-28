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
public class B extends A
{
    private int b;
    private int d;
    public void setB (int nilai)
    {
        b = nilai;
    }
    public int getB ()
    {
        return b;
    }

    public void setD(int nilai) {
        this.d = nilai;
    }

    public int getD() {
        return d;
    }
    
    public void tampilkanNilai()
    {
        super.tampilkanNilai();
        System.out.println("Nilai b : "+getB());
        
    }
    public void tampilkanNilaiD()
    {
        System.out.println("Nilai D: "+getD());
    }
    public void total(){
    System.out.println("Total : "+(getA()+getB()+getC()+getD()));
}
    
}
