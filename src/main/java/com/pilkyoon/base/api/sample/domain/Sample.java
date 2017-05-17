package com.pilkyoon.base.api.sample.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sample")
@Data
@EqualsAndHashCode(of = { "id" })
public class Sample {

	@Id
	@Column(name = "id")
	Long id;

	@Column(name = "name")
	String name;

}
