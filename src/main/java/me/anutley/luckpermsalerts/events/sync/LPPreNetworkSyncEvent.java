package me.anutley.luckpermsalerts.events.sync;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.sync.PreNetworkSyncEvent;

public class LPPreNetworkSyncEvent extends LPEvent<PreNetworkSyncEvent> {

    public LPPreNetworkSyncEvent(PreNetworkSyncEvent event) {
        super(event);
    }

    @Override
    public PreNetworkSyncEvent getEvent() {
        return event;
    }
}
