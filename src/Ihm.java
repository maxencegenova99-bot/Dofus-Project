import clavier.In;

import java.text.DecimalFormat;
import java.text.Format;
import java.time.format.DecimalStyle;

public class Ihm {

    public static void main(String[] args) {

        Format monFormat = new DecimalFormat("0.0");
        int temps;
        int dureeHeures;

        System.out.println("Choisissez une période :");
        System.out.println("24 pour 24 heures, 7 pour 7 jours ou 30 pour 30 jours");
        temps = In.readInteger();

        if (temps == 24) {
            dureeHeures = 24;
        } else if (temps == 7) {
            dureeHeures = 7 * 24;
        } else if (temps == 30) {
            dureeHeures = 30 * 24;
        } else {
            System.out.println("Mauvaise valeur.");
            return;
        }

        System.out.print("Entrez le prix de vente actuel :");
        double prixVente = In.readDouble();

        System.out.print("Entrez la quantité totale vendue pendant ces "
                + dureeHeures + " heures :");
        double quantiteVendue = In.readDouble();

        System.out.print("Entrez le prix moyen :");
        double prixMoyen = In.readDouble();

        System.out.print("Entrez le prix médian :");
        double prixMedian = In.readDouble();

        if (prixMedian <= 0) {
            System.out.println("Le prix médian doit être supérieur à zéro.");
            return;
        }

        // Quantité vendue en moyenne par heure
        double quantiteParHeure = quantiteVendue / dureeHeures;

        // Comparaison entre le prix actuel et le prix médian
        double ecartPrixMedian =
                (prixVente - prixMedian) / prixMedian;

        // Comparaison entre le prix actuel et le prix moyen
        double ecartPrixMoyen =
                (prixVente - prixMoyen) / prixMoyen;

        // Prix estimé à partir de la tendance moyenne entre médiane et moyenne
        double facteurPrix =
                1 + ((ecartPrixMedian + ecartPrixMoyen) / 2);

        // Évite d'obtenir une rentabilité négative
        if (facteurPrix < 0) {
            facteurPrix = 0;
        }

        // Rentabilité horaire estimée
        double profitHoraire =
                prixVente * quantiteParHeure * facteurPrix;

        System.out.print("\nQuantité vendue par heure : "
                + quantiteParHeure);

        System.out.print("Écart par rapport au prix médian : "
                + (ecartPrixMedian * 100) + " %");

        System.out.print("Écart par rapport au prix moyen : "
                + (ecartPrixMoyen * 100) + " %");

        System.out.print("Rentabilité estimée : "
                + monFormat.format(profitHoraire) + " kamas par heure");
    }
}
