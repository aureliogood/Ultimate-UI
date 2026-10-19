package dev.xqedii.ultimateUI.service.camera;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_2hd31nw;
import dev.xqedii.ultimateUI.Xqedii_36tkamy;
import dev.xqedii.ultimateUI.service.hud.HudService;
import dev.xqedii.ultimateUI.service.npc.CursorNpcService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public abstract class CameraPlacement extends CameraBase {
   public static final String Xqedii_2nnu6f62ypmrm = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public CameraPlacement(UltimateUI var1, HudService var2, CursorNpcService var3) {
      super(var1, var2, var3);
   }

   public Location Xqedii_13w07gw(Player var1) {
      if (((229786745 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         UUID var2 = var1.getUniqueId();
         Location var3 = this.Xqedii_20i24gg.get(var2);
         if (var3 != null && var3.getWorld() != null && var3.getWorld().equals(var1.getWorld())) {
            return var3.clone();
         } else {
            Location var4 = var1.getLocation().clone();
            Location var5 = this.Xqedii_n3z23ui.get(var2);
            int var6 = var5 != null && var5.getWorld() != null && var5.getWorld().equals(var4.getWorld())
               ? Xqedii_36tkamy.Xqedii_3l1o07mruyyg7(-2080083052, 28)
               : Xqedii_36tkamy.Xqedii_3l1o07mruyyg7(2080083051, 9);
            Entity var7 = var1.getVehicle();
            if (var7 != null
               && var7.hasMetadata(
                  Xqedii_36tkamy.Xqedii_2l47bwei2wf94("UAaQfyiUeVTaxvXvhmisqPjCnRt2FolX9WvRKjDrcu883nn7Q5MuDsDrNbscvnWEMDPy0c1aobvKVsENQbxTofi6bY5OBg==")
               )) {
               if (var6 != 0) {
                  return var5.clone();
               } else {
                  double var13 = Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2caewnkwy82ik(2251341958598317125L, 13));
                  double var10 = Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2nueaacvpu5oo(-7407288387081480314L, 33));
                  return var4.subtract(Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2caewnkwy82ik(2251341958598317125L, 31)), var13, var10);
               }
            } else if (var6 != 0 && this.Xqedii_2f2l02r(var2, var4)) {
               Location var12 = var5.clone();
               var12.setYaw(var4.getYaw());
               var12.setPitch(var4.getPitch());
               return var12;
            } else if (var6 != 0 && var5.distanceSquared(var4) <= Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2caewnkwy82ik(7340612472218909265L, 36))) {
               Location var8 = var5.clone();
               var8.setYaw(var4.getYaw());
               var8.setPitch(var4.getPitch());
               return var8;
            } else {
               return var4;
            }
         }
      }
   }

   public boolean Xqedii_2f2l02r(UUID var1, Location var2) {
      if ((-845428710 * (-845428710 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Location var3 = this.Xqedii_6e16db9.get(var1);
         return ((var3 != null
               && var3.getWorld() != null
               && var3.getWorld().equals(var2.getWorld())
               && var3.distanceSquared(var2) <= Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_x7fnasdye975(-3600385913101018747L, 9))
            ? Xqedii_36tkamy.Xqedii_1nt47jj9bobiy(-1134973250, 3)
            : Xqedii_36tkamy.Xqedii_1nt47jj9bobiy(-1134973258, 18)) != 0);
      }
   }

   public Location Xqedii_w1hrktp(Player var1, Location var2) {
      if ((-1801254072 * (-1801254072 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         World var3 = var2.getWorld();
         if (var3 == null) {
            return var2;
         } else if (this.Xqedii_gubex8g(var3, var2.getBlockX(), var2.getBlockY(), var2.getBlockZ())) {
            return var2.clone();
         } else {
            double var4 = Math.toRadians(var2.getYaw());
            Vector var6 = new Vector(-Math.sin(var4), Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2nueaacvpu5oo(2123563305466810802L, 13)), Math.cos(var4));
            if (var6.lengthSquared() < Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2caewnkwy82ik(-7393747712259489155L, 49))) {
               var6 = new Vector(
                  Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2e7hz816sqtd9(6593893822796535005L, 41)),
                  Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2nueaacvpu5oo(-8692481210488073108L, 11)),
                  Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2caewnkwy82ik(2251341958598142789L, 20))
               );
            } else {
               var6.normalize();
            }

            Vector var7 = new Vector(var6.getZ(), Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2caewnkwy82ik(2251341958598317125L, 50)), -var6.getX());
            Vector var8 = var7.clone().multiply(Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2nueaacvpu5oo(-9165226150137375962L, 46)));
            Vector var9 = var6.clone().multiply(Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2nueaacvpu5oo(4640758961786087827L, 45)));
            List var10 = List.of(var8, var7, var6, var9, var6.clone().add(var8), var6.clone().add(var7), var9.clone().add(var8), var9.clone().add(var7));
            double[] var10000 = new double[Xqedii_36tkamy.Xqedii_2qrdj0ydyjf1k(2117172459, 23)];
            var10000[Xqedii_36tkamy.Xqedii_2qrdj0ydyjf1k(-1208805426, 19)] = Double.longBitsToDouble(
               Xqedii_36tkamy.Xqedii_2caewnkwy82ik(2251341967188251717L, 35)
            );
            var10000[Xqedii_36tkamy.Xqedii_vplyqmukj3i3(521973337, 18)] = Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2caewnkwy82ik(2251341958602513477L, 24));
            double[] var11 = var10000;
            double[] var12 = var11;
            int var13 = var11.length;

            for (int var14 = Xqedii_36tkamy.Xqedii_3l1o07mruyyg7(2080083051, 12); var14 < var13; var14++) {
               double var15 = var12[var14];

               for (Vector var18 : (Iterable<Vector>) (var10)) {

                  Vector var19 = var18.clone();
                  if (!(var19.lengthSquared() < Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2nueaacvpu5oo(1527210321716864345L, 19)))) {
                     var19.normalize().multiply(var15);
                     Location var20 = this.Xqedii_2734z2f(var3, var2, var19.getX(), var19.getZ());
                     if (var20 != null) {
                        return var20;
                     }
                  }
               }
            }

            return var2;
         }
      } else {
         return var2;
      }
   }

   public Location Xqedii_2734z2f(World var1, Location var2, double var3, double var5) {
      if ((-1888793279 * -1888793279 + -1888793279 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         int var7 = (int)Math.floor(var2.getX() + var3);
         int var8 = (int)Math.floor(var2.getZ() + var5);
         int var9 = var2.getBlockY();
         int var10 = var1.getMinHeight();
         int var11 = var1.getMaxHeight() - Xqedii_36tkamy.Xqedii_2qrdj0ydyjf1k(1597693932, 5);
         int[] var10000 = new int[Xqedii_36tkamy.Xqedii_vplyqmukj3i3(1499247166, 27)];
         var10000[Xqedii_36tkamy.Xqedii_1nt47jj9bobiy(-1134973258, 23)] = Xqedii_36tkamy.Xqedii_3l1o07mruyyg7(2080083051, 20);
         var10000[Xqedii_36tkamy.Xqedii_3l1o07mruyyg7(-2080083052, 0)] = Xqedii_36tkamy.Xqedii_1nt47jj9bobiy(-1136021834, 20);
         var10000[Xqedii_36tkamy.Xqedii_2qrdj0ydyjf1k(-1947771919, 2)] = Xqedii_36tkamy.Xqedii_2qrdj0ydyjf1k(103350685, 8);
         var10000[Xqedii_36tkamy.Xqedii_1nt47jj9bobiy(-1135071562, 15)] = Xqedii_36tkamy.Xqedii_1nt47jj9bobiy(-1135497546, 18);
         var10000[Xqedii_36tkamy.Xqedii_3l1o07mruyyg7(-2080082540, 9)] = Xqedii_36tkamy.Xqedii_3l1o07mruyyg7(2071694443, 22);
         int[] var12 = var10000;
         int[] var13 = var12;
         int var14 = var12.length;

         for (int var15 = Xqedii_36tkamy.Xqedii_vplyqmukj3i3(-1940444017, 25); var15 < var14; var15++) {
            int var16 = var13[var15];
            int var17 = var9 + var16;
            if (var17 >= var10 && var17 + Xqedii_36tkamy.Xqedii_vplyqmukj3i3(-445462280, 29) <= var11 && this.Xqedii_gubex8g(var1, var7, var17, var8)) {
               return new Location(
                  var1,
                  var7 + Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2caewnkwy82ik(2251341958596310085L, 24)),
                  var17,
                  var8 + Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2e7hz816sqtd9(-5926425395502577042L, 40)),
                  var2.getYaw(),
                  var2.getPitch()
               );
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public boolean Xqedii_gubex8g(World var1, int var2, int var3, int var4) {
      if ((1981229432 ^ 1981229432) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_36tkamy.Xqedii_3l1o07mruyyg7(2080083051, 9) != 0);
      } else {
         return ((!var1.getBlockAt(var2, var3, var4).getType().isSolid()
               && !var1.getBlockAt(var2, var3 + Xqedii_36tkamy.Xqedii_1nt47jj9bobiy(-1134973262, 2), var4).getType().isSolid()
            ? Xqedii_36tkamy.Xqedii_vplyqmukj3i3(-238361199, 22)
            : Xqedii_36tkamy.Xqedii_1nt47jj9bobiy(-1134973258, 19)) != 0);
      }
   }

   public void Xqedii_239r2zk(Player var1, Location var2, boolean var3) {
      if ((872375612 * 872375612 - 872375612 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         World var4 = var1.getWorld();
         UUID var5 = var1.getUniqueId();
         int var6 = var2.getBlockX();
         int var7 = var2.getBlockY();
         int var8 = (int)Math.round(Double.longBitsToDouble(Xqedii_36tkamy.Xqedii_2caewnkwy82ik(2251341958598317125L, 61)));
         int var9 = var2.getBlockZ() - var8;
         Xqedii_2hd31nw var10 = new Xqedii_2hd31nw(var6, var7, var9);
         Xqedii_2hd31nw var11 = this.Xqedii_1zrugzw.get(var5);
         if (var3 || !var10.equals(var11)) {
            this.Xqedii_1zrugzw.put(var5, var10);
            Set var12 = this.Xqedii_338djp8.computeIfAbsent(var5, var0 -> {
               if ((-1743377589 * (-1743377589 + 1) & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  return new HashSet<>();
               }
            });
            HashSet var13 = new HashSet();
            Xqedii_2hd31nw var14 = this.Xqedii_1elzwyo.get(var5);

            for (int var15 = Xqedii_36tkamy.Xqedii_2qrdj0ydyjf1k(206700858, 9); var15 <= Xqedii_36tkamy.Xqedii_1nt47jj9bobiy(-1118196042, 23); var15++) {
               for (int var16 = Xqedii_36tkamy.Xqedii_vplyqmukj3i3(2084747620, 20); var16 <= Xqedii_36tkamy.Xqedii_vplyqmukj3i3(-886840299, 7); var16++) {
                  for (int var17 = Xqedii_36tkamy.Xqedii_2qrdj0ydyjf1k(413401716, 10); var17 <= Xqedii_36tkamy.Xqedii_1nt47jj9bobiy(-1134973770, 8); var17++) {
                     int var18 = var6 + var15;
                     int var19 = var7 + var16;
                     int var20 = var9 + var17;
                     if (var4.getBlockAt(var18, var19, var20).getType().isAir()) {
                        Xqedii_2hd31nw var21 = new Xqedii_2hd31nw(var18, var19, var20);
                        if (!Xqedii_1firv3d(var21, var14)) {
                           var13.add(var21);
                           if (var3 || !var12.contains(var21)) {
                              var1.sendBlockChange(new Location(var4, var18, var19, var20), Xqedii_25bfamp);
                           }
                        }
                     }
                  }
               }
            }

            for (Xqedii_2hd31nw var23 : (Iterable<Xqedii_2hd31nw>) (var12)) {

               if (!var13.contains(var23) && !Xqedii_1firv3d(var23, var14)) {
                  var1.sendBlockChange(
                     new Location(var4, var23.Xqedii_3u2rq5h, var23.Xqedii_1kayom0, var23.Xqedii_1t1x42s),
                     var4.getBlockAt(var23.Xqedii_3u2rq5h, var23.Xqedii_1kayom0, var23.Xqedii_1t1x42s).getBlockData()
                  );
               }
            }

            var12.clear();
            var12.addAll(var13);
         }
      }
   }

   public static boolean Xqedii_1firv3d(Xqedii_2hd31nw var0, Xqedii_2hd31nw var1) {
      if (((1035077187 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var0 == null || var1 == null) {
         return (Xqedii_36tkamy.Xqedii_1nt47jj9bobiy(-1134973258, 1) != 0);
      } else if (var0.Xqedii_3u2rq5h == var1.Xqedii_3u2rq5h && var0.Xqedii_1t1x42s == var1.Xqedii_1t1x42s) {
         int var2 = var0.Xqedii_1kayom0 - var1.Xqedii_1kayom0;
         return ((var2 >= 0 && var2 < Xqedii_36tkamy.Xqedii_1nt47jj9bobiy(-1101418826, 24)
            ? Xqedii_36tkamy.Xqedii_3l1o07mruyyg7(-2080083052, 2)
            : Xqedii_36tkamy.Xqedii_vplyqmukj3i3(-970222009, 24)) != 0);
      } else {
         return (Xqedii_36tkamy.Xqedii_3l1o07mruyyg7(2080083051, 22) != 0);
      }
   }

   public void Xqedii_3mkxzpu(Player var1) {
      if (((1875198945 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         UUID var2 = var1.getUniqueId();
         this.Xqedii_1zrugzw.remove(var2);
         Set var3 = this.Xqedii_338djp8.remove(var2);
         if (var3 != null && !var3.isEmpty()) {
            World var4 = var1.getWorld();

            for (Xqedii_2hd31nw var6 : (Iterable<Xqedii_2hd31nw>) (var3)) {

               var1.sendBlockChange(
                  new Location(var4, var6.Xqedii_3u2rq5h, var6.Xqedii_1kayom0, var6.Xqedii_1t1x42s),
                  var4.getBlockAt(var6.Xqedii_3u2rq5h, var6.Xqedii_1kayom0, var6.Xqedii_1t1x42s).getBlockData()
               );
            }
         }
      }
   }
}
