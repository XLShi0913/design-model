package p12.state.state;

import p12.state.Work;

public class ForenoonState implements State {
    /**
     * 状态对应的行为，以及上下文转换的逻辑
     * @param work 上下文
     */
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println(String.format(
                    "当前时间: %.2f点 上午工作，精神百倍", work.getHour()));
        } else {
            work.setState(new NoonState());
            work.writePrograme();
        }
    }
}
