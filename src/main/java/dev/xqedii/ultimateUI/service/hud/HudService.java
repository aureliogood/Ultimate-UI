package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_1dja6bw;
import dev.xqedii.ultimateUI.Xqedii_24hlumi;
import dev.xqedii.ultimateUI.Xqedii_2t8d8j4;
import dev.xqedii.ultimateUI.service.bossbar.BossbarEntityRect;
import dev.xqedii.ultimateUI.service.bossbar.BossbarHudSnapshot;
import dev.xqedii.ultimateUI.service.bossbar.BossbarRenderService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay.TextAlignment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.util.Transformation;
import org.bukkit.util.Vector;
import org.joml.Matrix3f;
import org.joml.Quaternionf;

public class HudService extends WorldDisplays implements BossbarRenderService.SnapshotSource {
   public static final String Xqedii_1yxgitss6oydc = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final double Xqedii_1ixxkxp = 0.75;
   public static final double Xqedii_znjbkzj = 0.27;
   public static final double Xqedii_22bwet1 = 0.25;
   public static final float Xqedii_399g8t2 = 0.99995F;
   public static final float Xqedii_3l8e6bu = 0.002F;
   public static final double Xqedii_iqo925h = 0.01;

   public HudService(UltimateUI var1) {
      super(var1);
      this.registerVirtualHudPassengerGuard();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public List<BossbarHudSnapshot> snapshot(Player var1) {
      if (((121258182 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var2 = new ArrayList();
         if (var1 == null) {
            return var2;
         } else {
            Map var3 = this.Xqedii_7rxyqib.get(var1.getUniqueId());
            if (var3 != null && !var3.isEmpty()) {
               for (Xqedii_2t8d8j4 var5 : (Iterable<Xqedii_2t8d8j4>) (var3.values())) {

                  if (var5.Xqedii_2e2q47u != null && var5.Xqedii_1pjv5dx != null) {
                     int var6 = switch (dev.xqedii.ultimateUI.Xqedii_jae0sae.Xqedii_3am8z4q[this.Xqedii_3r2d8xo(var5.Xqedii_1xdxr33).ordinal()]) {
                        case 1 -> Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(-523837322, 18);
                        case 2 -> Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(-2093252133, 20);
                        default -> Xqedii_1dja6bw.Xqedii_4xmczn0gp2op(219471283, 18);
                     };
                     String var7 = var5.Xqedii_22p5vll == null
                        ? Xqedii_1dja6bw.Xqedii_befy4kzl677j("YzNmUnALFVNJD7vhTWo/TUrBYqZ9JIx6o8EhWQ==")
                        : var5.Xqedii_22p5vll;
                     if (!var7.equals(var5.Xqedii_3n84eqp) || var5.Xqedii_ykl24s2 == null) {
                        var5.Xqedii_ykl24s2 = this.Xqedii_3oiuki3(this.Xqedii_wgkgkwo(var7));
                        var5.Xqedii_3n84eqp = var7;
                     }

                     int var8 = !(var5.Xqedii_1pjv5dx.getX() < Double.longBitsToDouble(Xqedii_1dja6bw.Xqedii_1v24d2vi9ukin(5832322215288901855L, 26)))
                           && !(var5.Xqedii_1pjv5dx.getY() < Double.longBitsToDouble(Xqedii_1dja6bw.Xqedii_2se1khn3ycieo(-827445742433654962L, 23)))
                        ? Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(1846308359, 14)
                        : Xqedii_1dja6bw.Xqedii_4xmczn0gp2op(219471283, 9);
                     int var9 = this.Xqedii_1gzopob(var5);

                     int var10 = switch (var5.Xqedii_1wwp4eo) {
                        case 10000 -> Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(-2050953791, 27);
                        case 30000 -> Xqedii_1dja6bw.Xqedii_z0fadtjq372o(502651134, 26);
                        default -> Xqedii_1dja6bw.Xqedii_3ic447wemb0bz(-2138606380, 20);
                     };
                     var2.add(
                        new BossbarHudSnapshot(
                           var5.Xqedii_26svack,
                           var5.Xqedii_2e2q47u.getX(),
                           var5.Xqedii_2e2q47u.getY(),
                           var5.Xqedii_2e2q47u.getZ(),
                           Math.abs(var5.Xqedii_1pjv5dx.getX()),
                           Math.abs(var5.Xqedii_1pjv5dx.getY()),
                           var5.Xqedii_ykl24s2,
                           var6,
                           this.Xqedii_3clos9k(var5.Xqedii_n6wcxc4),
                           var5.Xqedii_1rxjdzu > 0 ? var5.Xqedii_1rxjdzu : Xqedii_1dja6bw.Xqedii_4xmczn0gp2op(219721139, 12),
                           var5.Xqedii_g4y6hze,
                           ((var8 == 0 && var9 >= 0
                              ? Xqedii_1dja6bw.Xqedii_4xmczn0gp2op(-219471284, 9)
                              : Xqedii_1dja6bw.Xqedii_z0fadtjq372o(-1362628401, 5)) != 0),
                           var10,
                           Math.max(Xqedii_1dja6bw.Xqedii_z0fadtjq372o(1677219799, 12), var9)
                        )
                     );
                  }
               }

               return var2;
            } else {
               return var2;
            }
         }
      }
   }

   @Override
   public List<BossbarEntityRect> entityRects(Player var1) {
      if ((-767950003 ^ -767950003) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var2 = new ArrayList();
         if (var1 == null) {
            return var2;
         } else {
            Set var3 = this.Xqedii_2e9emiq.get(var1.getUniqueId());
            if (var3 != null && !var3.isEmpty()) {
               for (Entity var5 : (Iterable<Entity>) (var3)) {

                  if (var5 != null && var5.isValid() && !var5.isDead()) {
                     Vector var6 = Xqedii_2wjm2y5(var5, Xqedii_1dja6bw.Xqedii_befy4kzl677j("X4hTf7lum7V9BFHlES3uAzUHaIaDIpzILPTieTDT81mgFLYxKdqXXiCiHuQ="));
                     Vector var7 = Xqedii_2wjm2y5(var5, Xqedii_1dja6bw.Xqedii_befy4kzl677j("J6EqQtvCdVL6p45FuliwXwsHD6gj/O60cLtD6kZFW0+AFueVSYE="));
                     if (var6 != null && var7 != null) {
                        double[] var8 = this.Xqedii_33b1uha(var1, var5);
                        double var9 = Math.abs(var7.getX());
                        double var11 = Math.abs(var7.getY());
                        double var13 = var9
                           * (
                              var8 == null
                                 ? Double.longBitsToDouble(Xqedii_1dja6bw.Xqedii_34lh06ue80sdh(-6311532895663101634L, 14))
                                 : var8[Xqedii_1dja6bw.Xqedii_z0fadtjq372o(736866812, 27)]
                           );
                        double var15 = var11
                           * (
                              var8 == null
                                 ? Double.longBitsToDouble(Xqedii_1dja6bw.Xqedii_1v24d2vi9ukin(5832322215291687135L, 28))
                                 : var8[Xqedii_1dja6bw.Xqedii_4xmczn0gp2op(219471283, 0)]
                           );
                        double var17 = var6.getX()
                           + (
                              var8 == null
                                 ? Double.longBitsToDouble(Xqedii_1dja6bw.Xqedii_1cq2ympzn3elu(-7538113730470425426L, 7))
                                 : var9 * var8[Xqedii_1dja6bw.Xqedii_4xmczn0gp2op(219471281, 1)]
                           );
                        double var19 = var6.getY()
                           + (
                              var8 == null
                                 ? Double.longBitsToDouble(Xqedii_1dja6bw.Xqedii_2se1khn3ycieo(-2766712952485305709L, 50))
                                 : var11 * var8[Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(-529080118, 2)]
                           );
                        var2.add(new BossbarEntityRect(var17 - var13, var19 - var15, var17 + var13, var19 + var15, var6.getZ()));
                     }
                  } else {
                     var3.remove(var5);
                  }
               }

               return var2;
            } else {
               return var2;
            }
         }
      }
   }

   @Override
   public void applyEntityPins(Player var1, Set<String> var2) {
      if ((1594223918 ^ 1594223918) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_1cm7rtz(var1, var2);
      }
   }

   @Override
   public double driftY(Player var1) {
      if ((1236107161 ^ 1236107161) != 0) {
         throw new IllegalStateException();
      } else {
         double[] var2 = this.resolveShaderHudDrift(var1);
         return var2.length > Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(62326295, 5)
            ? var2[Xqedii_1dja6bw.Xqedii_3ic447wemb0bz(-2146994988, 23)]
            : Double.longBitsToDouble(Xqedii_1dja6bw.Xqedii_2se1khn3ycieo(8426032889689486674L, 11));
      }
   }

   @Override
   public void flushToEntities(Player var1) {
      if ((-105845744 * (-105845744 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_2n9hlqi(var1);
      }
   }

   public int Xqedii_1gzopob(Xqedii_2t8d8j4 var1) {
      if ((-2086308725 * -2086308725 + -2086308725 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1.Xqedii_2cxxagp != null && Math.abs(var1.Xqedii_2cxxagp.w) < Float.intBitsToFloat(Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(-1995370812, 17))) {
         return Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(-834149817, 24);
      } else if (var1.Xqedii_3uxvg68 == null) {
         return Xqedii_1dja6bw.Xqedii_4xmczn0gp2op(-219471284, 0);
      } else {
         Quaternionf var2 = var1.Xqedii_6apav31 == null ? new Quaternionf(Xqedii_3au2gcd) : new Quaternionf(var1.Xqedii_6apav31).mul(Xqedii_3au2gcd);
         Quaternionf var3 = var2.invert(new Quaternionf()).mul(var1.Xqedii_3uxvg68);
         if (!(Math.abs(var3.x) > Float.intBitsToFloat(Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(-1890242751, 7)))
            && !(Math.abs(var3.y) > Float.intBitsToFloat(Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(1421674045, 17)))) {
            double var4 = Double.longBitsToDouble(Xqedii_1dja6bw.Xqedii_1v24d2vi9ukin(5832322215289163999L, 20)) * Math.atan2(var3.z, var3.w);
            double var6 = -var4 / Double.longBitsToDouble(Xqedii_1dja6bw.Xqedii_1cq2ympzn3elu(399518124183946802L, 58));
            long var8 = Math.round(var6);
            return Math.abs(var6 - var8) > Double.longBitsToDouble(Xqedii_1dja6bw.Xqedii_2se1khn3ycieo(-6870780250693422700L, 33))
               ? Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(1224329468, 13)
               : (int)Math.floorMod(var8, Xqedii_1dja6bw.Xqedii_34lh06ue80sdh(6338554493427328711L, 53));
         } else {
            return Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(1916736062, 27);
         }
      }
   }

   public double[] Xqedii_33b1uha(Player var1, Entity var2) {
      if ((580391891 ^ 580391891) != 0) {
         throw new IllegalStateException();
      } else if (var2 instanceof ItemDisplay var3
         && !var2.hasMetadata(Xqedii_1dja6bw.Xqedii_befy4kzl677j("60hlFCBhkgI3/1ZBMov4NriQO3XMBZEBVX/GBKe1U165iUevggFWgID45yU/CTmPGHPbwleA"))) {
         ItemStack var4 = var3.getItemStack();
         if (var4 != null && Xqedii_25zttuw(var4)) {
            Transformation var5 = var3.getTransformation();
            Quaternionf var6 = this.Xqedii_4zg6flq(var1).invert(new Quaternionf()).mul(var5.getLeftRotation()).mul(var5.getRightRotation());
            Matrix3f var7 = var6.get(new Matrix3f());
            double var8 = Math.abs(var7.m00) + Math.abs(var7.m10) + Math.abs(var7.m20);
            double var10 = Math.abs(var7.m01) + Math.abs(var7.m11) + Math.abs(var7.m21);
            double[] var10000 = new double[Xqedii_1dja6bw.Xqedii_z0fadtjq372o(-1308865557, 11)];
            var10000[Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(-958368032, 26)] = Double.longBitsToDouble(
                  Xqedii_1dja6bw.Xqedii_34lh06ue80sdh(3275900909723748563L, 40)
               )
               * var8;
            var10000[Xqedii_1dja6bw.Xqedii_4xmczn0gp2op(219471283, 27)] = Double.longBitsToDouble(Xqedii_1dja6bw.Xqedii_1cq2ympzn3elu(-35513039641849502L, 8))
               * var10;
            var10000[Xqedii_1dja6bw.Xqedii_4xmczn0gp2op(1293213107, 30)] = Double.longBitsToDouble(
                  Xqedii_1dja6bw.Xqedii_1v24d2vi9ukin(5832322215274959071L, 26)
               )
               * var7.m10;
            var10000[Xqedii_1dja6bw.Xqedii_3ic447wemb0bz(-2138605356, 10)] = Double.longBitsToDouble(
                  Xqedii_1dja6bw.Xqedii_34lh06ue80sdh(-4003438086635726536L, 63)
               )
               * var7.m11;
            return var10000;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static boolean Xqedii_25zttuw(ItemStack var0) {
      if ((1994061084 * 1994061084 + 1994061084 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Material var1 = var0.getType();
         if (var1 == Material.DRAGON_HEAD) {
            return (Xqedii_1dja6bw.Xqedii_z0fadtjq372o(-64230479, 19) != 0);
         } else {
            String var2 = var1.name();
            if (!var2.endsWith(Xqedii_1dja6bw.Xqedii_befy4kzl677j("a8DH5rk/NnwdQp4A3U4visSP/L50++k1BW/EjQvZcDiMO5AW83w="))
               && !var2.endsWith(Xqedii_1dja6bw.Xqedii_befy4kzl677j("AG7O2YwBMRmkBR/UEmtqbyJQ2qn4WjH50QfR+wfGECq0OB6tOVxyxg=="))) {
               return (Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(-2095349285, 20) != 0);
            } else {
               ItemMeta var3 = var0.getItemMeta();
               return ((var3 != null && var3.hasCustomModelData()
                  ? Xqedii_1dja6bw.Xqedii_3ic447wemb0bz(-2138606380, 23)
                  : Xqedii_1dja6bw.Xqedii_3tgry8emdmpdh(193059715, 28)) != 0);
            }
         }
      }
   }

   public static Vector Xqedii_2wjm2y5(Entity var0, String var1) {
      if ((-747439554 ^ -747439554) != 0) {
         throw new IllegalStateException();
      } else if (!var0.hasMetadata(var1)) {
         return null;
      } else {
         List var2 = var0.getMetadata(var1);
         if (var2 != null && !var2.isEmpty() && var2.get(Xqedii_1dja6bw.Xqedii_3ic447wemb0bz(-2138606380, 22)) != null) {
            return ((MetadataValue)var2.get(Xqedii_1dja6bw.Xqedii_3ic447wemb0bz(-2138606380, 15))).value() instanceof Vector var4 ? var4 : null;
         } else {
            return null;
         }
      }
   }
}
