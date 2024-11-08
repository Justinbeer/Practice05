package com.javaex.ex07;

import java.util.Scanner;

// loop
// 입력받기
// 인스턴스생성
// 배열에추가

public class FriendApp {

    public static void main(String[] args) {

//    	Friend f1 = new Friend();
    	
        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
//        System.out.print("이름 : ");
//        f1.setName(sc.next());
//        System.out.print("핸드폰 : ");
//        f1.setHp(sc.next());
//        System.out.print("학교 : ");
//        f1.setSchool(sc.next());
//        f1.showInfo();
        //for문 시작
       //친구정보 3명 입력 로직 --> 반복문 사용
        for(int i = 0; i < friendArray.length; ++i) {
        	String name, hp, school;
        	
        	System.out.print("이름 : ");
        	name = sc.next();
        	System.out.print("핸드폰 : ");
        	hp = sc.next();
        	System.out.print("학교 : ");
        	school = sc.next();
        	
        	Friend f = new Friend(name, hp, school);
        	friendArray[i] = f;
        	
        	System.out.println("-----------------------");
        	
        	//for문 끝
        }
   
    
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	Friend f = friendArray[i];
        	f.showInfo();
        	
        }

        sc.close();
    }

}
