package com.backend.alumni.dto;
import com.backend.alumni.model.AlumniProfile;
import java.util.List;
public class AlumniSearchResponse {
 private String status; private List<AlumniProfile> data;
 public AlumniSearchResponse(String status,List<AlumniProfile> data){this.status=status;this.data=data;}
 public String getStatus(){return status;} public List<AlumniProfile> getData(){return data;}
}
