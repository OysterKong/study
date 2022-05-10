package io.oysterkong.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.oysterkong.dto.Student;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {
	
	@Autowired
	StudentMapper studentMapper;
	
	@Test
	public void test_findByStudentNo() {
		
		Student stud2 = studentMapper.findById(201031999);
		assertEquals(201031999, stud2.getId());
		
	}

}
