package me.anutley.luckpermsalerts.events.log;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.log.LogReceiveEvent;

public class LPLogReceiveEvent extends LPEvent<LogReceiveEvent> {

    public LPLogReceiveEvent(LogReceiveEvent event) {
        super(event);
    }

    @Override
    public LogReceiveEvent getEvent() {
        return event;
    }
}
