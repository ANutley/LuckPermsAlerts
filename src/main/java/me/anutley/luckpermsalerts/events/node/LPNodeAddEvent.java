package me.anutley.luckpermsalerts.events.node;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.node.NodeAddEvent;

public class LPNodeAddEvent extends LPEvent<NodeAddEvent> {

    public LPNodeAddEvent(NodeAddEvent event) {
        super(event);
    }

    @Override
    public NodeAddEvent getEvent() {
        return event;
    }
}
