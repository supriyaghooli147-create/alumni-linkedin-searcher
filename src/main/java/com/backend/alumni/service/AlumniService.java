package com.backend.alumni.service;
import com.backend.alumni.dto.AlumniSearchRequest;
import com.backend.alumni.model.AlumniProfile;
import com.backend.alumni.repository.AlumniRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AlumniService {
 private final AlumniRepository repository;
 public AlumniService(AlumniRepository repository){this.repository=repository;}
 public List<AlumniProfile> getAllAlumni(){return repository.findAll();}
 public List<AlumniProfile> searchSavedAlumni(AlumniSearchRequest r){
  if(r.getPassoutYear()!=null) return repository.findByUniversityContainingIgnoreCaseAndCurrentRoleContainingIgnoreCaseAndPassoutYear(r.getUniversity().trim(),r.getDesignation().trim(),r.getPassoutYear());
  return repository.findByUniversityContainingIgnoreCaseAndCurrentRoleContainingIgnoreCase(r.getUniversity().trim(),r.getDesignation().trim());
 }
 public AlumniProfile save(AlumniProfile p){return repository.save(p);}
}
