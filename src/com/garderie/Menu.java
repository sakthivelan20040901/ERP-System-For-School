package com.garderie;
// Last updated: July 8, 2025
import java.util.Scanner;

public class Menu {
    School school;

    public Menu(){
        // initiation de l'ecole
        this.school = new School(1);
    }

    // util functions
    private int getUserChoice(){
        int Choice;

        System.out.println("Entrer votre choix :");

        // read user input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // cast input String to int and returns error message if not possible
        try {
            Choice = Integer.parseInt(input);
        }catch(Exception e){
            System.out.println("ERREUR: seules les valeurs entier sont acceptées");
            Choice = -1;
        }
        return Choice;
    }
    protected static void clear(){
//        block();
//        try{
//            Runtime.getRuntime().exec("cls");
//        }
//        catch (IOException e){
//            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//        }
    }
    private void exit(){
        //fermer le programme
        System.out.println("Good Bye");
        System.exit(0);
    }
    private static void block(){
        System.out.println("tape a key to continue ...");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
    }
    public void mainLoop(){
        // boucler a l'infini
        while (true) {
            // block();
            this.menuPrincipal();
        }
    }

    // Gestion menu animateur
    private void showMenuAnimateur(){
        // clear board
        clear();

        System.out.println("************** Menu Gestion Animateur **************\n");
        System.out.println("1. Ajouter animateur");
        System.out.println("2. Afficher animateur");
        System.out.println("3. Mettre a jours animateur");
        System.out.println("4. Supprimer  animateur");
        System.out.println("5. Lister animateurs");
        System.out.println("0. Retour menu principal");
    }
    private void animateur() {
        //variable declaration
        Scanner scanner = new Scanner(System.in);
        int id;
        int Choice;

        // afficer menu animateur
        this.showMenuAnimateur();

        // recuperer le choix de l'utilisateur
        Choice = this.getUserChoice();

        // arbre de choix
        switch(Choice) {
            case 0:
                break;
            case 1:
                school.addAnimateur();
                break;
            case 2:
                System.out.print("donner ID animateur :");
                id = Integer.parseInt(scanner.nextLine());
                if (!(school.showAnimateur(id))){
                    System.out.printf("Error : Animateur id %s not found \n",id);
                }
                break;
            case 3:
                System.out.print("donner ID animateur :");
                id = Integer.parseInt(scanner.nextLine());
                if (school.updateAnimateur(id)){
                    System.out.printf("Animateur id %s mise a jours avec success\n",id);
                }else{
                    System.out.printf("Error : Animateur id %s not found \n",id);
                }
                break;
            case 4:
                System.out.print("donner ID animateur :");
                id = Integer.parseInt(scanner.nextLine());
                if (school.deleteAnimateur(id)){
                    System.out.printf("Animateur id %s suprimé avec success\n",id);
                }else{
                    System.out.printf("Error : Animateur id %s not found \n",id);
                }
                break;
            case 5:
                school.showAnimateurlist();
                break;
            default:
                System.out.println("veiller entrer un numero entre 0 et 5");
        }
    }


