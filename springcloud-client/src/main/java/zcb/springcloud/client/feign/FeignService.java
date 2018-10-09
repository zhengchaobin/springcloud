package zcb.springcloud.client.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhengchaobin
 * Date: 2018/10/9
 * Description:
 **/
@FeignClient(value = "compute-service")
public interface FeignService {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b);
}
