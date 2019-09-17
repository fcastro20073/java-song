/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package song;

/**
 *
 * @author mlarrubia
 */
public class Song {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Code inside the main method
        System.out.println ();
        chorus ();
        System.out.println ();

        System.out.println("Little darling \n"
                + "It's been a long, cold, lonely winter \n"
                + "Little darling \n"
                + "It feels like years since it's been here.");
        System.out.println ();
        chorus();
        System.out.println ();

        System.out.println("Littel darling \n"
                + "The smile's returing to the faces \n"
                + "Litte darling \n"
                + "It seems like years since it's been here.");
        System.out.println ();
        chorus ();
        System.out.println ();
        chorus2();
        System.out.println ();
        chorus2 ();
        System.out.println ();
        chorus2();
        System.out.println ();
        chorus2();
        System.out.println ();
        chorus2();
        System.out.println ();
        
        System.out.println ("Little darling \n" +
                            "I feel that ice is slowly melting \n"+
                            "Little darling \n"+
                            "It seems like years since its been clear");
        System.out.println ();
        chorus();
        System.out.println ();
        
        System.out.println ("It's alright");

    }

    public static void chorus() {
        System.out.println("Here comes the sun \n" +
                            "Doo doo doo doo \n" +
                            "Here comes the sun and I say \n" +
                            "It's alright");

    }
    public static void chorus2(){
        System.out.println ("Sun, sun, sun \n" +
                            "Here it comes");
    }
}
