package com.bubbleboy.member.feign;

import com.bubbleboy.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("coupon")
public interface MemberFeignService {

    @RequestMapping("/coupon/coupon/getCoupons")
    public R getCoupons();
}
