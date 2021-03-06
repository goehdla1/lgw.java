package com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;

public class Ex11 {
	public static void main(String[] args) {
		// Map 인터페이스 : Key와 Value를 매핑하는 구조로 이루어짐
		// Key는 중복 될 수 없다.
		// Key를 호출하면 Value가 나온다.
		// Key를 별도로 관리 = > keySet()
		// add()로 추가 못하고 put(key,value) 를 사용해서 추가한다.

		// map 생성 (key 숫자로 만든다.)
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		// 추가 : add X , put(k,v)
		map1.put(0, "한국");
		map1.put(1, "미국");
		map1.put(2, "중국");
		map1.put(3, "태국");
		map1.put(4, "영국");
		map1.put(5, "한국"); // value의 중복은 상관없다.
		map1.put(6, "한국");
		map1.put(3, "영국"); // key 중복 : 덮어쓴다.

		System.out.println(map1);

		// 하나씩 출력(get(key) = > value 가 나온다.
		System.out.println(map1.get(4));
		System.out.println(map1.get("한국")); // value를 입력하면 나오지 않는다.
		System.out.println("===================================================");

		// 일부러 key를 순서대로 만들었기 때문에 for문을 사용할 수 있다.
		// map 에서 value를 호출하는 방법 : get(key)
		for (int i = 0; i < map1.size(); i++) {
			System.out.print(map1.get(i) + " "); // map에서는 사용하지 않는다.

		}

		System.out.println("===================================================");
		// 1씩 증가하지 않아도 , 일정한 규칙이 없어도 사용 가능.
		for (Integer k : map1.keySet()) {
			System.out.print(map1.get(k) + " ");

		}
		System.out.println("===================================================");

		// Map 생성 (key를 문자열(String)로 만든다 = > 일반적인 방법)
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("이름", "고길동");
		map2.put("나이", "34");
		map2.put("주소", "서울시 도봉구 방학동");
		map2.put("성별", "남");
		map2.put("취미", "잠자기");
		System.out.println("===================================================");

		for (String k : map2.keySet()) {
			System.out.println(map2.get(k));

		}
		System.out.println("===================================================");
		Iterator<String> it = map2.keySet().iterator();
		while (it.hasNext()) {
			String res = (String) it.next();
			System.out.println(map2.get(res));
		}
	}
}
