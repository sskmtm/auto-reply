package com.sskmtm.autoreply.answerer;

/**
 * 回答者
 */
public interface Answerer {

    /**
     * 回答
     *
     * @param prompt 提示语
     * @return 回答结果
     */
    String doAnswer(String prompt);
}
