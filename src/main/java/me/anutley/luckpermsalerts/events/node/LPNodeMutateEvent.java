package me.anutley.luckpermsalerts.events.node;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.node.NodeMutateEvent;

public class LPNodeMutateEvent extends LPEvent<NodeMutateEvent> {

    public LPNodeMutateEvent(NodeMutateEvent event) {
        super(event);
    }

    @Override
    public NodeMutateEvent getEvent() {
        return event;
    }
}
