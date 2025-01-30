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
        listeEpreuve.add(new Epreuve(styleEpreuve, periode, nombreSpectateur));
    }

    public int getScoreJourne(Auteur auteur) {
        for
    }
}
