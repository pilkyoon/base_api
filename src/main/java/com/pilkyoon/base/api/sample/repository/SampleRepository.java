package com.pilkyoon.base.api.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pilkyoon.base.api.sample.domain.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
