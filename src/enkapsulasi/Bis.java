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
public class Bis {
    public int penumpang;
    public int maxPenumpang;
    
    public Bis(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang =0;
    }
    
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp >= maxPenumpang){
            System.out.println("Penumpang Melebihi Kuota");
        }else {
            this.penumpang = temp;
        }
    }
    
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah"+penumpang);
        System.out.println("Penumpang maximum adalah "+maxPenumpang);
    }
}
