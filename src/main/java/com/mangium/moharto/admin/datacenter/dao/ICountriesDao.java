/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium.moharto.admin.datacenter.dao;

import com.mangium.moharto.admin.datacenter.model.Countries;
import java.util.List;

/**
 *
 * @author uday
 */
public interface ICountriesDao {
// declare only database related methodes/behaviours here    
    void addCountries(Countries countries);

    void delCountries(Countries countries);

    void updateCountries(Countries countries);

    List<Countries> findAllCountries();
    
}
