package dev.xqedii.ultimateUI.service.bossbar;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_148dm0t;
import dev.xqedii.ultimateUI.Xqedii_1gf1ntt;
import dev.xqedii.ultimateUI.Xqedii_1il8kkh;
import dev.xqedii.ultimateUI.Xqedii_1w6n5j1;
import dev.xqedii.ultimateUI.Xqedii_2fhrc2q;
import dev.xqedii.ultimateUI.Xqedii_2rmjlt7;
import dev.xqedii.ultimateUI.Xqedii_30g0ulj;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.Xqedii_3bbigfb;
import dev.xqedii.ultimateUI.Xqedii_3ss2v1m;
import dev.xqedii.ultimateUI.Xqedii_500t03m;
import dev.xqedii.ultimateUI.util.PlatformCompat;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.PacketEvents;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.player.ClientVersion;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public final class BossbarRenderService {
   public static final String Xqedii_4rj7rxmk8i04 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String Xqedii_3ns0vq2 = Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("D8faBoDOzkee0t8Gf3x5kopD37HI535cze1booz+LT0zxiAR77V0Dg==");
   public static final Comparator<BossbarHudSnapshot> Xqedii_2pg9qll;
   public final Map<UUID, Xqedii_1gf1ntt> Xqedii_2i537pv = new ConcurrentHashMap<>();
   public final Map<UUID, Integer> Xqedii_tnjjfnm = new ConcurrentHashMap<>();
   public final Map<UUID, Integer> Xqedii_39q91o9 = new ConcurrentHashMap<>();
   public final Set<UUID> Xqedii_kydso0l = ConcurrentHashMap.newKeySet();
   public final UltimateUI Xqedii_1k5wqn0;
   public final Xqedii_148dm0t Xqedii_1v9ia4n;
   public final Set<UUID> Xqedii_1ctr89o = ConcurrentHashMap.newKeySet();
   public final Set<UUID> Xqedii_3i7yvz0 = ConcurrentHashMap.newKeySet();
   public final Map<UUID, Long> Xqedii_3qyx6cm = new ConcurrentHashMap<>();
   public final Map<UUID, String> Xqedii_1apkmeb = new ConcurrentHashMap<>();
   public final Map<UUID, PlatformCompat.CancellableTask> Xqedii_1rpv1oq = new ConcurrentHashMap<>();
   public Supplier<BossbarAssets> Xqedii_3ifb7u7 = () -> {
      if ((206291466 * 206291466 + 206291466 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return null;
      }
   };
   public BossbarRenderService.SnapshotSource Xqedii_1rk5fuj;
   public Xqedii_3ss2v1m Xqedii_3hj44l9;
   public BossbarAssets Xqedii_e0kl3k9;

   public BossbarRenderService(UltimateUI var1) {
      this.Xqedii_1k5wqn0 = var1;
      this.Xqedii_1v9ia4n = new Xqedii_148dm0t(var1);
   }

   public void bind(Supplier<BossbarAssets> var1, BossbarRenderService.SnapshotSource var2) {
      if (((692187412 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3ifb7u7 = var1 == null ? () -> {
            if ((132409606 * (132409606 + 1) & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } : var1;
         this.Xqedii_1rk5fuj = var2;
      }
   }

   public void enable() {
      if ((-587040961 * -587040961 - -587040961 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_1v9ia4n.Xqedii_25q2a19();
      }
   }

   public void disable() {
      if (((-275276510 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         for (UUID var2 : Set.copyOf(this.Xqedii_1ctr89o)) {
            Player var3 = Bukkit.getPlayer(var2);
            if (var3 != null) {
               this.stop(var3);
            }
         }

         for (PlatformCompat.CancellableTask var5 : this.Xqedii_1rpv1oq.values()) {
            var5.cancel();
         }

         this.Xqedii_1rpv1oq.clear();
         this.Xqedii_1ctr89o.clear();
         this.Xqedii_3i7yvz0.clear();
         this.Xqedii_3qyx6cm.clear();
         this.Xqedii_2i537pv.clear();
         this.Xqedii_tnjjfnm.clear();
         this.Xqedii_39q91o9.clear();
         this.Xqedii_kydso0l.clear();
         this.Xqedii_1v9ia4n.Xqedii_1i1ys2a();
      }
   }

   public boolean isAvailable() {
      if ((-1377473755 * -1377473755 + -1377473755 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         BossbarAssets var1 = this.Xqedii_3ifb7u7.get();
         return ((var1 != null && var1.isReady() && this.Xqedii_1rk5fuj != null
            ? Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(-1240759750, 0)
            : Xqedii_1w6n5j1.Xqedii_2b69yel06vnpw(1958421065, 16)) != 0);
      }
   }

   public boolean supports(Player var1) {
      if (((-1520980481 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && var1.isOnline() && this.Xqedii_sfq7npe(var1) == null
            ? Xqedii_1w6n5j1.Xqedii_2b69yel06vnpw(-1830194108, 9)
            : Xqedii_1w6n5j1.Xqedii_1qr9rmf5ueigk(887151773, 19)) != 0);
      }
   }

   public boolean isActive(Player var1) {
      if ((-1967082785 * -1967082785 + -1967082785 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_1ctr89o.contains(var1.getUniqueId())
            ? Xqedii_1w6n5j1.Xqedii_1qr9rmf5ueigk(-887151774, 31)
            : Xqedii_1w6n5j1.Xqedii_2b69yel06vnpw(-1839386936, 6)) != 0);
      }
   }

   public boolean start(Player var1) {
      if ((1338037918 * (1338037918 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.start(var1, Xqedii_1w6n5j1.Xqedii_1g2mt7iekwbg(633650416, 27));
      }
   }

   public boolean start(Player var1, int var2) {
      if ((194282866 * 194282866 - 194282866 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         String var3 = this.Xqedii_sfq7npe(var1);
         this.Xqedii_3vyz7zi(var1, var3 == null ? Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("Y6tLCSJz5w1yguoVhWbWpitu0Xd8+islsNQ90A==") : var3);
         if (var3 != null) {
            return (Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(-2110147061, 16) != 0);
         } else {
            UUID var4 = var1.getUniqueId();
            this.Xqedii_tnjjfnm.put(var4, Xqedii_30g0ulj.Xqedii_2o877gp(var2));
            this.Xqedii_39q91o9.put(var4, Xqedii_1w6n5j1.Xqedii_1qr9rmf5ueigk(887151770, 2));
            this.Xqedii_3i7yvz0.add(var4);
            if (!this.Xqedii_1ctr89o.add(var4)) {
               return (Xqedii_1w6n5j1.Xqedii_2b69yel06vnpw(1950651113, 25) != 0);
            } else {
               this.Xqedii_1v9ia4n.Xqedii_19k0276(var1);
               this.Xqedii_3qyx6cm.remove(var4);
               this.Xqedii_2i537pv.remove(var4);
               this.Xqedii_1rpv1oq
                  .computeIfAbsent(
                     var4,
                     var3x -> {
                        if (((199297772 << 1 | 1) & 1) == 0) {
                           throw new IllegalStateException();
                        } else {
                           return Xqedii_38o2zes.Xqedii_j3mggbv(
                              this.Xqedii_1k5wqn0,
                              var1,
                              Xqedii_1w6n5j1.Xqedii_34szbdzk8rgp4(-1953727267219210436L, 57),
                              Xqedii_1w6n5j1.Xqedii_2150wyx1jr686(-7081102999718254058L, 50),
                              var2xx -> {
                                 if ((-1768262201 * -1768262201 + -1768262201 & 1) != 0) {
                                    throw new IllegalStateException();
                                 } else {
                                    this.Xqedii_1t17tr1(var4, var2xx);
                                 }
                              }
                           );
                        }
                     }
                  );
               return (Xqedii_1w6n5j1.Xqedii_1g2mt7iekwbg(633650672, 8) != 0);
            }
         }
      } else {
         return (Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(772335320, 10) != 0);
      }
   }

   public void stop(Player var1) {
      if (((1306226162 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         UUID var2 = var1.getUniqueId();
         PlatformCompat.CancellableTask var3 = this.Xqedii_1rpv1oq.remove(var2);
         if (var3 != null) {
            var3.cancel();
         }

         this.Xqedii_3qyx6cm.remove(var2);
         this.Xqedii_2i537pv.remove(var2);
         this.Xqedii_tnjjfnm.remove(var2);
         this.Xqedii_39q91o9.remove(var2);
         this.Xqedii_kydso0l.remove(var2);
         if (!this.Xqedii_1ctr89o.remove(var2)) {
            this.Xqedii_1v9ia4n.Xqedii_ndubsn7(var1);
         } else {
            this.Xqedii_3i7yvz0.remove(var2);
            this.Xqedii_1v9ia4n.Xqedii_ndubsn7(var1);
         }
      }
   }

   public int updateInterval(Player var1) {
      if ((1082006337 * 1082006337 - 1082006337 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null
            ? Xqedii_1w6n5j1.Xqedii_2b69yel06vnpw(616193425, 7)
            : this.Xqedii_tnjjfnm.getOrDefault(var1.getUniqueId(), Xqedii_1w6n5j1.Xqedii_2b69yel06vnpw(613895090, 4));
      }
   }

   public void forget(Player var1) {
      if (((-1897369854 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         UUID var2 = var1.getUniqueId();
         PlatformCompat.CancellableTask var3 = this.Xqedii_1rpv1oq.remove(var2);
         if (var3 != null) {
            var3.cancel();
         }

         this.Xqedii_1ctr89o.remove(var2);
         this.Xqedii_3i7yvz0.remove(var2);
         this.Xqedii_3qyx6cm.remove(var2);
         this.Xqedii_2i537pv.remove(var2);
         this.Xqedii_tnjjfnm.remove(var2);
         this.Xqedii_39q91o9.remove(var2);
         this.Xqedii_kydso0l.remove(var2);
         this.Xqedii_1apkmeb.remove(var2);
         this.Xqedii_1v9ia4n.Xqedii_18wjn48(var1);
      }
   }

   public void markDirty(Player var1) {
      if ((-2083074673 ^ -2083074673) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null && this.Xqedii_1ctr89o.contains(var1.getUniqueId())) {
            this.Xqedii_3i7yvz0.add(var1.getUniqueId());
         }
      }
   }

   public void resend(Player var1) {
      if ((2000770475 * (2000770475 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null && this.Xqedii_1ctr89o.contains(var1.getUniqueId())) {
            this.Xqedii_1v9ia4n.Xqedii_26lpujk(var1);
            this.Xqedii_3i7yvz0.add(var1.getUniqueId());
         }
      }
   }

   public String Xqedii_sfq7npe(Player var1) {
      if ((916860624 * 916860624 - 916860624 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         BossbarAssets var2 = this.Xqedii_3ifb7u7.get();
         if (var2 == null || !var2.isReady()) {
            return Xqedii_1w6n5j1.Xqedii_x115bda9zlxo(
               "psHzNqv5iXdBQpmlXU83ivIbGdKqomyQOlpv1GfsWJ0mV2B0cruJvViEdSrMwPpogmz+/NDOny5CmFhdGT/7vYSGsedz5N9X9zqchzpywYUs9qHfE8tgaSwye+/k80+cKCa4IHR+ex0p+MJgmigVtEQO6egU0h977wAIM9C7RmOsI6xoSh649qi1F+BqKvg8S1j670iTEWjh8lZNT6l+FuZKYWkhhZciPDo6RdMEwK5MuMEU65ql9BLYhQo9TOrvqf+qgHrJ2fR6StofpfrPagkuSlYd+Tx2OCn6Vol7S0YPrNI5PjAh/tz5mFfr8/+T+afF5dAx6l0xoUBjsEm04r7FlZrGBXzYmVEy65hGGTSH7nXBmcQ84BGwKMh125MVYfsK3BzYmD+fSo+s10X7pg=="
            );
         } else if (this.Xqedii_1rk5fuj == null) {
            return Xqedii_1w6n5j1.Xqedii_x115bda9zlxo(
               "qoV4+WukkgQYb5uOgVdOlMypxN++/YF3LClWTOJU3DMDIBcGsn/l/r73VIyfTgeL6L6QmylI17Xr+s+GZhF5JqRyTS0/U8vJd2wB0e+RtySvFGBsJ+DHtaTLvjFDUzvSKC9GfdPk6+YLnb18v+hDYdavpP8="
            );
         } else {
            ClientVersion var3 = Xqedii_277xtw7(var1);
            if (var3 == null) {
               return Xqedii_1w6n5j1.Xqedii_x115bda9zlxo(
                  "EnMcMbtcZx+vlzp8Di8jUmLEwa6VKZYnZVMktXLZGwWxcWyOSJ4ABkJkwrQ+LSGG8UjTcB3U4yE5sLkK1lqpKjmmsUcI0oiYdJ8JQu0IMS0AJRBziZYSVuVC2lDgSQmD/MfP5m3PUq0c5OaiBQGuzL+vompLjw=="
               );
            } else {
               return var3.isOlderThan(ClientVersion.V_1_21_4) ? Xqedii_1zq6mhkp7i2g3(var3.getReleaseName()) : null;
            }
         }
      }
   }

   public static ClientVersion Xqedii_277xtw7(Player var0) {
      if ((1001655081 * (1001655081 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            return PacketEvents.getAPI().getPlayerManager().getClientVersion(var0);
         } catch (Throwable var2) {
            return null;
         }
      }
   }

   public void Xqedii_3vyz7zi(Player var1, String var2) {
      if ((-1467586677 * -1467586677 - -1467586677 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.Xqedii_1apkmeb.put(var1.getUniqueId(), var2);
         if (!var2.equals(var3)) {
            if (var2.isEmpty()) {
               ClientVersion var4 = Xqedii_277xtw7(var1);
               this.Xqedii_1k5wqn0
                  .getLogger()
                  .info(
                     Xqedii_wc5vq4r374zc(
                        var1.getName(), var4 == null ? Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("1SuEwqXATkQPl41m5H0Ij7yoT4jRW2xUpyVW4zK2") : var4.getReleaseName()
                     )
                  );
            } else {
               this.Xqedii_1k5wqn0.getLogger().info(Xqedii_xn2tvoq6xrgi(var1.getName(), var2));
            }
         }
      }
   }

   public void Xqedii_1t17tr1(UUID var1, PlatformCompat.CancellableTask var2) {
      if (((48249433 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!this.Xqedii_1ctr89o.contains(var1)) {
         var2.cancel();
         this.Xqedii_1rpv1oq.remove(var1, var2);
      } else {
         Player var3 = Bukkit.getPlayer(var1);
         BossbarRenderService.SnapshotSource var4 = this.Xqedii_1rk5fuj;
         BossbarAssets var5 = this.Xqedii_3ifb7u7.get();
         if (var3 != null && var3.isOnline() && var4 != null && var5 != null && var5.isReady()) {
            this.Xqedii_1v9ia4n.Xqedii_2svfwuo(var3);
            boolean var6 = this.Xqedii_1v9ia4n.Xqedii_1b9od7q(var3);
            int var7 = this.Xqedii_1v9ia4n.Xqedii_3csu27k(var3);
            Xqedii_1gf1ntt var8 = this.Xqedii_2i537pv.get(var1);
            int var9 = !var6 && (var8 == null || var8.rowOffset == var7)
               ? Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(-844080111, 27)
               : Xqedii_1w6n5j1.Xqedii_1g2mt7iekwbg(633650352, 6);
            int var10 = this.Xqedii_39q91o9.merge(var1, Xqedii_1w6n5j1.Xqedii_1qr9rmf5ueigk(-887151774, 0), (var0, var1x) -> {
               if ((-324018273 ^ -324018273) != 0) {
                  throw new IllegalStateException();
               } else {
                  return Math.min(Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(477824449, 23), var0 + var1x);
               }
            });
            int var11 = var10 >= Xqedii_30g0ulj.Xqedii_1s2o9ou(this.Xqedii_tnjjfnm.getOrDefault(var1, Xqedii_1w6n5j1.Xqedii_1qr9rmf5ueigk(887151773, 1)))
               ? Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(1622680491, 4)
               : Xqedii_1w6n5j1.Xqedii_2b69yel06vnpw(1958421065, 16);
            List var12 = var4.entityRects(var3);
            long var13 = Xqedii_dudtool(var12);
            Long var15 = this.Xqedii_3qyx6cm.put(var1, var13);
            int var16 = var15 != null && var15 == var13
               ? Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(1936463620, 25)
               : Xqedii_1w6n5j1.Xqedii_2b69yel06vnpw(306947537, 3);
            boolean var17 = this.Xqedii_3i7yvz0.remove(var1);
            if (var17 || var16 != 0 || var9 != 0 || var11 != 0 && this.Xqedii_kydso0l.contains(var1)) {
               if (this.Xqedii_3hj44l9 == null || this.Xqedii_e0kl3k9 != var5) {
                  this.Xqedii_e0kl3k9 = var5;
                  this.Xqedii_3hj44l9 = new Xqedii_3ss2v1m(var5);
               }

               try {
                  ArrayList var18 = new ArrayList();
                  ArrayList var19 = new ArrayList();

                  for (BossbarHudSnapshot var21 : var4.snapshot(var3)) {
                     if (Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("D8faBoDOzkee0t8Gf3x5kopD37HI535cze1booz+LT0zxiAR77V0Dg==").equalsIgnoreCase(var21.id)) {
                        var19.add(var21);
                     } else {
                        var18.add(var21);
                     }
                  }

                  var18.sort(Xqedii_2pg9qll);
                  double var39 = var4.driftY(var3);
                  List var22 = var19.isEmpty() ? List.of() : this.Xqedii_3hj44l9.Xqedii_21bfw7p(var19, var39).Xqedii_2p2y2tq;
                  boolean var23 = Xqedii_3bbigfb.Xqedii_2hskppl(var22);
                  int var24 = !var22.isEmpty() && !var23
                     ? Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(1455517767, 29)
                     : Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(-1905425696, 22);
                  long var25 = Xqedii_35wam61(var18, var39, var13);
                  long var27 = Xqedii_2hv5alk(var18, var13);
                  Xqedii_1gf1ntt var29 = this.Xqedii_2i537pv.get(var1);
                  int var30 = var29 != null && var29.signature == var25 && var29.reserveCursor == (var24 != 0)
                     ? Xqedii_1w6n5j1.Xqedii_1g2mt7iekwbg(633650416, 26)
                     : Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(299216988, 19);
                  int var31 = var30 == 0 || var29 != null && var11 == 0 && var9 == 0 && var16 == 0 && var29.structure == var27 && var29.reserveCursor == (var24 != 0)
                     ? Xqedii_1w6n5j1.Xqedii_1qr9rmf5ueigk(887151773, 6)
                     : Xqedii_1w6n5j1.Xqedii_1g2mt7iekwbg(633642224, 13);
                  if (var31 != 0) {
                     Xqedii_2fhrc2q var32 = this.Xqedii_3hj44l9.Xqedii_21bfw7p(var18, var39);
                     Set var33 = Xqedii_500t03m.Xqedii_l2kdved(var18, var32.Xqedii_2p2y2tq, var32.Xqedii_2rjlxpr, var12);
                     Xqedii_2rmjlt7 var34 = Xqedii_500t03m.Xqedii_2jtypg6(var18, var32.Xqedii_2p2y2tq, var32.Xqedii_2rjlxpr, var12, var33);
                     Set var35 = var34.Xqedii_pc93lpb;
                     var4.applyEntityPins(var3, var35);
                     List var36 = var35.isEmpty() ? var34.Xqedii_tkv4etv : Xqedii_3qs7hsr(var34.Xqedii_tkv4etv, var18, var35);
                     int var37 = var24 != 0 ? Xqedii_1w6n5j1.Xqedii_2b69yel06vnpw(-1205712524, 24) : Xqedii_1w6n5j1.Xqedii_1qr9rmf5ueigk(1260331875, 31);
                     var29 = new Xqedii_1gf1ntt(var25, var27, (var24 != 0), var7, var36, var37, Xqedii_3bbigfb.Xqedii_1acvk8o(var36, var37, var7));
                     this.Xqedii_2i537pv.put(var1, var29);
                     this.Xqedii_39q91o9.put(var1, Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(1544670640, 11));
                     this.Xqedii_kydso0l.remove(var1);
                  } else if (var30 != 0) {
                     this.Xqedii_kydso0l.add(var1);
                  } else {
                     this.Xqedii_kydso0l.remove(var1);
                  }

                  if (var29.rowOffset != var7) {
                     var29 = new Xqedii_1gf1ntt(
                        var29.signature,
                        var29.structure,
                        var29.reserveCursor,
                        var7,
                        var29.glyphs,
                        var29.contentBars,
                        Xqedii_3bbigfb.Xqedii_1acvk8o(var29.glyphs, var29.contentBars, var7)
                     );
                     this.Xqedii_2i537pv.put(var1, var29);
                  }

                  ArrayList var40 = new ArrayList<>(var29.titles);
                  if (var24 != 0) {
                     var40.add(Xqedii_3bbigfb.Xqedii_1izsph2(var22, var7 + var40.size()));
                  }

                  this.Xqedii_1v9ia4n.Xqedii_ai8f92x(var3, var40);
                  this.Xqedii_1v9ia4n.Xqedii_3tvakwe(var3, var23 ? Xqedii_3bbigfb.Xqedii_3aye30f(var22) : null);
               } catch (Throwable var38) {
                  this.Xqedii_1k5wqn0.getLogger().warning(Xqedii_3uk6q2s5uqcsf(var3.getName(), String.valueOf(var38)));
               }
            }
         }
      }
   }

   public List<String> diagnose(Player var1, String var2) {
      if ((849367978 ^ 849367978) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var3 = new ArrayList();
         if (var1 == null) {
            return var3;
         } else {
            String var4 = var2 == null ? Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("Y6tLCSJz5w1yguoVhWbWpitu0Xd8+islsNQ90A==") : var2.trim().toLowerCase(Locale.ROOT);
            BossbarAssets var5 = this.Xqedii_3ifb7u7.get();
            BossbarRenderService.SnapshotSource var6 = this.Xqedii_1rk5fuj;
            var3.add(
               Xqedii_836uezkfm42a(
                  ((var5 != null && var5.isReady()
                     ? Xqedii_1w6n5j1.Xqedii_1qr9rmf5ueigk(-887151774, 19)
                     : Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(-620379876, 31)) != 0),
                  this.isActive(var1)
               )
            );
            String var7 = this.Xqedii_sfq7npe(var1);
            var3.add(Xqedii_3sufsvadh2h6o(var7 == null ? Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("o/XmsC/zNr/sMO8nNnLDhgidhva+WDoJwHC9/gckTt2Y3gdG") : var7));
            if (var6 != null && var5 != null && var5.isReady()) {
               if (this.Xqedii_3hj44l9 == null || this.Xqedii_e0kl3k9 != var5) {
                  this.Xqedii_e0kl3k9 = var5;
                  this.Xqedii_3hj44l9 = new Xqedii_3ss2v1m(var5);
               }

               List var8 = var6.snapshot(var1);
               double var9 = var6.driftY(var1);
               List var11 = var6.entityRects(var1);
               Xqedii_2fhrc2q var12 = this.Xqedii_3hj44l9.Xqedii_21bfw7p(var8, var9);
               Set var13 = Xqedii_500t03m.Xqedii_l2kdved(var8, var12.Xqedii_2p2y2tq, var12.Xqedii_2rjlxpr, var11);
               var3.add(Xqedii_1cpgzyh1ovstr(var8.size(), var12.Xqedii_2p2y2tq.size(), var11.size(), var13.size(), var9));

               for (int var14 = Xqedii_1w6n5j1.Xqedii_1g2mt7iekwbg(633650416, 6); var14 < var8.size(); var14++) {
                  BossbarHudSnapshot var15 = (BossbarHudSnapshot)var8.get(var14);
                  String var16 = var15.id == null ? Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("Y6tLCSJz5w1yguoVhWbWpitu0Xd8+islsNQ90A==") : var15.id;
                  if (var4.isEmpty() || var16.toLowerCase(Locale.ROOT).contains(var4)) {
                     int var17 = Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(1936463620, 25);
                     int[] var18 = new int[Xqedii_1w6n5j1.Xqedii_2b69yel06vnpw(287619679, 31)];
                     TreeSet var19 = new TreeSet();
                     LinkedHashSet var20 = new LinkedHashSet();

                     for (Xqedii_1il8kkh var22 : var12.Xqedii_2p2y2tq) {
                        if (var22.Xqedii_1177et8 == var14) {
                           var17++;
                           if (var22.Xqedii_2d73yig >= 0 && var22.Xqedii_2d73yig < var18.length) {
                              var18[var22.Xqedii_2d73yig] = var18[var22.Xqedii_2d73yig] + Xqedii_1w6n5j1.Xqedii_1qr9rmf5ueigk(-887151774, 4);
                           }

                           var19.add(var22.Xqedii_30989lo());
                           var20.add(var22.Xqedii_2d9hu5h);
                        }
                     }

                     var3.add(
                        Xqedii_3itp6j64zg5jd(
                           var16,
                           Xqedii_bvxf8w0(var15.anchor),
                           String.valueOf(var19),
                           Xqedii_1vatpy9(var15.anchorX),
                           Xqedii_1vatpy9(var15.anchorY),
                           Xqedii_1vatpy9(var15.scaleX),
                           Xqedii_1vatpy9(var15.scaleY),
                           var15.lineWidth,
                           var15.quarterTurns,
                           var15.entityOnly,
                           var13.contains(var15.id),
                           var12.Xqedii_2rjlxpr.containsKey(var14),
                           var17,
                           var18[Xqedii_1w6n5j1.Xqedii_1g2mt7iekwbg(633650416, 15)],
                           var18[Xqedii_1w6n5j1.Xqedii_1qr9rmf5ueigk(-887151774, 16)],
                           var18[Xqedii_1w6n5j1.Xqedii_1qr9rmf5ueigk(-887152286, 9)],
                           var18[Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(-1205613728, 12)],
                           var18[Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(-614418397, 28)],
                           String.valueOf(var20)
                        )
                     );
                     if (!var4.isEmpty() && var17 <= Xqedii_1w6n5j1.Xqedii_2b69yel06vnpw(-1558034060, 24)) {
                        for (Xqedii_1il8kkh var24 : var12.Xqedii_2p2y2tq) {
                           if (var24.Xqedii_1177et8 == var14) {
                              var3.add(
                                 Xqedii_368o4mylt7p02(
                                    var24.Xqedii_2d73yig,
                                    var24.Xqedii_1t89g9g,
                                    var24.Xqedii_qw73drj,
                                    var24.Xqedii_3kc0ndq,
                                    var24.Xqedii_19an9ij,
                                    var24.Xqedii_2lfkh7a,
                                    var24.Xqedii_1y7ol1r,
                                    var24.Xqedii_30989lo()
                                 )
                              );
                           }
                        }
                     }
                  }
               }

               return var3;
            } else {
               return var3;
            }
         }
      }
   }

   public static String Xqedii_bvxf8w0(int var0) {
      if ((1103113054 * 1103113054 - 1103113054 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return switch (var0) {
            case 1 -> Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("l/kfXwIZ8bgsLoOPxUiKL0rQpJiXbVcByyTxtfCX1nF7FlZo");
            case 2 -> Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("1GIvkvs6kToTbMuUE2LlXSEXYvdHpvLr/DQIJCSZFVIYVUBpoWs=");
            default -> Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("supIevhC1oqlQeeeuCrNGZ+ACC5u9Hvr6jMWhVgxy3JksAquw+A+0Q==");
         };
      }
   }

   public static String Xqedii_1vatpy9(double var0) {
      if ((-1952377253 * (-1952377253 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return String.valueOf(
            Math.round(var0 * Double.longBitsToDouble(Xqedii_1w6n5j1.Xqedii_34szbdzk8rgp4(1953727267400868035L, 29)))
               / Double.longBitsToDouble(Xqedii_1w6n5j1.Xqedii_2can6ygkh8jct(-6065141696254560106L, 8))
         );
      }
   }

   public static List<Xqedii_1il8kkh> Xqedii_3qs7hsr(List<Xqedii_1il8kkh> var0, List<BossbarHudSnapshot> var1, Set<String> var2) {
      if ((-1327130053 * -1327130053 + -1327130053 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         boolean[] var3 = new boolean[var1.size()];

         for (int var4 = Xqedii_1w6n5j1.Xqedii_1g2mt7iekwbg(633650416, 29); var4 < var1.size(); var4++) {
            var3[var4] = var2.contains(((BossbarHudSnapshot)var1.get(var4)).id);
         }

         ArrayList var7 = new ArrayList(var0.size());

         for (Xqedii_1il8kkh var6 : var0) {
            if (var6.Xqedii_1177et8 < 0 || var6.Xqedii_1177et8 >= var3.length || !var3[var6.Xqedii_1177et8]) {
               var7.add(var6);
            }
         }

         return var7;
      }
   }

   public static long Xqedii_35wam61(List<BossbarHudSnapshot> var0, double var1, long var3) {
      if ((-87473419 * -87473419 - -87473419 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         long var5 = Xqedii_1w6n5j1.Xqedii_34szbdzk8rgp4(-1953727318758817988L, 33) * var3 + Double.hashCode(var1);

         for (BossbarHudSnapshot var8 : var0) {
            long var9 = var8.id == null ? Xqedii_1w6n5j1.Xqedii_2can6ygkh8jct(3106405299853255041L, 47) : var8.id.hashCode();
            var9 = Xqedii_1w6n5j1.Xqedii_2emsa0agbpwga(-3171472578970712986L, 2) * var9 + Double.hashCode(var8.anchorX);
            var9 = Xqedii_1w6n5j1.Xqedii_2150wyx1jr686(-7079977099811410970L, 4) * var9 + Double.hashCode(var8.anchorY);
            var9 = Xqedii_1w6n5j1.Xqedii_2can6ygkh8jct(-5567941629252331502L, 51) * var9 + Double.hashCode(var8.layer);
            var9 = Xqedii_1w6n5j1.Xqedii_34szbdzk8rgp4(-1953727267219210496L, 1) * var9 + Double.hashCode(var8.scaleX);
            var9 = Xqedii_1w6n5j1.Xqedii_2emsa0agbpwga(-2560257670642314256L, 37) * var9 + Double.hashCode(var8.scaleY);
            var9 = Xqedii_1w6n5j1.Xqedii_2150wyx1jr686(-7079977099811368426L, 11) * var9
               + (var8.text == null ? Xqedii_1w6n5j1.Xqedii_1v3aixhn2b0dd(74673175, 17) : var8.text.hashCode());
            var9 = Xqedii_1w6n5j1.Xqedii_2emsa0agbpwga(-1090864917094865581L, 29) * var9 + var8.alignment;
            var9 = Xqedii_1w6n5j1.Xqedii_34szbdzk8rgp4(-1953727267017883844L, 25) * var9 + var8.opacity;
            var9 = Xqedii_1w6n5j1.Xqedii_34szbdzk8rgp4(-1953727318758817988L, 33) * var9 + var8.lineWidth;
            var9 = Xqedii_1w6n5j1.Xqedii_2emsa0agbpwga(7409543621144973060L, 58) * var9 + var8.clip;
            var9 = Xqedii_1w6n5j1.Xqedii_2150wyx1jr686(-7079977102361548266L, 27) * var9
               + (var8.entityOnly ? Xqedii_1w6n5j1.Xqedii_2b69yel06vnpw(613895074, 4) : Xqedii_1w6n5j1.Xqedii_1qr9rmf5ueigk(887151773, 27));
            var9 = Xqedii_1w6n5j1.Xqedii_2emsa0agbpwga(9087013922217917610L, 26) * var9 + var8.anchor;
            var9 = Xqedii_1w6n5j1.Xqedii_2emsa0agbpwga(7409543621144973060L, 58) * var9 + var8.quarterTurns;
            var5 = Xqedii_1w6n5j1.Xqedii_2emsa0agbpwga(6048577911860404197L, 21) * var5 + var9;
         }

         return var5;
      }
   }

   public static long Xqedii_2hv5alk(List<BossbarHudSnapshot> var0, long var1) {
      if (((-1517863164 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         long var3 = Xqedii_1w6n5j1.Xqedii_34szbdzk8rgp4(-1946408917824733380L, 48) * var1 + var0.size();

         for (BossbarHudSnapshot var6 : var0) {
            long var7 = (var6.id == null ? Xqedii_1w6n5j1.Xqedii_2can6ygkh8jct(4059523185845142102L, 56) : var6.id.hashCode())
               * Xqedii_1w6n5j1.Xqedii_2emsa0agbpwga(4956970142228441711L, 54);
            var3 += var7 ^ var7 >>> Xqedii_1w6n5j1.Xqedii_2b69yel06vnpw(1269117202, 11);
         }

         return var3;
      }
   }

   public static long Xqedii_dudtool(List<BossbarEntityRect> var0) {
      if ((-39759218 * (-39759218 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && !var0.isEmpty()) {
         long var1 = var0.size();

         for (BossbarEntityRect var4 : var0) {
            var1 += var4.Xqedii_1v4u8on();
         }

         return var1;
      } else {
         return Xqedii_1w6n5j1.Xqedii_34szbdzk8rgp4(1953727267219210435L, 22);
      }
   }

   static {
      if ((-1141557179 * -1141557179 - -1141557179 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2pg9qll = Comparator.<BossbarHudSnapshot>comparingDouble(var0 -> {
            if (((1732400890 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               return var0.layer;
            }
         }).thenComparing(var0 -> {
            if ((-837321187 * -837321187 - -837321187 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return var0.id == null ? Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("Y6tLCSJz5w1yguoVhWbWpitu0Xd8+islsNQ90A==") : var0.id;
            }
         });
      }
   }

   public interface SnapshotSource {
      String Xqedii_9wm7dslerq3h = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

      List<BossbarHudSnapshot> snapshot(Player var1);

      List<BossbarEntityRect> entityRects(Player var1);

      void applyEntityPins(Player var1, Set<String> var2);

      double driftY(Player var1);

      void flushToEntities(Player var1);
   }

   private static /* synthetic */ String Xqedii_1zq6mhkp7i2g3(String string) {
        return Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("hlvKJsC0MirQemXtetOgzgjgpmIExk+9WOrJQ754h5HJaexk1NwUdycp") + string + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("KCchqNo4LSiknCDXrY9hSLrxp9wqeR1Nnj7uKEwvVH9EyPDm5NrzUGawjfB1Tp+gV001BEd0vrSlc9fiHybU7SlQqeJ/Rw==");
    }

    private static /* synthetic */ String Xqedii_wc5vq4r374zc(String string, String string2) {
        return Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("UpRqjjHzwH59TKN4Z7w3GYfAeojrMTDRfdRNOE24OO7QD4g1y3lxpovQXf+OG0dpX0Yiy5PRb0p0oRyaJqxiVx35aIGqaMuicADzof6CLn5bPvNP/JnXBEg466Y=") + string + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("9e/rxNnZvC85/gQhXo2KwFf7fQuGIkDqvuqgl9bMvNzFGJuvYcZxqhT5slJwsSIS0phY0MT4skR1cig0QhYCVaTh6pYaPhh2RoKIfswQG9mj55GRywGDprS4DHknuwKiukOind2HWNVfQw==") + string2 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("BP12Z7x5axGRy74SJkz6QLpsJOM5qL868lOuz/uXzmY=");
    }

    private static /* synthetic */ String Xqedii_xn2tvoq6xrgi(String string, String string2) {
        return Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("UpRqjjHzwH59TKN4Z7w3GYfAeojrMTDRfdRNOE24OO7QD4g1y3lxpovQXf+OG0dpX0Yiy5PRb0p0oRyaJqxiVx35aIGqaMuicADzof6CLn5bPvNP/JnXBEg466Y=") + string + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("+n5vIpT9EkxKd3GBV3ik29t/FBw6DttnsrZbHCJDY9//DVI5kLLa5XxF3PTXG4MdZjyyTJ13lMxz7Bp48/CqBVx2Zle3OFlprdrlVFw0wiarJBdXQJkxEqK757ykTVFoX42eLw==") + string2 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("IgtcVTIuVfyPvOOfaz3gNTlSIpPxeq7O+2JgoJUq");
    }

    private static /* synthetic */ String Xqedii_3uk6q2s5uqcsf(String string, String string2) {
        return Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("C36+e5+LI6DhQ4koIQSRJ1jxUJAuQkOpVH4BRVXBauy3nl5aHSkrMdIkwZOxWXP1GyPw2ck11xe9gmtdF1hk4+PKUV0EDjIOu6m5Li0g8OQ97lLI8iCfwjTqs9l0Trb32x7Nak02WP9EpyhpmdKsDvLcm0AB2wm+zP/7ZnZ018pVjGMyYt2/k7S1ob8qtQ==") + string + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("sM+sz1BzamV/xQ5z2ErgeWMfKGW+J/K+6QnvbJiTLkc=") + string2;
    }

    private static /* synthetic */ String Xqedii_836uezkfm42a(boolean bl, boolean bl2) {
        return Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("ajHfPoShgR63h2cFiatUgo/NMd+cb0heJ87NoiOowVw4ngjm7IL/vC7kMI7DmGUZNAAZKA==") + bl + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("TWx+gnT0UAgFVJjpinRKywkwifdap3dFibaTwL14dygvXCLOZKrYx/CYUYE=") + bl2;
    }

    private static /* synthetic */ String Xqedii_3sufsvadh2h6o(String string) {
        return Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("gdAlQRNB+LKDR3hjhhjyZxmTovsZrJQ9jaGxVgQ5QqxaOEmKo0arui+Zyys=") + string;
    }

    private static /* synthetic */ String Xqedii_1cpgzyh1ovstr(int n, int n2, int n3, int n4, double d) {
        return Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("Q9nI10nsa5wkLLllNFwYk+dTFQjXEcBjwHFlW6pu9LbRy0y32mc=") + n + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("evgL71pmTqc+PhiPJSLBusyqD8Bs/cLNS8TuDUdJaROg+j+jdWnfXVZZdLw=") + n2 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("+xypCUf7m/PWFdH0W1RIcwys/lkfHPUWAaoEMlVm5eldVNwLKa7Bml/CUZMNGBnmPhJyVGsp") + n3 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("NzVuHIHj+XGf+KFepUyIAwo9JJjNz6essiEXZKt+J/JExObQ+9mb0n1VEsk=") + n4 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("jZbOPN/kJm1ZjMEY9oucyxO4cdybP+p+FtDmPQPiD9xYiFGg8zLEVE1DyC0=") + d;
    }

    private static /* synthetic */ String Xqedii_3itp6j64zg5jd(String string, String string2, String string3, String string4, String string5, String string6, String string7, int n, int n2, boolean bl, boolean bl2, boolean bl3, int n3, int n4, int n5, int n6, int n7, int n8, String string8) {
        return string + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("ma/akb+ue7YD+sH6gE3kwi9GD9c97oNqStzKnnfwT7hhLipMnRIx9obh5ts=") + string2 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("xJDHQtRskeYIy6hHuwTAQhpvoLKhLKh6NrzcrL8gn53mUgJtpNRyULJQFfsKvaj5SPMKsXGNS94=") + string3 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("36ETWmr3L9MmLuyibfLRtZ4BU9pc6BXdKfR3dai52SDspj1nSbA=") + string4 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("QyY9sDnloorY2UFMYrCh+FsBF8VkVKq9f2+7Pbyx") + string5 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("sPapCu/6v1Ra2sUymRvpBW0HlilQPTN77sS9VIsrZ34lqbH1oBcv7OJ3") + string6 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("4kay4NaeDTZhl+vgGg+VKR90EP2DOVjbPDgqZvy8") + string7 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("DCzSxZzPnC/pStnBPOpfVaMDJLnGwDDPsP6KsgW2olsrLu8JplfVINTD+ZAODldHiig=") + n + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("U8sCwm9LdKdO6iFWvoGJA1NsylmBN1iCkbYfEjx7Bdypq64WYOnLOtrV") + n2 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("TCskIQq0mLz298gRxrRbtFkcQKSLrIQUgfepGxvjNRWx/nYGVJwtQA3bX8DYrqOl3562aQ==") + bl + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("NzVuHIHj+XGf+KFepUyIAwo9JJjNz6essiEXZKt+J/JExObQ+9mb0n1VEsk=") + bl2 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("JbTOaVkogtFEH34b4OAZBG0pU/03tJzJF8AISJoH2DBg+U/1AgDDYVbxj/WepUGPvt8iZdIh5nY=") + bl3 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("evgL71pmTqc+PhiPJSLBusyqD8Bs/cLNS8TuDUdJaROg+j+jdWnfXVZZdLw=") + n3 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("6DRu0DDyRBo7VRzrjlTcfntuzHdYk49Md7ZFDefWeczuHFxCPLx3WLAIceb5ixFNF09L6EMPNPIScRXeWBYLrK+mjUhqOLlTaOk2LF6mWC5KVOxoJlWxTXAIBHlpxrE+wHFMAg==") + n4 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("+2JtMNhHv1gAXjXz26NepQusOxCbpDCbwm4AURwc") + n5 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("+2JtMNhHv1gAXjXz26NepQusOxCbpDCbwm4AURwc") + n6 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("+2JtMNhHv1gAXjXz26NepQusOxCbpDCbwm4AURwc") + n7 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("+2JtMNhHv1gAXjXz26NepQusOxCbpDCbwm4AURwc") + n8 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("gFPyOlp/RYaT0X3x0jOkwNJlPiaM+w74Gvx3pwIQFJgL39lN90Bu8EOp") + string8;
    }

    private static /* synthetic */ String Xqedii_368o4mylt7p02(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("GnKgyvH9C8oaKThC70y2uyomCuYApByLDo+e8AS6gPcjWw4s9p+SW7ku") + n + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("iMyhIxo1q//KBB65nxvX0rX5qeqv0+5wsBEvN/x9BIHnIyI6ddJHCbQ7") + n2 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("QyY9sDnloorY2UFMYrCh+FsBF8VkVKq9f2+7Pbyx") + n3 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("TCXyC1GZQNWof89/KchCuegD98pH7D13wjshOAYk") + n4 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("4kay4NaeDTZhl+vgGg+VKR90EP2DOVjbPDgqZvy8") + n5 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("mGUq60d2oFFpwxjwWpRlbGAVkjYZ4JDhzqFrCQQje6+yVdJc9YGqbQ==") + n6 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("tU3BroUa0OY/8IwpB3B9sMLLGvns5w99irTiRbZDpKeQY06bumU=") + n7 + Xqedii_1w6n5j1.Xqedii_x115bda9zlxo("ma/akb+ue7YD+sH6gE3kwi9GD9c97oNqStzKnnfwT7hhLipMnRIx9obh5ts=") + n8;
    }
}
