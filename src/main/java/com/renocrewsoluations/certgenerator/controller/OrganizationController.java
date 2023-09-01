package com.renocrewsoluations.certgenerator.controller;

	

import java.util.List;

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

import com.renocrewsoluations.certgenerator.entity.Exam;
import com.renocrewsoluations.certgenerator.entity.Organization;
import com.renocrewsoluations.certgenerator.service.OrganizationService;

	
	@RestController
	@RequestMapping("/o")
public class OrganizationController {
	
		
    private final OrganizationService organizationService;

    @Autowired
	    public OrganizationController (OrganizationService organizationService) {
	        this.organizationService= organizationService;
	    }

	    @GetMapping
	    public List<Exam> getAllOrganization() {
	        List<Exam> exams = organizationService.getAllOrganization();
	        //return new ResponseEntity<>(, HttpStatus.OK);
			return exams;
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Exam> getOrganizationById(@PathVariable Long orgId) {
	        return organizationService.getOrganizationById(orgId)
	                .map(organization -> new ResponseEntity<>(organization, HttpStatus.OK))
	                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }

	    @PostMapping
	    public ResponseEntity<Organization> createOrganization(@RequestBody Organization organization) {
	        Organization createdOrganization = organizationService.createOrganization(organization);
	        return new ResponseEntity<>(createdOrganization, HttpStatus.CREATED);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Organization> updateOrganization(@PathVariable Long orgId, @RequestBody Organization organization) {
	        organization.setOrgId(orgId);
	        Organization updatedOrganization = organizationService.updateOrganization(organization);
	        return new ResponseEntity<>(updatedOrganization, HttpStatus.OK);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteOrganization(@PathVariable Long orgId) {
	    	organizationService.deleteOrganization(orgId);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
	

	
	}



