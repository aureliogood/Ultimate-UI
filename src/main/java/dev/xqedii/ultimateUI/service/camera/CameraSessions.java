package dev.xqedii.ultimateUI.service.camera;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_2lhz965;
import dev.xqedii.ultimateUI.service.hud.HudService;
import dev.xqedii.ultimateUI.service.npc.CursorNpcService;
import java.util.UUID;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public abstract class CameraSessions extends CameraCleanup {
   public static final String Xqedii_2hottvwcotjg4 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String Xqedii_9sd4sb3 = Xqedii_2lhz965.Xqedii_15rr5vrbw2m8r(
      "3byLb7l830ghXM/y5XfKi9YfYCaKrNOCfBJd6Dz6lprZRrZI5FZ38PwLWhI0UscFV3bzo2T1Gwdma0O2jXNyZcQWRTj4UcMi+un4nMcASJ61hb1RXv+mi8ZN"
   );
   public static final String Xqedii_1k1j648 = Xqedii_2lhz965.Xqedii_15rr5vrbw2m8r(
      "ql2u9Nq0782MLM2tPakmPnm6O6JGeGfROVZl1hyB9ZqG84X6jsnFnGKSMmDqxH9AvkPp57VGXKOPIWxIKS90eR5ukcg/Ef3tm4ybvBGH14SCPg=="
   );

   public CameraSessions(UltimateUI var1, HudService var2, CursorNpcService var3) {
      super(var1, var2, var3);
   }

   public void reloadConfiguration() {
      if (((1506634787 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_1kofsx0 = this.Xqedii_1z4k73e();
         this.Xqedii_3shty0s = resolveInstantCursorSize(this.Xqedii_11is6fi.getConfig());
         this.Xqedii_bbqga21 = resolveInstantCursorHitboxLift(this.Xqedii_11is6fi.getConfig());
      }
   }

   public boolean Xqedii_1z4k73e() {
      if ((-1591439578 ^ -1591439578) != 0) {
         throw new IllegalStateException();
      } else {
         FileConfiguration var1 = this.Xqedii_11is6fi.getConfig();
         boolean var2 = var1.isSet(
            Xqedii_2lhz965.Xqedii_15rr5vrbw2m8r(
               "3byLb7l830ghXM/y5XfKi9YfYCaKrNOCfBJd6Dz6lprZRrZI5FZ38PwLWhI0UscFV3bzo2T1Gwdma0O2jXNyZcQWRTj4UcMi+un4nMcASJ61hb1RXv+mi8ZN"
            )
         );
         boolean var3;
         if (var1.isSet(
            Xqedii_2lhz965.Xqedii_15rr5vrbw2m8r(
               "ql2u9Nq0782MLM2tPakmPnm6O6JGeGfROVZl1hyB9ZqG84X6jsnFnGKSMmDqxH9AvkPp57VGXKOPIWxIKS90eR5ukcg/Ef3tm4ybvBGH14SCPg=="
            )
         )) {
            var3 = var1.getBoolean(
               Xqedii_2lhz965.Xqedii_15rr5vrbw2m8r(
                  "ql2u9Nq0782MLM2tPakmPnm6O6JGeGfROVZl1hyB9ZqG84X6jsnFnGKSMmDqxH9AvkPp57VGXKOPIWxIKS90eR5ukcg/Ef3tm4ybvBGH14SCPg=="
               )
            );
         } else if (var2) {
            var3 = var1.getBoolean(
               Xqedii_2lhz965.Xqedii_15rr5vrbw2m8r(
                  "3byLb7l830ghXM/y5XfKi9YfYCaKrNOCfBJd6Dz6lprZRrZI5FZ38PwLWhI0UscFV3bzo2T1Gwdma0O2jXNyZcQWRTj4UcMi+un4nMcASJ61hb1RXv+mi8ZN"
               )
            );
         } else {
            var3 = false;
         }

         if (var2) {
            var1.set(
               Xqedii_2lhz965.Xqedii_15rr5vrbw2m8r(
                  "3byLb7l830ghXM/y5XfKi9YfYCaKrNOCfBJd6Dz6lprZRrZI5FZ38PwLWhI0UscFV3bzo2T1Gwdma0O2jXNyZcQWRTj4UcMi+un4nMcASJ61hb1RXv+mi8ZN"
               ),
               null
            );
            var1.set(
               Xqedii_2lhz965.Xqedii_15rr5vrbw2m8r(
                  "ql2u9Nq0782MLM2tPakmPnm6O6JGeGfROVZl1hyB9ZqG84X6jsnFnGKSMmDqxH9AvkPp57VGXKOPIWxIKS90eR5ukcg/Ef3tm4ybvBGH14SCPg=="
               ),
               Boolean.valueOf(var3)
            );
            this.Xqedii_11is6fi.saveConfig();
            this.Xqedii_11is6fi.getLogger().info(Xqedii_2mgtj4fwlzt1y(var3));
         }

         return var3;
      }
   }

   public boolean isCameraActive(Player var1) {
      if ((943702425 ^ 943702425) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1npzu61.getOrDefault(var1.getUniqueId(), Boolean.valueOf((Xqedii_2lhz965.Xqedii_2nwz4yvbqn288(1636685999, 7) != 0)));
      }
   }

   public Location getCameraBaseLocation(Player var1) {
      if (((-270927071 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         Location var2 = this.Xqedii_20i24gg.get(var1.getUniqueId());
         return var2 == null ? null : var2.clone();
      }
   }

   public void setCameraActive(Player var1, boolean var2) {
      if (((-216705430 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         this.Xqedii_1npzu61.put(var1.getUniqueId(), var2);
      }
   }

   public void forceStop(Player var1) {
      if (((19552080 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_2xomr7i(var1, (Xqedii_2lhz965.Xqedii_1ea8wg7h4h5fc(-1337115694, 15) != 0));
      }
   }

   public void updateActiveCursorLayer(Player var1, double var2) {
      if (((1804721486 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && Double.isFinite(var2)) {
         UUID var4 = var1.getUniqueId();
         if (this.Xqedii_1npzu61.getOrDefault(var4, Boolean.valueOf((Xqedii_2lhz965.Xqedii_3di7yqltp23k5(318584274, 31) != 0)))) {
            this.Xqedii_sa0ugb8.put(var4, var2);
            Entity var5 = this.Xqedii_1ilze2o.getHud(var1, Xqedii_2lhz965.Xqedii_15rr5vrbw2m8r("O/fuQoeIxst1pW9JzDfOjAUv+H6wZgliCNfgVn8eDbc8pd1lUdPyvw=="));
            if (var5 != null) {
               Vector var6 = this.Xqedii_1ilze2o.getHudLocation(var5);
               if (var6 != null && !(Math.abs(var6.getZ() - var2) <= Double.longBitsToDouble(Xqedii_2lhz965.Xqedii_pn9rdnuzgihw(7339513249284065818L, 33)))) {
                  this.Xqedii_1ilze2o.moveHud(var5, new Vector(var6.getX(), var6.getY(), var2), this.Xqedii_139042g(), this.Xqedii_2jfx1cj());
               }
            }
         }
      }
   }

   public void setCursorListener(CameraBase.CursorListener var1) {
      if ((1607088771 ^ 1607088771) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_2g25cps = var1;
      }
   }

   public void lockCursorVisual(Player var1, double var2, double var4) {
      if ((-647543851 * -647543851 - -647543851 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && Double.isFinite(var2) && Double.isFinite(var4)) {
         double var6 = Double.longBitsToDouble(Xqedii_2lhz965.Xqedii_tm2fitrq6ait(-588925065797576296L, 4));
         Entity var8 = this.Xqedii_1ilze2o.getHud(var1, Xqedii_2lhz965.Xqedii_15rr5vrbw2m8r("O/fuQoeIxst1pW9JzDfOjAUv+H6wZgliCNfgVn8eDbc8pd1lUdPyvw=="));
         if (var8 != null) {
            Vector var9 = this.Xqedii_1ilze2o.getHudLocation(var8);
            if (var9 != null && Double.isFinite(var9.getZ())) {
               var6 = var9.getZ();
            }
         }

         this.Xqedii_28k36d4.put(var1.getUniqueId(), new Vector(var2, var4, var6));
         this.Xqedii_2ebsa64.put(var1.getUniqueId(), var1.getLocation().getPitch());
      }
   }

   public void unlockCursorVisual(Player var1) {
      if (((1537619100 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         this.Xqedii_28k36d4.remove(var1.getUniqueId());
         this.Xqedii_2ebsa64.remove(var1.getUniqueId());
      }
   }

   public void suppressStoneBreakAndHitSounds(Player var1) {
      if ((-684718580 * -684718580 + -684718580 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         var1.stopSound(Sound.BLOCK_STONE_BREAK, SoundCategory.BLOCKS);
         var1.stopSound(Sound.BLOCK_STONE_HIT, SoundCategory.BLOCKS);
      }
   }

   public void refreshClientBarrierCube(Player var1) {
      if ((23952572 ^ 23952572) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         if (this.Xqedii_1npzu61.getOrDefault(var1.getUniqueId(), Boolean.valueOf((Xqedii_2lhz965.Xqedii_2nwz4yvbqn288(1668688856, 13) != 0)))) {
            this.Xqedii_239r2zk(var1, this.Xqedii_f9unzdz(var1), (Xqedii_2lhz965.Xqedii_1ea8wg7h4h5fc(-1337083182, 8) != 0));
         }
      }
   }

   public double Xqedii_mokixov(UUID var1, double var2) {
      if ((-655480121 ^ -655480121) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return var2;
      } else {
         Double var4 = this.Xqedii_sa0ugb8.get(var1);
         return var4 != null && Double.isFinite(var4) ? var4 : var2;
      }
   }

   public double Xqedii_1484j9j(double var1) {
      if ((-320480095 ^ -320480095) != 0) {
         throw new IllegalStateException();
      } else {
         return Double.isFinite(var1) && var1 > Double.longBitsToDouble(Xqedii_2lhz965.Xqedii_i1uoaeeobzpn(-2187745643277426374L, 10))
            ? var1
            : Double.longBitsToDouble(Xqedii_2lhz965.Xqedii_23cul821eou2i(-4850712433714865832L, 7));
      }
   }

   private static /* synthetic */ String Xqedii_2mgtj4fwlzt1y(boolean bl) {
        return Xqedii_2lhz965.Xqedii_15rr5vrbw2m8r("CTJkfyEgJ8mnP05/ZWZCX2UWfq+3MeI0EcBvJ8gav0diYpExba/z3Bavyafb4mm3NBWVS85sTf2AoeV8Uq4FJMlup7jQ5GdoN7Q0aEN7gavKl5EsmFwzC6Nkxbd2+THXomBVsfP2Ajo48FG8d9yhsAXAJU4rv2V2cIfaMqSPB8t/y5tmsXkY7AQ7R/08gL3LlDNcWKUnch9MzDkOU1pIjpZc24inroBR") + bl + Xqedii_2lhz965.Xqedii_15rr5vrbw2m8r("mhXPwq5X0f/XKTOrQOhgBEAWd1WngNmvoruMT1gaGVkMPxehKXeN0S/rqHedC9b3DQ5OruMCTuRouoHQn0vbiypS4e5mCEnUUkFftKWrWQAz4M6/83DIUPB1x1U=");
    }
}
