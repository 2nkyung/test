package co.kr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Execute {

	public List<Map<String, String>> selectPersonList() {
		List<Map<String, String>> list = new ArrayList<>(); 
		//리스트 인터페이스로 지정해주면 나중에 링크드리스트든 다른 클래스로 쉽게 변경가능
		list = new LinkedList<>(); 
		return list;
		//인터페이스 캡슐화 찾아보기!! 
	}

	public static void test(Map<String, String> map) {
		map = new HashMap<>();
		map.put("name", "Rion");
	}

	public static void main(String[] args) {
//		Exam01 e = new Exam01();
////		List<String> strList = new ArrayList<>(); 굳이 메모리 생성할필요 없이 아래 대입할거기때문에 필요없음.
//		e.setStrList(new ArrayList<>());
//		
//		System.out.println(e.getStrList());
//	

		// Remocon r = new TVRemocon();
//	Remocon r = new AirconRemocon();
		// r.turnOn();
		// r.volumeUp();

		Person p = new Person();
		Remocon ar = new AirconRemocon();
		// 위에꺼를 줄여서 Person p = new Person(new AirconRemocon());
		p.useRemocon(ar);
		p.useRemocon();

	}
}
