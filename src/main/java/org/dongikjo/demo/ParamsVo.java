package org.dongikjo.demo;

import java.util.List;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ParamsVo {
	private Integer id;
	private Boolean isActive;
	private String email;
	private String name;
	private String password;
	private List<String> hobby;
	private String birthDay;
}
