public class Epreuve {
    private int nombreSpectateur;
    private Style styleEpreuve;
    private Periode periode;

    public Epreuve(Style styleEpreuve,Periode periode, int nombreSpectateur) {
        this.styleEpreuve = styleEpreuve;
        this.periode = periode;
        this.nombreSpectateur = nombreSpectateur;
    }

    public int getNombreSpectateur() {
        return nombreSpectateur;
    }

    public Style getStyleEpreuve() {
        return styleEpreuve;
    }

    public Periode getPeriode() {
        return periode;
    }

    public int getScoreEpreuve(Auteur participant) {
        return participant.qualiteStyle(styleEpreuve)*nombreSpectateur;
    }
}
