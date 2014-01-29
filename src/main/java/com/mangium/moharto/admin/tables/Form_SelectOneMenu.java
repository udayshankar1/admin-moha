/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangium.moharto.admin.tables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Acer
 */
@ManagedBean
@RequestScoped
public class Form_SelectOneMenu {

    private String country;
    private String state;
    private String zone;

    private ArrayList countries;
    private ArrayList states;
    private ArrayList zones;

    private Map stat;
    private Map zon;

    public Form_SelectOneMenu() {
        countries = new ArrayList();
        countries.add("India");
        countries.add("Pakistan");

        ArrayList state_india = new ArrayList();
        state_india.add("Karnataka");
        state_india.add("Andra");

        ArrayList state_pakistan = new ArrayList();
        state_pakistan.add("Lahore");
        state_pakistan.add("Karachi");

        stat = new HashMap();
        stat.put("India", state_india);
        stat.put("Pakistan", state_pakistan);

        ArrayList zone_Karnataka = new ArrayList();
        zone_Karnataka.add("Bangalore North");
        zone_Karnataka.add("Bangalore South");

        ArrayList zone_Andra = new ArrayList();
        zone_Andra.add("Andra West");
        zone_Andra.add("Andra East");

        ArrayList zone_Lahore = new ArrayList();
        zone_Lahore.add("Lahore South");
        zone_Lahore.add("Lahore East");

        ArrayList zone_Karachi = new ArrayList();
        zone_Karachi.add("Karachi North");
        zone_Karachi.add("Karachi West");

        zon = new HashMap();
        zon.put("Karnataka", zone_Karnataka);
        zon.put("Andra", zone_Andra);

    }

    public void sta() {
        states = (ArrayList) stat.get(country);

    }

    public void zoo() {
        zones = (ArrayList) zon.get(state);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
         System.out.println("----------------------------------"+country);
        this.country = country;
    }

    public ArrayList getCountries() {
        return countries;
    }

    public void setCountries(ArrayList countries) {
        this.countries = countries;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        System.out.println("----------------------------------"+state);
        this.state = state;
    }

    public ArrayList getStates() {
        return states;
    }

    public void setStates(ArrayList states) {
        this.states = states;
    }

    public Map getStat() {
        return stat;
    }

    public void setStat(Map stat) {
        this.stat = stat;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
         System.out.println("----------------------------------"+zone);
        this.zone = zone;
    }

    public ArrayList getZones() {
        return zones;
    }

    public void setZones(ArrayList zones) {
        this.zones = zones;
    }

    public Map getZon() {
        return zon;
    }

    public void setZon(Map zon) {
        this.zon = zon;
    }

}
