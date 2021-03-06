package fr.ipst.back_medecin_rdv.dto;

import java.util.Objects;

public class MedecinDto extends UserDto {
    private String specialisation;
    private String adresse;
    private String tempsRdv;
    private int codePostal;
    private String ville;

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTempsRdv() {
        return tempsRdv;
    }

    public void setTempsRdv(String tempsRdv) {
        this.tempsRdv = tempsRdv;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedecinDto that = (MedecinDto) o;
        return  Objects.equals(tempsRdv, that.tempsRdv) &&
                codePostal == that.codePostal &&
                Objects.equals(specialisation, that.specialisation) &&
                Objects.equals(adresse, that.adresse) &&
                Objects.equals(ville, that.ville);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialisation, adresse, tempsRdv, codePostal, ville);
    }
}
