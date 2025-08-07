package NetworkGestion;


public class UtilisateurStandart extends Utilisateur {
        public UtilisateurStandart(String id, String nomUtilisateur, String email) {
            super(id, nomUtilisateur, email);
        }

        public boolean peutPublier() {
                return true;
        }
        public boolean peutCommenter() {
                return true;
        }
        public boolean peutSupprimerPublication() {
                return false;
        }
        public boolean peutSupprimerUtilisateur() {
                return false;
        }
}

