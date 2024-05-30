package siri.employeeProject;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import siri.employeeProject.entity.Employee;
import siri.employeeProject.repository.EmployeeRepo;
import siri.employeeProject.service.EmployeeService;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class EmployeeProjectTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void message(){
		System.out.println("Junit Testing");
	}

	@Autowired
	private EmployeeService employeeService;

	@Mock
	private EmployeeRepo repo;



	@Test
	public void getEmployeeTest(){
		when(repo.findAll()).thenReturn(Stream
				.of(new Employee(1,"sam","rachel",2)).collect(Collectors.toList()));
		assertEquals(1,employeeService.getAllEmployees().size());
	}


//	@Test
//	public void employee(){
//		Mockito.when(repo.findById());
//
//	}




}
