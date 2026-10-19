package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.util.PlatformCompat;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.PacketEvents;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerPlayerPositionAndLook;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.profile.PlayerProfile;
import org.bukkit.scheduler.BukkitTask;

public final class Xqedii_38o2zes {
   public static final String Xqedii_2bowiqm5p2b47 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static volatile Boolean Xqedii_21u50fv;
   public static final boolean Xqedii_3jrjopz;
   public static volatile int Xqedii_2j2spt3;
   public static volatile BukkitTask Xqedii_vvd3vht;
   public static volatile boolean Xqedii_33fwwlu;
   public static volatile GameRule<Boolean> Xqedii_2744hxj;
   public static volatile boolean Xqedii_1gcpkgs;
   public static volatile Attribute Xqedii_taj1wm1;
   public static final byte Xqedii_2ztqvs0 = 7;
   public static volatile boolean Xqedii_2mct6gi;
   public static volatile Method Xqedii_10wf9lh;

   public static boolean Xqedii_4mmto10() {
      if (((1647331106 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Boolean var0 = Xqedii_21u50fv;
         if (var0 != null) {
            return var0;
         } else {
            synchronized (Xqedii_38o2zes.class) {
               if (Xqedii_21u50fv != null) {
                  return Xqedii_21u50fv;
               } else {
                  boolean var2 = false;

                  try {
                     Class.forName(
                        Xqedii_ozmlu4z.Xqedii_1303z0iykjin2(
                           "wAzTh3OVC/QWLhEl80FGfgjMYodpuLzEH8/6+BUSWWM7+j+vXb8PryPt0D1TbEVPDSS6eHkGm1xxXtyI0KDQ9iUMj+tezc9SZNLWJDJR8XVYBABjUjHo2otArxB2c6CDSaUDNdBGgqOfLUNPdfXb5ev88YZ/SSOlXeVXZVN5gnrHERpdTSt3oE3NPlgIL9rR"
                        ),
                        (Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 23) != 0),
                        Xqedii_38o2zes.class.getClassLoader()
                     );
                     var2 = Xqedii_3bgk87b(
                        Bukkit.getServer().getClass(),
                        Xqedii_ozmlu4z.Xqedii_1303z0iykjin2(
                           "ZcqSEk6/ViEPQ+AaZZbTKp0u8JmDTpho92FIBTaEeAEvAiXD5jDUP49mFmmepDRYrzdKCK5Iwu1OFfTCO6O2dzo5UVwtTH80nhzzKA=="
                        )
                     );
                  } catch (Throwable var5) {
                     var2 = false;
                  }

                  Xqedii_21u50fv = Boolean.valueOf(var2);
                  return var2;
               }
            }
         }
      }
   }

   public static int Xqedii_316oplq() {
      if ((-599220763 * -599220763 - -599220763 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (Xqedii_3jrjopz) {
            try {
               return (int) Bukkit.class.getMethod("getCurrentTick").invoke(null);
            } catch (Throwable ignored) {
               return Xqedii_2j2spt3;
            }
         }
         return Xqedii_2j2spt3;
      }
   }

   public static void Xqedii_2rbu18a(Plugin var0) {
      if (((-1291620910 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!Xqedii_3jrjopz && var0 != null) {
         BukkitTask var1 = Xqedii_vvd3vht;
         if (var1 == null || var1.isCancelled()) {
            Xqedii_vvd3vht = Bukkit.getScheduler().runTaskTimer(var0, () -> {
               if ((1836698707 * 1836698707 - 1836698707 & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  Xqedii_2j2spt3 = Xqedii_2j2spt3 + Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(653540610, 14);
               }
            }, Xqedii_ozmlu4z.Xqedii_1ho00q57jkob8(4146883925676278218L, 21), Xqedii_ozmlu4z.Xqedii_2f4qfpevn94uc(-6540869837326097442L, 17));
         }
      }
   }

   public static void Xqedii_30bki1a() {
      if ((-1999382239 ^ -1999382239) != 0) {
         throw new IllegalStateException();
      } else {
         BukkitTask var0 = Xqedii_vvd3vht;
         Xqedii_vvd3vht = null;
         if (var0 != null) {
            try {
               var0.cancel();
            } catch (Throwable var2) {
            }
         }
      }
   }

   public static PlayerProfile Xqedii_a93o0le(Player var0) {
      if ((1446303275 * 1446303275 + 1446303275 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 == null) {
         return null;
      } else {
         try {
            Method var1 = Xqedii_10wf9lh;
            if (var1 == null) {
               var1 = OfflinePlayer.class
                  .getMethod(Xqedii_ozmlu4z.Xqedii_1303z0iykjin2("BKl93DDorf9ehvbQ6Pw6hHavtTe+LI/Cj55+K4arIIGDK/2/ngduLeIA95N1Zo+NmaV4Wzeue4efiZ4Y"));
               Xqedii_10wf9lh = var1;
            }

            return var1.invoke(var0) instanceof PlayerProfile var2 ? var2 : null;
         } catch (RuntimeException | LinkageError | ReflectiveOperationException var4) {
            return null;
         }
      }
   }

   public static boolean Xqedii_1x72a74(World var0) {
      if ((-1269889202 * -1269889202 + -1269889202 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         GameRule var1 = Xqedii_2n35yp2();
         if (var0 != null && var1 != null) {
            try {
               return ((!Boolean.FALSE.equals(var0.getGameRuleValue(var1))
                  ? Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(1082768655, 4)
                  : Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-515687176, 18)) != 0);
            } catch (Throwable var3) {
               return (Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316299837, 7) != 0);
            }
         } else {
            return (Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(971491082, 29) != 0);
         }
      }
   }

   public static Attribute Xqedii_36ek0ro() {
      if (((-821549657 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (Xqedii_1gcpkgs) {
         return Xqedii_taj1wm1;
      } else {
         Attribute var0 = null;
         String[] var10000 = new String[Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(1048646522, 29)];
         var10000[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 13)] = Xqedii_ozmlu4z.Xqedii_1303z0iykjin2(
            "Nbz84WqHCZNa1oQmzyx6YuMDdqZJ5VHwUI9BUuJXaCRqoKmSNkbTWc+5xFuWhuiZuvuWrl55ZrBKESTNRvBQcLQt6EigRQ=="
         );
         var10000[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316299837, 12)] = Xqedii_ozmlu4z.Xqedii_1303z0iykjin2(
            "zVxcvZr7/lT8EJ9JT7k1Kmy/9hneR+BHe9CAS60DRcqv3C09HrXJXzfsWh2gQbp3pQX0FayC"
         );
         String[] var1 = var10000;
         int var2 = var1.length;

         for (int var3 = Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 0); var3 < var2; var3++) {
            String var4 = var1[var3];
            if (Xqedii_c1smg22(Attribute.class, var4) instanceof Attribute var6) {
               var0 = var6;
               break;
            }
         }

         Xqedii_taj1wm1 = var0;
         Xqedii_1gcpkgs = (Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(171567047, 21) != 0);
         return var0;
      }
   }

   public static Sound Xqedii_ruc2zei(String var0) {
      if (((937090808 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var0 != null && !var0.isBlank()) {
         return Xqedii_c1smg22(Sound.class, var0) instanceof Sound var2 ? var2 : null;
      } else {
         return null;
      }
   }

   public static boolean Xqedii_32nlhe4(Player var0, float var1, float var2) {
      if (((1161488468 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var0 != null && !Xqedii_2mct6gi) {
         try {
            var0.setRotation(var1, var2);
            return (Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(1307081220, 15) != 0);
         } catch (UnsupportedOperationException var4) {
            Xqedii_2mct6gi = (Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316299837, 2) != 0);
            return (Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-818005936, 0) != 0);
         }
      } else {
         return (Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(1738480680, 31) != 0);
      }
   }

   public static void Xqedii_1clfsd0(Player var0, float var1, float var2) {
      if ((-469570815 * (-469570815 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && !Xqedii_32nlhe4(var0, var1, var2)) {
         Xqedii_3bqwxha(var0, var1, var2);
      }
   }

   public static void Xqedii_3bqwxha(Player var0, float var1, float var2) {
      if ((-89152257 * (-89152257 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            PacketEvents.getAPI()
               .getPlayerManager()
               .sendPacket(
                  var0,
                  new WrapperPlayServerPlayerPositionAndLook(
                     Double.longBitsToDouble(Xqedii_ozmlu4z.Xqedii_2f4qfpevn94uc(-6540869837325966370L, 35)),
                     Double.longBitsToDouble(Xqedii_ozmlu4z.Xqedii_1t1mom5xoiayb(-3594252660133523288L, 6)),
                     Double.longBitsToDouble(Xqedii_ozmlu4z.Xqedii_1t1mom5xoiayb(-3594252660133523288L, 39)),
                     var1,
                     var2,
                     (byte)Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1450517565, 26),
                     Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(1155432352, 11),
                     (Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 12) != 0)
                  )
               );
         } catch (Throwable var4) {
         }
      }
   }

   public static GameRule<Boolean> Xqedii_2n35yp2() {
      if ((1711561024 * (1711561024 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (Xqedii_33fwwlu) {
         return Xqedii_2744hxj;
      } else {
         GameRule var0 = null;
         String[] var10000 = new String[Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(933488657, 17)];
         var10000[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 24)] = Xqedii_ozmlu4z.Xqedii_1303z0iykjin2(
            "gv4vxn0xrM+E2Enucyyq7DpaLtLAGvwzv0PE05n6BXibfoYkEcBJAeuqpa4b2zvyzzsqU+LMaijlCSMBrMY="
         );
         var10000[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316299837, 16)] = Xqedii_ozmlu4z.Xqedii_1303z0iykjin2(
            "85rrop7Bel9eiQyZQK3BZYWELCHR4EN+BYWJJeEsZFE1dEFaIpFMISSUve559iPEmMieGA=="
         );
         String[] var1 = var10000;
         int var2 = var1.length;

         for (int var3 = Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(2141209822, 27); var3 < var2; var3++) {
            String var4 = var1[var3];
            if (Xqedii_c1smg22(GameRule.class, var4) instanceof GameRule var6 && Boolean.class.equals(var6.getType())) {
               var0 = var6;
               break;
            }
         }

         Xqedii_2744hxj = var0;
         Xqedii_33fwwlu = (Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826516230, 10) != 0);
         return var0;
      }
   }

   public static Object Xqedii_c1smg22(Class<?> var0, String var1) {
      if ((-1720095464 ^ -1720095464) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            Field var2 = var0.getField(var1);
            return var2.get(null);
         } catch (Throwable var3) {
            return null;
         }
      }
   }

   public static boolean Xqedii_2metxxl(Class<?> var0, String var1) {
      if (((-1864066829 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         try {
            Method var2 = var0.getMethod(var1);
            return Modifier.isStatic(var2.getModifiers());
         } catch (Throwable var3) {
            return (Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(-50190605, 30) != 0);
         }
      }
   }

   public static boolean Xqedii_269v6yv(Entity var0) {
      if ((-233352043 * -233352043 - -233352043 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!Xqedii_4mmto10()) {
         return Bukkit.isPrimaryThread();
      } else if (var0 == null) {
         return (Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 10) != 0);
      } else {
         try {
            String var10001 = Xqedii_ozmlu4z.Xqedii_1303z0iykjin2(
               "C2kqXqyx0chbyH3cetmeIGa40ynJLcXtHYF0d0lXuKJ0LhhcloS0VFu46gtK8lRSUzsOx05rj21MDYk8BedLKuO1wN29/mLz"
            );
            Class[] var10002 = new Class[Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(1372536376, 24)];
            var10002[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 27)] = Entity.class;
            Method var10000 = Bukkit.class.getMethod(var10001, var10002);
            Object[] var3 = new Object[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316299837, 28)];
            var3[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 8)] = var0;
            Object var1 = var10000.invoke(null, var3);
            return Boolean.TRUE.equals(var1);
         } catch (Throwable var2) {
            return (Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(-100381209, 31) != 0);
         }
      }
   }

   public static void Xqedii_1avvt9e(Plugin var0, Entity var1, Runnable var2) {
      if ((1770768901 * 1770768901 - 1770768901 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var2 != null) {
         if (!Xqedii_11kjq9u(var0, var1, var2, Xqedii_ozmlu4z.Xqedii_1t1mom5xoiayb(-3594252660133523288L, 16), null)) {
            if (Xqedii_4mmto10()) {
               Xqedii_34mipix(var0, var2);
            } else {
               Bukkit.getScheduler().runTask(var0, var2);
            }
         }
      }
   }

   public static void Xqedii_2sj63w1(Plugin var0, Entity var1, Runnable var2, long var3) {
      if ((418697657 * (418697657 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var2 != null) {
         long var5 = Math.max(Xqedii_ozmlu4z.Xqedii_2f4qfpevn94uc(-6540869837325966370L, 3), var3);
         if (var5 <= Xqedii_ozmlu4z.Xqedii_1ho00q57jkob8(-6658348782286445540L, 17)) {
            Xqedii_1avvt9e(var0, var1, var2);
         } else if (!Xqedii_11kjq9u(var0, var1, var2, var5, null)) {
            if (Xqedii_4mmto10()) {
               Xqedii_3npx6fi(var0, var2, var5);
            } else {
               Bukkit.getScheduler().runTaskLater(var0, var2, var5);
            }
         }
      }
   }

   public static void Xqedii_34mipix(Plugin var0, Runnable var1) {
      if (((836303109 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var1 != null) {
         if (!Xqedii_27hssek(var0, var1, Xqedii_ozmlu4z.Xqedii_1mvfgc150pqxx(-8879781160831861988L, 29))) {
            Bukkit.getScheduler().runTask(var0, var1);
         }
      }
   }

   public static void Xqedii_3npx6fi(Plugin var0, Runnable var1, long var2) {
      if (((-1311482100 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var1 != null) {
         long var4 = Math.max(Xqedii_ozmlu4z.Xqedii_2f4qfpevn94uc(-6540869837325966370L, 39), var2);
         if (var4 <= Xqedii_ozmlu4z.Xqedii_1t1mom5xoiayb(-3594252660133523288L, 7)) {
            Xqedii_34mipix(var0, var1);
         } else if (!Xqedii_27hssek(var0, var1, var4)) {
            Bukkit.getScheduler().runTaskLater(var0, var1, var4);
         }
      }
   }

   public static void Xqedii_u043a3q(Plugin var0, Runnable var1) {
      if (((-402708408 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var1 != null) {
         if (!Xqedii_4mmto10() || !Xqedii_35rg8b0(var0, var1)) {
            Bukkit.getScheduler().runTaskAsynchronously(var0, var1);
         }
      }
   }

   public static PlatformCompat.CancellableTask Xqedii_uplb4zf(Plugin var0, long var1, long var3, Runnable var5) {
      if (((291984612 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var5 != null) {
         long var6 = Math.max(Xqedii_ozmlu4z.Xqedii_1t1mom5xoiayb(3594252660133523287L, 17), var3);
         long var8 = Math.max(Xqedii_ozmlu4z.Xqedii_1mvfgc150pqxx(-5432029159770092952L, 4), var1);
         if (Xqedii_4mmto10()) {
            PlatformCompat.CancellableTask var10 = Xqedii_3nnzlsr(var0, var8, var6, var5);
            if (var10 != null) {
               return var10;
            }
         }

         Xqedii_z0t7eh7 var12 = new Xqedii_z0t7eh7();
         BukkitTask var11 = Bukkit.getScheduler().runTaskTimerAsynchronously(var0, var5, var8, var6);
         var12.Xqedii_2hpi5bz(var11);
         return var12;
      } else {
         return Xqedii_brkjme2.INSTANCE;
      }
   }

   public static void Xqedii_3rvp96a(Plugin var0, Runnable var1, long var2) {
      if ((1907878924 * 1907878924 - 1907878924 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var1 != null) {
         long var4 = Math.max(Xqedii_ozmlu4z.Xqedii_2f4qfpevn94uc(-6540869837326097442L, 17), var2);
         if (!Xqedii_4mmto10() || !Xqedii_3kq4z78(var0, var1, var4)) {
            Bukkit.getScheduler().runTaskLaterAsynchronously(var0, var1, var4);
         }
      }
   }

   public static PlatformCompat.CancellableTask Xqedii_j3mggbv(Plugin var0, Entity var1, long var2, long var4, Consumer<PlatformCompat.CancellableTask> var6) {
      if (((1332160780 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var1 != null && var6 != null) {
         long var7 = Math.max(Xqedii_ozmlu4z.Xqedii_2f4qfpevn94uc(-6540869837325966370L, 24), var2);
         long var9 = Math.max(Xqedii_ozmlu4z.Xqedii_2f4qfpevn94uc(-6612927431363894306L, 56), var4);
         Xqedii_18e36hc var11 = new Xqedii_18e36hc(var0, var1, var9, var6);
         Xqedii_2sj63w1(var0, var1, var11::Xqedii_h4h1qfo, var7);
         return var11;
      } else {
         return Xqedii_brkjme2.INSTANCE;
      }
   }

   public static boolean Xqedii_2pl8m41(Entity var0, Location var1) {
      if ((-710348642 * (-710348642 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var1 != null && var1.getWorld() != null) {
         try {
            if (var0.teleport(var1)) {
               return (Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316299837, 31) != 0);
            }
         } catch (Throwable var3) {
         }

         return ((Xqedii_4mmto10() && Xqedii_uy34zfv(var0, var1)
            ? Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517318, 6)
            : Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 12)) != 0);
      } else {
         return (Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-1031374351, 19) != 0);
      }
   }

   public static boolean Xqedii_fxq2htx(Entity var0, Location var1) {
      if ((1563836807 * 1563836807 + 1563836807 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var1 != null && var1.getWorld() != null) {
         try {
            return var0.teleport(var1);
         } catch (Throwable var3) {
            return ((Xqedii_4mmto10() && Xqedii_uy34zfv(var0, var1)
               ? Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-1549894544, 25)
               : Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-477819661, 12)) != 0);
         }
      } else {
         return (Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 21) != 0);
      }
   }

   public static boolean Xqedii_11kjq9u(Plugin var0, Entity var1, Runnable var2, long var3, Runnable var5) {
      if ((493253304 * 493253304 + 493253304 & 1) != 0) {
         throw new IllegalStateException();
      } else if (Xqedii_4mmto10() && var1 != null) {
         try {
            Method var6 = var1.getClass()
               .getMethod(Xqedii_ozmlu4z.Xqedii_1303z0iykjin2("Y9+QzLcQrBdR6/vzdlB2f49t+HVpRQve3Pf6bsKlGVm0HxBBjcC1fgG3HU7+X/LHEd0P2w=="));
            Object var7 = var6.invoke(var1);
            if (var7 == null) {
               return (Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 23) != 0);
            } else {
               Consumer var8 = var1x -> {
                  if ((537356270 * (537356270 + 1) & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     var2.run();
                  }
               };
               Runnable var9 = var5 != null ? var5 : () -> {
                  if ((-1914593687 * -1914593687 + -1914593687 & 1) != 0) {
                     throw new IllegalStateException();
                  }
               };
               if (var3 <= Xqedii_ozmlu4z.Xqedii_2f4qfpevn94uc(-6540869837325966370L, 14)) {
                  Class var13 = var7.getClass();
                  String var14 = Xqedii_ozmlu4z.Xqedii_1303z0iykjin2("j2ZTL6ndvo7/VbrV+c8cSCEXacP4WQNyUOWfEIQJ+uHitQ==");
                  Class[] var16 = new Class[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(818128646, 23)];
                  var16[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 27)] = Plugin.class;
                  var16[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517255, 0)] = Consumer.class;
                  var16[Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(326778497, 13)] = Runnable.class;
                  Method var12 = var13.getMethod(var14, var16);
                  Object[] var17 = new Object[Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-406386055, 5)];
                  var17[Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(-803049665, 2)] = var0;
                  var17[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517252, 1)] = var8;
                  var17[Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(1022943563, 2)] = var9;
                  var12.invoke(var7, var17);
                  return (Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-1625544473, 7) != 0);
               } else {
                  Class var10000 = var7.getClass();
                  String var10001 = Xqedii_ozmlu4z.Xqedii_1303z0iykjin2("a2jYj71sizvypNZpe+U6leuAOq9ilGmwGpwxixCwI5pHQdQLmOq0qYynGtfrSpun");
                  Class[] var10002 = new Class[Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(-1984086208, 12)];
                  var10002[Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(1155432352, 11)] = Plugin.class;
                  var10002[Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-2061700125, 20)] = Consumer.class;
                  var10002[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1324688445, 23)] = Runnable.class;
                  var10002[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826513158, 12)] = long.class;
                  Method var10 = var10000.getMethod(var10001, var10002);
                  Object[] var15 = new Object[Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(945082174, 16)];
                  var15[Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(217310085, 28)] = var0;
                  var15[Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-477815565, 12)] = var8;
                  var15[Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(2045887126, 3)] = var9;
                  var15[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1315251261, 19)] = var3;
                  var10.invoke(var7, var15);
                  return (Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(-1578626761, 25) != 0);
               }
            }
         } catch (Throwable var11) {
            return (Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 11) != 0);
         }
      } else {
         return (Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 8) != 0);
      }
   }

   public static boolean Xqedii_35rg8b0(Plugin var0, Runnable var1) {
      if ((-1183378826 * -1183378826 - -1183378826 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            Server var2 = Bukkit.getServer();
            Method var3 = var2.getClass()
               .getMethod(Xqedii_ozmlu4z.Xqedii_1303z0iykjin2("QDIQ1W3ZvZ0QRAQarFFYhiuxeSjHsEWsd9W6t9BD+dk4Sq8xyxpygfrEHyV4nOh0GKyq5J6epqRj3WUh9Kg="));
            Object var4 = var3.invoke(var2);
            if (var4 == null) {
               return (Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(2046722323, 21) != 0);
            } else {
               Consumer var5 = var1x -> {
                  if ((-1026829112 * -1026829112 - -1026829112 & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     var1.run();
                  }
               };
               Class var10000 = var4.getClass();
               String var10001 = Xqedii_ozmlu4z.Xqedii_1303z0iykjin2("kFgqfIhfVSXq8WKS0TFqwMEHbKgns7O6EWVPoI7cosRRflE8+nW+Vw==");
               Class[] var10002 = new Class[Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-477811469, 12)];
               var10002[Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-812772301, 6)] = Plugin.class;
               var10002[Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(36107325, 6)] = Consumer.class;
               Method var6 = var10000.getMethod(var10001, var10002);
               Object[] var8 = new Object[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316037693, 18)];
               var8[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 31)] = var0;
               var8[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517286, 5)] = var5;
               var6.invoke(var4, var8);
               return (Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(860071686, 25) != 0);
            }
         } catch (Throwable var7) {
            return (Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(1889640060, 17) != 0);
         }
      }
   }

