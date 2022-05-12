package io.oysterkong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import io.oysterkong.dto.Student;

@Mapper
public interface StudentMapper {
	
	@Select("SELECT * FROM student WHERE id= #{id}")
	Student findById(int id);
	
	@Select("SELECT * FROM student WHERE studentNo= #{studentNo}")
	Student findByStudentNo(String studentNo);
	
	@Select("SELECT * FROM student")
	List<Student> findAll();
	
	@Insert("INSERT INTO student(studentNo, name, departmentId, "
			+ "phone, gender, email) "
			+ "VALUES(#{studentNo}, #{name}, #{departmentId},"
			+ "#{phone}, #{gender}, #{email})")
	@Options(useGeneratedKeys = true, keyProperty = "id") //db에 만들어진 새로운 레코드의 id 값을 가져오도록 옵션 지정(insert할때만 필요)
	void insert(Student student);
	
	@Delete("DELETE FROM student WHERE id = #{id}")
	void deleteById(int id);
	
	@Update("UPDATE student SET "
			+ "studentNo = #{studentNo},"
			+ "name = #{name},"
			+ "departmentId = #{departmentId}," 
			+ "phone = #{phone},"
			+ "gender = #{gender},"
			+ "email = #{email} " //where 절 앞에는 공백이 한칸 있어야하고 , 가 없어야한다는 점
			+ "WHERE id = #{id}")
	void update(Student student);
	
}
