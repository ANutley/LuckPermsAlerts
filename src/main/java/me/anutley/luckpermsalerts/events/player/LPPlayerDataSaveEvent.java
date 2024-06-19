package me.anutley.luckpermsalerts.events.player;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.player.PlayerDataSaveEvent;

public class LPPlayerDataSaveEvent extends LPEvent<PlayerDataSaveEvent> {

        public LPPlayerDataSaveEvent(PlayerDataSaveEvent event) {
            super(event);
        }

        @Override
        public PlayerDataSaveEvent getEvent() {
            return event;
        }
}
