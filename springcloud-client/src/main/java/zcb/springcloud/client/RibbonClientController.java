package zcb.springcloud.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhengchaobin
 * Date: 2018/10/9
 * Description:
 **/
@RestController
public class RibbonClientController {


    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(int a, int b) {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=" + a + "&b=" + b, String.class).getBody();
    }


}
