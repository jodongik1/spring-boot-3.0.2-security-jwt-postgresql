package org.dongikjo.demo;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "sample")
@DynamicUpdate
public class SampleMybatisVo {

	protected SampleMybatisVo() {
	}

	public SampleMybatisVo(String name, String password) {
		this.password = password;
		this.name = name;
	}

	@Id
	@SequenceGenerator(name = "sample_id_seq", sequenceName = "sample_id_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sample_id_seq")
	@Column(name = "id")
	private Long id;

	@Setter
	@Column(name = "password")
	private String password;

	@Setter
	@Column(name = "name")
	private String name;

	@Setter
	@Column(name = "email")
	private String email;

}