/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Entite.Etudiant;
import Interface.University;
import Tri.TriPrenom;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author sanabenfadhel
 */
public class GestionUniverty implements University {

    private String nom;
    private ArrayList<Etudiant> list = new ArrayList<>();

    public GestionUniverty(String nom) {
        this.nom = nom;
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {

        list.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return list.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (int i = 0; i < list.size(); i++) {
            Etudiant et = list.get(i);
            if (et.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean supprimerEtudiant(Etudiant e) {
        return list.remove(e);
    }

    @Override
    public void displayEtudiants() {
//        for(int i=0;i<list.size();i++)
//        {
//            System.out.println(list.get(i));
//        }
        for (Etudiant et : list) {
            System.out.println(et);
        }

    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(list);
    }

    @Override
    public void trierEtudiantsParNom() {
        
        Collections.sort(list, new Etudiant());
    }
    
    public void trierEtudiantsParPrenom() {
        
        Collections.sort(list, new TriPrenom());
    }
}
