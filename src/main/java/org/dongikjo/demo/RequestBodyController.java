package org.dongikjo.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/request_body")
public class RequestBodyController {
	
	@PostMapping("/user")
	public UserVo postUser(@RequestBody UserVo params) {
		// curl -X POST http://localhost:8080/api/request_body/user -H 'Content-Type: application/json;charset=UTF-8;' -d '{"id":1,"email":"jodongik.prj@gmail.com","name":"조동익","password":"prj112233","isActive":true,"hobby":["국어","영어","수학"],"birthDay":"2023-01-29 21:58"}'
		return params;
	}
	
	@PostMapping("/map")
	public Map<String,Object> postMap(@RequestBody Map<String,Object> params) {
		// curl -X POST http://localhost:8080/api/request_body/map -H 'Content-Type: application/json;charset=UTF-8;' -d '{"id":1,"email":"jodongik.prj@gmail.com","name":"조동익","password":"prj112233","isActive":true,"hobby":["국어","영어","수학"],"birthDay":"2023-01-29 21:58"}'
		return params;
	}
}
