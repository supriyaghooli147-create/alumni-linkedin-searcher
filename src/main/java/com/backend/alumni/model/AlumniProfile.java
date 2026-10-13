package com.backend.alumni.model;
import jakarta.persistence.*;
@Entity
@Table(name="alumni_profiles")
public class AlumniProfile {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String name;
 @Column(name="alumni_designation") private String currentRole;
 private String university;
 private String location;
 private String linkedinHeadline;
 private Integer passoutYear;
 public AlumniProfile() {}
 public Long getId(){return id;}
 public String getName(){return name;} public void setName(String v){name=v;}
 public String getCurrentRole(){return currentRole;} public void setCurrentRole(String v){currentRole=v;}
 public String getUniversity(){return university;} public void setUniversity(String v){university=v;}
 public String getLocation(){return location;} public void setLocation(String v){location=v;}
 public String getLinkedinHeadline(){return linkedinHeadline;} public void setLinkedinHeadline(String v){linkedinHeadline=v;}
 public Integer getPassoutYear(){return passoutYear;} public void setPassoutYear(Integer v){passoutYear=v;}
}
