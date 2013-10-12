package springcamp;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: jilee
 * Date: 13. 10. 12.
 * Time: 오후 4:41
 * To change this template use File | Settings | File Templates.
 */
@Component
@Profile("pro2")
public class Pro2Service implements SomethingService {
    @Override
    public String print() {
        return "pro2";
    }
}
