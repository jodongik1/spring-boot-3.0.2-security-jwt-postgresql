package org.dongikjo.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    //서비스 임을 명시
public class SampleMybatisServiceImpl implements SampleMybatisService {
    
    @Autowired
    private SampleMybatisMapper sampleMybatisMapper;

    /**
     * 전체 리스트 조회
     */
    @Override
    public List<SampleMybatisVo> list() {
        return sampleMybatisMapper.list();
    }

}
