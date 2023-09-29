package com.ikm.assessment.repository;

import com.ikm.assessment.model.VoucherDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoucherRepository extends JpaRepository<VoucherDetails, Integer> {

}
