package com.mangium.moharto.admin.tables;

/**
 *
 * @author uday
 */
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.primefaces.event.FileUploadEvent;

@javax.faces.bean.ManagedBean
@RequestScoped
public class CountryProfileBean {

    private List<CountryProfile> colleges;

    private CountryProfileDataModel mediummessagemodel;

    private CountryProfile selectedcollege;

    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<CountryProfile> getColleges() {
        return colleges;
    }

    public void setMessages(List<CountryProfile> colleges) {
        this.colleges = colleges;
    }

    public CountryProfileDataModel getMediummessagemodel() {
        return mediummessagemodel;
    }

    public void setMediummessagemodel(CountryProfileDataModel mediummessagemodel) {
        this.mediummessagemodel = mediummessagemodel;
    }

    public CountryProfile getSelectedcollege() {
        return selectedcollege;
    }

    public void setSelectedcollege(CountryProfile selectedcollege) {
        this.selectedcollege = selectedcollege;
    }

    public CountryProfile[] getSelectedcolleges() {
        return selectedcolleges;
    }

    public void setSelectedmessages(CountryProfile[] selectedmessages) {
        this.selectedcolleges = selectedcolleges;
    }

    public List getCountries() {
        return countries;
    }

    public void setCountries(List countries) {
        this.countries = countries;
    }

    private CountryProfile[] selectedcolleges;

    private List countries;

    public CountryProfileBean() {

        countries = new ArrayList<>();

        CountryProfile c1 = new CountryProfile();
        c1.setSI("1");
        c1.setName("AUSTRALIA");
        c1.setAcronomy("AUS");
        c1.setZoneName("Mysore");
        
        c1.setZoneCities("24");
        c1.setStatus("Active");
        c1.setActions("ACTIVE");
        c1.setAlias("Bharath");
        c1.setCountry_status(true);

        CountryProfile c2 = new CountryProfile();
        c2.setSI("2");
        c2.setName("INDIA");
        c2.setStatus("Active");
        c2.setAcronomy("IND");
        c2.setActions("ACTIVE");
        c2.setAlias("Sharath");
        c2.setZoneName("Gulbarga");
     
        c2.setCountry_status(true);
        c2.setZoneCities("33");
        
        CountryProfile c3 = new CountryProfile();
        c3.setSI("3");
        c3.setName("JAPAN");
        c3.setStatus("EDIT");
        c3.setAcronomy("YES");
        c3.setActions("ACTIVE");
        c3.setZoneName("Belgaum");
        
        c3.setAlias("bahubali");
        c3.setCountry_status(true);
        c3.setZoneCities("12");
        
        CountryProfile c4 = new CountryProfile();
        c4.setSI("4");
        c4.setName("CHINA");
        c4.setStatus("EDIT");
        c4.setAcronomy("YES");
        c4.setActions("ACTIVE");
        c4.setZoneName("Bangalore");
     
        c4.setAlias("Kiran");
        c4.setCountry_status(true);
        c4.setZoneCities("20");
        
        CountryProfile c5 = new CountryProfile();
        c5.setSI("5");
        c5.setName("ENGLAND");
        c5.setStatus("EDIT");
        c5.setAcronomy("YES");
        c5.setActions("ACTIVE");
        c5.setZoneName("Davanagere");
       
        c5.setAlias("Swaroop");
        c5.setCountry_status(true);
        c5.setZoneCities("40");
        
        CountryProfile c6 = new CountryProfile();
        c6.setSI("6");
        c6.setName("AFRICA");
        c6.setStatus("EDIT");
        c6.setAcronomy("YES");
        c6.setActions("ACTIVE");
        c6.setAlias("Larence");
        c6.setCountry_status(true);
        c6.setZoneName("Shimoga");
    
         c6.setZoneCities("44");
         
        colleges = new ArrayList<>();       
        colleges.add(c1);
        colleges.add(c2);
        colleges.add(c3);
        colleges.add(c4);
        colleges.add(c5);
        colleges.add(c6);

        mediummessagemodel = new CountryProfileDataModel(colleges);
    }

    public void onEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("table row Edited", ((CountryProfile) event.getObject()).getName());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("row editing Cancelled", ((CountryProfile) event.getObject()).getName());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void handleFileUpload(FileUploadEvent event) {
        FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
