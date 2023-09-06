package com.renocrewsoluations.certgenerator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renocrewsoluations.certgenerator.entity.Organization;
import com.renocrewsoluations.certgenerator.repository.OrganizationRepository;

@Service
public class OrganizationService {
  @Autowired
    private final OrganizationRepository organizationRepository;

   
    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    public List<Organization> getAllOrganization() {
        return (List<Organization>) organizationRepository.findAll();
    }

    public Optional<Organization> getOrganizationById(Long orgId) {
        return organizationRepository.findById(orgId);
    }

    public Organization createOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    public Organization updateOrganization(Organization organization) {
        return organizationRepository.saveAll(organization);
    }

    public void deleteOrganization(Long orgId) {
        organizationRepository.deleteById(orgId);
    }
}
