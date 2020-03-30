package com.info.n25175_info;

import com.info.n25175_info.dao.N25175AdminMapper;
import com.info.n25175_info.dao.N25175PostMapper;
import com.info.n25175_info.dto.AVGMoney;
import com.info.n25175_info.dto.ProblemDto;
import com.info.n25175_info.service.ProblemService;
import com.info.n25175_info.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class N25175InfoApplicationTests {

	@Autowired
    UserService iUserService;

	@Autowired
	ProblemService problemService;

	@Autowired
	N25175PostMapper postMapper;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	N25175AdminMapper adminMapper;

	@Test
	void contextLoads() {
	}

	@Test
	void contextLoads1() {
		List<String> schools = iUserService.findSchools("宁波");
		System.out.println(schools);
	}

	@Test
	void contextLoads2() {
		List<ProblemDto> problemDtos = problemService.getAllProblem(5);
		System.out.println(problemDtos);
	}

	@Test
	void contextLoads3() {
		List<Map<String, Object>> list = postMapper.groupCount();
        System.out.println(list);
		Map<String, Integer> map = new HashMap<>();
		for (Map<String, Object> m : list){
			System.out.println(m.get("count").toString());
		}
	}

	@Test
	void contextLoads4() {
		List<AVGMoney> list = adminMapper.groupMoney();
		System.out.println(list);
//		for (AVGMoney a : list){
//			sout
//		}
	}

	public static void main(String[] args) {
		HashMap<String, String> hp = new HashMap<>();
		hp.put("a","b");
		String a = hp.get("a");
		System.out.println(hp.get("a"));
	}

}
