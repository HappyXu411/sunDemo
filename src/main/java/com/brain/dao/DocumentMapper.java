package com.brain.dao;

import com.brain.bean.Document;
import com.brain.bean.DocumentExample;
import com.brain.bean.DocumentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocumentMapper {
    long countByExample(DocumentExample example);

    int deleteByExample(DocumentExample example);

    int deleteByPrimaryKey(Integer docid);

    int insert(DocumentWithBLOBs record);

    int insertSelective(DocumentWithBLOBs record);

    List<DocumentWithBLOBs> selectByExampleWithBLOBs(DocumentExample example);

    List<Document> selectByExample(DocumentExample example);
    
    List<Document> selectByLimit(int start,int pageNum);
    
    List<Document> selectByTitle(String title);

    DocumentWithBLOBs selectByPrimaryKey(Integer docid);

    int updateByExampleSelective(@Param("record") DocumentWithBLOBs record, @Param("example") DocumentExample example);

    int updateByExampleWithBLOBs(@Param("record") DocumentWithBLOBs record, @Param("example") DocumentExample example);

    int updateByExample(@Param("record") Document record, @Param("example") DocumentExample example);

    int updateByPrimaryKeySelective(DocumentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DocumentWithBLOBs record);

    int updateByPrimaryKey(Document record);


}