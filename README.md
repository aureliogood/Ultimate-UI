<div align="center">

# 🖥️ Ultimate UI — In-Game UI Editor
### **The Next-Generation Dynamic GUI, HUD, World Display & Cursor Editor for Minecraft**

[![BuiltByBit](https://img.shields.io/badge/BuiltByBit-105345-blue?style=for-the-badge&logo=curseforge&logoColor=white)](https://builtbybit.com/resources/ultimate-ui.105345/)
[![Java](https://img.shields.io/badge/Java-21+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Minecraft](https://img.shields.io/badge/Minecraft-1.20.x%20--%201.21.x-35A853?style=for-the-badge&logo=minecraft&logoColor=white)](https://papermc.io/)
[![Platform](https://img.shields.io/badge/Platform-Paper%20%7C%20Purpur%20%7C%20Folia-4285F4?style=for-the-badge)](https://papermc.io/)
[![Dependency](https://img.shields.io/badge/Dependency-PacketEvents%202.x-orange?style=for-the-badge)](https://github.com/retrooper/packetevents)
[![License](https://img.shields.io/badge/Status-100%25%20Clean%20%26%20Standalone-brightgreen?style=for-the-badge)](https://github.com/bb99kra/UltimateUI-Source)

<br/>

**Say goodbye to boring chest inventories!**  
Ultimate UI is the most advanced, all-in-one in-game interface creation framework for modern Minecraft servers. Build custom mouse-driven GUIs, persistent HUD overlays, interactive holographic 3D world displays, and smooth animated transitions directly inside the game.

[BuiltByBit Resource](https://builtbybit.com/resources/ultimate-ui.105345/) • [Documentation](https://xqedii.dev/docs/plugins/ultimate-ui) • [Discord Support](https://discord.gg/)

---

</div>

## 🌟 Why Ultimate UI?

Traditional Minecraft plugins force you to design menus inside static 9x6 chest container grids. **Ultimate UI breaks all limits:**

* **🖱️ Mouse & Cursor-Driven Navigation:** Players can freely move a smooth custom on-screen cursor to interact with elements, hover over hitboxes, and click custom components—just like a standalone PC game.
* **🛠️ In-Game Live Drag-and-Drop Editor:** Create, resize, drag, layer, colorize, and animate elements visually inside the server. What you see is exactly what players get.
* **🎬 Keyframe & Timeline Animation Engine:** Bring menus to life with smooth entry transitions, hover animations, easing curves, opacity fades, position glides, and zero-tick initial poses.
* **📱 Full Bedrock / Geyser Cross-Play:** Automatically generates and syncs Bedrock-compatible resource packs for seamless mobile & console cross-play.
* **🌍 Holographic 3D World Displays:** Place interactive, floating UI panels directly into the 3D game world for shops, quest boards, leaderboards, and spawn hubs.
* **⚡ High-Performance Packet Engine:** Built on top of **PacketEvents** with regional multithreading (Folia-ready) and zero tick lag.

---

## 🚀 Feature Highlights

### 🎨 1. Real-Time In-Game Editor
* Visual drag-and-drop workspace with snapping, grid guides, and zoom controls.
* Layer management (bring forward, send backward, reorder sibling targets).
* Full undo / redo history stack (up to 50 actions).
* Autosave engine with customizable interval safeguards.
* Real-time color picker with hex code palette (`#RRGGBB`).

### 🖱️ 2. Advanced Cursor & Input System
* Client-side prediction for ultra-smooth cursor response.
* Adjustable cursor sensitivity (`/uui sensitivity <0.1 - 5.0>`).
* Interactive text inputs (single-line inputs, text areas, sanitization filters).
* Multi-click handling: Left Click, Right Click, Shift Click, Middle Click, and Drag actions.

### 🖼️ 3. Rich Media & Asset Integration
* **Custom Images & Textures:** Render high-definition PNGs directly inside menus and HUDs.
* **3D Item & Entity Models:** Display rotating 3D blocks, items, and player heads with custom skins (`mc-heads.net` integration).
* **Automatic Resource Pack Pipeline:** Compiles shaders, glyph maps, font spaces, and audio sound effects on the fly.
* **Universal Plugin Compatibility:** Native integration with **ItemsAdder**, **Oraxen**, **Nexo**, **CraftEngine**, **PlaceholderAPI (PAPI)**, and **Skript**.

### 🎬 4. Timeline Animation Engine
* Keyframe-based timeline editor right inside the UI.
* Control translation (X/Y), scaling, rotation, opacity, and sound cues at specific ticks.
* Per-target delay ticks and loop controls.

### 🌍 5. World UI Displays
* Place interactive UI canvases floating anywhere in the world.
* Interactive mode, per-player visibility toggles, billboarding, and look-at controls.
* Perfect for MMO spawn hubs, interactive NPC dialogues, and server tutorials.

---

## 📋 Commands & Permissions

### Commands

| Command | Usage | Description | Default Permission |
| :--- | :--- | :--- | :--- |
| `/uui` | `/uui` | Displays plugin version and command help | `ultimateui.command.use` |
| `/uui menu` | `/uui menu` | Opens the main UltimateUI management dashboard | `ultimateui.admin` |
| `/uui open` | `/uui open <name> [hud] [autoclose] [player]` | Opens a UI or HUD for yourself or a target player | `ultimateui.command.open` |
| `/uui create` | `/uui create <name>` | Creates a brand-new UI layout | `ultimateui.command.create` |
| `/uui edit` | `/uui edit <name>` | Opens the live in-game UI editor | `ultimateui.command.edit` |
| `/uui delete` | `/uui delete <name>` | Deletes an existing UI layout | `ultimateui.command.delete` |
| `/uui close` | `/uui close [name]` | Closes the current or specified UI | `ultimateui.command.close` |
| `/uui sensitivity` | `/uui sensitivity <0.1-5>` | Customizes your personal cursor sensitivity | `ultimateui.command.sensitivity` |
| `/uui shaders` | `/uui shaders [on|off|toggle|reset] [player]` | Toggles custom UI shader rendering | `ultimateui.command.shaders` |
| `/uui cursor` | `/uui cursor [on|off|toggle|reset] [player]` | Toggles custom cursor display | `ultimateui.command.cursor` |
| `/uui world` | `/uui world [help|place|list|remove|move|rotate|...]` | Manages 3D in-world holographic UI displays | `ultimateui.command.world` |
| `/uui bedrock` | `/uui bedrock [build|pages|status]` | Compiles and checks Bedrock / Geyser resource packs | `ultimateui.admin` |
| `/uui reload` | `/uui reload` | Reloads configurations, language files, and caches | `ultimateui.command.reload` |

### Permissions

* `ultimateui.admin` — Full administrative control over all UltimateUI features and commands.
* `ultimateui.command.use` — Basic permission required to execute or tab-complete `/uui`.
* `ultimateui.command.open` — Permission to open UIs via command.
* `ultimateui.command.create` — Permission to create new UIs.
* `ultimateui.command.edit` — Permission to access the in-game editor.
* `ultimateui.command.delete` — Permission to delete UIs.
* `ultimateui.command.close` — Permission to force-close active UIs.
* `ultimateui.command.world` — Access to world UI placement and configuration.
* `ultimateui.command.reload` — Permission to reload the plugin.

---

## 🔧 Requirements & Compatibility

| Component | Requirement |
| :--- | :--- |
| **Java Version** | **Java 21** or newer |
| **Server Software** | **Paper**, **Purpur**, **Folia** (1.20.x, 1.20.5+, 1.21.x+) |
| **Required Dependency** | [PacketEvents](https://github.com/retrooper/packetevents) (v2.7.0+) |
| **Optional Integrations** | PlaceholderAPI, ItemsAdder, Oraxen, Nexo, Geyser-Spigot, Floodgate, BetterHud, Skript, Citizens, FancyNpcs |

---

## 💻 Build from Source (Maven)

This repository contains the **100% clean, buildable, standalone Java source code** with zero errors.

```bash
# 1. Clone the repository
git clone https://github.com/bb99kra/UltimateUI-Source.git
cd UltimateUI-Source

# 2. Build the project using Maven
mvn clean package -DskipTests
```

The compiled standalone artifact will be located in:
```
target/UltimateUI-1.4.2.jar
```

---

## 🤝 Support & Links

* 🛒 **BuiltByBit Resource:** [https://builtbybit.com/resources/ultimate-ui.105345/](https://builtbybit.com/resources/ultimate-ui.105345/)
* 📖 **Official Documentation:** [https://xqedii.dev/docs/plugins/ultimate-ui](https://xqedii.dev/docs/plugins/ultimate-ui)
* 💬 **Discord:** Community & Developer Support channels

---

<div align="center">
<sub>Maintained & compiled with ❤️ for high-performance Minecraft creators.</sub>
</div>