   public static PlatformCompat.CancellableTask Xqedii_3nnzlsr(Plugin var0, long var1, long var3, Runnable var5) {
      if (((-1726163163 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         try {
            Server var6 = Bukkit.getServer();
            Method var7 = var6.getClass()
               .getMethod(Xqedii_ozmlu4z.Xqedii_1303z0iykjin2("QDIQ1W3ZvZ0QRAQarFFYhiuxeSjHsEWsd9W6t9BD+dk4Sq8xyxpygfrEHyV4nOh0GKyq5J6epqRj3WUh9Kg="));
            Object var8 = var7.invoke(var6);
            if (var8 == null) {
               return null;
            } else {
               long var9 = Math.max(
                  Xqedii_ozmlu4z.Xqedii_1mvfgc150pqxx(687181753119569465L, 30), var1 * Xqedii_ozmlu4z.Xqedii_1mvfgc150pqxx(-8596072554418776307L, 60)
               );
               long var11 = Math.max(
                  Xqedii_ozmlu4z.Xqedii_1mvfgc150pqxx(-2818085524581414071L, 16), var3 * Xqedii_ozmlu4z.Xqedii_2f4qfpevn94uc(-6540869407829236770L, 33)
               );
               TimeUnit var13 = TimeUnit.MILLISECONDS;
               Xqedii_z0t7eh7 var14 = new Xqedii_z0t7eh7();
               Consumer var15 = var2 -> {
                  if ((524044072 * 524044072 - 524044072 & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     if (!var14.isCancelled()) {
                        var5.run();
                     }
                  }
               };
               Method var16 = null;
               Method[] var17 = var8.getClass().getMethods();
               int var18 = var17.length;

               for (int var19 = Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(1070604911, 26); var19 < var18; var19++) {
                  Method var20 = var17[var19];
                  if (Xqedii_ozmlu4z.Xqedii_1303z0iykjin2("z8G0abHsl0mnOQIPcizIqvHtWUOG0jp8XN9QlVtU3azy/IxMO65aqMNDb8FBW2frDQ4q33yoAdM=")
                        .equals(var20.getName())
                     && var20.getParameterCount() == Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-477799181, 12)) {
                     var16 = var20;
                     break;
                  }
               }

               if (var16 == null) {
                  return null;
               } else {
                  Object[] var10002 = new Object[Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(326803073, 13)];
                  var10002[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 15)] = var0;
                  var10002[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316299837, 17)] = var15;
                  var10002[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(822322950, 21)] = var9;
                  var10002[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316430909, 16)] = var11;
                  var10002[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1315775549, 19)] = var13;
                  var17 = (Method[])var16.invoke(var8, var10002);
                  var14.Xqedii_oc0hnm3(var17);
                  return var14;
               }
            }
         } catch (Throwable var21) {
            return null;
         }
      }
   }

   public static boolean Xqedii_3kq4z78(Plugin var0, Runnable var1, long var2) {
      if ((2019149163 ^ 2019149163) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            Server var4 = Bukkit.getServer();
            Method var5 = var4.getClass()
               .getMethod(Xqedii_ozmlu4z.Xqedii_1303z0iykjin2("QDIQ1W3ZvZ0QRAQarFFYhiuxeSjHsEWsd9W6t9BD+dk4Sq8xyxpygfrEHyV4nOh0GKyq5J6epqRj3WUh9Kg="));
            Object var6 = var5.invoke(var4);
            if (var6 == null) {
               return (Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 0) != 0);
            } else {
               long var7 = Math.max(
                  Xqedii_ozmlu4z.Xqedii_2f4qfpevn94uc(-6540869839473450018L, 31), var2 * Xqedii_ozmlu4z.Xqedii_1ho00q57jkob8(8293767851423859604L, 22)
               );
               TimeUnit var9 = TimeUnit.MILLISECONDS;
               Consumer var10 = var1x -> {
                  if ((-855256216 * -855256216 + -855256216 & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     var1.run();
                  }
               };
               Method var11 = null;
               Method[] var12 = var6.getClass().getMethods();
               int var13 = var12.length;

               for (int var14 = Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(36107261, 6); var14 < var13; var14++) {
                  Method var15 = var12[var14];
                  if (Xqedii_ozmlu4z.Xqedii_1303z0iykjin2("a2jYj71sizvypNZpe+U6leuAOq9ilGmwGpwxixCwI5pHQdQLmOq0qYynGtfrSpun").equals(var15.getName())
                     && var15.getParameterCount() == Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826509062, 11)) {
                     var11 = var15;
                     break;
                  }
               }

               if (var11 == null) {
                  return (Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(1307048452, 15) != 0);
               } else {
                  Object[] var10002 = new Object[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826484486, 13)];
                  var10002[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 23)] = var0;
                  var10002[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(558081798, 28)] = var10;
                  var10002[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1584735293, 28)] = var7;
                  var10002[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316299833, 1)] = var9;
                  var11.invoke(var6, var10002);
                  return (Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(36107325, 6) != 0);
               }
            }
         } catch (Throwable var16) {
            return (Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 26) != 0);
         }
      }
   }

   public static boolean Xqedii_27hssek(Plugin var0, Runnable var1, long var2) {
      if ((-991641931 * (-991641931 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (!Xqedii_4mmto10()) {
         return (Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 11) != 0);
      } else {
         try {
            Server var4 = Bukkit.getServer();
            Method var5 = var4.getClass()
               .getMethod(
                  Xqedii_ozmlu4z.Xqedii_1303z0iykjin2(
                     "ZcqSEk6/ViEPQ+AaZZbTKp0u8JmDTpho92FIBTaEeAEvAiXD5jDUP49mFmmepDRYrzdKCK5Iwu1OFfTCO6O2dzo5UVwtTH80nhzzKA=="
                  )
               );
            Object var6 = var5.invoke(var4);
            if (var6 == null) {
               return (Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 24) != 0);
            } else {
               Consumer var7 = var1x -> {
                  if (((-934929938 << 1 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else {
                     var1.run();
                  }
               };
               if (var2 <= Xqedii_ozmlu4z.Xqedii_1ho00q57jkob8(-7619586746011814510L, 61)) {
                  Class var11 = var6.getClass();
                  String var12 = Xqedii_ozmlu4z.Xqedii_1303z0iykjin2("j2ZTL6ndvo7/VbrV+c8cSCEXacP4WQNyUOWfEIQJ+uHitQ==");
                  Class[] var14 = new Class[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(558081798, 27)];
                  var14[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 29)] = Plugin.class;
                  var14[Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-1636011869, 1)] = Consumer.class;
                  Method var10 = var11.getMethod(var12, var14);
                  Object[] var15 = new Object[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(289646342, 28)];
                  var15[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 14)] = var0;
                  var15[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316299837, 23)] = var7;
                  var10.invoke(var6, var15);
                  return (Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826516742, 9) != 0);
               } else {
                  Class var10000 = var6.getClass();
                  String var10001 = Xqedii_ozmlu4z.Xqedii_1303z0iykjin2("a2jYj71sizvypNZpe+U6leuAOq9ilGmwGpwxixCwI5pHQdQLmOq0qYynGtfrSpun");
                  Class[] var10002 = new Class[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517446, 6)];
                  var10002[Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(-803049665, 2)] = Plugin.class;
                  var10002[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316299837, 13)] = Consumer.class;
                  var10002[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517286, 4)] = long.class;
                  Method var8 = var10000.getMethod(var10001, var10002);
                  Object[] var13 = new Object[Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-1636175422, 27)];
                  var13[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 15)] = var0;
                  var13[Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(-1625544473, 7)] = var7;
                  var13[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826386182, 16)] = var2;
                  var8.invoke(var6, var13);
                  return (Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316299837, 18) != 0);
               }
            }
         } catch (Throwable var9) {
            return (Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 4) != 0);
         }
      }
   }

   public static boolean Xqedii_uy34zfv(Entity var0, Location var1) {
      if ((-108288348 * -108288348 - -108288348 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            Class var10000 = var0.getClass();
            String var10001 = Xqedii_ozmlu4z.Xqedii_1303z0iykjin2("WgPow2guaGHvwLBdTOgxZZgTmNRhyI+pLPxqHx74jQpmS0tZllBIUPmecVfsNk/auhUcF4j/");
            Class[] var10002 = new Class[Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(-789313381, 24)];
            var10002[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 21)] = Location.class;
            Method var2 = var10000.getMethod(var10001, var10002);
            Object[] var7 = new Object[Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316299837, 6)];
            var7[Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 26)] = var1;
            if (var2.invoke(var0, var7) instanceof CompletableFuture var4) {
               var4.exceptionally(var0x -> {
                  if (((-62227102 << 1 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else {
                     return null;
                  }
               });
            }

            return (Xqedii_ozmlu4z.Xqedii_1burf4w0ken3p(933357585, 17) != 0);
         } catch (NoSuchMethodException var5) {
            return (Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(472410015, 15) != 0);
         } catch (Throwable var6) {
            return (Xqedii_ozmlu4z.Xqedii_6xbx4e9nt51a(826517254, 16) != 0);
         }
      }
   }

   public static boolean Xqedii_3bgk87b(Class<?> var0, String var1) {
      if ((204927412 * 204927412 - 204927412 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var1 != null && !var1.isBlank()) {
         Method[] var2 = var0.getMethods();
         int var3 = var2.length;

         for (int var4 = Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 1); var4 < var3; var4++) {
            Method var5 = var2[var4];
            if (var1.equals(var5.getName())) {
               return (Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(-1316299837, 2) != 0);
            }
         }

         return (Xqedii_ozmlu4z.Xqedii_163ch6obe9cmf(1355759160, 24) != 0);
      } else {
         return (Xqedii_ozmlu4z.Xqedii_5upcptc3o5s4(1316299836, 7) != 0);
      }
   }

   static {
      if ((-154163780 * (-154163780 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_3jrjopz = Xqedii_2metxxl(
            Bukkit.class, Xqedii_ozmlu4z.Xqedii_1303z0iykjin2("zSHhNdfeG7VfJf0GZ+N6sSZL06jI0WK05Nfl3W1ZiWrYw8hiiu3xYAnzGCXKVM2X+FwsntM3oEI=")
         );
      }
   }
}
