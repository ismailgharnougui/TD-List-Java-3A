/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.util.Comparator;

/**
 *
 * @author sanabenfadhel
 */
public class Etudiant implements Comparable<Etudiant>,
        Comparator<Etudiant>{

    private int id;
    private String nom, prenom;

    public Etudiant() {
    }

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Etudiant et = (Etudiant) obj;
        if (et.id == id && et.nom.equals(nom) && et.prenom.equals(prenom)) {
            return true;
        }
        return false;

    }

    @Override
    public int compareTo(Etudiant o) {
        return this.id-o.id;
    }

    @Override
    public int compare(Etudiant o1, Etudiant o2) {
    
    return o1.nom.compareTo(o2.nom);
    }

}
