/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Windows 10
 */
public class MohammadFani {
    public String namaAyah,namaIbu,namaSendiri,namaSaudara,alamat,hobi,citacita;
    public int umur;
    
    public void setnamaAyah (String newnamaAyah){
        this.namaAyah = newnamaAyah;
    }
    
    public void setnamaIbu(String newnamaIbu){
        this.namaIbu = newnamaIbu;
    }
    
    public void setnamaSendiri(String newnamaSendiri){
        this.namaSendiri = newnamaSendiri;
    }
    
    public void setnamaSaudara (String newnamaSaudara){
        this.namaSaudara = newnamaSaudara;
    }
    
    public void setalamat (String newalamat){
        this.alamat = newalamat;
    }
    
    public void sethobi(String newhobi){
        this.hobi = newhobi;
    }
    
    public void setcitacita(String newcitacita){
        this.citacita = newcitacita;
    }
    public void cetak(){
        System.out.println("Biodata");
        System.out.println("=======================");
        System.out.println("Nama Ayah   : "+namaAyah);
        System.out.println("Nama Ibu    : "+namaIbu);
        System.out.println("Nama Sendiri: "+namaSendiri);
        System.out.println("Nama Saudara: "+namaSaudara);
        System.out.println("Alamat      : "+alamat);
        System.out.println("Hobi        : "+hobi);
        System.out.println("Cita-Cita   : "+citacita);
        System.out.println("Umur        : "+umur);
    }
    
    public void setumur (int newumur){
        this.umur = newumur;
    }
    
    public String getnamaAyah(){
        return namaAyah;
    }
    
    public String getnamaIbu (){
        return namaIbu;
    }
    public String getnamaSendiri(){
        return namaSendiri;
    }
    public String getnamaSaudara(){
        return namaSaudara;
    }
    public String getalamat(){
        return alamat;
    }
    public String gethobi(){
        return hobi;
    }
    public String getcitacita(){
        return citacita;
    }
    public int getumur(){
        return umur;
    }
}
