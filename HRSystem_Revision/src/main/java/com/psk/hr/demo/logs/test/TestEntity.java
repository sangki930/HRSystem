package com.psk.hr.demo.logs.test;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// MongoDB와 JPA 연동을 위한 엔티티
@Document(collection="testentity")
@Getter
@Setter
@ToString
@Builder
public class TestEntity {

	@Id
	@Field("_id")
	private String id;
	
	@Field("record")
	private String record;
}
