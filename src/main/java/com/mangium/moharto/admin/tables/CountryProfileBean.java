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
        c1.setCities("Bangalore");
        c1.setZoneCities("24");
        c1.setStatus("Active");
        c1.setActions("ACTIVE");
        c1.setAlias("Bharath");
        c1.setCourseLevels("After 10");
        c1.setCourseNames("Bachelor of Engineering");
        c1.setCourseAcronomy("BE");
//        c1.setCourseLevelName("After 10");
//        c1.setCourseLevels("33");
        c1.setCourseLevel("31");
        c1.setSpecialization("Finance");

        CountryProfile c2 = new CountryProfile();
        c2.setSI("2");
        c2.setName("INDIA");
        c2.setStatus("Active");
        c2.setAcronomy("IND");
        c2.setActions("ACTIVE");
        c2.setAlias("Sharath");
        c2.setZoneName("Gulbarga");
        c2.setCities("Davanagere");
        c2.setCourseLevels("After UG");
        c2.setZoneCities("33");
        c2.setCourseNames("Master of Bussiness Administration");
        c2.setCourseAcronomy("MBA");
//        c2.setCourseLevelName("After PG");
//        c2.setCourseLevels("12");
        c2.setCourseLevel("22");
        c2.setSpecialization("Marketing");

        CountryProfile c3 = new CountryProfile();
        c3.setSI("3");
        c3.setName("JAPAN");
        c3.setStatus("EDIT");
        c3.setAcronomy("YES");
        c3.setActions("ACTIVE");
        c3.setZoneName("Belgaum");
        c3.setCities("Mysore");
        c3.setAlias("bahubali");
        c3.setCourseLevels("After PG");
        c3.setZoneCities("12");
        c3.setCourseNames("Bachelor of Technology");
        c3.setCourseAcronomy("BTech");
//        c3.setCourseLevelName("After UG");
//        c3.setCourseLevels("23");
        c3.setCourseLevel("45");
        c3.setSpecialization("HR");

        CountryProfile c4 = new CountryProfile();
        c4.setSI("4");
        c4.setName("CHINA");
        c4.setStatus("EDIT");
        c4.setAcronomy("YES");
        c4.setActions("ACTIVE");
        c4.setZoneName("Bangalore");
        c4.setCities("Harihar");
        c4.setAlias("Kiran");
        c4.setCourseLevels("After PG");
        c4.setZoneCities("20");
        c4.setCourseNames("Master of Technology");
        c4.setCourseAcronomy("MTech");
//        c4.setCourseLevelName("After PG");
//        c4.setCourseLevels("23");
        c4.setCourseLevel("66");
        c4.setSpecialization("Bussiness");

        CountryProfile c5 = new CountryProfile();
        c5.setSI("5");
        c5.setName("ENGLAND");
        c5.setStatus("EDIT");
        c5.setAcronomy("YES");
        c5.setActions("ACTIVE");
        c5.setZoneName("Davanagere");
        c5.setCities("Chitradurga");
        c5.setAlias("Swaroop");
        c5.setCourseLevels("After PG");
        c5.setZoneCities("40");
        c5.setCourseNames("Master of Computer Application");
        c5.setCourseAcronomy("MCA");
//        c5.setCourseLevelName("After PG");
//        c5.setCourseLevels("40");
        c5.setCourseLevel("55");
        c5.setSpecialization("Finance");

        CountryProfile c6 = new CountryProfile();
        c6.setSI("6");
        c6.setName("AFRICA");
        c6.setStatus("EDIT");
        c6.setAcronomy("YES");
        c6.setActions("ACTIVE");
        c6.setAlias("Larence");
        c6.setCourseLevels("After PG");
        c6.setZoneName("Shimoga");
        c6.setCities("Hubli");
        c6.setZoneCities("44");
        c6.setCourseNames("Bachelor of Science");
        c6.setCourseAcronomy("BSc");
//        c6.setCourseLevelName("After 10");
//        c6.setCourseLevels("50");
        c6.setCourseLevel("22");
        c6.setSpecialization("Finance");

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
