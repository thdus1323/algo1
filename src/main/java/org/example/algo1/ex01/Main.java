package org.example.algo1.ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //student 객체 만들고 값 넣어줬다.
        Student st1 = new Student("손오공", "1682");
        Student st2 = new Student("저팔계", "1772");
        Student st3 = new Student("사오정", "1813");

        //student 객체를 arraylist에 넣었다.그걸 list라고 부를게
        ArrayList <Student> list = new ArrayList<Student>();

        //list에 st1~3 넣어줄게
        list.add(st1);
        list.add(st2);
        list.add(st3);

        //list를 출력해볼거야.
        for (Student stu : list){
            System.out.println(stu.getName());
            System.out.println(stu.getNo());
        }

        //스캐너 쓸거야
        Scanner scan = new Scanner(System.in);

        //이거 실행할게.
        while(true){
            //출력하고 값받을게
            System.out.println("계속 검색을 하고 싶으면 y, 종료하고 싶으면 n");
            String input = scan.next();

            //y넣으면 이름 값 사용자에게 받을거야. flag는 했냐 안했냐 유무인데 기본 false이지!
            if (input.equals("y")){
                System.out.println("검색을 시작합니다");
                String name = scan.next();
                boolean flag = false;

                //list를 끝까지 반복할거야
                for (Student stu: list){
                    //만약에 이름이랑 같은 학생이름 있으면 학번 출력해줘. 이 경우 flag는 true야.
                    if (stu.getName().equals(name)){
                        System.out.println("해당하는 학생의 학번은:"+stu.getNo());
                        flag=true;
                    }
                }

                //만약에 flag가 false이면 아래를 출력
                if (!flag){
                    System.out.println("해당하는 학생이름이 없습니다.");
                }
                //아니면 입력값이 n이면 끝내!
            } else if (input.equals("n")) {
                break;

            }

        }
        //이거 출력해
        System.out.println("프로그램이 종료되었습니다.");
    }
}
