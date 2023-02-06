package org.dongikjo.demo;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/request_param")
public class RequestParamController {

	@GetMapping("/map")
	public Map<String, Object> getMap(@RequestParam Map<String, Object> params) {
		// curl -X GET http://localhost:8080/api/request_param/map?id=1&email=jodongik.prj@gmail.com
		return params;
	}

	@PostMapping("/map")
	public Map<String, Object> postMap(@RequestParam Map<String, Object> params) {
		// curl -X POST http://localhost:8080/api/request_param/map -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58" 
		return params;  
	}

	@PutMapping("/map")
	public Map<String, Object> putMap(@RequestParam Map<String, Object> params) {
		// curl -X PUT http://localhost:8080/api/request_param/map -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58"
		return params;
	}

	@PatchMapping("/map")
	public Map<String, Object> patchMap(@RequestParam Map<String, Object> params) {
		// curl -X PATCH http://localhost:8080/api/request_param/map -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58"
		return params;
	}

	@DeleteMapping("/map")
	public Map<String, Object> deleteMap(@RequestParam Map<String, Object> params) {
		// curl -X DELETE http://localhost:8080/api/request_param/map -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58"
		return params;
	}
	
	@GetMapping("/vo")
	public ParamsVo getVo(
			@RequestParam(required = true, value = "id") Integer id,
			@RequestParam("email") String email) {
		// curl -X GET http://localhost:8080/api/request_param/vo?id=1&email=jodongik.prj@gmail.com
		return ParamsVo.builder().id(id).email(email).build();
	}

	@PostMapping("/vo")
	public ParamsVo postVo( 
			@RequestParam(required = true, value = "id") Integer id,
			@RequestParam(required = false, value = "email") String email,
			@RequestParam(required = false, value = "hobby") List<String> hobby,
			@RequestParam(required = false, value = "birthDay") String birthDay) {
		// curl -X POST http://localhost:8080/api/request_param/vo -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58" 
		return ParamsVo.builder().id(id).email(email).hobby(hobby).birthDay(birthDay).build();	
	}

	@PutMapping("/vo")
	public ParamsVo putVo(
			@RequestParam(required = true, value = "id") Integer id,
			@RequestParam(required = false, value = "email") String email,
			@RequestParam(required = false, value = "hobby") List<String> hobby,
			@RequestParam(required = false, value = "birthDay") String birthDay) {
		// curl -X PUT http://localhost:8080/api/request_param/vo -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58"
		return ParamsVo.builder().id(id).email(email).hobby(hobby).birthDay(birthDay).build();	
	}

	@PatchMapping("/vo")
	public ParamsVo patchVo(
			@RequestParam(required = true, value = "id") Integer id,
			@RequestParam(required = false, value = "email") String email,
			@RequestParam(required = false, value = "hobby") List<String> hobby,
			@RequestParam(required = false, value = "birthDay") String birthDay) {
		// curl -X PATCH http://localhost:8080/api/request_param/vo -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58"
		return ParamsVo.builder().id(id).email(email).hobby(hobby).birthDay(birthDay).build();	
	}

	@DeleteMapping("/vo")
	public ParamsVo deleteVo(
			@RequestParam(required = true, value = "id") Integer id,
			@RequestParam(required = false, value = "email") String email,
			@RequestParam(required = false, value = "hobby") List<String> hobby,
			@RequestParam(required = false, value = "birthDay") String birthDay) {
		// curl -X DELETE http://localhost:8080/api/request_param/vo -d id=1 -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58"
		return ParamsVo.builder().id(id).email(email).hobby(hobby).birthDay(birthDay).build();	

	}
}
