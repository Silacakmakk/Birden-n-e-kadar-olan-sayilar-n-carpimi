/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package birden_n_.kadar_sayıların_carpımı;
import java.util.*;
/**
 *
 * @author Sıla
 */
public class Birden_n_Kadar_sayıların_carpımı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      int i=1, carpım=1,n;
      System.out.println("Bir sayi giriniz:");
      n=scanner.nextInt();
      while(i<=n){
          carpım=carpım*i;
          i++;
         
      }
       System.out.println("Carpim degeriniz:"+ carpım);
    }
    
}
