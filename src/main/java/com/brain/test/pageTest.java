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
import org.springframework.web.servlet.ModelAndView;

import com.brain.pojo.DocumentInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class pageTest {
	//传入spring的IOC容器
		@Autowired
		WebApplicationContext context;
		//虚拟mvc请求，获取到处理结果
		MockMvc mockMvc;
		
		@Before
		public void initMockMvc(){
			mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		}
		
		@Test
		public void testPage() throws Exception {
			for (int i = 0;i <= 336;i++) {
				//模拟请求拿到返回值
				MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("docs").param("index", Integer.toString(i))).andReturn();
				MockHttpServletRequest request = result.getRequest();
				List<DocumentInfo> resultList =  (List<DocumentInfo>) request.getAttribute("docList");
				System.out.println(resultList);
				ModelAndView aa = new ModelAndView("docs/docList", "docLists", resultList);
				/*StringBuilder stringHtml = new StringBuilder();
				PrintStream printStream = null ;
				try{
					   //打开文件
					printStream = new PrintStream(new FileOutputStream("/src/main/webapp/views/html/default_" + Integer.toString(i) + ".html"));
				}catch(FileNotFoundException e){
					e.printStackTrace();
				}
				stringHtml.append(aa.toString());
				printStream.println(stringHtml.toString());*/
			}
		}
}
