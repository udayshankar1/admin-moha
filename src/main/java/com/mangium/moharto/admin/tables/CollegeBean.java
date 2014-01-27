/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium.moharto.admin.tables;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author uday
 */
@ManagedBean
@SessionScoped
public class CollegeBean implements Serializable{
    private String collegeName;
    private String collegeAcronomy;
    private String collegeCredentials;
    private String collegeUniversity;
    private String collegeEstablishment;
    private String collegeCity;
    private String collegeAdress;
    private String collegeWebsite;
    private String collegeVideo;
    private String collegePhoto;
    private String collegeHostel;
    private String collegePlacement;
    private String collegeTransportation;
    private String collegeLogo;
    private String collegeDescription;

    public CollegeBean(String collegeName, String collegeAcronomy, String collegeCredentials, String collegeUniversity, String collegeEstablishment, String collegeCity, String collegeAdress, String collegeWebsite, String collegeVideo, String collegePhoto, String collegeHostel, String collegePlacement, String collegeTransportation, String collegeLogo, String collegeDescription) {
        this.collegeName = collegeName;
        this.collegeAcronomy = collegeAcronomy;
        this.collegeCredentials = collegeCredentials;
        this.collegeUniversity = collegeUniversity;
        this.collegeEstablishment = collegeEstablishment;
        this.collegeCity = collegeCity;
        this.collegeAdress = collegeAdress;
        this.collegeWebsite = collegeWebsite;
        this.collegeVideo = collegeVideo;
        this.collegePhoto = collegePhoto;
        this.collegeHostel = collegeHostel;
        this.collegePlacement = collegePlacement;
        this.collegeTransportation = collegeTransportation;
        this.collegeLogo = collegeLogo;
        this.collegeDescription = collegeDescription;
    }

    
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeAcronomy() {
        return collegeAcronomy;
    }

    public void setCollegeAcronomy(String collegeAcronomy) {
        this.collegeAcronomy = collegeAcronomy;
    }

    public String getCollegeCredentials() {
        return collegeCredentials;
    }

    public void setCollegeCredentials(String collegeCredentials) {
        this.collegeCredentials = collegeCredentials;
    }

    public String getCollegeUniversity() {
        return collegeUniversity;
    }

    public void setCollegeUniversity(String collegeUniversity) {
        this.collegeUniversity = collegeUniversity;
    }

    public String getCollegeEstablishment() {
        return collegeEstablishment;
    }

    public void setCollegeEstablishment(String collegeEstablishment) {
        this.collegeEstablishment = collegeEstablishment;
    }

    public String getCollegeCity() {
        return collegeCity;
    }

    public void setCollegeCity(String collegeCity) {
        this.collegeCity = collegeCity;
    }

    public String getCollegeAdress() {
        return collegeAdress;
    }

    public void setCollegeAdress(String collegeAdress) {
        this.collegeAdress = collegeAdress;
    }

    public String getCollegeWebsite() {
        return collegeWebsite;
    }

    public void setCollegeWebsite(String collegeWebsite) {
        this.collegeWebsite = collegeWebsite;
    }

    public String getCollegeVideo() {
        return collegeVideo;
    }

    public void setCollegeVideo(String collegeVideo) {
        this.collegeVideo = collegeVideo;
    }

    public String getCollegePhoto() {
        return collegePhoto;
    }

    public void setCollegePhoto(String collegePhoto) {
        this.collegePhoto = collegePhoto;
    }

    public String getCollegeHostel() {
        return collegeHostel;
    }

    public void setCollegeHostel(String collegeHostel) {
        this.collegeHostel = collegeHostel;
    }

    public String getCollegePlacement() {
        return collegePlacement;
    }

    public void setCollegePlacement(String collegePlacement) {
        this.collegePlacement = collegePlacement;
    }

    public String getCollegeTransportation() {
        return collegeTransportation;
    }

    public void setCollegeTransportation(String collegeTransportation) {
        this.collegeTransportation = collegeTransportation;
    }

    public String getCollegeLogo() {
        return collegeLogo;
    }

    public void setCollegeLogo(String collegeLogo) {
        this.collegeLogo = collegeLogo;
    }

    public String getCollegeDescription() {
        return collegeDescription;
    }

    public void setCollegeDescription(String collegeDescription) {
        this.collegeDescription = collegeDescription;
    }
    
    
}
