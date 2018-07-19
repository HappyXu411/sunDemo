package com.brain.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.brain.bean.Document;
import com.brain.dao.DocumentMapper;
import com.brain.pojo.DocumentInfo;


public interface DocumentService {
	
	public List<DocumentInfo> getAll();
	
	public Document getDocById(Integer id);

	public List<Document> getDocByTitle(String title);
	
}
