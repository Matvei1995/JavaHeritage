package com.cda.classe;

public class Partie {

    private Personnage perso1;
    private Personnage perso2;
    private int nbrTour;

    public Partie(Personnage perso1, Personnage perso2, int nbrTour) {
        this.perso1 = perso1;
        this.perso2 = perso2;
        this.nbrTour = nbrTour;
    }

    // Getters et setters
    public Personnage getPerso1() {
        return perso1;
    }

    public void setJoueur1(Personnage perso1) {
        this.perso1 = perso1;
    }

    public Personnage getPerso2() {
        return perso2;
    }

    public void setPerso2(Personnage joueur2) {
        this.perso2 = perso2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }

    public void lancerPartie() {
        while (nbrTour > 0) {
            perso1.attaquer(perso2);
            perso2.attaquer(perso1);
            nbrTour--;

            // Test de victoire
            if (perso1.getVie() <= 0) {
                System.out.println("Le joueur 2 " + perso2.getNom() + " a gagné !");
                return;
            } else if (perso2.getVie() <= 0) {
                System.out.println("Le joueur 1 " + perso1.getNom() + " a gagné !");
                return;
            }
        }

        // Test d'égalité
        if (perso1.getVie() > 0 && perso2.getVie() > 0) {
            System.out.println("Égalité !");
        }
    }
}