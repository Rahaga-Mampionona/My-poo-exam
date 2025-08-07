package NetworkGestion;

import java.util.ArrayList;
import java.util.List;

public class Groupe {
    private String nom;
    private Administrateur admin;
    private List<Utilisateur> membres = new ArrayList<>();
    private List<Publication> publications = new ArrayList<>();

    public Groupe(String nom, Administrateur admin) {
        this.nom = nom;
        this.admin = admin;
        membres.add(admin);
    }

    public void ajouterMembre(Utilisateur u) {
        if (!membres.contains(u))
            membres.add(u);
    }

    public boolean contientUtilisateur(Utilisateur u) {
        return membres.stream()
                .anyMatch(m -> m.equals(u));
    }

    public void ajouterPublication(Publication p) {
        publications.add(p);
    }

    public void supprimerPublication(Publication p, Utilisateur u) {
        if (u.peutSupprimerPublication())
            publications.remove(p);
    }

    public void supprimerCommentaire(Publication p, Commentaire c, Utilisateur u) {
        if (u.peutSupprimerPublication())
            p.getCommentaires().remove(c);
    }

    public void supprimerUtilisateur(Utilisateur cible, Utilisateur demandeur) {
        if (demandeur.peutSupprimerUtilisateur())
            membres.remove(cible);
    }



    public int getNombreTotalPublications() {
        return publications.size();
    }

    public List<Utilisateur> getMembres() {
        return membres;
    }
}
