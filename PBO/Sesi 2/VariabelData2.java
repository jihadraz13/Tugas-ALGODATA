/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variabeldata2;

/**
 *
 * @author jihad
 */
public class VariabelData2 {
    public static void main(String args[]){
         
    int a = 100;
    int b = 20;
    int c = 528; 
    int d = 70;
    int e = 256; 
    int f = 3;
    int g = 128; 
    int h = 5;
    int i = 600; 
    int j = 4;
    int k = 423;  
    int l = 2;
    int hasil;
      
    hasil = a & b;
    System.out.println("Hasil perhitungan dari a & b = " + hasil );  
    System.out.println("--------------------------------");
    
    hasil = c | d;
    System.out.println("Hasil perhitungan dari c | d = " + hasil );
    System.out.println("--------------------------------");
      
    hasil = e >> f;
    System.out.println("Hasil perhitungan dari a >> 1 = " + hasil );
    System.out.println("--------------------------------");
      
    hasil = g << h;
    System.out.println("Hasil perhitungan dari b << 2 = " + hasil );
    System.out.println("--------------------------------");
       
    hasil = i >> j;
    System.out.println("Hasil perhitungan dari a >> 1 = " + hasil );  
    System.out.println("--------------------------------");
      
    hasil = k << l;
    System.out.println("Hasil perhitungan dari b << 2 = " + hasil );
    System.out.println("--------------------------------");
  }
}   