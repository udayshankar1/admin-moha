
package com.mangium.moharto.admin.datacenter.model;

/**
 *
 * @author uday
 */
public class Countries {
//this class is pure pojo class declare variables according to database table and generate getters and setters    
private int country_id;
private String country_name;
private String country_acronym;
private String country_status;//use booleany type instead of String 

//getters and setters

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_acronym() {
        return country_acronym;
    }

    public void setCountry_acronym(String country_acronym) {
        this.country_acronym = country_acronym;
    }

    public String getCountry_status() {
        return country_status;
    }

    public void setCountry_status(String country_status) {
        this.country_status = country_status;
    }


}
