package NetworkGestion;

public class Administrateur extends Moderateur {
    public Administrateur(String id, String nomUtilisateur, String email) {
        super(id, nomUtilisateur, email);
    }

    @Override
    public boolean peutSupprimerUtilisateur() {
        return true;
    }
}