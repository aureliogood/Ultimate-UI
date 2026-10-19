package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_1bzftw6;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;
import org.joml.Vector3f;

public abstract class HudVectors extends HudLookup {
   public static final String Xqedii_v253bngbdf47 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public HudVectors(UltimateUI var1) {
      super(var1);
   }

   public Vector3f getLocationVector(Vector var1, Vector var2, Entity var3, int var4) {
      if ((-1036749044 * (-1036749044 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.getLocationVector(var1, var2, var3, var4, this.Xqedii_20ozntw(var3));
      }
   }

   public Vector3f getLocationVector(Vector var1, Vector var2, Entity var3, int var4, Player var5) {
      if (((-1877699154 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         boolean var6 = this.isFixShadersEnabled(var5);
         Vector var7 = var1;
         if (var1 != null && var6 && var1.getZ() >= Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_h9mo75t5p8ka(-3956622765992099493L, 60))) {
            var7 = var1.clone();
            var7.setZ(var1.getZ() - Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_nq5x2nrptqiz(-4640259619204256788L, 13)));
         }

         return this.Xqedii_ou3vyi6
            .toDisplayTranslation(
               var7,
               var2,
               var3,
               var4,
               this.Xqedii_3guej5h(var5),
               ((!var6 ? Xqedii_1bzftw6.Xqedii_13w8pkordzpz1(316015900, 4) : Xqedii_1bzftw6.Xqedii_13w8pkordzpz1(1795327497, 11)) != 0)
            );
      }
   }

   public double Xqedii_3guej5h(Player var1) {
      if ((1792921510 * 1792921510 + 1792921510 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.isFixShadersEnabled(var1)) {
         return Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_h9mo75t5p8ka(-7045095169763367834L, 14));
      } else {
         double var2 = this.Xqedii_rrdyomu == null
            ? Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_nq5x2nrptqiz(-6004156584636045149L, 36))
            : this.Xqedii_rrdyomu
               .getConfig()
               .getDouble(
                  Xqedii_1bzftw6.Xqedii_2lbnmpkswshms(
                     "Zi/jIcongMDE8EqP4MORUezDx3UOUnb3TP0UJw8O+uT3xB6oVdVcpNHdEY9RL7zCRtfTv2WElaRVWmA81Mx86HljZO74dUA8w7jyJLss/Qix4zY0QmrHIZwqU/3p4Mp4uFtRsybLZt8="
                  ),
                  Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_h9mo75t5p8ka(-1177201028013239106L, 45))
               );
         if (var2 < Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_nq5x2nrptqiz(2493442190550606843L, 7)) || !Double.isFinite(var2)) {
            var2 = Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_h9mo75t5p8ka(6015628089636781535L, 54));
         }

         return this.Xqedii_85k12wk() * var2;
      }
   }

   public Vector3f getScaleVector(Vector var1) {
      if ((-1486845053 * -1486845053 + -1486845053 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return new Vector3f((float)var1.getX(), (float)var1.getY(), (float)var1.getZ());
      }
   }

   public double Xqedii_85k12wk() {
      if (((357290685 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double var1 = this.Xqedii_rrdyomu == null
            ? Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_nq5x2nrptqiz(7086964276887135227L, 0))
            : this.Xqedii_rrdyomu
               .getConfig()
               .getDouble(
                  Xqedii_1bzftw6.Xqedii_2lbnmpkswshms(
                     "zTNjFryk9LFOPiaJYxXf2uM0Ix3wQ4qwcvA5LiSyXugJQOfe0qdn9US9Cy9N08B2BxW2O4TBYEh4y4Zon81zZRKaBsCDNDLCho0sGjhwEgQwz8BV2GU5SCrKLLZoI9nz"
                  ),
                  Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_atzaa8gh14ts(-5599533400872478988L, 8))
               );
         return var1 > Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_atzaa8gh14ts(-5481229884231708778L, 0))
            ? var1
            : Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_3l5f8555lqup9(-3290602912428397294L, 46));
      }
   }

   public Vector3f Xqedii_1iem95w(Vector3f var1, Player var2) {
      if ((1154404586 * 1154404586 - 1154404586 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.isFixShadersEnabled(var2)) {
         return new Vector3f(var1);
      } else {
         double var3 = this.Xqedii_85k12wk();
         return new Vector3f((float)(var1.x / var3), (float)(var1.y / var3), (float)(var1.z / var3));
      }
   }

   public Vector Xqedii_3iy1c6h(Vector var1) {
      if ((1425049442 * 1425049442 - 1425049442 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null
            ? new Vector(
               Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_nq5x2nrptqiz(-8148295118515505040L, 34)),
               Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_3l5f8555lqup9(-7705545717713546144L, 22)),
               Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_nq5x2nrptqiz(2493442190550606843L, 51))
            )
            : new Vector(
               Math.max(Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_3l5f8555lqup9(3596561706322489350L, 40)), var1.getX()),
               Math.max(Double.longBitsToDouble(Xqedii_1bzftw6.Xqedii_nq5x2nrptqiz(7041170673911154919L, 48)), var1.getY()),
               var1.getZ()
            );
      }
   }
}
