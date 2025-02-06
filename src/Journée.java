import java.util.List;
import dionysies.Tournoi;

class Journée {
    List<Epreuve> listeEpreuve;
    
    public Journée() {
    }


    public void ajouteEpreuve(Epreuve epreuve) {
        listeEpreuve.add(epreuve);
    }

    public void ajouteEpreuve(Style styleEpreuve,Periode periode, int nombreSpectateur) {
        listeEpreuve.add(new Epreuve(styleEpreuve, nombreSpectateur));
    }

    public int scoreJournee(Auteur a) {
        int res = 0;
        for (Epreuve epreuve : listeEpreuve)
        res += epreuve.getNbSpectateurs()*epreuve.scoreAuteur(a);
        return res;
    }

    
}
