package com.example.demo.service;

import com.example.demo.dao.BoardDao;
import com.example.demo.dto.BoardObj;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BoardService {

    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    @Autowired
    BoardDao boardDao;

    //게시물 삽입
    public Integer InsertBoard(BoardObj board) {

        try {
            boardDao.InsertBoard(board);
            return 200;
        } catch (Exception e) {
            logger.info(e.toString());
            return 500;
        }
    };

    //전체 게시물 조회
    public ArrayList<BoardObj> ReadBoard( ) {
        return boardDao.ReadBoard();
    }
}
