package springcamp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: jilee
 * Date: 13. 10. 12.
 * Time: 오후 4:26
 * To change this template use File | Settings | File Templates.
 */
@Component
@Data
@ConfigurationProperties(name = "config")
public class ConfigProperties {
    private String name;
    @NotNull
    private String text;

}
