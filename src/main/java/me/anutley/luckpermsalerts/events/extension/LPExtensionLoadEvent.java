package me.anutley.luckpermsalerts.events.extension;

import me.anutley.luckpermsalerts.events.LPEvent;
import net.luckperms.api.event.extension.ExtensionLoadEvent;

public class LPExtensionLoadEvent extends LPEvent<ExtensionLoadEvent> {

    public LPExtensionLoadEvent(ExtensionLoadEvent event) {
        super(event);
    }

    @Override
    public ExtensionLoadEvent getEvent() {
        return null;
    }
}
