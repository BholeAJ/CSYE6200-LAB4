package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author simha
 */
public class User {

    private String firstName;
    private String lastName;
    private int age;
    private Date dateOfBirth;
    private String gender;
    private String email;
    private String phone;
    private String continent;
    private String experience;
    private String photoPath;
    private ImageIcon picture;

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public ImageIcon getPicture() {
        return picture;
    }

    public void setPicture(ImageIcon picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        String dob = dateOfBirth == null ? "" : new SimpleDateFormat("MM/dd/yyyy").format(dateOfBirth);
        return "First Name: " + firstName
                + "\nLast Name: " + lastName
                + "\nDate of Birth: " + dob
                + "\nAge: " + age
                + "\nGender: " + gender
                + "\nEmail: " + email
                + "\nPhone: " + phone
                + "\nContinent: " + continent
                + "\nExperience: " + experience;
    }
}
