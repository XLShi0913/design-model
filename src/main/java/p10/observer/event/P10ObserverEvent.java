package p10.observer.event;

public class P10ObserverEvent {

    public static void main(String[] args) throws Exception {
        EventHandeler eventHandeler = new EventHandeler();
        Subject huhansan = new Boss(eventHandeler);

        StockObserver tongshi1 = new StockObserver("股票同事", huhansan);
        NbaObserver tongshi2 = new NbaObserver("NBA同事", huhansan);

        eventHandeler.addEvent(tongshi1, "closeStockMarket");
        eventHandeler.addEvent(tongshi2, "closeNbaDirectSeeding");

        huhansan.setState("我胡汉三回来了");
        huhansan.notifyObservers();
    }
}
