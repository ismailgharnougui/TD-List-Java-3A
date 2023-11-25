/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entite.Etudiant;

/**
 *
 * @author sanabenfadhel
 */
public interface University {
   public void ajouterEtudiant(Etudiant e);
public boolean rechercherEtudiant(Etudiant e); 
public boolean rechercherEtudiant(String nom); 
public boolean supprimerEtudiant(Etudiant e); 
public void displayEtudiants();
public void trierEtudiantsParId();
public void trierEtudiantsParNom(); 
}
