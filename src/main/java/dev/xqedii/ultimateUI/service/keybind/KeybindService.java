package dev.xqedii.ultimateUI.service.keybind;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_19cbo7i;
import dev.xqedii.ultimateUI.Xqedii_2xt5y22;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.service.gui.GuiService;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.PacketEvents;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketListenerAbstract;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketListenerCommon;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketListenerPriority;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketReceiveEvent;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.packettype.PacketTypeCommon;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.packettype.PacketType.Play.Client;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.player.DiggingAction;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.client.WrapperPlayClientPlayerDigging;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.client.WrapperPlayClientPlayerInput;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.client.WrapperPlayClientSteerVehicle;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerCloseWindow;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import org.bukkit.entity.Player;

public final class KeybindService {
   public static final String Xqedii_1s4179qor4qoi = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final long Xqedii_gfnheuq = 50000000L;
   public final UltimateUI Xqedii_2u63hku;
   public final GuiService Xqedii_35grhll;
   public final Map<UUID, Xqedii_19cbo7i> Xqedii_19rx4yc = new ConcurrentHashMap<>();
   public final Set<UUID> Xqedii_ri5uyx6 = ConcurrentHashMap.newKeySet();
   public final Set<UUID> Xqedii_2fsvtwe = ConcurrentHashMap.newKeySet();
   public final Map<UUID, Set<String>> Xqedii_34npo6y = new ConcurrentHashMap<>();
   public final Map<String, Long> Xqedii_2m06rqn = new ConcurrentHashMap<>();
   public final Set<UUID> Xqedii_3hifpf3 = ConcurrentHashMap.newKeySet();
   public final Set<UUID> Xqedii_2pznq39 = ConcurrentHashMap.newKeySet();
   public PacketListenerCommon Xqedii_2sgtfkn;

   public KeybindService(UltimateUI var1, GuiService var2) {
      this.Xqedii_2u63hku = var1;
      this.Xqedii_35grhll = var2;
   }

   public void enable() {
      if ((115454181 ^ 115454181) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_2sgtfkn == null) {
         this.Xqedii_2sgtfkn = new PacketListenerAbstract(PacketListenerPriority.MONITOR) {
            public static final String Xqedii_2b5dsbj864l6n = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

            public void onPacketReceive(PacketReceiveEvent var1) {
               if ((882397572 * 882397572 + 882397572 & 1) != 0) {
                  throw new IllegalStateException();
               } else if (var1 != null && var1.getPlayer() instanceof Player var2) {
                  try {
                     KeybindService.this.Xqedii_16a4j29(var1, var2);
                  } catch (Throwable var4) {
                  }
               }
            }
         };

         try {
            PacketEvents.getAPI().getEventManager().registerListener(this.Xqedii_2sgtfkn);
         } catch (Throwable var2) {
            this.Xqedii_2sgtfkn = null;
            this.Xqedii_2u63hku.getLogger().warning(Xqedii_1sadtwm3iwiw4(var2.getMessage()));
         }
      }
   }

