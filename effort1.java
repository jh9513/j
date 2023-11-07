import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class effort1 {
    public static void main(String[] args){
        System.out.println("리스트");
        ArrayList l1 = new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add("Hello");
        System.out.println(l1);
        /* 리스트자료형도 배열처럼 데이터를 나열해주는 기능을 가지고 있는데 다양한 메서드를 포함하고 있다.
        위의 것은 add 함수로 데이터를 추가하는 기능을 가지고 있다.
         */
        System.out.println(l1.get(0));
        System.out.println(l1.get(2));
        //리스트 자료형의 get 함수. 입력한 순서의 데이터를 출력한다.
        System.out.println(l1.size());
        //리스트에 있는 데이터의 갯수가 몇 개인지 출력
        System.out.println(l1.remove(0));
        System.out.println(l1.remove(Integer.valueOf(2)));
        System.out.println(l1);
        /*remove 함수. 리스트의 데이터를 지우는 역할을 하고 순서가 아닌 값을 지우고 싶다면,
        Integer.valueof()를 입력할 것.*/
        l1.clear();
        System.out.println(l1);
        /*clear메소드. 리스트에 있는 모든 데이터 삭제*/

        ArrayList l2 = new ArrayList<>();
        l2.add(5);
        l2.add(3);

        System.out.println(l2);

        l2.sort(Comparator.naturalOrder());
        System.out.println(l2);
        l2.sort(Comparator.reverseOrder());
        System.out.println(l2);
        //오름차순, 내림차순 정리
        System.out.println(l2.contains(2));
        //l2에 2가 포함되어 있는지 없는 지 확인하는 함수

        System.out.println("매핑");
        HashMap map = new HashMap();
        map.put("kiwi",9000);
        map.put("apple",10000);
        map.put("mango",12000);
        System.out.println(map);
        /*MAP은 쌍을 이뤄 저장하는 함수를 말한다. put은 데이터를 집어넣은 메소드이고 순서대로 나오지는 않는다.*/
        System.out.println(map.get("grape"));
        //get 메소드는 값이 있는 지 없는지 확인할 수 있는데, 있으면 값이 나오고 없으면 null이라고 나온다.
        System.out.println(map.size());
        //size 메소드는 값이 얼마나 있는지 알려주는 것.
        System.out.println(map.remove("kiwi"));
        //remove는 입력한 데이터가 있으면 값을 출력해주고 없으면 null
        System.out.println(map.containsKey("apple"));
        //포함되어 있는지 있으면 true, 없으면 false

        System.out.println("Generics==자료형 제한 기능");
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add(2);
        System.out.println(l3);
        ArrayList<String>l4=new ArrayList<String>();
        l4.add("a");

        HashMap <String,Integer>map2=new HashMap<>();
        map2.put("apple",1000);
        System.out.println(map2);

        System.out.println("대입 연산자");
        int a = 100;
        System.out.println(a);
        System.out.println("산술 연산자");
        int numX=10;
        int numY=3;
       int result = 0;
        result = numX + numY;
        result = numX * numY;
        result = numX - numY;
        result = numX / numY;
        result = numX % numY;
        System.out.println(result);
        /* 위의 결과도 알고싶은데.. 어떻게 해야하지?*/
        System.out.println("증감연산자");
        int numZ = 1;
        System.out.println(numZ++);
        System.out.println(numZ);
        System.out.println(++numZ);
        System.out.println(numZ);

        numZ=1;
        System.out.println(numZ--);
        System.out.println(numZ);
        System.out.println(--numZ);
        System.out.println(numZ);

        System.out.println("관계연산자");
        int numA = 10;
        int numB= 9;
        System.out.println(numA>numB);
        System.out.println(numA<numB);
        System.out.println(numA==numB);
        System.out.println(numA!=numB);
        //!는 아니다라는 뜻
        System.out.println("논리연산자");
        System.out.println((10>9)&&(1==0));
        System.out.println((10>9)||(1==0));
        //&&는 그리고로, 둘 다 맞아야 참이 나오고 ||는 오어함수로 둘 중 하나만 맞아도 참
        System.out.println("복합대입연산자");
        int num1 = 10;
        int num2 = 5;
        num1 += num2;
        System.out.println(num1);
        // num1 += num2 는 num1=num1+num2 를 간략하게 줄인 것이다.
        System.out.println("삼항연산");
        int A = 100;
        String aResult = (A==100)?"Yes":"No";
        System.out.println(aResult);
        //위의 코드를 해석해보자면, A가 100이 맞아? 맞으면 예스 아니면 노라고 해.
    }
}
