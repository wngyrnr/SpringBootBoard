package com.example.tester.boardList.service;

import com.example.tester.boardList.dto.BoardListResponseDto;

public interface BoardListService {
    BoardListResponseDto boardList(int page, int size);


}
