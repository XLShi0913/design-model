package p12.state.state;

import p12.state.Work;

public class RestState implements State {
    @Override
    public void writeProgram(Work work) {
        System.out.println(
                String.format("当前时间：%.2f点 下班回家了", work.getHour()));
    }
}
