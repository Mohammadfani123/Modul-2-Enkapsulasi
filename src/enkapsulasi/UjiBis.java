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
public class UjiBis {
    public static void main(String[] args){
        Bis bisBesar = new Bis(40);
        bisBesar.cetak();
        
        bisBesar.addPenumpang(15);
        bisBesar.cetak();
        
        bisBesar.addPenumpang(5);
        bisBesar.cetak();
        
        bisBesar.addPenumpang(26);
        bisBesar.cetak();
    }
}
