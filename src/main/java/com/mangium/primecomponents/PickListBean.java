/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium.primecomponents;

/**
 *
 * @author uday
 */
import java.util.ArrayList;  
import java.util.List;  
import javax.faces.application.FacesMessage;  
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;  
import org.primefaces.event.TransferEvent;  
  
  
import org.primefaces.model.DualListModel; 

@ManagedBean
@RequestScoped
public class PickListBean {
//    private DualListModel<Player> players;  
      
    private DualListModel<String> cities;  
  
    public PickListBean() {  
        //Players  
//        List<Player> source = new ArrayList<Player>();  
//        List<Player> target = new ArrayList<Player>();  
//          
//        source.add(new Player("Messi", 10, "Untitled.png"));  
//        source.add(new Player("Iniesta", 8, "addmania_1.png"));  
//        source.add(new Player("Villa", 7, "addmaniaw.png"));  
//        source.add(new Player("Alves", 2, "askquestion.png"));  
//        source.add(new Player("Xavi", 6, "boy.png"));  
//        source.add(new Player("Puyol", 5, "c.png"));      
//          
//        players = new DualListModel<Player>(source, target);  
          
        //Cities  
        List<String> citiesSource = new ArrayList<String>();  
        List<String> citiesTarget = new ArrayList<String>();  
          
    
        
        citiesSource.add("MBA(Finance)");  
        citiesSource.add("MBA(HR)");  
        citiesSource.add("MBA(Marketing)");  
        citiesSource.add("B.Tech(CSE)");  
        citiesSource.add("B.Tech(ECE)");  
             citiesSource.add("B.Tech(EEE)");  
          
        cities = new DualListModel<String>(citiesSource, citiesTarget);  
    }  
      
//    public DualListModel<Player> getPlayers() {  
//        return players;  
//    }  
//    public void setPlayers(DualListModel<Player> players) {  
//        this.players = players;  
//    }  
      
    public DualListModel<String> getCities() {  
        return cities;    
}  
    public void setCities(DualListModel<String> cities) {  
        this.cities = cities;  
    }  
      
    public void onTransfer(TransferEvent event) {  
        StringBuilder builder = new StringBuilder();  
        for(Object item : event.getItems()) {  
//            builder.append(((Player) item).getName()).append("<br />");  
        }  
          
        FacesMessage msg = new FacesMessage();  
        msg.setSeverity(FacesMessage.SEVERITY_INFO);  
        msg.setSummary("Items Transferred");  
        msg.setDetail(builder.toString());  
          
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
    
}
