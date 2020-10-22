package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class BoardObj {

    Long id;
    Long userId;
    String title;
    String imgUrl;
    int likes;
    int groupId;
    int groupSeq;
    int groupDepth;
    String createdTime;
    String updatedTime;

    public BoardObj( ){ }

    public BoardObj(Long id, Long userId, String title, String imgUrl, int likes, int groupId, int groupSeq, int groupDepth, String createdTime, String updatedTime) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.imgUrl = imgUrl;
        this.likes = likes;
        this.groupId = groupId;
        this.groupSeq = groupSeq;
        this.groupDepth = groupDepth;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void setGroupSeq(int groupSeq) {
        this.groupSeq = groupSeq;
    }

    public void setGroupDepth(int groupDepth) {
        this.groupDepth = groupDepth;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }
}
