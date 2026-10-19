package dev.xqedii.ultimateUI.service.camera;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_2d599cp;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.service.hud.HudService;
import dev.xqedii.ultimateUI.service.npc.CursorNpcService;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.PacketEvents;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketListenerAbstract;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketListenerPriority;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketSendEvent;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.item.ItemStack;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.packettype.PacketType.Play.Server;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerSetPlayerInventory;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerSetSlot;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerWindowItems;
import java.util.ArrayList;
import java.util.UUID;
import org.bukkit.entity.Player;

public abstract class AnvilScreenMask extends ShaderCursor {
   public static final String Xqedii_20920kwmgt2ac = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final long Xqedii_1w0v0ib = 1L;
   public static final int Xqedii_g70cuz9 = 9;
   public static final int Xqedii_34pzo6s = 0;
   public static final int Xqedii_2b86kp6 = 36;
   public static final int Xqedii_3s57o80 = 45;
   public static final int Xqedii_77g4wix = 3;
   public static final int Xqedii_1hfr70t = 40;

   public AnvilScreenMask(UltimateUI var1, HudService var2, CursorNpcService var3) {
      super(var1, var2, var3);
   }

   public boolean isAnvilScreenMasked(Player var1) {
      if ((-124116133 * -124116133 - -124116133 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && Xqedii_7ws8hzn.contains(var1.getUniqueId())
            ? Xqedii_2d599cp.Xqedii_16lhpip1tfbwh(1998520818, 1)
            : Xqedii_2d599cp.Xqedii_2x68se48kfla1(1565885590, 26)) != 0);
      }
   }

   public void holdAnvilScreenMask(Player var1) {
      if (((238322343 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         UUID var2 = var1.getUniqueId();
         int var3 = !Xqedii_7ws8hzn.add(var2) ? Xqedii_2d599cp.Xqedii_gwanfa4wtcsv(1773802705, 28) : Xqedii_2d599cp.Xqedii_16lhpip1tfbwh(-260628735, 25);
         this.Xqedii_1z7gs2c(var1);
         if (var3 == 0) {
            Xqedii_38o2zes.Xqedii_j3mggbv(
               this.Xqedii_11is6fi,
               var1,
               Xqedii_2d599cp.Xqedii_wn4sxwkr6ejo(7607451638699624069L, 48),
               Xqedii_2d599cp.Xqedii_wn4sxwkr6ejo(7607451638699624069L, 51),
               var3x -> {
                  if (((-1920755622 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else if (var1.isOnline() && Xqedii_7ws8hzn.contains(var2)) {
                     this.Xqedii_1z7gs2c(var1);
                  } else {
                     if (!var1.isOnline()) {
                        Xqedii_7ws8hzn.remove(var2);
                     }

                     var3x.cancel();
                  }
               }
            );
         }
      }
   }

   public void releaseAnvilScreenMask(Player var1) {
      if ((-1631407696 * (-1631407696 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && Xqedii_7ws8hzn.remove(var1.getUniqueId()) && var1.isOnline()) {
         if (this.Xqedii_3hs42n4.containsKey(var1.getUniqueId())) {
            this.Xqedii_3siyzd1(var1);
         } else {
            this.Xqedii_3ut80ql(var1, var1.getWorld().getGameTime());
         }
      }
   }

   public void Xqedii_1z7gs2c(Player var1) {
      if ((836112668 * (836112668 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3ut80ql(var1, this.Xqedii_1gl4f7n(var1));
      }
   }

   @Override
   public void Xqedii_pstua9f() {
      if ((-625047024 ^ -625047024) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_3oyorda == null) {
         this.Xqedii_3oyorda = new PacketListenerAbstract(PacketListenerPriority.HIGHEST) {
            public static final String Xqedii_2aqrykfl7i7dt = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

            public void onPacketSend(PacketSendEvent var1) {
               if (((-2135245163 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else if (var1 != null && var1.getPlayer() instanceof Player var2 && CameraBase.Xqedii_7ws8hzn.contains(var2.getUniqueId())) {
                  AnvilScreenMask.this.Xqedii_pqsflim(var1);
               }
            }
         };

         try {
            PacketEvents.getAPI().getEventManager().registerListener(this.Xqedii_3oyorda);
         } catch (Throwable var2) {
            this.Xqedii_3oyorda = null;
            this.Xqedii_11is6fi.getLogger().warning(Xqedii_16ux8mg9u8vmh(String.valueOf(var2)));
         }
      }
   }

   @Override
   public void Xqedii_3t21d04() {
      if ((-1341524227 * -1341524227 - -1341524227 & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_3oyorda != null) {
         try {
            PacketEvents.getAPI().getEventManager().unregisterListener(this.Xqedii_3oyorda);
         } catch (Throwable var2) {
         }

         this.Xqedii_3oyorda = null;
      }
   }

   public void Xqedii_pqsflim(PacketSendEvent var1) {
      if (((935957532 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1.getPacketType() == Server.WINDOW_ITEMS) {
         WrapperPlayServerWindowItems var9 = new WrapperPlayServerWindowItems(var1);
         ArrayList var11 = new ArrayList(var9.getItems());
         int var12 = var9.getWindowId();
         int var5 = var12 == 0 ? Xqedii_2d599cp.Xqedii_3bhbmpd3nxh0s(265123145, 24) : Xqedii_2d599cp.Xqedii_3bhbmpd3nxh0s(466449737, 28);
         int var6 = var12 == 0 ? Xqedii_2d599cp.Xqedii_2x68se48kfla1(-500518766, 23) : var11.size();

         for (int var7 = var5; var7 < Math.min(var11.size(), var6); var7++) {
            var11.set(var7, ItemStack.EMPTY);
         }

         if (var12 == 0 && var11.size() > Xqedii_2d599cp.Xqedii_3bhbmpd3nxh0s(734885785, 4)) {
            var11.set(Xqedii_2d599cp.Xqedii_2x68se48kfla1(1163268700, 28), ItemStack.EMPTY);
         }

         var9.setItems(var11);
         var1.markForReEncode((Xqedii_2d599cp.Xqedii_3bhbmpd3nxh0s(734917961, 15) != 0));
      } else if (var1.getPacketType() == Server.SET_SLOT) {
         WrapperPlayServerSetSlot var8 = new WrapperPlayServerSetSlot(var1);
         int var10 = var8.getSlot();
         int var4 = var8.getWindowId() == 0
            ? (
               var10 >= Xqedii_2d599cp.Xqedii_16lhpip1tfbwh(-1887380421, 8) && var10 <= Xqedii_2d599cp.Xqedii_16lhpip1tfbwh(999260373, 0)
                  ? Xqedii_2d599cp.Xqedii_2x68se48kfla1(1261480642, 17)
                  : Xqedii_2d599cp.Xqedii_2x68se48kfla1(153926315, 11)
            )
            : (
               var8.getWindowId() > 0 && var10 >= Xqedii_2d599cp.Xqedii_16lhpip1tfbwh(-823926722, 30)
                  ? Xqedii_2d599cp.Xqedii_3bhbmpd3nxh0s(734819657, 16)
                  : Xqedii_2d599cp.Xqedii_3bhbmpd3nxh0s(734885193, 0)
            );
         if (var4 != 0) {
            var8.setItem(ItemStack.EMPTY);
            var1.markForReEncode((Xqedii_2d599cp.Xqedii_2x68se48kfla1(1231426904, 14) != 0));
         }
      } else {
         if (var1.getPacketType() == Server.SET_PLAYER_INVENTORY) {
            WrapperPlayServerSetPlayerInventory var2 = new WrapperPlayServerSetPlayerInventory(var1);
            int var3 = var2.getSlot();
            if (var3 < Xqedii_2d599cp.Xqedii_3bhbmpd3nxh0s(583890249, 24) || var3 == Xqedii_2d599cp.Xqedii_gwanfa4wtcsv(1771902161, 16)) {
               var2.setStack(ItemStack.EMPTY);
               var1.markForReEncode((Xqedii_2d599cp.Xqedii_16lhpip1tfbwh(520221303, 9) != 0));
            }
         }
      }
   }

   private static /* synthetic */ String Xqedii_16ux8mg9u8vmh(String string) {
        return Xqedii_2d599cp.Xqedii_38xvp7gnyuv04("Dh2DNqWn7ICipyA3xiDRHkn/KerAnJenDQhv/2736w8k58b+BqzztRFiTrshJh3Q9wvsXhpU8xZhjKI2G9wcoK3YyLKlvjpWRZ8ye6t1/80ciAWX6Uf/joHC3mamKwR8GLmG/OsNtyoqcXT1K1Hi2ldYv3vCtx5s+aHMbS4jHPA32qwUgUbLZMKA6yKxvvWzcPGfYo/EQFpKARMTDz95wLxe/FA=") + string + Xqedii_2d599cp.Xqedii_38xvp7gnyuv04("yXJSPk//wKT94dbj3ocoda10PMZFPGOEaKYVSZVa");
    }
}
