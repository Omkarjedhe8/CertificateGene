package com.renocrewsoluations.certgenerator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.renocrewsoluations.certgenerator.entity.Organization;
import com.renocrewsoluations.certgenerator.repository.OrganizationRepository;

public class OrganizationService {
	
	
	@Autowired
	  private OrganizationRepository organizationRepository;
	
	
	    public OrganizationService( OrganizationRepository organizationRepository) {
	        this.organizationRepository = organizationRepository;
	    }

	    public List<Organization> getAllOrganization() {
	        return organizationRepository.findAll();
	    }

	    public Optional<Organization> getOrganizationById(Long orgId) {
		
			return organizationRepository.findById(orgId);
	    }

	    public Organization createOrganization( Organization organization){
	        return organizationRepository.save(organization);
	    }
	    

	    public Organization updateOrganization(Organization organization) {
	        return organizationRepository.save(organization);
	    }

	    public boolean deleteOrganization(Long orgId) {
	    	organizationRepository.deleteById(orgId);
			return false;
	    }


}



