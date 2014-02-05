package com.mangium.moharto.admin.tables;

/**
 *
 * @author uday
 */
public class CountryProfile {

    private String SI;
    private String Name;
    private String Acronomy;
    private String Alias;
    private String Status;
    private String Actions;

    private String zoneName;
    private String zoneCities;
    private String Cities;
    private String courseLevels;
    private String courseNames;
    private String courseAcronomy;
    
//    private String CourseLevelName;
//    private String CourseLevel;
    private String courseLevel;
     private String specialization;
    
    
    

    public String getSI() {
        return SI;
    }

    public void setSI(String SI) {
        this.SI = SI;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAcronomy() {
        return Acronomy;
    }

    public void setAcronomy(String Acronomy) {
        this.Acronomy = Acronomy;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getActions() {
        return Actions;
    }

    public void setActions(String Actions) {
        this.Actions = Actions;
    }

    private boolean country_status;

    public boolean isCountry_status() {
        return country_status;
    }

    public void setCountry_status(boolean country_status) {
        this.country_status = country_status;
    }

    public String getCities() {
        return Cities;
    }

    public void setCities(String Cities) {
        this.Cities = Cities;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getZoneCities() {
        return zoneCities;
    }

    public void setZoneCities(String zoneCities) {
        this.zoneCities = zoneCities;
    }

    public String getCourseLevels() {
        return courseLevels;
    }

    public void setCourseLevels(String courseLevels) {
        this.courseLevels = courseLevels;
    }

    public String getCourseNames() {
        return courseNames;
    }

    public void setCourseNames(String courseNames) {
        this.courseNames = courseNames;
    }

    public String getCourseAcronomy() {
        return courseAcronomy;
    }

    public void setCourseAcronomy(String courseAcronomy) {
        this.courseAcronomy = courseAcronomy;
    }

//    public String getCourseLevelName() {
//        return CourseLevelName;
//    }
//
//    public void setCourseLevelName(String CourseLevelName) {
//        this.CourseLevelName = CourseLevelName;
//    }
////
////    public String getCourseLevel() {
//        return CourseLevel;
//    }
//
//    public void setCourseLevel(String CourseLevel) {
//        this.CourseLevel = CourseLevel;
//    }
//    public String getCl() {
//        return cl;
//    }
//
//    public void setCl(String cl) {
//        this.cl = cl;
//    }
    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    
    
    
}
