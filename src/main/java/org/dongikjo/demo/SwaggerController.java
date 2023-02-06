package org.dongikjo.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "Swagger 예제 Controller", description = "Swagger 예제 Controller API")
@RestController
@RequestMapping("/api/swagger/")
@RequiredArgsConstructor
public class SwaggerController {
	@Operation(summary = "POST 방식 조회 예", description = "POST 방식으로 조회 합니다.")
	@ApiResponses({
	@ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = UserVo.class))),
	@ApiResponse(responseCode = "400", description = "BAD REQUEST"),
	@ApiResponse(responseCode = "404", description = "NOT FOUND"),
	@ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
	}) 
	@PostMapping("/user")
	public UserVo postUser(UserVo params) {
		// curl -X POST http://localhost:8080/api/request_body/user -H 'Content-Type: application/json;charset=UTF-8;' -d '{"id":1,"email":"jodongik.prj@gmail.com","name":"조동익","password":"prj112233","isActive":true,"hobby":["국어","영어","수학"],"birthDay":"2023-01-29 21:58"}'
		return params;
	}
}
