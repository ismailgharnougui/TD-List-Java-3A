/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tri;

import Entite.Etudiant;
import java.util.Comparator;

/**
 *
 * @author sanabenfadhel
 */
public class TriPrenom implements Comparator<Etudiant>{

    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        
        return o2.getPrenom().compareTo(o2.getPrenom());
    }
}
