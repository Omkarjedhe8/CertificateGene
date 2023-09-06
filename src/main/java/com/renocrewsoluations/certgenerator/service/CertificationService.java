package com.renocrewsoluations.certgenerator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renocrewsoluations.certgenerator.entity.Certification;
import com.renocrewsoluations.certgenerator.repository.CertificationRepository;

@Service
public class CertificationService {
	 @Autowired
    private final CertificationRepository certificationRepository;

    
    public CertificationService(CertificationRepository certificationRepository) {
        this.certificationRepository = certificationRepository;
    }

    public List<Certification> getAllCertification() {
        return certificationRepository.findAll();
    }

    public Optional<Certification> getCertificationById(Long certiId) {
        return certificationRepository.findById(certiId);
    }

    public Certification createCertification(Certification certification) {
        return certificationRepository.save(certification);
    }

    public Certification updateCertification(Certification certification) {
        // Check if the certification with the given ID exists
        Optional<Certification> existingCertification = certificationRepository.findById(certification.getCertiId());
        if (existingCertification.isPresent()) {
            return certificationRepository.save(certification);
        } else {
            return null; // Certification not found
        }
    }

    public boolean deleteCertification(Long certiId) {
        // Check if the certification with the given ID exists
        Optional<Certification> existingCertification = certificationRepository.findById(certiId);
        if (existingCertification.isPresent()) {
            certificationRepository.deleteById(certiId);
            return true; // Deletion successful
        } else {
            return false; // Certification not found, deletion failed
        }
    }
}
