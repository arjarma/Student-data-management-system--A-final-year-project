/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author arjarma
 */
@Entity
@Table(name = "studentdata", catalog = "mysql", schema = "")
@NamedQueries({
    @NamedQuery(name = "Studentdata.findAll", query = "SELECT s FROM Studentdata s"),
    @NamedQuery(name = "Studentdata.findByEnrollmentNo", query = "SELECT s FROM Studentdata s WHERE s.enrollmentNo = :enrollmentNo"),
    @NamedQuery(name = "Studentdata.findByName", query = "SELECT s FROM Studentdata s WHERE s.name = :name"),
    @NamedQuery(name = "Studentdata.findByFathersName", query = "SELECT s FROM Studentdata s WHERE s.fathersName = :fathersName"),
    @NamedQuery(name = "Studentdata.findByAddress", query = "SELECT s FROM Studentdata s WHERE s.address = :address"),
    @NamedQuery(name = "Studentdata.findByDob", query = "SELECT s FROM Studentdata s WHERE s.dob = :dob"),
    @NamedQuery(name = "Studentdata.findByGender", query = "SELECT s FROM Studentdata s WHERE s.gender = :gender"),
    @NamedQuery(name = "Studentdata.findByEmailid", query = "SELECT s FROM Studentdata s WHERE s.emailid = :emailid"),
    @NamedQuery(name = "Studentdata.findByBranch", query = "SELECT s FROM Studentdata s WHERE s.branch = :branch"),
    @NamedQuery(name = "Studentdata.findByDepartment", query = "SELECT s FROM Studentdata s WHERE s.department = :department"),
    @NamedQuery(name = "Studentdata.findByBatch", query = "SELECT s FROM Studentdata s WHERE s.batch = :batch"),
    @NamedQuery(name = "Studentdata.findBySemester", query = "SELECT s FROM Studentdata s WHERE s.semester = :semester"),
    @NamedQuery(name = "Studentdata.findByCgpa", query = "SELECT s FROM Studentdata s WHERE s.cgpa = :cgpa"),
    @NamedQuery(name = "Studentdata.findByMobileNo", query = "SELECT s FROM Studentdata s WHERE s.mobileNo = :mobileNo")})
public class Studentdata implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Enrollment_No")
    private String enrollmentNo;
    @Column(name = "Name")
    private String name;
    @Column(name = "Fathers_Name")
    private String fathersName;
    @Column(name = "Address")
    private String address;
    @Column(name = "DOB")
    private String dob;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "Email_id")
    private String emailid;
    @Column(name = "Branch")
    private String branch;
    @Column(name = "Department")
    private String department;
    @Column(name = "Batch")
    private String batch;
    @Column(name = "Semester")
    private String semester;
    @Column(name = "Cgpa")
    private String cgpa;
    @Column(name = "Mobile_No")
    private String mobileNo;

    public Studentdata() {
    }

    public Studentdata(String enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    public String getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(String enrollmentNo) {
        String oldEnrollmentNo = this.enrollmentNo;
        this.enrollmentNo = enrollmentNo;
        changeSupport.firePropertyChange("enrollmentNo", oldEnrollmentNo, enrollmentNo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        String oldFathersName = this.fathersName;
        this.fathersName = fathersName;
        changeSupport.firePropertyChange("fathersName", oldFathersName, fathersName);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        String oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        String oldEmailid = this.emailid;
        this.emailid = emailid;
        changeSupport.firePropertyChange("emailid", oldEmailid, emailid);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        String oldBranch = this.branch;
        this.branch = branch;
        changeSupport.firePropertyChange("branch", oldBranch, branch);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        String oldDepartment = this.department;
        this.department = department;
        changeSupport.firePropertyChange("department", oldDepartment, department);
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        String oldBatch = this.batch;
        this.batch = batch;
        changeSupport.firePropertyChange("batch", oldBatch, batch);
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        String oldSemester = this.semester;
        this.semester = semester;
        changeSupport.firePropertyChange("semester", oldSemester, semester);
    }

    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        String oldCgpa = this.cgpa;
        this.cgpa = cgpa;
        changeSupport.firePropertyChange("cgpa", oldCgpa, cgpa);
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        String oldMobileNo = this.mobileNo;
        this.mobileNo = mobileNo;
        changeSupport.firePropertyChange("mobileNo", oldMobileNo, mobileNo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enrollmentNo != null ? enrollmentNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studentdata)) {
            return false;
        }
        Studentdata other = (Studentdata) object;
        if ((this.enrollmentNo == null && other.enrollmentNo != null) || (this.enrollmentNo != null && !this.enrollmentNo.equals(other.enrollmentNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "student.Studentdata[ enrollmentNo=" + enrollmentNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
