import com.cda.classe.Personnage;
public class Guerrier extends Personnage {

    private int bonusDefense;

    public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense) {
        super(nom, vie, attaque, defense);
        this.bonusDefense = bonusDefense;
    }

    // Getters et setters
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
