package com.brain.test;

import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;

import com.brain.bean.Document;
import com.brain.dao.DocumentMapper;

/**
 * 
 * 	测试dao层的工作
 * @author Administrator
 * 推荐使用spring项目可以使用spring的单元测试，可以自动注入我们需要的组件
 * 1.导入SpringTest模块
 * 2.@ContextConfiguration指定Spring配置文件的位置
 * 3.直接autowired要使用的组件
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	DocumentMapper documentMapper;
	@Autowired
	SqlSession sqlSession;
	/**
	 * 测试departmentMapper
	 */
	@Test
	public void test() {
		/*//1.创建springIOC容器
		ApplicationContext ioc = new ClassPathXmlApplicationContext("");
		//2.从容器中获取mapper
		DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);*/
		
		//System.out.println(documentMapper);
		
		//1.显示数据
		
		//List<Document> document = documentMapper.selectByTitle("我镇");
		/*List<Document> document = documentMapper.selectByExample(null);
		for(int i = 0 ; i < document.size() ; i++) {
			  System.out.println(document.get(i).getDoctitle());
			}*/
		
		
	}
}
