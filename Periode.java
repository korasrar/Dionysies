public enum Periode {
    MATIN,
    APRESMIDI,
    SOIREE;

    public String toString() {
        if (this == MATIN)
        return "Matin";
    else if (this == APRESMIDI)
        return "Après-Midi";
    else {
        assert this == SOIREE;
        return "Soirée";
    }
    }
}

