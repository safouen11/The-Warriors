/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_entities;

/**
 *
 * @author Naoufel
 */
public class Proposition {
    private int id;

    public String getDateOffre() {
        return DateOffre;
    }

    public void setDateOffre(String DateOffre) {
        this.DateOffre = DateOffre;
    }

    public String getDescriptionOffre() {
        return DescriptionOffre;
    }

    public void setDescriptionOffre(String DescriptionOffre) {
        this.DescriptionOffre = DescriptionOffre;
    }

    public String getNomOffre() {
        return NomOffre;
    }

    public void setNomOffre(String NomOffre) {
        this.NomOffre = NomOffre;
    }

    public String getVilleDepartOffre() {
        return VilleDepartOffre;
    }

    public void setVilleDepartOffre(String VilleDepartOffre) {
        this.VilleDepartOffre = VilleDepartOffre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String NomOffre;
    private String DateOffre;
    private String DescriptionOffre;
    private String VilleDepartOffre;
    
}
