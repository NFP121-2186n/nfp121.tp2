package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (Cyril Saad)
 * @version (6/14/2021)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        for(String s : args) {
        int fahrenheit = Integer.parseInt(s);
        float celsius = fahrenheitEnCelsius(fahrenheit);
        System.out.println(fahrenheit + "\u00B0F -> " + fahrenheitEnCelsius(fahrenheit) + "\u00B0C");   
        } // ligne,
                                                                                // format
                                                                                // imposés
                                                                                
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
       public static float fahrenheitEnCelsius(int f) {
             // à compléter en remplaçant ce return 0.F par la fonction
             // de conversion
             float res = ((float)(f-32)*5/9) * 10 ;
             int res2 = (int) res;
             return res2/10.0f;
        }

}
