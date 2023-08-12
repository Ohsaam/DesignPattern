package DesignPattern.Strategy;

public class SumPrinter {
    //~N까지의 총합을 출력하는 메소드
    void print(SumStrategy strategy, int N)
    {
        System.out.println(strategy.get(N));
    }
}
