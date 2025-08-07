package NetworkGestion;

public class Moderateur extends UtilisateurStandart {
    public Moderateur(String id, String nomUtilisateur, String email) {
        super(id, nomUtilisateur, email);
    }

    @Override
    public boolean peutSupprimerPublication() {
        return true;
    }
}