package com.example.tester.select;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardSelectApi {

    public String boardSelect(){
        return null;
    }
}

/*
    퀘이사존 질문/토론
    게시글 전체 목록 조회
    select
    입력은 /board
    category , title, writer, create_at
    기준은 create_at순으로 정렬
    board_id는 안보여줘
    category별 목록 분리
    페이징처리 10페이지 페이징은 10개씩
    검색처리
    검색은 title,title + content, writer


 */