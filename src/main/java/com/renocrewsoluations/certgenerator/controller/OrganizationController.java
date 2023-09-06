package com.renocrewsoluations.certgenerator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.renocrewsoluations.certgenerator.entity.Organization;
import com.renocrewsoluations.certgenerator.service.OrganizationService;

@RestController
@RequestMapping("/o")
public class OrganizationController {

    @Autowired
    private final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping
    public ResponseEntity<List<Organization>> getAllOrganizations() {
        List<Organization> organizations = organizationService.getAllOrganization();
        return new ResponseEntity<>(organizations, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Organization> getOrganizationById(@PathVariable Long id) {
        return organizationService.getOrganizationById(id)
                .map(organization -> new ResponseEntity<>(organization, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Organization> createOrganization(@RequestBody Organization organization) {
        Organization createdOrganization = organizationService.createOrganization(organization);
        return new ResponseEntity<>(createdOrganization, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Organization> updateOrganization(@PathVariable Long id, @RequestBody Organization organization) {
        organization.setOrgId(id);
        Organization updatedOrganization = organizationService.updateOrganization(organization);
        return new ResponseEntity<>(updatedOrganization, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrganization(@PathVariable Long id) {
        organizationService.deleteOrganization(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
