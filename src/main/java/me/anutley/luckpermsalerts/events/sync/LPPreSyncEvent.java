package me.anutley.luckpermsalerts.events.sync;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.sync.PreSyncEvent;

public class LPPreSyncEvent extends LPEvent<PreSyncEvent> {

    public LPPreSyncEvent(PreSyncEvent event) {
        super(event);
    }

    @Override
    public PreSyncEvent getEvent() {
        return event;
    }
}
