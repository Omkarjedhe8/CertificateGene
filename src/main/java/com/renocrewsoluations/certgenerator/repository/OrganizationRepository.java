package com.renocrewsoluations.certgenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.renocrewsoluations.certgenerator.entity.Organization;

@Repository
public interface OrganizationRepository  extends JpaRepository<Organization, Long>{

}
