package p10.observer.normal;

import p10.observer.normal.observer.NbaObserver;
import p10.observer.normal.observer.Observer;
import p10.observer.normal.observer.StockObserver;
import p10.observer.normal.subject.Boss;
import p10.observer.normal.subject.Secretary;
import p10.observer.normal.subject.Subject;

public class P10ObserverNormal {

    public static void main(String[] args) {

        Subject tongzizhe = new Secretary();
        Subject huhansan = new Boss();

        Observer stocktongshi1 = new StockObserver("看股票同事1", tongzizhe);
        Observer nbatongshi1 = new NbaObserver("看NBA同事1", tongzizhe);
        Observer stocktongshi2 = new StockObserver("看股票同事2", huhansan);
        Observer nbatongshi2 = new NbaObserver("看NBA同事2", huhansan);

        tongzizhe.attach(stocktongshi1);
        tongzizhe.attach(nbatongshi1);
        huhansan.attach(stocktongshi2);
        huhansan.attach(nbatongshi2);

        // 通知者的变化
        tongzizhe.setSubjectState("老板回来了");
        // 随之相关的变化
        tongzizhe.notifyObservers();

        huhansan.setSubjectState("我胡汉三回来了");
        huhansan.notifyObservers();
    }

}
