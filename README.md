# LuckPerms Alerts
This plugin allows for LP events to be listened to by the DiscordSRV alerts feature.

Download it [here](https://repo.anutley.me/api/maven/latest/file/snapshots/me/anutley/LuckPermsAlerts)

## Installation
This plugin can simply be dragged into your plugins folder and does not need any extra configuration

## Usage
When using LP alerts in DiscordSRV there are a few slight differences:
- Each LP event is prefixed with the letters `LP` for example if you are looking at the LuckPerms source code, `NodeAddEvent` becomes `LPNodeAddEvent`
- When trying to access event methods you must first use the `getEvent()` method to access the LP event object. For example if you wanted to get the name of the node added from `LPNodeAddEvent` you would use `${#event.getEvent().getNode().getKey()}`

## Example Alert
```yaml
- Trigger: LPNodeAddEvent
  Channel: global
  Embed:
    Color: "#00ff00"
    Description: "`${#event.getEvent().getTarget().getFriendlyName()}` has had the node `${#event.getEvent().getNode().getKey()}` set to `${#event.getEvent().getNode().getValue()}`"
```