package me.anutley.luckpermsalerts.events.log;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.log.LogBroadcastEvent;

public class LPLogBroadcastEvent extends LPEvent<LogBroadcastEvent> {

    public LPLogBroadcastEvent(LogBroadcastEvent event) {
        super(event);
    }

    @Override
    public LogBroadcastEvent getEvent() {
        return event;
    }
}
