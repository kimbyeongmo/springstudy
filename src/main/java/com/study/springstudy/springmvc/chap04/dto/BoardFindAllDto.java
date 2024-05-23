package com.study.springstudy.springmvc.chap04.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.A;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BoardFindAllDto {

    private long boardNo;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDateTime;
    private int viewCount;
    private int replyCount;

}
