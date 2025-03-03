package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
@author (Cyril Saad)
 @version (6/14/2021)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
        int fahrenheit = 0;
        float celsius = 0;
        for(int i=0 ; i<args.length ; i++){
            try{
                fahrenheit = Integer.parseInt(args[i]);
                celsius = fahrenheitEnCelsius(fahrenheit);
                System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
            } catch(NumberFormatException nfe){
              System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
           }
           
       }
       
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       // � compl�ter    en rempla�ant la valeur retourn�e par la fonction de conversion
         float res = ((float)(f-32)*5/9) * 10 ;
         int res2 = (int) res;
         return res2/10.0f;
    
     }

}
