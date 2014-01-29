/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium.moharto.admin.tables;

/**
 *
 * @author uday
 */
import java.util.List;  
import javax.faces.model.ListDataModel;  
 import org.primefaces.model.SelectableDataModel;

public class CountryProfileDataModel  extends ListDataModel<CountryProfile> implements SelectableDataModel<CountryProfile> {
    
    public CountryProfileDataModel()
    {
        
    }
    
    public CountryProfileDataModel(List<CountryProfile> data) {  
        super(data);  
    }  
    
    @Override
           public CountryProfile getRowData(String rowKey) {  
     
          
        List<CountryProfile> messages = (List<CountryProfile>) getWrappedData();  
          
        for(CountryProfile mg:messages ) {  
            if(mg.getName().equals(rowKey))  
                return mg;  
        }  
          
        return null;  
    }  

    @Override
    public Object getRowKey(CountryProfile t) {
              return t.getName(); 
    }
}
