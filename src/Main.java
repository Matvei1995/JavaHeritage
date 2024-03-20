import com.cda.classe.Partie;
import com.cda.classe.Personnage;

public class Main {

    public static void main(String[] args) {
        // Création des personnages
        Personnage perso1 = new Assassin("John", 100, 10, 5, 5);
        Personnage perso2 = new Guerrier("Jane", 120, 8, 8, 3);

        // Création de la partie
        Partie partie = new Partie(perso1, perso2, 5);

        // Lancement de la partie
        partie.lancerPartie();
    }
}
