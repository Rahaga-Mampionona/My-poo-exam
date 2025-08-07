package NetworkGestion;

public class Commentaire {
    private String contenu;
    private Utilisateur auteur;

    public Commentaire(String contenu, Utilisateur auteur) {
        this.contenu = contenu;
        this.auteur = auteur;
    }

    public String getContenu() {
        return contenu;
    }
}
