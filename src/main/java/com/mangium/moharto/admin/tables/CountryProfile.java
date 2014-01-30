package com.mangium.moharto.admin.tables;

/**
 *
 * @author uday
 */
public class CountryProfile {
    private  String SI;
    private String Name;
    private String  Acronomy;
    private String Alias;
    private String Status;
    private String Actions;
    
    

    public String getSI() {
        return SI;
    }

    public void setSI(String SI) {
        this.SI = SI;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAcronomy() {
        return Acronomy;
    }

    public void setAcronomy(String Acronomy) {
        this.Acronomy = Acronomy;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getActions() {
        return Actions;
    }

    public void setActions(String Actions) {
        this.Actions = Actions;
    }
     
    
    private boolean country_status;

    public boolean isCountry_status() {
        return country_status;
    }

    public void setCountry_status(boolean country_status) {
        this.country_status = country_status;
    }
     
}
