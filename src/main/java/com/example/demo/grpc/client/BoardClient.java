package com.example.demo.grpc.client;

import com.example.demo.dto.BoardObj;
import com.example.demo.grpc.board.BoardDto;
import com.example.demo.grpc.board.BoardRequest;
import com.example.demo.grpc.board.BoardResponse;
import com.example.demo.grpc.board.BoardServiceGrpc;
import com.example.demo.service.BoardService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;

public class BoardClient {

    public static void main(String args[]) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8888)
                .usePlaintext()
                .build();

        BoardServiceGrpc.BoardServiceBlockingStub blockingStub = BoardServiceGrpc.newBlockingStub(channel);

        System.out.println("gRPC client connected to gRPC server");

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = format.format(System.currentTimeMillis());

        BoardDto boardDto = BoardDto.newBuilder()
                .setId(1L)
                .setUserId(1L)
                .setTitle("게시물 테스트")
                .setImageUrl("https://localhost/img")
                .setLikes(2)
                .setGroupId(1)
                .setGroupSeq(1)
                .setGroupDepth(1)
                .setCreatedTime(now)
                .setUpdatedTime(now)
                .build();

        BoardRequest req = BoardRequest.newBuilder()
                .setReq(boardDto)
                .build();

        BoardResponse response = blockingStub.boardInsert(req);

        System.out.println("server reponse: " + response.getRes());

        channel.shutdown();
        System.out.println("gRPC client shutdown");
    }
}

