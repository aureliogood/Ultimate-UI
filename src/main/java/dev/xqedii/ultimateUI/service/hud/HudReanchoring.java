package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_2t8d8j4;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.Xqedii_55753dg;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerDestroyEntities;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public abstract class HudReanchoring extends HudTransforms {
   public static final String Xqedii_zrxhe9fy457b = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public HudReanchoring(UltimateUI var1) {
      super(var1);
   }

   public void refreshRuntimeHudAnchoring(Player var1, List<String> var2, Vector var3, int var4) {
      if ((372913678 * 372913678 + 372913678 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.refreshRuntimeHudAnchoring(var1, var2, var3, var4, (Xqedii_55753dg.Xqedii_3dofn4hit75u0(986732030, 4) != 0));
      }
   }

   public void refreshRuntimeHudAnchoring(Player var1, List<String> var2, Vector var3, int var4, boolean var5) {
      if ((-1022002678 * -1022002678 + -1022002678 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         if (var2 != null && !var2.isEmpty()) {
            int var6 = var3 != null && Double.isFinite(var3.getX()) && Double.isFinite(var3.getY()) && Double.isFinite(var3.getZ())
               ? Xqedii_55753dg.Xqedii_r2ld43yslohb(-535290234, 5)
               : Xqedii_55753dg.Xqedii_r2ld43yslohb(-1447557625, 27);
            int var7 = var6 != 0
                  && Math.abs(var3.getX()) + Math.abs(var3.getY()) + Math.abs(var3.getZ())
                     > Double.longBitsToDouble(Xqedii_55753dg.Xqedii_2brizj3fud63n(8515124978801875970L, 61))
               ? Xqedii_55753dg.Xqedii_3dofn4hit75u0(986732030, 23)
               : Xqedii_55753dg.Xqedii_2s59p1lqhe74y(-89673963, 6);

            for (String var9 : var2) {
               if (var9 != null && !var9.isBlank()) {
                  Entity var10 = this.getHud(var1, var9);
                  if (var10 != null
                     && var10.isValid()
                     && !var10.isDead()
                     && !var10.hasMetadata(
                        Xqedii_55753dg.Xqedii_9ag7fc002542("RLDgl0LisBThNG1RTijTRUhNMP/Z2Jx8f1RxJjHvOHovJvoTF85mDZUclU2KGrXZpPuOTGI+FzmMm5g3")
                     )) {
                     if (this.Xqedii_341vpyd(var10)) {
                        if (var7 != 0) {
                           this.Xqedii_3d1p9op(var10, var1);
                        }
                     } else {
                        int var11 = var10.getVehicle() != var1 && !var1.getPassengers().contains(var10)
                           ? Xqedii_55753dg.Xqedii_2s59p1lqhe74y(-1135088994, 24)
                           : Xqedii_55753dg.Xqedii_2s59p1lqhe74y(-676659885, 21);
                        if (var5 && var11 == 0) {
                           try {
                              var1.addPassenger(var10);
                           } catch (Throwable var15) {
                           }

                           var11 = var10.getVehicle() != var1 && !var1.getPassengers().contains(var10)
                              ? Xqedii_55753dg.Xqedii_2o1609kc6sya5(-213779071, 2)
                              : Xqedii_55753dg.Xqedii_3dofn4hit75u0(986732030, 2);
                        }

                        if (var11 == 0 && var7 != 0) {
                           Location var12 = var1.getLocation();
                           if (var12 != null && var12.getWorld() != null) {
                              Xqedii_38o2zes.Xqedii_fxq2htx(var10, this.Xqedii_2x210wg(var10, var12));
                           }

                           if (var5) {
                              try {
                                 var1.addPassenger(var10);
                              } catch (Throwable var14) {
                              }
                           }
                        }
                     }
                  }
               }
            }

            this.Xqedii_2ebi45u(var1);
         } else {
            this.Xqedii_2ebi45u(var1);
         }
      }
   }

   public void reanchorRuntimeHuds(Player var1) {
      if ((-692778100 ^ -692778100) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         this.Xqedii_2apkuy1.remove(var1.getUniqueId());
         Map var2 = this.Xqedii_7rxyqib.get(var1.getUniqueId());
         if (var2 != null) {
            for (Xqedii_2t8d8j4 var4 : (Iterable<Xqedii_2t8d8j4>) (new ArrayList(var2.values()))) {

               if (this.Xqedii_1c8js4j(var1, var4)) {
                  this.Xqedii_1ofz50z(var1, var4);
               } else {
                  var4.Xqedii_1co5qbi = (Xqedii_55753dg.Xqedii_2o1609kc6sya5(-213779071, 0) != 0);
                  this.Xqedii_202hfuk(var1, new WrapperPlayServerDestroyEntities(var4.Xqedii_1qxgv1w));
               }

               this.Xqedii_32cmird(var1, var4);
            }
         }

         Location var8 = var1.getLocation();

         for (Entity var5 : this.getAllHuds(var1)) {
            if (var5 != null
               && var5.isValid()
               && !var5.isDead()
               && !var5.hasMetadata(Xqedii_55753dg.Xqedii_9ag7fc002542("RLDgl0LisBThNG1RTijTRUhNMP/Z2Jx8f1RxJjHvOHovJvoTF85mDZUclU2KGrXZpPuOTGI+FzmMm5g3"))) {
               if (this.Xqedii_341vpyd(var5)) {
                  if (var8 != null && var8.getWorld() != null) {
                     Xqedii_38o2zes.Xqedii_fxq2htx(var5, this.Xqedii_2x210wg(var5, var8));
                  }
               } else if (var5.getVehicle() != var1 && !var1.getPassengers().contains(var5)) {
                  if (var8 != null && var8.getWorld() != null) {
                     Xqedii_38o2zes.Xqedii_fxq2htx(var5, this.Xqedii_2x210wg(var5, var8));
                  }

                  try {
                     var1.addPassenger(var5);
                  } catch (Throwable var7) {
                  }
               }
            }
         }

         this.Xqedii_2w0ej97(var1);
         this.Xqedii_2ebi45u(var1);
      }
   }

   public void resendAllHudPositions(Player var1) {
      if (((-257621876 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         for (Entity var3 : this.getAllHuds(var1)) {
            Vector var4 = this.getHudLocation(var3);
            if (var4 != null) {
               this.moveHud(var3, var4, Xqedii_55753dg.Xqedii_3dofn4hit75u0(986732030, 18));
            }
         }

         Map var5 = this.Xqedii_7rxyqib.get(var1.getUniqueId());
         if (var5 != null) {
            for (Xqedii_2t8d8j4 var7 : (Iterable<Xqedii_2t8d8j4>) (new ArrayList(var5.values()))) {

               this.Xqedii_19o8tyr(var1, var7);
            }
         }
      }
   }
}
