package com.sskmtm.autoreply.api.openai;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import com.sskmtm.autoreply.common.ErrorCode;
import com.sskmtm.autoreply.exception.BusinessException;
import com.sskmtm.autoreply.api.openai.model.CreateCompletionRequest;
import com.sskmtm.autoreply.api.openai.model.CreateCompletionResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * OpenAi 接口
 * <a href="https://platform.openai.com/docs/api-reference">参考文档</a>
 **/
@Service
public class OpenAiApi {

    /**
     * 补全
     *
     * @param request
     * @param openAiApiKey
     * @return
     */
    public CreateCompletionResponse createCompletion(CreateCompletionRequest request, String openAiApiKey) {
        if (StringUtils.isBlank(openAiApiKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "未传 openAiApiKey");
        }
        String url = "https://api.openai.com/v1/completions";
        String json = JSONUtil.toJsonStr(request);
        String result = HttpRequest.post(url)
                .header("Authorization", "Bearer " + openAiApiKey)
                .body(json)
                .execute()
                .body();
        return JSONUtil.toBean(result, CreateCompletionResponse.class);
    }
}
