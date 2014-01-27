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
        private List<CollegeProfile> messages;

    private CollegeProfileDataModel mediummessagemodel;

    private CollegeProfile selectedmessage;
    
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<CollegeProfile> getMessages() {
        return messages;
    }

    public void setMessages(List<CollegeProfile> messages) {
        this.messages = messages;
    }

    public CollegeProfileDataModel getMediummessagemodel() {
        return mediummessagemodel;
    }

    public void setMediummessagemodel(CollegeProfileDataModel mediummessagemodel) {
        this.mediummessagemodel = mediummessagemodel;
    }

    public CollegeProfile getSelectedmessage() {
        return selectedmessage;
    }

    public void setSelectedmessage(CollegeProfile selectedmessage) {
        this.selectedmessage = selectedmessage;
    }

    public CollegeProfile[] getSelectedmessages() {
        return selectedmessages;
    }

    public void setSelectedmessages(CollegeProfile[] selectedmessages) {
        this.selectedmessages = selectedmessages;
    }

   

 

    private CollegeProfile[] selectedmessages;
    
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
     c1.setCourse("MBA");
     c1.setSpecialization("Finance");
     c1.setSeats("60");
     c1.setLastdate("12-12-14");
     c1.setFee("50,000");
     
     
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
     
        messages = new ArrayList<CollegeProfile>();
        
        messages.add(c1);
        messages.add(c2);
        messages.add(c3);
        messages.add(c4);
        messages.add(c5);



        mediummessagemodel = new CollegeProfileDataModel(messages);
    }

    public List getCountries() {
        return countries;
    }

    public void setCountries(List countries) {
        this.countries = countries;
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
