/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium.moharto.admin.datacenter.managedbean;

import com.mangium.moharto.admin.datacenter.bo.ICountriesBo;
import com.mangium.moharto.admin.datacenter.model.Countries;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author uday
 */
@ManagedBean
@RequestScoped
public class CountriesManagedBean implements Serializable{

        

    
    
    /**
     * Create a object for IcountriesBo call bussiness methodes with that object
     */
    
    private ICountriesBo countries;
//getters and setters for bo object
    
//    this methode will be called by data table first
     public List<Countries> getCountries() {
         System.out.println("in getCountries methode");
//         here we are calling bo methode with bo object
        return countries.findAllCountries();
    }

    public void setCountries(ICountriesBo countries) {
        this.countries = countries;
    }
    


// get all list of countries from database
     

// call bussinees methodes, do database related operations here

   public List<Countries> fetchCountriesList(){
   
       System.out.println("in fetch methode");
       return countries.findAllCountries();
   }
   

}
