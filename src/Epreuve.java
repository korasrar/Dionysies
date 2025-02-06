class Epreuve {
    private Style styleEpreuve;
    private int nbSpectateurs;

    public Epreuve (
        Style styleEpreuve,
        int nbSpectateurs)
    {
        this.styleEpreuve = styleEpreuve;
        this.nbSpectateurs = nbSpectateurs;
    }

    public Style getStyleEpreuve() {
        return this.styleEpreuve;
    }

    public int getNbSpectateurs() {
        return this.nbSpectateurs;
    }

    /**
     * Calcule et renvoie le score obtenu par l'auteur lors de cette épreuve
     * @param a l'auteur dont on veut calculer le score
     * @return le score de l'auteur
     */
    public int scoreAuteur(Auteur a){
        int qualite = a.qualiteStyle(this.getStyleEpreuve());
        return qualite*this.getNbSpectateurs();
    }
}