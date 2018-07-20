package com.brain.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.brain.bean.Document;
import com.github.pagehelper.PageInfo;


/**
 * 使用spring提供的测试模块进行测试
 * spring4测试的时候，需要servlet3.0的支持
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class MvcTest {
	//传入spring的IOC容器
	@Autowired
	WebApplicationContext context;
	//虚拟mvc请求，获取到处理结果
	MockMvc mockMvc;
	
	@Before
	public void initMockMvc(){
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	/*
	@Test
	public void testPage() throws Exception {
		
		//模拟请求拿到返回值
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/docs")).andReturn();
		//模拟成功后，请求域中会有pageInfo，我们可以取出pageInfo进行验证
		MockHttpServletRequest request = result.getRequest();
		PageInfo pi = (PageInfo) request.getAttribute("pageInfo");
		System.out.println("当期页码" + pi.getPageNum());
		System.out.println("总页码" + pi.getPages());
		System.out.println("总记录数" + pi.getTotal());
		System.out.println("在页面需要连续显示的页码 ");
		int[] nums = pi.getNavigatepageNums();
		for (int i : nums) {
			System.out.print(" " + i);
		}
		
		List<Document> list = pi.getList();
		for (Document document : list) {
			System.out.println("ID, " + document.getDocid() + "==>Title:" + document.getDoctitle());
		}
	}*/
}
