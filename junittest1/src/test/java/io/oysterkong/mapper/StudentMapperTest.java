package io.oysterkong.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import io.oysterkong.dto.Student;


@RunWith(SpringRunner.class)
@SpringBootTest
//@Transactional  //test한 데이터는 자동으로 취소가 됨(따로 삭제할 필요가 없음)
public class StudentMapperTest {
	
	@Autowired
	StudentMapper studentMapper;
	
	String newStringNo() {
		// 201032000 - 앞 6자리는 입학년도, 학과번호 등 바뀌지않는 값, 뒤의 3자리는 바뀌는 번호라고 가정 (학번)
		for(int i=201032000; i<999999999; ++i) {
			String s = String.valueOf(i);
			if(studentMapper.findByStudentNo(s) == null)
				return s;
		}
		return null;
	}
	
	
	
	@Test
	public void test_findById() {
		List<Student> list = studentMapper.findAll(); //데이터 전체를 조회해서
		
		for(Student s: list) { //데이터 갯수만큼 for문 돌려서
			Student s2 = studentMapper.findById(s.getId()); //하나씩 꺼내고
			assertEquals(s.getId(), s2.getId()); // 꺼낸 값과 가진 값이 같은지를 비교,조회
		}//롬복 사용안하면 주소값으로 비교가 어려움, 그래서 id든 studentno든 구체적으로 지정해서 비교해야함
		
	}
	
	@Test
	public void test_findByStudentNo() {
		List<Student> list = studentMapper.findAll(); //데이터 전체를 조회해서
		
		Student s1 = list.get(0);
		
		Student s2 = studentMapper.findByStudentNo(s1.getStudentNo());
		assertEquals(s1.getStudentNo(), s2.getStudentNo());
		
	}
	

	@Test
	public void test_insert_delete() {
		Student s = new Student();
		//s.setStudentNo("201032000");
		s.setStudentNo(newStringNo());
		s.setName("임꺽정");
		s.setDepartmentId(2);
		s.setPhone("010-111-1111");
		s.setEmail("lim@aaa.net");
		s.setGender("남");
		
		studentMapper.insert(s);
		
		//잘 저장되었는지 확인	
		Student s2 = studentMapper.findById(s.getId());
		assertEquals(s.getId(), s2.getId());
		
		studentMapper.deleteById(s.getId());
		
		//잘 삭제되었는지 확인(@transactional 사용하게되면 별도로 삭제는 필요없음, 테스트 끝나면 자동으로 삭제되므로)
		s2 = studentMapper.findById(s.getId());
		assertEquals(s2, null);
	}//롬복 사용안하면 주소값으로 비교가 어려움, 그래서 id든 studentno든 구체적으로 지정해서 비교해야함
	
	@Test
	public void test_update() {
		Student s1 = studentMapper.findAll().get(0); //첫번째 데이터를 가져옴
		s1.setStudentNo(newStringNo());
		s1.setName("홍길순");
		s1.setDepartmentId(2);
		s1.setPhone("010-222-2222");
		s1.setEmail("gil@aaa.net");
		s1.setGender("여");
		
		studentMapper.update(s1);
		
		Student s2 = studentMapper.findById(s1.getId());
		assertEquals(s1.getId(), s2.getId());
	}

}
