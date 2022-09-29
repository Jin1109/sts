/* 다향성 이용하기
 * 인터페이스를 이용하여 클래스 사이의 의존 관계를 약하게 설정하고 있습니다.
 * 
 * MessageBean 인터페이스의 상속을 받는 인스턴스들은 반드시 sayHello()메서드르 오버라이딩 하도록 해 두었기 때문에
 * 인터페이스 MesseageBean으로 선언한 래퍼런스 변수로 접근해서 메서드를 호출할 경웅에는 코드를 수정하지 않아도 됩니다.
 * 하지만 MessageBeanKo 클래스를 MessgaeBeanEn 클래스로 변경해야할 경우 주석 라니 처럼 변경해야 합니다.
 * 즉, 참조하는 객체만 변경하면 됩니다.
 * 만약 방대한 어플리케이션일 경우 인스턴스 여러곳에서 하고 있다면 변경할 코드의 양도 많아지게 됩니다.
 */
package com.naver.myhome1.sample2_1;

public class HelloApp_interface {
	
    public static void main(String[] args) {
        MessageBean bean = new MessageBeanKo();
        bean.sayHello("홍길동");
        
        /*
         *  MessageBean bean = new MessageBeaEn();
         */
    }
}