    // Gestion menu eleves
    private void showMenuEleves(){
        // clear board
        clear();

        System.out.println("************** Menu Gestion Elèves **************\n");
        System.out.println("1.  Ajouter eleve");
        System.out.println("2.  Afficher eleve");
        System.out.println("3.  Mettre a jours eleve");
        System.out.println("4.  Supprimer eleve");
        System.out.println("5.  Lister eleves");
        System.out.println("6.  Ajouter eleve a une classe");
        System.out.println("7.  Inscrire eleve a une activité");
        System.out.println("8.  Update eleve classe");
        System.out.println("9.  Descrire eleve d'une une activité");
        System.out.println("10. Afficher activité eleve");
        System.out.println("11. Facture eleve");
        System.out.println("0.  Retour menu principal");
    }
    private void eleves() {
        //variable declaration
        Scanner scanner = new Scanner(System.in);
        int id;
        int Choice;

        // afficer menu eleves
        this.showMenuEleves();

        // recuperer le choix de l'utilisateur
        Choice = this.getUserChoice();

        // arbre de choix
        switch(Choice) {
            case 0:
                break;
            case 1:
                school.addEleve();
                break;
            case 2:
                System.out.print("donner ID Eleve :");
                id = Integer.parseInt(scanner.nextLine());
                if (!(school.showEleve(id))){
                    System.out.printf("Error : Eleve id %s not found \n",id);
                }
                break;
            case 3:
                System.out.print("donner ID Eleve :");
                id = Integer.parseInt(scanner.nextLine());
                if (school.updateEleve(id)){
                    System.out.printf("Eleve id %s mise a jours avec success\n",id);
                }else{
                    System.out.printf("Error : Eleve id %s not found \n",id);
                }
                break;
            case 4:
                System.out.print("donner ID Eleve :");
                id = Integer.parseInt(scanner.nextLine());
                if (school.deleteEleve(id)){
                    System.out.printf("Eleve id %s suprimé avec success\n",id);
                }else{
                    System.out.printf("Error : Eleve id %s not found \n",id);
                }
                break;
            case 5:
                school.showElevelist();
                break;
            case 6:
                System.out.print("donner ID Eleve :");
                int idEleve = Integer.parseInt(scanner.nextLine());
                System.out.print("donner ID Classe :");
                int idClasse = Integer.parseInt(scanner.nextLine());

                school.addEleveClasse(idEleve,idClasse);
                break;
            case 7:
                System.out.print("donner ID Eleve :");
                idEleve = Integer.parseInt(scanner.nextLine());
                System.out.print("donner ID Activité :");
                int idActivite = Integer.parseInt(scanner.nextLine());
                school.addEleveActivite(idEleve,idActivite);
                break;
            case 8:
                System.out.print("donner ID Eleve :");
                idEleve = Integer.parseInt(scanner.nextLine());
                System.out.print("donner ID Classe :");
                idClasse = Integer.parseInt(scanner.nextLine());

                school.addEleveClasse(idEleve,idClasse);
                break;
            case 9:
                System.out.print("donner ID Eleve :");
                idEleve = Integer.parseInt(scanner.nextLine());
                System.out.print("donner ID Activite :");
                idActivite = Integer.parseInt(scanner.nextLine());

                school.deleteEleveActivite(idEleve,idActivite);
                break;
            case 10:
                System.out.print("donner ID Eleve :");
                idEleve = Integer.parseInt(scanner.nextLine());

                school.showEleveActivite(idEleve);
                break;

            case 11:
                System.out.print("donner ID Eleve :");
                id = Integer.parseInt(scanner.nextLine());

                school.factureEleve(id);
                break;

            default:
                System.out.println("veiller entrer un numero entre 0 et 11");
        }
    }


    // Gestion menu classes
    private void showMenuClasses(){
        // clear board
        this.clear();

        System.out.println("************** Menu Gestion Classes **************\n");
        System.out.println("1. Ajouter classe");
        System.out.println("2. Mettre a jours classe");
        System.out.println("3. Supprimer classe");
        System.out.println("4. Lister classes");
        System.out.println("0. Retour menu principal");
    }
    private void classes() {
        //variable declaration
        int Choice;

        // afficer menu classes
        this.showMenuClasses();

        // recuperer le choix de l'utilisateur
        Choice = this.getUserChoice();

        // arbre de choix
        switch(Choice) {
            case 0:
                this.menuPrincipal();
                break;
            case 1:
                this.showMenuAnimateur();
                break;
            case 2:
                this.showMenuEleves();
                break;
            case 3:
                this.showMenuClasses();
                break;
            case 4:
                this.showMenuActivite();
                break;
            default:
                System.out.println("veiller entrer un numero entre 0 et 4");
        }
    }


    // Gestion menu activit"
    private void showMenuActivite(){
        // clear board
        this.clear();

        System.out.println("************** Menu Gestion Cours **************\n");
        System.out.println("1. Ajouter activite");
        System.out.println("2. Mettre a jours activite");
        System.out.println("3. Supprimer activite");
        System.out.println("4. Lister activite");
        System.out.println("0. Retour menu principal");
    }
    private void activite() {
        //variable declaration
        int Choice;

        // afficer menu cours
        this.showMenuActivite();

        // recuperer le choix de l'utilisateur
        Choice = this.getUserChoice();

        // arbre de choix
        switch(Choice) {
            case 0:
                this.menuPrincipal();
                break;
            case 1:
                this.showMenuAnimateur();
                break;
            case 2:
                this.showMenuEleves();
                break;
            case 3:
                this.showMenuClasses();
                break;
            case 4:
                this.showMenuActivite();
                break;
            default:
                System.out.println("veiller entrer un numero entre 0 et 4");
        }
    }

    // Gestion menu principal
    private void showMenuPrincipal(){
        // clear board
        this.clear();

        // afficher Menu Principal
        System.out.println("\n************** Menu Principal **************\n");
        System.out.println("1. Gestion Animateur ");
        System.out.println("2. Gestion Elèves ");
        System.out.println("3. Gestion Activite ");
        System.out.println("4. Gestion Cours");
        System.out.println("0. Exit");
    }
    private void menuPrincipal(){
        //variable declaration
        int Choice;

        // afficer menu principal
        this.showMenuPrincipal();

        // recuperer le choix de l'utilisateur
        Choice = getUserChoice();

        // arbre de choix
        switch(Choice) {
            case 0:
                this.exit();
                break;
            case 1:
                this.animateur();
                break;
            case 2:
                this.eleves();
                break;
            case 3:
                this.classes();
                break;
            case 4:
                this.activite();
                break;
            default:
                System.out.println("veiller entrer un numero entre 0 et 4");
        }
    }
}
