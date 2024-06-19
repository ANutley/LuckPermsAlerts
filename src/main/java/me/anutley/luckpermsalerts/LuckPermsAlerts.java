package me.anutley.luckpermsalerts;

import me.anutley.luckpermsalerts.events.LPEvent;
import me.anutley.luckpermsalerts.events.context.LPContextUpdateEvent;
import me.anutley.luckpermsalerts.events.extension.LPExtensionLoadEvent;
import me.anutley.luckpermsalerts.events.group.*;
import me.anutley.luckpermsalerts.events.log.*;
import me.anutley.luckpermsalerts.events.node.LPNodeAddEvent;
import me.anutley.luckpermsalerts.events.node.LPNodeClearEvent;
import me.anutley.luckpermsalerts.events.node.LPNodeMutateEvent;
import me.anutley.luckpermsalerts.events.node.LPNodeRemoveEvent;
import me.anutley.luckpermsalerts.events.player.LPPlayerDataSaveEvent;
import me.anutley.luckpermsalerts.events.player.LPPlayerLoginProcessEvent;
import me.anutley.luckpermsalerts.events.sync.LPConfigReloadEvent;
import me.anutley.luckpermsalerts.events.sync.LPPostSyncEvent;
import me.anutley.luckpermsalerts.events.sync.LPPreNetworkSyncEvent;
import me.anutley.luckpermsalerts.events.sync.LPPreSyncEvent;
import me.anutley.luckpermsalerts.events.track.LPTrackCreateEvent;
import me.anutley.luckpermsalerts.events.track.LPTrackDeleteEvent;
import me.anutley.luckpermsalerts.events.track.LPTrackLoadAllEvent;
import me.anutley.luckpermsalerts.events.track.LPTrackLoadEvent;
import me.anutley.luckpermsalerts.events.track.mutate.LPTrackAddGroupEvent;
import me.anutley.luckpermsalerts.events.track.mutate.LPTrackClearEvent;
import me.anutley.luckpermsalerts.events.track.mutate.LPTrackMutateEvent;
import me.anutley.luckpermsalerts.events.track.mutate.LPTrackRemoveGroupEvent;
import me.anutley.luckpermsalerts.events.user.*;
import me.anutley.luckpermsalerts.events.user.track.LPUserDemoteEvent;
import me.anutley.luckpermsalerts.events.user.track.LPUserPromoteEvent;
import me.anutley.luckpermsalerts.events.user.track.LPUserTrackEvent;
import me.anutley.luckpermsalerts.listener.LPBukkitEventListener;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.event.EventBus;
import net.luckperms.api.event.context.ContextUpdateEvent;
import net.luckperms.api.event.extension.ExtensionLoadEvent;
import net.luckperms.api.event.group.*;
import net.luckperms.api.event.log.*;
import net.luckperms.api.event.node.NodeAddEvent;
import net.luckperms.api.event.node.NodeClearEvent;
import net.luckperms.api.event.node.NodeMutateEvent;
import net.luckperms.api.event.node.NodeRemoveEvent;
import net.luckperms.api.event.player.PlayerDataSaveEvent;
import net.luckperms.api.event.player.PlayerLoginProcessEvent;
import net.luckperms.api.event.sync.ConfigReloadEvent;
import net.luckperms.api.event.sync.PostSyncEvent;
import net.luckperms.api.event.sync.PreNetworkSyncEvent;
import net.luckperms.api.event.sync.PreSyncEvent;
import net.luckperms.api.event.track.TrackCreateEvent;
import net.luckperms.api.event.track.TrackDeleteEvent;
import net.luckperms.api.event.track.TrackLoadAllEvent;
import net.luckperms.api.event.track.TrackLoadEvent;
import net.luckperms.api.event.track.mutate.TrackAddGroupEvent;
import net.luckperms.api.event.track.mutate.TrackClearEvent;
import net.luckperms.api.event.track.mutate.TrackMutateEvent;
import net.luckperms.api.event.track.mutate.TrackRemoveGroupEvent;
import net.luckperms.api.event.user.*;
import net.luckperms.api.event.user.track.UserDemoteEvent;
import net.luckperms.api.event.user.track.UserPromoteEvent;
import net.luckperms.api.event.user.track.UserTrackEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class LuckPermsAlerts extends JavaPlugin {


    @Override
    public void onEnable() {



        RegisteredServiceProvider<LuckPerms> provider = Bukkit.getServicesManager().getRegistration(LuckPerms.class);

        LuckPerms luckPerms = null;

        if (provider != null) {
            luckPerms = provider.getProvider();
        }

        if (luckPerms == null) {
            getLogger().severe("LuckPerms not found!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        registerEvents(luckPerms.getEventBus());

        getLogger().info("Plugin enabled!");

    }

    private void schedule(LPEvent<?> lpEvent) {
        getServer().getScheduler().runTask(this, () -> new LPBukkitEventListener<>(lpEvent).onEvent());
    }

    private void registerEvents(EventBus eventBus) {
        // Context
        eventBus.subscribe(this, ContextUpdateEvent.class, event -> schedule(new LPContextUpdateEvent(event)));

        // Extension
        eventBus.subscribe(this, ExtensionLoadEvent.class, event -> schedule(new LPExtensionLoadEvent(event)));

        // Group
        eventBus.subscribe(this, GroupCacheLoadEvent.class, event -> schedule(new LPGroupCacheLoadEvent(event)));
        eventBus.subscribe(this, GroupCreateEvent.class, event -> schedule(new LPGroupCreateEvent(event)));
        eventBus.subscribe(this, GroupDataRecalculateEvent.class, event -> schedule(new LPGroupDataRecalculateEvent(event)));
        eventBus.subscribe(this, GroupDeleteEvent.class, event -> schedule(new LPGroupDeleteEvent(event)));
        eventBus.subscribe(this, GroupLoadAllEvent.class, event -> schedule(new LPGroupLoadAllEvent(event)));
        eventBus.subscribe(this, GroupLoadEvent.class, event -> schedule(new LPGroupLoadEvent(event)));

        // Log
        eventBus.subscribe(this, LogBroadcastEvent.class, event -> schedule(new LPLogBroadcastEvent(event)));
        eventBus.subscribe(this, LogNetworkPublishEvent.class, event -> schedule(new LPLogNetworkPublishEvent(event)));
        eventBus.subscribe(this, LogNotifyEvent.class, event -> schedule(new LPLogNotifyEvent(event)));
        eventBus.subscribe(this, LogPublishEvent.class, event -> schedule(new LPLogPublishEvent(event)));
        eventBus.subscribe(this, LogReceiveEvent.class, event -> schedule(new LPLogReceiveEvent(event)));

        // Node
        eventBus.subscribe(this, NodeAddEvent.class, event -> schedule(new LPNodeAddEvent(event)));
        eventBus.subscribe(this, NodeClearEvent.class, event -> schedule(new LPNodeClearEvent(event)));
        eventBus.subscribe(this, NodeMutateEvent.class, event -> schedule(new LPNodeMutateEvent(event)));
        eventBus.subscribe(this, NodeRemoveEvent.class, event -> schedule(new LPNodeRemoveEvent(event)));

        // Player
        eventBus.subscribe(this, PlayerDataSaveEvent.class, event -> schedule(new LPPlayerDataSaveEvent(event)));
        eventBus.subscribe(this, PlayerLoginProcessEvent.class, event -> schedule(new LPPlayerLoginProcessEvent(event)));

        // Sync
        eventBus.subscribe(this, ConfigReloadEvent.class, event -> schedule(new LPConfigReloadEvent(event)));
        eventBus.subscribe(this, PostSyncEvent.class, event -> schedule(new LPPostSyncEvent(event)));
        eventBus.subscribe(this, PreNetworkSyncEvent.class, event -> schedule(new LPPreNetworkSyncEvent(event)));
        eventBus.subscribe(this, PreSyncEvent.class, event -> schedule(new LPPreSyncEvent(event)));

        // Track
        eventBus.subscribe(this, TrackAddGroupEvent.class, event -> schedule(new LPTrackAddGroupEvent(event)));
        eventBus.subscribe(this, TrackClearEvent.class, event -> schedule(new LPTrackClearEvent(event)));
        eventBus.subscribe(this, TrackMutateEvent.class, event -> schedule(new LPTrackMutateEvent(event)));
        eventBus.subscribe(this, TrackRemoveGroupEvent.class, event -> schedule(new LPTrackRemoveGroupEvent(event)));
        eventBus.subscribe(this, TrackCreateEvent.class, event -> schedule(new LPTrackCreateEvent(event)));
        eventBus.subscribe(this, TrackDeleteEvent.class, event -> schedule(new LPTrackDeleteEvent(event)));
        eventBus.subscribe(this, TrackLoadAllEvent.class, event -> schedule(new LPTrackLoadAllEvent(event)));
        eventBus.subscribe(this, TrackLoadEvent.class, event -> schedule(new LPTrackLoadEvent(event)));

        // User
        eventBus.subscribe(this, UserDemoteEvent.class, event -> schedule(new LPUserDemoteEvent(event)));
        eventBus.subscribe(this, UserPromoteEvent.class, event -> schedule(new LPUserPromoteEvent(event)));
        eventBus.subscribe(this, UserTrackEvent.class, event -> schedule(new LPUserTrackEvent(event)));
        eventBus.subscribe(this, UserCacheLoadEvent.class, event -> schedule(new LPUserCacheLoadEvent(event)));
        eventBus.subscribe(this, UserDataRecalculateEvent.class, event -> schedule(new LPUserDataRecalculateEvent(event)));
        eventBus.subscribe(this, UserFirstLoginEvent.class, event -> schedule(new LPUserFirstLoginEvent(event)));
        eventBus.subscribe(this, UserLoadEvent.class, event -> schedule(new LPUserLoadEvent(event)));
        eventBus.subscribe(this, UserUnloadEvent.class, event -> schedule(new LPUserUnloadEvent(event)));
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled!");
    }
}