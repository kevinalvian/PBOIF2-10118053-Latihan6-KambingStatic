/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118053.latihan6.kambingstatic;

/**
 *
 * @author 
 * NAMA : Kevin Alvian
 * KELAS : IF2
 * NIM : 10118053
 */
public class PBOIF210118053Latihan6KambingStatic {

    /**
     * @param args the command line arguments
     */
    // Variabel jumlahKambing dideklarisasikan sebagai statik
    public static int jumlahKambing;


public class KambingStatic {
    
    //NAMA_KAMBING sebagai konstanta
      public static final String NAMA_KAMBING = "MIDUN";
}
    public static void main(String[] args) {
        // TODO code application logic here
         PBOIF210118053Latihan6KambingStatic.jumlahKambing = 485000;
        String NAMA_KAMBING = "Midun";
          System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                             + PBOIF210118053Latihan6KambingStatic.jumlahKambing);

    }
    
}
