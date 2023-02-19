package code;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principale {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Que veux tu faire ?\n[1]Ajouter un élément, [2]Rechercher un élément\n");
        int choix = sc.nextInt();
        choixAddSearch(choix);
        sc.close();

    }

    static void choixAddSearch(int choix){
        int res = choix;
        if(res == 1){
            addElement();
        }  else if(res == 2){
            searchElement();
        } else {
            System.out.println("erreur choix impossible à réaliser");
        }
    }

    static private void addElement() {

        Evenements Karting = new Evenements("Karting", new Date(2/17/23));
        Evenements Football = new Evenements("Football (SB29 - AS MONACO)", new Date(2/19/23));
        Evenements Stage = new Evenements("Stage Java", new Date(4/3/23));
    
        Personnes Alexandre = new Personnes("Zangief", "Alexandre", "Laissy", 20, true, true);
        Personnes Hugues = new Personnes("Ilya", "Hugues", "Latreille", 20, true, true);
        Personnes Bastien = new Personnes("Goupil", "Bastien", "Talec", 20, true, true);

        Evenements[] ensembleEvenements = {Karting, Football, Stage};
        Personnes[] ensemblePersonnes = {Alexandre, Hugues, Bastien};

        Scanner choixRevenir = new Scanner(System.in);
        Scanner choixPersonneEvenements = new Scanner(System.in);
        Scanner entreePersonne = new Scanner(System.in);
        Scanner entreeEvenement = new Scanner(System.in);

        System.out.println("Vous avez choisis d'ajouter un élément, si vous souhaitez annuler ce choix, tapez \"sortir\" sinon pour continuer faites \"entrer\"");
        String reponse = choixRevenir.nextLine();

        if(reponse.equals("sortir")){

            System.out.println("fin du programme\n");
            choixRevenir.close();
            choixPersonneEvenements.close();
            entreePersonne.close();
            entreeEvenement.close();
            return;

        } else if(reponse.equals("")){

            System.out.println("Voulez-vous ajouter une personne[1] ou un événement[2] ?\n");
            int choixNum = choixPersonneEvenements.nextInt();

            if(choixNum == 1){

                System.out.println("Entrer la nouvelle personne en commençant par son pseudo :\n");
                String personnePseudo = entreePersonne.nextLine();
                System.out.println("prénom :\n");
                String personnePrenom = entreePersonne.nextLine();
                System.out.println("nom :\n");
                String personneNom = entreePersonne.nextLine();
                System.out.println("âge :\n");
                int personneAge = entreePersonne.nextInt();
                System.out.println("étudiant(boolean) :\n");
                boolean personneEtudiant = entreePersonne.nextBoolean();
                System.out.println("majeur(boolean) :\n");
                boolean personneMajeur = entreePersonne.nextBoolean();

                Personnes newP = new Personnes(personnePseudo, personnePrenom, personneNom, personneAge, personneEtudiant, personneMajeur);
                Personnes[] ensemblePersonnesTemporaire = new Personnes[ensemblePersonnes.length + 1];

                for (int i = 0; i < ensemblePersonnes.length; i++) {
                    ensemblePersonnesTemporaire[i] = ensemblePersonnes[i];
                }

                ensemblePersonnesTemporaire[ensemblePersonnesTemporaire.length - 1] = newP;
                ensemblePersonnes = ensemblePersonnesTemporaire;

                choixRevenir.close();
                choixPersonneEvenements.close();
                entreePersonne.close();
                entreeEvenement.close();

            } else if(choixNum == 2){

                System.out.println("Entrer le nouveau evenement en commençant par son nom : \n");
                String evenementNom = entreeEvenement.nextLine();
                System.out.println("La Date ?(dd/MM/yyyy)\n");
                String dateString = entreeEvenement.nextLine();

                Date evenementDate = null;

                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    evenementDate = dateFormat.parse(dateString);
                    System.out.println("Nouvel événement : " + evenementNom + ", date : " + evenementDate);
                } catch (Exception e) {
                    System.out.println("Format de date incorrect !");
                }

                Evenements newE = new Evenements(evenementNom, evenementDate);
                Evenements[] ensembleEvenementsTemporaire = new Evenements[ensembleEvenements.length + 1];

                for(int i = 0; i < ensembleEvenements.length; i++){
                    ensembleEvenementsTemporaire[i] = ensembleEvenements[i];
                }

                ensembleEvenementsTemporaire[ensembleEvenementsTemporaire.length - 1] = newE;
                ensembleEvenements = ensembleEvenementsTemporaire; 

                choixRevenir.close();
                choixPersonneEvenements.close();
                entreePersonne.close();
                entreeEvenement.close();
            }
        }
    }

    static void searchElement(){

        Evenements Karting = new Evenements("Karting", new Date(2/17/23));
        Evenements Football = new Evenements("Football (SB29 - AS MONACO)", new Date(2/19/23));
        Evenements Stage = new Evenements("Stage Java", new Date(4/3/23));
    
        Personnes Alexandre = new Personnes("Zangief", "Alexandre", "Laissy", 20, true, true);
        Personnes Hugues = new Personnes("Ilya", "Hugues", "Latreille", 20, true, true);
        Personnes Bastien = new Personnes("Goupil", "Bastien", "Talec", 20, true, true);

        Evenements[] ensembleEvenements = {Karting, Football, Stage};
        Personnes[] ensemblePersonnes = {Alexandre, Hugues, Bastien};

        Scanner choixRevenir = new Scanner(System.in);
        System.out.println("Vous avez choisis de chercher un élément, si vous souhaitez annuler ce choix, tapez \"sortir\" sinon pour continuer faites \"entrer\"");
        String reponse = choixRevenir.nextLine();
        if(reponse.equals("sortir")){

            System.out.println("Fin du programme\n");
            choixRevenir.close();
            return;

        } else if(reponse.equals("")){

            System.out.println("Confirmation, que voulez vous rechercher ? [1] Evenement, [2] Personne\n");
            Scanner entreeTypeRecherche = new Scanner(System.in);
            int choix = entreeTypeRecherche.nextInt();
            if(choix == 1){

                Scanner rechercheEvenement = new Scanner(System.in);

                System.out.println("Vous avez choisi de chercher un évènement, écrivez le nom de l'évènement à chercher :\n");
                String nomEventARechercher = rechercheEvenement.nextLine();

                for(int i = 0; i < ensembleEvenements.length; i++){
                    if(ensembleEvenements[i].equals(nomEventARechercher)){
                        Evenements res = ensembleEvenements[i];
                        System.out.println("Evenement trouvé : " + res);
                    }
                }

                choixRevenir.close();
                entreeTypeRecherche.close();
                rechercheEvenement.close();

            } else if(choix == 2){

                Scanner recherchePersonne = new Scanner(System.in);

                System.out.println("Vous avez choisi de chercher une personne, écrivez le prenom de la personne à chercher :\n");
                String nomPersonneARechercher = recherchePersonne.nextLine();

                for(int i = 0; i < ensemblePersonnes.length; i++){
                    if(ensemblePersonnes[i].getNom().equals(nomPersonneARechercher)){
                        Personnes res = ensemblePersonnes[i];
                        System.out.println("Personne trouvé : " + res);
                    }
                }

                choixRevenir.close();
                entreeTypeRecherche.close();
                recherchePersonne.close();
            }
        }
    }
}
