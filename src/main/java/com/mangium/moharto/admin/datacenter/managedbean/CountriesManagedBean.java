/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium.moharto.admin.datacenter.managedbean;

import com.mangium.moharto.admin.datacenter.bo.ICountriesBo;
import java.io.Serializable;
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
    ICountriesBo countries;
// call bussinees methodes, do database related operations here
    public CountriesManagedBean() {
    }
    
}