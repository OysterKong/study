package io.oysterkong.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import io.oysterkong.dto.Student;

@Mapper
public interface StudentMapper {
	
	@Select("SELECT * FROM student WHERE id= #{id}")
	Student findById(int id);
	
}
