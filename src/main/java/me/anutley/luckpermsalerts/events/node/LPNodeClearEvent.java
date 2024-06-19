package me.anutley.luckpermsalerts.events.node;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.node.NodeClearEvent;

public class LPNodeClearEvent extends LPEvent<NodeClearEvent> {

        public LPNodeClearEvent(NodeClearEvent event) {
            super(event);
        }

        @Override
        public NodeClearEvent getEvent() {
            return event;
        }
}
