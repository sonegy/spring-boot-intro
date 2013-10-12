package springcamp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.SpringBootServletInitializer;

/**
 * Created with IntelliJ IDEA.
 * User: jilee
 * Date: 13. 10. 12.
 * Time: 오후 5:51
 * To change this template use File | Settings | File Templates.
 */
public class WebXML  extends SpringBootServletInitializer {
    @Override
    protected void configure(SpringApplicationBuilder application) {
        application.sources(Application.class);
        super.configure(application);
    }
}
