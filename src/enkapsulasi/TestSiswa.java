/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author Windows 10
 */
public class TestSiswa {
    public static void main(String args[]){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian");
        siswa.setAge(23);
        siswa.getAddress("Malang");
        
        System.out.println("Namae :" + siswa.getName());
        System.err.println( " Absen : " + siswa.getAbsen());
        System.out.println(" Address : " + siswa.getAddress());
    }
    
    
}
