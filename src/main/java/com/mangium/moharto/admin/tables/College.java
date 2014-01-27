/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium.moharto.admin.tables;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.CellEditEvent;

/**
 *
 * @author uday
 */
@ManagedBean
@SessionScoped
public class College implements Serializable {
    private List<CollegeBean> collegesrow;

    //0-param constructor
    public College(List<CollegeBean> collegesrow) {
        this.collegesrow = collegesrow;
    }
    
    //getter method for table which will call by table
    public List<CollegeBean> getCollegesrow() {
        return collegesrow;
    }

    //put some sample data into collegesrow variable
    
    //event listner method defination for oncelledit event
    public void onCellEdit(CellEditEvent event) {  
        Object oldValue = event.getOldValue();  
        Object newValue = event.getNewValue();  
          
        if(newValue != null && !newValue.equals(oldValue)) {  
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);  
            FacesContext.getCurrentInstance().addMessage(null, msg);  
        }
    }
}
