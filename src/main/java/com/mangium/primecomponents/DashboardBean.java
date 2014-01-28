package com.mangium.primecomponents;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

/**
 *
 * @author uday
 */

@ManagedBean
@RequestScoped
public class DashboardBean implements Serializable {  
  
    private DashboardModel model;  
      
    public DashboardBean() {  
        model = new DefaultDashboardModel();  
        DashboardColumn column1 = new DefaultDashboardColumn();  
        DashboardColumn column2 = new DefaultDashboardColumn();  
        DashboardColumn column3 = new DefaultDashboardColumn();
        
          
        column1.addWidget("dboard-squrebox-updates");
        column1.addWidget("dboard-college-approvals");  
        column1.addWidget("dboard-latest-messages");  
        
        column1.addWidget("dboard-latest-reviews");
        
        column1.addWidget("dboard-college-renuals");
        column1.addWidget("dboard-mis");
        column2.addWidget("dboard-latst-admissions");
        column2.addWidget("dboard-latest-ads");                   
        column3.addWidget("dboard-ads-renuals");                                        
        column3.addWidget("dboard-latest-tx");        
        
        
  
        model.addColumn(column1);  
        model.addColumn(column2);  
        model.addColumn(column3);  
    }  
      
    public void handleReorder(DashboardReorderEvent event) {  
        FacesMessage message = new FacesMessage();  
        message.setSeverity(FacesMessage.SEVERITY_INFO);  
        message.setSummary("Reordered: " + event.getWidgetId());  
        message.setDetail("Item index: " + event.getItemIndex() + ", Column index: " + event.getColumnIndex() + ", Sender index: " + event.getSenderColumnIndex());  
          
        addMessage(message);  
    }  
      
      
    private void addMessage(FacesMessage message) {  
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }  
      
    public DashboardModel getModel() {  
        return model;  
    }  
}  
