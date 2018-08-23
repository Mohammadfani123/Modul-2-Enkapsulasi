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
public class UjiBus4praktikum {
    public static void main(String[] args) {
        Bus4Praktikum Coba = new Bus4Praktikum(50);
        Coba.getPenumpang(27);
        Coba.cetak();
        Coba.getAverage();
        Coba.addPenumpang(2);
        Coba.cetak();
        Coba.getAverage();
        Coba.addPenumpang(5);
        Coba.cetak();
        Coba.getAverage();
        Coba.addPenumpang(10);
        Coba.cetak();
        Coba.getAverage();
        Coba.addPenumpang(3);
        Coba.cetak();
        Coba.getAverage();
    }
}
