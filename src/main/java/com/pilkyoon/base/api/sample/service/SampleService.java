package com.pilkyoon.base.api.sample.service;

import com.pilkyoon.base.api.sample.domain.Sample;
import com.pilkyoon.base.api.sample.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {

	@Autowired
	SampleRepository repository;

	public List<Sample> getAll() {
		return repository.findAll();
	}

}
