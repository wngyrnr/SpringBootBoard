package com.example.tester.boardList.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;


@Getter
@AllArgsConstructor
public class BoardListResponseDto {
    private List<BoardListDto> content; // 이번 페이지 실제 게시글 10개
    private long totalElements;         // 전체 게시글 수 (countAll() 결과)
    private int totalPages;             // totalElements를 size로 나눠서 올림한 값
    private int currentPage;            // 클라이언트가 요청한 page를 그대로 돌려줌.(나중에 버튼 활성용)

}
