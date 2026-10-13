package com.backend.alumni.controller;
import com.backend.alumni.dto.AlumniSearchRequest;
import com.backend.alumni.dto.AlumniSearchResponse;
import com.backend.alumni.model.AlumniProfile;
import com.backend.alumni.service.AlumniService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/alumni")
public class AlumniController {
 private final AlumniService service;
 public AlumniController(AlumniService service){this.service=service;}
 @GetMapping("/health") public String health(){return "Alumni Searcher API is running!";}
 @GetMapping("/all") public List<AlumniProfile> getAllAlumni(){return service.getAllAlumni();}
 @PostMapping("/search") public AlumniSearchResponse search(@Valid @RequestBody AlumniSearchRequest request){return new AlumniSearchResponse("success",service.searchSavedAlumni(request));}
 @PostMapping("/profiles") public AlumniProfile saveProfile(@RequestBody AlumniProfile profile){return service.save(profile);}
}
