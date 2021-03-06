package com.ymatou.productquery.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by zhangyong on 2017/4/20.
 */
public class GetProductDetailListByTradeIsolationRequest extends BaseRequest {
    /**
     * 商品编号列表
     */
    @JsonProperty("ProductIdList")
    @NotEmpty(message = "商品id不能为空")
    @NotNull(message = "商品id不能为空")
    private List<String> productIdList;

    /**
     * 下一场活动延长取值有效期，默认是1天内。
     */
    @JsonProperty("NextActivityExpire")
    private int nextActivityExpire;

    public List<String> getProductIdList() {
        return productIdList;
    }

    public void setProductIdList(List<String> productIdList) {
        this.productIdList = productIdList;
    }

    public int getNextActivityExpire() {
        return nextActivityExpire;
    }

    public void setNextActivityExpire(int nextActivityExpire) {
        this.nextActivityExpire = nextActivityExpire;
    }
}
