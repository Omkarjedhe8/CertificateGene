package com.renocrewsoluations.certgenerator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.renocrewsoluations.certgenerator.entity.Certification;
import com.renocrewsoluations.certgenerator.repository.CertificationRepository;

public class CertificationService {
	
	@Autowired	
	  private  final CertificationRepository certificationRepository;
	    
	public CertificationService (CertificationRepository certificationRepository ) 
	        {
	        	this.certificationRepository = certificationRepository;
	        }
	    

	    public List<Certification> getAllCertification() {
	        return certificationRepository.findAll();
	    }
 
	    public Optional<Certification> getCertificationById(Long certiId) {
		
			return certificationRepository.findById(certiId);
	    }

	    public Certification createCertification( Certification certification){
	        return certificationRepository.save(certification);
	    }
	    

	    public Certification updateCertification(Certification certification) {
	        return certificationRepository.save(certification);
	    }

	    public boolean deleteCertification(Long certiId) {
	        certificationRepository.deleteById(certiId);
			return false;
	    }



}
