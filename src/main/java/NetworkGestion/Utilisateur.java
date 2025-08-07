package NetworkGestion;

import java.time.LocalDate;

public abstract class Utilisateur {
    private String id;
    private String nomUtilisateur;
    private String email;
    private LocalDate dateCreation;

    public Utilisateur(String id, String nomUtilisateur, String email) {
        this.id = id;
        this.nomUtilisateur = nomUtilisateur;
        this.email = email;
        this.dateCreation = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public abstract boolean peutSupprimerUtilisateur(

    );
    public abstract boolean peutSupprimerPublication(

    );
    public abstract boolean peutCommenter(

    );
    public abstract boolean peutPublier(

    );




}
