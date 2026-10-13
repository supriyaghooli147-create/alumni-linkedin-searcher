package com.backend.alumni.repository;
import com.backend.alumni.model.AlumniProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface AlumniRepository extends JpaRepository<AlumniProfile,Long> {
 List<AlumniProfile> findByUniversityContainingIgnoreCaseAndCurrentRoleContainingIgnoreCase(String university,String currentRole);
 List<AlumniProfile> findByUniversityContainingIgnoreCaseAndCurrentRoleContainingIgnoreCaseAndPassoutYear(String university,String currentRole,Integer passoutYear);
}
