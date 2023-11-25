/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdlist3a5;

import Entite.Etudiant;
import Gestion.GestionUniverty;

/**
 *
 * @author sanabenfadhel
 */
public class TdList3A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Etudiant et1=new Etudiant(1, "ben fadhel", "sana");
        
        Etudiant et2=new Etudiant(2, "hjiri", "wiem");
        
        Etudiant et3=new Etudiant(2, "hjiri", "wiem");
        
        GestionUniverty gest=new GestionUniverty("Esprit");
        
        gest.ajouterEtudiant(et1);
        gest.ajouterEtudiant(et2);
        
        gest.displayEtudiants();
        
        System.out.println(gest.rechercherEtudiant(et1));
        
        System.out.println(gest.rechercherEtudiant(et3));
    }
    
}
