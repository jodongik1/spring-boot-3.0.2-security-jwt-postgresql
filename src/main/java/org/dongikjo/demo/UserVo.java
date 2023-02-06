package org.dongikjo.demo;

import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(description = "사용자")
@Data
public class UserVo {
	 
	@Schema(description = "아이디")
	private Integer id;
	
	@Schema(description = "사용여부")
	private Boolean isActive;
	
	@Email
	@Schema(description = "이메일", nullable = false, example = "jodongik.one@gmail.com")
	private String email;
	
	@Schema(description = "취미")
	private List<String> hobby;
	
	@Schema(description = "이름",example="조동익", maxLength = 4)
	private String name;
	
	@Pattern(regexp = "[1-2]")
	@Schema(description = "성별", defaultValue = "1", allowableValues = {"1", "2"})
	private String sex;
	
	@DateTimeFormat(pattern = "yyyyMMdd")
	@Schema(description = "생년월일", example = "19820412", maxLength = 8)
	private String birthDay;
	
	@Schema(description = "전화번호")
	private String phoneNumber;
	
	@Schema(description = "비밀번호")
	private String password;
	
	@Pattern(regexp = "[0-2]")
	@Schema(description = "유형", defaultValue = "0", allowableValues = {"0", "1", "2"})
	private String type;
}
