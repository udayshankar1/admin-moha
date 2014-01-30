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
public class CollegeProfileBean {
    private List<CollegeProfile> colleges;

    private CollegeProfileDataModel mediummessagemodel;


    private CollegeProfile selectedcollege;
    
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<CollegeProfile> getColleges() {
        return colleges;
    }

    public void setMessages(List<CollegeProfile> colleges) {
        this.colleges = colleges;
    }

    public CollegeProfileDataModel getMediummessagemodel() {
        return mediummessagemodel;
    }

    public void setMediummessagemodel(CollegeProfileDataModel mediummessagemodel) {
        this.mediummessagemodel = mediummessagemodel;
    }

    public CollegeProfile getSelectedcollege() {
        return selectedcollege;
    }

    public void setSelectedcollege(CollegeProfile selectedcollege) {
        this.selectedcollege = selectedcollege;
    }

    public CollegeProfile[] getSelectedcolleges() {
        return selectedcolleges;
    }

    public void setSelectedmessages(CollegeProfile[] selectedmessages) {
        this.selectedcolleges = selectedcolleges;
    }
    
    public List getCountries() {
        return countries;
    }

    public void setCountries(List countries) {
        this.countries = countries;
    }

    private CollegeProfile[] selectedcolleges;
    
    private List countries;

    public CollegeProfileBean() {
        
        countries=new ArrayList();
        CollegeProfile a1=new CollegeProfile();
        a1.setCountry("India");
       
        countries.add(a1);
        
//        a1.setCity("");
//        a1.setZone("");
//        a1.setUniversity("");
//        
//        
//          CollegeProfile a2=new CollegeProfile();
//        a2.setCountry("China");
//         a2.setState("");
//        a2.setCity("");
//        a2.setZone("");
//        a2.setUniversity("");
//        
//          CollegeProfile a3=new CollegeProfile();
//        a3.setCountry("Nepal");
//         a3.setState("");
//        a2.setCity("");
//        a2.setZone("");
//        a2.setUniversity("");
                

     CollegeProfile c1=new CollegeProfile();
     c1.setCourse("Brindavan College");
     c1.setSpecialization("BVC");
     c1.setSeats("Ranked with A");
     c1.setLastdate("12-12-1990");
     c1.setFee("VTU");
     c1.setCollege_name("Brindavan College");
     c1.setCollege_acronomy("Banglore");
     c1.setCollege_adress("#1 mg road");
     c1.setCollege_description("top ranced college");
     c1.setCollege_established("12-12-1990");
     c1.setCollege_logo("\"http://www.gravatar.com/avatar/3232415a0380253cfffe19163d04acab.png?s=50\"");
     c1.setCollege_status("Active");
     c1.setCollege_university("VTU");
     c1.setCollege_vediospath("vedio link1");
     c1.setCollege_photospath("photolink2");
     c1.setCollege_websiteurl("www.brindavan.com");
     
     
     
     CollegeProfile c2=new CollegeProfile();
     c2.setCourse("MBA");
     c2.setSpecialization("HR");
     c2.setSeats("70");
     c2.setLastdate("08-06-14");
     c2.setFee("45,000");
     
     
     CollegeProfile c3=new CollegeProfile();
     c3.setCourse("MBA");
     c3.setSpecialization("Logistics");
     c3.setSeats("35");
     c3.setLastdate("07-06-14");
     c3.setFee("60,000");
     
     
     CollegeProfile c4=new CollegeProfile();
     c4.setCourse("B.Tech");
     c4.setSpecialization("Computers");
     c4.setSeats("40");
     c4.setLastdate("24-06-14");
     c4.setFee("60,000");
     
     
     CollegeProfile c5=new CollegeProfile();
     c5.setCourse("B.Tech");
     c5.setSpecialization("Electronics");
     c5.setSeats("60");
     c5.setLastdate("28-07-14");
     c5.setFee("55,000");
     
        colleges = new ArrayList<CollegeProfile>();
        
        colleges.add(c1);
        colleges.add(c2);
        colleges.add(c3);
        colleges.add(c4);
        colleges.add(c5);



        mediummessagemodel = new CollegeProfileDataModel(colleges);
    }

    
     public void onEdit(RowEditEvent event) {  
        FacesMessage msg = new FacesMessage("table row Edited", ((CollegeProfile) event.getObject()).getCourse());  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
      
    public void onCancel(RowEditEvent event) {  
        FacesMessage msg = new FacesMessage("row editing Cancelled", ((CollegeProfile) event.getObject()).getCourse());  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
    
     public void handleFileUpload(FileUploadEvent event) {  
        FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
}
