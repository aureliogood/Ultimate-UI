package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import dev.xqedii.ultimateUI.bedrock.BedrockUiService;
import dev.xqedii.ultimateUI.service.bossbar.BossbarRenderService;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.GuiService;
import dev.xqedii.ultimateUI.service.hud.HudService;
import dev.xqedii.ultimateUI.service.input.AnvilInputService;
import dev.xqedii.ultimateUI.service.keybind.KeybindService;
import dev.xqedii.ultimateUI.service.npc.CursorNpcService;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.PacketEvents;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.PacketEventsAPI;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.factory.spigot.SpigotPacketEventsBuilder;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;
import net.kyori.adventure.title.Title.Times;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDismountEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerAnimationType;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.plugin.Plugin;

public class UltimateUI extends WorldUiCommands implements CommandExecutor, TabCompleter, Listener {
   public static final String Xqedii_3bzdq3lscjah3 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final int Xqedii_3iujlpq = 10;
   public static final long Xqedii_1fwxu9r = 600L;
   public static final List<String> Xqedii_luybuh9;

   public void onLoad() {
      if ((823927984 * (823927984 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.saveDefaultConfig();
         this.mergeConfigDefaults();
         this.Xqedii_1zavo1k = new Xqedii_2nwgjlb(this);
         this.Xqedii_1mi7xjn = this.Xqedii_1zavo1k.Xqedii_3w0o3x5();
         this.Xqedii_3g0zdbr = ((this.Xqedii_1mi7xjn == Xqedii_2b0ukbv.VALID
            ? Xqedii_144eogi.Xqedii_111ehwx07w8i(288974464, 29)
            : Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 25)) != 0);
         if (this.Xqedii_3g0zdbr) {
            try {
               PacketEventsAPI var1 = PacketEvents.getAPI();
               if (var1 == null) {
                  PacketEvents.setAPI(SpigotPacketEventsBuilder.build(this));
                  this.Xqedii_1lguiuv = (Xqedii_144eogi.Xqedii_111ehwx07w8i(825845378, 1) != 0);
               }
            } catch (Throwable var2) {
               this.getLogger()
                  .severe(
                     Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                        "BWeN/Fdq4QmhC7Ffr4/If/xkXFtqP/Ud5Gf3+m1vLK5B4HyHD0JdCPwEmQ30vLnZZBYIxxLx1f82unb5tBD/zpfvXRy1nyqiv/B3OoO0E5pqpBRMxjUBjS5J/s199Rq2GPI+vZMguIcBSftQpDHororW1JJ7gHFb6a2Mq1av"
                     )
                  );
               var2.printStackTrace();
            }
         }
      }
   }

   public void onEnable() {
      if (((910215601 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_3g0zdbr && Xqedii_3omh7nb.Xqedii_2wauvzv().Xqedii_1u155gu()) {
         this.activatePlugin();
      } else {
         String var1;
         if (this.Xqedii_1mi7xjn == Xqedii_2b0ukbv.INVALID) {
            var1 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
               "qRTyNvdYgRlFtJ40+cudL9wNgM2OIHdQTdK/M2O7ieCdR7pGHgEURPin8L3tyNEKWVWvquGwXUGRS20/qmZMz76ijGumf64kPHwE/5F/YeMuyQ=="
            );
         } else {
            var1 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
               "+s/nUYgkOEmDpuWxMoL++O6rxt25PwJ2Ji6RsPINy+MR4wnqXRckbsgkSLw7JKy7wHyCASQHnWpDnbLP6CHWZmwgbJ3IZ842yBcckCIcfQl6THVBx580T/ehyriiQ6bqbIf9cQ=="
            );
         }

         this.printStartupBanner(var1, this.computeResourcePackBannerStatus());
         if (this.getCommand(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fJgDaOFE157Hhp8pfVbLGX5IcAXp/LA5r8CWTL1vjTCPSg==")) != null) {
            this.getCommand(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fJgDaOFE157Hhp8pfVbLGX5IcAXp/LA5r8CWTL1vjTCPSg==")).setExecutor(this);
            this.getCommand(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fJgDaOFE157Hhp8pfVbLGX5IcAXp/LA5r8CWTL1vjTCPSg==")).setTabCompleter(this);
         }

         if (this.Xqedii_1mi7xjn != Xqedii_2b0ukbv.INVALID) {
            this.scheduleStartupLicenseRetry(Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 5));
         }
      }
   }

   public void scheduleStartupLicenseRetry(int var1) {
      if ((1917276324 * 1917276324 - 1917276324 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 > Xqedii_144eogi.Xqedii_111ehwx07w8i(867788416, 22)) {
         this.getLogger()
            .warning(
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "T6c/kPu9PbFdKISSCyRtre8HjCwWM+d+yLihZOQIy5Mw5lubSSn1vHr2Vo8DrGza9Wk1/Vq0KXmbRfo4aTSgmqfg3maynp7QoKbPvZrchg60+QkeaM7n3qY7frz0S28fOQZQnuiK92cyJNrQEjLun/F9+j4vkWvRg6qAIZQ2vY90OX4OxEQ5spx84X6RCjiMrNfN59LXUvugFtXxMi26Gz2hzLvZRMuRDeT9dNRJqY6uiZsxnKt+s8g1GzRTySekSknnTIxSFWvPJh7glRdol3qAPsyqepVNIvGGy579MOK/+Q=="
               )
            );
      } else {
         Xqedii_38o2zes.Xqedii_3rvp96a(
            this,
            () -> {
               if ((-1648487733 * -1648487733 + -1648487733 & 1) != 0) {
                  throw new IllegalStateException();
               } else if (this.Xqedii_2k1vujp == null && this.isEnabled()) {
                  Xqedii_2b0ukbv var2 = this.Xqedii_1zavo1k.Xqedii_3w0o3x5();
                  if (var2 == Xqedii_2b0ukbv.VALID && Xqedii_3omh7nb.Xqedii_2wauvzv().Xqedii_1u155gu()) {
                     Xqedii_38o2zes.Xqedii_34mipix(
                        this,
                        () -> {
                           if (((713647584 | 1) & 1) == 0) {
                              throw new IllegalStateException();
                           } else if (this.Xqedii_2k1vujp == null && this.isEnabled()) {
                              this.Xqedii_1mi7xjn = var2;
                              this.Xqedii_3g0zdbr = (Xqedii_144eogi.Xqedii_111ehwx07w8i(830039680, 22) != 0);
                              this.getLogger()
                                 .info(
                                    Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                       "7oTf7YsdbYOWhrlCnOvgtYZnv8AjnzjYp9mMRiZn8zYC0M0ymfx+EyyzMW17LEdMSs/xRi9jYxjMCwUT9BENoVJmcq6SDCOt57A0Av3VXnbvF5/Ape+0c2CtyJW+p0BpHnZKmJXaJhuiKTmzI9MKLpZhuhndASfQrTIk/FnjD48VlZCUMMh2I/6Jg5dV4meRUXYwOc1BhhNBpgPZ+YuqcQ=="
                                    )
                                 );
                              this.activatePlugin();
                           }
                        }
                     );
                  } else if (var2 == Xqedii_2b0ukbv.INVALID) {
                     this.Xqedii_1mi7xjn = var2;
                     this.getLogger()
                        .warning(
                           Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                              "ZQ5OXlO3y9BiBrvrAmMt02gZnr/1asJdoK4icJxOf6KKreob3fvAtYvtM8y49hGuc1o8WrXkuDObmodSXD8EHI2sJynsJR/suTN5GmAf5b5OUXRdV3BxXk8tlAwWMZ9jacn4KgKtvmVRdCGZdQV2MQNOjk7f4fYPVV8VZq0p4Kp8XzJ6r2ndJvOLNx1ZyKN6fLaMuWkyqOb5RtZIicgw14bd"
                           )
                        );
                  } else {
                     this.getLogger().warning(Xqedii_3amq7q0h5icj6(var1));
                     this.scheduleStartupLicenseRetry(var1 + Xqedii_144eogi.Xqedii_21f6ki8nog7xd(88734762, 24));
                  }
               }
            },
            Xqedii_144eogi.Xqedii_3l5k35h8lr49o(5036313496818237244L, 62)
         );
      }
   }

