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
public class A 
{
    private int a;
    private int c;
    public void setA (int nilai)
    {
        a = nilai;
    }
    public int getA()
    {
        return a;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }
    public void tampilkanNilai()
    {
        System.out.println("Nilai a : "+getA());
    }
    public void tampilkanNilaic(){
        System.out.println("Nilai c : "+getC());
    }
}
