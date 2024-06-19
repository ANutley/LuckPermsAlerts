package me.anutley.luckpermsalerts.events.node;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.node.NodeRemoveEvent;

public class LPNodeRemoveEvent extends LPEvent<NodeRemoveEvent> {

    public LPNodeRemoveEvent(NodeRemoveEvent event) {
        super(event);
    }

    @Override
    public NodeRemoveEvent getEvent() {
        return event;
    }
}
