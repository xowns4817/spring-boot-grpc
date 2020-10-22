package com.example.demo.grpc.server;

import com.example.demo.dto.BoardObj;
import com.example.demo.grpc.board.*;
import com.example.demo.service.BoardService;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardServiceImpl extends BoardServiceGrpc.BoardServiceImplBase {

    @Autowired
    BoardService boardService;

    @Override
    public void boardInsert(BoardRequest request, StreamObserver<BoardResponse> responseObserver) {
        BoardDto reqMsg = request.getReq();

        System.out.println("Text from client : " + reqMsg.getUserId());
        System.out.println("Text from client : " + reqMsg.getTitle());
        System.out.println("Text from client : " + reqMsg.getImageUrl());
        System.out.println("Text from client : " + reqMsg.getGroupId());
        System.out.println("Text from client : " + reqMsg.getGroupSeq());
        System.out.println("Text from client : " + reqMsg.getGroupDepth());

        BoardObj board = new BoardObj();
        board.setUserId(reqMsg.getUserId());
        board.setTitle(reqMsg.getTitle());
        board.setImgUrl(reqMsg.getImageUrl());
        board.setGroupId(reqMsg.getGroupId());
        board.setGroupSeq(reqMsg.getGroupSeq());
        board.setGroupDepth(reqMsg.getGroupDepth());
        board.setCreatedTime(reqMsg.getCreatedTime());
        board.setUpdatedTime(reqMsg.getUpdatedTime());

        //reqMsg를 디비에 넣는다.

        boardService.InsertBoard(board);

        BoardResponse response = BoardResponse.newBuilder()
                    .setRes(reqMsg)
                    .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
