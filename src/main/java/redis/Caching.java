package redis;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class Caching {


    @Cacheable(value = "customDTO", key = "{#random}",cacheManager = "RedisCacheManager")
    public  CustomDTO cacheData(String random) {
        if(random.equalsIgnoreCase("skip")) {
            return CustomDTO.builder().b(false).number(123).build();
        }
        return CustomDTO.builder().b(true).number(456).build();
    }
}
