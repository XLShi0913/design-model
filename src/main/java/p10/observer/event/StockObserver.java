package p10.observer.event;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StockObserver {
    String name;
    Subject subject;

    public void closeStockMarket() {
        System.out.println(subject.getState() + " " + name + " 关闭股票行情，开始工作！");
    }
}
