package p12.state.state;


import p12.state.Work;

/**
 * 抽象状态类
 */
public interface State {
    void writeProgram(Work work);
}
