package zcb.springcloud.client.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengchaobin
 * Date: 2018/10/9
 * Description:
 **/
@RestController
public class FeignClientController {


    @Autowired
    FeignService feignService;

    @RequestMapping(value = "/addFeign", method = RequestMethod.GET)
    public Integer add(int a, int b) {
        return feignService.add(a, b);
    }

}
