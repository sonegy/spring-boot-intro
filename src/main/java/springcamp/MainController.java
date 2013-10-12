package springcamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: jilee
 * Date: 13. 10. 12.
 * Time: 오후 4:20
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class MainController {
    private static Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ConfigProperties configProperties;
    @Autowired
    private SomethingService somethingService;

    @RequestMapping("/")
    public ModelAndView list() {
        List<Item> items = itemRepository.findAll(new Sort(Sort.Direction.DESC, "id"));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("items", items);
        map.put("config", configProperties);
        map.put("something", somethingService.print());
        return new ModelAndView("list", map);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @Transactional
    public ModelAndView write(@ModelAttribute Item item) {
        itemRepository.save(item);
        return new ModelAndView("redirect:/");
    }


}
