package com.renocrewsoluations.certgenerator.controller;
	
	import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renocrewsoluations.certgenerator.entity.Certification;
import com.renocrewsoluations.certgenerator.service.CertificationService;



	@RestController
	@RequestMapping("/c")
	public class CertificationController {
	    
		@Autowired
		private CertificationService certificationService;

		    public CertificationController(CertificationService certificationService) {
	        this.certificationService = certificationService;
			}

	    @GetMapping
	    public ResponseEntity<List<Certification>> getAllCertifications() {
	        List<Certification> certifications = certificationService.getAllCertification();
	        return new ResponseEntity<>(certifications, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Certification> getCertificationById(@PathVariable Long certiId) {
			
			Optional<Certification> certification = certificationService.getCertificationById(certiId);
	        if (certification != null) {
	            return new ResponseEntity<Certification>(HttpStatus.OK);
	        } else {
	            return new ResponseEntity<Certification>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @PostMapping
	    public ResponseEntity<Certification> createCertification(@RequestBody Certification certification) {
	    	Certification createdCertification = certificationService.createCertification(certification);
	        return new ResponseEntity<>(createdCertification, HttpStatus.CREATED);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Certification> updateCertification(
	            @PathVariable("certiId") Long certiId, @RequestBody Certification certification) {
	    	Certification updatedCertification = certificationService.updateCertification(certification);
	        if (updatedCertification != null) {
	            return new ResponseEntity<>(updatedCertification, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteCertification(@PathVariable("certiId")  Long certiId) {
	        boolean deleted = certificationService.deleteCertification(certiId);
	        if (deleted) {
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	}





