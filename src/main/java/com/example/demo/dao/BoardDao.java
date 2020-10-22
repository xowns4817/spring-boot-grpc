package com.example.demo.dao;

import com.example.demo.dto.BoardObj;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface BoardDao {

    public Integer InsertBoard(BoardObj board);
    public ArrayList<BoardObj> ReadBoard();
    public Integer UpdateBoard(BoardObj board);
    public Integer DeleteBoard(int boardId);
}
