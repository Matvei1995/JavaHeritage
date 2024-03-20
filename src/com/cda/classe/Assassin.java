package com.cda.classe;

import com.cda.classe.Personnage;

public class Assassin extends Personnage {
    private int bonusAttaque;
    private int bonusDefense;

    public Assassin(String nom, int vie, int attaque, int defense, int bonusAttaque) {
        super(nom, vie, attaque, defense);
        this.bonusAttaque = bonusAttaque;
    }

    // Getters et setters
    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }
    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }
    public void attaquer(Personnage cible) {
        int chanceCritique = (int) (Math.random() * 100);

        if (chanceCritique < 5) {
            cible.setVie(cible.getVie() - (cible.getAttaque() - cible.getDefense()));
            this.setVie(this.getVie() + bonusDefense);
        } else {
            cible.setVie(cible.getVie() - (cible.getAttaque() - cible.getDefense()));
        }
    }
}






