package dnd.axity.com.service;

import dnd.axity.com.commons.dto.PlayerDTO;

public interface PlayerService {

    Long createPlayer(PlayerDTO player);

    PlayerDTO getPlayer(Long id);

    void updatePlayer(PlayerDTO player, Long id);

    void deletePlayer(Long id);
}
