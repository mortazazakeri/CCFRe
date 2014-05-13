package jclasschin.entity;
// Generated May 13, 2014 4:54:01 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Person generated by hbm2java
 */
public class Person  implements java.io.Serializable {


     private Integer id;
     private Field field;
     private Job job;
     private String title;
     private String firstName;
     private String lastName;
     private boolean sex;
     private String phone;
     private Set mailsForReceiverPersonId = new HashSet(0);
     private Set mailsForSenderPersonId = new HashSet(0);
     private Set cctms = new HashSet(0);
     private Set users = new HashSet(0);

    public Person() {
    }

	
    public Person(String firstName, String lastName, boolean sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }
    public Person(Field field, Job job, String title, String firstName, String lastName, boolean sex, String phone, Set mailsForReceiverPersonId, Set mailsForSenderPersonId, Set cctms, Set users) {
       this.field = field;
       this.job = job;
       this.title = title;
       this.firstName = firstName;
       this.lastName = lastName;
       this.sex = sex;
       this.phone = phone;
       this.mailsForReceiverPersonId = mailsForReceiverPersonId;
       this.mailsForSenderPersonId = mailsForSenderPersonId;
       this.cctms = cctms;
       this.users = users;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Field getField() {
        return this.field;
    }
    
    public void setField(Field field) {
        this.field = field;
    }
    public Job getJob() {
        return this.job;
    }
    
    public void setJob(Job job) {
        this.job = job;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public boolean isSex() {
        return this.sex;
    }
    
    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Set getMailsForReceiverPersonId() {
        return this.mailsForReceiverPersonId;
    }
    
    public void setMailsForReceiverPersonId(Set mailsForReceiverPersonId) {
        this.mailsForReceiverPersonId = mailsForReceiverPersonId;
    }
    public Set getMailsForSenderPersonId() {
        return this.mailsForSenderPersonId;
    }
    
    public void setMailsForSenderPersonId(Set mailsForSenderPersonId) {
        this.mailsForSenderPersonId = mailsForSenderPersonId;
    }
    public Set getCctms() {
        return this.cctms;
    }
    
    public void setCctms(Set cctms) {
        this.cctms = cctms;
    }
    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }




}


