package dnd.axity.com.persistence;

import dnd.axity.com.model.entity.PlayerDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDAO extends JpaRepository<PlayerDO, Long> {

}
