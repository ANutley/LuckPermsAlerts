package me.anutley.luckpermsalerts.events.player;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.player.PlayerLoginProcessEvent;

public class LPPlayerLoginProcessEvent extends LPEvent<PlayerLoginProcessEvent> {

    public LPPlayerLoginProcessEvent(PlayerLoginProcessEvent event) {
        super(event);
    }

    @Override
    public PlayerLoginProcessEvent getEvent() {
        return event;
    }
}
