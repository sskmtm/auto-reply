package com.sskmtm.autoreply.job;

import com.sskmtm.autoreply.answerer.Answerer;
import com.sskmtm.autoreply.factory.AnswererFactory;
import com.sskmtm.autoreply.factory.MonitorFactory;
import com.sskmtm.autoreply.model.TaskListItem;
import com.sskmtm.autoreply.monitor.Monitor;

/**
 * 任务中介（负责协调监控者和回答者，把参数传给他们）
 */
public class JobMediator implements Runnable {

    private final TaskListItem taskListItem;

    public JobMediator(TaskListItem taskListItem) {
        this.taskListItem = taskListItem;
    }

    @Override
    public void run() {
        // 根据配置选择 monitor 和 answerer
        Monitor monitor = MonitorFactory.createMonitor(taskListItem.getMonitor(), taskListItem);
        Answerer answerer = AnswererFactory.createAnswerer(taskListItem.getAnswerer());
        // 监控并回答
        monitor.onMonitor(answerer);
    }
}
