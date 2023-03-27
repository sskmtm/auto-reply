package com.sskmtm.autoreply.factory;

import com.sskmtm.autoreply.model.TaskListItem;
import com.sskmtm.autoreply.monitor.DefaultMonitor;
import com.sskmtm.autoreply.monitor.Monitor;
import com.sskmtm.autoreply.monitor.ZsxqMonitor;

/**
 * 监视者工厂
 */
public class MonitorFactory {

    /**
     * 创建监视者
     *
     * @param monitor
     * @param taskListItem
     * @return
     */
    public static Monitor createMonitor(String monitor, TaskListItem taskListItem) {
        switch (monitor) {
            case "zsxq":
                return new ZsxqMonitor(taskListItem);
            default:
                return new DefaultMonitor(taskListItem);
        }
    }
}
