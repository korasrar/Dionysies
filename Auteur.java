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
      String citation_drame) {
    this.nom = nom;
    this.qualité_tragédie = qualité_tragédie;
    this.citation_tragédie = citation_tragédie;
    this.qualité_comédie = qualité_comédie;
    this.citation_comédie = citation_comédie;
    this.qualité_drame = qualité_drame;
    this.citation_drame = citation_drame;
  }

  public Style pointFort() {
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

  public String getNom() {
    return this.nom;
  }

  public int getQualiteTragedie() {
    return this.qualité_tragédie;
  }

  public String getCitationTragedie() {
    return this.citation_tragédie;
  }

  public int getQualiteComedie() {
    return this.qualité_comédie;
  }

  public String getCitationComedie() {
    return this.citation_comédie;
  }

  public int getQualiteDrame() {
    return this.qualité_drame;
  }

  public String getCitationDrame() {
    return this.citation_drame;
  }

  public int qualiteStyle(Style s) {
    if (s == Style.TRAGÉDIE)
      return this.qualité_tragédie;
    if (s == Style.COMÉDIE)
      return this.qualité_comédie;
    if (s == Style.DRAME)
      return this.qualité_drame;
    else
      return 0;
  }

  public String citationStyle(Style s) {
    if (s == Style.TRAGÉDIE)
      return this.citation_tragédie;
    if (s == Style.COMÉDIE)
      return this.citation_comédie;
    if (s == Style.DRAME)
      return this.citation_drame;
    else
      return "";
  }

  @Override
  public String toString() {
    return "L'honorable " + this.nom;
  }
}