   public void disable() {
      if ((1992542185 * 1992542185 - 1992542185 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (this.Xqedii_2sgtfkn != null) {
            try {
               PacketEvents.getAPI().getEventManager().unregisterListener(this.Xqedii_2sgtfkn);
            } catch (Throwable var2) {
            }

            this.Xqedii_2sgtfkn = null;
         }

         this.Xqedii_19rx4yc.clear();
         this.Xqedii_ri5uyx6.clear();
         this.Xqedii_2fsvtwe.clear();
         this.Xqedii_34npo6y.clear();
         this.Xqedii_3hifpf3.clear();
         this.Xqedii_2pznq39.clear();
         this.Xqedii_2m06rqn.clear();
      }
   }

   public void forgetPlayer(Player var1) {
      if (((-699955900 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         UUID var2 = var1.getUniqueId();
         this.Xqedii_19rx4yc.remove(var2);
         this.Xqedii_ri5uyx6.remove(var2);
         this.Xqedii_2fsvtwe.remove(var2);
         this.Xqedii_34npo6y.remove(var2);
         this.Xqedii_3hifpf3.remove(var2);
         this.Xqedii_2pznq39.remove(var2);
         this.Xqedii_2m06rqn.keySet().removeIf(var1x -> {
            if (((-359390947 << 1 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               return var1x.startsWith(Xqedii_7gtgze42fcyo(String.valueOf(var2)));
            }
         });
      }
   }

   public void setKeybindsActive(Player var1, boolean var2, boolean var3, Collection<String> var4) {
      if ((-651217915 * -651217915 + -651217915 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         UUID var5 = var1.getUniqueId();
         if (!var2) {
            this.Xqedii_ri5uyx6.remove(var5);
            this.Xqedii_2fsvtwe.remove(var5);
            this.Xqedii_34npo6y.remove(var5);
         } else {
            if (var3) {
               this.Xqedii_2fsvtwe.add(var5);
            } else {
               this.Xqedii_2fsvtwe.remove(var5);
            }

            KeySetView var6 = ConcurrentHashMap.newKeySet();
            if (var4 != null) {
               for (String var8 : var4) {
                  if (var8 != null && !var8.isBlank()) {
                     var6.add(var8);
                  }
               }
            }

            this.Xqedii_34npo6y.put(var5, var6);
            this.Xqedii_ri5uyx6.add(var5);
         }
      }
   }

   public boolean Xqedii_3u6kz4l(Player var1, String var2) {
      if ((187320078 * 187320078 + 187320078 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         UUID var3 = var1.getUniqueId();
         if (this.Xqedii_2fsvtwe.contains(var3)) {
            return (Xqedii_2xt5y22.Xqedii_15bnrz8b9kjrj(-1832695477, 6) != 0);
         } else {
            Set var4 = this.Xqedii_34npo6y.get(var3);
            return ((var4 != null && var4.contains(var2)
               ? Xqedii_2xt5y22.Xqedii_3hoxyroqt8ca7(995881620, 28)
               : Xqedii_2xt5y22.Xqedii_xx9ohhklfrqy(-932829093, 21)) != 0);
         }
      }
   }

   public String resolveKeyId(Player var1, String var2) {
      if ((-2129530934 * -2129530934 - -2129530934 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         return this.isShiftHeld(var1) ? Xqedii_1tu5s8w6c0lj0(var2) : var2;
      } else {
         return Xqedii_2xt5y22.Xqedii_2t3y3j1v1xzn6("bJc34LErWJPDNfzM4+iQTkOhymazI/yEjeGWEw==");
      }
   }

   public void Xqedii_16a4j29(PacketReceiveEvent var1, Player var2) {
      if ((-1728930424 * (-1728930424 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         PacketTypeCommon var3 = var1.getPacketType();
         if (var3 == Client.PLAYER_INPUT) {
            WrapperPlayClientPlayerInput var9 = new WrapperPlayClientPlayerInput(var1);
            this.Xqedii_743fhbi(var2, var9.isForward(), var9.isBackward(), var9.isLeft(), var9.isRight(), var9.isShift());
         } else if (var3 == Client.STEER_VEHICLE) {
            WrapperPlayClientSteerVehicle var8 = new WrapperPlayClientSteerVehicle(var1);
            float var5 = var8.getForward();
            float var6 = var8.getSideways();
            this.Xqedii_743fhbi(
               var2,
               ((var5 > Float.intBitsToFloat(Xqedii_2xt5y22.Xqedii_3hoxyroqt8ca7(727446164, 16))
                  ? Xqedii_2xt5y22.Xqedii_2uqoh0k8iet6p(-1993294106, 22)
                  : Xqedii_2xt5y22.Xqedii_xx9ohhklfrqy(-566021822, 16)) != 0),
               ((var5 < Float.intBitsToFloat(Xqedii_2xt5y22.Xqedii_3hoxyroqt8ca7(727446164, 12))
                  ? Xqedii_2xt5y22.Xqedii_xx9ohhklfrqy(-1861463881, 22)
                  : Xqedii_2xt5y22.Xqedii_xx9ohhklfrqy(-1734250719, 31)) != 0),
               ((var6 > Float.intBitsToFloat(Xqedii_2xt5y22.Xqedii_2uqoh0k8iet6p(-1571016775, 20))
                  ? Xqedii_2xt5y22.Xqedii_2uqoh0k8iet6p(1278196130, 28)
                  : Xqedii_2xt5y22.Xqedii_xx9ohhklfrqy(-2040363588, 25)) != 0),
               ((var6 < Float.intBitsToFloat(Xqedii_2xt5y22.Xqedii_3hoxyroqt8ca7(727446164, 14))
                  ? Xqedii_2xt5y22.Xqedii_2uqoh0k8iet6p(-147568251, 9)
                  : Xqedii_2xt5y22.Xqedii_3hoxyroqt8ca7(727446164, 29)) != 0),
               var8.isUnmount()
            );
         } else if (var3 == Client.PLAYER_DIGGING) {
            if (this.Xqedii_ri5uyx6.contains(var2.getUniqueId())) {
               if (new WrapperPlayClientPlayerDigging(var1).getAction() == DiggingAction.DROP_ITEM) {
                  String var7 = this.resolveKeyId(var2, Xqedii_2xt5y22.Xqedii_2t3y3j1v1xzn6("jLWdkVhgRLTDoTHohIj1MlN36Y3j/F8GBKGgMKsh"));
                  if (this.Xqedii_3u6kz4l(var2, var7)) {
                     var1.setCancelled((Xqedii_2xt5y22.Xqedii_xx9ohhklfrqy(677103750, 5) != 0));
                     this.Xqedii_3hifpf3.add(var2.getUniqueId());
                     this.Xqedii_egshnr7(var2);
                     this.Xqedii_2jdxzf9(var2, var7);
                  }
               }
            }
         } else if (var3 == Client.ANIMATION) {
            if (this.Xqedii_3hifpf3.contains(var2.getUniqueId())) {
               var1.setCancelled((Xqedii_2xt5y22.Xqedii_2uqoh0k8iet6p(1754467310, 18) != 0));
            }
         } else {
            if (var3 == Client.ADVANCEMENT_TAB) {
               if (!this.Xqedii_ri5uyx6.contains(var2.getUniqueId())) {
                  return;
               }

               String var4 = this.resolveKeyId(var2, Xqedii_2xt5y22.Xqedii_2t3y3j1v1xzn6("xllI9NWqLnahwh8q5kzLsEuInCCgqFCBi5IdMFdS"));
               if (!this.Xqedii_3u6kz4l(var2, var4)) {
                  return;
               }

               var1.setCancelled((Xqedii_2xt5y22.Xqedii_15bnrz8b9kjrj(-1832695477, 8) != 0));
               this.Xqedii_36hjjo9(var2);
               if (Xqedii_2xt5y22.Xqedii_2t3y3j1v1xzn6("8b5LUXfrzp5VmrcB7IjLhkgj1JF1vGl+4QL3nAyv9XiYyl3xMf9Fig28").equals(var4)) {
                  this.Xqedii_2pznq39.add(var2.getUniqueId());
               } else if (this.Xqedii_2pznq39.remove(var2.getUniqueId())) {
                  return;
               }

               this.Xqedii_2jdxzf9(var2, var4);
            }
         }
      }
   }

   public void Xqedii_egshnr7(Player var1) {
      if ((-1477656633 ^ -1477656633) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_38o2zes.Xqedii_1avvt9e(this.Xqedii_2u63hku, var1, () -> {
            if ((1890099282 * 1890099282 - 1890099282 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               if (var1.isOnline()) {
                  int var2 = var1.getInventory().getHeldItemSlot();
                  var1.getInventory().setItem(var2, var1.getInventory().getItem(var2));
               }

               Xqedii_38o2zes.Xqedii_2sj63w1(this.Xqedii_2u63hku, var1, () -> {
                  if ((1945938070 * (1945938070 + 1) & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     this.Xqedii_3hifpf3.remove(var1.getUniqueId());
                  }
               }, Xqedii_2xt5y22.Xqedii_2cltunie61x95(6221434910937351104L, 8));
            }
         });
      }
   }

   public void Xqedii_36hjjo9(Player var1) {
      if ((153964150 ^ 153964150) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            PacketEvents.getAPI().getPlayerManager().sendPacket(var1, new WrapperPlayServerCloseWindow(Xqedii_2xt5y22.Xqedii_xx9ohhklfrqy(856960484, 28)));
         } catch (Throwable var3) {
         }
      }
   }

   public void Xqedii_743fhbi(Player var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      if ((-771389261 ^ -771389261) != 0) {
         throw new IllegalStateException();
      } else {
         UUID var7 = var1.getUniqueId();
         if (!this.Xqedii_ri5uyx6.contains(var7)) {
            this.Xqedii_19rx4yc.remove(var7);
         } else {
            Xqedii_19cbo7i var8 = this.Xqedii_19rx4yc.computeIfAbsent(var7, var0 -> {
               if ((-1953686634 * (-1953686634 + 1) & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  return new Xqedii_19cbo7i();
               }
            });
            var8.Xqedii_uae5q9i = var6;
            int var9 = var2 && !var8.Xqedii_k8gd3gf ? Xqedii_2xt5y22.Xqedii_xx9ohhklfrqy(206616465, 30) : Xqedii_2xt5y22.Xqedii_3hoxyroqt8ca7(727446164, 9);
            int var10 = var3 && !var8.Xqedii_1336ro3
               ? Xqedii_2xt5y22.Xqedii_15bnrz8b9kjrj(-1832695477, 9)
               : Xqedii_2xt5y22.Xqedii_15bnrz8b9kjrj(1832695476, 20);
            int var11 = var4 && !var8.Xqedii_j1bf00j ? Xqedii_2xt5y22.Xqedii_3hoxyroqt8ca7(727446036, 7) : Xqedii_2xt5y22.Xqedii_3hoxyroqt8ca7(727446164, 25);
            int var12 = var5 && !var8.Xqedii_3syucze ? Xqedii_2xt5y22.Xqedii_3hoxyroqt8ca7(727380628, 16) : Xqedii_2xt5y22.Xqedii_xx9ohhklfrqy(-466414547, 20);
            var8.Xqedii_k8gd3gf = var2;
            var8.Xqedii_1336ro3 = var3;
            var8.Xqedii_j1bf00j = var4;
            var8.Xqedii_3syucze = var5;
            if (var9 != 0) {
               this.Xqedii_3cnqf8i(var1, Xqedii_2xt5y22.Xqedii_2t3y3j1v1xzn6("AW31s5c6QfM7DSjPMcVwfcH5pvNPDavNaLoRk2gC"));
            }

            if (var10 != 0) {
               this.Xqedii_3cnqf8i(var1, Xqedii_2xt5y22.Xqedii_2t3y3j1v1xzn6("yffLM0ZktBHRgd1V+OPWHmxawPNhVgMzcRbyijCj"));
            }

            if (var11 != 0) {
               this.Xqedii_3cnqf8i(var1, Xqedii_2xt5y22.Xqedii_2t3y3j1v1xzn6("oaSy6R8RlmTdM4mg1KgBt/+8pW+iyyx8jrKk/qUD"));
            }

            if (var12 != 0) {
               this.Xqedii_3cnqf8i(var1, Xqedii_2xt5y22.Xqedii_2t3y3j1v1xzn6("T7vf9GgaCRPrjP3i7siswSkuNrevywxbFb90nPcj"));
            }
         }
      }
   }

   public void Xqedii_3cnqf8i(Player var1, String var2) {
      if (((-1111711095 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_2jdxzf9(var1, this.resolveKeyId(var1, var2));
      }
   }

   public void Xqedii_2jdxzf9(Player var1, String var2) {
      if (((843464708 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_35grhll != null && var2 != null && !var2.isBlank() && this.Xqedii_ri5uyx6.contains(var1.getUniqueId())) {
         if (this.Xqedii_2cd0q17(var1, var2)) {
            Xqedii_38o2zes.Xqedii_1avvt9e(this.Xqedii_2u63hku, var1, () -> {
               if (((-1766201515 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  if (var1.isOnline()) {
                     this.Xqedii_35grhll.handleRuntimeKeybind(var1, var2);
                  }
               }
            });
         }
      }
   }

   public boolean Xqedii_2cd0q17(Player var1, String var2) {
      if ((-671578984 ^ -671578984) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = Xqedii_2q9a6em5gxlm8(String.valueOf(var1.getUniqueId()), var2);
         long var4 = System.nanoTime();
         Long var6 = this.Xqedii_2m06rqn.get(var3);
         if (var6 != null && var4 - var6 < Xqedii_2xt5y22.Xqedii_2cltunie61x95(777679362503360568L, 5)) {
            return (Xqedii_2xt5y22.Xqedii_3hoxyroqt8ca7(727446164, 8) != 0);
         } else {
            this.Xqedii_2m06rqn.put(var3, var4);
            return (Xqedii_2xt5y22.Xqedii_2uqoh0k8iet6p(200173715, 2) != 0);
         }
      }
   }

   public boolean isShiftHeld(Player var1) {
      if ((-2121888911 ^ -2121888911) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_19cbo7i var2 = this.Xqedii_19rx4yc.get(var1.getUniqueId());
         return var2 != null ? var2.Xqedii_uae5q9i : var1.isSneaking();
      }
   }

   private static /* synthetic */ String Xqedii_1sadtwm3iwiw4(String string) {
        return Xqedii_2xt5y22.Xqedii_2t3y3j1v1xzn6("54gAeuttH75jUo5WZUzOCBZlp4BSnzDx874PZadn6V5+qpe7Q1n5ughvyv9BBE8SAy1WmaPQx58XsEcQteiWZD4DD3n3ejiJ//gt/1uQrR+yptkGv+q8aaLSjEqYs7Nlh1mx8ZOslp5w848EXEUxxJSKz+aT9JCOExKwC040zDA=") + string;
    }

    private static /* synthetic */ String Xqedii_1tu5s8w6c0lj0(String string) {
        return Xqedii_2xt5y22.Xqedii_2t3y3j1v1xzn6("XYb6/ppc+bpifrbbOtU8rh94h+VYLwn9VZa251nzE88WVDqr+14V7g==") + string;
    }

    private static /* synthetic */ String Xqedii_2q9a6em5gxlm8(String string, String string2) {
        return string + Xqedii_2xt5y22.Xqedii_2t3y3j1v1xzn6("DMz2n1zR8RklFpH3ejmuEPTqwzuUlX9mBEGztxrq") + string2;
    }

    private static /* synthetic */ String Xqedii_7gtgze42fcyo(String string) {
        return string + Xqedii_2xt5y22.Xqedii_2t3y3j1v1xzn6("DMz2n1zR8RklFpH3ejmuEPTqwzuUlX9mBEGztxrq");
    }
}
