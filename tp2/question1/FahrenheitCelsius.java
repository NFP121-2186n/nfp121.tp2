package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (Cyril Saad)
 * @version (6/14/2021)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les param�tres de la ligne de commande
        for(String s : args) {
        int fahrenheit = Integer.parseInt(s);
        float celsius = fahrenheitEnCelsius(fahrenheit);
        System.out.println(fahrenheit + "\u00B0F -> " + fahrenheitEnCelsius(fahrenheit) + "\u00B0C");   
        } // ligne,
                                                                                // format
                                                                                // impos�s
                                                                                
    }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
       public static float fahrenheitEnCelsius(int f) {
             // � compl�ter en rempla�ant ce return 0.F par la fonction
             // de conversion
             float res = ((float)(f-32)*5/9) * 10 ;
             int res2 = (int) res;
             return res2/10.0f;
        }

}
