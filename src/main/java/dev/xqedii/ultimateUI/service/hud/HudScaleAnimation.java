package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_2ggpcef;
import dev.xqedii.ultimateUI.Xqedii_2t8d8j4;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.bukkit.entity.Display;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.util.Transformation;
import org.bukkit.util.Vector;

public abstract class HudScaleAnimation extends HudRemoval {
   public static final String Xqedii_1pargl6rvxx2n = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public HudScaleAnimation(UltimateUI var1) {
      super(var1);
   }

   @Override
   public void animScale(Entity var1, double var2, double var4, double var6, boolean var8) {
      if ((1071524922 * 1071524922 + 1071524922 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2t8d8j4 var9 = this.Xqedii_2jnbe8d(var1);
         if (var9 != null) {
            Double[] var20 = new Double[Xqedii_2ggpcef.Xqedii_2hacao6ls7ugl(2100588313, 2)];
            var20[Xqedii_2ggpcef.Xqedii_3jsaib1o3c48c(-1922015108, 15)] = Double.longBitsToDouble(Xqedii_2ggpcef.Xqedii_1narjmry822f9(2742549595551793747L, 19));
            var20[Xqedii_2ggpcef.Xqedii_2hacao6ls7ugl(-1707641666, 9)] = Double.longBitsToDouble(Xqedii_2ggpcef.Xqedii_xu4smzgky6dv(-1913303224835336976L, 15));
            var20[Xqedii_2ggpcef.Xqedii_2l8wye6vp1v8v(-1535797914, 0)] = Double.longBitsToDouble(Xqedii_2ggpcef.Xqedii_xu4smzgky6dv(5182575470622973622L, 20));
            var20[Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(357207983, 29)] = Double.longBitsToDouble(Xqedii_2ggpcef.Xqedii_1zxzcqagf5it6(-1245059494976610079L, 44));
            var20[Xqedii_2ggpcef.Xqedii_2l8wye6vp1v8v(-1542089369, 21)] = Double.longBitsToDouble(
               Xqedii_2ggpcef.Xqedii_1narjmry822f9(-1049486577627368592L, 55)
            );
            var20[Xqedii_2ggpcef.Xqedii_2hacao6ls7ugl(1861844276, 18)] = Double.longBitsToDouble(Xqedii_2ggpcef.Xqedii_34tyeuh2s97xt(1363848086096464065L, 14));
            var20[Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(-1253404753, 29)] = Double.longBitsToDouble(Xqedii_2ggpcef.Xqedii_xu4smzgky6dv(-2811582011912422581L, 23));
            var20[Xqedii_2ggpcef.Xqedii_2l8wye6vp1v8v(-1538943641, 19)] = Double.longBitsToDouble(Xqedii_2ggpcef.Xqedii_xu4smzgky6dv(-6947358325793917471L, 35));
            var20[Xqedii_2ggpcef.Xqedii_2hacao6ls7ugl(184183006, 27)] = Double.longBitsToDouble(Xqedii_2ggpcef.Xqedii_1narjmry822f9(2413891486983320371L, 7));
            var20[Xqedii_2ggpcef.Xqedii_3jsaib1o3c48c(1806107620, 18)] = Double.longBitsToDouble(Xqedii_2ggpcef.Xqedii_xu4smzgky6dv(3005396464067529445L, 32));
            var20[Xqedii_2ggpcef.Xqedii_3jsaib1o3c48c(1044822704, 6)] = Double.longBitsToDouble(Xqedii_2ggpcef.Xqedii_34tyeuh2s97xt(3150216321636339992L, 11));
            var20[Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1892323247, 23)] = Double.longBitsToDouble(Xqedii_2ggpcef.Xqedii_1narjmry822f9(2751737285610638476L, 2));
            var20[Xqedii_2ggpcef.Xqedii_3jsaib1o3c48c(2089645664, 7)] = Double.longBitsToDouble(Xqedii_2ggpcef.Xqedii_1narjmry822f9(2742549595551794003L, 19));
            Double[] var15 = var20;
            ArrayList var16 = new ArrayList<>(Arrays.asList(var15));
            if (var8) {
               Collections.reverse(var16);
            }

            Player var17 = this.Xqedii_3u2qg5l(var1);
            if (var17 != null && var17.isOnline()) {
               int[] var21 = new int[Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1967837103, 14)];
               var21[Xqedii_2ggpcef.Xqedii_3jsaib1o3c48c(593238047, 13)] = Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1967820719, 1);
               int[] var18 = var21;
               Xqedii_38o2zes.Xqedii_j3mggbv(
                  this.Xqedii_rrdyomu,
                  var17,
                  Xqedii_2ggpcef.Xqedii_34tyeuh2s97xt(6979225513009670056L, 19),
                  Xqedii_2ggpcef.Xqedii_1zxzcqagf5it6(-6740627490903036883L, 63),
                  var11x -> {
                     if ((-1361773166 * (-1361773166 + 1) & 1) != 0) {
                        throw new IllegalStateException();
                     } else {
                        Xqedii_2t8d8j4 var12x = this.Xqedii_2jnbe8d(var1);
                        Player var13x = this.Xqedii_3u2qg5l(var1);
                        if (var12x != null && var13x != null && var13x.isOnline()) {
                           if (var18[Xqedii_2ggpcef.Xqedii_2hacao6ls7ugl(-1500652369, 7)] >= var16.size()) {
                              if (var8) {
                                 this.Xqedii_32sczwk(var13x, var12x.Xqedii_26svack, (Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1969917871, 21) != 0));
                              }

                              var11x.cancel();
                           } else {
                              double var14x = (Double)var16.get(var18[Xqedii_2ggpcef.Xqedii_2hacao6ls7ugl(-444779410, 26)]);
                              Vector var16x = this.Xqedii_3iy1c6h(new Vector(var2 * var14x, var4 * var14x, var6 * var14x));
                              boolean var17x = this.Xqedii_3jt8515(var1);
                              int var18x = var17x ? Xqedii_2ggpcef.Xqedii_3jsaib1o3c48c(-231358079, 9) : Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1951043503, 24);
                              var12x.Xqedii_1pjv5dx = var16x;
                              var12x.Xqedii_1aoqfs7 = var18x;
                              var12x.Xqedii_1d8vptj = Xqedii_2ggpcef.Xqedii_3jsaib1o3c48c(-524224230, 24);
                              var1.setMetadata(
                                 Xqedii_2ggpcef.Xqedii_2zuo566x395lc("dnO+wnmYqe6gdum0nIUznJZVoyGE3jvqdcpjOInT7SjBQnfEfzY="),
                                 new FixedMetadataValue(this.Xqedii_rrdyomu, var16x)
                              );
                              this.Xqedii_19o8tyr(var13x, var12x);
                              var18[Xqedii_2ggpcef.Xqedii_3jsaib1o3c48c(593238047, 13)] += Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1967296431, 19);
                           }
                        } else {
                           var11x.cancel();
                        }
                     }
                  }
               );
            }
         } else if (var1 instanceof Display var10) {
            Double[] var10000 = new Double[Xqedii_2ggpcef.Xqedii_2hacao6ls7ugl(-1097189492, 1)];
            var10000[Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1967820719, 2)] = Double.longBitsToDouble(Xqedii_2ggpcef.Xqedii_34tyeuh2s97xt(921306240797861396L, 48));
            var10000[Xqedii_2ggpcef.Xqedii_3jsaib1o3c48c(1883129528, 30)] = Double.longBitsToDouble(
               Xqedii_2ggpcef.Xqedii_34tyeuh2s97xt(298127908565342400L, 56)
            );
            var10000[Xqedii_2ggpcef.Xqedii_3jsaib1o3c48c(261205548, 4)] = Double.longBitsToDouble(Xqedii_2ggpcef.Xqedii_1zxzcqagf5it6(-4318356773886260718L, 8));
            var10000[Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1984597935, 24)] = Double.longBitsToDouble(
               Xqedii_2ggpcef.Xqedii_xu4smzgky6dv(-5885470973602128100L, 20)
            );
            var10000[Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(2102038447, 25)] = Double.longBitsToDouble(
               Xqedii_2ggpcef.Xqedii_xu4smzgky6dv(6053111135591959165L, 14)
            );
            var10000[Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(894078894, 30)] = Double.longBitsToDouble(
               Xqedii_2ggpcef.Xqedii_34tyeuh2s97xt(8245789106656005045L, 32)
            );
            var10000[Xqedii_2ggpcef.Xqedii_3jsaib1o3c48c(261205612, 4)] = Double.longBitsToDouble(
               Xqedii_2ggpcef.Xqedii_1narjmry822f9(-4641267510981807152L, 14)
            );
            var10000[Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1917489071, 24)] = Double.longBitsToDouble(
               Xqedii_2ggpcef.Xqedii_1narjmry822f9(1805737218684507353L, 58)
            );
            var10000[Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1967820735, 1)] = Double.longBitsToDouble(
               Xqedii_2ggpcef.Xqedii_xu4smzgky6dv(-5403722747852934101L, 38)
            );
            var10000[Xqedii_2ggpcef.Xqedii_2hacao6ls7ugl(1759384314, 11)] = Double.longBitsToDouble(
               Xqedii_2ggpcef.Xqedii_34tyeuh2s97xt(-9016087889605295599L, 7)
            );
            var10000[Xqedii_2ggpcef.Xqedii_3jsaib1o3c48c(-1364455535, 20)] = Double.longBitsToDouble(
               Xqedii_2ggpcef.Xqedii_xu4smzgky6dv(-8099080262447358121L, 20)
            );
            var10000[Xqedii_2ggpcef.Xqedii_2l8wye6vp1v8v(-1493854873, 22)] = Double.longBitsToDouble(
               Xqedii_2ggpcef.Xqedii_1zxzcqagf5it6(7749562758205118156L, 59)
            );
            var10000[Xqedii_2ggpcef.Xqedii_2hacao6ls7ugl(-187581355, 4)] = Double.longBitsToDouble(
               Xqedii_2ggpcef.Xqedii_34tyeuh2s97xt(-3735707774872840138L, 33)
            );
            Double[] var11 = var10000;
            ArrayList var12 = new ArrayList<>(Arrays.asList(var11));
            if (var8) {
               Collections.reverse(var12);
            }

            Player var13 = this.Xqedii_20ozntw(var1);
            if (var13 != null && var13.isOnline()) {
               int[] var19 = new int[Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1967824815, 12)];
               var19[Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1967820719, 25)] = Xqedii_2ggpcef.Xqedii_2hacao6ls7ugl(-1184936677, 24);
               int[] var14 = var19;
               Xqedii_38o2zes.Xqedii_j3mggbv(
                  this.Xqedii_rrdyomu,
                  var13,
                  Xqedii_2ggpcef.Xqedii_xu4smzgky6dv(-4402475228390742032L, 27),
                  Xqedii_2ggpcef.Xqedii_1zxzcqagf5it6(2482744545951737901L, 10),
                  var12x -> {
                     if ((864653704 * 864653704 - 864653704 & 1) != 0) {
                        throw new IllegalStateException();
                     } else if (var14[Xqedii_2ggpcef.Xqedii_2hacao6ls7ugl(-573900184, 19)] >= var12.size()) {
                        if (var8) {
                           this.removeHudX(Collections.singletonList(var1), (Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1967820719, 4) != 0));
                        }

                        var12x.cancel();
                     } else {
                        double var13x = (Double)var12.get(var14[Xqedii_2ggpcef.Xqedii_2hacao6ls7ugl(879682941, 10)]);
                        Vector var15x = this.Xqedii_3iy1c6h(new Vector(var2 * var13x, var4 * var13x, var6 * var13x));
                        boolean var16x = this.Xqedii_3jt8515(var10);
                        int var17x = var16x ? Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1967820719, 26) : Xqedii_2ggpcef.Xqedii_2hacao6ls7ugl(1598888890, 0);
                        var10.setTransformation(
                           new Transformation(
                              var10.getTransformation().getTranslation(),
                              var10.getTransformation().getLeftRotation(),
                              this.Xqedii_1iem95w(this.getScaleVector(var15x), this.Xqedii_20ozntw(var10)),
                              var10.getTransformation().getRightRotation()
                           )
                        );
                        var10.setMetadata(
                           Xqedii_2ggpcef.Xqedii_2zuo566x395lc("dnO+wnmYqe6gdum0nIUznJZVoyGE3jvqdcpjOInT7SjBQnfEfzY="),
                           new FixedMetadataValue(this.Xqedii_rrdyomu, var15x)
                        );
                        this.moveHud(
                           var10,
                           (Vector)((MetadataValue)var1.getMetadata(
                                    Xqedii_2ggpcef.Xqedii_2zuo566x395lc("ZRrd75KUgGvr6LSb1iIFo5CCpW1hd9udhY+gSA4R910vW+OA+vCWpBFbnO4=")
                                 )
                                 .get(Xqedii_2ggpcef.Xqedii_2l8wye6vp1v8v(1535797912, 10)))
                              .value(),
                           Xqedii_2ggpcef.Xqedii_2l8wye6vp1v8v(1535797912, 22)
                        );
                        var10.setInterpolationDuration(var17x);
                        var10.setInterpolationDelay(Xqedii_2ggpcef.Xqedii_3jsaib1o3c48c(593238047, 13));
                        this.Xqedii_1m1yjkp(var10, this.Xqedii_3u778qc(var17x, var16x));
                        var14[Xqedii_2ggpcef.Xqedii_2hacao6ls7ugl(879682941, 10)] += Xqedii_2ggpcef.Xqedii_22fxp35cwvfzl(1430949807, 29);
                     }
                  }
               );
            } else {
               if (var8) {
                  this.removeHudX(Collections.singletonList(var1), (Xqedii_2ggpcef.Xqedii_3jsaib1o3c48c(2089644128, 7) != 0));
               }
            }
         }
      }
   }
}
