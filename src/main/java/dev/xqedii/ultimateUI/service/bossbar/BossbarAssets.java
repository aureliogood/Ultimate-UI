package dev.xqedii.ultimateUI.service.bossbar;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dev.xqedii.ultimateUI.Xqedii_1yrleh4;
import dev.xqedii.ultimateUI.Xqedii_2dq9nbq;
import dev.xqedii.ultimateUI.Xqedii_2rkgqmu;
import dev.xqedii.ultimateUI.Xqedii_30g0ulj;
import dev.xqedii.ultimateUI.Xqedii_3b1vf9x;
import dev.xqedii.ultimateUI.Xqedii_3npa30o;
import dev.xqedii.ultimateUI.Xqedii_3tswp0o;
import dev.xqedii.ultimateUI.Xqedii_3uek68f;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;

public final class BossbarAssets {
   public static final String Xqedii_2cl0xmatnpfs2 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String Xqedii_3qqsx0r = Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
      "F1kIKgl7xvsvQWrYb+PzuZlBCL/3mOfZH8vYxUQpibd3yCWK8Xnn0jYwObdAEuU8UJDDdWQpJXVtF9fRYAlI/0gO+faKM/YScnAD+swju/aUUR87Ie3iU+/ZdGnJMtk8sB0="
   );
   public static final double Xqedii_1ic88xw = 1.25;
   public static final int Xqedii_iom6g7v = 225;
   public static final int Xqedii_2s8yaxh = 128;
   public static final int Xqedii_3hvbvs9 = 16;
   public static final double Xqedii_2gu0mfg = 0.015;
   public static final int Xqedii_2sborch = 2;
   public static final Pattern Xqedii_1af7ajg;
   public static final Pattern Xqedii_37foha6;
   public static final Pattern Xqedii_2qvddoh;
   public final Map<String, Map<Integer, BossbarAssets.Sprite>> Xqedii_22z16ze = new LinkedHashMap<>();
   public final Map<String, List<Xqedii_1yrleh4>> Xqedii_3r73ss7 = new LinkedHashMap<>();
   public final List<String> Xqedii_zemkq3u = new ArrayList<>();
   public final Map<Integer, int[]> Xqedii_1g8xv86 = new HashMap<>();
   public final Map<String, byte[]> Xqedii_2d8kew5 = new LinkedHashMap<>();
   public final Map<String, Xqedii_3tswp0o> Xqedii_bq2pby8 = new LinkedHashMap<>();
   public final Map<Integer, Integer> Xqedii_u379bgq = new HashMap<>();
   public final double[] Xqedii_34gi8qa = new double[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(826191349, 20)];
   public final double[] Xqedii_2x0izxh = new double[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1393814239, 16)];
   public final double[][] Xqedii_2zcg580 = new double[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1415090578, 25)][];
   public int Xqedii_3b66x3g;
   public final List<BossbarAssets.TextFace> Xqedii_3bv5jwx = new ArrayList<>();
   public final Map<String, BossbarAssets.TextFace> Xqedii_4i9xc2m = new HashMap<>();
   public final List<BossbarAssets.VanillaProvider> Xqedii_358aqay = new ArrayList<>();
   public final Map<Integer, BossbarAssets.VanillaGlyph> Xqedii_mt2rbjm = new HashMap<>();
   public final Map<Integer, Double> Xqedii_2gf04bx = new HashMap<>();
   public final List<Integer> Xqedii_ruyfulx = new ArrayList<>();
   public final List<Double> Xqedii_2srd6vv = new ArrayList<>();
   public BossbarAssets.TextFace Xqedii_32v33zt;
   public boolean Xqedii_23e2m51;

   public BossbarAssets() {
   }

   public boolean isReady() {
      if (((-1633695434 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_23e2m51;
      }
   }

   public BossbarAssets.Sprite sprite(String var1, int var2) {
      if (((-776890850 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null) {
            Map var3 = this.Xqedii_22z16ze.get(Xqedii_1f2zb8d(var1));
            if (var3 != null) {
               BossbarAssets.Sprite var4 = (BossbarAssets.Sprite)var3.get(var2);
               if (var4 != null) {
                  return var4;
               }
            }
         }

         if (!Xqedii_22p9gb2(var2)) {
            return null;
         } else {
            for (String var8 : this.Xqedii_zemkq3u) {
               Map var5 = this.Xqedii_22z16ze.get(var8);
               if (var5 != null) {
                  BossbarAssets.Sprite var6 = (BossbarAssets.Sprite)var5.get(var2);
                  if (var6 != null) {
                     return var6;
                  }
               }
            }

            return null;
         }
      }
   }

   public static boolean Xqedii_22p9gb2(int var0) {
      if ((-799821435 ^ -799821435) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var0 < Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-669622078, 31) || var0 > Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-2075502445, 17))
               && (var0 < Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018029, 19) || var0 > Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(843631382, 14))
               && (var0 < Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-177755895, 31) || var0 > Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1180218258, 25))
            ? Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-354463213, 0)
            : Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018101, 5)) != 0;
      }
   }

   public int[] corner(int var1) {
      if (((1974026470 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1g8xv86.get(var1);
      }
   }

   public BossbarAssets.TextFace face(String var1) {
      if ((1639893657 ^ 1639893657) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null ? null : this.Xqedii_4i9xc2m.get(Xqedii_1f2zb8d(var1));
      }
   }

   public BossbarAssets.TextFace fallbackFace() {
      if ((-1438958113 * -1438958113 - -1438958113 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_32v33zt;
      }
   }

   public BossbarAssets.VanillaGlyph vanillaGlyph(int var1) {
      if (((2124696898 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_mt2rbjm.get(var1);
      }
   }

   public Double vanillaSpace(int var1) {
      if ((-111150603 * -111150603 - -111150603 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2gf04bx.get(var1);
      }
   }

   public int resolveVanillaClass(double var1) {
      if (((-85595586 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_306n3z0(this.Xqedii_2srd6vv, var1 * Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_34rt0r9fmi315(-2598368245060907237L, 20)));
      }
   }

   public int vanillaClassHeight(int var1) {
      if ((-383287700 * (-383287700 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 >= 0 && var1 < this.Xqedii_ruyfulx.size() ? this.Xqedii_ruyfulx.get(var1) : Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-980870875, 29);
      }
   }

   public static boolean isDefaultFont(String var0) {
      if ((1570218605 * 1570218605 + 1570218605 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && !var0.isBlank()) {
         String var1 = Xqedii_1f2zb8d(var0);
         return (!var1.equals(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("eZ+KKw96e/zL6D97gMmJTa+hJ25lGCFrqZ9bTvRgrcHp/o98cfqadhZU"))
               && !var1.equals(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("TGT9haZXWxb9I/IZiS82Vxxu5PblLUts89zPlRI6uR2PBOPl2YtbaEiR"))
            ? Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1542079101, 5)
            : Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1698582613, 28)) != 0;
      } else {
         return Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 8) != 0;
      }
   }

   public Map<String, byte[]> packEntries() {
      if ((1704888257 * (1704888257 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2d8kew5;
      }
   }

   public double[] maskLeftProfiles() {
      if ((-1331098942 * (-1331098942 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_34gi8qa;
      }
   }

   public double[] maskRightProfiles() {
      if ((-1568195786 * -1568195786 - -1568195786 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2x0izxh;
      }
   }

   public int detectedMaskCount() {
      if (((-400699773 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3b66x3g;
      }
   }

   public int textClassCount() {
      if ((-1269889613 * -1269889613 - -1269889613 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var1 = this.Xqedii_ruyfulx.size();

         for (BossbarAssets.TextFace var3 : this.Xqedii_3bv5jwx) {
            var1 += var3.Xqedii_103s6tt.size();
         }

         return var1;
      }
   }

   public synchronized boolean build(File var1, File var2, String var3, Logger var4) {
      if ((1945887474 * 1945887474 + 1945887474 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_22z16ze.clear();
         this.Xqedii_3r73ss7.clear();
         this.Xqedii_zemkq3u.clear();
         this.Xqedii_1g8xv86.clear();
         this.Xqedii_2d8kew5.clear();
         this.Xqedii_bq2pby8.clear();
         this.Xqedii_u379bgq.clear();
         Arrays.fill(this.Xqedii_34gi8qa, Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_34rt0r9fmi315(-965397907216027110L, 61)));
         Arrays.fill(this.Xqedii_2x0izxh, Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_2mh59o41a8d0c(7779195706835133457L, 52)));
         Arrays.fill(this.Xqedii_2zcg580, null);
         this.Xqedii_3b66x3g = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 21);
         this.Xqedii_3bv5jwx.clear();
         this.Xqedii_4i9xc2m.clear();
         this.Xqedii_358aqay.clear();
         this.Xqedii_mt2rbjm.clear();
         this.Xqedii_2gf04bx.clear();
         this.Xqedii_ruyfulx.clear();
         this.Xqedii_2srd6vv.clear();
         this.Xqedii_32v33zt = null;
         this.Xqedii_23e2m51 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 27) != 0;
         if (var1 != null && var1.isDirectory()) {
            File var5 = new File(
               var1, Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("LoXiKVyUZvOV2LVSL0ex00gYUag/qzhnajZ4Cua57vHTiXlC82yv5H4eMR6HrL4WSz/PMtQAsbNSKK01c7isK+RrUR4cXQ==")
            );
            File var6 = new File(
               var1,
               Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("DO1mNYSSkvI/bddTiUv5D0sDA2abEhyjupVMcxPJJTnCzMkv/WeUyZdrV72Dw/IK1E2ucOSakG7I5+KNTaMsfQuVm5uJyb0eVY2dVT53")
            );
            if (!var5.isDirectory()) {
               return Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 23) != 0;
            } else {
               for (int var7 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 19); var7 < Xqedii_30g0ulj.Xqedii_2aipka5.length; var7++) {
                  Map var10000 = this.Xqedii_1g8xv86;
                  Integer var10001 = Xqedii_30g0ulj.Xqedii_2aipka5[var7];
                  int[] var10002 = new int[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(610571286, 7)];
                  var10002[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1873349109, 7)] = var7 % Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967013973, 10);
                  var10002[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1459261591, 3)] = var7 / Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-708926417, 1);
                  var10000.put(var10001, var10002);
               }

               if (!this.Xqedii_1rjydxt(var6, var4)) {
                  return Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1179201890, 11) != 0;
               } else if (!this.Xqedii_1gz0t7u(var3)) {
                  if (var4 != null) {
                     var4.warning(
                        Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
                           "wGY12NOi8XBBUzTSxCZm62DowRyMggcmJCoijC8Gb8yakRWcgooZyLOxdo6lsOJJhQafNb4wa4OC+UzH8QDlpWJnAMKihBpfB1gZWJLgKSC0EHw2GogMsk3od3mEu+cfjhav1Vgg3qF9v5llT/GkYK8YQuPQM4zhf5iCZUi1woYB7rBV4lyOxLoVJVuhXDfAdUqqiYw3PNQ9YTHvmT5O81IPZ6xtK6h2inNeANjoBfCevhNIfS1hh/uSsx5HbGTxhsmdrGPAOViBt48pCLtrY4JcZHaS+MpMQ1o="
                        )
                     );
                  }

                  return Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 23) != 0;
               } else {
                  File[] var16 = var5.listFiles(
                     (var0, var1x) -> {
                        if ((1341785710 * 1341785710 - 1341785710 & 1) != 0) {
                           throw new IllegalStateException();
                        } else {
                           return var1x.toLowerCase(Locale.ROOT)
                              .endsWith(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("eRjHXxGOrG+F8fK0nTMInrc62zlz1OyEnGczP/nsvQT19EsrP6c="));
                        }
                     }
                  );
                  ArrayList<File> var8 = new ArrayList<>();
                  if (var16 != null) {
                     File[] var9 = var16;
                     int var10 = var16.length;

                     for (int var11 = Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(843680530, 14); var11 < var10; var11++) {
                        File var12 = var9[var11];
                        if (var12.getName()
                           .equalsIgnoreCase(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("XUt8kLJ7ugBiYlU1jQV4qCgGoUncm+PCkgz1JxKzqaBYrRZ15iXdcHOrVkUuTkDuaBA="))) {
                           var8.add(Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 13), var12);
                        } else {
                           var8.add(var12);
                        }
                     }
                  }

                  HashMap var17 = new HashMap();

                  for (File var20 : var8) {
                     String var23 = Xqedii_32sxbr5(var20);
                     if (var23 != null) {
                        String var13 = Xqedii_1f2zb8d(Xqedii_2yea0qa(var20.getName()));
                        this.Xqedii_21wvhfm(var13, var23, var6);
                        this.Xqedii_3n2tuta(var13, var23, var5, var17, var4);
                     }
                  }

                  this.Xqedii_32v33zt = this.Xqedii_4i9xc2m
                     .get(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("mkKnSNXjI3NXgOKVl4b8FOzzziydltf10oOlDeYHOdXuXkYUdwvm4A=="));
                  if (this.Xqedii_32v33zt == null && !this.Xqedii_3bv5jwx.isEmpty()) {
                     this.Xqedii_32v33zt = this.Xqedii_3bv5jwx.get(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1852683176, 9));
                  }

                  TreeSet var19 = new TreeSet();
                  this.Xqedii_1c4m1ho(var2, var19);
                  this.Xqedii_1zjdwwi();

                  for (BossbarAssets.TextFace var24 : this.Xqedii_3bv5jwx) {
                     this.Xqedii_oddi52i(var24, var19);
                  }

                  this.Xqedii_3mr1b30(var19);
                  byte[] var22 = this.Xqedii_353idsl();
                  this.Xqedii_2d8kew5
                     .put(
                        Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
                           "/WSrRq9xgvC1DqmGskY3d0E2LUgJH3dhOuSTY/G1VaEdCdtvP/xne2EXq+FJsvJgqfQo66bGMYa4JpCdTZATpGpHaq/nnCrxuWCqB7NShdG4Xa+Or2zZsN4I"
                        ),
                        var22
                     );
                  this.Xqedii_2d8kew5
                     .put(
                        Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
                           "o7pAkggnKOwBnUhFNLHyUtx+KeaCm40i6NJMV4s2TrnPwGRdZNdo0YSz2YjwLBUgTalyeGJs3HU9Xil0XphSj0R8zC53KJvkT32bU6CrDJ8vNgfeg4BpNXhMEsrvuCo0U00a9VejyGQ="
                        ),
                        var22
                     );
                  this.Xqedii_2d8kew5
                     .put(
                        Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
                           "zhNvmTDwHgOqZkHo9GsAYfpDrCZg7iW8icTXQq8DZjEqqBDQgPTY++4v4htH9AsSC0zzO1L4478SCU06Yt72WStwG46pz7xIQPhP9MQKBzHOzPCl1QmhdGtHu9xLvQ=="
                        ),
                        Xqedii_1j8afp2()
                     );
                  this.Xqedii_2d8kew5
                     .put(
                        Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
                           "siIREwcQ1rMRn0fxIq/HlXBiHNFyu9Ev3KN1+hR45GKJrtBppxZT79b8Zy0oX+D9qupsZ2axGfDOwUbIs/X0ix12TTuM/2uHMbMIPQ=="
                        ),
                        Xqedii_7u4xafbulx3c(this.Xqedii_amppsg3(), Xqedii_whwuvmn()).getBytes(StandardCharsets.UTF_8)
                     );

                  for (int var25 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 22); var25 < Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477844797, 11); var25++) {
                     this.Xqedii_2d8kew5.put(Xqedii_1hskjam(Xqedii_30g0ulj.Xqedii_urxo6vz(var25)), this.Xqedii_2h26q6x(var25).getBytes(StandardCharsets.UTF_8));
                  }

                  int var26 = Xqedii_30g0ulj.Xqedii_12brxt7(
                     Xqedii_30g0ulj.Xqedii_2117ist(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(589602993, 10), Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 12))
                  );

                  for (Entry var14 : this.Xqedii_3r73ss7.entrySet()) {
                     if (!((List)var14.getValue()).isEmpty()) {
                        this.Xqedii_2d8kew5
                           .put(
                              Xqedii_1hskjam(Xqedii_30g0ulj.Xqedii_ss1kifv((String)var14.getKey())),
                              this.Xqedii_w4gmhch((List<Xqedii_1yrleh4>)var14.getValue(), var26).getBytes(StandardCharsets.UTF_8)
                           );
                     }
                  }

                  for (BossbarAssets.TextFace var31 : this.Xqedii_3bv5jwx) {
                     this.Xqedii_2d8kew5.put(var31.Xqedii_2bductn, var31.ttf.withZeroAdvances());

                     for (int var15 = Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1115511786, 21); var15 < var31.Xqedii_103s6tt.size(); var15++) {
                        this.Xqedii_2d8kew5
                           .put(
                              Xqedii_1hskjam(var31.fontKey(var15)),
                              this.Xqedii_fxidod2(var31, var31.Xqedii_103s6tt.get(var15)).getBytes(StandardCharsets.UTF_8)
                           );
                     }
                  }

                  for (int var29 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 9); var29 < this.Xqedii_ruyfulx.size(); var29++) {
                     this.Xqedii_2d8kew5
                        .put(
                           Xqedii_1hskjam(Xqedii_30g0ulj.Xqedii_3u38bb9(var29)),
                           this.Xqedii_8thy2vg(this.Xqedii_ruyfulx.get(var29)).getBytes(StandardCharsets.UTF_8)
                        );
                  }

                  byte[] var30 = Xqedii_z89iad5();
                  this.Xqedii_2d8kew5
                     .put(
                        Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
                           "t+Ng8plf3g6+6MR3pSwRkGAIpacDltRMKO7EaRG2zq3grwX+7+93Awu+y6Yb6nhG+VDt6KG/jh2ibTZTHpz9r3FnbtqEXiBQRyUVDBTJd3BSS2lZM38OCaFn4Ny2/d4ZLfZa7EJnNgLLQYlwEcI3GA2u8K2OKZu9dgBKRw5iN4N7hD6PCZMrCLYLRh7m0+x9r+Oh09ez79on5C6hM4n82yP6T/A="
                        ),
                        var30
                     );
                  this.Xqedii_2d8kew5
                     .put(
                        Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
                           "xaxueCJqQDJFd+w9HLZz6Xa9ce6ReLpyR0xPu2q6pyUDNQEpu8g5EjOH0EPlNQv9CHoTrnnBRkCirhPhY9xkF+gHisjEvAFRs7040MbJ+GMYH0BQDYZJDDU90ZzPr1I7gY0UJ12dJBBxUXuK36R2RVLlyIhMo1sMb14ifa7OSN0HsmQnGLI33SwG6l88Q/H3Nm7UuuTOKJeBULP7UJprQA=="
                        ),
                        var30
                     );
                  this.Xqedii_23e2m51 = Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1925483666, 28) != 0;
                  return Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 19) != 0;
               }
            }
         } else {
            return Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1839020916, 20) != 0;
         }
      }
   }

   public static String Xqedii_1hskjam(String var0) {
      if (((1645455017 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var1 = var0.substring(var0.indexOf(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1648773889, 3)) + Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(893276245, 30));
         return Xqedii_13vpsst5gm2xh(var1);
      }
   }

   public boolean Xqedii_1gz0t7u(String var1) {
      if ((472374833 ^ 472374833) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         BossbarAssets.VanillaProvider var2 = null;
         String[] var3 = var1.split(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("KL20gfWa9IjV2eMGNa/oQQUtYIxMzHFvibYvr6MW"));
         int var4 = var3.length;

         for (int var5 = Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1839020916, 20); var5 < var4; var5++) {
            String var6 = var3[var5];
            String var7 = var6.trim();
            if (!var7.isEmpty()) {
               String[] var8 = var7.split(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("XZjto9MHg6nfk02rPF9UwcQYh3WQhjrKbMmCSnhG"));

               try {
                  if (var8[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1687361060, 15)]
                        .equals(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("9njTpK6FrBkIvhBB8svYFuu12nO3O2/j+V6CrEgO"))
                     && var8.length == Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1539844674, 17)) {
                     var2 = new BossbarAssets.VanillaProvider(
                        var8[Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 25)],
                        Integer.parseInt(var8[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-2072332332, 22)]),
                        Integer.parseInt(var8[Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477857085, 13)]),
                        Integer.parseInt(var8[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-2047166508, 22)]),
                        Integer.parseInt(var8[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967019349, 8)]),
                        Integer.parseInt(var8[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1852680104, 9)]),
                        Integer.parseInt(var8[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1417852845, 2)])
                     );
                     this.Xqedii_358aqay.add(var2);
                  } else if (var8[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 12)]
                        .equals(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("KEIqRm6KVPdwANaV+zElVHPmZGFnzK4Rsv912mzR"))
                     && var8.length == Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1966952533, 16)) {
                     this.Xqedii_2gf04bx
                        .put(
                           Integer.parseInt(var8[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1971212373, 22)], Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1964920917, 17)),
                           Double.parseDouble(var8[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(610571286, 7)])
                        );
                  } else if (var2 != null && var8.length == Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1965969493, 18)) {
                     int var9 = Integer.parseInt(var8[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-997420446, 4)], Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967083605, 12));
                     int var10 = Integer.parseInt(var8[Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 29)]);
                     int var11 = Integer.parseInt(var8[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-2072332332, 22)]);
                     int var12 = Integer.parseInt(var8[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1417852861, 2)]);
                     if (var10 < var2.Xqedii_3ax7hbv.length && var11 < var2.Xqedii_zumpzhc) {
                        var2.Xqedii_3ax7hbv[var10][var11] = var9;
                        this.Xqedii_mt2rbjm.putIfAbsent(var9, new BossbarAssets.VanillaGlyph(var2, var12));
                     }
                  }
               } catch (NumberFormatException var13) {
               }
            }
         }

         return (!this.Xqedii_358aqay.isEmpty() && !this.Xqedii_mt2rbjm.isEmpty()
            ? Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 17)
            : Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(640436425, 24)) != 0;
      } else {
         return Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 5) != 0;
      }
   }

   public void Xqedii_oddi52i(BossbarAssets.TextFace var1, TreeSet<Integer> var2) {
      if ((690547204 * 690547204 + 690547204 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         TreeSet<Long> var3 = new TreeSet<>();

         for (int var5 : var2) {
            double var6 = var1.providerSize * var5 / Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_30j5hfj6jmnrh(-2829680591544017221L, 50));
            if (var6 >= Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_2mh59o41a8d0c(7779614620765314017L, 16))
               && var6 <= Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_34rt0r9fmi315(8521759739312798767L, 42))) {
               var3.add(Math.round(var6 * Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_3i6kn9mpdp14m(-6622949245553513616L, 10))));
            }
         }

         for (double var9 = Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_30j5hfj6jmnrh(-1752192524395503028L, 32));
            var9 <= Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_3i6kn9mpdp14m(7212108809728647798L, 12))
               && var3.size() < Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1608912701, 20);
            var9 *= Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_30j5hfj6jmnrh(6301742717086909912L, 5))
         ) {
            var3.add(Math.round(var9 * Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_2mh59o41a8d0c(7779605816082359313L, 45))));
         }

         for (long var7 : var3) {
            var1.Xqedii_103s6tt.add(var7 / Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_30j5hfj6jmnrh(-707419873008097362L, 48)));
         }
      }
   }

   public void Xqedii_3mr1b30(TreeSet<Integer> var1) {
      if ((412358087 * (412358087 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         TreeSet<Integer> var2 = new TreeSet<>();

         for (int var4 : var1) {
            int var5 = (int)Math.round(var4 / Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_30j5hfj6jmnrh(-1687941750673658021L, 14)));
            if (var5 >= Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018005, 5) && var5 <= Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018068, 23)) {
               var2.add(var5);
            }
         }

         for (double var7 = Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_34rt0r9fmi315(8898576006222162371L, 17));
            var7 <= Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_34rt0r9fmi315(-5208446522645349720L, 13));
            var7 *= Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_3i6kn9mpdp14m(7428334368400566671L, 58))
         ) {
            var2.add((int)Math.round(var7));
         }

         this.Xqedii_ruyfulx.addAll(var2);

         for (int var6 : var2) {
            this.Xqedii_2srd6vv.add((double)var6);
         }
      }
   }

   public static int Xqedii_306n3z0(List<Double> var0, double var1) {
      if ((-1460423486 * -1460423486 + -1460423486 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0.isEmpty()) {
         return Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(-1967018070, 5);
      } else {
         int var3 = Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 11);
         double var4 = Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_34rt0r9fmi315(-1240624005021507707L, 39));
         double var6 = Math.log(Math.max(Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_2mh59o41a8d0c(9190825394165425087L, 28)), var1));

         for (int var8 = Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 30); var8 < var0.size(); var8++) {
            double var9 = Math.abs(Math.log((Double)var0.get(var8)) - var6);
            if (var9 < var4) {
               var4 = var9;
               var3 = var8;
            }
         }

         return var3;
      }
   }

   public void Xqedii_3n2tuta(String var1, String var2, File var3, Map<String, BossbarAssets.TextFace> var4, Logger var5) {
      if (((-611728007 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Matcher var6 = Pattern.compile(
               Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
                  "Ok1Qm8JfUiu8NvvS1YXQI2GU8HRJL6rQKg+pjis5I5a6Tgx9Yi131b/p9SWL+AWQmzQmGFoeQ5s/wPTp4rtp/Fya2oyNP6fRgVaL4K5mzjiiskNsBeNMCOuY8PeUYlqi"
               ),
               Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967050837, 10)
            )
            .matcher(var2);
         if (var6.find()) {
            String var7 = var6.group();
            String var8 = Xqedii_3n30o8q(var7, Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("XVMMXVvIolPh8nLamkWEgrAx0Y2qO3rU8YE3CKRTig2V1Uvd"));
            if (var8 != null) {
               double var9 = Xqedii_3157qxz(
                  var7,
                  Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("bvHxzIr9OfTb9lF/kZ4/PBn91Y2vfR4+Z2MnkXsMjBsCv+CE"),
                  Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_3i6kn9mpdp14m(7212108809013717391L, 31))
               );
               String var11 = var8.indexOf(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(738560281, 21)) >= 0
                  ? var8.substring(var8.indexOf(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1852653480, 9)) + Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(421848457, 13))
                  : var8;
               File var12 = new File(var3, var11);
               String var13 = Xqedii_32x2bgyghy4g5(var12.getAbsolutePath().toLowerCase(Locale.ROOT), var9);
               BossbarAssets.TextFace var14 = (BossbarAssets.TextFace)var4.get(var13);
               if (var14 == null) {
                  if (!var12.isFile()) {
                     return;
                  }

                  BossbarTtf var15;
                  try {
                     var15 = BossbarTtf.parse(Files.readAllBytes(var12.toPath()));
                  } catch (Exception var18) {
                     var15 = null;
                  }

                  if (var15 == null) {
                     if (var5 != null) {
                        var5.warning(Xqedii_2tjr1m0qjbb7z(var12.getName()));
                     }

                     return;
                  }

                  int var16 = this.Xqedii_3bv5jwx.size();
                  String var17 = Xqedii_1tipx3ge40i9d(var16);
                  var14 = new BossbarAssets.TextFace(var16, var15, var9, Xqedii_33xy8svdh7khy(var17), Xqedii_3i5baqs2qs9zd(var17));
                  this.Xqedii_3bv5jwx.add(var14);
                  var4.put(var13, var14);
               }

               this.Xqedii_4i9xc2m.putIfAbsent(var1, var14);
            }
         }
      }
   }

   public boolean Xqedii_1rjydxt(File var1, Logger var2) {
      if ((1758839285 * 1758839285 - 1758839285 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         for (int var3 = Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 1); var3 < Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1971212373, 20); var3++) {
            String var4 = Xqedii_30g0ulj.Xqedii_2vztery[var3 * Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1075187517, 27)];
            File var5 = Xqedii_2ux8jqp(var1, var4);
            BufferedImage var6 = var5 != null && var5.isFile() ? Xqedii_3g0np12(var5) : null;
            if (var6 == null) {
               if (var2 != null) {
                  var2.warning(Xqedii_18niansmrif55(var4));
               }

               return Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(557755893, 20) != 0;
            }

            Xqedii_3tswp0o var7 = Xqedii_3mfgtea(var6, var6.getWidth(), var6.getHeight(), Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967026261, 13) != 0);
            if (var7.Xqedii_35hzvzl == null) {
               double[][] var10000 = this.Xqedii_2zcg580;
               double[] var10002 = new double[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-354463209, 0)];
               var10002[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(843680530, 14)] = Double.longBitsToDouble(
                  Xqedii_3b1vf9x.Xqedii_3i6kn9mpdp14m(7212108809728649615L, 63)
               );
               var10002[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018005, 6)] = Double.longBitsToDouble(
                  Xqedii_3b1vf9x.Xqedii_3i6kn9mpdp14m(7212108809728649615L, 61)
               );
               var10002[Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1343622973, 27)] = Double.longBitsToDouble(
                  Xqedii_3b1vf9x.Xqedii_30j5hfj6jmnrh(-1428773420770070686L, 60)
               );
               var10002[Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1482035005, 21)] = Double.longBitsToDouble(
                  Xqedii_3b1vf9x.Xqedii_34rt0r9fmi315(-2340201886777712418L, 23)
               );
               var10000[var3] = var10002;
            } else {
               this.Xqedii_27hsixd(var3, var7.Xqedii_35hzvzl, var7.Xqedii_2271rrf);
               double[][] var8 = this.Xqedii_2zcg580;
               double[] var9 = new double[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1323096920, 2)];
               var9[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-920245176, 16)] = var7.Xqedii_3pt5yyk;
               var9[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1221142316, 8)] = var7.Xqedii_3swhmwp;
               var9[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018005, 5)] = var7.Xqedii_8tx3ju4;
               var9[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018067, 1)] = var7.Xqedii_2tsv7ep;
               var8[var3] = var9;
            }
         }

         return Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1840359279, 17) != 0;
      }
   }

   public void Xqedii_27hsixd(int var1, double[] var2, double[] var3) {
      if ((931598162 ^ 931598162) != 0) {
         throw new IllegalStateException();
      } else {
         int var4 = Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1966886997, 13);

         for (int var5 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 28); var5 < var4; var5++) {
            this.Xqedii_34gi8qa[var1 * var4 + var5] = var2[var5];
            this.Xqedii_2x0izxh[var1 * var4 + var5] = var3[var5];
         }
      }
   }

   public void Xqedii_1zjdwwi() {
      if (((1549234350 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Set var1 = Collections.newSetFromMap(new IdentityHashMap());

         for (Map<Integer, BossbarAssets.Sprite> var3 : this.Xqedii_22z16ze.values()) {
            for (BossbarAssets.Sprite var5 : var3.values()) {
               if (var5.Xqedii_1n24cd5 != null && !var5.fill) {
                  if (this.Xqedii_1g8xv86.containsKey(var5.codepoint)) {
                     var1.add(var5.Xqedii_1n24cd5);
                  }

                  var5.Xqedii_1n24cd5.Xqedii_3k1yqfa = var5.Xqedii_1n24cd5.Xqedii_3k1yqfa
                     + this.Xqedii_u379bgq.getOrDefault(var5.codepoint, Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(334159698, 24));
               }
            }
         }

         ArrayList<Xqedii_3tswp0o> var10 = new ArrayList<>();

         for (Xqedii_3tswp0o var13 : this.Xqedii_bq2pby8.values()) {
            if (var13.Xqedii_2yhkxim && !var1.contains(var13)) {
               var10.add(var13);
            }
         }

         var10.sort(Comparator.<Xqedii_3tswp0o>comparingInt(var0 -> {
            if ((1658723474 * 1658723474 + 1658723474 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return -var0.Xqedii_3k1yqfa;
            }
         }).thenComparingInt(var0 -> {
            if (((-563791824 << 1 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               return var0.Xqedii_qv53bcr;
            }
         }));
         int var12 = Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1564177262, 28);

         for (Xqedii_3tswp0o var16 : var10) {
            if (var12 >= Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1936497980, 12)) {
               break;
            }

            var16.Xqedii_16trc1i = var12;
            this.Xqedii_27hsixd(var12, var16.Xqedii_35hzvzl, var16.Xqedii_2271rrf);
            var12++;
            this.Xqedii_3b66x3g = this.Xqedii_3b66x3g + Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1994840859, 5);
         }

         for (Map<Integer, BossbarAssets.Sprite> var17 : this.Xqedii_22z16ze.values()) {
            for (BossbarAssets.Sprite var7 : var17.values()) {
               if (!var7.fill) {
                  int[] var8 = this.Xqedii_1g8xv86.get(var7.codepoint);
                  if (var8 != null && this.Xqedii_2zcg580[var8[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1852682664, 9)]] != null) {
                     double[] var18 = Xqedii_dkdt52m(
                        this.Xqedii_2zcg580[var8[Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 22)]],
                        var8[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(589600945, 10)]
                     );
                     var7.Xqedii_25jvhe9 = new BossbarAssets.Mask(
                        var8[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967050837, 15)],
                        var8[Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 17)],
                        Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1228497478, 19) != 0,
                        var18[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(2103175746, 29)],
                        var18[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1818876828, 23)],
                        var18[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(2000572501, 24)],
                        var18[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(554610165, 20)]
                     );
                  } else if (var7.Xqedii_1n24cd5 != null && var7.Xqedii_1n24cd5.Xqedii_16trc1i >= 0) {
                     Xqedii_3tswp0o var9 = var7.Xqedii_1n24cd5;
                     var7.Xqedii_25jvhe9 = new BossbarAssets.Mask(
                        var9.Xqedii_16trc1i,
                        Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 29),
                        Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 7) != 0,
                        var9.Xqedii_3pt5yyk,
                        var9.Xqedii_3swhmwp,
                        var9.Xqedii_8tx3ju4,
                        var9.Xqedii_2tsv7ep
                     );
                  }
               }
            }
         }
      }
   }

   public static double[] Xqedii_dkdt52m(double[] var0, int var1) {
      if (((-1663847073 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double var2 = var0[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 26)];
         double var4 = var0[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018325, 8)];
         double var6 = var0[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1899909205, 25)];
         double var8 = var0[Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1511395133, 24)];

         for (int var10 = Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1868605702, 19); var10 < (var1 & Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018067, 1)); var10++) {
            double var11 = Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_30j5hfj6jmnrh(4173637887351318675L, 30)) - var8;
            double var13 = var2;
            double var15 = Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_30j5hfj6jmnrh(-5659311705064784521L, 51)) - var4;
            double var17 = var6;
            var2 = var11;
            var4 = var13;
            var6 = var15;
            var8 = var17;
         }

         double[] var10000 = new double[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(-180465579, 29)];
         var10000[Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 17)] = var2;
         var10000[Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 27)] = var4;
         var10000[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967083605, 15)] = var6;
         var10000[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(843729682, 14)] = var8;
         return var10000;
      }
   }

   public static Xqedii_3tswp0o Xqedii_3mfgtea(BufferedImage var0, int var1, int var2, boolean var3) {
      if (((1244429310 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_3tswp0o var4 = new Xqedii_3tswp0o();
         int var5 = Math.min(var1, var0.getWidth());
         int var6 = Math.min(var2, var0.getHeight());
         if (var5 > 0 && var6 > 0) {
            int[] var7 = var0.getRGB(
               Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-548269078, 8),
               Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1868605702, 19),
               var5,
               var6,
               null,
               Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-177231607, 31),
               var5
            );
            int var8 = var5;
            int var9 = var6;
            int var10 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(669642946, 31);
            int var11 = Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(-1967018070, 12);
            int var12 = Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1096538667, 9);
            int[] var13 = new int[var6];
            int[] var14 = new int[var6];
            int[] var15 = new int[var6];
            int var16 = var6;
            int var17 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1476792126, 20);

            for (int var18 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 20); var18 < var6; var18++) {
               var13[var18] = Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(-1967018070, 23);
               var14[var18] = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477838654, 11);

               for (int var19 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 3); var19 < var5; var19++) {
                  int var20 = var7[var18 * var5 + var19];
                  int var21 = var20 >>> Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1326845757, 24) & Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1609167042, 26);
                  if (var21 != 0) {
                     var8 = Math.min(var8, var19);
                     var10 = Math.max(var10, var19);
                     var9 = Math.min(var9, var18);
                     var11 = Math.max(var11, var18);
                     if (var21 >= Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(618180899, 18)) {
                        int var22 = Math.min(
                           var20 >> Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-997420190, 4) & Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477574461, 11),
                           Math.min(
                              var20 >> Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967001685, 11) & Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-997416366, 4),
                              var20 & Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(423929225, 13)
                           )
                        );
                        if (var22 < Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1300123733, 22)) {
                           var12 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 30);
                        }
                     }

                     if (var21 >= Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1474949318, 28)) {
                        if (var13[var18] < 0) {
                           var13[var18] = var19;
                        }

                        var14[var18] = var19;
                        var15[var18] += Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 8);
                     }
                  }
               }

               if (var15[var18] > 0) {
                  var16 = Math.min(var16, var18);
                  var17 = var18;
               }
            }

            var4.Xqedii_1a5c6jj = var10 + Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(634764964, 25);
            if (var10 < 0) {
               var4.Xqedii_qy2hoop = Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_2mh59o41a8d0c(7779614620765316113L, 10));
               var4.Xqedii_36a72dl = Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_30j5hfj6jmnrh(6767887671026293199L, 41));
               var4.Xqedii_bx35dr9 = Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_2mh59o41a8d0c(7779614620765316113L, 63));
               var4.Xqedii_183ci73 = Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_2mh59o41a8d0c(7779614620765316113L, 36));
               return var4;
            } else {
               var4.Xqedii_qy2hoop = (double)var8 / var1;
               var4.Xqedii_36a72dl = (double)var9 / var2;
               var4.Xqedii_bx35dr9 = (double)(var10 + Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 4)) / var1;
               var4.Xqedii_183ci73 = (double)(var11 + Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018068, 0)) / var2;
               if (var17 < 0) {
                  return var4;
               } else {
                  int var47 = var5;
                  int var48 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-404098878, 30);
                  int var49 = Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1096538667, 9);

                  for (int var50 = var16; var50 <= var17; var50++) {
                     if (var15[var50] == 0) {
                        var49 = Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 8);
                     } else {
                        if (var15[var50] != var14[var50] - var13[var50] + Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(589601969, 10)) {
                           var49 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 21);
                        }

                        var47 = Math.min(var47, var13[var50]);
                        var48 = Math.max(var48, var14[var50]);
                     }
                  }

                  int var51 = var48 - var47 + Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1698582613, 28);
                  int var52 = var17 - var16 + Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 20);
                  if (var3 || var12 != 0 && var49 != 0 && var51 * var52 >= Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477889853, 14)) {
                     int var23 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1743384770, 30);
                     double[] var24 = new double[var23];
                     double[] var25 = new double[var23];

                     for (int var26 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 26); var26 < var23; var26++) {
                        int var27 = var16
                           + Math.min(
                              var52 - Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 2),
                              (int)Math.floor((var26 + Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_34rt0r9fmi315(4014925514209426070L, 13))) / var23 * var52)
                           );
                        if (var15[var27] == 0) {
                           var24[var26] = Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_2mh59o41a8d0c(7785244120299529233L, 61));
                           var25[var26] = Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_34rt0r9fmi315(-4680403773555428931L, 24));
                        } else {
                           var24[var26] = (double)(var13[var27] - var47) / var51;
                           var25[var26] = (double)(var14[var27] + Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(556707317, 20) - var47) / var51;
                        }
                     }

                     int var53 = Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-364741285, 13);
                     int var54 = Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1377037023, 16);

                     for (int var28 = Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 0); var28 < var52; var28++) {
                        double var29 = (var28 + Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_2mh59o41a8d0c(7779614620765322209L, 15))) / var52 * var23
                           - Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_30j5hfj6jmnrh(-6751767002694630737L, 16));
                        double var31 = Math.floor(var29);
                        double var33 = var29 - var31;
                        int var35 = Math.max(
                           Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 20),
                           Math.min(var23 - Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1376971487, 16), (int)var31)
                        );
                        int var36 = Math.max(
                           Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-354463213, 0),
                           Math.min(
                              var23 - Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 3), (int)var31 + Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-2068138028, 22)
                           )
                        );
                        double var37 = var24[var35] + (var24[var36] - var24[var35]) * var33;
                        double var39 = var25[var35] + (var25[var36] - var25[var35]) * var33;
                        int var41 = var16 + var28;

                        for (int var42 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 16); var42 < var51; var42++) {
                           double var43 = (var42 + Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_34rt0r9fmi315(-5788986463960450271L, 57))) / var51;
                           int var45 = var43 >= var37 && var43 <= var39
                              ? Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1210809158, 6)
                              : Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1323096936, 2);
                           int var46 = (
                                    var7[var41 * var5 + var47 + var42] >>> Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1873348085, 7)
                                       & Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(694306385, 27)
                                 )
                                 >= Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(647541027, 18)
                              ? Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-354463214, 0)
                              : Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 26);
                           if (var46 != 0) {
                              var54++;
                           }

                           if (var45 != var46) {
                              var53++;
                           }
                        }
                     }

                     int var55 = var53
                           <= Math.max(
                              Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_3i6kn9mpdp14m(7212108809728649871L, 10)),
                              Double.longBitsToDouble(Xqedii_3b1vf9x.Xqedii_2mh59o41a8d0c(-8621954305863103970L, 6)) * var54
                           )
                        ? Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018053, 4)
                        : Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 29);
                     var4.Xqedii_2yhkxim = (!var3 && (var12 == 0 || var49 == 0 || var55 == 0)
                        ? Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1096538155, 9)
                        : Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-548269334, 8)) != 0;
                     var4.Xqedii_3pt5yyk = (double)var47 / var1;
                     var4.Xqedii_3swhmwp = (double)var16 / var2;
                     var4.Xqedii_8tx3ju4 = (double)(var48 + Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1485935182, 1)) / var1;
                     var4.Xqedii_2tsv7ep = (double)(var17 + Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 2)) / var2;
                     var4.Xqedii_35hzvzl = var24;
                     var4.Xqedii_2271rrf = var25;
                     return var4;
                  } else {
                     return var4;
                  }
               }
            }
         } else {
            return var4;
         }
      }
   }

   public static BufferedImage Xqedii_3g0np12(File var0) {
      if ((-917601436 * (-917601436 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            return ImageIO.read(var0);
         } catch (Exception var2) {
            return null;
         }
      }
   }

   public void Xqedii_21wvhfm(String var1, String var2, File var3) {
      if (((-651100232 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         List var4 = this.Xqedii_3r73ss7.computeIfAbsent(var1, var0 -> {
            if ((1137607296 * 1137607296 + 1137607296 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return new ArrayList<>();
            }
         });
         Map var5 = this.Xqedii_22z16ze.computeIfAbsent(var1, var0 -> {
            if ((-1049970902 * -1049970902 - -1049970902 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return new HashMap<>();
            }
         });
         if (!this.Xqedii_zemkq3u.contains(var1)) {
            this.Xqedii_zemkq3u.add(var1);
         }

         Matcher var6 = Pattern.compile(
               Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
                  "XP5Mger0162sXuKvrLeDcrhx8ffwD55Znbz8uJ5zXcDHCmyrPu/VdPbCM9mOSnd4QOvs0A+6VR6hD65it8yiPPmgk8cjgUaKo9ik8u3MG0IqPLWqjXcKxovG8JDHr3LJMzrZJKyg"
               ),
               Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477836989, 7)
            )
            .matcher(var2);

         while (true) {
            String var7;
            List<String> var9;
            int var14;
            int var15;
            int var16;
            Xqedii_3tswp0o var19;
            String var21;
            while (true) {
               String var8;
               File var10;
               int var17;
               BufferedImage var20;
               while (true) {
                  if (!var6.find()) {
                     return;
                  }

                  var7 = var6.group();
                  var8 = Xqedii_3n30o8q(var7, Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("XVMMXVvIolPh8nLamkWEgrAx0Y2qO3rU8YE3CKRTig2V1Uvd"));
                  if (var8 != null) {
                     var9 = Xqedii_ae2auz0(var7, Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("6ze0sovK2ML3xLLnUTPsXc0EQLG6kgQjYgnzpRPXGAtnc7jXG3w="));
                     if (!var9.isEmpty()) {
                        var10 = Xqedii_2ux8jqp(var3, var8);
                        if (var10 != null && var10.isFile()) {
                           int[] var11 = Xqedii_1efhcb5(var10);
                           if (var11 != null) {
                              int var12 = ((String)var9.get(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1733221596, 26)))
                                 .codePointCount(
                                    Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1280872850, 25),
                                    ((String)var9.get(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1733221596, 26))).length()
                                 );
                              int var13 = var9.size();
                              if (var12 > 0 && var12 * var13 == Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(893276245, 30)) {
                                 var14 = var11[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 25)] / var12;
                                 var15 = var11[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1238045234, 22)] / var13;
                                 if (var14 > 0 && var15 > 0) {
                                    var16 = Math.max(var14, var15);
                                    var17 = var14 == var15
                                       ? Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1179203938, 11)
                                       : Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1213180797, 18);
                                    String var18 = Xqedii_3pvo9iuspg3xd(var10.getAbsolutePath().toLowerCase(Locale.ROOT), var14, var15);
                                    var19 = this.Xqedii_bq2pby8.get(var18);
                                    var20 = null;
                                    if (var19 != null) {
                                       break;
                                    }

                                    var20 = Xqedii_3g0np12(var10);
                                    if (var20 != null) {
                                       var19 = Xqedii_3mfgtea(var20, var14, var15, Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 30) != 0);
                                       var19.Xqedii_qv53bcr = this.Xqedii_bq2pby8.size();
                                       this.Xqedii_bq2pby8.put(var18, var19);
                                       break;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               if (var17 != 0) {
                  var21 = var8.indexOf(Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1210807686, 6)) >= 0 ? var8 : Xqedii_3qyjp1kvj0s3r(var8);
                  break;
               }

               String var22 = Xqedii_vzyhj2m(var8);
               String var23 = Xqedii_2hsp8bzu94f2e(var22);
               if (!this.Xqedii_2d8kew5.containsKey(var23)) {
                  if (var20 == null) {
                     var20 = Xqedii_3g0np12(var10);
                  }

                  byte[] var24 = var20 == null ? null : Xqedii_3npcta5(var20, var14, var15);
                  if (var24 == null) {
                     continue;
                  }

                  this.Xqedii_2d8kew5.put(var23, var24);
               }

               var21 = Xqedii_1ejmhents32h5(var22);
               break;
            }

            var4.add(new Xqedii_1yrleh4(var21, var9));
            int var40 = Xqedii_jdi2z8i(
               var7,
               Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("XN6H6Qwzh8rGIPkuwSX+GWVwsD4sLH7r/ezgkrS+r9qC19vWRUk/pg=="),
               Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1267405362, 22)
            );
            int var41 = Xqedii_jdi2z8i(
               var7,
               Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("phHCdxA5GveeuKivSa68hgqWrUehUxSewD9q4TuGMIZc64z+wcXqnA=="),
               Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967099989, 14)
            );
            double var42 = (double)var40 / var15;
            double var26 = (double)var16 / var14;
            double var28 = (double)var16 / var15;
            int var30 = Math.max(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1233850930, 22), var19.Xqedii_1a5c6jj);
            int var31 = Xqedii_30g0ulj.Xqedii_2lccqs8(var30, Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1210809158, 6), var16);
            int var32 = Xqedii_30g0ulj.Xqedii_2lccqs8(var30, var40, var15);
            double var33 = var14 * var42;
            int var35 = var14 == Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-354463214, 0) && var15 == Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 0)
               ? Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1818876828, 23)
               : Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1051587873, 28);

            for (String var37 : var9) {
               int var38 = Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1542079101, 5);

               while (var38 < var37.length()) {
                  int var39 = var37.codePointAt(var38);
                  var38 += Character.charCount(var39);
                  if (var39 != 0) {
                     var5.putIfAbsent(var39, new BossbarAssets.Sprite(var1, var39, var26, var28, var31, var32, var33, var40, var41, var35 != 0, var19));
                  }
               }
            }
         }
      }
   }

   public void Xqedii_1c4m1ho(File var1, TreeSet<Integer> var2) {
      if ((174190204 * (174190204 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null && var1.isDirectory()) {
            this.Xqedii_34rp7iv(var1, var2, Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 31));
         }
      }
   }

   public void Xqedii_34rp7iv(File var1, TreeSet<Integer> var2, int var3) {
      if ((-1986203330 * -1986203330 + -1986203330 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var3 <= Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1776933788, 23)) {
         File[] var4 = var1.listFiles();
         if (var4 != null) {
            File[] var5 = var4;
            int var6 = var4.length;

            for (int var7 = Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1852683176, 9); var7 < var6; var7++) {
               File var8 = var5[var7];
               if (var8.isDirectory()) {
                  this.Xqedii_34rp7iv(var8, var2, var3 + Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(421848457, 13));
               } else if (var8.getName()
                  .toLowerCase(Locale.ROOT)
                  .endsWith(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("GTebPnDzMwOfPrdHT0ePFAY1sKiOiTD/e2st7ky9ovVmt6pI"))) {
                  String var9;
                  try {
                     var9 = new String(Files.readAllBytes(var8.toPath()), StandardCharsets.UTF_8);
                  } catch (Exception var14) {
                     continue;
                  }

                  Matcher var10 = Xqedii_1af7ajg.matcher(var9);

                  while (var10.find() && var2.size() <= Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477046077, 13)) {
                     try {
                        int var11 = Integer.parseInt(var10.group(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1179203938, 11)));
                        if (var11 > 0 && var11 <= Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1150822978, 17)) {
                           var2.add(var11);
                        }
                     } catch (NumberFormatException var13) {
                     }
                  }

                  String var15 = Xqedii_2fek80p(var9);
                  Matcher var12 = Xqedii_37foha6.matcher(var15);

                  while (var12.find()) {
                     if (!var12.group(Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018325, 8))
                        .equalsIgnoreCase(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("MO1ld6ANCZT4kT5sNzrJztdYEYikCArr9qSozDGDKWIJMc0PvYNmRw=="))) {
                        this.Xqedii_u379bgq
                           .merge(
                              var12.group(Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018197, 6)).codePointAt(Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 15)),
                              Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 18),
                              Integer::sum
                           );
                     }
                  }
               }
            }
         }
      }
   }

   public static String Xqedii_2fek80p(String var0) {
      if (((-211021540 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Matcher var1 = Xqedii_2qvddoh.matcher(var0);
         StringBuilder var2 = new StringBuilder(var0.length());

         while (var1.find()) {
            var1.appendReplacement(
               var2,
               Matcher.quoteReplacement(
                  String.valueOf(
                     (char)Integer.parseInt(var1.group(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1221142316, 8)), Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967026261, 9))
                  )
               )
            );
         }

         var1.appendTail(var2);
         return var2.toString();
      }
   }

   public byte[] Xqedii_353idsl() {
      if (((-1210008399 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         BufferedImage var1 = new BufferedImage(
            Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1965969493, 12),
            Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840069, 3),
            Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1376444130, 4)
         );

         for (int var2 = Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1336638792, 26); var2 < Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(-180465579, 24); var2++) {
            for (int var3 = Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1280872850, 25); var3 < Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-181322067, 12); var3++) {
               int var4 = var3 + var2 * Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1987374542, 22);
               var1.setRGB(var3, var2, Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1963036757, 22) | Xqedii_30g0ulj.Xqedii_y8z3na4(var4));
            }
         }

         return Xqedii_37wh9e2(var1);
      }
   }

   public String Xqedii_2h26q6x(int var1) {
      if ((-1469613 * -1469613 + -1469613 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         StringBuilder var2 = new StringBuilder(Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018053, 16));
         var2.append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("Ju02OEQLXzpynkWABKLcDE1xPMpwH8tNoGlKtdwGUvRGgvtIrX7VbUXSCao0JwYhoWlI0YmOG6I="));
         var2.append(
            Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
               "F1kIKgl7xvsvQWrYb+PzuZlBCL/3mOfZH8vYxUQpibd3yCWK8Xnn0jYwObdAEuU8UJDDdWQpJXVtF9fRYAlI/0gO+faKM/YScnAD+swju/aUUR87Ie3iU+/ZdGnJMtk8sB0="
            )
         );
         var2.append((char)Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(371483817, 31));
         this.Xqedii_2yuivjm(
            var2,
            Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("C1ajGkWS3+tNgnRyDkWrI/acRDOl3HDM0Jh3OIt9zID8e22CqNIILooHCzl6OCusFZgS0BrHzdCGSA=="),
            Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(2000572501, 7),
            Xqedii_30g0ulj.Xqedii_12brxt7(Xqedii_30g0ulj.Xqedii_2117ist(Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 21), var1))
         );
         var2.append((char)Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1221153324, 8));
         this.Xqedii_2yuivjm(
            var2,
            Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("hEZUzAUo1KuCgeiez2jIv0WZ13TIXiwV4f+Muoa0giQ89RJUAVcL7iIGksYT6N+6D6zCUfOXQbW9dNHCJ0/UIsU3LI0xQaMg"),
            Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-770446629, 16),
            Xqedii_30g0ulj.Xqedii_12brxt7(Xqedii_30g0ulj.Xqedii_2117ist(Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1566304834, 29), var1))
         );
         var2.append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("3Q7NmNKJsOc+h5a9HNvzt/zl5n2Ap0cGp44pv3h5NHE="));
         return var2.toString();
      }
   }

   public void Xqedii_2yuivjm(StringBuilder var1, String var2, int var3, int var4) {
      if (((-2095943687 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         var1.append(
               Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("C9/EgzLmpZzq+yN3tF82TcKaJICRSWBSTk1dB8oEYFwpKby7ChyXQxJ+Fy9Y1KWbDezC7bEM8DQevpoPFnGW1STYOEMmPpND71V/20rl")
            )
            .append(var2)
            .append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("w1NwyNB0W1fK+Z6MWVap8vlM5ta9qR00XMC760JHCtwozFbWY5PCurcvgYtrspWeLjNut5INMPKTbaLRz6UcUEeumG+qtpZa"))
            .append(var4)
            .append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("a2qEwB19IVisU9nCUgNKtuamzCBvELiP0Q36zaiYxIf90NOgsYTUOOsj/N3MT5ro"));

         for (int var5 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 31); var5 < Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-181846355, 12); var5++) {
            if (var5 > 0) {
               var1.append((char)Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1952338005, 19));
            }

            var1.append((char)Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018103, 0));

            for (int var6 = Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1840490351, 17); var6 < Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1478098749, 12); var6++) {
               var1.appendCodePoint(var3 + var6 + var5 * Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-354462957, 0));
            }

            var1.append((char)Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1478381373, 14));
         }

         var1.append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("3Q7NmNKJsOc+h5a9HNvzt/zl5n2Ap0cGp44pv3h5NHE="));
      }
   }

   public String Xqedii_w4gmhch(List<Xqedii_1yrleh4> var1, int var2) {
      if ((-741137648 * -741137648 + -741137648 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         StringBuilder var3 = new StringBuilder(Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1491726398, 24));
         var3.append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("Ju02OEQLXzpynkWABKLcDE1xPMpwH8tNoGlKtdwGUvRGgvtIrX7VbUXSCao0JwYhoWlI0YmOG6I="));
         var3.append(
            Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
               "F1kIKgl7xvsvQWrYb+PzuZlBCL/3mOfZH8vYxUQpibd3yCWK8Xnn0jYwObdAEuU8UJDDdWQpJXVtF9fRYAlI/0gO+faKM/YScnAD+swju/aUUR87Ie3iU+/ZdGnJMtk8sB0="
            )
         );

         for (Xqedii_1yrleh4 var5 : var1) {
            var3.append(
                  Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
                     "jtSwyfep2ogiAVvXKBmmAbEjoita7mKNmDbStEG4oNWRI0A6rNfmIrDgw1hUGwhPeqHbwzG4R28UeFiiSMs+++F3ycMelrpdXoZS92o5jvk="
                  )
               )
               .append(var5.reference())
               .append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("w1NwyNB0W1fK+Z6MWVap8vlM5ta9qR00XMC760JHCtwozFbWY5PCurcvgYtrspWeLjNut5INMPKTbaLRz6UcUEeumG+qtpZa"))
               .append(var2)
               .append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("a2qEwB19IVisU9nCUgNKtuamzCBvELiP0Q36zaiYxIf90NOgsYTUOOsj/N3MT5ro"));

            for (int var6 = Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 7); var6 < var5.rows().size(); var6++) {
               if (var6 > 0) {
                  var3.append((char)Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-44307897, 29));
               }

               var3.append((char)Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840825, 2));
               Xqedii_1if6eoh(var3, (String)var5.rows().get(var6));
               var3.append((char)Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-728991049, 14));
            }

            var3.append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("3Q7NmNKJsOc+h5a9HNvzt/zl5n2Ap0cGp44pv3h5NHE="));
         }

         var3.append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("3Q7NmNKJsOc+h5a9HNvzt/zl5n2Ap0cGp44pv3h5NHE="));
         return var3.toString();
      }
   }

   public String Xqedii_fxidod2(BossbarAssets.TextFace var1, double var2) {
      if ((-667570725 * -667570725 - -667570725 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         StringBuilder var4 = new StringBuilder(Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(893276245, 21));
         var4.append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("Ju02OEQLXzpynkWABKLcDE1xPMpwH8tNoGlKtdwGUvRGgvtIrX7VbUXSCao0JwYhoWlI0YmOG6I="));
         var4.append(
            Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
               "F1kIKgl7xvsvQWrYb+PzuZlBCL/3mOfZH8vYxUQpibd3yCWK8Xnn0jYwObdAEuU8UJDDdWQpJXVtF9fRYAlI/0gO+faKM/YScnAD+swju/aUUR87Ie3iU+/ZdGnJMtk8sB0="
            )
         );
         var4.append(
               Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("d4tAND62gCsXfLRoumHbIDQX6Kg1VHkxFN2cq1CbLuLTgww0Rihljhcvy6EBjeZQGHuYZWIA/becrtXAhgf0WWeY0xKZjmX2kW4=")
            )
            .append(var1.Xqedii_2z6xp0s)
            .append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("nVX+P6HgjeMweCw1JV6ZRpspYOx+VDAVrcQM50Y2z3Nzgu8ANHQE7+bF2csgnFgxVP4RUkK/gCxP53IGBl1kD7ZsjpHOmpGl2sQ="))
            .append(Xqedii_75v0vtc(var2))
            .append(
               Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
                  "m3IYOkWob8n+TN9Jg2jnbTWhXxpLcjxHuLHbWwQpy2n4RvSwRczqF3XhlShNKqw2h1Fkw1oEv23xmJbsgn0q8irxGQpliqF1b4FTV5lJVyFJI195"
               )
            );
         var4.append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("3Q7NmNKJsOc+h5a9HNvzt/zl5n2Ap0cGp44pv3h5NHE="));
         return var4.toString();
      }
   }

   public String Xqedii_8thy2vg(int var1) {
      if ((-1649908853 ^ -1649908853) != 0) {
         throw new IllegalStateException();
      } else {
         StringBuilder var2 = new StringBuilder(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1648904497, 3));
         var2.append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("Ju02OEQLXzpynkWABKLcDE1xPMpwH8tNoGlKtdwGUvRGgvtIrX7VbUXSCao0JwYhoWlI0YmOG6I="));
         var2.append(
            Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
               "F1kIKgl7xvsvQWrYb+PzuZlBCL/3mOfZH8vYxUQpibd3yCWK8Xnn0jYwObdAEuU8UJDDdWQpJXVtF9fRYAlI/0gO+faKM/YScnAD+swju/aUUR87Ie3iU+/ZdGnJMtk8sB0="
            )
         );

         for (BossbarAssets.VanillaProvider var4 : this.Xqedii_358aqay) {
            var2.append(
                  Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
                     "jtSwyfep2ogiAVvXKBmmAbEjoita7mKNmDbStEG4oNWRI0A6rNfmIrDgw1hUGwhPeqHbwzG4R28UeFiiSMs+++F3ycMelrpdXoZS92o5jvk="
                  )
               )
               .append(var4.file)
               .append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("+OG9bE5yY25oXB+xfPYfqJo/qpy5QA21f99nNmgYr6Tg2gWNArAcK1LH6AU59ZwTmXw="))
               .append(var4.scaledHeight(var1))
               .append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("2F/ac17t19DNs7TlEGgcZMlDua9oo31dScXS0OKDxaIFNBguTczzlAhGVX1yD6K4"))
               .append(var4.scaledAscent(var1))
               .append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("a2qEwB19IVisU9nCUgNKtuamzCBvELiP0Q36zaiYxIf90NOgsYTUOOsj/N3MT5ro"));

            for (int var5 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 25); var5 < var4.Xqedii_3ax7hbv.length; var5++) {
               if (var5 > 0) {
                  var2.append((char)Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(589646001, 10));
               }

               var2.append((char)Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-669642963, 31));

               for (int var6 = Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1687361060, 15); var6 < var4.Xqedii_zumpzhc; var6++) {
                  Xqedii_36fv4uc(var2, var4.Xqedii_3ax7hbv[var5][var6]);
               }

               var2.append((char)Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-2101048172, 28));
            }

            var2.append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("3Q7NmNKJsOc+h5a9HNvzt/zl5n2Ap0cGp44pv3h5NHE="));
         }

         var2.append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("3Q7NmNKJsOc+h5a9HNvzt/zl5n2Ap0cGp44pv3h5NHE="));
         return var2.toString();
      }
   }

   public String Xqedii_amppsg3() {
      if ((-709655639 * (-709655639 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         StringBuilder var1 = new StringBuilder(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(613986596, 18));
         var1.append(
            Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
               "Em9zMIqB/t9Gax0Y7ePhYC8ZoGtUfvmNBJODZIkqUE9Qm2jumq9Rvxw9pGUliAxxabNrix6fL2PXa5bUSa5nGgK9UdU1rY+m0PIiS+KbyEKHoYyk"
            )
         );
         int var2 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 13);

         for (int var3 = Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-91185322, 11); var3 < Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477775165, 16); var3++) {
            long var4 = Xqedii_3b1vf9x.Xqedii_34rt0r9fmi315(8898576006222260643L, 17);

            for (int var6 = Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 15); var6 < var3; var6++) {
               var4 *= Xqedii_3b1vf9x.Xqedii_30j5hfj6jmnrh(1326096199605283453L, 19);
            }

            for (int var11 = Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(305285579, 6); var11 <= Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(742967653, 0); var11++) {
               for (int var7 = Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1051587873, 28); var7 < Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-997420414, 4); var7++) {
                  long var8 = var4
                     * var11
                     * (var7 == 0 ? Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967083605, 16) : Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840190, 9));
                  int var10 = Xqedii_2dq9nbq.Xqedii_2sc5lbd(
                     var3,
                     var11,
                     (var7 == Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967026261, 13)
                        ? Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 20)
                        : Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(640436425, 24)) != 0
                  );
                  if (var2 == 0) {
                     var1.append((char)Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-728761673, 14));
                  }

                  var2 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 11);
                  var1.append((char)Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1179271522, 11));
                  var1.appendCodePoint(var10);
                  var1.append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("bGfl8rviKb8yXPbxxIe+PwrUPGd+KH7du937VWqTL3c="))
                     .append(var8)
                     .append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("NIzgqdfhD/B7k8r4WLR9b9lMIZO+i3jc83jAos2u5JI="));
               }
            }
         }

         var1.append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("j6uo+Ii5sMJBWxhWdN+lBvmLoGDahlkEJdDKeH8Y7f4="));
         return var1.toString();
      }
   }

   public static void Xqedii_1if6eoh(StringBuilder var0, String var1) {
      if ((-619416832 * -619416832 - -619416832 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var2 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 9);

         while (var2 < var1.length()) {
            int var3 = var1.codePointAt(var2);
            var2 += Character.charCount(var3);
            Xqedii_36fv4uc(var0, var3);
         }
      }
   }

   public static void Xqedii_36fv4uc(StringBuilder var0, int var1) {
      if ((938388450 * 938388450 - 938388450 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 >= Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840589, 4)
         && var1 != Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1873352949, 7)
         && var1 != Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-401207496, 28)
         && (var1 < Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1531573053, 10) || var1 > Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1517734620, 29))
         && var1 != Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-761505647, 17)
         && var1 != Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(611624854, 7)) {
         var0.appendCodePoint(var1);
      } else {
         Locale var10001 = Locale.ROOT;
         String var10002 = Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("MW9aUFwa03M/HuLeYPkfIUKUoKZWZ/YTCxTZ5G10VTnLR6Xs/bMxHQ==");
         Object[] var10003 = new Object[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(556707317, 20)];
         var10003[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-980870876, 29)] = var1;
         var0.append(String.format(var10001, var10002, var10003));
      }
   }

   public static String Xqedii_75v0vtc(double var0) {
      if (((1605363570 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Locale var10000 = Locale.ROOT;
         String var10001 = Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("uNt8MHNio5aW+DPnPsC7GSkogK1QD5S4fRvJ+oUCq/klOg6J");
         Object[] var10002 = new Object[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(610571158, 7)];
         var10002[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(610571030, 7)] = var0;
         return String.format(var10000, var10001, var10002);
      }
   }

   public static String Xqedii_32sxbr5(File var0) {
      if ((1666829457 * (1666829457 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            String var1 = new String(Files.readAllBytes(var0.toPath()), StandardCharsets.UTF_8);
            return var1.startsWith(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("s0TD+nCtlrcKVHymob3Y2qQwIhrX6KVKn4IuD9Bo"))
               ? var1.substring(Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-708926427, 1))
               : var1;
         } catch (Exception var2) {
            return null;
         }
      }
   }

   public static String Xqedii_2yea0qa(String var0) {
      if ((811809703 * 811809703 - 811809703 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var1 = var0.lastIndexOf(Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(-180465570, 30));
         return var1 > 0 ? var0.substring(Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 21), var1) : var0;
      }
   }

   public static String Xqedii_1f2zb8d(String var0) {
      if ((1256925232 * 1256925232 - 1256925232 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var1 = var0;
         int var2 = var0.indexOf(Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1096526891, 9));
         if (var2 >= 0) {
            var1 = var0.substring(var2 + Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018077, 3));
         }

         return var1.toLowerCase(Locale.ROOT)
            .replaceAll(
               Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("42CbQBTVqQm1bkRdovLDexl13rMVfyflQKl+hXKSha9pJshmRnVCk3TO1icL6/hxDeM="),
               Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("oKuWbRcUQrFkT37N/QouxHcMbtH4Q91YMG0Vo1A3")
            );
      }
   }

   public static File Xqedii_2ux8jqp(File var0, String var1) {
      if ((1758946542 * 1758946542 + 1758946542 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         String var2 = var1;
         int var3 = var1.indexOf(Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(-717336490, 28));
         if (var3 >= 0) {
            var2 = var1.substring(var3 + Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1755907440, 27));
         }

         return new File(var0, var2);
      }
   }

   public static String Xqedii_vzyhj2m(String var0) {
      if (((-1991278486 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var1 = var0;
         int var2 = var0.indexOf(Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1492258621, 18));
         if (var2 >= 0) {
            var1 = var0.substring(var2 + Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-887999927, 30));
         }

         if (var1.toLowerCase(Locale.ROOT).startsWith(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("Lz7LP79wHRMOEH3pEvotLeos7T6gwS3jmjfTqo9QypxjRFhGhQo="))) {
            var1 = var1.substring(Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-548268310, 8));
         }

         if (var1.toLowerCase(Locale.ROOT).endsWith(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("0QPod8BN5tI1WiYpnZV6Mf4aZ+zV/PR4Vws0NabD+s6IEo/D"))) {
            var1 = var1.substring(Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-182370643, 12), var1.length() - Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477447485, 17));
         }

         return var1.replaceAll(
            Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("ZJAOLZ9qeH2q5alcAbWIZY6r93usznwMDmSnjV10QEg5RkW2IV7ULazdFz49iE9JpsoHlPSzoA6V3Q=="),
            Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("oKuWbRcUQrFkT37N/QouxHcMbtH4Q91YMG0Vo1A3")
         );
      }
   }

   public static int[] Xqedii_1efhcb5(File var0) {
      if (((-100942421 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         try {
            byte[] var1 = new byte[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1958629461, 20)];

            try (InputStream var2 = Files.newInputStream(var0.toPath())) {
               if (var2.read(var1) < Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-729613641, 14)) {
                  return null;
               }
            }

            int var8 = (var1[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1876994310, 19)] & Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1975603285, 16))
                  << Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1459261535, 3)
               | (var1[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1698582612, 28)] & Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(-2059513766, 28))
                  << Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1318959543, 27)
               | (var1[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1878042886, 19)] & Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477037885, 13))
                  << Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1376443970, 4)
               | var1[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(7696297, 23)] & Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(-180465622, 31);
            int var3 = (var1[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(589621425, 10)] & Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(785296885, 20))
                  << Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-177231611, 31)
               | (var1[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1965772885, 16)] & Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(985126075, 30))
                  << Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1236361798, 19)
               | (var1[Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477660477, 14)] & Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018921, 2))
                  << Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840637, 6)
               | var1[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1330319922, 22)] & Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1247318420, 25);
            if (var8 > 0 && var3 > 0) {
               int[] var10000 = new int[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-729515337, 14)];
               var10000[Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1280872850, 25)] = var8;
               var10000[Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1899909205, 26)] = var3;
               return var10000;
            } else {
               return null;
            }
         } catch (Exception var7) {
            return null;
         }
      }
   }

   public static byte[] Xqedii_3npcta5(BufferedImage var0, int var1, int var2) {
      if ((1227031226 * 1227031226 - 1227031226 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            int var3 = Math.max(var1, var2);
            BufferedImage var4 = new BufferedImage(var3, var3, Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(92870949, 29));

            for (int var5 = Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(421840265, 13); var5 < Math.min(var2, var0.getHeight()); var5++) {
               for (int var6 = Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(557755893, 20); var6 < Math.min(var1, var0.getWidth()); var6++) {
                  var4.setRGB(var6, var5, var0.getRGB(var6, var5));
               }
            }

            return Xqedii_37wh9e2(var4);
         } catch (Exception var7) {
            return null;
         }
      }
   }

   public static byte[] Xqedii_z89iad5() {
      if ((389471873 ^ 389471873) != 0) {
         throw new IllegalStateException();
      } else {
         BufferedImage var0 = new BufferedImage(
            Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-887999927, 30),
            Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-91187370, 11),
            Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018077, 2)
         );
         var0.setRGB(
            Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 6),
            Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1213180797, 18),
            Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 12)
         );
         return Xqedii_37wh9e2(var0);
      }
   }

   public static byte[] Xqedii_1j8afp2() {
      if (((1975434998 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         BufferedImage var0 = new BufferedImage(
            Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1238045234, 22),
            Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(783152417, 28),
            Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-182378835, 12)
         );
         var0.setRGB(
            Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018069, 16),
            Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(2101890987, 10),
            Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-920310712, 16)
         );
         return Xqedii_37wh9e2(var0);
      }
   }

   public static String Xqedii_whwuvmn() {
      if ((1320625699 * 1320625699 + 1320625699 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         StringBuilder var0 = new StringBuilder(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1637694324, 20));
         var0.append(
               Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
                  "FKDV8CJi58GlQeSTDXQb5lrMM+VeB+OR8il8HwtqoKznIfBrH0d27+NI/BSziMKpsnQPhaZD0IZlS8/mJAZFl5rLMoWs/eDNUbAPoF3p49uncw79euo8QjErTPnS33mslJbN1yem1NT7Y/3f6zPSqrGpCSNrDle5QmKHvSa20iMsRZeMDl4="
               )
            )
            .append(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1832101743, 17))
            .append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("2F/ac17t19DNs7TlEGgcZMlDua9oo31dScXS0OKDxaIFNBguTczzlAhGVX1yD6K4"))
            .append(
               Xqedii_30g0ulj.Xqedii_12brxt7(
                  Xqedii_30g0ulj.Xqedii_2117ist(Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1417852861, 2), Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(742967590, 0))
               )
            )
            .append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("mZO0INbF9810eFk1X3BuLvnOz2s/YWJb5o8BhBQGuZgo7/Cy3vNVZzGRKx9VWEB35co="));
         var0.appendCodePoint(Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1542054718, 26));
         var0.append(Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("Xmc2Y/oeF1HduYk0SCoRSxolfFAvy1yz1aNKr/i2jxNqZg=="));
         return var0.toString();
      }
   }

   public static byte[] Xqedii_37wh9e2(BufferedImage var0) {
      if ((437557165 * (437557165 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            ByteArrayOutputStream var1 = new ByteArrayOutputStream(Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1051583777, 28));
            ImageIO.write(var0, Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("wHlusaGRBCmGwwecVoabn+ZRE6soOsCFQEOsa0UA9m7u3g=="), var1);
            return var1.toByteArray();
         } catch (Exception var2) {
            return new byte[Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-2063943724, 22)];
         }
      }
   }

   public static int Xqedii_jdi2z8i(String var0, String var1, int var2) {
      if (((1956334785 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Matcher var3 = Pattern.compile(Xqedii_26hdxogp1947f(var1)).matcher(var0);
         if (!var3.find()) {
            return var2;
         } else {
            try {
               return Integer.parseInt(var3.group(Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477840701, 24)));
            } catch (NumberFormatException var5) {
               return var2;
            }
         }
      }
   }

   public static double Xqedii_3157qxz(String var0, String var1, double var2) {
      if (((-1303803460 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Matcher var4 = Pattern.compile(Xqedii_393l6709bcmio(var1)).matcher(var0);
         if (!var4.find()) {
            return var2;
         } else {
            try {
               return Double.parseDouble(var4.group(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1228497478, 19)));
            } catch (NumberFormatException var6) {
               return var2;
            }
         }
      }
   }

   public static String Xqedii_3n30o8q(String var0, String var1) {
      if ((731737764 * 731737764 - 731737764 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Matcher var2 = Pattern.compile(Xqedii_8we8ckyepve5(var1)).matcher(var0);
         return !var2.find() ? null : Xqedii_2q7gtms(var2.group(Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(1542079069, 5)));
      }
   }

   public static List<String> Xqedii_ae2auz0(String var0, String var1) {
      if ((788050937 * (788050937 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var2 = new ArrayList();
         Matcher var3 = Pattern.compile(Xqedii_1j9rmoesr0tyq(var1), Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1851828486, 19)).matcher(var0);
         if (!var3.find()) {
            return var2;
         } else {
            Matcher var4 = Pattern.compile(
                  Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("cuy5IDpiktt6u+UYymMxPx3T7ITYIrmkYPhqrf2sPQ0e00rhvKGGOJoFslMo2fgi3GuXAayOYmd0WI44SrKtsYGt")
               )
               .matcher(var3.group(Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-1869129990, 19)));

            while (var4.find()) {
               var2.add(Xqedii_2q7gtms(var4.group(Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1323096932, 2))));
            }

            return var2;
         }
      }
   }

   public static String Xqedii_2q7gtms(String var0) {
      if ((659412862 * 659412862 - 659412862 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         StringBuilder var1 = new StringBuilder(var0.length());

         for (int var2 = Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(-1477840702, 13); var2 < var0.length(); var2++) {
            char var3 = var0.charAt(var2);
            if (var3 == Xqedii_3b1vf9x.Xqedii_3ju3gegdsztzd(-182124883, 12) && var2 + Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018101, 5) < var0.length()) {
               char var4 = var0.charAt(var2 + Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018065, 2));
               var2++;
               switch (var4) {
                  case 'n':
                     var1.append((char)Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1477839805, 7));
                     break;
                  case 'o':
                  case 'p':
                  case 'q':
                  case 's':
                  default:
                     var1.append(var4);
                     break;
                  case 'r':
                     var1.append((char)Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(1648773529, 3));
                     break;
                  case 't':
                     var1.append((char)Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967018076, 0));
                     break;
                  case 'u':
                     if (var2 + Xqedii_3b1vf9x.Xqedii_3hdtmisfv7jw7(1075187517, 27) < var0.length()) {
                        var1.append(
                           (char)Integer.parseInt(
                              var0.substring(
                                 var2 + Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(-1837972340, 20), var2 + Xqedii_3b1vf9x.Xqedii_1svx06iafuxv1(1967014997, 10)
                              ),
                              Xqedii_3b1vf9x.Xqedii_25192ak0nfeuh(618180899, 18)
                           )
                        );
                        var2 += 4;
                     }
               }
            } else {
               var1.append(var3);
            }
         }

         return var1.toString();
      }
   }

   static {
      if ((-448469092 * -448469092 - -448469092 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1af7ajg = Pattern.compile(
            Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
               "fkXao4pn5yhiAEWWhe0gN991b+WErFh+KN41iVr2KhVs4uzm/busJFiCkqTXWvi67heIDE6Ae6zyKixXLiwvM0Z2B/YBlbnioBNeadaiu9fIWiToDbHvduLWaNJMJUJxOCAhnfHk8hWhWqPZRhK4iUSEHq2Kx8hdEo2nMvVED2KHGDkPWjxXYg=="
            )
         );
         Xqedii_37foha6 = Pattern.compile(
            Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b(
               "i3QXx79x2DdX7okcdDJNCKYxHbdq69GoCNNMW1nHWeiH+SNdFzDYp+8JgjU/joUInP57IWqziKuAJUInR7e3+k4FTrpGM3XpOFUnwi013ESzlx0gbFs08U07bEPopvk87Rn6mRi5PAF0IIwU3dajyDbapwZ7ftPAObWD1Q=="
            )
         );
         Xqedii_2qvddoh = Pattern.compile(
            Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b("PJA+gIpjveJul8K+G75DBs9Y3PWLh39qOVBHkNJjjgdIHYAhJGY4HfwYi8hBjPsgTdD+K+Eu91b0tai3XI6ny7pF")
         );
      }
   }

   public static final class Mask {
      public static final String Xqedii_3cw5ogcc0ok5o = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
      public final int set;
      public final int rotation;
      public final boolean builtin;
      public final double left;
      public final double top;
      public final double right;
      public final double bottom;

      public Mask(int var1, int var2, boolean var3, double var4, double var6, double var8, double var10) {
         this.set = var1;
         this.rotation = var2 & Xqedii_2rkgqmu.Xqedii_1z9ml6wjaans7(1536147820, 26);
         this.builtin = var3;
         this.left = var4;
         this.top = var6;
         this.right = var8;
         this.bottom = var10;
      }
   }

   public static final class Sprite {
      public static final String Xqedii_gvakwbqg0159 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
      public final String source;
      public final int codepoint;
      public final double padScaleX;
      public final double padScaleY;
      public final int advance;
      public final int layoutAdvance;
      public final double quadWidthFont;
      public final double quadHeightFont;
      public final int ascent;
      public final boolean fill;
      public final double opaqueLeft;
      public final double opaqueTop;
      public final double opaqueRight;
      public final double opaqueBottom;
      public final Xqedii_3tswp0o Xqedii_1n24cd5;
      public BossbarAssets.Mask Xqedii_25jvhe9;

      public Sprite(
         String var1, int var2, double var3, double var5, int var7, int var8, double var9, double var11, int var13, boolean var14, Xqedii_3tswp0o var15
      ) {
         this.source = var1;
         this.codepoint = var2;
         this.padScaleX = var3;
         this.padScaleY = var5;
         this.advance = var7;
         this.layoutAdvance = var8;
         this.quadWidthFont = var9;
         this.quadHeightFont = var11;
         this.ascent = var13;
         this.fill = var14;
         this.Xqedii_1n24cd5 = var15;
         this.opaqueLeft = var15 == null ? Double.longBitsToDouble(Xqedii_3npa30o.Xqedii_38rwvpkd262hc(5461869586525925322L, 48)) : var15.Xqedii_qy2hoop;
         this.opaqueTop = var15 == null ? Double.longBitsToDouble(Xqedii_3npa30o.Xqedii_1t4go69ndce0x(-6528829326297204271L, 39)) : var15.Xqedii_36a72dl;
         this.opaqueRight = var15 == null ? Double.longBitsToDouble(Xqedii_3npa30o.Xqedii_5gz7g22uydcw(573103822777342134L, 26)) : var15.Xqedii_bx35dr9;
         this.opaqueBottom = var15 == null ? Double.longBitsToDouble(Xqedii_3npa30o.Xqedii_38rwvpkd262hc(5461873980277469130L, 44)) : var15.Xqedii_183ci73;
      }

      public BossbarAssets.Mask mask() {
         if ((-1770923828 ^ -1770923828) != 0) {
            throw new IllegalStateException();
         } else {
            return this.Xqedii_25jvhe9;
         }
      }
   }

   public static final class TextFace {
      public static final String Xqedii_37do11ov5g8op = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
      public final int index;
      public final BossbarTtf ttf;
      public final double providerSize;
      public final String Xqedii_2bductn;
      public final String Xqedii_2z6xp0s;
      public final List<Double> Xqedii_103s6tt = new ArrayList<>();

      public TextFace(int var1, BossbarTtf var2, double var3, String var5, String var6) {
         this.index = var1;
         this.ttf = var2;
         this.providerSize = var3;
         this.Xqedii_2bductn = var5;
         this.Xqedii_2z6xp0s = var6;
      }

      public double advanceFont(int var1) {
         if ((-1986246649 ^ -1986246649) != 0) {
            throw new IllegalStateException();
         } else {
            return this.ttf.advanceEm(var1) * this.providerSize;
         }
      }

      public int resolveClass(double var1) {
         if (((-700639839 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            return BossbarAssets.Xqedii_306n3z0(this.Xqedii_103s6tt, var1);
         }
      }

      public String fontKey(int var1) {
         if (((-1559810532 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            return Xqedii_30g0ulj.Xqedii_226t9jf(this.index, var1);
         }
      }
   }

   public static final class VanillaGlyph {
      public static final String Xqedii_2gzw9isd3dzev = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
      public final BossbarAssets.VanillaProvider provider;
      public final int width;

      public VanillaGlyph(BossbarAssets.VanillaProvider var1, int var2) {
         this.provider = var1;
         this.width = var2;
      }

      public int layoutAdvance() {
         if ((1250887844 * 1250887844 - 1250887844 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return Xqedii_30g0ulj.Xqedii_2lccqs8(this.width, this.provider.height, this.provider.cellHeight);
         }
      }

      public int scaledAdvance(int var1) {
         if (((2001604119 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            return Xqedii_30g0ulj.Xqedii_2lccqs8(this.width, this.provider.scaledHeight(var1), this.provider.cellHeight);
         }
      }

      public double scaledWidth(int var1) {
         if ((780562654 * (780562654 + 1) & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.provider.cellWidth * ((double)this.provider.scaledHeight(var1) / this.provider.cellHeight);
         }
      }
   }

   public static final class VanillaProvider {
      public static final String Xqedii_15uhev6wiomnd = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
      public final String file;
      public final int height;
      public final int ascent;
      public final int cellWidth;
      public final int cellHeight;
      public final int Xqedii_zumpzhc;
      public final int[][] Xqedii_3ax7hbv;

      public VanillaProvider(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
         this.file = var1;
         this.height = var2;
         this.ascent = var3;
         this.cellWidth = var4;
         this.cellHeight = var5;
         this.Xqedii_zumpzhc = var6;
         this.Xqedii_3ax7hbv = new int[var7][var6];
      }

      public int scaledHeight(int var1) {
         if (((-429056793 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            return Math.max(
               Xqedii_3uek68f.Xqedii_3jrgpw2hdga4x(-915383374, 27),
               (int)Math.round(this.height * (var1 / Double.longBitsToDouble(Xqedii_3uek68f.Xqedii_3ngxdq53j49u7(1884454833426360103L, 17))))
            );
         }
      }

      public int scaledAscent(int var1) {
         if ((1036408995 ^ 1036408995) != 0) {
            throw new IllegalStateException();
         } else {
            return Math.min(
               this.scaledHeight(var1),
               (int)Math.round(this.ascent * (var1 / Double.longBitsToDouble(Xqedii_3uek68f.Xqedii_3ngxdq53j49u7(1884454833337604327L, 27))))
            );
         }
      }
   }


    private static /* synthetic */ String Xqedii_7u4xafbulx3c(String string, String string2) {
        return Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"Ju02OEQLXzpynkWABKLcDE1xPMpwH8tNoGlKtdwGUvRGgvtIrX7VbUXSCao0JwYhoWlI0YmOG6I=") + string + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"/rfI4R9BgA0FMkDlS4gGUBTf60CVogVIobqlpDYD") + string2 + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"3Q7NmNKJsOc+h5a9HNvzt/zl5n2Ap0cGp44pv3h5NHE=");
    }

    private static /* synthetic */ String Xqedii_13vpsst5gm2xh(String string) {
        return Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"3XpmjWPCP1NVTsRIyr4oegeqkmnKWwHz6spmubmfknjlbHnn+3ElxgxJA4ne49gx2Ok5bvQXI0OGBSA9") + string + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"eRjHXxGOrG+F8fK0nTMInrc62zlz1OyEnGczP/nsvQT19EsrP6c=");
    }

    private static /* synthetic */ String Xqedii_32x2bgyghy4g5(String string, double d) {
        return string + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"bH/rq6e5cIqei72YhRS62BuiW7jSKAI7vFZ8HwXc") + d;
    }

    private static /* synthetic */ String Xqedii_2tjr1m0qjbb7z(String string) {
        return Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"eRbHgMJOZhk4CsW9dKEh76WgLVepvdubwsN3VxjhzthEWiZbNf7h8HZcwp+R81TOT2kOEo/WAXesXgtYsq4mKY38nYUkNxkKHloC85GiaqdyruJ3LHSJZ10zyHA=") + string + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"JjklI589mErk9zN3G1oN39ALodsCDBsOsLOjNvhDQ1zKHynDwdy9iKEEJjTXTdGvVR2D7jNMjkbVHvkEJ7zbtd0pVTMCK4gxmF+M/iuAODQ7xHVnifCDjBWsaDlng4emoXZfWu7jpdXxBI58+R6fsr9xuDjXdD0ccdVTfBFI");
    }

    private static /* synthetic */ String Xqedii_1tipx3ge40i9d(int n) {
        return Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"f53hoDpYLrNrRcfB961sUjTv/x3Hvb681UIaL47LU9dl1wce") + n + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"X/4ZcZRXROgfIM87tZezqnaVi3WQ10vHbNzDZr+/EWfJtDQZ");
    }

    private static /* synthetic */ String Xqedii_33xy8svdh7khy(String string) {
        return Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"S/r6GHtXKh2sheT6tOnhgMbMpRFoNcRnkIbR5vyy3ojd696MzaSe+pmD23WJ0xzcgx8Ais32bay4NFlwM3Pks6Pr") + string;
    }

    private static /* synthetic */ String Xqedii_3i5baqs2qs9zd(String string) {
        return Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"x0JpwPGg3B79wR9xmm9tz+lpytY4+5I4OltaI1JHWUI7XYhlkpQNxb0q") + string;
    }

    private static /* synthetic */ String Xqedii_18niansmrif55(String string) {
        return Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"HrtSYGWAuTSjIQ0KC4gu1sr6+KgCG6cJa4LQCCt8Cjmm7xTneQuUfCCnzYfwbOszBq8N5I5CRTgqAQ04gUlzHxgfhTyiKRLNLNYf6NyvHt+UXEeOpQ7KTNN8lTzWfqvBp3RLD1zoYeO7zzDFdhQN06MvLhl1WSFtzQ0GsZ7jDu5cCdNPrbMb53tBFUa0EbfKUYF4sarTWLqrRw==") + string + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"kWEWcymLvdoAexl3ECDCSOy9oh7uOwKxKGO5DUynviLltR7y+k8KW84abIFtovIhZkB9OPNalgue7V1sTRCHklRg");
    }

    private static /* synthetic */ String Xqedii_3pvo9iuspg3xd(String string, int n, int n2) {
        return string + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"bH/rq6e5cIqei72YhRS62BuiW7jSKAI7vFZ8HwXc") + n + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"IizP3TNUOqFsskCX+1gZWDcpXidvesQXrvn8C49g") + n2;
    }

    private static /* synthetic */ String Xqedii_3qyjp1kvj0s3r(String string) {
        return Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"GpTgGLCTnFWMAs6/fDAtcAs2HfCh+ujiuEoSlELk0Qayj92xAfV+koiMeE1XHjlZ") + string;
    }

    private static /* synthetic */ String Xqedii_2hsp8bzu94f2e(String string) {
        return Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"jIsYILm93ErT7umYThHMYk95hZoyEMj+piOcSqQOqPFiBEJRJo5H++nKr3KdI+hn0ogNcL2wGiK02ZtqpgyPFm0bClWBjqY3zLvDpnYKfkx7Z4u4wmHAMQ==") + string + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"0QPod8BN5tI1WiYpnZV6Mf4aZ+zV/PR4Vws0NabD+s6IEo/D");
    }

    private static /* synthetic */ String Xqedii_1ejmhents32h5(String string) {
        return Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"mnEZmOaGRprbi3jiKc0FXpn/5S4lTqU7JgkFFlxzKnwzyWReahGdKZ5GsxYWBUftYP4FQDcmQGQ=") + string + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"0QPod8BN5tI1WiYpnZV6Mf4aZ+zV/PR4Vws0NabD+s6IEo/D");
    }

    private static /* synthetic */ String Xqedii_26hdxogp1947f(String string) {
        return Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"S/vOunPSyzmZwMFlpiYlKYjJdXmzw23jG2/ATX2S") + string + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"y21JHJaHkPX/ORB2V44Q9bsN8kjvR8ZLsnpY4dPSp4/XR5/X+N/xHMgfrcVKuX4t2KqKutuoODhzKAHywxSjhA==");
    }

    private static /* synthetic */ String Xqedii_393l6709bcmio(String string) {
        return Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"S/vOunPSyzmZwMFlpiYlKYjJdXmzw23jG2/ATX2S") + string + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"B25bVHceHBBJ1wnXa0EYJR/J14SoUuuUkvLYGw1iL2CYUMvS+exMt2a1mx5PszfDyLSxmvYplxbBpWcRQgN1WSJd/g+0Mcx5Ee+5GoKYN6oEjbSXKkgKlimZ");
    }

    private static /* synthetic */ String Xqedii_8we8ckyepve5(String string) {
        return Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"S/vOunPSyzmZwMFlpiYlKYjJdXmzw23jG2/ATX2S") + string + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"b93aNgdn0cwy69qSukJDOTtn7TCl2KcgaxFFotmY4amnwPNLZCLU62PlAsa22Y+xDkYo1sq+LEvyk3UbBwe/j5d88BawMladIhctOgoI38gBMQ==");
    }

    private static /* synthetic */ String Xqedii_1j9rmoesr0tyq(String string) {
        return Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"S/vOunPSyzmZwMFlpiYlKYjJdXmzw23jG2/ATX2S") + string + Xqedii_3b1vf9x.Xqedii_3oqm41kt2631b((String)"8AfdFrB9D1sRhsbhKeVbVF/nmaCykWZd6U7hL2TO1MTsZ5X/G9XfW8GrDwE+cbogeIgUs0ktZtpx4yB/tgU=");
    }
}

