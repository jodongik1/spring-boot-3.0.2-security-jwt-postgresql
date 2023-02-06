package org.dongikjo.demo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMybatisMapper {
	public List<SampleMybatisVo> list();
}
