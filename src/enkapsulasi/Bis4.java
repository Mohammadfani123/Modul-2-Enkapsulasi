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
public class Bis4 {
    public double penumpang;
    public double maxpenumpang;
    public double counter;
    public double penumpangbaru;
    
    public Bis4(double penumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
//method mutator
public void addpenumpang(double penumpang){
    double temp;
    temp = this.penumpang+penumpang;
    if (temp > maxpenumpang) {
        System.out.println("Penumpang melebihi batas kuota");
    }else {
        this.penumpang = temp;
    }
}

public void getpenumpang(int password){
     if(password==24){
         System.out.println("password benar");
     }else {
         System.out.println("password salah");
     }
 
 }

public void getAverage(){
    
    
}

public void cetak(){
     System.out.println("penumpang bus sekarang ="+penumpang);
     System.out.println("maksimum penumpang yang seharusnya adalah ="+maxpenumpang);
 }    
}
