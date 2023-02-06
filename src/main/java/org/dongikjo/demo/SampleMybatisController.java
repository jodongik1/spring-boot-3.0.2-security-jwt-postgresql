package org.dongikjo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/sample/mybatis") 
public class SampleMybatisController {

    @Autowired
    private SampleMybatisService sampleMybatisService;
    
    /**
     * 전체 리스트 조회
     * @return  전체 리스트
     */
    @GetMapping(value = "/list")
    public ResponseEntity<?> list() {
        return ResponseEntity.ok().body(sampleMybatisService.list());
    }

}
