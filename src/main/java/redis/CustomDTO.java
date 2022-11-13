package redis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@Component
@Data
@NoArgsConstructor
public class CustomDTO implements Serializable {

    Integer number;
    Boolean b;

}
