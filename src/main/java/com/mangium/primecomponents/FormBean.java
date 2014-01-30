package com.mangium.primecomponents;

/**
 *
 * @author uday
 */
import java.io.Serializable;  
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
  
public class FormBean implements Serializable {  
  
    private boolean value1;  
  
    private boolean value2;  
  
    public boolean isValue1() {  
        return value1;  
    }  
  
    public void setValue1(boolean value1) {  
        this.value1 = value1;  
    }  
  
    public boolean isValue2() {  
        return value2;  
    }  
  
    public void setValue2(boolean value2) {  
        this.value2 = value2;  
    }  
  
    public void addMessage() {  
        String summary = value2 ? "Active" : "In-Active";  
  
        FacesContext.getCurrentInstance().addMessage("AJAX UPDATE", new FacesMessage(summary));  
    }  
}  
