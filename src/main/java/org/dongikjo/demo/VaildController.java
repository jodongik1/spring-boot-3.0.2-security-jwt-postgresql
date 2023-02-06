package org.dongikjo.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/vaild")
public class VaildController {
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<?> vaild(@Valid VaildVo vo, BindingResult bindingResult)  {
		// curl -X POST http://localhost:8080/api/vaild -d email=jodongik.prj@gmail.com -d isActive=true -d hobby="독서" -d hobby="운동" -d birthDay="2023-01-29 21:58" 
		// curl -X GET http://localhost:8080/api/vaild 
		if (bindingResult.hasErrors()) { 
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bindingResult.getAllErrors());
        } 
        return ResponseEntity.ok(vo);
	}
	 

}
