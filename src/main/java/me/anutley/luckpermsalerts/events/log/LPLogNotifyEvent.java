package me.anutley.luckpermsalerts.events.log;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.log.LogNotifyEvent;

public class LPLogNotifyEvent extends LPEvent<LogNotifyEvent> {

    public LPLogNotifyEvent(LogNotifyEvent event) {
        super(event);
    }

    @Override
    public LogNotifyEvent getEvent() {
        return event;
    }
}
