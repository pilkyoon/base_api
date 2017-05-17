package com.pilkyoon.base.api.sample.controller;

import com.pilkyoon.base.api.sample.domain.Sample;
import com.pilkyoon.base.api.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("samples")
public class SampleController {

	@Autowired
	SampleService sampleService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Sample> list() {
		List<Sample> sampleList = sampleService.getAll();
		return sampleList;
	}
}
