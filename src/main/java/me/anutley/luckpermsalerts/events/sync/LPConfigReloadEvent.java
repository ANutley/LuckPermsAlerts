package me.anutley.luckpermsalerts.events.sync;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.sync.ConfigReloadEvent;

public class LPConfigReloadEvent extends LPEvent<ConfigReloadEvent> {

    public LPConfigReloadEvent(ConfigReloadEvent event) {
        super(event);
    }

    @Override
        public ConfigReloadEvent getEvent() {
            return event;
        }
}
