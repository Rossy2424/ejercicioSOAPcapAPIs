package dnd.axity.com.service.impl;

import dnd.axity.com.commons.dto.PlayerDTO;
import dnd.axity.com.model.entity.PlayerDO;
import dnd.axity.com.persistence.PlayerDAO;
import dnd.axity.com.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDAO playerDAO;

    @Override
    public Long createPlayer(PlayerDTO player) {

        PlayerDO playerDO = playerTOtoplayerDO(player);
        playerDO.setId(null);
        playerDAO.save(playerDO);
        playerDAO.flush();

        return player.getId();


    }

    @Override
    public PlayerDTO getPlayer(Long id) {
        PlayerDTO responseDTO = null;
        PlayerDO responseDO = playerDAO.findById(id).get();

        responseDTO = playerDOtoTO(responseDO);

        return responseDTO;
    }

    @Override
    public void updatePlayer(PlayerDTO player, Long id) {



    }

    @Override
    public void deletePlayer(Long id) {

    }

    private PlayerDO playerTOtoplayerDO(PlayerDTO inplayer){

        PlayerDO response = new PlayerDO();
        response.setId(inplayer.getId());
        response.setCharisma(inplayer.getCharisma());
        response.setConstitution(inplayer.getConstitution());
        response.setPlayerClass(inplayer.getPlayerClass());
        response.setDexterity(inplayer.getDexterity());
        response.setIntelligence(inplayer.getIntelligence());
        response.setHitPoints(inplayer.getHitPoints());
        response.setLevel(inplayer.getLevel());
        response.setRace(inplayer.getRace());
        response.setName(inplayer.getName());
        response.setWisdom(inplayer.getWisdom());
        response.setStrength(inplayer.getStrength());
        return response;

    }


    private PlayerDTO playerDOtoTO(PlayerDO playerDO){

        return new PlayerDTO(playerDO.getId(), playerDO.getName(), playerDO.getRace(), playerDO.getPlayerClass(), playerDO.getLevel(), playerDO.getHitPoints(), playerDO.getStrength(), playerDO.getDexterity(), playerDO.getConstitution(), playerDO.getIntelligence(), playerDO.getWisdom(), playerDO.getCharisma());
    }
}
