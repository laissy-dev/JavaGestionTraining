package code;

public class Personnes{
    private String pseudo, prenom, nom;
    private int age;
    private boolean etudiant, majeur;

    public Personnes(String pseudo, String prenom, String nom, int age, boolean etudiant, boolean majeur){
        this.pseudo = pseudo;
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.etudiant = etudiant;
        this.majeur = etudiant;
    }

    public String getPseudo(){
        return pseudo;
    }

    public void setPseudo(String pseudo){
        this.pseudo = pseudo;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEtudiant() {
        return etudiant;
    }

    public void setEtudiant(boolean etudiant) {
        this.etudiant = etudiant;
    }

    public boolean isMajeur() {
        return majeur;
    }

    public void setMajeur(boolean majeur) {
        this.majeur = majeur;
    }

}

