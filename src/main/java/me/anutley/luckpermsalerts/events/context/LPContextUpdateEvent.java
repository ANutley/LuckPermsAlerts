package me.anutley.luckpermsalerts.events.context;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.context.ContextUpdateEvent;

public class LPContextUpdateEvent extends LPEvent<ContextUpdateEvent> {

    public LPContextUpdateEvent(ContextUpdateEvent event) {
        super(event);
    }

    @Override
    public ContextUpdateEvent getEvent() {
        return event;
    }
}
