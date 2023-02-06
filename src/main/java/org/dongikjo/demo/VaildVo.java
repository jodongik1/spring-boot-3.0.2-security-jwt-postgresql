package org.dongikjo.demo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * @NotBlank : null 과 공백문자(""), 스페이스, 탭을 모두 허용하지 않는다. 정수(Integer)에 사용하면 에러 발생한다.
 * @NotEmpty : null 과 공백문자("")를 둘 다 허용하지 않는다. 스페이스, 탭은 허용한다.
 * @NotNull : null 을 허용하지 않는다. null만 허용하지 않는다. 공백문자("")나 스페이스, 탭은 허용한다.
 * @Range(min = 1000, max = 1000000) : 범위 안의 값이어야 한다.
 * @Max(9999) : 최대 9999까지만 허용한다.
 * @Min(10) : 최소 10까지만 허용한다.
 * @Size(min=0, max=10) : 문자열 길이, 컬렉션 사이즈의 제한 범위를 지정
 * @AssertTrue : 값이 true인 것을 검증
 * @AssertFalse : 값이 false인 것을 검증
 * @Pattern(regexp="[a-zA-z0-9]*") : 지정한 정규 표현과 일치하는 것을 검증(예시는 영숫자 검증)
 * @DecimalMax("100.0") : 소수점 이하를 포함해서 검증할 때는 Max가 아닌, DecimalMax 사용
 * @DecimalMin("10.0") : 소수점 이하를 포함해서 검증할 때는 Min가 아닌, DecimalMin 사용
 * @Digits(integer=1, fraction=3) : 정수부와 소수부의 자릿수 검증. String 타입도 검증할 수 있다.
 * @Future : 미래 날짜인 것을 검증 (Date 타입 등)
 * @Past : 과거 날짜인 것을 검증 (Date 타입 등)
 * @Valid : 중첨된 Form을 검증 (클래스 타입)
 * @Length(min-0, max=5) : 문자열 길이 지정(문자열 전용 Size)
 * @Email : 문자열이 이메일 주소 형식인지 검증
 * @CreditCardNumber : 문자열이 신용카드 번호 형식인지 검증
 * @URL : 문자열이 URL 형식인지 검증 
 */
@Data
public class VaildVo {
	
	@NoEmoji
	@NotNull(message = "{notnull}")
	@Size(min = 5, max = 10)
	@Schema(description = "아이디", nullable = true, example = "jodongik")
	private String id;
	
	@NotBlank(message = "비밀번호는 필수 입력 값입니다.")
    @Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}",
            message = "비밀번호는 영문 대,소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8자 ~ 20자의 비밀번호여야 합니다.")
    private String password;
	
	@Max(value = 25, message = "25세 이하만 가능합니다.")
	@Min(value = 18, message = "18살 이상만 가능합니다.") 
	@Schema(description = "나이", nullable = true, example = "20")
	private Integer age;
	 
	@Email
	@Schema(description = "이메일", nullable = true, example = "010-1234-1234")
	private String email;
	
	@Pattern(regexp="^\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|[3][01])\\-[1-4][0-9]{6}$",message="유효하지 않는 주민번호 입니다.")
	@Schema(description = "주민등록번호", nullable = true, example = "820412-1111111")
	private String ssn;
	
	@Pattern(regexp="^01(?:0|1|[6-9])[.-]?(\\d{3}|\\d{4})[.-]?(\\d{4})$", message="휴대폰 번호가 유효하지 않습니다.")
	@Schema(description = "전화번호", nullable = true, example = "010-1234-1234")
	private String hp;

}
