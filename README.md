# SpringBootBoard
# 개발 환경
1. Spring Boot : 3.5.16
2. JDK 17
3. mysql

# 게시판 api 주요기능
1. 글쓰기(/board/write) insert
2. 글목록(board/list) get
3. 글조회(/board/detail/{board_id}) get
4. 글수정(/board/update/{board_id}) update
5. 글삭제(/baord/delete/{board_id}) delete
5. 페이징처리
6. 검색기능



상세페이지 파일첨부
table : board_table 1:N file_table
        PK(board_id)    PK(file_id) / FK(board_id)

Boardinsert시 같이 첨부 가능 file_name?file_id?
저장시 file_id?file_name? original_name?같이 저장되나
detail로 들어가면 사진을 불러와야됨 어떻게 불러오나
파일은 최대 몇개? 한개당 size는 어떻게 max / min
update를 눌렀을 때 기존에 있는 사진을 같이 불러옴
update시로 불러왔을 때 기존 파일을 보여주고 파일 삭제/추가
update할 때 마지막으로 입력된 파일들 저장할 수 있게 만들어줌.
