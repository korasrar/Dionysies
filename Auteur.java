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
    //TODO
  }

public String getNom() {
  return this.nom;
}

public int getQualitéTragédie() {
  return this.qualité_tragédie;
}

public String getCitationTragedie() {
  return this.citation_tragédie;
}

public int getQualitéComédie() {
  return this.qualité_comédie;
}

public String getCitationComédie() {
  return this.citation_comédie;
}

public int getQualitéDrame() {
  return this.qualité_drame;
}

public String getCitationDrame() {
  return this.citation_drame;
}

public int qualitéStyle(Style s) {
  if (s = TRAGÉDIE)
    return this.qualité_tragédie;
  if (s = COMÉDIE)
    return this.qualité_comédie;
  if (s = DRAME)
    return this.qualité_drame;
}

public String qualitéStyle(Style s) {
  if (s = TRAGÉDIE)
    return this.citation_tragédie;
  if (s = COMÉDIE)
    return this.citation_comédie;
  if (s = DRAME)
    return this.citation_drame;
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

@Override
public String toString() {
  return "L'honorable "+this.nom;
}

}
