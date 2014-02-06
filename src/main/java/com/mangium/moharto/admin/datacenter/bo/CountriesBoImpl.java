/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium.moharto.admin.datacenter.bo;

import com.mangium.moharto.admin.datacenter.model.Countries;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uday
 */
public class CountriesBoImpl implements ICountriesBo {

    @Override
    public void addCountries(Countries countries) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delCountries(Countries countries) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCountries(Countries countries) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Countries> findAllCountries() {
        //static code starts
        System.out.println("# find all countries methode called #");
         List<Countries> countries;
         
         countries = new ArrayList<>();
         System.out.println("countries obj"+countries);
        Countries c1 = new Countries();
        c1.setCountry_id(10);
        c1.setCountry_name("india");
        c1.setCountry_acronym("IND");
        c1.setCountry_status("true");
        System.out.println("after setting values c1="+c1);
        countries.add(c1);
        System.out.println("countries obj"+countries);
//        static code ends
        
//        dynamic data loading starts
        
//        use dao obj to call actual functions
        
//        dynamic data loading ends
        return countries;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
