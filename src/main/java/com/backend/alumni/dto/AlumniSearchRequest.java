package com.backend.alumni.dto;
import jakarta.validation.constraints.NotBlank;
public class AlumniSearchRequest {
 @NotBlank(message="University is required") private String university;
 @NotBlank(message="Designation is required") private String designation;
 private Integer passoutYear;
 public String getUniversity(){return university;} public void setUniversity(String v){university=v;}
 public String getDesignation(){return designation;} public void setDesignation(String v){designation=v;}
 public Integer getPassoutYear(){return passoutYear;} public void setPassoutYear(Integer v){passoutYear=v;}
}
