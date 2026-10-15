package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Quote {
    int number;
    String content;
    String author;

    Quote(int number, String content, String author) {
        this.number = number;
        this.content = content;
        this.author = author;
    }
}

public class Main {
    static void main() {
        System.out.println("== 명언 앱 ==");

        ArrayList<Quote> arr = new ArrayList<>();

        while (true) {
            System.out.print("명령) ");

            Scanner sc = new Scanner(System.in);

            String cmd = sc.nextLine().trim();

            if (cmd.equals("종료")) {
                break;
            }

            if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("작가 : ");
                String author = sc.nextLine().trim();

                arr.add(new Quote(arr.size() + 1, content, author));
                System.out.println(arr.size() + "번 명언이 등록되었습니다.");
            }

            if (cmd.equals("목록")) {
                System.out.print("번호 / 작가 / 명언\n----------------------\n");
                for (int i = arr.size() - 1; i >= 0; i--) {
                    Quote q = arr.get(i);
                    System.out.println(q.number + " / " + q.author + " / " + q.content);
                }
            }
        }
    }
}
