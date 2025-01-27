package com.sskmtm.autoreply.api.openai.model;

import lombok.Data;

/**
 * 创建补全请求
 * <a href="https://platform.openai.com/docs/api-reference/completions/create">参考文档</a>
 */
@Data
public class CreateCompletionRequest {

    /**
     * 模型
     */
    private String model;

    /**
     * 提示词
     */
    private String prompt;

    private Integer max_tokens;

    private Integer temperature;

    private Integer top_p;

    private Integer n;

    private Boolean stream;

    private Integer logprobs;

    private String stop;

}
