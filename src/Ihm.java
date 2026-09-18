import clavier.In;

public class Ihm {
    public static void main(String[] args){
        /* First :
        Equation model to estimlate the kamas made in an hour :
         <y> = ax * (1+|moy - med|/100)
         - Where <y> is the average kamas made in an hour;
            - a = price
              - x = quantity to sell
         - moy = <a> = average price
           - med = ã = price mediane
           - t = time in hour (converted from either 24h/7days/30days)
         */

        // Initialisation des variables
        int t = 24; //temps
        int j = 1; //jours
        int a = 0; //prix
        int x = 0; //quantité
        int y = 0; //quantité selon t*j
        int moy = 0; //moyenne
        int med = 0; //mediane
        double d = (Math.abs(moy+med)/100); //Pourcentage de différence entre moyenne et mediane


        // Initiation des choix
        System.out.println("Choisissez entre 24 heures, 7 jours ou 30 jours Saisir 24 ou 7 ou 30");
        int temps = In.readInteger();

        if (temps == 24) {
            System.out.println("Entrez le prix de vente");
            a = In.readInteger();
            System.out.println("Entrez la quantité à vendre");
            x = In.readInteger();
            System.out.println("Entrez la moyenne  médiane");
            moy = In.readInteger();
            System.out.println("Entrez la médiane");
            med = In.readInteger();
            System.out.println("Entrez la quantité vendu en" + temps + "heures");
            y = In.readInteger();

        } else if (temps == 7) {
            System.out.println("Entrez le prix de vente");
            a = In.readInteger();
            System.out.println("Entrez la quantité à vendre");
            x = In.readInteger();
            System.out.println("Entrez la moyenne  médiane");
            moy = In.readInteger();
            System.out.println("Entrez la médiane");
            med = In.readInteger();
            System.out.println("Entrez la quantité vendu en" + temps + "heures");
            y = In.readInteger();

        } else if (temps == 30) {
            System.out.println("Entrez le prix de vente");
            a = In.readInteger();
            System.out.println("Entrez la quantité à vendre");
            x = In.readInteger();
            System.out.println("Entrez la moyenne  médiane");
            moy = In.readInteger();
            System.out.println("Entrez la médiane");
            med = In.readInteger();
            System.out.println("Entrez la quantité vendu en" + temps + "heures");
            y = In.readInteger();

        } else {
            System.out.println("Mauvaise valeur");
            return;
        }
    }
}
