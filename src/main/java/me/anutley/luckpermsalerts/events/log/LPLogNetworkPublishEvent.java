package me.anutley.luckpermsalerts.events.log;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.log.LogNetworkPublishEvent;

public class LPLogNetworkPublishEvent extends LPEvent<LogNetworkPublishEvent> {

    public LPLogNetworkPublishEvent(LogNetworkPublishEvent event) {
        super(event);
    }

    @Override
    public LogNetworkPublishEvent getEvent() {
        return event;
    }
}
