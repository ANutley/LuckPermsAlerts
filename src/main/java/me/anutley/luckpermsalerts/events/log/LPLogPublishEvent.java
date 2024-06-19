package me.anutley.luckpermsalerts.events.log;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.log.LogPublishEvent;

public class LPLogPublishEvent extends LPEvent<LogPublishEvent> {

    public LPLogPublishEvent(LogPublishEvent event) {
        super(event);
    }

    @Override
    public LogPublishEvent getEvent() {
        return event;
    }
}
