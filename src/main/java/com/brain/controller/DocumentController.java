package com.brain.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.brain.bean.Document;
import com.brain.bean.Msg;
import com.brain.pojo.DocumentInfo;
import com.brain.service.DocumentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.brain.dto.ResultMessage;

@Controller
public class DocumentController {
	
	@Autowired
	private DocumentService documentService;
	
    
	
	public List<DocumentInfo> splitArray(List<DocumentInfo> docList,int index){
		int length = 20;
		List<DocumentInfo> result = new ArrayList<DocumentInfo>();
		if (docList.size() > index*20 + length) {
			for(int i = index*20 ; i < index*20 + length ; i++) {
				  result.add(docList.get(i));
			}
		} else {
			for(int i = index*20 ; i < docList.size() ; i++) {
				  result.add(docList.get(i));
			}
		}
		
		return result;
	}
	
	/*@RequestMapping
	@ResponseBody
    public ModelAndView docList(@RequestParam(value="index",defaultValue="0")int index) {
        List<DocumentInfo> docList = documentService.getAll();
        //这里会去找views下面的books文件夹下的home.ftl
        //可以看spring-web中关于freeMarker的配置，指定了路径以及后缀名
        List<DocumentInfo> resultList = splitArray(docList,index);
        
        return new ModelAndView("docs/docList", "docLists", resultList);
    }*/
    
	@RequestMapping("/docs")
    public Msg docList1(@RequestParam(value="index",defaultValue="0")Integer index) {
		List<DocumentInfo> docList = documentService.getAll();
        List<DocumentInfo> resultList = splitArray(docList,index);
        
        return Msg.success().add("docLists",resultList);
    }
	
	/**
	 * 单独的员工信息查询
	 * @throws UnsupportedEncodingException 
	 */
	/*@RequestMapping(value="/doc/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getDocById(@PathVariable("id")Integer id) {
		Document document = documentService.getDocById(id);
		return Msg.success().add("doc", document);
	}*/
	
	@RequestMapping(value="/findByTitle",method=RequestMethod.GET)  
    @ResponseBody  
	public Msg getDocByTitle(@RequestParam(value="title")String title,@RequestParam(value="pn",defaultValue="1")Integer pn) throws UnsupportedEncodingException {
		//引入PageHelper分页插件,穿入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		title = java.net.URLDecoder.decode(title,"UTF-8");
		List<Document> docs = documentService.getDocByTitle(title);
		PageInfo page = new PageInfo(docs,5);
		return Msg.success().add("pageInfo",page);

	}
	
	
	
	/*@GetMapping("{title}")
    @ResponseBody
    public String book(@PathVariable("title") String title) {
		try {
			title = new String(title.getBytes("ISO-8859-1"), "utf8");
		} catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getStackTrace());
        }
        if (StringUtils.isEmpty(title))
            return new ResultMessage(false, "书名不能为空",400).toString();
        return new ResultMessage<>(true, "查询成功", documentService.getDocByTitle(title), 200).toString();
    }*/
}
