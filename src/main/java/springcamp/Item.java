package springcamp;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: jilee
 * Date: 13. 10. 12.
 * Time: 오전 3:22
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Data
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    private String text;

}
