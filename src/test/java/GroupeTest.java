
import NetworkGestion.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GroupeTest {

    @Test
    public void testCreationPublication() {
        UtilisateurStandart user = new UtilisateurStandart("USR0069", "Jean Luc", "lucjean@gmail.com");
        Publication pub = new Publication("Coucou Nomena", user);
        assertEquals("Coucou Nomena", pub.getContenu());
    }

    @Test
    public void testAjoutCommentaire() {
        UtilisateurStandart user = new UtilisateurStandart("USR0690", "Thomas", "dams@gmail.com");
        Publication pub = new Publication("Life's hard", user);
        Commentaire c = new Commentaire("But I'll give my best", user);
        pub.ajouterCommentaire(c);
        assertEquals(1, pub.getCommentaires().size());
    }

    @Test
    public void testSuppressionPublicationParModerateur() {
        Moderateur mod = new Moderateur("MDR6900", "Nomena", "nomena@gmail.com");
        Publication pub = new Publication("à la plage", mod);
        Groupe groupe = new Groupe("Cocacolastique", new Administrateur("ADM6009", "Cassy", "cassy@gmail.com"));
        groupe.ajouterPublication(pub);
        groupe.supprimerPublication(pub, mod);
        assertEquals(0, groupe.getNombreTotalPublications());
    }

    @Test
    public void testSuppressionUtilisateurParAdmin() {
        Administrateur admin = new Administrateur("ADM6969", "Rahaga", "rahagaisadmin@gmail.com");
        Groupe groupe = new Groupe("Gentleman", admin);

        UtilisateurStandart user = new UtilisateurStandart("USR0001", "", "user@mail.com");
        groupe.ajouterMembre(user);
        groupe.supprimerUtilisateur(user, admin);
        assertFalse(groupe.getMembres().contains(user));
    }
}