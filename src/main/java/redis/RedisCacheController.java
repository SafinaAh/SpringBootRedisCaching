package redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisCacheController {

    @Autowired
    Caching caching;


    @GetMapping("/redisTest")
    public  @ResponseBody ResponseEntity<CustomDTO> test() {
        return new ResponseEntity(caching.cacheData("skip"), HttpStatus.OK);
    }

}
