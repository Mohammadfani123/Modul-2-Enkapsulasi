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
import java.lang.Math;
public class Bola {
   public double jarijari=14;
   public double diameter;
   public double luaspermukaan;
   public double volume;
 
   
   public void setjarijari(double jarijari){
       this.jarijari = jarijari;
   }
   
   
   public void showDiameter(){
       this.diameter = 2*jarijari;
       
   }
   
   public void showLuasPermukaan (){
       this.luaspermukaan = 4*Math.PI*jarijari*jarijari;
       
   }   
   
   public void showVolume(){
       this.volume = (4*Math.PI*jarijari*jarijari*jarijari)/3;
       
   }
   
   public void cetak(){
       System.out.println("Jari-Jari : "+jarijari+" cm");
       System.out.println("===========================");
       System.out.println("Diameter  :"+diameter);
       System.out.println("Luas Permukaan : "+luaspermukaan);
       System.out.println("Volume : "+volume);
       
       
       
       
   }
}
