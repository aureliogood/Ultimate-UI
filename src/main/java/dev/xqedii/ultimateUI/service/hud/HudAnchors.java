package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.Xqedii_3fzcruq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.metadata.FixedMetadataValue;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public abstract class HudAnchors extends HudBase {
   public static final String Xqedii_1r0t02twexey = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final Quaternionf Xqedii_3au2gcd;

   public HudAnchors(UltimateUI var1) {
      super(var1);
   }

   public boolean isFixShadersEnabled() {
      if ((-172205228 * -172205228 - -172205228 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_rrdyomu != null
               && !this.Xqedii_rrdyomu
                  .getConfig()
                  .getBoolean(
                     Xqedii_3fzcruq.Xqedii_1j7cxw8ukpyeo(
                        "SzYpCDvtlfU+YTvKJqhCF5z28PpXMwCMYJZAH78+4pULcKOYKSJ1W+sE19IYfLKW0hbNzb6QTemMENwA4rQ7rb+9A07nEh3P5Y82AJwaStgPU55P"
                     ),
                     (Xqedii_3fzcruq.Xqedii_2rn6x3mg1gf2s(-1906531665, 24) != 0)
                  )
            ? Xqedii_3fzcruq.Xqedii_1u9vewkp2ry9b(-2113460905, 22)
            : Xqedii_3fzcruq.Xqedii_2wd1g9vhv7tmt(-172586263, 9)) != 0);
      }
   }

   public boolean isFixShadersEnabled(Player var1) {
      if ((-1691860463 ^ -1691860463) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return this.isFixShadersEnabled();
      } else {
         Boolean var2 = this.Xqedii_1q9cawx.get(var1.getUniqueId());
         boolean var3 = var2 != null ? var2 : this.isFixShadersEnabled();
         return ((var3 && !this.Xqedii_28kfl6q.contains(var1.getUniqueId())
            ? Xqedii_3fzcruq.Xqedii_1u9vewkp2ry9b(-2113456809, 12)
            : Xqedii_3fzcruq.Xqedii_1u9vewkp2ry9b(-2113460905, 15)) != 0);
      }
   }

   public void setFixShadersOverride(UUID var1, Boolean var2) {
      if (((-815405163 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         if (var2 == null) {
            this.Xqedii_1q9cawx.remove(var1);
         } else {
            this.Xqedii_1q9cawx.put(var1, var2);
         }
      }
   }

   public Boolean getFixShadersOverride(UUID var1) {
      if ((-289203618 * -289203618 + -289203618 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null ? null : this.Xqedii_1q9cawx.get(var1);
      }
   }

   public void setLegacyHudSession(Player var1, boolean var2) {
      if ((757414492 * 757414492 - 757414492 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         if (var2) {
            this.Xqedii_28kfl6q.add(var1.getUniqueId());
         } else {
            this.Xqedii_28kfl6q.remove(var1.getUniqueId());
         }
      }
   }

   public int Xqedii_1h50evl(Player var1) {
      if ((168816559 * (168816559 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.isFixShadersEnabled(var1) ? Xqedii_3fzcruq.Xqedii_2rn6x3mg1gf2s(1793398140, 27) : Xqedii_3fzcruq.Xqedii_3tx8zyxs03ro8(-1152633415, 16);
      }
   }

   public double Xqedii_28cxifa() {
      if (((-968468899 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_rrdyomu == null
            ? Double.longBitsToDouble(Xqedii_3fzcruq.Xqedii_1ezagcbu4c6bs(8729141350246385555L, 34))
            : this.Xqedii_rrdyomu
               .getConfig()
               .getDouble(
                  Xqedii_3fzcruq.Xqedii_1j7cxw8ukpyeo(
                     "ArwIevxFtj/JKwjgGPPsxwkujAPD4d7qkK6p/M1LrjZPQ1Txh2QGp3/Zn7kLoIarG6UaAB9mXiNLjxIFbj0ZSirYH/PbrK9gR29RXjoDGVy7gWwdEiLkdSHhsJLnz9lVECUvEm54"
                  ),
                  Double.longBitsToDouble(Xqedii_3fzcruq.Xqedii_3q79j4f56l8vf(-4652979672046823072L, 43))
               );
      }
   }

   public double Xqedii_3gnxspl() {
      if ((2047156078 * 2047156078 - 2047156078 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_rrdyomu == null
            ? Double.longBitsToDouble(Xqedii_3fzcruq.Xqedii_16klg37sik1or(1067452109979146311L, 45))
            : this.Xqedii_rrdyomu
               .getConfig()
               .getDouble(
                  Xqedii_3fzcruq.Xqedii_1j7cxw8ukpyeo(
                     "EaKHU6HE/BI0mI7lMOILymxavClY60uP3Vs6JF9tcBilbQjV7WVQvRp6zUJLujUrMBYavn6JGwTRwDgAbZ02AyNQ1IVs12542G7uXhfSypzU4S+vB5zqSZAPzl1UXFDVpIKpX4gQdjAqypW/+eI922sR"
                  ),
                  Double.longBitsToDouble(Xqedii_3fzcruq.Xqedii_16klg37sik1or(3373286318804851015L, 10))
               );
      }
   }

   public void setHudAnchorOrigin(Player var1, Location var2) {
      if ((-1010094052 * -1010094052 - -1010094052 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         if (var2 != null && var2.getWorld() != null) {
            this.Xqedii_141s1c0.put(var1.getUniqueId(), var2.clone());
         } else {
            this.Xqedii_141s1c0.remove(var1.getUniqueId());
         }
      }
   }

   public Location Xqedii_1zl35bn(Player var1) {
      if ((1424211388 * 1424211388 - 1424211388 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Location var2 = var1.getLocation();
         if (!this.isFixShadersEnabled(var1)) {
            return var2;
         } else {
            Location var3 = this.Xqedii_141s1c0.get(var1.getUniqueId());
            if (var3 != null && var3.getWorld() != null && var3.getWorld().equals(var2.getWorld())) {
               var2 = var3.clone();
            }

            var2.setY(var2.getY() + this.Xqedii_28cxifa());
            double var4 = this.Xqedii_3gnxspl();
            if (var4 != Double.longBitsToDouble(Xqedii_3fzcruq.Xqedii_1ezagcbu4c6bs(-8030137492732752412L, 44))) {
               var2.setPitch(Float.intBitsToFloat(Xqedii_3fzcruq.Xqedii_3tx8zyxs03ro8(-576283940, 15)));
               double var6 = Math.toRadians(var2.getYaw());
               var2.setX(var2.getX() - Math.sin(var6) * var4);
               var2.setZ(var2.getZ() + Math.cos(var6) * var4);
            }

            return var2;
         }
      }
   }

   public Location Xqedii_1ew3c3r(Player var1) {
      if ((969595244 ^ 969595244) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else if (!this.isFixShadersEnabled(var1)) {
         return this.Xqedii_1zl35bn(var1);
      } else {
         UUID var2 = var1.getUniqueId();
         Location var3 = this.Xqedii_2apkuy1.get(var2);
         if (var3 == null || var3.getWorld() == null || !var3.getWorld().equals(var1.getWorld())) {
            var3 = this.Xqedii_1zl35bn(var1);
            this.Xqedii_2apkuy1.put(var2, var3.clone());
         }

         return var3.clone();
      }
   }

   public void setHudMountEntity(Player var1, Entity var2) {
      if (((-2079842462 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         if (var2 == null) {
            this.Xqedii_3ediaz4.remove(var1.getUniqueId());
         } else {
            this.Xqedii_3ediaz4.put(var1.getUniqueId(), var2);
         }
      }
   }

   public void Xqedii_ba8rzww(Player var1, Entity var2) {
      if (((-1590639562 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         var2.setMetadata(
            Xqedii_3fzcruq.Xqedii_1j7cxw8ukpyeo("0nfnv8LgEURcPDrPYImkZi245KkVD3irg8pKX2HXodUjnjFDFu9SmfjtYGSA1Q6ByU2lcthlZ48gW2Ti"),
            new FixedMetadataValue(this.Xqedii_rrdyomu, Boolean.valueOf((Xqedii_3fzcruq.Xqedii_2wd1g9vhv7tmt(-172586263, 29) != 0)))
         );
         this.Xqedii_52xxigy.computeIfAbsent(var1.getUniqueId(), var0 -> {
            if ((271703571 * 271703571 - 271703571 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return new CopyOnWriteArraySet<>();
            }
         }).add(var2);
      }
   }

   public void Xqedii_2u2fnvh(Player var1, Entity var2) {
      if (((-1014475149 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         Set var3 = this.Xqedii_52xxigy.get(var1.getUniqueId());
         if (var3 != null) {
            var3.remove(var2);
            if (var3.isEmpty()) {
               this.Xqedii_52xxigy.remove(var1.getUniqueId());
            }
         }
      }
   }

   public boolean Xqedii_341vpyd(Entity var1) {
      if ((591762136 ^ 591762136) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null
               && var1.hasMetadata(Xqedii_3fzcruq.Xqedii_1j7cxw8ukpyeo("0nfnv8LgEURcPDrPYImkZi245KkVD3irg8pKX2HXodUjnjFDFu9SmfjtYGSA1Q6ByU2lcthlZ48gW2Ti"))
            ? Xqedii_3fzcruq.Xqedii_1u9vewkp2ry9b(-2113460777, 7)
            : Xqedii_3fzcruq.Xqedii_2rn6x3mg1gf2s(-1967245966, 10)) != 0);
      }
   }

   public List<Entity> Xqedii_xzc93q5(UUID var1) {
      if ((-1401430310 * -1401430310 - -1401430310 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Set var2 = var1 == null ? null : this.Xqedii_52xxigy.get(var1);
         if (var2 != null && !var2.isEmpty()) {
            ArrayList var3 = new ArrayList(var2.size());

            for (Entity var5 : (Iterable<Entity>) (var2)) {

               if (var5 != null && var5.isValid() && !var5.isDead()) {
                  var3.add(var5);
               } else {
                  var2.remove(var5);
               }
            }

            if (var2.isEmpty()) {
               this.Xqedii_52xxigy.remove(var1);
            }

            return var3;
         } else {
            return Collections.emptyList();
         }
      }
   }

   public void Xqedii_2tx2x1f(UUID var1, Collection<Integer> var2) {
      if (((1879677789 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Set var3 = var1 == null ? null : this.Xqedii_52xxigy.get(var1);
         if (var3 != null) {
            for (Entity var5 : (Iterable<Entity>) (var3)) {

               if (var5 != null) {
                  var2.add(var5.getEntityId());
               }
            }
         }
      }
   }

   public void Xqedii_3d1p9op(Entity var1, Player var2) {
      if (((-2057060030 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         Location var3 = var2.getLocation();
         Location var4 = var1.getLocation();
         if (var3 != null && var3.getWorld() != null) {
            int var5 = var4 != null && var4.getWorld() != null && var4.getWorld().equals(var3.getWorld())
               ? Xqedii_3fzcruq.Xqedii_2wd1g9vhv7tmt(-172586263, 13)
               : Xqedii_3fzcruq.Xqedii_1u9vewkp2ry9b(-2113460905, 19);
            if (var5 == 0 || !(var4.distanceSquared(var3) < Double.longBitsToDouble(Xqedii_3fzcruq.Xqedii_3q79j4f56l8vf(-4750684473240512160L, 57)))) {
               Xqedii_38o2zes.Xqedii_fxq2htx(var1, this.Xqedii_2x210wg(var1, var3));
            }
         }
      }
   }

   public Location Xqedii_2x210wg(Entity var1, Location var2) {
      if ((-1910665984 * (-1910665984 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Location var3 = var2.clone();
         Location var4 = var1 == null ? null : var1.getLocation();
         var3.setYaw(var4 == null ? Float.intBitsToFloat(Xqedii_3fzcruq.Xqedii_3tx8zyxs03ro8(-420662058, 10)) : var4.getYaw());
         var3.setPitch(var4 == null ? Float.intBitsToFloat(Xqedii_3fzcruq.Xqedii_3tx8zyxs03ro8(901364557, 0)) : var4.getPitch());
         return var3;
      }
   }

   public Entity Xqedii_2ey5s6p(Player var1) {
      if ((-343343725 * (-343343725 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         Entity var2 = this.Xqedii_3ediaz4.get(var1.getUniqueId());
         return var2 != null && var2.isValid() && !var2.isDead() ? var2 : null;
      }
   }

   public double[] resolveShaderHudDrift(Player var1) {
      if ((-1340992072 * -1340992072 + -1340992072 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline() && !this.isFixShadersEnabled(var1)) {
         Location var2 = var1.getLocation();
         Entity var3 = this.Xqedii_2ey5s6p(var1);
         Location var4 = var3 != null ? var3.getLocation() : var1.getEyeLocation();
         if (var2.getWorld() != null && var4.getWorld() != null && var2.getWorld().equals(var4.getWorld())) {
            double var5 = var2.getX() - var4.getX();
            double var7 = var2.getY() + var1.getHeight() - var4.getY() - Double.longBitsToDouble(Xqedii_3fzcruq.Xqedii_3q79j4f56l8vf(-5166854880119952712L, 5));
            double[] var10 = new double[Xqedii_3fzcruq.Xqedii_2rn6x3mg1gf2s(1163861689, 9)];
            var10[Xqedii_3fzcruq.Xqedii_3tx8zyxs03ro8(1536931027, 4)] = Double.isFinite(var5)
               ? var5
               : Double.longBitsToDouble(Xqedii_3fzcruq.Xqedii_16klg37sik1or(1067443309591156807L, 20));
            var10[Xqedii_3fzcruq.Xqedii_3tx8zyxs03ro8(819390189, 26)] = Double.isFinite(var7)
               ? var7
               : Double.longBitsToDouble(Xqedii_3fzcruq.Xqedii_1ezagcbu4c6bs(2286711040771367886L, 2));
            return var10;
         } else {
            double[] var9 = new double[Xqedii_3fzcruq.Xqedii_2wd1g9vhv7tmt(-168391959, 22)];
            var9[Xqedii_3fzcruq.Xqedii_2rn6x3mg1gf2s(-708171016, 28)] = Double.longBitsToDouble(Xqedii_3fzcruq.Xqedii_346y5rjs942tn(8249806938077216795L, 40));
            var9[Xqedii_3fzcruq.Xqedii_3tx8zyxs03ro8(-315566362, 18)] = Double.longBitsToDouble(Xqedii_3fzcruq.Xqedii_346y5rjs942tn(247222605921989800L, 29));
            return var9;
         }
      } else {
         double[] var10000 = new double[Xqedii_3fzcruq.Xqedii_3tx8zyxs03ro8(-1682640037, 12)];
         var10000[Xqedii_3fzcruq.Xqedii_2rn6x3mg1gf2s(1364706990, 7)] = Double.longBitsToDouble(Xqedii_3fzcruq.Xqedii_3q79j4f56l8vf(-4652977471949825696L, 11));
         var10000[Xqedii_3fzcruq.Xqedii_3tx8zyxs03ro8(1937152107, 9)] = Double.longBitsToDouble(Xqedii_3fzcruq.Xqedii_3q79j4f56l8vf(-4652977471949825696L, 21));
         return var10000;
      }
   }

   public Vector3f Xqedii_2vzkbbo(Player var1) {
      if ((832370790 * 832370790 - 832370790 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.isFixShadersEnabled(var1)) {
         Entity var2 = this.Xqedii_2ey5s6p(var1);
         Location var3 = this.Xqedii_1ew3c3r(var1);
         Location var4 = var2 != null ? var2.getLocation() : var1.getLocation();
         return var3.getWorld() != null && var4.getWorld() != null && var3.getWorld().equals(var4.getWorld())
            ? new Vector3f((float)(var3.getX() - var4.getX()), (float)(var3.getY() - var4.getY()), (float)(var3.getZ() - var4.getZ()))
            : new Vector3f(
               Float.intBitsToFloat(Xqedii_3fzcruq.Xqedii_2rn6x3mg1gf2s(-708171016, 28)),
               Float.intBitsToFloat(Xqedii_3fzcruq.Xqedii_2wd1g9vhv7tmt(172586262, 22)),
               Float.intBitsToFloat(Xqedii_3fzcruq.Xqedii_1u9vewkp2ry9b(-2113460905, 15))
            );
      } else {
         return new Vector3f(
            Float.intBitsToFloat(Xqedii_3fzcruq.Xqedii_2wd1g9vhv7tmt(172586262, 9)),
            Float.intBitsToFloat(Xqedii_3fzcruq.Xqedii_1u9vewkp2ry9b(-2113460905, 9)),
            Float.intBitsToFloat(Xqedii_3fzcruq.Xqedii_2rn6x3mg1gf2s(1595586885, 17))
         );
      }
   }

   public Quaternionf Xqedii_4zg6flq(Player var1) {
      if ((27749720 ^ 27749720) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.isFixShadersEnabled(var1)) {
         Location var2 = this.Xqedii_1ew3c3r(var1);
         float var3 = var2 == null ? var1.getLocation().getYaw() : var2.getYaw();
         return new Quaternionf().rotationY((float)Math.toRadians(-var3));
      } else {
         return new Quaternionf();
      }
   }

   public Quaternionf Xqedii_1gh33bq(Player var1) {
      if (((-577959556 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.isFixShadersEnabled(var1) ? this.Xqedii_4zg6flq(var1).mul(Xqedii_3au2gcd) : new Quaternionf(Xqedii_3au2gcd);
      }
   }

   static {
      if (((-2111337344 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_3au2gcd = new Quaternionf()
            .rotationXYZ(
               Float.intBitsToFloat(Xqedii_3fzcruq.Xqedii_2wd1g9vhv7tmt(172586262, 27)),
               (float)Math.toRadians(Double.longBitsToDouble(Xqedii_3fzcruq.Xqedii_3q79j4f56l8vf(2804983510975715807L, 8))),
               Float.intBitsToFloat(Xqedii_3fzcruq.Xqedii_2rn6x3mg1gf2s(-1923308881, 24))
            );
      }
   }
}