   public boolean activatePlugin() {
      if ((971185754 * 971185754 + 971185754 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.isPacketEventsAvailable()) {
         this.printStartupBanner(
            Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
               "+s/nUYgkOEmDpuWxMoL++O6rxt25PwJ2Ji6RsPINy+MR4wnqXRckbsgkSLw7JKy7wHyCASQHnWpDnbLP6CHWZmwgbJ3IZ842yBcckCIcfQl6THVBx580T/ehyriiQ6bqbIf9cQ=="
            ),
            this.computeResourcePackBannerStatus()
         );
         this.getServer().getPluginManager().disablePlugin(this);
         return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 26) != 0);
      } else {
         Xqedii_38o2zes.Xqedii_2rbu18a(this);
         if (!Xqedii_nd6rkr3.Xqedii_37uoku5()) {
            this.getLogger().info(Xqedii_3qaz0gljyg3p3(Bukkit.getName()));
         }

         try {
            PacketEventsAPI var1 = PacketEvents.getAPI();
            if (var1 == null) {
               PacketEvents.setAPI(SpigotPacketEventsBuilder.build(this));
               this.Xqedii_1lguiuv = (Xqedii_144eogi.Xqedii_111ehwx07w8i(825779840, 16) != 0);
               var1 = PacketEvents.getAPI();
            }

            if (var1 == null) {
               throw new IllegalStateException(
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                     "uqOv7OJjA9mMawkEIeJ+QANSO9p9ZY66gmF7x61BtCOOURcAVGs26BVvymHfP1JjCPS1LE/r7c9CdKtWfPOZvDPzOd+qlkHw36ib5Q=="
                  )
               );
            }

            if (!var1.isLoaded()) {
               var1.load();
            }

            if (!var1.isInitialized()) {
               var1.init();
            }

            this.preloadLibClasses();
            this.preloadDeepHierarchies();
            if (!this.verifyPacketEventsRuntime()) {
               this.printStartupBanner(
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("gErOcxE5BHCVs4cRiEfAenM8tfm+Otc5Ew0XaOuPm3ClOacs+0iRRJZoLXG/L5jWY2TtqPzn2J0="),
                  this.computeResourcePackBannerStatus()
               );
               this.getServer().getPluginManager().disablePlugin(this);
               return (Xqedii_144eogi.Xqedii_7syyowo92hgg(512688040, 0) != 0);
            }

            if (this.Xqedii_1tuq2ol != null) {
               this.Xqedii_1tuq2ol.unregisterShaderCursorTimeGuard();
            }

            this.Xqedii_1fwpabk = new HudService(this);
            if (this.Xqedii_1h4p7ey != null) {
               this.Xqedii_1h4p7ey.disable();
            }

            this.Xqedii_1h4p7ey = new BossbarRenderService(this);
            this.Xqedii_1fwpabk.attachBossbarRenderService(this.Xqedii_1h4p7ey);
            this.Xqedii_1a31167 = new CursorNpcService(this);
            this.Xqedii_1tuq2ol = new CameraService(this, this.Xqedii_1fwpabk, this.Xqedii_1a31167);
            this.Xqedii_2k1vujp = new GuiService(this, this.Xqedii_1fwpabk, this.Xqedii_1tuq2ol);
            if (this.Xqedii_f3ftqgq != null) {
               this.Xqedii_f3ftqgq.disable();
            }

            this.Xqedii_f3ftqgq = new KeybindService(this, this.Xqedii_2k1vujp);
            this.Xqedii_2lp9ah4 = new AnvilInputService(this);
            this.Xqedii_1yufpo0 = new BedrockUiService(this);
            this.Xqedii_1yufpo0.reload();
            this.registerSelfInteractPacketGuard();
            this.registerShaderCursorUsePacketGuard();
            this.Xqedii_1a31167.enable();
            this.Xqedii_f3ftqgq.enable();
         } catch (Throwable var4) {
            this.getLogger().severe(Xqedii_2idxgs0nwv405(String.valueOf(var4)));
            var4.printStackTrace();
            this.printStartupBanner(
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("gErOcxE5BHCVs4cRiEfAenM8tfm+Otc5Ew0XaOuPm3ClOacs+0iRRJZoLXG/L5jWY2TtqPzn2J0="),
               this.computeResourcePackBannerStatus()
            );
            this.getServer().getPluginManager().disablePlugin(this);
            return (Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 18) != 0);
         }

         this.saveDefaultLangFile();
         this.reloadLangConfigFile();
         this.ensureResourcePackFolder();
         this.Xqedii_391oru2 = new Xqedii_2cm61d8(this);
         this.Xqedii_1h4p7ey.bind(() -> {
            if (((1530484918 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_391oru2 == null ? null : this.Xqedii_391oru2.Xqedii_291hfa0().Xqedii_va02owx();
            }
         }, this.Xqedii_1fwpabk);
         this.Xqedii_1h4p7ey.enable();
         this.Xqedii_2k1vujp.ensureGuiFoldersAndExample();
         this.rebuildUiImagesIntoResourcePack();
         this.ensureGeneratedResourcePackArchive((Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 9) != 0));
         this.syncPackToXqediiSetups();
         String var5 = this.resolveResourcePackUrl();
         this.Xqedii_3b8f4mz = this.computeResourcePackDeliverySignature(var5);
         this.getServer().getPluginManager().registerEvents(this, this);
         this.registerBetterHudReloadHook();
         this.Xqedii_2lp9ah4.enable();
         if (this.getCommand(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fJgDaOFE157Hhp8pfVbLGX5IcAXp/LA5r8CWTL1vjTCPSg==")) != null) {
            this.getCommand(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fJgDaOFE157Hhp8pfVbLGX5IcAXp/LA5r8CWTL1vjTCPSg==")).setExecutor(this);
            this.getCommand(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fJgDaOFE157Hhp8pfVbLGX5IcAXp/LA5r8CWTL1vjTCPSg==")).setTabCompleter(this);
         }

         this.scheduleEditorAutosaveTask();
         this.scheduleRuntimeWatchdog();
         this.scheduleLicenseRecheck();
         this.registerSkriptIntegration();

         for (Player var3 : Bukkit.getOnlinePlayers()) {
            this.cleanupPlayerRuntime(var3);
            this.Xqedii_2k1vujp.applyStoredFixShadersOverride(var3);
            this.Xqedii_2k1vujp.applyStoredInstantCursorOverride(var3);
         }

         Xqedii_38o2zes.Xqedii_3npx6fi(this, () -> {
            if ((-1321192422 * (-1321192422 + 1) & 1) != 0) {
               throw new IllegalStateException();
            } else {
               this.refreshUiCommands();
               if (this.Xqedii_2k1vujp != null) {
                  this.Xqedii_2k1vujp.reloadWorldUis();
               }
            }
         }, Xqedii_144eogi.Xqedii_fv2tmp0vm94o(2487010146544468115L, 36));
         UltimateUIAPI.init(this);
         this.loadScripts(null);
         this.printStartupBanner(
            Xqedii_144eogi.Xqedii_1m52nqoyeel5v("gErOcxE5BHCVs4cRiEfAenM8tfm+Otc5Ew0XaOuPm3ClOacs+0iRRJZoLXG/L5jWY2TtqPzn2J0="),
            this.computeResourcePackBannerStatus()
         );
         return (Xqedii_144eogi.Xqedii_7syyowo92hgg(503271997, 9) != 0);
      }
   }

   public boolean handleUuiReloadCommand(CommandSender var1, String[] var2) {
      if ((1819548315 * (1819548315 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.hasCommandPermission(
         var1,
         Xqedii_144eogi.Xqedii_1m52nqoyeel5v("9E9RDOFy8950XhiC24IZgHQbTImW7DMya3b3rPxcXa7nrqmSKgReoFwvHs4JyOZX9Ml5V6I1Zb9RpzRz8dr0+gxgMshfgc9q6nFlZMP7"),
         Xqedii_144eogi.Xqedii_1m52nqoyeel5v("+bezolya/EohaxO+xujhSQrxnGDXFmKSF/IaGGTQMo+OQqYG5p/N5tu4PhTlX5dAxKo=")
      )) {
         return (Xqedii_144eogi.Xqedii_7syyowo92hgg(-22775237, 18) != 0);
      } else {
         String var3 = var2.length >= Xqedii_144eogi.Xqedii_7syyowo92hgg(-193462960, 3)
            ? var2[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 5)].toLowerCase(Locale.ROOT)
            : Xqedii_144eogi.Xqedii_1m52nqoyeel5v("gs68G97hCw7LYjdCWRMctX7vJ/Bh8WlVPlwZmqioUMn9gg==");
         if (var2.length > Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721812281, 11) || !Xqedii_luybuh9.contains(var3)) {
            this.sendUuiUsage(
               var1,
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("+bezolya/EohaxO+xujhSQrxnGDXFmKSF/IaGGTQMo+OQqYG5p/N5tu4PhTlX5dAxKo="),
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("s7SSf6itBPA7cZ5aaYLEfBJfEAOr0B67OTgkA8rLK2bk5mKa3yiU3B3UcCMaHDs3avTdUdC/rLkZdpvVHLZjY5Mk73nGub6HYzU=")
            );
            return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 12) != 0);
         } else if (!var3.equals(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("gs68G97hCw7LYjdCWRMctX7vJ/Bh8WlVPlwZmqioUMn9gg==")) && this.Xqedii_2k1vujp == null) {
            String var10001 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
               "8jRSsZ89HFE3jswoYZSY6RWaugz/ijKKO6uJHWtRVf3xGhs2dhwRviJTgUmjlfZIgdavWvED6sieEUtf+RuhXmWAAwF+jc4+JVmexaeSkWwXJ61Wt7XyYl8yw0Dm1pGdjeJYBHcCi/5yJLNbKF6l4RBrmhrT9A=="
            );
            Object[] var10002 = new Object[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(709878096, 27)];
            var10002[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 18)] = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
               "+bezolya/EohaxO+xujhSQrxnGDXFmKSF/IaGGTQMo+OQqYG5p/N5tu4PhTlX5dAxKo="
            );
            Xqedii_3ul4hqj.Xqedii_2dtmver(var1, var10001, var10002);
            return (Xqedii_144eogi.Xqedii_21f6ki8nog7xd(44367381, 23) != 0);
         } else {
            int var5 = Xqedii_144eogi.Xqedii_111ehwx07w8i(-825845377, 30);
            switch (var3.hashCode()) {
               case -1354792126:
                  if (var3.equals(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("kiaxIraitxXQwrdOLLqStnwC91aQKL6Ejx4ohJoLdu+VuE0mAiwbeA=="))) {
                     var5 = Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 0);
                  }
                  break;
               case 3432985:
                  if (var3.equals(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("b//FrIecnmYNQ9oQ35Hly9rnRs8o8OiE1z3NSSXPtSA9oFoV"))) {
                     var5 = Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 22);
                  }
                  break;
               case 106426308:
                  if (var3.equals(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("/gzwPEmCOsyPf9dD0d5G+Q1N8jNMbJ9ZWvPy5NrzsWXlSiGSsWo="))) {
                     var5 = Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1345474529, 19);
                  }
            }
            return switch (var5) {
               case 0 -> this.reloadConfigOnly(var1);
               case 1 -> this.reloadPackOnly(var1);
               case 2 -> this.reloadPagesOnly(var1);
               default -> this.reloadEverything(var1);
            };
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean reloadConfigOnly(CommandSender var1) {
      if ((951428822 * (951428822 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.Xqedii_3jm11h0
         .compareAndSet((Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 0) != 0), (Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-257419993, 10) != 0))) {
         Xqedii_3ul4hqj.Xqedii_2dtmver(
            var1,
            Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
               "sI5SiVLSRCB0HmYQmKDr88LhYShwQQat058JWdmyvA0AFGGjwOzswOe9o3epXyPN+OsGnKsi5N0kgz6m36AzJVWw/sEEepdkEQYmJpEFeB+CqnqJK0rm0s0pUWlQozem/p+6dg2GgE4FW7pUNRhVEpPyXH+EBg=="
            )
         );
         return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 6) != 0);
      } else {
         boolean var8 = false /* VF: Semaphore variable */;

         label96: {
            try {
               try {
                  var8 = true;
                  this.Xqedii_2k1vujp.runEditorAutosave();
               } catch (Throwable var9) {
               }

               for (Player var3 : Bukkit.getOnlinePlayers()) {
                  this.cleanupPlayerRuntimeAndRestoreLocation(var3);
               }

               this.reloadConfig();
               this.mergeConfigDefaults();
               if (this.Xqedii_1tuq2ol != null) {
                  this.Xqedii_1tuq2ol.reloadConfiguration();
               }

               if (this.Xqedii_1yufpo0 != null) {
                  this.Xqedii_1yufpo0.reload();
               }

               this.reloadLangConfigFile();
               this.scheduleEditorAutosaveTask();
               this.refreshUiCommands();
               int var12 = this.Xqedii_2k1vujp.reloadWorldUis();
               ArrayList var13 = new ArrayList();
               String var17 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "hNxXq/bdDWO5c5CBHqrYpM1FXupntULDn2PXzA9sOG2iv4sPCD5CFfNyD8Wb+Q2bcW0f9N57W0kAJyNqC33nM+yQbiqpNs8F1Ro="
               );
               Object[] var18 = new Object[Xqedii_144eogi.Xqedii_111ehwx07w8i(825828992, 14)];
               var18[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1340166178, 3)] = var12;
               var13.add(Xqedii_3ul4hqj.Xqedii_2d5sc5r(var17, var18));
               Xqedii_3ul4hqj.Xqedii_2g7xq9b(
                  var1,
                  (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 29) != 0),
                  Xqedii_3ul4hqj.Xqedii_2d5sc5r(
                     Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                        "wPXIdHIudLW5Z+auLMu59tP1MGGqkeKOeigr4joXjD4yGMndM8mImzhDmteVboKAdpU5+8jIKt9DG33cWa9w5pQi+NDn2z3/D1o7avOiSYl9RsdadVpDL3Hrb6dCde7PpvBtaQ=="
                     )
                  ),
                  var13
               );
               var8 = false;
               break label96;
            } catch (Throwable var10) {
               String var10001 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v("srlVMltcTW7u4QOovVsWXHi/rngcKM2Tue3pPPsZKjLHdV0tbeA3YHQmcbfjgBF7e44blysuS6JsjoFf82J/mQ==");
               Object[] var10002 = new Object[Xqedii_144eogi.Xqedii_7syyowo92hgg(-268791320, 12)];
               var10002[Xqedii_144eogi.Xqedii_7syyowo92hgg(-1602601986, 26)] = String.valueOf(var10.getMessage());
               Xqedii_3ul4hqj.Xqedii_2dtmver(var1, var10001, var10002);
               var8 = false;
            } finally {
               if (var8) {
                  this.Xqedii_3jm11h0.set((Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 5) != 0));
               }
            }

            this.Xqedii_3jm11h0.set((Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 23) != 0));
            return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 9) != 0);
         }

         this.Xqedii_3jm11h0.set((Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1344425953, 19) != 0));
         return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 9) != 0);
      }
   }

   public boolean reloadPackOnly(CommandSender var1) {
      if ((983023867 * 983023867 + 983023867 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.Xqedii_3jm11h0
         .compareAndSet((Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 0) != 0), (Xqedii_144eogi.Xqedii_7syyowo92hgg(-364403777, 22) != 0))) {
         Xqedii_3ul4hqj.Xqedii_2dtmver(
            var1,
            Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
               "sI5SiVLSRCB0HmYQmKDr88LhYShwQQat058JWdmyvA0AFGGjwOzswOe9o3epXyPN+OsGnKsi5N0kgz6m36AzJVWw/sEEepdkEQYmJpEFeB+CqnqJK0rm0s0pUWlQozem/p+6dg2GgE4FW7pUNRhVEpPyXH+EBg=="
            )
         );
         return (Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1409979384, 17) != 0);
      } else {
         Xqedii_3ul4hqj.Xqedii_3m0zjou(
            var1,
            Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
               "ZBuSqYxTfyQpepc0YBRbhXqhDwGmr46zEuMqmPOoP7lpJWIZ87r6RzJut0Hv/7ymfSNBU4XM+8esEtAJou7H9d+dACOjRInm/9biWwfZpP7pyslAhhBbMdY6"
            )
         );
         Xqedii_38o2zes.Xqedii_u043a3q(
            this,
            () -> {
               if ((-1631060298 ^ -1631060298) != 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var8 = false /* VF: Semaphore variable */;

                  label75: {
                     try {
                        var8 = true;
                        if (this.Xqedii_391oru2 != null) {
                           try {
                              this.Xqedii_391oru2.Xqedii_3d0prc5();
                           } catch (Throwable var10) {
                           }
                        }

                        this.ensureResourcePackFolder();

                        try {
                           this.Xqedii_2k1vujp.ensureGuiFoldersAndExample();
                        } catch (Throwable var9) {
                        }

                        this.rebuildUiImagesIntoResourcePack();
                        this.ensureGeneratedResourcePackArchive((Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 4) != 0));
                        this.syncPackToXqediiSetups();
                        Xqedii_1pwigla var2 = this.deployPackToExternalPlugin();
                        Xqedii_38o2zes.Xqedii_34mipix(
                           this,
                           () -> {
                              if ((1480552517 * (1480552517 + 1) & 1) != 0) {
                                 throw new IllegalStateException();
                              } else {
                                 int var3 = this.Xqedii_11hx7yt == null ? Xqedii_144eogi.Xqedii_7syyowo92hgg(-1602601986, 26) : this.Xqedii_11hx7yt.size();
                                 ArrayList var4 = new ArrayList();
                                 String var10001 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                    "C4PfV3YoT+PRjccFDPHuu+MHi+ZEvC+7fGTqv5A0VjYmVcFtMUJUofMQQcCzPZspx4ULcV68ACM89K79P7xB6eVlZ2G6NTiso2J/Y7iGfnNdvXWtfeSbC7ZZF0GlK3U/LyC2AwO2ExkBww=="
                                 );
                                 Object[] var10002 = new Object[Xqedii_144eogi.Xqedii_111ehwx07w8i(892954240, 26)];
                                 var10002[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1409848312, 17)] = var3;
                                 var4.add(Xqedii_3ul4hqj.Xqedii_2d5sc5r(var10001, var10002));
                                 this.finishExternalPackDeploy(var4, var2);
                                 String var5 = this.resolveResourcePackUrl();
                                 this.Xqedii_3b8f4mz = this.computeResourcePackDeliverySignature(var5);
                                 this.resendResourcePackToOnlinePlayers(var5);
                                 var10001 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                    "SN4aiCf60+Uwe55GJuY4Pqv9SuZO6pF8BtUlgIp+i6RxZSvXUyFfQzhsPpKi7OZ8DVohgdrVBbxM8Y3I45vgucLh2cZD7lUh51cL6PX3Hjg="
                                 );
                                 var10002 = new Object[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(176247423, 14)];
                                 var10002[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 19)] = Bukkit.getOnlinePlayers().size();
                                 var4.add(Xqedii_3ul4hqj.Xqedii_2d5sc5r(var10001, var10002));
                                 Xqedii_3ul4hqj.Xqedii_2g7xq9b(
                                    var1,
                                    (Xqedii_144eogi.Xqedii_7syyowo92hgg(-773851869, 5) != 0),
                                    Xqedii_3ul4hqj.Xqedii_2d5sc5r(
                                       Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                          "wkE5QuYsEQp1ZwOqEy247JRfZRrwcUybbmT5hftMtnazAYBwTkx5f2U5jvQ5jfFb7HzFoymWuCcW0+5xtrTjN4u1gxy98RPc11JC5S7j4RMvGObtznvG5Qo2L5iUM1e2qgw="
                                       )
                                    ),
                                    var4
                                 );
                              }
                           }
                        );
                        var8 = false;
                        break label75;
                     } catch (Throwable var11) {
                        Xqedii_38o2zes.Xqedii_34mipix(
                           this,
                           () -> {
                              if ((-1945377292 * -1945377292 + -1945377292 & 1) != 0) {
                                 throw new IllegalStateException();
                              } else {
                                 String var10001 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                    "srlVMltcTW7u4QOovVsWXHi/rngcKM2Tue3pPPsZKjLHdV0tbeA3YHQmcbfjgBF7e44blysuS6JsjoFf82J/mQ=="
                                 );
                                 Object[] var10002 = new Object[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 5)];
                                 var10002[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 4)] = String.valueOf(var11.getMessage());
                                 Xqedii_3ul4hqj.Xqedii_2dtmver(var1, var10001, var10002);
                              }
                           }
                        );
                        var8 = false;
                     } finally {
                        if (var8) {
                           this.Xqedii_3jm11h0.set((Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 18) != 0));
                        }
                     }

                     this.Xqedii_3jm11h0.set((Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 10) != 0));
                     return;
                  }

                  this.Xqedii_3jm11h0.set((Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 2) != 0));
               }
            }
         );
         return (Xqedii_144eogi.Xqedii_111ehwx07w8i(825844352, 10) != 0);
      }
   }

   public boolean reloadPagesOnly(CommandSender var1) {
      if ((1269209320 * 1269209320 + 1269209320 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1zgvf22 var2 = this.loadScripts(null);
         this.refreshUiCommands();
         if (var2 == null) {
            Xqedii_3ul4hqj.Xqedii_2dtmver(
               var1,
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "IQyrHr/gmUl4gA3e6ozExMopFmjM6toyGdkRsZ6K8GtHojITEgcyEf+f81TD2hpG3UGJduCnIRqkbzak0qGfaouBUV0CfLEwfg45RbQkIN7ksN1ikcH0A8ebec4pjiCQrS1jZBdXvwVx3AUbTt392vSTJf1VZu1IZlGZ/QSU"
               )
            );
            return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 26) != 0);
         } else {
            ArrayList var3 = new ArrayList();
            String var10001 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
               "J3I/bBgiE7mI/qSBVMXnaxNSmSiw0f73/niHkspjy1Pwtd9FKvF90/48TfvT/+rGHKPdcJC+rjXJenF6loov9s03a3tjTA=="
            );
            Object[] var10002 = new Object[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 19)];
            var10002[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-1475270672, 18)] = var2.scripts();
            var3.add(Xqedii_3ul4hqj.Xqedii_2d5sc5r(var10001, var10002));
            var10001 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v("rrY2q2bu/WGVHZXKsYvgVVmal8G2MEemqXsY8c8pI+c5ZQUK0gVAQFdbu7PUfTqChAJLu3t31GgUjOeomrNPlA==");
            var10002 = new Object[Xqedii_144eogi.Xqedii_7syyowo92hgg(-728807553, 23)];
            var10002[Xqedii_144eogi.Xqedii_7syyowo92hgg(64086005, 29)] = var2.handlers();
            var3.add(Xqedii_3ul4hqj.Xqedii_2d5sc5r(var10001, var10002));
            Xqedii_3ul4hqj.Xqedii_2g7xq9b(
               var1,
               var2.errors().isEmpty(),
               Xqedii_3ul4hqj.Xqedii_2d5sc5r(
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                     "RSEmuVRsZ02dg7fxsf1p5X/QsMPpFfbX3gfKhaPNp++E8PrskplIPuAJaDdT02QUN/V6PD2mzyF2VnsiJZGr/xbOrRhv7wo1KmpAXgbnVNvE4904l6E="
                  )
               ),
               var3
            );
            this.Xqedii_2nbb2r8.Xqedii_1wahnsk(var1, var2);
            return (Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-32177500, 7) != 0);
         }
      }
   }

   public boolean reloadEverything(CommandSender var1) {
      if (((1293844890 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!this.Xqedii_3jm11h0
         .compareAndSet((Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 7) != 0), (Xqedii_144eogi.Xqedii_111ehwx07w8i(859399808, 25) != 0))) {
         Xqedii_3ul4hqj.Xqedii_2dtmver(
            var1,
            Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
               "sI5SiVLSRCB0HmYQmKDr88LhYShwQQat058JWdmyvA0AFGGjwOzswOe9o3epXyPN+OsGnKsi5N0kgz6m36AzJVWw/sEEepdkEQYmJpEFeB+CqnqJK0rm0s0pUWlQozem/p+6dg2GgE4FW7pUNRhVEpPyXH+EBg=="
            )
         );
         return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 14) != 0);
      } else {
         Xqedii_3ul4hqj.Xqedii_3m0zjou(
            var1,
            Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
               "KskjR6XcJEcWrtRZJ+bI/7aJN3EzePZLgwhnuUuswF8DpNoBw5dIPKTrN38pTOUrq8DT2RKlbsROuEkj0lHH0EmL8BCmVnoj2BybuoSDx7jZ8yIatRr9FQ=="
            )
         );
         if (this.Xqedii_2k1vujp != null) {
            try {
               this.Xqedii_2k1vujp.runEditorAutosave();
            } catch (Throwable var4) {
            }
         }

         for (Player var3 : Bukkit.getOnlinePlayers()) {
            this.cleanupPlayerRuntimeAndRestoreLocation(var3);
         }

         this.reloadConfig();
         this.mergeConfigDefaults();
         if (this.Xqedii_1tuq2ol != null) {
            this.Xqedii_1tuq2ol.reloadConfiguration();
         }

         if (this.Xqedii_1yufpo0 != null) {
            this.Xqedii_1yufpo0.reload();
         }

         this.reloadLangConfigFile();
         Xqedii_38o2zes.Xqedii_u043a3q(
            this,
            () -> {
               if ((-1541548472 * -1541548472 + -1541548472 & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var9 = false /* VF: Semaphore variable */;

                  label100: {
                     label101: {
                        try {
                           var9 = true;
                           Xqedii_2b0ukbv var2 = this.Xqedii_1zavo1k.Xqedii_3w0o3x5();
                           if (var2 != Xqedii_2b0ukbv.VALID) {
                              String var14 = var2 == Xqedii_2b0ukbv.INVALID
                                 ? Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                    "ihfelHXMCGzYmt46C2iP9OWE7nsoRxQhaJlP5sJbXxkb+OC83Y0cd3tmLLb6aoAa0f/vrfke8OpusHR4fdP3J178bUWmUA=="
                                 )
                                 : Xqedii_144eogi.Xqedii_1m52nqoyeel5v("U42KT5T6Mkl4mtk1VoMPj4vkxc35Ll3295Z2nuctDPXaw8625e3m2UvP8F9WZd2iXywBMi9VDTbLa7sD");
                              Xqedii_38o2zes.Xqedii_34mipix(
                                 this,
                                 () -> {
                                    if ((-1628595305 * -1628595305 - -1628595305 & 1) != 0) {
                                       throw new IllegalStateException();
                                    } else {
                                       String var10001 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                          "pIREhtGWv7heXFd/iPy5YU+F3xm65n4gEtP4FBtj1JGa89n7iHTYJ+HJaBPOoGFQ2fKzeaa4gT2uAcbNviCRfw=="
                                       );
                                       Object[] var10002 = new Object[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 27)];
                                       var10002[Xqedii_144eogi.Xqedii_7syyowo92hgg(-184299041, 21)] = var14;
                                       Xqedii_3ul4hqj.Xqedii_2dtmver(var1, var10001, var10002);
                                    }
                                 }
                              );
                              var9 = false;
                              break label100;
                           }

                           Xqedii_38o2zes.Xqedii_34mipix(this, () -> {
                              if ((-376384056 * -376384056 - -376384056 & 1) != 0) {
                                 throw new IllegalStateException();
                              } else {
                                 if (this.Xqedii_2k1vujp == null) {
                                    this.Xqedii_1mi7xjn = Xqedii_2b0ukbv.VALID;
                                    this.Xqedii_3g0zdbr = (Xqedii_144eogi.Xqedii_111ehwx07w8i(809068160, 24) != 0);
                                    if (this.Xqedii_2lp9ah4 != null) {
                                       this.Xqedii_2lp9ah4.disable();
                                    }

                                    this.activatePlugin();
                                 }
                              }
                           });
                           if (this.Xqedii_391oru2 != null) {
                              try {
                                 this.Xqedii_391oru2.Xqedii_3d0prc5();
                              } catch (Throwable var11) {
                              }
                           }

                           this.ensureResourcePackFolder();
                           if (this.Xqedii_2k1vujp != null) {
                              try {
                                 this.Xqedii_2k1vujp.ensureGuiFoldersAndExample();
                              } catch (Throwable var10) {
                              }
                           }

                           this.rebuildUiImagesIntoResourcePack();
                           this.ensureGeneratedResourcePackArchive((Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 24) != 0));
                           this.syncPackToXqediiSetups();
                           Xqedii_1pwigla var3x = this.deployPackToExternalPlugin();
                           Xqedii_38o2zes.Xqedii_34mipix(
                              this,
                              () -> {
                                 if ((-556127021 * -556127021 - -556127021 & 1) != 0) {
                                    throw new IllegalStateException();
                                 } else {
                                    int var3xx = this.Xqedii_11hx7yt == null ? Xqedii_144eogi.Xqedii_7syyowo92hgg(1089763325, 27) : this.Xqedii_11hx7yt.size();
                                    ArrayList var4x = new ArrayList();
                                    String var10001 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                       "C4PfV3YoT+PRjccFDPHuu+MHi+ZEvC+7fGTqv5A0VjYmVcFtMUJUofMQQcCzPZspx4ULcV68ACM89K79P7xB6eVlZ2G6NTiso2J/Y7iGfnNdvXWtfeSbC7ZZF0GlK3U/LyC2AwO2ExkBww=="
                                    );
                                    Object[] var10002 = new Object[Xqedii_144eogi.Xqedii_111ehwx07w8i(826107520, 18)];
                                    var10002[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 6)] = var3xx;
                                    var4x.add(Xqedii_3ul4hqj.Xqedii_2d5sc5r(var10001, var10002));
                                    this.finishExternalPackDeploy(var4x, var3x);
                                    String var5 = this.resolveResourcePackUrl();
                                    this.Xqedii_3b8f4mz = this.computeResourcePackDeliverySignature(var5);
                                    this.resendResourcePackToOnlinePlayers(var5);
                                    this.scheduleEditorAutosaveTask();
                                    this.refreshUiCommands();
                                    if (this.Xqedii_2k1vujp != null) {
                                       int var6 = this.Xqedii_2k1vujp.reloadWorldUis();
                                       var10001 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                          "hNxXq/bdDWO5c5CBHqrYpM1FXupntULDn2PXzA9sOG2iv4sPCD5CFfNyD8Wb+Q2bcW0f9N57W0kAJyNqC33nM+yQbiqpNs8F1Ro="
                                       );
                                       var10002 = new Object[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 21)];
                                       var10002[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-1475270672, 18)] = var6;
                                       var4x.add(Xqedii_3ul4hqj.Xqedii_2d5sc5r(var10001, var10002));
                                    }

                                    Xqedii_1zgvf22 var7 = this.loadScripts(null);
                                    if (var7 != null) {
                                       var10001 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                          "J3I/bBgiE7mI/qSBVMXnaxNSmSiw0f73/niHkspjy1Pwtd9FKvF90/48TfvT/+rGHKPdcJC+rjXJenF6loov9s03a3tjTA=="
                                       );
                                       var10002 = new Object[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1084833669, 21)];
                                       var10002[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 7)] = var7.scripts();
                                       var4x.add(Xqedii_3ul4hqj.Xqedii_2d5sc5r(var10001, var10002));
                                    }

                                    var4x.add(
                                       Xqedii_3ul4hqj.Xqedii_2d5sc5r(
                                          Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                             "B7p4wnJh10IGKR9jVwWMr6E1CbfeaoApaVxejAcubt+8xC36GyNC7/pzSW8sJ/OY4B6vZ6kIriAjKoxW"
                                          )
                                       )
                                    );
                                    Xqedii_3ul4hqj.Xqedii_2g7xq9b(
                                       var1,
                                       (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 19) != 0),
                                       Xqedii_3ul4hqj.Xqedii_2d5sc5r(
                                          Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                             "wPXIdHIudLW5Z+auLMu59tP1MGGqkeKOeigr4joXjD4yGMndM8mImzhDmteVboKAdpU5+8jIKt9DG33cWa9w5pQi+NDn2z3/D1o7avOiSYl9RsdadVpDL3Hrb6dCde7PpvBtaQ=="
                                          )
                                       ),
                                       var4x
                                    );
                                    if (var7 != null) {
                                       this.Xqedii_2nbb2r8.Xqedii_1wahnsk(var1, var7);
                                    }
                                 }
                              }
                           );
                           var9 = false;
                           break label101;
                        } catch (Throwable var12) {
                           Xqedii_38o2zes.Xqedii_34mipix(
                              this,
                              () -> {
                                 if (((-729545673 | 1) & 1) == 0) {
                                    throw new IllegalStateException();
                                 } else {
                                    String var10001 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                       "srlVMltcTW7u4QOovVsWXHi/rngcKM2Tue3pPPsZKjLHdV0tbeA3YHQmcbfjgBF7e44blysuS6JsjoFf82J/mQ=="
                                    );
                                    Object[] var10002 = new Object[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 11)];
                                    var10002[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(310315649, 30)] = String.valueOf(var12.getMessage());
                                    Xqedii_3ul4hqj.Xqedii_2dtmver(var1, var10001, var10002);
                                 }
                              }
                           );
                           var9 = false;
                        } finally {
                           if (var9) {
                              this.Xqedii_3jm11h0.set((Xqedii_144eogi.Xqedii_21f6ki8nog7xd(620631298, 31) != 0));
                           }
                        }

                        this.Xqedii_3jm11h0.set((Xqedii_144eogi.Xqedii_21f6ki8nog7xd(176231039, 14) != 0));
                        return;
                     }

                     this.Xqedii_3jm11h0.set((Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 20) != 0));
                     return;
                  }

                  this.Xqedii_3jm11h0.set((Xqedii_144eogi.Xqedii_21f6ki8nog7xd(143915092, 25) != 0));
               }
            }
         );
         return (Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1084833669, 21) != 0);
      }
   }

   public void finishExternalPackDeploy(List<String> var1, Xqedii_1pwigla var2) {
      if (((-1919936816 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null) {
         String var3 = var2.target().Xqedii_lho1nuv();

         for (String var5 : var2.changedSettings()) {
            String var10001 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
               "NZj4FvxK+1tR7O4e2synsVRtxPdTmcWEG2uo/Wm4DxUxP/c7+j64zEo60gnwsp4Y2u1bYLIopOBe6TMpiIxyrPawem/XGmd0dlOyaPPqOL5KOdP3zgQwMnETzatEraM0C/M7g4OlDfplUopdiGVZgdAX9lYJxvkEYaKIbIheyMrOMfRHf9n+QpKrwZj30w=="
            );
            Object[] var10002 = new Object[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 10)];
            var10002[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 23)] = var5;
            var1.add(Xqedii_3ul4hqj.Xqedii_39ytrlf(var10001, var10002));
         }

         String var9 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
            "B3PBdLUR0/wVWJv85e4CwKxCJbwpmsMC7iv+Dtvp/f96l5bXFoOapRmyQxcv93V36zQzXW5JIiB1AZG/awaR3QMFDJt/eCqVASxR3pTX2vrbz3lzieQ="
         );
         Object[] var11 = new Object[Xqedii_144eogi.Xqedii_7syyowo92hgg(-1457615105, 24)];
         var11[Xqedii_144eogi.Xqedii_7syyowo92hgg(-1602601986, 26)] = var3;
         var1.add(Xqedii_3ul4hqj.Xqedii_2d5sc5r(var9, var11));
         if (!this.getServer().getPluginManager().isPluginEnabled(var3)) {
            var9 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
               "nByMYbs6oCcYwNXkkU8sfdMnoiNsYMLn07BDpTAQKZ3uQhp2pXrQgbR0NCIcruBtAOZsGRpHgXb3DaA60+DkjwPDzui9OAyhW81OVJOoDV5ieOztaTBhmUjF23txuwamr8iac3SqCxWDbDHw/uZfMmP1PQqXj94IEZZUl+/k+kC2Bg=="
            );
            var11 = new Object[Xqedii_144eogi.Xqedii_111ehwx07w8i(288974464, 29)];
            var11[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 31)] = var3;
            var1.add(Xqedii_3ul4hqj.Xqedii_39ytrlf(var9, var11));
         } else {
            long var8 = Xqedii_144eogi.Xqedii_108da41rrda18(-1149081216931236154L, 12);

            for (String var7 : var2.reloadCommands()) {
               Xqedii_38o2zes.Xqedii_3npx6fi(this, () -> {
                  if (((-224722199 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else {
                     this.getServer().dispatchCommand(this.getServer().getConsoleSender(), var7);
                  }
               }, var8);
               var8 += Xqedii_144eogi.Xqedii_fv2tmp0vm94o(-4430518812377137006L, 59);
            }
         }
      }
   }

   public void registerBetterHudReloadHook() {
      if (((-738829039 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Plugin var1 = this.getServer()
            .getPluginManager()
            .getPlugin(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("p9bDDhcqc6MSQo1jmS3kmjMRBYcxsb45AuOhIEimR7ggchn859aRFFVFERWTdg=="));
         if (var1 != null) {
            Class var2;
            try {
               var2 = Class.forName(
                     Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                        "U0Wvbom4bpVIaAPAoLQ3WAB4ar0eEbNkU+hUPorlqhZQIb5Z+N4h+8fwzSCtb+F8y6kuNNmzsLrD+XSU2doZ981TnlJj5i4VQHErLpW890eicfcF/mXoUH3On0SwwF/4ZmHdfQ5EvxCLo1CgYQABVkd0wFJsRlvkorGedJMUI+oy6cqe"
                     ),
                     (Xqedii_144eogi.Xqedii_111ehwx07w8i(826107520, 18) != 0),
                     var1.getClass().getClassLoader()
                  )
                  .asSubclass(Event.class);
            } catch (Throwable var4) {
               this.getLogger()
                  .warning(
                     Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                        "ycsVImf23ok6W9gz4IzFaddA8R7kOULjDZr8XgoePSpAfN49EaJ0ZqrtXmdBdS1QtGVPK0bDVpxW14CvESRZaMwNBodskp2EdNgIyxdBsUvhwd5RdTByIwpfB2TKOnN/SQYHR+LnsCeb9EKqinf/qjg+gaPIdVuVovSkGCbok5hQP3TuBkz9ycBmKaF3uTJbFuJQd4O9meWUtZ03ZTj4pnhMIoCx4CUEh/IJyuzBEbetqU44NDS0qRujxReXfL+dzz4z4xnSuuegVGfVblNnqC43XelmZC8utG/1/Q6yYQpC/q6oeWSte0BNk3k5K9Dyv/UVboCahUJizhckunRi8Asd"
                     )
                  );
               return;
            }

            this.getServer().getPluginManager().registerEvent(var2, new Listener() {
               public static final String Xqedii_15qs0w3oxcjej = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
            }, EventPriority.MONITOR, (var2x, var3) -> {
               if ((32337484 * (32337484 + 1) & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  if (var2.isInstance(var3)) {
                     this.Xqedii_3to0a23(var3);
                  }
               }
            }, this);
         }
      }
   }

   public void Xqedii_3to0a23(Object var1) {
      if ((-1352844347 * -1352844347 + -1352844347 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2cm61d8 var2 = this.Xqedii_391oru2;
         if (var2 != null
            && this.getConfig()
               .getBoolean(
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                     "VCSh7gboE8mqpRLDdzG4yvNPFQ+t48easSPfZTgOXCxfPz1ivhYsbSlOU76hkhgrQD10icFdaTsOoIX0CoHD8KfCRpYlydvh1S3KwVd2E8lHBrRqJU1k4w=="
                  ),
                  (Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1340166178, 3) != 0)
               )) {
            Map var3 = Xqedii_3s68w2g.Xqedii_yudau0p(var1);
            Xqedii_38o2zes.Xqedii_u043a3q(this, () -> {
               if ((-860696443 * (-860696443 + 1) & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  this.Xqedii_3gjv9vm(var2, var3);
               }
            });
         }
      }
   }

   public void Xqedii_3gjv9vm(Xqedii_2cm61d8 var1, Map<String, byte[]> var2) {
      if (((-249632030 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         try {
            boolean var3 = var1.Xqedii_11np8af();
            String var4 = this.Xqedii_7h12qe4();
            boolean var5 = var1.Xqedii_2i2n99y(this.ensureResourcePackFolder(), var2);
            this.ensureGeneratedResourcePackArchive(
               ((!var5 ? Xqedii_144eogi.Xqedii_7syyowo92hgg(-5693810, 16) : Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 28)) != 0)
            );
            int var6 = !var4.equals(this.Xqedii_7h12qe4())
               ? Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-128709997, 9)
               : Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-1992325824, 29);
            if (var6 == 0 && !var3) {
               return;
            }

            Xqedii_1pwigla var7 = var6 != 0 ? this.deployPackToExternalPlugin() : null;
            Xqedii_38o2zes.Xqedii_34mipix(
               this,
               () -> {
                  if ((-1264724261 * -1264724261 - -1264724261 & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     ArrayList var2x = new ArrayList();
                     this.finishExternalPackDeploy(var2x, var7);
                     if (!var2x.isEmpty()) {
                        Xqedii_3ul4hqj.Xqedii_2g7xq9b(
                           this.getServer().getConsoleSender(),
                           (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 0) != 0),
                           Xqedii_3ul4hqj.Xqedii_2d5sc5r(
                              Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                 "T8C3pLj/5rS7zlipnE5rtrVvbdDodKe/hWmd8DTX8SYDKC4OV7/ieliKFk2S9BWJwT9ny4hojMYmHFjvynxXh3GGaAD4cvUYObD3Hk9EzHm3ltTILDjh4CtKV2IWtJxw1q28wJlgrPKg4cDhLtgx1JbZE8U="
                              )
                           ),
                           var2x
                        );
                     }

                     String var3x = this.resolveResourcePackUrl();
                     this.Xqedii_3b8f4mz = this.computeResourcePackDeliverySignature(var3x);
                     this.resendResourcePackToOnlinePlayers(var3x);
                     this.getLogger()
                        .info(
                           Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                              "CDUT+Wq/8Tbt+xKJwX2A1TiB5WgI7e9SVETvH/2cEoozMO8rEf9npMz1RK3T4iYR1JvX7BjizeRlqfFtvT+0oinpSefqOqBzszEhhXFryeleoBkRu2L3Kp7uAbn4dl7+ZkSeheY+rxKbQRIlIScNq9w5oIULpFW6V/ioVNQfcd7L/qwZMT40L3zxIHoU+/r812Qtme4euIy42n5Ki5yQdTbIR8iOv0+jOu1xRZWxIb+NJ9FaK9D81K8gTY0rhkXUDnF3Zjh6YIjnivRdb+DJzA=="
                           )
                        );
                  }
               }
            );
         } catch (Throwable var8) {
            this.getLogger().warning(Xqedii_1vkyerbk1rqvc(var8.getMessage()));
         }
      }
   }

   public String Xqedii_7h12qe4() {
      if ((1839338064 * 1839338064 + 1839338064 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File var1 = this.resolveGeneratedPackArchiveFile();
         return var1 != null && var1.isFile()
            ? Xqedii_c3hg0t2xpkxt(var1.lastModified(), var1.length())
            : Xqedii_144eogi.Xqedii_1m52nqoyeel5v("qR6XFdW2vaZZD7y2+VPz5jmcO5+L/3sTTM/P2A==");
      }
   }

   public void registerSkriptIntegration() {
      if (((-1222546751 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (Bukkit.getPluginManager().getPlugin(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("s0ExYM8pCoEhh29rZVJFWkgm8RuX+BNKsaB03MoL8vd45+DkCVZJdg==")) != null) {
         try {
            Xqedii_1uy3j6u.Xqedii_2s3fucr(this);
         } catch (Throwable var2) {
            this.getLogger().warning(Xqedii_3tvu4ro8z2mdg(String.valueOf(var2)));
         }
      }
   }

   public Xqedii_1zgvf22 loadScripts(CommandSender var1) {
      if (((1039862421 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         if (this.Xqedii_2nbb2r8 == null) {
            this.Xqedii_2nbb2r8 = new Xqedii_2b3rrt2(this);
         }

         Xqedii_1zgvf22 var2;
         try {
            var2 = this.Xqedii_2nbb2r8.Xqedii_7murfs0();
         } catch (Throwable var4) {
            this.getLogger().warning(Xqedii_2qq9jl4jy5l69(String.valueOf(var4)));
            return null;
         }

         this.Xqedii_2nbb2r8.Xqedii_woa4jl4(var2);
         if (var1 != null) {
            this.Xqedii_2nbb2r8.Xqedii_1wahnsk(var1, var2);
         }

         return var2;
      }
   }

   public void onDisable() {
      if ((1309629918 * 1309629918 - 1309629918 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (this.Xqedii_2nbb2r8 != null) {
            try {
               this.Xqedii_2nbb2r8.Xqedii_oe61gxm();
            } catch (Throwable var6) {
            }
         }

         UltimateUIAPI.shutdown();

         try {
            this.unregisterAllUiCommands();
         } catch (Throwable var5) {
         }

         if (this.Xqedii_2k1vujp != null) {
            try {
               this.Xqedii_2k1vujp.shutdownWorldUis();
            } catch (Throwable var4) {
            }
         }

         if (this.Xqedii_1tuq2ol != null || this.Xqedii_2k1vujp != null || this.Xqedii_1fwpabk != null) {
            for (Player var2 : Bukkit.getOnlinePlayers()) {
               this.cleanupPlayerRuntimeAndRestoreLocation(var2);
            }
         }

         if (this.Xqedii_391oru2 != null) {
            this.Xqedii_391oru2.Xqedii_3d0prc5();
         }

         this.cancelEditorAutosaveTask();
         this.unregisterSelfInteractPacketGuard();
         this.unregisterShaderCursorUsePacketGuard();
         if (this.Xqedii_1a31167 != null) {
            this.Xqedii_1a31167.disable();
         }

         if (this.Xqedii_f3ftqgq != null) {
            this.Xqedii_f3ftqgq.disable();
         }

         if (this.Xqedii_2lp9ah4 != null) {
            this.Xqedii_2lp9ah4.disable();
         }

         if (this.Xqedii_1fwpabk != null) {
            this.Xqedii_1fwpabk.unregisterVirtualHudPassengerGuard();
         }

         if (this.Xqedii_1tuq2ol != null) {
            this.Xqedii_1tuq2ol.unregisterShaderCursorTimeGuard();
         }

         Xqedii_38o2zes.Xqedii_30bki1a();
         PacketEventsAPI var7 = PacketEvents.getAPI();
         if (var7 != null) {
            if (this.Xqedii_1lguiuv) {
               try {
                  if (!var7.isTerminated()) {
                     var7.terminate();
                  }
               } catch (Throwable var3) {
                  this.getLogger().warning(Xqedii_2vpb0tk3l0yks(var3.getMessage()));
               }
            }
         }
      }
   }

   @EventHandler
   public void onDismount(EntityDismountEvent var1) {
      if (((1039857881 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Entity var2 = var1.getEntity();
         if (var2.hasMetadata(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("2fyI2/L2uBb5jmb/Pc4c6z3HFVJn2VT848pIvSR7hTq0BQ=="))) {
            if (!var2.isDead() && var2.isValid()) {
               var1.setCancelled((Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 10) != 0));
            }
         } else {
            if (var2 instanceof Player var3 && this.Xqedii_1tuq2ol.isCameraActive(var3) && !this.Xqedii_2t79mgx.contains(var3.getUniqueId())) {
               var1.setCancelled((Xqedii_144eogi.Xqedii_7syyowo92hgg(-1891139628, 31) != 0));
            }
         }
      }
   }

   @EventHandler
   public void onJoin(PlayerJoinEvent var1) {
      if ((-1494103343 ^ -1494103343) != 0) {
         throw new IllegalStateException();
      } else {
         for (Player var3 : Bukkit.getOnlinePlayers()) {
            if (!var3.equals(var1.getPlayer())) {
               for (Entity var5 : this.Xqedii_1fwpabk.getAllHuds(var3)) {
                  var1.getPlayer().hideEntity(this, var5);
               }
            }
         }

         this.scheduleJoinResourcePackApply(var1.getPlayer());
         if (this.Xqedii_2k1vujp != null) {
            this.Xqedii_2k1vujp.applyStoredFixShadersOverride(var1.getPlayer());
            this.Xqedii_2k1vujp.applyStoredInstantCursorOverride(var1.getPlayer());
            this.Xqedii_2k1vujp.handleWorldUiViewerJoin(var1.getPlayer());
         }

         if (this.Xqedii_2k1vujp != null) {
            Player var6 = var1.getPlayer();
            Xqedii_38o2zes.Xqedii_2sj63w1(this, var6, () -> {
               if ((-1413387298 ^ -1413387298) != 0) {
                  throw new IllegalStateException();
               } else {
                  if (var6.isOnline()) {
                     this.Xqedii_2k1vujp.openOnJoinForPlayer(var6);
                  }
               }
            }, Xqedii_144eogi.Xqedii_1p484qtty8xvx(2697426095662904719L, 2));
         }
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void onResourcePackStatus(PlayerResourcePackStatusEvent var1) {
      if (((-698429849 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         Player var2 = var1.getPlayer();
         if (var2 != null) {
            if (var2.isOnline()) {
               String var3 = var1.getStatus().name();
               if (Xqedii_144eogi.Xqedii_1m52nqoyeel5v("vUZT2LQQ/QWo6RVoZJeMzMcUIt+FA8Z878jJp5IoO+tk1aXI6oPgUXDec08=").equals(var3)) {
                  if (this.isResourcePackChatMessagesEnabled()) {
                     Xqedii_3ul4hqj.send(
                        var2,
                        this.getLangMessage(
                           Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                              "xpyqiGgG/GGmJWKKKr753w11NoMM+P9UZc0xsT60ltLVPd6ZVT4QgkIpSObIVBeoDQHN2wH5jEwB2ZthxkFHmL2lCS32fnUzyTqeQto5jlssH6ntKBY+X9hRQexvnfMDIe8="
                           ),
                           Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                              "p7N3Kfrf74Li1VEQV9P+kD5f6ITy7P8TbWjKxsXf0Jg/m/GW1ul6x6cupEm44T8UM9lBtvCDK1TebKyNHF0FBeEXavL2iNyQQejgIPrkDDuFRcXv8wInWpa2Yf3tt7Jb84+RNic9"
                           )
                        )
                     );
                  }

                  if (this.isResourcePackTitleMessagesEnabled()) {
                     Component var7 = this.getLangMessage(
                        Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                           "XUMJhnhpAK2h+U7Fnyex9rjndVWvLhHn3SKD17bTRcQmSJ+OubHzF8X4SNvZ4/tjS8gtAWQgvnocJLX8clZXJhTzDtjDfyAZR8m4uUy42LWMiBkBu/TZ/3zO215CtIeO"
                        ),
                        Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                           "0slR5HwILic5dpg3s3FYDRm7cxAInz97wGdq7OkEOmDKpRMDj0ROPiyMowUjXaFc0E8bEuS8c1xICmY/GdI1378A8fSz7PAoq/0586LX3UxFXP4n2w4BcN2Ekmpy6uNan8isw283imjLFgtQ"
                        )
                     );
                     Component var5 = this.getLangMessage(
                        Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                           "s86YA3Bytr14Hi5Dh3Q/uTCm/0UuLcgFWAjt3GxtyUDM/V1W9rjWznk/f097bJbueMzofS1qQjeYKI88/wIe/WA8anQ6nsIaZPkmwwdWdoCCUhiBhO6tO7PAM7cLUMlKW3GNRv31"
                        ),
                        Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                           "AcNSD8Chb4QS/44QwbGOm6v84HXuDP1r21B2byAcZJTeHp89r93SfbhP3Uquc877M0fMgmoRg3Ww3Jvr9vS4SDMnGFOEXzdaSAHwzTMP4Hgp1rOcI1UJv0TuaplG53VFvYvf6vVguZYhnknGg7EjFHxcPHcZojTjRH3GlmbHhzI="
                        )
                     );
                     Times var6 = Times.times(
                        Duration.ofMillis(Xqedii_144eogi.Xqedii_3l5k35h8lr49o(-8798744558467285079L, 14)),
                        Duration.ofSeconds(Xqedii_144eogi.Xqedii_fv2tmp0vm94o(2487010215263862931L, 13)),
                        Duration.ofMillis(Xqedii_144eogi.Xqedii_1p484qtty8xvx(-662215197371682941L, 40))
                     );
                     Xqedii_nd6rkr3.Xqedii_303uu75(var2, Title.title(var7, var5, var6));
                  }

                  if (this.isResourcePackSoundEnabled()) {
                     this.playLoadingSounds(var2);
                  }
               } else if (Xqedii_144eogi.Xqedii_1m52nqoyeel5v("GjSNw8dNg67Gwp+O6u9h5zXE8ntlLe2huPXWMMeCxFEZguMDmN07mEtK83LB4I6JiGakSyLsA8l/Ds/agF7d1TTF")
                  .equals(var3)) {
                  this.forceClearTitle(var2);
                  Xqedii_38o2zes.Xqedii_2sj63w1(this, var2, () -> {
                     if ((1745122206 ^ 1745122206) != 0) {
                        throw new IllegalStateException();
                     } else {
                        if (var2.isOnline()) {
                           this.Xqedii_1fwpabk.resendAllHudPositions(var2);
                        }
                     }
                  }, Xqedii_144eogi.Xqedii_1p484qtty8xvx(2285131707505859964L, 35));
                  if (this.Xqedii_2k1vujp != null) {
                     this.Xqedii_2k1vujp.handleWorldUiResourcePackLoaded(var2);
                  }

                  if (this.isResourcePackChatMessagesEnabled()) {
                     Xqedii_3ul4hqj.send(
                        var2,
                        this.getLangMessage(
                           Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                              "7Q0OydYPDXTzI9s5eCae7b1bHSy9xwATnw505PJhiVge3vfhcIyQXd5Q58+O0mXNCtF39dW+XRT/7/pD/w/PKofewicOYyENuukQ/3mPcFEsGtgKexv1rVDZzjlPHZc1VxE="
                           ),
                           Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                              "aBqsb+8y0U+smz/s4rHoJx35RFVp33cTwN0feAwj7m5GD8q88KVhPtI3hS7Cw3PoiSR7qoFNdbCxDfCi2nDvms0rT0hyDdOgEXnVsoiCenmHFCbwRloYbDKwliTccwfR/NEO2dPTibSBlSHd7v4gwA6sE0Z87z0oH7qMSwQNz9tMEFRuXz8+og=="
                           )
                        )
                     );
                  }
               } else if (Xqedii_144eogi.Xqedii_1m52nqoyeel5v("AbT04GPueSwLKAlseygadhtM5p4yRwGm08pSUSx2PPJ8w9yyGS+8l42JoRA=").equals(var3)) {
                  this.forceClearTitle(var2);
                  if (this.getConfig()
                     .getBoolean(
                        Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                           "h0ATobevmKwM2BlNkdvxRnaoBtEfTitAs/cloDSwr0WrjYRn/rmVq6SPDKxkP8AUN5Rrx1WpGHabWLYOKpJtBg9daUy9w6ExQwOjrc5z51DbNMyn9H0="
                        ),
                        (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 18) != 0)
                     )) {
                     Component var4 = this.getLangMessage(
                        Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                           "1O3PBvQLsSSeTRt5gd2uEIcf/rW2PqxDahTRrmKGn4Bpqy47TH4W2lseeBX7XEzNr/71N/xtSkUSZEMGqffWNCF2RZak9uvYfOOHgqPyNrrL/I0ACOJD2csEB5eAehfSe88W7LjOs7umx6jOdlBDGFuz"
                        ),
                        Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                           "StcTSRPu7pyi3oSDud02WfASfaky36qiwpYVFBu/X4NfIklm4b+g6/W+6obStpecYnIQWN/7O0AbqkLXvFHzDMCDrMb6yTvw6fNyvdde7HdHnAS4wPG198s+VkSN7c77FOzV1PuF"
                        )
                     );
                     Xqedii_38o2zes.Xqedii_2sj63w1(this, var2, () -> {
                        if (((-956879537 << 1 | 1) & 1) == 0) {
                           throw new IllegalStateException();
                        } else {
                           if (var2.isOnline()) {
                              Xqedii_nd6rkr3.Xqedii_37yrqr8(var2, var4);
                           }
                        }
                     }, Xqedii_144eogi.Xqedii_108da41rrda18(3003722494424344878L, 42));
                  }
               } else {
                  if (Xqedii_144eogi.Xqedii_1m52nqoyeel5v("qLEkiwncffRAq2LeXgCjv6z/D+KgwTqLXUlX3sZ4uRaReuJx05Y4wOcL01UJ+Vol7EvrAx84xKFCsA==").equals(var3)
                     || Xqedii_144eogi.Xqedii_1m52nqoyeel5v("k2TePP2R3TR68Xv7ByJH5aiVatZf1qlFUFhbdXKuIV7MeCd27uVTUV5M/4JujLIlJvTtnhkP").equals(var3)) {
                     this.forceClearTitle(var2);
                     Xqedii_38o2zes.Xqedii_2sj63w1(
                        this,
                        var2,
                        () -> {
                           if ((-1010484977 * (-1010484977 + 1) & 1) != 0) {
                              throw new IllegalStateException();
                           } else if (var2.isOnline()) {
                              this.forceClearTitle(var2);
                              if (this.isResourcePackChatMessagesEnabled()) {
                                 Xqedii_3ul4hqj.send(
                                    var2,
                                    this.getLangMessage(
                                       Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                          "/06AAduBPCWZkirlJBXL6J457iv/5F2rcx75JHwv1Ozus+DGl7vpGUg37RfkfiXTDjltYznJfddmdtrIRZKbKvjgTK80CN8gaO6O8S0LAbJWkgAtD/iv7P8Puo7eW204"
                                       ),
                                       Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                          "vTeC/g2ZVe9teTqgddWQenyOo2ryI+RqP+Y0ZLKVLw5czo2aaRNUBLUMm6fD1Y906cs+5Rk1rpbsW77NIOsFcv1z70XS3EIu3DktoDuJcqQXGnapSNqBnmiRF3I3h//5XWRCpko87GpXoKTW"
                                       )
                                    )
                                 );
                              }

                              if (this.getConfig()
                                 .getBoolean(
                                    Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                       "wMITn3mRrHnKN4OB8faEt00fBjURgPpwdLy3XNdsJ2yKzcH3QqeZm8ynRnT6adwIc/bds3+GUUpReN6PpwzwLO3pakLyPKOONpkcjb3ZyK4="
                                    ),
                                    (Xqedii_144eogi.Xqedii_7syyowo92hgg(-11518691, 17) != 0)
                                 )) {
                                 Component var2x = this.getLangMessage(
                                    Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                       "ecfHHr73NA6D3T45ewezfld2BZo0MUsgtbXVPPRgBEQeXBeVctTL/qTuh2wjGnAANfQZNkT6B34xAWf/Gck3Z60fOXamyzXkTpN2EqBUuhGZl2WcDzxgG3ejj4SLMTBoAtRlyVim0kbwmtWr"
                                    ),
                                    Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                       "KpV5MUw/b+YfgqJcx08vg3wJNFaYj6EvHqKlUvV2ntE0RnOI2MIAalpnd8V+HaykMbeDzHU4XXnOWaV2afaxbVfDMzqrdmSgHj+Mrz8IVb9F1fM8pRixOVtvveM="
                                    )
                                 );
                                 Xqedii_nd6rkr3.Xqedii_37yrqr8(var2, var2x);
                              }
                           }
                        },
                        Xqedii_144eogi.Xqedii_1p484qtty8xvx(-2761558506368274306L, 45)
                     );
                  }
               }
            }
         }
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void onQuit(PlayerQuitEvent var1) {
      if ((211157567 * 211157567 - 211157567 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Player var2 = var1.getPlayer();
         this.cleanupPlayerRuntimeAndRestoreLocation(var2);
         if (this.Xqedii_1yufpo0 != null) {
            this.Xqedii_1yufpo0.handleQuit(var2.getUniqueId());
         }

         if (this.Xqedii_2k1vujp != null) {
            try {
               this.Xqedii_2k1vujp.forgetPlayerFixShadersOverride(var2);
               this.Xqedii_2k1vujp.forgetPlayerInstantCursorOverride(var2);
               this.Xqedii_2k1vujp.handleWorldUiViewerQuit(var2);
            } catch (Throwable var4) {
            }
         }

         if (this.Xqedii_1tuq2ol != null) {
            this.Xqedii_1tuq2ol.forgetServerClockStates(var2);
         }

         if (this.Xqedii_1h4p7ey != null) {
            this.Xqedii_1h4p7ey.forget(var2);
         }
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR,
      ignoreCancelled = true
   )
   public void onKick(PlayerKickEvent var1) {
      if (((-1988754173 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.cleanupPlayerRuntimeAndRestoreLocation(var1.getPlayer());
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void onPlayerDeath(PlayerDeathEvent var1) {
      if ((741314905 * 741314905 - 741314905 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.Xqedii_2k1vujp != null) {
         Player var2 = var1.getEntity();
         if (this.Xqedii_2k1vujp.isAnyPageCloseOnDeath(var2)) {
            this.Xqedii_yy2ps2m.remove(var2.getUniqueId());
            this.closeUiForPlayer(var2);
         }
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR,
      ignoreCancelled = true
   )
   public void onEntityDamage(EntityDamageEvent var1) {
      if ((-173192719 * (-173192719 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.Xqedii_2k1vujp != null) {
         if (var1.getEntity() instanceof Player var2) {
            int var4 = this.Xqedii_1a31167 != null && this.Xqedii_1a31167.consumePendingForcedClose(var2.getUniqueId())
               ? Xqedii_144eogi.Xqedii_7syyowo92hgg(2050752164, 2)
               : Xqedii_144eogi.Xqedii_7syyowo92hgg(1089763325, 27);
            if (var4 != 0 || this.Xqedii_2k1vujp.isAnyPageCloseOnDamage(var2)) {
               this.Xqedii_yy2ps2m.remove(var2.getUniqueId());
               this.closeUiForPlayer(var2);
            }
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGHEST,
      ignoreCancelled = true
   )
   public void onInteract(PlayerInteractEvent var1) {
      if (((586079354 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Action var2 = var1.getAction();
         if (var1.getHand() == EquipmentSlot.HAND) {
            Player var3 = var1.getPlayer();
            if (this.Xqedii_1tuq2ol.isCameraActive(var3)) {
               if (var2 == Action.LEFT_CLICK_AIR || var2 == Action.LEFT_CLICK_BLOCK) {
                  this.Xqedii_1tuq2ol.suppressStoneBreakAndHitSounds(var3);
                  var1.setCancelled((Xqedii_144eogi.Xqedii_111ehwx07w8i(824796800, 20) != 0));
               } else if (var2 == Action.RIGHT_CLICK_AIR || var2 == Action.RIGHT_CLICK_BLOCK) {
                  this.Xqedii_1tuq2ol.refreshClientBarrierCube(var3);
                  this.Xqedii_1tuq2ol.resampleShaderCursor(var3);
                  this.Xqedii_2k1vujp.setPlayerHeldToolAir(var3);
                  this.Xqedii_2k1vujp.clickHoveredElement(var3, GuiService.ClickType.RIGHT);
                  var1.setCancelled((Xqedii_144eogi.Xqedii_7syyowo92hgg(-773851869, 5) != 0));
                  Xqedii_38o2zes.Xqedii_1avvt9e(this, var3, () -> {
                     if ((1653052233 * (1653052233 + 1) & 1) != 0) {
                        throw new IllegalStateException();
                     } else if (var3.isOnline() && this.Xqedii_1tuq2ol.isCameraActive(var3)) {
                        this.Xqedii_2k1vujp.setPlayerHeldToolAir(var3);
                     }
                  });
                  Xqedii_38o2zes.Xqedii_2sj63w1(this, var3, () -> {
                     if (((2104713398 << 1 | 1) & 1) == 0) {
                        throw new IllegalStateException();
                     } else if (var3.isOnline() && this.Xqedii_1tuq2ol.isCameraActive(var3)) {
                        this.Xqedii_2k1vujp.setPlayerHeldToolAir(var3);
                     }
                  }, Xqedii_144eogi.Xqedii_fv2tmp0vm94o(2487010215263945107L, 8));
               }
            } else {
               if (this.Xqedii_2k1vujp != null && this.Xqedii_2k1vujp.isAimingAtWorldUi(var3)) {
                  var1.setCancelled((Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 17) != 0));
                  if (var2 == Action.RIGHT_CLICK_AIR || var2 == Action.RIGHT_CLICK_BLOCK) {
                     this.Xqedii_2k1vujp.handleWorldUiUse(var3);
                  }
               }
            }
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGHEST,
      ignoreCancelled = true
   )
   public void onAnimation(PlayerAnimationEvent var1) {
      if ((-1020412045 * (-1020412045 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1.getAnimationType() == PlayerAnimationType.ARM_SWING) {
         Player var2 = var1.getPlayer();
         if (!this.Xqedii_1tuq2ol.isCameraActive(var2)) {
            if (this.Xqedii_2k1vujp != null) {
               this.Xqedii_2k1vujp.handleWorldUiSwing(var2);
            }
         } else {
            this.Xqedii_1tuq2ol.refreshClientBarrierCube(var2);
            this.Xqedii_1tuq2ol.resampleShaderCursor(var2);
            this.Xqedii_2k1vujp.clickHoveredElement(var2, GuiService.ClickType.LEFT);
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGHEST,
      ignoreCancelled = true
   )
   public void onBlockPlace(BlockPlaceEvent var1) {
      if ((-1115629518 ^ -1115629518) != 0) {
         throw new IllegalStateException();
      } else {
         if (this.Xqedii_1tuq2ol.isCameraActive(var1.getPlayer())) {
            var1.setCancelled((Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-1526852350, 31) != 0));
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGHEST,
      ignoreCancelled = true
   )
   public void onBlockBreak(BlockBreakEvent var1) {
      if ((1857072383 * 1857072383 + 1857072383 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (this.Xqedii_1tuq2ol.isCameraActive(var1.getPlayer())) {
            this.Xqedii_1tuq2ol.suppressStoneBreakAndHitSounds(var1.getPlayer());
            var1.setCancelled((Xqedii_144eogi.Xqedii_7syyowo92hgg(-1075165277, 14) != 0));
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGHEST,
      ignoreCancelled = true
   )
   public void onBlockDamage(BlockDamageEvent var1) {
      if ((-149129585 * -149129585 + -149129585 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (this.Xqedii_1tuq2ol.isCameraActive(var1.getPlayer())) {
            this.Xqedii_1tuq2ol.suppressStoneBreakAndHitSounds(var1.getPlayer());
            var1.setCancelled((Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 1) != 0));
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGHEST,
      ignoreCancelled = true
   )
   public void onItemDrop(PlayerDropItemEvent var1) {
      if ((-910586346 * -910586346 + -910586346 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (this.Xqedii_1tuq2ol.isCameraActive(var1.getPlayer())) {
            var1.setCancelled((Xqedii_144eogi.Xqedii_111ehwx07w8i(825845392, 4) != 0));
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGHEST,
      ignoreCancelled = true
   )
   public void onSwapHandItems(PlayerSwapHandItemsEvent var1) {
      if ((-135840887 ^ -135840887) != 0) {
         throw new IllegalStateException();
      } else {
         Player var2 = var1.getPlayer();
         if (this.Xqedii_2k1vujp != null && this.Xqedii_2k1vujp.hasOpenSession(var2)) {
            if (this.Xqedii_f3ftqgq != null) {
               String var3 = this.Xqedii_f3ftqgq.resolveKeyId(var2, Xqedii_144eogi.Xqedii_1m52nqoyeel5v("hlZ+4OAL3WdcKwm2YhvzHVaQQNO6XXxhnRbDmjbu"));
               if (this.Xqedii_2k1vujp.handleRuntimeKeybind(var2, var3)) {
                  var1.setCancelled((Xqedii_144eogi.Xqedii_111ehwx07w8i(826107520, 18) != 0));
                  return;
               }
            }

            boolean var4 = var2.isSneaking() ? this.Xqedii_2k1vujp.isAnyPageCloseOnShiftF(var2) : this.Xqedii_2k1vujp.isAnyPageCloseOnF(var2);
            if (var4) {
               var1.setCancelled((Xqedii_144eogi.Xqedii_7syyowo92hgg(-1457615105, 24) != 0));
               this.closeUiForPlayer(var2);
            }
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGHEST,
      ignoreCancelled = true
   )
   public void onHotbarScroll(PlayerItemHeldEvent var1) {
      if ((2057202021 * 2057202021 + 2057202021 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Player var2 = var1.getPlayer();
         if (!this.Xqedii_1tuq2ol.isCameraActive(var2)) {
            if (this.Xqedii_2k1vujp != null) {
               int var6 = var1.getNewSlot() - var1.getPreviousSlot();
               if (var6 > Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721813305, 10)) {
                  var6 -= 9;
               } else if (var6 < Xqedii_144eogi.Xqedii_111ehwx07w8i(-1362716289, 29)) {
                  var6 += 9;
               }

               if (this.Xqedii_2k1vujp.handleWorldUiScroll(var2, var6)) {
                  var1.setCancelled((Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 4) != 0));
               }
            }
         } else {
            int var3 = var1.getNewSlot();
            if (this.Xqedii_f3ftqgq != null && var3 >= 0 && var3 <= Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-351931592, 30)) {
               String var4 = this.Xqedii_f3ftqgq.resolveKeyId(var2, String.valueOf(var3 + Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1409979384, 17)));
               if (this.Xqedii_2k1vujp.handleRuntimeKeybind(var2, var4)) {
                  var1.setCancelled((Xqedii_144eogi.Xqedii_7syyowo92hgg(503271997, 9) != 0));
                  return;
               }
            }

            int var7 = var3 - var1.getPreviousSlot();
            if (var7 > Xqedii_144eogi.Xqedii_qgzmegn7nf5p(722072377, 18)) {
               var7 -= 9;
            } else if (var7 < Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721802042, 11)) {
               var7 += 9;
            }

            boolean var5 = this.Xqedii_2k1vujp.handleScroll(var2, var7);
            if (!var5) {
               this.Xqedii_2k1vujp.handleRuntimeScrollClick(var2, var7);
            }

            var1.setCancelled((Xqedii_144eogi.Xqedii_111ehwx07w8i(825845408, 5) != 0));
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGHEST,
      ignoreCancelled = true
   )
   public void onMove(PlayerMoveEvent var1) {
      if ((-1415133275 * (-1415133275 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Player var2 = var1.getPlayer();
         Location var3 = var1.getFrom();
         Location var4 = var1.getTo();
         if (var4 != null) {
            double var5 = var4.getX() - var3.getX();
            double var7 = var4.getY() - var3.getY();
            double var9 = var4.getZ() - var3.getZ();
            int var11 = !(Math.abs(var5) > Double.longBitsToDouble(Xqedii_144eogi.Xqedii_1p484qtty8xvx(5612155914586865746L, 29)))
                  && !(Math.abs(var7) > Double.longBitsToDouble(Xqedii_144eogi.Xqedii_fv2tmp0vm94o(-4568115233601333301L, 43)))
                  && !(Math.abs(var9) > Double.longBitsToDouble(Xqedii_144eogi.Xqedii_1p484qtty8xvx(-7222432244535820124L, 30)))
               ? Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 24)
               : Xqedii_144eogi.Xqedii_7syyowo92hgg(-268791320, 12);
            if (!this.Xqedii_1tuq2ol.isCameraActive(var2)) {
               if (var11 != 0) {
                  this.Xqedii_2k1vujp.handleRuntimeHudFollowMove(var2, var5, var7, var9);
               }
            } else {
               if (var11 != 0) {
                  this.Xqedii_2k1vujp.handleEditorMovementShortcut(var2, var5, var9, var3.getYaw());
                  var1.setTo(new Location(var3.getWorld(), var3.getX(), var3.getY(), var3.getZ(), var4.getYaw(), var4.getPitch()));
               }
            }
         }
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR,
      ignoreCancelled = true
   )
   public void onToggleSneak(PlayerToggleSneakEvent var1) {
      if ((-396113334 * -396113334 + -396113334 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.Xqedii_2k1vujp != null) {
         Player var2 = var1.getPlayer();
         if (var2 != null) {
            this.Xqedii_2k1vujp.handleRuntimeHudSneakToggle(var2, var1.isSneaking());
         }
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void onRespawn(PlayerRespawnEvent var1) {
      if ((-996618204 * -996618204 + -996618204 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.Xqedii_2k1vujp != null) {
         Player var2 = var1.getPlayer();
         this.Xqedii_2k1vujp.handleWorldUiViewerReset(var2);
         Xqedii_38o2zes.Xqedii_2sj63w1(this, var2, () -> {
            if ((383558034 ^ 383558034) != 0) {
               throw new IllegalStateException();
            } else if (var2.isOnline()) {
               this.Xqedii_2k1vujp.restoreRuntimeHudSession(var2);
               if (this.Xqedii_1h4p7ey != null) {
                  this.Xqedii_1h4p7ey.resend(var2);
               }
            }
         }, Xqedii_144eogi.Xqedii_1p484qtty8xvx(2759262214813628011L, 59));
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void onChangedWorld(PlayerChangedWorldEvent var1) {
      if (((-1818993042 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.Xqedii_2k1vujp != null) {
         Player var2 = var1.getPlayer();
         this.Xqedii_2k1vujp.handleWorldUiViewerReset(var2);
         Xqedii_38o2zes.Xqedii_2sj63w1(this, var2, () -> {
            if ((1129975940 ^ 1129975940) != 0) {
               throw new IllegalStateException();
            } else if (var2.isOnline()) {
               this.Xqedii_2k1vujp.restoreRuntimeHudSession(var2);
               if (this.Xqedii_1h4p7ey != null) {
                  this.Xqedii_1h4p7ey.resend(var2);
               }
            }
         }, Xqedii_144eogi.Xqedii_108da41rrda18(-8223542917331059987L, 5));
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR,
      ignoreCancelled = true
   )
   public void onTeleport(PlayerTeleportEvent var1) {
      if (((247561712 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.Xqedii_2k1vujp != null) {
         Player var2 = var1.getPlayer();
         UUID var3 = var2.getUniqueId();
         int var4 = this.Xqedii_1tuq2ol != null && this.Xqedii_1tuq2ol.isCameraActive(var2)
            ? Xqedii_144eogi.Xqedii_7syyowo92hgg(-45550473, 19)
            : Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 19);
         if (var4 != 0) {
            this.Xqedii_2t79mgx.add(var3);
            Xqedii_38o2zes.Xqedii_2sj63w1(this, var2, () -> {
               if (((-1858200790 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  this.Xqedii_2t79mgx.remove(var3);
               }
            }, Xqedii_144eogi.Xqedii_3l5k35h8lr49o(424627478390849449L, 63));
         }

         Location var5 = var1.getFrom();
         Location var6 = var1.getTo();
         if (var5 != null && var6 != null) {
            int var7 = var5.getWorld() != null && var6.getWorld() != null && var5.getWorld().getUID().equals(var6.getWorld().getUID())
               ? Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 9)
               : Xqedii_144eogi.Xqedii_111ehwx07w8i(824796800, 20);
            TeleportCause var8 = var1.getCause();
            int var9 = var8 != TeleportCause.ENDER_PEARL && var8 != TeleportCause.CHORUS_FRUIT
               ? Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 28)
               : Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 28);
            boolean var10 = this.Xqedii_2k1vujp.isHudTextOnlySession(var2);
            double var11 = var7 != 0 ? Double.longBitsToDouble(Xqedii_144eogi.Xqedii_3l5k35h8lr49o(8798744532698316886L, 34)) : var5.distanceSquared(var6);
            double var13 = var10
               ? Double.longBitsToDouble(Xqedii_144eogi.Xqedii_1p484qtty8xvx(917131364083303529L, 28))
               : Double.longBitsToDouble(Xqedii_144eogi.Xqedii_3l5k35h8lr49o(8798744558463932320L, 13));
            if (var9 != 0 || !(var11 < var13)) {
               long var15 = var9 != 0
                  ? Xqedii_144eogi.Xqedii_1p484qtty8xvx(-2234432644427877653L, 30)
                  : Xqedii_144eogi.Xqedii_3l5k35h8lr49o(-8798744558463926359L, 55);
               Xqedii_38o2zes.Xqedii_2sj63w1(this, var2, () -> {
                  if ((-437113958 ^ -437113958) != 0) {
                     throw new IllegalStateException();
                  } else if (var2.isOnline()) {
                     if (this.Xqedii_2k1vujp.isHudTextOnlySession(var2)) {
                        if (var7 != 0) {
                           this.Xqedii_2k1vujp.restoreRuntimeHudSession(var2);
                        } else {
                           this.Xqedii_2k1vujp.reanchorRuntimeHudSession(var2);
                        }
                     } else if (var4 != 0 && !this.isEditorTeleportCloseSuppressed(var2)) {
                        if (this.Xqedii_1tuq2ol.isCameraActive(var2)) {
                           this.Xqedii_2k1vujp.closeGui(var2);
                        }
                     }
                  }
               }, var15);
            }
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGHEST
   )
   public void onInventoryClick(InventoryClickEvent var1) {
      if (((717239416 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         if (var1.getWhoClicked() instanceof Player var2 && this.Xqedii_1tuq2ol.isCameraActive(var2)) {
            if (this.Xqedii_7yqoxd9(var2)) {
               var1.setCancelled((Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 22) != 0));
               return;
            }

            this.Xqedii_2k1vujp.handleItemDesignInventoryClick(var2, var1.getCurrentItem(), var1.getCursor(), var2.getItemOnCursor());
            var1.setCancelled((Xqedii_144eogi.Xqedii_111ehwx07w8i(825844352, 10) != 0));
         }
      }
   }

   public AnvilInputService anvilInput() {
      if (((-663589666 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2lp9ah4;
      }
   }

   public boolean Xqedii_7yqoxd9(Player var1) {
      if (((-836454989 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_2lp9ah4 != null && this.Xqedii_2lp9ah4.isActive(var1)
            ? Xqedii_144eogi.Xqedii_111ehwx07w8i(825878144, 15)
            : Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 5)) != 0);
      }
   }

   @EventHandler(
      priority = EventPriority.HIGHEST
   )
   public void onInventoryDrag(InventoryDragEvent var1) {
      if ((-1955559242 * -1955559242 - -1955559242 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1.getWhoClicked() instanceof Player var2 && this.Xqedii_1tuq2ol.isCameraActive(var2)) {
            if (this.Xqedii_7yqoxd9(var2)) {
               var1.setCancelled((Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 0) != 0));
               return;
            }

            this.Xqedii_2k1vujp.handleItemDesignInventoryClick(var2, var1.getOldCursor(), var1.getCursor(), var2.getItemOnCursor());
            var1.setCancelled((Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 0) != 0));
         }
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void onInventoryClose(InventoryCloseEvent var1) {
      if (((-586445191 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1.getPlayer() instanceof Player var2) {
         if (this.Xqedii_1tuq2ol.isCameraActive(var2)) {
            Xqedii_38o2zes.Xqedii_2sj63w1(this, var2, () -> {
               if (((-297174943 << 1 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else if (var2.isOnline() && this.Xqedii_1tuq2ol.isCameraActive(var2)) {
                  this.Xqedii_2k1vujp.reapplyClientHotbarAir(var2);
               }
            }, Xqedii_144eogi.Xqedii_3l5k35h8lr49o(-8798744558463926359L, 63));
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGHEST,
      ignoreCancelled = true
   )
   public void onAsyncChat(AsyncPlayerChatEvent var1) {
      if ((-498360575 ^ -498360575) != 0) {
         throw new IllegalStateException();
      } else {
         Player var2 = var1.getPlayer();
         if (this.Xqedii_1tuq2ol.isCameraActive(var2)) {
            if (this.Xqedii_2k1vujp.isAwaitingSidebarInput(var2)) {
               var1.setCancelled((Xqedii_144eogi.Xqedii_111ehwx07w8i(892954240, 26) != 0));
               String var3 = var1.getMessage();
               Xqedii_38o2zes.Xqedii_1avvt9e(this, var2, () -> {
                  if ((834370777 ^ 834370777) != 0) {
                     throw new IllegalStateException();
                  } else {
                     this.Xqedii_2k1vujp.handleSidebarChatInput(var2, var3);
                  }
               });
            }
         }
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void onUuiCommandWithoutPermission(PlayerCommandPreprocessEvent var1) {
      if ((860569744 * 860569744 - 860569744 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var2 = var1.getMessage();
         if (var2 != null && var2.startsWith(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("FRKNMlnRC/5f+7m41YzaCM8hEAJ3gIzKI4QJgCp0"))) {
            String var3 = var2.substring(Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-257419993, 10)).trim();
            int var4 = var3.indexOf(Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-1572560958, 20));
            if (var4 >= 0) {
               var3 = var3.substring(Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 26), var4);
            }

            var3 = var3.toLowerCase(Locale.ROOT);
            if (var3.equals(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fJgDaOFE157Hhp8pfVbLGX5IcAXp/LA5r8CWTL1vjTCPSg=="))
               || var3.equals(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("dtBnSf8JZyNDSfXOYjeVGht2wf8rtya8XFAW9k/R2c4qTB/6rrW4Osqj9HnhPcI8gXgDbzzfPug="))) {
               Player var5 = var1.getPlayer();
               if (!this.hasCommandPermissionSilent(
                  var5, Xqedii_144eogi.Xqedii_1m52nqoyeel5v("D5XC8Z3YFP7g9HNFUJo3VG2jVEovX7so/oqLguGKgq5/3B6X9KTm7pIpGR8kF2xJf5YilNdtuGrrA1legPd+s22EZ2kxhlzm")
               )) {
                  var1.setCancelled((Xqedii_144eogi.Xqedii_7syyowo92hgg(2013087988, 11) != 0));
                  this.sendUuiCommandError(
                     var5,
                     Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                        "2oJiOEZmEw8Bmx5NQ3I/Uh8nfcGe4f9RnoaCq2ngzGY5lmBgzlsFf56Wf48O6kx7hX36dbcySYVeJ7qZUeqzUIqZsZ8dU/97oi6VKHu8xIAyPvlwSObYtzw5Ec+HRJO8dEHXWnM6FInQmVvz/JX1NETd+V3y9i/p"
                     ),
                     new Object[Xqedii_144eogi.Xqedii_7syyowo92hgg(1346182655, 25)]
                  );
               }
            }
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGHEST,
      ignoreCancelled = true
   )
   public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent var1) {
      if (((1201269220 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Player var2 = var1.getPlayer();
         String var3 = var1.getMessage();
         if (var3 != null && !var3.isBlank()) {
            String var4 = var3.trim();
            if (var4.startsWith(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("FRKNMlnRC/5f+7m41YzaCM8hEAJ3gIzKI4QJgCp0"))) {
               var4 = var4.substring(Xqedii_144eogi.Xqedii_111ehwx07w8i(288974464, 29)).trim();
            }

            if (!var4.isBlank()) {
               String var5 = var4;
               int var6 = var4.indexOf(Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1361203169, 19));
               if (var6 >= 0) {
                  var5 = var4.substring(Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 14), var6);
               }

               if (!var5.equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fJgDaOFE157Hhp8pfVbLGX5IcAXp/LA5r8CWTL1vjTCPSg=="))
                  && !var5.toLowerCase(Locale.ROOT).startsWith(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("BW40VmW7Vh3Vu1ZzGcSFURZiivOnBdbyH4hwO4Ivh6+Aqr98"))) {
                  if (this.Xqedii_2k1vujp.isAwaitingSidebarInput(var2)) {
                     var1.setCancelled((Xqedii_144eogi.Xqedii_7syyowo92hgg(503271997, 9) != 0));
                     Xqedii_38o2zes.Xqedii_1avvt9e(this, var2, () -> {
                        if (((1241973237 << 1 | 1) & 1) == 0) {
                           throw new IllegalStateException();
                        } else {
                           this.Xqedii_2k1vujp.handleSidebarChatInput(var2, var3);
                        }
                     });
                  } else {
                     String var7 = this.Xqedii_2k1vujp.resolveGuiByCustomCommand(var3);
                     if (var7 != null && !var7.isBlank()) {
                        var1.setCancelled((Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 20) != 0));
                        this.openUiForPlayer(
                           var2, var7, (Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1082736517, 21) != 0), (Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 28) != 0)
                        );
                     }
                  }
               }
            }
         }
      }
   }

   public boolean onCommand(CommandSender var1, Command var2, String var3, String[] var4) {
      if ((551761961 ^ 551761961) != 0) {
         throw new IllegalStateException();
      } else if (var2.getName().equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fJgDaOFE157Hhp8pfVbLGX5IcAXp/LA5r8CWTL1vjTCPSg=="))
         && var4.length >= Xqedii_144eogi.Xqedii_21f6ki8nog7xd(354939048, 26)
         && var4[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-2129494262, 22)]
            .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("+87ituwYNeYgzPSGVn24BSf5fKiFDd/u+xDvJ2blLy4hK0Yb5ooGMw=="))) {
         return this.handleUuiReloadCommand(var1, var4);
      } else if (var2.getName().equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fJgDaOFE157Hhp8pfVbLGX5IcAXp/LA5r8CWTL1vjTCPSg=="))
         && var4.length >= Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 31)
         && var4[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-1614634940, 4)]
            .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("nE4TSbcPjj6rf2eh0sMZUmp6EqiT3HmVPiSxcs21y72uNQU5VIJICJ2H"))) {
         return this.handleUuiBedrockCommand(var1, var4);
      } else if (this.Xqedii_1zavo1k == null || !this.Xqedii_1zavo1k.Xqedii_16aanrd()) {
         this.sendLicenseInvalidMessage(var1);
         return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 7) != 0);
      } else if (this.Xqedii_2k1vujp == null) {
         this.sendUuiServicesError(var1);
         return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 16) != 0);
      } else if (!var2.getName().equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fJgDaOFE157Hhp8pfVbLGX5IcAXp/LA5r8CWTL1vjTCPSg=="))) {
         return (Xqedii_144eogi.Xqedii_7syyowo92hgg(-268791320, 12) != 0);
      } else if (!(var1 instanceof Player var5)) {
         if (var4.length >= Xqedii_144eogi.Xqedii_7syyowo92hgg(-773851869, 5)
            && var4[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-1812442104, 1)]
               .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("aL/52fd/b2mPiHXYhKYcfpg8NVjAbokogzTRHZEGkTByYGEv"))) {
            return this.handleUuiConsoleOpenCommand(var1, var4);
         } else if (var4.length >= Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 3)
            && var4[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-257421017, 10)]
               .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("OPkEekshqKXA/onNE7jCtQkeY2aGin9wa5ipgeR7rCHn2C2a7Tw="))) {
            return this.handleUuiConsoleCloseCommand(var1, var4);
         } else if (var4.length >= Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-2059359937, 13)
            && var4[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 7)]
               .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("x1nWLFR3iMEjQzjJX3BWSGfP5QMlncENh0movz098/m2NxLVFlivYTGW"))) {
            return this.handleUuiShadersCommand(var1, var4);
         } else if (var4.length >= Xqedii_144eogi.Xqedii_111ehwx07w8i(825878144, 15)
            && var4[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 14)]
               .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("SjFzV6HBUjSqWvlgiP1sL72hMOAh37JYXgJZz1fXWuYpBYcVqeLfOw=="))) {
            return this.handleUuiCursorCommand(var1, var4);
         } else if (var4.length >= Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1065697449, 5)
            && var4[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 18)]
               .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("tv2WqMVml3YzQXh8Ck9TIM8qoUBHRuvsy0fjkYcxodEe6ZVgJy4="))) {
            return this.handleUuiWorldCommand(var1, var4);
         } else {
            this.sendUuiCommandError(
               var1,
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "G43vykErXs4wVkSU8frKK8ZHu4QVuGaAJQrZUHKYLWLWQenUoknmKDkBldmbf6unI/WgI8/dPG5b7eRNNnyFfVjo9XerSd0qfh6qnVM1wuC2Sd8L2cIvdmh+33JoSA=="
               ),
               new Object[Xqedii_144eogi.Xqedii_7syyowo92hgg(-386925951, 4)]
            );
            return (Xqedii_144eogi.Xqedii_111ehwx07w8i(859399808, 25) != 0);
         }
      } else if (var4.length < Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1419756192, 28)) {
         if (!this.hasCommandPermissionSilent(
            var5, Xqedii_144eogi.Xqedii_1m52nqoyeel5v("D5XC8Z3YFP7g9HNFUJo3VG2jVEovX7so/oqLguGKgq5/3B6X9KTm7pIpGR8kF2xJf5YilNdtuGrrA1legPd+s22EZ2kxhlzm")
         )) {
            Xqedii_3ul4hqj.send(
               var5,
               this.getLangMessage(
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("aoJaHiXfONpWuPSfUS1YTYOdlQ46YSTif3UP8qGj+ANhvEEbU7evQaf6fgUk9lviDwQLmAN4nJgwyNTi"),
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("1k0gkqnhRn83t4lJTXRaQ/w7GOSdNB5+a3YQE0dMLuk1D34aOMaabk+4lgMtCc4pZcVxr0BLKh54r1JHTJknRAhD9ec=")
               )
            );
         } else {
            this.sendUuiHelp(var5);
         }

         return (Xqedii_144eogi.Xqedii_111ehwx07w8i(823748224, 21) != 0);
      } else if (!this.hasCommandPermission(
         var5,
         Xqedii_144eogi.Xqedii_1m52nqoyeel5v("D5XC8Z3YFP7g9HNFUJo3VG2jVEovX7so/oqLguGKgq5/3B6X9KTm7pIpGR8kF2xJf5YilNdtuGrrA1legPd+s22EZ2kxhlzm"),
         Xqedii_144eogi.Xqedii_1m52nqoyeel5v("NegUF+e5x9J2GAGTRsfoZVvukgpUzCzBfwpf8yN4HQZ7bXVQ")
      )) {
         return (Xqedii_144eogi.Xqedii_111ehwx07w8i(892954240, 26) != 0);
      } else if (this.Xqedii_1yufpo0 == null
         || !this.Xqedii_1yufpo0.isBedrockPlayer(var5)
         || !var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(-1075181661, 14)]
               .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("yPBCZzzZgROkOIjNP482Z098Lhm3ScKQvyca25eDgCej0JtZ"))
            && !var4[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-1614634940, 4)]
               .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("j/WdpMOw/j2o2ARxH7YhhLGbp1dOvFGNyOIEQNFQ/cAcAulzbpMmiw=="))
            && !var4[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 7)]
               .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("3cz9+kRUtxAvOoT2E9mdHHQNowBbPDrbh/YnkLEwgX9a2zpT"))) {
         if (var4[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 4)]
            .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("j/WdpMOw/j2o2ARxH7YhhLGbp1dOvFGNyOIEQNFQ/cAcAulzbpMmiw=="))) {
            if (!this.hasCommandPermission(
               var5,
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("J8doVuhsae0TeFBZorOk/fo5/uOIumXEbZcpabocU+g03pKUMZRxe+WHaG0jMba0/C4oACJvtt/sAjVK3HvDMPZMDShe0nc6cKzoVmBR"),
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("2pyUeb+ERVkR/5Jde1UvMlU6iD2v9KJGc2d1rr+D8Ofl4C0VFe3aO+Mza98XB5k79Ak=")
            )) {
               return (Xqedii_144eogi.Xqedii_111ehwx07w8i(825844352, 10) != 0);
            }

            if (var4.length != Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721809977, 8)) {
               this.sendUuiUsage(
                  var5,
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("2pyUeb+ERVkR/5Jde1UvMlU6iD2v9KJGc2d1rr+D8Ofl4C0VFe3aO+Mza98XB5k79Ak="),
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("HeCd6oIXfIhSBerO9Mypq0jY+9rLIYNAxzJdDwrxo3TMdJ/QeEFBXQ==")
               );
               return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 28) != 0);
            }

            if (this.Xqedii_2k1vujp.hasOpenSession(var5) && !this.Xqedii_2k1vujp.isEditorOpen(var5)) {
               this.closeUiForPlayer(var5);
            }

            Location var6 = this.resolveReturnLocationBeforeOpen(var5, (Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-32177628, 7) != 0));
            boolean var7 = this.Xqedii_2k1vujp.createGuiAndStartEditor(var5, var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(-773851869, 5)]);
            this.updateReturnLocationAfterOpen(var5, var7, (Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 5) != 0), var6);
         } else if (var4[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 8)]
            .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("aL/52fd/b2mPiHXYhKYcfpg8NVjAbokogzTRHZEGkTByYGEv"))) {
            if (!this.hasCommandPermission(
               var5,
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("HVoQWb5cazWnuyTbUBArGdgC0Hhp+eeJ+GUKFj48k7GlkrXgUAbadyE/ovlUojLI8DiaRPiR01/DcUPsXy4KiaYo4znPA77xIXo="),
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("WTJcfYmBb3rPVbMPU8l8fJ2sGLNsn/3emEmZyEO04u+9YRTao/+4ytPqpma6Hw==")
            )) {
               return (Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-128709997, 9) != 0);
            }

            if (var4.length < Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1688191648, 28)) {
               this.sendUuiUsage(
                  var5,
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("WTJcfYmBb3rPVbMPU8l8fJ2sGLNsn/3emEmZyEO04u+9YRTao/+4ytPqpma6Hw=="),
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                     "gYIgZ+TYoNlXeVJ/mb4i82AO4anCDp7JNBI674kGEttEjjqIpQi2KymunmPNVihkzMal0Siq4CEg1FsXhc0GaTo8iVghbtTDW7WCH7r2JU7dJSzbbJL5NAeBTYb7fw=="
                  )
               );
               return (Xqedii_144eogi.Xqedii_111ehwx07w8i(825828992, 14) != 0);
            }

            if (var4.length > Xqedii_144eogi.Xqedii_111ehwx07w8i(825848448, 10)) {
               this.sendUuiUsage(
                  var5,
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("WTJcfYmBb3rPVbMPU8l8fJ2sGLNsn/3emEmZyEO04u+9YRTao/+4ytPqpma6Hw=="),
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                     "gYIgZ+TYoNlXeVJ/mb4i82AO4anCDp7JNBI674kGEttEjjqIpQi2KymunmPNVihkzMal0Siq4CEg1FsXhc0GaTo8iVghbtTDW7WCH7r2JU7dJSzbbJL5NAeBTYb7fw=="
                  )
               );
               return (Xqedii_144eogi.Xqedii_7syyowo92hgg(-1847005190, 28) != 0);
            }

            String[] var10001 = new String[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(176247423, 14)];
            var10001[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(143915092, 25)] = var4[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 0)];
            String var16 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
            if (var16.equals(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("rJsqVHeCQDTAAbBMCti2dnVvOjDwDf/ikiIYG17j183P0N4QL+wK9A=="))
               || var16.equals(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fNkwtfDYP6SbfbMwbNejrG7+g7T4O9PSZ5Wor5BE5EfT9EwIcHF8sMRtyl9nOs/zHZM="))) {
               String var10002 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "4C+bumxXzj2C7+TNsSrGznlv0XuUO2qMmPa9+VgXDbFYVYX+8imG3yI4kpvcuKreoza0cdAzo1olzTEeZ9G04sG0oMjJ2yay"
               );
               Object[] var10003 = new Object[Xqedii_144eogi.Xqedii_7syyowo92hgg(1223981053, 27)];
               var10003[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1340166178, 3)] = var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(-193462968, 3)];
               this.sendUuiCommandError(var5, var10002, var10003);
               return (Xqedii_144eogi.Xqedii_111ehwx07w8i(-1321638272, 31) != 0);
            }

            Xqedii_g4i3bi9 var23 = this.parseOpenCommandOptions(var5, var4);
            if (var23 == null) {
               return (Xqedii_144eogi.Xqedii_111ehwx07w8i(834233984, 23) != 0);
            }

            this.openUiForPlayer(var23.targetPlayer(), var4[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1241262597, 0)], var23.hudMode(), var23.autoClose());
         } else if (var4[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(620631298, 31)]
            .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("yPBCZzzZgROkOIjNP482Z098Lhm3ScKQvyca25eDgCej0JtZ"))) {
            if (!this.hasCommandPermission(
               var5,
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("JOcKjnP3OsE2rwC4PVqTesYsCqMEbqFaBUmIGMcGWuCgLLmSWNifXN+OTEaDrmew5oXQSegps2gA/ruW2IWP+jmf5Kl7+B/RrQc="),
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("GSltrVY/89TDGjW57m629wms62mGr/U4di3T6V6d+BCbftG8QuHbfHXg0QrDnw==")
            )) {
               return (Xqedii_144eogi.Xqedii_7syyowo92hgg(-728807553, 23) != 0);
            }

            if (var4.length != Xqedii_144eogi.Xqedii_21f6ki8nog7xd(670083097, 2)) {
               this.sendUuiUsage(
                  var5,
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("GSltrVY/89TDGjW57m629wms62mGr/U4di3T6V6d+BCbftG8QuHbfHXg0QrDnw=="),
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("HeCd6oIXfIhSBerO9Mypq0jY+9rLIYNAxzJdDwrxo3TMdJ/QeEFBXQ==")
               );
               return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 29) != 0);
            }

            String[] var27 = new String[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 9)];
            var27[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 22)] = var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(-45550473, 19)];
            String var17 = this.firstNonBlank(var27).trim();
            String var24 = var17.toLowerCase(Locale.ROOT);
            if (var24.equals(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("rJsqVHeCQDTAAbBMCti2dnVvOjDwDf/ikiIYG17j183P0N4QL+wK9A=="))
               || var24.equals(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fNkwtfDYP6SbfbMwbNejrG7+g7T4O9PSZ5Wor5BE5EfT9EwIcHF8sMRtyl9nOs/zHZM="))) {
               String var32 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "4C+bumxXzj2C7+TNsSrGznlv0XuUO2qMmPa9+VgXDbFYVYX+8imG3yI4kpvcuKreoza0cdAzo1olzTEeZ9G04sG0oMjJ2yay"
               );
               Object[] var41 = new Object[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 21)];
               var41[Xqedii_144eogi.Xqedii_7syyowo92hgg(2050752160, 2)] = var17;
               this.sendUuiCommandError(var5, var32, var41);
               return (Xqedii_144eogi.Xqedii_111ehwx07w8i(825844864, 9) != 0);
            }

            String var8 = this.resolveExistingUiName(var17);
            if (var8.isBlank()) {
               String var31 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "4C+bumxXzj2C7+TNsSrGznlv0XuUO2qMmPa9+VgXDbFYVYX+8imG3yI4kpvcuKreoza0cdAzo1olzTEeZ9G04sG0oMjJ2yay"
               );
               Object[] var40 = new Object[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 29)];
               var40[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 18)] = var17;
               this.sendUuiCommandError(var5, var31, var40);
               return (Xqedii_144eogi.Xqedii_7syyowo92hgg(-1847005190, 28) != 0);
            }

            int var9 = this.Xqedii_2k1vujp.hasOpenSession(var5) && !this.Xqedii_2k1vujp.isEditorOpen(var5)
               ? Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-257419993, 10)
               : Xqedii_144eogi.Xqedii_7syyowo92hgg(1089763325, 27);
            Location var10 = this.resolveReturnLocationBeforeOpen(var5, (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 28) != 0));
            if (var9 != 0) {
               this.closeUiForPlayer(var5);
            }

            int var11 = this.Xqedii_2k1vujp != null && this.Xqedii_2k1vujp.isEditorOpen(var5)
               ? Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 31)
               : Xqedii_144eogi.Xqedii_7syyowo92hgg(-46074761, 19);
            if (var9 != 0) {
               Xqedii_38o2zes.Xqedii_2sj63w1(
                  this,
                  var5,
                  () -> {
                     if ((-1096946732 ^ -1096946732) != 0) {
                        throw new IllegalStateException();
                     } else if (var5.isOnline()) {
                        this.restorePreservedReturnLocation(var5, var10);
                        boolean var5x = this.Xqedii_2k1vujp.startEditor(var5, var8);
                        this.updateReturnLocationAfterOpen(var5, var5x, (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 8) != 0), var10);
                        if (!var5x && var11 != 0) {
                           boolean var6x = this.Xqedii_2k1vujp.sendPageLockedMessageIfPresent(var5, var8);
                           if (!var6x) {
                              String var10002x = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                                 "keJKh0OuEnBHmmSiDDUDKVd0p2+2DSw1ZNi9Go5RDO/v2+gRzwC2hoT9jnE+pA3xwdFCyXfPITOiBkYj6DfTBNXKWWzHuCFmHRvb7cAh7SBDZMMyDcL+xPawRgnzCQ=="
                              );
                              Object[] var10003x = new Object[Xqedii_144eogi.Xqedii_7syyowo92hgg(-1535493122, 26)];
                              var10003x[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 25)] = var8;
                              this.sendUuiCommandError(var5, var10002x, var10003x);
                           }
                        }
                     }
                  },
                  Xqedii_144eogi.Xqedii_108da41rrda18(-3067955196693083541L, 56)
               );
               return (Xqedii_144eogi.Xqedii_111ehwx07w8i(825845440, 6) != 0);
            }

            boolean var12 = this.Xqedii_2k1vujp.startEditor(var5, var8);
            this.updateReturnLocationAfterOpen(var5, var12, (Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1151320736, 28) != 0), var10);
            if (!var12 && var11 != 0) {
               int var13 = this.Xqedii_2k1vujp != null && this.Xqedii_2k1vujp.sendPageLockedMessageIfPresent(var5, var8)
                  ? Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 12)
                  : Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 7);
               if (var13 == 0) {
                  String var30 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                     "keJKh0OuEnBHmmSiDDUDKVd0p2+2DSw1ZNi9Go5RDO/v2+gRzwC2hoT9jnE+pA3xwdFCyXfPITOiBkYj6DfTBNXKWWzHuCFmHRvb7cAh7SBDZMMyDcL+xPawRgnzCQ=="
                  );
                  Object[] var39 = new Object[Xqedii_144eogi.Xqedii_111ehwx07w8i(825828992, 14)];
                  var39[Xqedii_144eogi.Xqedii_7syyowo92hgg(-92149521, 20)] = var8;
                  this.sendUuiCommandError(var5, var30, var39);
               }
            }
         } else if (var4[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 22)]
            .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("LwgkPd6d/M38bY8S+j594rbfKRamu+dQ195pTNt4+mjnnXcJkLVTTA=="))) {
            if (!this.hasCommandPermission(
               var5,
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("CLKqq7v2hct1W65YHpZr8crH53lXORfnesaa+ES2sJTdViim4E9DPDu8tE9/C7XQl9cZELEvbN90HjdDt4Bz1fd6BgL4safsg8TZM1QQ"),
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("X5IusoI+Jns0H8OJyynbX0thth6aT9O4AgpGov4E28BO9y7YTPfUM/SVVjSsGtVMAmY=")
            )) {
               return (Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1340166186, 3) != 0);
            }

            if (var4.length != Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-128709485, 9)) {
               this.sendUuiUsage(
                  var5,
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("X5IusoI+Jns0H8OJyynbX0thth6aT9O4AgpGov4E28BO9y7YTPfUM/SVVjSsGtVMAmY="),
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("HeCd6oIXfIhSBerO9Mypq0jY+9rLIYNAxzJdDwrxo3TMdJ/QeEFBXQ==")
               );
               return (Xqedii_144eogi.Xqedii_111ehwx07w8i(1899587200, 30) != 0);
            }

            String[] var28 = new String[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845408, 5)];
            var28[Xqedii_144eogi.Xqedii_7syyowo92hgg(-1474392321, 24)] = var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(503271997, 9)];
            String var18 = this.firstNonBlank(var28).trim().toLowerCase(Locale.ROOT);
            if (var18.equals(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("rJsqVHeCQDTAAbBMCti2dnVvOjDwDf/ikiIYG17j183P0N4QL+wK9A=="))
               || var18.equals(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fNkwtfDYP6SbfbMwbNejrG7+g7T4O9PSZ5Wor5BE5EfT9EwIcHF8sMRtyl9nOs/zHZM="))) {
               String var33 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "4C+bumxXzj2C7+TNsSrGznlv0XuUO2qMmPa9+VgXDbFYVYX+8imG3yI4kpvcuKreoza0cdAzo1olzTEeZ9G04sG0oMjJ2yay"
               );
               Object[] var42 = new Object[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 7)];
               var42[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-32177628, 7)] = var4[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-2125299958, 22)];
               this.sendUuiCommandError(var5, var33, var42);
               return (Xqedii_144eogi.Xqedii_111ehwx07w8i(825976448, 17) != 0);
            }

            this.Xqedii_2k1vujp.deleteGui(var5, var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(600956917, 29)]);
         } else if (var4[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 28)]
            .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("OPkEekshqKXA/onNE7jCtQkeY2aGin9wa5ipgeR7rCHn2C2a7Tw="))) {
            if (!this.hasCommandPermission(
               var5,
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("LXZcFIV0AiIrUmAYLqX3yb+6Ik64pvAHTcZTWe11KIaMy72eY76pqnQT2r+ijdvntzqi5KjXQHphQzVV7Fey7vOLw54/cdfv/uk3JQ=="),
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("yHWWxree9xfeaKf4svDK8n0lhO0arFcFHOoARD1XCN8tqDpC865YnWiN1VCCZNcj")
            )) {
               return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 16) != 0);
            }

            if (var4.length > Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-32177372, 7)) {
               this.sendUuiUsage(
                  var5,
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("yHWWxree9xfeaKf4svDK8n0lhO0arFcFHOoARD1XCN8tqDpC865YnWiN1VCCZNcj"),
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("HeCd6oIXfIhSBerO9Mypq0jY+9rLIYNAxzJdDwrxo3TMdJ/QeEFBXQ==")
               );
               return (Xqedii_144eogi.Xqedii_7syyowo92hgg(-45550473, 19) != 0);
            }

            if (var4.length == Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721744697, 16)) {
               boolean var19 = this.closeUiForPlayer(var5, var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(-1075165277, 14)]);
               if (!var19) {
                  String var34 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                     "Ino196a6hxgr8e9KLuQqpxRkyeXO3E8Tq1i51D/VpJ9nXWC8i2go3k56JCaKVCM3Hsmv5yNiHfHCexlM0j5g3mF4gR+GHUF0q7vJQTQegbxTvzV8guwgnA=="
                  );
                  Object[] var43 = new Object[Xqedii_144eogi.Xqedii_111ehwx07w8i(826107520, 18)];
                  var43[Xqedii_144eogi.Xqedii_7syyowo92hgg(503271485, 9)] = var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(-386925935, 4)];
                  this.sendUuiCommandError(var5, var34, var43);
               }

               return (Xqedii_144eogi.Xqedii_7syyowo92hgg(-1075165277, 14) != 0);
            }

            this.closeUiForPlayer(var5);
         } else if (var4[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 1)]
            .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("3cz9+kRUtxAvOoT2E9mdHHQNowBbPDrbh/YnkLEwgX9a2zpT"))) {
            if (!this.hasCommandPermission(
               var5,
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("JOcKjnP3OsE2rwC4PVqTesYsCqMEbqFaBUmIGMcGWuCgLLmSWNifXN+OTEaDrmew5oXQSegps2gA/ruW2IWP+jmf5Kl7+B/RrQc="),
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("QRoKeaiIP6x0JdyCXWbpp4nLTaybNPTrOi9lQI12utBCSTUjclDVUqWh38clXQ==")
            )) {
               return (Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1384057473, 30) != 0);
            }

            if (var4.length > Xqedii_144eogi.Xqedii_111ehwx07w8i(825845380, 2)) {
               this.sendUuiUsage(
                  var5,
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("QRoKeaiIP6x0JdyCXWbpp4nLTaybNPTrOi9lQI12utBCSTUjclDVUqWh38clXQ=="),
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("qR6XFdW2vaZZD7y2+VPz5jmcO5+L/3sTTM/P2A==")
               );
               return (Xqedii_144eogi.Xqedii_7syyowo92hgg(-1895847650, 8) != 0);
            }

            if (this.Xqedii_2k1vujp.hasOpenSession(var5) && !this.Xqedii_2k1vujp.isEditorOpen(var5)) {
               this.closeUiForPlayer(var5);
            }

            Location var20 = this.resolveReturnLocationBeforeOpen(var5, (Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 25) != 0));
            boolean var25 = this.Xqedii_2k1vujp.openEditorMenu(var5);
            this.updateReturnLocationAfterOpen(var5, var25, (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 19) != 0), var20);
            if (!var25) {
               this.sendUuiCommandError(
                  var5,
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                     "3550QtrGY0NRVyd9te+DYMO6XLMxCjGudAkuH+tNOjrKSHrlFcyXDLqD2Nwo0WF31bsmTxODs+n7whNgNZw96xFwdYc/n3q8Mw6aX8WTpmVuXVCtsJjVfU3u"
                  ),
                  new Object[Xqedii_144eogi.Xqedii_7syyowo92hgg(-1075181661, 14)]
               );
            }
         } else if (var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(256344020, 31)]
            .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("uPdqf/mp8jCRHPQIdKEtxPRAWZNqogaN10wne3s2ye5GMVLKSy4FCxeFowFvJRDzrL4="))) {
            if (!this.hasCommandPermission(
               var5,
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "o/zuSMG1pGqSFOHfLboM0asBOkhw9+1JAhQZkNtesJilyJnfbkkIh095j+S3M9RaSdE7ho1UrA8AYe0aq5oC6DbWnaKJCgeiVMPFSleW+Ipg45V/7FsbsA=="
               ),
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("Z5iOjq5sdjQrXHjJdm/ne/l+uU7/TkbckVyoAOYsJmVqn7fcwEnahlk0wJyxRESlvnOeHDY2JIdAIqKf")
            )) {
               return (Xqedii_144eogi.Xqedii_21f6ki8nog7xd(176247423, 14) != 0);
            }

            if (var4.length != Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721809977, 8)) {
               this.sendUuiUsage(
                  var5,
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("Z5iOjq5sdjQrXHjJdm/ne/l+uU7/TkbckVyoAOYsJmVqn7fcwEnahlk0wJyxRESlvnOeHDY2JIdAIqKf"),
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("JbpFZyBZeqz2lNK7ja4j0NXKdNRd71e7ArMOivezDdvDaBybpMZISWXF")
               );
               return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 7) != 0);
            }

            double var21;
            try {
               var21 = Double.parseDouble(var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(1201913834, 30)].trim());
            } catch (NumberFormatException var15) {
               String var35 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "zF7XzP3hJJCxFh4YvBK8OYDcW5Y0K0mV9pBhSHLwXbQMLNyeG/NQ/XOxH7ai9adp8oMtZnTDykSg2gFMN8KwgVa/jHS/Bf9g1a2JLp+qsbcM1pgVhsWzEWi2eSaTS2+DFJN6WCN1mFN0IUxf"
               );
               Object[] var44 = new Object[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810237, 2)];
               var44[Xqedii_144eogi.Xqedii_7syyowo92hgg(-737196161, 23)] = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "a3c/yiQrBL4WBZlr3sZsUUdI6H6MjHFe5eknARyRSFKPNg=="
               );
               var44[Xqedii_144eogi.Xqedii_111ehwx07w8i(960063104, 27)] = Xqedii_144eogi.Xqedii_1m52nqoyeel5v("sxYwdWXAAh3YDvk4lfwNynBV7Sz2QLP4bWHD8FFz");
               this.sendUuiCommandError(var5, var35, var44);
               return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 29) != 0);
            }

            if (Double.isNaN(var21)
               || var21 < Double.longBitsToDouble(Xqedii_144eogi.Xqedii_108da41rrda18(2395673956341879869L, 36))
               || var21 > Double.longBitsToDouble(Xqedii_144eogi.Xqedii_3l5k35h8lr49o(-4181755467524685738L, 0))) {
               String var37 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "zF7XzP3hJJCxFh4YvBK8OYDcW5Y0K0mV9pBhSHLwXbQMLNyeG/NQ/XOxH7ai9adp8oMtZnTDykSg2gFMN8KwgVa/jHS/Bf9g1a2JLp+qsbcM1pgVhsWzEWi2eSaTS2+DFJN6WCN1mFN0IUxf"
               );
               Object[] var45 = new Object[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845378, 0)];
               var45[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 17)] = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "a3c/yiQrBL4WBZlr3sZsUUdI6H6MjHFe5eknARyRSFKPNg=="
               );
               var45[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-32177500, 7)] = Xqedii_144eogi.Xqedii_1m52nqoyeel5v("sxYwdWXAAh3YDvk4lfwNynBV7Sz2QLP4bWHD8FFz");
               this.sendUuiCommandError(var5, var37, var45);
               return (Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 29) != 0);
            }

            this.Xqedii_2k1vujp.setPlayerCursorSensitivity(var5, var21);
            String var29 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
               "2+DL5g6UHim7mBa2McgJbLd+LK/Z++fL+2SD1AiXC1ySX5ka6XlzqZhAIaAygKuXQClL2I+5g1n3Xu2xfHiJ3iAeGYMlD+XoRT3JDpBjlaiCdy9OMPJt7A=="
            );
            Object[] var36 = new Object[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 1)];
            var36[Xqedii_144eogi.Xqedii_7syyowo92hgg(256344020, 31)] = var21;
            Xqedii_3ul4hqj.Xqedii_2pfjv2g(var5, var29, var36);
         } else {
            if (var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(503271485, 9)]
               .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("x1nWLFR3iMEjQzjJX3BWSGfP5QMlncENh0movz098/m2NxLVFlivYTGW"))) {
               return this.handleUuiShadersCommand(var5, var4);
            }

            if (var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(-1602601986, 26)]
               .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("SjFzV6HBUjSqWvlgiP1sL72hMOAh37JYXgJZz1fXWuYpBYcVqeLfOw=="))) {
               return this.handleUuiCursorCommand(var5, var4);
            }

            if (var4[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 28)]
               .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("tv2WqMVml3YzQXh8Ck9TIM8qoUBHRuvsy0fjkYcxodEe6ZVgJy4="))) {
               return this.handleUuiWorldCommand(var5, var4);
            }

            if (!var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(-23037381, 18)]
               .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("Y5TWgHZIij+/k1dNIT/lFMFqu0SWE0bddUhj2EUZMCyR1Exl"))) {
               String var38 = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "UfxXXfytcclG9ApNPA01rs6WvTrRJ17F1ozH3uDhWxq+NbTW9Qlr0kS3iyNI8Aa+Bl+sISSGsuW1Gr2RAmllPmjgTXLt1mzYEbYHu4iW+b6W6r6748bpWsKJwGmUqpgPYxpJ9T7qoYzIjp1iK84XbegUCUJoQg=="
               );
               Object[] var46 = new Object[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 20)];
               var46[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 22)] = Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "NegUF+e5x9J2GAGTRsfoZVvukgpUzCzBfwpf8yN4HQZ7bXVQ"
               );
               this.sendUuiCommandError(var5, var38, var46);
               return (Xqedii_144eogi.Xqedii_111ehwx07w8i(825837184, 13) != 0);
            }

            if (!this.hasCommandPermissionSilent(
               var5,
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("JOcKjnP3OsE2rwC4PVqTesYsCqMEbqFaBUmIGMcGWuCgLLmSWNifXN+OTEaDrmew5oXQSegps2gA/ruW2IWP+jmf5Kl7+B/RrQc=")
            )) {
               return (Xqedii_144eogi.Xqedii_21f6ki8nog7xd(176247423, 14) != 0);
            }

            StringBuilder var22 = new StringBuilder();

            for (int var26 = Xqedii_144eogi.Xqedii_21f6ki8nog7xd(354939048, 26); var26 < var4.length; var26++) {
               if (var26 > Xqedii_144eogi.Xqedii_21f6ki8nog7xd(354939048, 26)) {
                  var22.append((char)Xqedii_144eogi.Xqedii_111ehwx07w8i(825845392, 31));
               }

               var22.append(var4[var26]);
            }

            this.Xqedii_2k1vujp.handleEditorTextCommand(var5, var22.toString());
         }

         return (Xqedii_144eogi.Xqedii_7syyowo92hgg(-1535493122, 26) != 0);
      } else {
         Xqedii_3ul4hqj.send(
            var5,
            this.getLangMessage(
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("VTEfe55aXnOjVzq2RdJ7ia02FxETGJT37i9ROMwAnPHeHZ2kP4Td0n8vENF3iKXySZoJCYbr2M9Z6lvT5C34Wwi6FsAhCSQACmk3dKu0"),
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "ztBmlSQrJpl5yc8/deHOHZQJ/3uMy7S6x8Tzti+eLVKzKaA/cvdPPFAV/DOi6TK93/Grd4S2sS/GCsUI/5eF2fXuasnbGCGtPjod/1A7QL8UaEMl2N8IkVrzu/lyN+mdv3OGa8suoONXWsPotwU="
               )
            )
         );
         return (Xqedii_144eogi.Xqedii_7syyowo92hgg(1201913834, 30) != 0);
      }
   }

   public List<String> onTabComplete(CommandSender var1, Command var2, String var3, String[] var4) {
      if ((1630754910 ^ 1630754910) != 0) {
         throw new IllegalStateException();
      } else if (!var2.getName().equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("fJgDaOFE157Hhp8pfVbLGX5IcAXp/LA5r8CWTL1vjTCPSg=="))) {
         return Collections.emptyList();
      } else if (var4.length == Xqedii_144eogi.Xqedii_111ehwx07w8i(825845392, 4)) {
         List var14 = Xqedii_2dpr802.stream().filter(var2x -> {
            if ((-1512551294 ^ -1512551294) != 0) {
               throw new IllegalStateException();
            } else {
               return this.hasCommandPermissionSilent(var1, var2x.getValue());
            }
         }).map(Entry::getKey).toList();
         return this.filterByPrefix(var14, var4[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(143915092, 25)]);
      } else if (var4.length == Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810225, 3)
         && var4[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 11)]
            .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("+87ituwYNeYgzPSGVn24BSf5fKiFDd/u+xDvJ2blLy4hK0Yb5ooGMw=="))
         && this.hasCommandPermissionSilent(
            var1,
            Xqedii_144eogi.Xqedii_1m52nqoyeel5v("9E9RDOFy8950XhiC24IZgHQbTImW7DMya3b3rPxcXa7nrqmSKgReoFwvHs4JyOZX9Ml5V6I1Zb9RpzRz8dr0+gxgMshfgc9q6nFlZMP7")
         )) {
         return this.filterByPrefix(Xqedii_luybuh9, var4[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(2131394898, 6)]);
      } else if (var4.length == Xqedii_144eogi.Xqedii_7syyowo92hgg(-90052369, 20)
         && var4[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-1992325824, 29)]
            .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("nE4TSbcPjj6rf2eh0sMZUmp6EqiT3HmVPiSxcs21y72uNQU5VIJICJ2H"))
         && this.hasCommandPermissionSilent(
            var1,
            Xqedii_144eogi.Xqedii_1m52nqoyeel5v("9E9RDOFy8950XhiC24IZgHQbTImW7DMya3b3rPxcXa7nrqmSKgReoFwvHs4JyOZX9Ml5V6I1Zb9RpzRz8dr0+gxgMshfgc9q6nFlZMP7")
         )) {
         return this.filterByPrefix(
            List.of(
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("DwTObgrKtqu/UMe7NeH8CriqyjunBWmvNL6WrSOjfUuyousfjTU="),
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("/gzwPEmCOsyPf9dD0d5G+Q1N8jNMbJ9ZWvPy5NrzsWXlSiGSsWo="),
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v("3ftcDRDNNzBX+O26zMoCQc4vP+4AaxI2r4gQFQ5N2m8IY5X+8aCIpA==")
            ),
            var4[Xqedii_144eogi.Xqedii_111ehwx07w8i(825847424, 11)]
         );
      } else {
         if (var4.length == Xqedii_144eogi.Xqedii_21f6ki8nog7xd(211023956, 25)) {
            String var5 = Xqedii_1fxcb09.get(var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(256344020, 31)].toLowerCase(Locale.ROOT));
            if (var5 != null && this.hasCommandPermissionSilent(var1, var5)) {
               return this.Xqedii_2k1vujp == null
                  ? Collections.emptyList()
                  : this.filterByPrefix(this.Xqedii_2k1vujp.getGuiNames(), var4[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(1409979384, 17)]);
            }
         }

         if (var4.length == Xqedii_144eogi.Xqedii_7syyowo92hgg(2144669511, 15)
            && var4[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 6)]
               .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("uPdqf/mp8jCRHPQIdKEtxPRAWZNqogaN10wne3s2ye5GMVLKSy4FCxeFowFvJRDzrL4="))
            && this.hasCommandPermissionSilent(
               var1,
               Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                  "o/zuSMG1pGqSFOHfLboM0asBOkhw9+1JAhQZkNtesJilyJnfbkkIh095j+S3M9RaSdE7ho1UrA8AYe0aq5oC6DbWnaKJCgeiVMPFSleW+Ipg45V/7FsbsA=="
               )
            )) {
            return this.filterByPrefix(
               List.of(
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("6CQOOoEX/29zG3eFQR4OYzfIq7bFdIzHnKZs0jYgzAulFw=="),
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("Wt0k1RjT36ATS/XRVo17O5VDegJzcF0N47H67h4o"),
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("L8ARLN9DINqlD2fgthY50ds7xYmWrdDfodGZnwlVs4t2gA=="),
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("AvlKl3igI03UH5gzqa7abgb6BDI4YiM/TD2DxZx9"),
                  Xqedii_144eogi.Xqedii_1m52nqoyeel5v("4j8x5j08CPOTRNO1Fm3U1J06e0KAthcZRGP/fdgK")
               ),
               var4[Xqedii_144eogi.Xqedii_111ehwx07w8i(1899587200, 30)]
            );
         } else {
            Xqedii_16ud823 var13 = var4[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 22)]
                  .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("x1nWLFR3iMEjQzjJX3BWSGfP5QMlncENh0movz098/m2NxLVFlivYTGW"))
               ? Xqedii_16ud823.SHADERS
               : (
                  var4[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 17)]
                        .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("SjFzV6HBUjSqWvlgiP1sL72hMOAh37JYXgJZz1fXWuYpBYcVqeLfOw=="))
                     ? Xqedii_16ud823.CURSOR
                     : null
               );
            if (var13 == null
               || !this.hasCommandPermissionSilent(var1, var13.permission)
               || var4.length != Xqedii_144eogi.Xqedii_111ehwx07w8i(825844864, 8) && var4.length != Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721548089, 17)) {
               if (var4[Xqedii_144eogi.Xqedii_7syyowo92hgg(2050752160, 2)]
                     .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("tv2WqMVml3YzQXh8Ck9TIM8qoUBHRuvsy0fjkYcxodEe6ZVgJy4="))
                  && this.hasCommandPermissionSilent(
                     var1,
                     Xqedii_144eogi.Xqedii_1m52nqoyeel5v(
                        "e4fbD5yqgBwxdE9jSwHE888ntnLxsUpw6PJDT34tVAvbMSEOyJVGJ5LSF3957B9FI4SUkUE5h0+rBKPJZoQgwQ1QAV8V3ZCPomJYnA=="
                     )
                  )) {
                  return this.completeUuiWorldCommand(var4);
               } else if (var4[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 21)]
                     .equalsIgnoreCase(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("aL/52fd/b2mPiHXYhKYcfpg8NVjAbokogzTRHZEGkTByYGEv"))
                  && this.hasCommandPermissionSilent(
                     var1,
                     Xqedii_144eogi.Xqedii_1m52nqoyeel5v("HVoQWb5cazWnuyTbUBArGdgC0Hhp+eeJ+GUKFj48k7GlkrXgUAbadyE/ovlUojLI8DiaRPiR01/DcUPsXy4KiaYo4znPA77xIXo=")
                  )
                  && var4.length >= Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-381713088, 29)
                  && var4.length <= Xqedii_144eogi.Xqedii_qgzmegn7nf5p(587592505, 25)) {
                  int var15 = Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 27);
                  int var16 = Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 14);
                  int var17 = Xqedii_144eogi.Xqedii_7syyowo92hgg(-386925951, 4);

                  for (int var18 = Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810217, 4);
                     var18 < var4.length - Xqedii_144eogi.Xqedii_7syyowo92hgg(-5693810, 16);
                     var18++
                  ) {
                     String[] var22 = new String[Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-1812442102, 1)];
                     var22[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 19)] = var4[var18];
                     String var10 = this.firstNonBlank(var22).trim();
                     if (!var10.isBlank()) {
                        String var11 = var10.toLowerCase(Locale.ROOT);
                        if (var11.equals(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("2fyI2/L2uBb5jmb/Pc4c6z3HFVJn2VT848pIvSR7hTq0BQ=="))) {
                           var15 = Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-1526852350, 31);
                        } else if (var11.equals(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("EDbReyk+WE5Z+0pgDK4u2yVD7g+MjseaFk94SAll8/wZfnn8L1Qn68E/C+mx8w=="))) {
                           var16 = Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-1526852350, 31);
                        } else if (this.findOnlinePlayerByName(var10) != null) {
                           var17 = Xqedii_144eogi.Xqedii_21f6ki8nog7xd(-257419993, 10);
                        }
                     }
                  }

                  ArrayList var19 = new ArrayList();
                  if (var15 == 0) {
                     var19.add(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("2fyI2/L2uBb5jmb/Pc4c6z3HFVJn2VT848pIvSR7hTq0BQ=="));
                  }

                  if (var16 == 0) {
                     var19.add(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("EDbReyk+WE5Z+0pgDK4u2yVD7g+MjseaFk94SAll8/wZfnn8L1Qn68E/C+mx8w=="));
                  }

                  if (var17 == 0) {
                     for (Player var21 : Bukkit.getOnlinePlayers()) {
                        if (var21 != null) {
                           String[] var23 = new String[Xqedii_144eogi.Xqedii_7syyowo92hgg(-1457615105, 24)];
                           var23[Xqedii_144eogi.Xqedii_111ehwx07w8i(825845376, 21)] = var21.getName();
                           String var12 = this.firstNonBlank(var23).trim();
                           if (!var12.isBlank()) {
                              var19.add(var12);
                           }
                        }
                     }
                  }

                  return this.filterByPrefix(var19, var4[var4.length - Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 14)]);
               } else {
                  return Collections.emptyList();
               }
            } else {
               ArrayList var6 = new ArrayList();
               if (var4.length == Xqedii_144eogi.Xqedii_7syyowo92hgg(-1578569734, 28)) {
                  var6.add(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("ZD/wcFNNGJKNGqOvl1M9jr5wscQkCJTJMj2nXVg7JZg="));
                  var6.add(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("gR4ikBgGOW2ldEmRmjw2HzMHvrgmlkBMO1wvJzpp0AgLCQ=="));
                  var6.add(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("nkYI3xeb4i2JNgHAU8IyZu0cwqk0G11pIkrE1AwG8fPHmEvivt0kjQ=="));
                  var6.add(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("7XgJYOFvVDH/ahHK66KGZYIJqYzSsMgVKRx+ztS31GS2BNGHcFQ="));
                  var6.add(Xqedii_144eogi.Xqedii_1m52nqoyeel5v("3ftcDRDNNzBX+O26zMoCQc4vP+4AaxI2r4gQFQ5N2m8IY5X+8aCIpA=="));
               }

               if (this.hasCommandPermissionSilent(var1, var13.othersPermission)) {
                  for (Player var8 : Bukkit.getOnlinePlayers()) {
                     if (var8 != null) {
                        String[] var10001 = new String[Xqedii_144eogi.Xqedii_7syyowo92hgg(-45550473, 19)];
                        var10001[Xqedii_144eogi.Xqedii_qgzmegn7nf5p(-721810234, 7)] = var8.getName();
                        String var9 = this.firstNonBlank(var10001).trim();
                        if (!var9.isBlank()) {
                           var6.add(var9);
                        }
                     }
                  }
               }

               return this.filterByPrefix(var6, var4[var4.length - Xqedii_144eogi.Xqedii_qgzmegn7nf5p(721810233, 9)]);
            }
         }
      }
   }

   static {
      if ((-206409476 * -206409476 + -206409476 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_luybuh9 = List.of(
            Xqedii_144eogi.Xqedii_1m52nqoyeel5v("gs68G97hCw7LYjdCWRMctX7vJ/Bh8WlVPlwZmqioUMn9gg=="),
            Xqedii_144eogi.Xqedii_1m52nqoyeel5v("kiaxIraitxXQwrdOLLqStnwC91aQKL6Ejx4ohJoLdu+VuE0mAiwbeA=="),
            Xqedii_144eogi.Xqedii_1m52nqoyeel5v("b//FrIecnmYNQ9oQ35Hly9rnRs8o8OiE1z3NSSXPtSA9oFoV"),
            Xqedii_144eogi.Xqedii_1m52nqoyeel5v("/gzwPEmCOsyPf9dD0d5G+Q1N8jNMbJ9ZWvPy5NrzsWXlSiGSsWo=")
         );
      }
   }

   private static /* synthetic */ String Xqedii_3qaz0gljyg3p3(String string) {
        return Xqedii_144eogi.Xqedii_1m52nqoyeel5v("73u9XsuFG9BGbDunV0svW9oHGRyhiYaPMjX5VrraxKq+O1JS7A1p85hlqUVklB1T1M8=") + string + Xqedii_144eogi.Xqedii_1m52nqoyeel5v("rdoaKDLuFZsoFuHhcX23bPSSUEdBrM5bpaOt19aS7c4cNviUEZlULtbPj0wWoKqMe5ERr/LoCYWGyvDZim65hislNQ5+fPdZhyHRPsc4usublNUW/kY5S+fb8kdv7wbQ1MKCR5AerfajMdZ2WNsKk6ii1AuJqNwXfG6U0PoniNTa4ygN9aaaiqc/5rJMxuigQuYq3OtSvneFftf25IMQYLJW");
    }

    private static /* synthetic */ String Xqedii_2idxgs0nwv405(String string) {
        return Xqedii_144eogi.Xqedii_1m52nqoyeel5v("JeuF4sGHRXHztO5ovy9kenA0qGME4q8wr/3ynMeSyELIT2ke6vvfVy762WHqNSwgCI8qvfqTm5tGHQGnubOm2Q/V1XRe/+WdsIlVcSnmlVMa1eBb1e40LDiWWYg78eV6kewa1REr75xGj0AYwBCKCg==") + string;
    }

    private static /* synthetic */ String Xqedii_1vkyerbk1rqvc(String string) {
        return Xqedii_144eogi.Xqedii_1m52nqoyeel5v("LoInVHHilni6IKSD3qI4QKtoxUXfL5xPPQvO+4apnF4rJaG//UXHH0cVmurb6Z57SWgVaQBcSRxT3WywYW8nd+qsvn6lRUIxTBrGELxjyFv1TbpthueDAjX2Qxd2B8A9jqgKawG4FGuElXYyRGxxbB09GdJkQufRHGvCjV1BuSR0mnrfU1KmB+vChGhkbuTkvmoYSQvfCCnuBHnJfb/Bnc4635LwjL070l+DCbS/G1B4L0SS") + string;
    }

    private static /* synthetic */ String Xqedii_c3hg0t2xpkxt(long l, long l2) {
        return l + Xqedii_144eogi.Xqedii_1m52nqoyeel5v("oPeWnPoZ6rG4vXFYRNukb7gRJQDtO5qqLh1eV1uF") + l2;
    }

    private static /* synthetic */ String Xqedii_3tvu4ro8z2mdg(String string) {
        return Xqedii_144eogi.Xqedii_1m52nqoyeel5v("HcghgC0j0E7WB6TtxXJvIF7fTcxTcZpal7hhdx4xnrWfErZB2cf9XVJkJdrDAjEaKCYIRBiJ6rY0wn+nY6IAB1r+vvy428u9aR2bthuOxrcqaAWmpeshHXkv9YNhA+U1pBxzjmYSRUUnKA==") + string;
    }

    private static /* synthetic */ String Xqedii_2qq9jl4jy5l69(String string) {
        return Xqedii_144eogi.Xqedii_1m52nqoyeel5v("9UXA/ou6erEyso3D0BcAVv47Lqo5DJ4lXylarIxOkjZL1x+FVZAmG9xwY2zOYKCUGy4sez3m6U0W4pTymzAm/F89x3hTi10WAytBBDuLsTRxUamW") + string;
    }

    private static /* synthetic */ String Xqedii_2vpb0tk3l0yks(String string) {
        return Xqedii_144eogi.Xqedii_1m52nqoyeel5v("Z8/rDdPMWVEHEZoall3W20CjC218MhSu/aox6nfckZMnCqI6VKWQ5l/NtT+TKrpiUOSRqYncaCtjMGLqy5mKt2Z8UCgrcGBcH6DeokgXOYPp5P5KDqsDuLYk9QPEmGPk1eBk+Rt3BTJt6yFNgf29jQ==") + string;
    }

    private static /* synthetic */ String Xqedii_3amq7q0h5icj6(int n) {
        return Xqedii_144eogi.Xqedii_1m52nqoyeel5v("gXJbVkRbJU0tR4aLyI51vRkgqd66EAepgXfdt41Xlpcyrm+s5qzNXib283BIlGUoKv9oMPCmeppSev1nRtqaLsr6ufeO6N1Ebu0pOM1g3prquUGlKgLTpI5gDzd5R8kZelGuIO7e8nt/mku84TGQWwsAe86ygkjUy+rhYaSTLLwVOYMtvYvgmyZHUYnZfQ==") + n + Xqedii_144eogi.Xqedii_1m52nqoyeel5v("TLIBEKpQkBG0WDCqHxPZQ5+gYjLSrek98P1kZ96nPMibbhlaJIUggDQF1FbfM8n415aZyYxbBPzqwB1jDIphLlRDV8r/UA0GIOiVEpTd9M5iEg0B47jAeJB0ySiBOw==");
    }
}
