package com.brain.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.brain.dao.DocumentMapper;
import com.brain.pojo.DocumentInfo;
import com.brain.service.DocumentService;

import freemarker.template.Configuration;
import freemarker.template.Template;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class pageTest {
		@Autowired
		DocumentService documentService;
		
		public List<DocumentInfo> splitArray(List<DocumentInfo> docList,int index){
			int length = 20;
			List<DocumentInfo> result = new ArrayList<DocumentInfo>();
			if (docList.size() > (index - 1) * 20 + length) {
				for(int i = (index - 1) * 20 ; i < (index - 1) * 20 + length ; i++) {
					  result.add(docList.get(i));
				}
			} else {
				for(int i = (index - 1) * 20 ; i < docList.size() ; i++) {
					  result.add(docList.get(i));
				}
			}
			
			return result;
		}
		
		
		@Test
		public void testPage() throws Exception {
			List<DocumentInfo> docList = documentService.getAll();
			int listNum = docList.size() / 20;
			int listNum1 = docList.size() % 20;
			if (listNum1 > 0) {
				listNum++;
			}
			for (int i = 1;i <= listNum;i++) {
				List<DocumentInfo> resultList = splitArray(docList,i);
				Configuration configuration = new Configuration(Configuration.getVersion());
		        // 第二步：设置模板文件所在的路径。
		        configuration.setDirectoryForTemplateLoading(new File("D:\\项目目录\\sunDemo\\src\\main\\webapp\\views\\docs\\"));
		        // 第三步：设置模板文件使用的字符集。一般就是utf-8.
		        configuration.setDefaultEncoding("utf-8");
		        // 第四步：加载一个模板，创建一个模板对象。
		        Template template = configuration.getTemplate("docList.ftl");
		        // 第五步：创建一个模板使用的数据集，可以是pojo也可以是map。一般是Map。
		        Map dataModel = new HashMap<>();
		        dataModel.put("docLists", resultList);
		        dataModel.put("pageNum", i);
		        dataModel.put("listNum", listNum);
		        if (i == 1) {
			        dataModel.put("preNum", 0);
		        } else {
		        	dataModel.put("preNum", 1);
		        }
		        if (i == listNum) {
			        dataModel.put("nextNum", 0);
		        } else {
		        	dataModel.put("nextNum", 1);
		        }
		        Writer out = new FileWriter(new File("D:\\项目目录\\sunDemo\\src\\main\\webapp\\views\\default_" + Integer.toString(i) + ".html"));
				
		     // 6、调用模板对象的process方法，生成文件。
				template.process(dataModel, out);
				// 7、关闭流。
				out.close();
			}
		}
}
