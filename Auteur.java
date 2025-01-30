class Auteur {
  String nom;

  String citation_tragédie;
  int qualité_tragédie;

  String citation_comédie;
  int qualité_comédie;

  String citation_drame;
  int qualité_drame;

  public Auteur(
      String nom,
      int qualité_tragédie,
      String citation_tragédie,
      int qualité_comédie,
      String citation_comédie,
      int qualité_drame,
      String citation_drame){
    this.nom=nom;
    this.qualité_tragédie=qualité_tragédie;
    this.citation_tragédie=citation_tragédie;
    this.qualité_comédie=qualité_comédie;
    this.citation_comédie=citation_comédie;
    this.qualité_drame=qualité_drame;
    this.citation_drame=citation_drame;
  }

  public Style point_fort() {
    if (qualité_tragédie > qualité_comédie) {
      if (qualité_drame > qualité_tragédie) {
        return Style.DRAME;
      } else {
        return Style.TRAGÉDIE;
      }
    } else {
      if (qualité_drame > qualité_comédie) {
        return Style.DRAME;
      } else {
        return Style.COMÉDIE;
      }
    }
  }

  public String getCitationTragédie(){
    return this.citation_tragédie;
  }

  @Override
  public String toString(){
    return "Auteur: "+this.nom +", Qualité de Tragédie: "+this.qualité_tragédie + ", Citation Trajédie "+this.citation_tragédie+", Qualité Comédie "+this.qualité_comédie+", Citation Comédie "+this.citation_comédie+", Qualité Drame "+this.qualité_drame+", Citation Drame "+this.citation_drame;
  }
}
