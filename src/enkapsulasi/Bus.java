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
public class Bus {
    public int penumpang;
    public int maxPenumpang;
    
    
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah"+penumpang);
        System.out.println("Penumpang maximum adalah "+maxPenumpang);
    }
}
