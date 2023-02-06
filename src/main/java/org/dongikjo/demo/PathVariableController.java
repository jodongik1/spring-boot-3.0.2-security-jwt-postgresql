package org.dongikjo.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PathVariableController {
	 
	@GetMapping("/path_variable/{type}/{id}")
	public UserVo getUser(@PathVariable("type") String type, @PathVariable("id") Integer id, UserVo params) {
		// curl -X GET http://localhost:8080/api/path_variable/aaa/1111?&email=jodongik.prj@gmail.com
		return params;
	} 
	
	@PostMapping("/path_variable/{type}/{id}")
	public UserVo postUser(@PathVariable("type") String type, @PathVariable("id") Integer id, UserVo params) {
		// curl -X POST http://localhost:8080/api/user -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58"
		return params;
	}
	
	@PutMapping("/path_variable/{type}/{id}")
	public UserVo putUser(@PathVariable("type") String type, @PathVariable("id") Integer id, UserVo params) {
		// curl -X PUT http://localhost:8080/api/user -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58"
		return params;
	}
	
	@PatchMapping("/path_variable/{type}/{id}")
	public UserVo patchUser(@PathVariable("type") String type, @PathVariable("id") Integer id, UserVo params) {
		// curl -X PATCH http://localhost:8080/api/user -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58"
		return params;
	}
	
	@DeleteMapping("/path_variable/{type}/{id}")
	public UserVo deleteUser(@PathVariable("type") String type, @PathVariable("id") Integer id, UserVo params) {
		// curl -X DELETE http://localhost:8080/api/user -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58"
		return params;
	}
} 