# jpabasics

### ORM이란
* ORM(Object-Relational Mapping)은 객체와 관계형 데이터베이스를 매핑
* ORM 프레임워크는 객체와 테이블을 매핑하여 패러다임 불일치 문제를 개발자 대신 해결
* 가장 큰 장점은 DB에 sql문으로 접근하는 것이 아닌 메서드로 접근
* ORM 프레임워크 중 대표적인 오픈소스 hibernate를 사용

### JPA란
* JAVA에서 ORM기술을 사용하는 인터페이스 모음

### Spring data JPA이란
* jpa를 더 추상화 시켜 개발 용이성을 올려주는 인터페이스
* jpaRepository라는 인터페이스 제공(실습)
* 그림과 같은 방식으로 DB와 통신
![image](https://user-images.githubusercontent.com/67108175/175753917-aa34148e-6cca-4e95-bf57-a7d0120c5130.png)


# 실습

### 개발 환경
* vscode로 실행
* jsp를 사용할 것이기 때문에 jar가 아닌 war로 실행, 따라서 /webapp/WEN-INF/views 폴더 생성
* 관계형 DB로 mysql사용
* jsp, mysql, jpa dependency 추가

### /WEN-INF/view/.jsp
* jsp를 사용한 웹에 출력
* 경로와 간단한 java문구 사용
* index: 기본화면
* signin: 회원가입화면
* login: 로그인하는 화면
* main: 로그인 성공화면, jpa를 더 알아보기 위해 member 리스트 출력

### controller
* 데이터를 이동하는 controller
* indexController: 인덱스 화면에 이동
* signinController: 회원가입 화면이동, member 회원가입 정보 DB에 저장
* loginController: 로그인 화면이동, 아이디와 비밀번호 일치 확인 후 로그인 화면으로 이동

### domain
* member 테이블의 colume이 담겨있는 모델
* @Data로 getter, setter를 입력하지 않아도 포함
* PK에는 앞에 Id를 표시
* colume으로 상세하게 DB테이블의 요소와 매칭

### repository
* spring boot에서 jpa실습의 주된 목적인 jparepository상속
* DB에 저장하는 save()매서드 내재
* DB에 table에 포함된 모든 정보를 찾아주는 findAll() 내재
* findBy~() 매서드를 작성하고 pk값을 넣으면 해당 pk값에 맞는 class return
* findAllBy~() 매서드를 작성하고 값을 넣으면 해당 값에 맞는 class list return

