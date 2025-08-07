package NetworkGestion;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    private String contenu;
    private Utilisateur auteur;
    private List<Commentaire> commentaires = new ArrayList<>();

    public Publication(String contenu, Utilisateur auteur) {
        this.contenu = contenu;
        this.auteur = auteur;
    }

    public void ajouterCommentaire(Commentaire c) {
        commentaires.add(c);
    }


    public String getContenu() {
        return contenu;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }
}
