package co.kr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCon {
	// 자바 빌드패스 > add external jar > ojdbc7.jar 추가
	// 오라클데이터베이스 이기 때문에 ojdbc

	static String url = "jdbc:oracle:thin:@localhost:1521:xe"; // DB안에서 따로 설정안하면 기본포트1521
	static String user = "osfu";
	static String password = "12345678";
	static String driverName = "oracle.jdbc.driver.OracleDriver";

	public static void main(String[] args) {
		try {
			Class.forName(driverName); // 리플렉션
			// ▼드라이브 매니져를 이용해서 드라이브를 연결하기
			Connection con = DriverManager.getConnection(url, user, password);
			// getConnection static(글자 기울임), public , 아이디를 잘못적었거나 비밀번호를 잘못적었거나
			// DB에 접근할수있게, 데이터타입에 맞는 커넥션에 변수명 con으로
			String sql = "select * from address where ad_num<=100 order by ad_num";
			PreparedStatement ps = con.prepareStatement(sql);
			// sql을 준비한 ps에서 실행하자
			// ps.execute(); // 실행하다, 데이터 타입 boolean
			ResultSet rs = ps.executeQuery(); // 실행결과 화면 중 컬럼만 보고있음
			// 컬럼=메타데이터 , 열?=로우데이터(씰)
			// 반복문 쓸 때: for문(시작점, 끝점 명확할때 사용), while문(돌려봐야지 알수있는거)
			System.out.println("AD_NUM\t | \t AD_CODE");
			while (rs.next()) { // rs.next() = boolean, 시야 내렸는데 데이터가 있으면 리턴트루
			System.out.println(rs.getString("ad_num") + "\t | \t" + rs.getString("ad_code"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
