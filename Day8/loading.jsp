
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%@page import="java.sql.*"%> 팁 --%>
<%!
	Connection conn; // db 와 연결성을 가지는 객체
	PreparedStatement pstmt; // db의 데이터에 접근하여 sql문 (crud)를 실행
	ResultSet rs; // 조회(select) 결과의 데이터를 가지는 객체 

	String driver="oracle.jdbc.OracleDriver"; // 풀클래스명. 
		// oracle driver >> 오라클 jdbc 드라이버 클래스
		// 자바 프로그램에서 데이터베이스에 접속하려면 드라이저를 프로그램에 등록하는 코드를 제공 필요
		
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 로컬 호스트. 오라클의 기본적인 주소. 
	
	String dbID="C##JAVAUSER";
	String dbPW="java2024";
	
	String query= "SELECT * from KGMEMBER";
%>


<%

try{ // 메모리로 로딩할때 옝외 발생해서 처리 해줘야됨
	
	Class.forName(driver); // 메모리로 로딩한다.
							// Class 클래스의 정적 메서드인 forName 메서드 >> 풀패키지명 쓰면 해당하는 클래스를 메모리로 로딩해준다

	conn = DriverManager.getConnection(url , dbID,dbPW ); // connection 객체 생성 >> 

	
	pstmt = conn.prepareStatement(query); // sql tlfgo
	
	rs = pstmt.executeQuery(); // 조회의 결과 데이터를 resultset 타입으로 반환 
	
	while(rs.next()){
		//next : 다음 레코드가 있는지 확인 후에 다음 레코드가 있다면 true, 없으면 false 를 반환
		String id = rs.getString("ID"); // ResultSet 의 getter 계열 메서드에 column 의 이름을 문자열타입으로 arg 를 넣어 해당 column 값을 얻을 수 있다
		String pw = rs.getString("PW"); 
		String name = rs.getString("NAME"); 
		String email = rs.getString("EMAIL"); 
		String address = rs.getString("ADDRESS"); 
		String regdate = rs.getString("REGDATE"); 
		out.print("아이디: "+id+", 비밀번호:"+pw+", 이름: "+name+", 이메일: "+email+",주소:"+address+", 가입일:"+regdate+"<br>");
		
		
	
	}
	
}catch(Exception e){ 
	e.printStackTrace();
}finally{ // db 관련 작업이 완료된 후에는 사용된 객체는 메모리 상에서 해제해 줘야된다. 
			// 해ㅔ 순서는 최근 사용했던 객체부터 거꾸로 올라가면서 해체한다.
	
	try{
		if (rs != null) rs.close();
		 if (pstmt != null) pstmt.close();
		 if (conn != null) conn.close();
	}catch(Exception e){}
}




%>

</body>
</html>
