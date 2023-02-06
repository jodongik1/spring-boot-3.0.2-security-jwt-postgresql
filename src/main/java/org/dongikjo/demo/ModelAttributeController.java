package org.dongikjo.demo;
 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/api/user")
public class ModelAttributeController {
	
	/**
	 * curl 
	 *  - https://reqbin.com/req/c-g5d14cew/curl-post-example
	 *  - https://everything.curl.dev
	 */ 
	
	@GetMapping("")
	public UserVo getUser(UserVo params) {
		// curl -X GET http://localhost:8080/api/user?id=1&email=jodongik.prj@gmail.com
		return params;
	}
	
	@PostMapping("")
	public UserVo postUser(UserVo params) {
		// curl -X POST http://localhost:8080/api/user -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58"
		return params;
	}
	
	@PutMapping("")
	public UserVo putUser(UserVo params) {
		// curl -X PUT http://localhost:8080/api/user -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58"
		return params;
	}
	
	@PatchMapping("")
	public UserVo patchUser(UserVo params) {
		// curl -X PATCH http://localhost:8080/api/user -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58"
		return params;
	}
	
	@DeleteMapping("")
	public UserVo deleteUser(UserVo params) {
		// curl -X DELETE http://localhost:8080/api/user -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58"
		return params;
	} 
}
