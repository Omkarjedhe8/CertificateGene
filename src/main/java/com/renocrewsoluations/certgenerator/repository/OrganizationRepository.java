package com.renocrewsoluations.certgenerator.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renocrewsoluations.certgenerator.entity.Organization;
import org.springframework.stereotype.Repository;


@Repository
	public interface OrganizationRepository extends JpaRepository<Organization, Long> {

		Optional<Organization> findById(Long orgId);

		void deleteById(Long orgId);

		Organization saveAll(Organization organization);

		Organization save(Organization organization);

	
	}

