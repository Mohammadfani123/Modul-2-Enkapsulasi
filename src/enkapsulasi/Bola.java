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
public class Bola {
   public int jarijari;
   public double phi = 3.14;
   
   
   public int getjarijari(){
        return jarijari;
   }
   
   public double getphi(){
       return phi;
   }
   
   public void setjarijari(int newjarijari){
       jarijari = newjarijari;
   }
   
   public void getphi(double newphi){
       phi = newphi;
   }
   public void showDiameter(){
       double diameter;
       diameter = 2*jarijari;
       System.out.println("Diameter : "+diameter+"cm kuadrat");
   }
   
   public void showLuasPermukaan (){
       double lp;
       lp = 4*phi*jarijari*jarijari;
       System.out.println("Luas Permukaan : "+lp);
   }   
   
   public void showVolume(){
       double v;
       v = 4*phi*jarijari*jarijari*jarijari/3;
       System.out.println("Volume : "+v);
   }
   
}
