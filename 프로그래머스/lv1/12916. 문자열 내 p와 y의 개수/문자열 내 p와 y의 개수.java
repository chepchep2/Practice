// 함수형 문제(메서드형 문제)
class Solution {
    boolean solution(String s) { // 메서드 - 문자열 s 입력.
        // 배열, 반복, for, 순차탐색(선형탐색)
        // 1. 입력 2. 계산 3. 출력
        // 메서드형 문제에서 입력은 무엇일까?
        // 표준입출력에선 Scanner를 통한 입력
        // -> 메서드형 => 매개변수를 통해 인자를 받아서...
        // 값: 인자(argument), 변수: 매개변수(parameter)

        // 메서드에서 외부로 값을 내보내는 방법
        // 1. (인스턴스 변수, 멤버변수) 변수에 할당, 변경
        // 2. return(반환값)
        // 메서드형 문제에서는 멤버변수를 드물게 쓴다.
        // 그리고 값 출력에는 무조건 return만 쓴다.
        
        // 대문자와 소문자가 섞여있는 문자열 s
        // - p의 개수, y의 개수를 비교해서.. (대문자 소문자 상관 X)
        // (1) 같으면 true, 다르면 false
        // (2) p와 y가 하나도 없다면 true;
        
        int pCount = 0; // p의 개수를 세는 변수
        int yCount = 0; // y의 개수를 세는 변수
        // for문 밖에 있어야하는 이유? -> {} 반복문 돌 때마다 0이 됨.
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c); // 순차탐색
            // index -> 그 길이만큼 반복해서 처리
            // p의 개수와 y의 개수를 count
            // 어떤 경우에 세어줄까?
            if (c == 'p' || c == 'P') {
                // 문자 c가 p거나 P일 경우
                pCount += 1; // pCount에 1을 더해줌
            }
            if (c == 'y' || c == 'Y') {
                // 문자 c가 p거나 P일 경우
                yCount += 1; // yCount에 1을 더해줌
            }
        }
        System.out.println("pCount: " + pCount);
        System.out.println("yCount: " + yCount);
        // 1) pCount가 yCount랑 같으면 -> true (!)
        // 2) pCount가 yCount랑 다르면 -> false (!)
        // 3) pCount, yCount가 둘 다 없으면 항상 true
        // -> 둘 다 없으면 어차피 개수는 0으로 "같다"
        // return true; // 일단 결과치는 고정된 값으로 두고...
        if (pCount == yCount) {
            return true; // return 으로 실행 종료되므로 else if 안해도...
        }
        if (pCount != yCount) {
            return false;
        }
        
        return true;
    }
}