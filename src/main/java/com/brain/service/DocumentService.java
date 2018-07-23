package com.brain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brain.bean.Document;
import com.brain.dao.DocumentMapper;
import com.brain.pojo.DocumentInfo;
import com.brain.utils.Page;

@Service
public class DocumentService{
	
	@Autowired
	DocumentMapper documentMapper;
	
	/**
	 * 查询所有员工
	 * @return
	 */
	public Page<Document> findByPage(int currentNum,int pageNum){
		Page<Document> docInfo = new Page<Document>();
		int start = (pageNum-1) * currentNum;
		List<Document> docs = documentMapper.selectByLimit(start,pageNum);
		docInfo.setPageNum(pageNum);
        docInfo.setObj(docs);
		return docInfo;
	}
	
	/**
	 * 按照员工ID查询
	 * @param id
	 * @return
	 */
	public Document getDocById(Integer id) {
		Document document = documentMapper.selectByPrimaryKey(id);
		return document;
	}

	public List<Document> getDocByTitle(String title) {
		List<Document> document = documentMapper.selectByTitle(title);
		return document;
	}

	public List<DocumentInfo> getAll(){
		List<Document> docs = documentMapper.selectByExample(null);
		List<DocumentInfo> docInfo = new ArrayList<DocumentInfo>();
		for (Document doc : docs) {
			DocumentInfo info = new DocumentInfo();
            info.setTitle(doc.getDoctitle());
            info.setEditor(doc.getDoceditor());
            docInfo.add(info);
        }
		
		return docInfo;
	}
}
