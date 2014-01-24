package com.mangium.moharto.admin.tables;

/**
 *
 * @author uday
 */
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class CollegeApprovalsTableArray {
   public ArrayList table;
    public ArrayList getArray(){
        return table;
    }
    public CollegeApprovalsTableArray() {
        table = new ArrayList();
        CollegeApprovalsTable t = new CollegeApprovalsTable();
        t.setCollege_name("Ramaiah College");
        t.setDate("01/01/2014");
        t.setUniversity("VTU");
        t.setCity("Banglore");
        t.setPackages("Free");
          t.setStatus("Active");
        table.add(t);
        CollegeApprovalsTable t1 = new CollegeApprovalsTable();
        t1.setCollege_name("Brindavan College");
        t1.setDate("01/12/2013");
        t1.setUniversity("VTU");
        t1.setCity("Banglore");
        t1.setPackages("Gold");
        t1.setStatus("Active");
        table.add(t1);
         CollegeApprovalsTable t2 = new CollegeApprovalsTable();
         t2.setCollege_name("City College");
        t2.setDate("01/11/2013");
        t2.setUniversity("Banglore University");
        t2.setCity("Banglore");
          t2.setStatus("Idle");
        t2.setPackages("Free");
        table.add(t2);
         CollegeApprovalsTable t3 = new CollegeApprovalsTable();
         t3.setCollege_name("Christ College");
        t3.setDate("01/11/2013");
        t3.setUniversity("Christ");
        t3.setCity("Banglore");
        t3.setPackages("Platinum");
          t3.setStatus("In-Active");
        table.add(t3);
        CollegeApprovalsTable t4 = new CollegeApprovalsTable();
         t4.setCollege_name("Oakridge College");
        t4.setDate("01/11/2013");
        t4.setUniversity("Mysore University");
        t4.setCity("Mysore");
        t4.setPackages("Free");
          t4.setStatus("Active");
        table.add(t4);
    }
     
}
