package com.cooory.spring.test.jpa.domain;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Company {

	private int id;
	private String name;
	private String business;
	private String scale;
	private int headcount;
	private Date createdAt;
	private Date updatedAt;
}
