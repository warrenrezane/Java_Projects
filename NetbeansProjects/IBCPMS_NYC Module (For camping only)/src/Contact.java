/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Name of the User
 */
public class Contact {
    String name;
    String age;
    String gender;
    String churchName;
    String churchPos;
    String churchAdd;
    String district;
    String email;
    String contact;
    String pastorName;
    String pastorContact;
    String campsAttended;
    String allergy;

    public Contact(String name, String age, String gender, String churchName, String churchPos, String churchAdd, String district, String email, String contact, String pastorName, String pastorContact, String campsAttended, String allergy) {
        setName(name);
        setAge(age);
        setGender(gender);
        setChurchName(churchName);
        setChurchPos(churchPos);
        setChurchAdd(churchAdd);
        setDistrict(district);
        setEmail(email);
        setContact(contact);
        setPastorName(pastorName);
        setPastorContact(pastorContact);
        setCampsAttended(campsAttended);
        setAllergy(allergy);
    }

    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getChurchName() {
        return this.churchName;
    }

    public void setChurchName(String churchName) {
        this.churchName = churchName;
    }

    public String getChurchPos() {
        return this.churchPos;
    }

    public void setChurchPos(String churchPos) {
        this.churchPos = churchPos;
    }

    public String getChurchAdd() {
        return this.churchAdd;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    
    public void setChurchAdd(String churchAdd) {
        this.churchAdd = churchAdd;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPastorName() {
        return this.pastorName;
    }

    public void setPastorName(String pastorName) {
        this.pastorName = pastorName;
    }

    public String getPastorContact() {
        return this.pastorContact;
    }

    public void setPastorContact(String pastorContact) {
        this.pastorContact = pastorContact;
    }

    public String getCampsAttended() {
        return this.campsAttended;
    }

    public void setCampsAttended(String campsAttended) {
        this.campsAttended = campsAttended;
    }

    public String getAllergy() {
        return this.allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }
}
