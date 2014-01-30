package com.mangium.moharto.admin.tables;

/**
 *
 * @author uday
 */
import java.util.List;  
import javax.faces.model.ListDataModel;  
 import org.primefaces.model.SelectableDataModel;

public class CollegeProfileDataModel  extends ListDataModel<CollegeProfile> implements SelectableDataModel<CollegeProfile> {
    
    public CollegeProfileDataModel()
    {
        
    }
    
    public CollegeProfileDataModel(List<CollegeProfile> data) {  
        super(data);  
    }  
    
    @Override
           public CollegeProfile getRowData(String rowKey) {  
     
          
        List<CollegeProfile> messages = (List<CollegeProfile>) getWrappedData();  
          
        for(CollegeProfile mg:messages ) {  
            if(mg.getCourse().equals(rowKey))  
                return mg;  
        }  
          
        return null;  
    }  

    @Override
    public Object getRowKey(CollegeProfile t) {
              return t.getCourse(); 
    }
}
