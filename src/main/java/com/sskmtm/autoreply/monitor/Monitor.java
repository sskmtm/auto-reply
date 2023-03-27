package com.sskmtm.autoreply.monitor;

import com.sskmtm.autoreply.answerer.Answerer;
import com.sskmtm.autoreply.model.TaskListItem;

/**
 * 抽象监控者
 */
public abstract class Monitor {

    TaskListItem taskListItem;

    Monitor(TaskListItem taskListItem) {
        this.taskListItem = taskListItem;
    }

    /**
     * 触发监控
     *
     * @param answerer
     */
    public abstract void onMonitor(Answerer answerer);
}
