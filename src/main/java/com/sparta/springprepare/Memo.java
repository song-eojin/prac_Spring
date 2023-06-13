package com.sparta.springprepare;

import lombok.*;

@Getter
@Setter
//롬복 패키지에 들어있는 annotation 으로, 어떻게 lombok 이 해당 메서드를 만들어주는지 확인해준다.

// 방법은 Gradle-Tasks-build build 더블클릭하면 Memo.class 에서 내가 만들지 않은 각각의 필드에 대한 getter, setter 메서드가 생성됨을 볼 수 있다.


@NoArgsConstructor
//기본 생성자

@AllArgsConstructor
//모든 필드 값들을 매개변수로 갖는 생성자 생성

@RequiredArgsConstructor
//final 이 달린 필드를 가지는 생성자 생성 
public class Memo {
    private String username;
    private String contents;
}

class Main {
    public static void main(String[] args) {
        Memo memo = new Memo();
        memo.setUsername("Robbie");
        System.out.println(memo.getUsername());
    }
}