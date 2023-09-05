/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4truthamper;

/**
 *
 * @author TRUTH
 */
public class Cs4TruthAmper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String show1 = "Outlander";
        int seasons1 = 7;
        String genre1 = "Historical Fiction";
        
        String show2 = "Schitt's Creek";
        int seasons2 = 6;
        String genre2 = "Comedy";
        
        String show3 = "Cyberpunk Edgerunners";
        int seasons3 = 1;
        String genre3 = "Science Fiction";
        
        int totalseasons = seasons1 + seasons2 + seasons3;
        boolean moreseasons = seasons1 > seasons2;
        boolean samegenre = genre1 == genre3;
     
        System.out.println("Show 1 \r\nName: " + show1 + "\r\nNo. of Seasons: " + seasons1 + "\r\nGenre: " + genre1);
        System.out.println("\r\nShow 2 \r\nName: " + show2 + "\r\nNo. of Seasons: " + seasons2 + "\r\nGenre: " + genre2);
        System.out.println("\r\nShow 3 \r\nName: " + show3 + "\r\nNo. of Seasons: " + seasons3 + "\r\nGenre: " + genre3);
        System.out.println("\r\nTotal number of seasons: " + totalseasons + "\r\nOutlander has more seasons than Schitt's Creek: " + moreseasons + "\r\nOutlander and Cyberpunk Edgerunners have the same genre: " + samegenre);
        
        
        
    }
    
}
