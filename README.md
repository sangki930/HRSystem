# HRSystem

- 사용기술 : HTML, CSS, Javascript, Spring , Java, MySQL, MongoDB
- 개발기간 : 
(최초) 2020.04.01 ~ 2020.04.13
(개선) 2021.02.28 ~ 2021.03.31
[기존]
- 수행 내용
1. Spring Security 모듈로 권한(ADMIN, MEMBER)별 로그인 구현
2. ajax 비동기 통신으로 회원조회/ 인사상세 항목 실시간 추가,수정, 삭제 구현
3. ERD 설계(회원, 인사상세, 면허, 경력 등)
4. Spring Data JPA를 활용한 회원 추가/인사 상세 구현
5. Specification 클래스를 활용한 컬럼 필터링 구현
6. 회원 중복 체크, ajax 비동기 통신에 활용하기 위한 REST API 설계

[개선]
1. 정규식 버그(예 : 회원 추가시 정규식에 맞지 않음에도 추가되는 것) 수정
2. 로그인 및 메소드 실행 시, 회원과 시간이 있는 로그를 MongoDB에 저장
