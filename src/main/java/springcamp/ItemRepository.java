package springcamp;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * User: jilee
 * Date: 13. 10. 12.
 * Time: 오전 3:34
 * To change this template use File | Settings | File Templates.
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
}
