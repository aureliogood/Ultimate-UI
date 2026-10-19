package dev.xqedii.ultimateUI.gui.parser;

import dev.xqedii.ultimateUI.Xqedii_19ino1o;
import dev.xqedii.ultimateUI.Xqedii_1f8fvac;
import dev.xqedii.ultimateUI.Xqedii_1nx7dg7;
import dev.xqedii.ultimateUI.Xqedii_1tv8uy8;
import dev.xqedii.ultimateUI.Xqedii_1zr86ti;
import dev.xqedii.ultimateUI.Xqedii_2aqdh8l;
import dev.xqedii.ultimateUI.Xqedii_3nizpcl;
import dev.xqedii.ultimateUI.Xqedii_92ftarx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

public abstract class TemplateComponents extends TemplateScrollWindow {
   public static final String Xqedii_amcpj9iwkol4 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public List<Map<String, Object>> Xqedii_3n7vuje(
      Map<String, Object> var1,
      Map<String, YamlConfiguration> var2,
      Map<String, Object> var3,
      double var4,
      double var6,
      int var8,
      String var9,
      Xqedii_1tv8uy8 var10,
      String var11
   ) {
      if (((642881989 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Map var12 = this.Xqedii_2j81b8f(var1);
         String var13 = this.Xqedii_n1b0nzi(var12);
         Xqedii_1tv8uy8 var14 = var10 != null ? var10 : this.Xqedii_10dbi2p(var9);
         boolean var15 = this.Xqedii_20ypwqo(
            var12.get(
               Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1(
                  "zCammJvirMkzG9FNkRkvz2NqMiG+maLm9ySqeWkgtIWoO/zn8d9He01iBtUQb7IOCZNByrV8SywJjVUxPLATPnz7DxXhg4RfnrEgAY6LLqs/3YTxBV2/Yo9sARqcQxHblUU="
               )
            ),
            (Xqedii_1nx7dg7.Xqedii_19qsgi4hhnw2j(992672549, 29) != 0)
         );
         double var16 = this.Xqedii_32d72vu(var12);
         double var18 = this.Xqedii_1eo8rog(var12);
         double var20 = var4 + var16;
         double var22 = var6 + var18;
         Object var24 = this.Xqedii_132c64o(
            var12,
            Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("D9ftow8TqFIob5nnOcrTOd/XE90qzcabuJQ7nqFDRSJ9zAv0YxLURYRDjONSlnD+"),
            Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("XkvYKzUG4ckS6wRvBgwG1wduYnVGPUaM+c52QGSB")
         );
         Object var25 = this.Xqedii_132c64o(
            var12,
            Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("4sFwauXQRFIfE8+RLYTqVp06xe7d+dngjGC8+fcQJrCG+d6xf++L6/q28+CepUQV"),
            Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("5iJjHIEsULrpkzY+3nE54SjMX9nxohol8lDwlXjC")
         );
         Object var26 = this.Xqedii_1woo5bh(var24) ? this.Xqedii_2ueoawo(var4, var24.toString()) : var20;
         Object var27 = this.Xqedii_1woo5bh(var25) ? this.Xqedii_2ueoawo(var6, var25.toString()) : var22;
         this.Xqedii_37smwmg(var12, var26, var27);
         String var28 = this.Xqedii_2tsjzsv(var12);
         String var29 = !var28.isBlank() ? var28 : (var11 != null ? var11 : Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("46qB8JvxQYJeqPKI9f5o5x0S5Pb79LGsvrNLkg=="));
         if (!var29.isBlank() && var28.isBlank()) {
            var12.put(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("syfY4/AaC+2/YsoWE81sqI1fBSnhsHqwTj8BAgR8VnlOl7fXA7QsX7wj"), var29);
         }

         ArrayList var30 = new ArrayList();
         Map var31 = null;
         if (this.Xqedii_19quu1d(var13)) {
            Map var32 = this.Xqedii_1j7356e(var12);
            this.Xqedii_3owcwgr(var32, var14);
            var32.put(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("8UUVffNc45bz7EPlslykHEpWZmZGuRpGmNHWIDsv38t/eoGPWOVepK9LOeJIzeaT/iKXSlu++4dk2+mdCFVLV7wh"), var9);
            var30.add(var32);
            var31 = var32;
         }

         List var58 = this.Xqedii_e3l6w8y(var12.get(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("24RnaBQ+x55h7umCr96gwoYjfXJyqVhGNilWoIYQIGHMPYTpG0j+OIPYLD0=")));
         if (var58 != null && !var58.isEmpty()) {
            int var33 = this.Xqedii_366lbqj() != null ? Xqedii_1nx7dg7.Xqedii_35u6q3ynfe40m(-194114874, 1) : Xqedii_1nx7dg7.Xqedii_3v40ka0i939za(1019710730, 0);
            Xqedii_1zr86ti var34 = var33 != 0 ? this.Xqedii_2n9yp12(var12) : null;
            Xqedii_92ftarx var35 = var33 != 0 ? this.Xqedii_2gxm9ry(var12) : null;
            String var36 = this.Xqedii_2o54352(var12, var9);
            String var37 = var35 == null ? Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("46qB8JvxQYJeqPKI9f5o5x0S5Pb79LGsvrNLkg==") : this.Xqedii_4ebjsa6(var35);
            int var38 = var35 == null || var37.isEmpty() && var35.Xqedii_2q0seg6
               ? Xqedii_1nx7dg7.Xqedii_19qsgi4hhnw2j(992672549, 21)
               : Xqedii_1nx7dg7.Xqedii_35u6q3ynfe40m(-776459493, 3);
            boolean var39 = this.Xqedii_2qgfxb6(var12);
            double var40 = var39 ? this.Xqedii_2c2l5vv(var12) : Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_3har33el1aazu(1586704911931743692L, 55));
            double var42 = var39 ? this.Xqedii_10dn06d(var12) : Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_3har33el1aazu(-2037453592520639007L, 36));
            int var44 = var35 != null && this.Xqedii_366lbqj().isExportAll()
               ? Xqedii_1nx7dg7.Xqedii_3v40ka0i939za(-1019710731, 28)
               : Xqedii_1nx7dg7.Xqedii_yiq0awjg49vv(1235889421, 17);
            if (var44 != 0 && var31 != null) {
               var31.put(
                  Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("jR2cVJXZZSAlIQ/tuzUD9DV59TWys1YFZZ53EbRdPm5KVz3Y1QEs3n5PSswSKOtMmnCgUYzfVq8z0KPdM84="),
                  this.Xqedii_1ukrhki(var36, var35)
               );
            }

            Xqedii_19ino1o var45 = this.Xqedii_2dpf99p(var12);
            if (var45 != null) {
               ArrayList var59 = new ArrayList();

               for (int var61 = Xqedii_1nx7dg7.Xqedii_yiq0awjg49vv(1787511634, 23); var61 < var58.size(); var61++) {
                  String var65 = this.Xqedii_1racy9r(
                     this.Xqedii_1racy9r(var9, Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("24RnaBQ+x55h7umCr96gwoYjfXJyqVhGNilWoIYQIGHMPYTpG0j+OIPYLD0=")),
                     String.valueOf(var61)
                  );
                  Xqedii_1tv8uy8 var69 = this.Xqedii_l0gm0a2(var58.get(var61), var15, var14, var10);
                  Xqedii_2aqdh8l var71 = this.Xqedii_2akvnqg(var58.get(var61), var2, var3, var8, var65, var69, var29);
                  if (var71 != null && (var38 == 0 || this.Xqedii_2pfhebg(var71, var35, var37))) {
                     if (var44 != 0) {
                        this.Xqedii_33mlqkn(var71.Xqedii_8lku9e2, var36, var61);
                     }

                     var59.add(this.Xqedii_xxecgm0(var71, var61, var58.get(var61)));
                  }
               }

               if (var34 == null) {
                  this.Xqedii_40au2qa(var59, var20, var22, var40, var42, var45, var30);
                  return var30;
               } else {
                  List var62 = this.Xqedii_dcc14mx();
                  double var66 = var34.Xqedii_c1ai8e2 ? Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_h004efceoe66(-6311436659536872507L, 45)) : var40;
                  double var72 = var34.Xqedii_3aklg7x ? Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_h004efceoe66(-6311436659536872507L, 63)) : var42;
                  this.Xqedii_3px8k9n(var59, var20, var22, var66, var72, var45, var30, var62);
                  this.Xqedii_3aoxm1o(var36, var31, var62, var20, var22, var40, var42, var34, var30);
                  return var30;
               }
            } else {
               Xqedii_3nizpcl var46 = this.Xqedii_2toj5w2(var12, var13);
               if (var46.Xqedii_2i612k9) {
                  ArrayList var60 = new ArrayList();

                  for (int var64 = Xqedii_1nx7dg7.Xqedii_35u6q3ynfe40m(1486785985, 22); var64 < var58.size(); var64++) {
                     String var68 = this.Xqedii_1racy9r(
                        this.Xqedii_1racy9r(var9, Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("24RnaBQ+x55h7umCr96gwoYjfXJyqVhGNilWoIYQIGHMPYTpG0j+OIPYLD0=")),
                        String.valueOf(var64)
                     );
                     Xqedii_1tv8uy8 var70 = this.Xqedii_l0gm0a2(var58.get(var64), var15, var14, var10);
                     List var73 = this.Xqedii_301griu(
                        var58.get(var64),
                        var2,
                        var3,
                        Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_2hgo8plxi1qgb(-5246685734031491930L, 60)),
                        Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_3iksbd5is28hw(2428889027330941750L, 32)),
                        var8 + Xqedii_1nx7dg7.Xqedii_yiq0awjg49vv(-1271585120, 3),
                        var68,
                        var70,
                        var29
                     );
                     if (!var73.isEmpty()) {
                        Xqedii_1f8fvac var52 = this.Xqedii_1u294kd(var73);
                        Xqedii_1f8fvac var53 = this.Xqedii_mmox1zo(var73, var68);
                        if (var53 == null) {
                           var53 = var52;
                        }

                        this.Xqedii_nmw5ujl(var73, -var53.Xqedii_3bid2iw, -var53.Xqedii_dt6p3ln);
                        double var54 = Math.max(var53.Xqedii_30poflq(), var52.Xqedii_2os9laa - var53.Xqedii_3bid2iw);
                        double var56 = Math.max(var53.Xqedii_6m1cs8k(), var52.Xqedii_3e0ba68 - var53.Xqedii_dt6p3ln);
                        var60.add(new Xqedii_2aqdh8l(var73, var54, var56));
                     }
                  }

                  this.Xqedii_12yv702(var60, var20, var22, var46, var30);
                  return var30;
               } else if (var34 == null && var38 == 0 && !var15) {
                  this.Xqedii_36bgtf6(
                     var58,
                     var2,
                     var3,
                     var20,
                     var22,
                     var30,
                     var8 + Xqedii_1nx7dg7.Xqedii_yiq0awjg49vv(-1582746363, 6),
                     this.Xqedii_1racy9r(var9, Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("24RnaBQ+x55h7umCr96gwoYjfXJyqVhGNilWoIYQIGHMPYTpG0j+OIPYLD0=")),
                     var10,
                     var29
                  );
                  return var30;
               } else {
                  List var47 = this.Xqedii_dcc14mx();

                  for (int var48 = Xqedii_1nx7dg7.Xqedii_35u6q3ynfe40m(-1981228011, 26); var48 < var58.size(); var48++) {
                     String var49 = this.Xqedii_1racy9r(
                        this.Xqedii_1racy9r(var9, Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("24RnaBQ+x55h7umCr96gwoYjfXJyqVhGNilWoIYQIGHMPYTpG0j+OIPYLD0=")),
                        String.valueOf(var48)
                     );
                     Xqedii_1tv8uy8 var50 = this.Xqedii_l0gm0a2(var58.get(var48), var15, var14, var10);
                     List var51 = this.Xqedii_301griu(
                        var58.get(var48), var2, var3, var20, var22, var8 + Xqedii_1nx7dg7.Xqedii_19qsgi4hhnw2j(992672037, 9), var49, var50, var29
                     );
                     if (!var51.isEmpty()
                        && (
                           var38 == 0
                              || this.Xqedii_2pfhebg(
                                 new Xqedii_2aqdh8l(
                                    var51,
                                    Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_3har33el1aazu(1089251079840577007L, 31)),
                                    Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_h004efceoe66(-6311436659536872507L, 52))
                                 ),
                                 var35,
                                 var37
                              )
                        )) {
                        if (var44 != 0) {
                           this.Xqedii_33mlqkn(var51, var36, var48);
                        }

                        var47.add(var51);
                     }
                  }

                  if (var34 != null) {
                     this.Xqedii_3aoxm1o(var36, var31, var47, var20, var22, var40, var42, var34, var30);
                     return var30;
                  } else {
                     for (List var67 : (Iterable<List>) (var47)) {

                        var30.addAll(var67);
                     }

                     return var30;
                  }
               }
            }
         } else {
            return var30;
         }
      }
   }

   public Xqedii_1tv8uy8 Xqedii_l0gm0a2(Object var1, boolean var2, Xqedii_1tv8uy8 var3, Xqedii_1tv8uy8 var4) {
      if ((1679167422 * 1679167422 - 1679167422 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var2 && this.Xqedii_2twunnc(var1) ? var3 : var4;
      }
   }

   public boolean Xqedii_2twunnc(Object var1) {
      if (((-1049236399 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Map var2 = this.Xqedii_2uqaav9(var1);
         if (var2 == null) {
            return (Xqedii_1nx7dg7.Xqedii_3v40ka0i939za(1019710730, 2) != 0);
         } else {
            Object var3 = var2.get(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("UatXt17rJAwsZSmgZulivZTHD4N3g9oU9+q9YDggAkMYSwjY"));
            if (var3 == null) {
               return (Xqedii_1nx7dg7.Xqedii_yiq0awjg49vv(1297180778, 20) != 0);
            } else {
               String var4 = var3.toString().toLowerCase(Locale.ROOT);
               return ((!var4.contains(
                        Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("8CWBg0mOgqydiAkacW0j/hY2SO0M/uRfyQRZ0xBhrXlBBIE53SIBG2Txnxoq8eSBwNGLV8mL8svnfg==")
                     )
                     && !var4.contains(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("FYMYN0/Ei2+kbYWCFVEnJHwjopiyX1NXnBx1fqFWM1TElZC/xFo="))
                  ? Xqedii_1nx7dg7.Xqedii_19qsgi4hhnw2j(992672549, 2)
                  : Xqedii_1nx7dg7.Xqedii_yiq0awjg49vv(222930989, 9)) != 0);
            }
         }
      }
   }

   public void Xqedii_33mlqkn(List<Map<String, Object>> var1, String var2, int var3) {
      if ((-68376789 * -68376789 - -68376789 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         for (Map var5 : var1) {
            if (var5 != null
               && !var5.containsKey(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("44HTyWt8zPVylBTtggETeQYg/Lxf99uXR24OvXwCZJXLJRAiTRX+mECIGDLUEm0vLiNpUEXAxj/ygEsR"))) {
               var5.put(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("44HTyWt8zPVylBTtggETeQYg/Lxf99uXR24OvXwCZJXLJRAiTRX+mECIGDLUEm0vLiNpUEXAxj/ygEsR"), var2);
               var5.put(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("36t8+F5SRnohPBoiGqW7WBUOw85Dkhvzu7C/QXQzV2E2crs+wSEGAVGAvRDBCedibnYRKxHmolQHNyNpIIrEFQ=="), var3);
            }
         }
      }
   }

   public Map<String, Object> Xqedii_1ukrhki(String var1, Xqedii_92ftarx var2) {
      if ((-1142604011 * -1142604011 - -1142604011 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var3 = new LinkedHashMap();
         var3.put(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("5/RY0bfneLazS9dH4Fg2RnBiaEJiBEtFBD8V4UdbQI4="), var1);
         var3.put(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("ggwgxI5UXwm+JzL0LZ4AXnpUyw2WDiHIi4cQ5TNXSS+QYgDY3NE="), var2.Xqedii_2uk2wtp);
         var3.put(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("6TJziLcLV1M7nqT4DhPVhK3b5A7j6YzO85JmSA83CoWroFQz"), var2.Xqedii_2vzha2s);
         var3.put(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("Rm7uCXR0b3EVR0gqltwlGIvqE7azGkBW3UYZQyhZ+pUvl/uDNkf1zjSvW2s6EcCQ4Ie6P5Y2"), var2.Xqedii_3o70a7q);
         var3.put(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("kkOWjy/IoroHEwoxx6HDKsZOD52KElymrVqpzWZP7ZamqU6Q"), var2.Xqedii_2dss1cy);
         var3.put(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("MmTDrg5AeHk/jssHCvJPxAQIrr0QsaC82Ir1mV5vzeTOwM3NytrHETCQzz7IkWeHgIDVDzdN"), var2.Xqedii_2q0seg6);
         var3.put(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("8XNEsxukj+BcMZluUYWi8ZUlb96H22aFB++dAA7QqSdnUM5V"), new ArrayList<>(var2.Xqedii_38obbu1));
         return var3;
      }
   }

   public Xqedii_2aqdh8l Xqedii_2akvnqg(
      Object var1, Map<String, YamlConfiguration> var2, Map<String, Object> var3, int var4, String var5, Xqedii_1tv8uy8 var6, String var7
   ) {
      if (((2047007059 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         List var8 = this.Xqedii_301griu(
            var1,
            var2,
            var3,
            Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_2hgo8plxi1qgb(-5246685734031491930L, 35)),
            Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_3iksbd5is28hw(-1857197401858815636L, 62)),
            var4 + Xqedii_1nx7dg7.Xqedii_35u6q3ynfe40m(-1916708642, 6),
            var5,
            var6,
            var7
         );
         if (var8.isEmpty()) {
            return null;
         } else {
            Xqedii_1f8fvac var9 = this.Xqedii_gsfp0rq(var8, (Xqedii_1nx7dg7.Xqedii_35u6q3ynfe40m(1884698531, 12) != 0));
            Xqedii_1f8fvac var10 = this.Xqedii_3cz6pxk(var8, var5, (Xqedii_1nx7dg7.Xqedii_yiq0awjg49vv(891723956, 11) != 0));
            if (var10 == null) {
               var10 = var9;
            }

            this.Xqedii_nmw5ujl(var8, -var10.Xqedii_3bid2iw, -var10.Xqedii_dt6p3ln);
            double var11 = Math.max(var10.Xqedii_30poflq(), var9.Xqedii_2os9laa - var10.Xqedii_3bid2iw);
            double var13 = Math.max(var10.Xqedii_6m1cs8k(), var9.Xqedii_3e0ba68 - var10.Xqedii_dt6p3ln);
            return new Xqedii_2aqdh8l(var8, var11, var13);
         }
      }
   }

   public Xqedii_1tv8uy8 Xqedii_10dbi2p(String var1) {
      if ((-945154337 * -945154337 - -945154337 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return new Xqedii_1tv8uy8(
            var1, Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("MTqgxfg/P1SOmhnpL+NkRMETp/S0aMVy79Iwhj+kqwPGKQWtNJc="), var1, null, null, null, null, null
         );
      }
   }

   public Xqedii_1tv8uy8 Xqedii_1ghaeeo(YamlConfiguration var1, Map<String, Object> var2, String var3, String var4) {
      if ((1608427488 * 1608427488 - 1608427488 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Set var5 = this.Xqedii_24t1fk8(var1);
         Map var6 = this.Xqedii_2uqaav9(
            var2 == null ? null : var2.get(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("FvkJ7NCTLpvHOktQbnDsgEbj/F9bTwrkzdG8b6kbwYfCk8RmHUKvMw=="))
         );
         return new Xqedii_1tv8uy8(
            var3,
            Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("Ms9J6JK65+PI4fp8iAlznUZo7aVUhVD+OgHetwnkg/ZYm48DRZSpdDeBRhb7yg=="),
            var3,
            var4,
            this.Xqedii_3oyw5s8(var1, var2, var6, var5, Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("XkvYKzUG4ckS6wRvBgwG1wduYnVGPUaM+c52QGSB")),
            this.Xqedii_3oyw5s8(var1, var2, var6, var5, Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("5iJjHIEsULrpkzY+3nE54SjMX9nxohol8lDwlXjC")),
            this.Xqedii_3oyw5s8(var1, var2, var6, var5, Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("f1J64YtgqVgnh0cZh9LK1KfUzI3RLDklAiuoL/E18K9kOwxBIq8=")),
            this.Xqedii_3oyw5s8(var1, var2, var6, var5, Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("MziL3eLdjs4CwH2x1+eDKBV8rex+YpVzyEvaA9YsY+An4212X2b9+w=="))
         );
      }
   }

   public String Xqedii_3oyw5s8(YamlConfiguration var1, Map<String, Object> var2, Map<String, Object> var3, Set<String> var4, String var5) {
      if (((740942740 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var5 == null || var5.isBlank() || var4 == null || !var4.contains(var5)) {
         return null;
      } else if (var3 != null && var3.containsKey(var5)) {
         return Xqedii_8hwgeu74haqd(var5);
      } else if (var2 != null && var2.containsKey(var5)) {
         return var5;
      } else {
         ConfigurationSection var6 = var1.getConfigurationSection(
            Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("FvkJ7NCTLpvHOktQbnDsgEbj/F9bTwrkzdG8b6kbwYfCk8RmHUKvMw==")
         );
         return var6 != null && var6.contains(var5) ? Xqedii_24tueqelhbv20(var5) : null;
      }
   }

   public Set<String> Xqedii_24t1fk8(YamlConfiguration var1) {
      if ((1743654736 ^ 1743654736) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Collections.emptySet();
      } else {
         Set var2 = this.Xqedii_235jrwm.get(var1);
         if (var2 != null) {
            return var2;
         } else {
            LinkedHashSet var3 = new LinkedHashSet();
            this.Xqedii_2lotlqt(var1.getList(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("PvTgeGEUWfIqW1oxKV3HIuo4KyKp2MzkqMmesIvOQNk9cFhzLeBghw==")), var3);
            this.Xqedii_235jrwm.put(var1, var3);
            return var3;
         }
      }
   }

   public void Xqedii_2lotlqt(Object var1, Set<String> var2) {
      if (((697415182 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         if (var1 instanceof String var8) {
            Matcher var10 = Xqedii_3fa20jc.matcher(var8);

            while (var10.find()) {
               String var12 = this.Xqedii_1g4lkir(var10);
               if (var12 != null && !var12.isBlank()) {
                  var2.add(var12);
               }
            }
         } else if (var1 instanceof ConfigurationSection var7) {
            this.Xqedii_2lotlqt(var7.getValues((Xqedii_1nx7dg7.Xqedii_35u6q3ynfe40m(-1321395326, 23) != 0)), var2);
         } else {
            Map var3 = this.Xqedii_2uqaav9(var1);
            if (var3 != null) {
               for (Object var11 : var3.values()) {
                  this.Xqedii_2lotlqt(var11, var2);
               }
            } else {
               if (var1 instanceof List) {
                  for (Object var6 : (List)var1) {
                     this.Xqedii_2lotlqt(var6, var2);
                  }
               }
            }
         }
      }
   }

   public boolean Xqedii_10h1x1n(Object var1, String var2) {
      if ((-84993627 * (-84993627 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         if (var1 instanceof String var8) {
            Matcher var10 = Xqedii_3fa20jc.matcher(var8);

            while (var10.find()) {
               if (var2.equals(this.Xqedii_1g4lkir(var10))) {
                  return (Xqedii_1nx7dg7.Xqedii_yiq0awjg49vv(-1702702892, 21) != 0);
               }
            }

            return (Xqedii_1nx7dg7.Xqedii_19qsgi4hhnw2j(992672549, 22) != 0);
         } else if (var1 instanceof ConfigurationSection var7) {
            return this.Xqedii_10h1x1n(var7.getValues((Xqedii_1nx7dg7.Xqedii_3v40ka0i939za(1019710730, 5) != 0)), var2);
         } else {
            Map var3 = this.Xqedii_2uqaav9(var1);
            if (var3 != null) {
               for (Object var11 : var3.values()) {
                  if (this.Xqedii_10h1x1n(var11, var2)) {
                     return (Xqedii_1nx7dg7.Xqedii_3v40ka0i939za(-1019710731, 20) != 0);
                  }
               }

               return (Xqedii_1nx7dg7.Xqedii_19qsgi4hhnw2j(992672549, 2) != 0);
            } else {
               if (var1 instanceof List) {
                  for (Object var6 : (List)var1) {
                     if (this.Xqedii_10h1x1n(var6, var2)) {
                        return (Xqedii_1nx7dg7.Xqedii_3v40ka0i939za(-1019710731, 30) != 0);
                     }
                  }
               }

               return (Xqedii_1nx7dg7.Xqedii_35u6q3ynfe40m(-1634877096, 30) != 0);
            }
         }
      } else {
         return (Xqedii_1nx7dg7.Xqedii_35u6q3ynfe40m(-602568216, 10) != 0);
      }
   }

   public void Xqedii_3owcwgr(Map<String, Object> var1, Xqedii_1tv8uy8 var2) {
      if ((187707881 ^ 187707881) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         var1.put(
            Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("BDfsxdyhnDYZaSD4C8kzqGWspRNtwVvFdiySx2AMcFXDUCYIS0zd6lfNyEgKIzDuEV6Uca9+Zsv0tAvVR+F+ag=="),
            var2.Xqedii_25epiou
         );
         var1.put(
            Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("drSOocoI4QxYWhP0JUPo++dAFUl4Ua+aOW7uOfpbR0hfX1NPUqbcStAb94W9OrdrSsTAwAmvpGJ3IrAvOXkCYwdyy7c="),
            var2.Xqedii_2es9n4d
         );
         var1.put(
            Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("x5LOKqFwmEJqh/6sPOacy38xZm3ml4XEMGrPXxFsLyGjnmQbGURCt9uOQJrpWc9L122jvbu2nL4J8qq/21KvoFsanyU="),
            var2.Xqedii_2p9p30n
         );
         if (var2.Xqedii_1o5on6t != null) {
            var1.put(
               Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("6cpUFiLi4nh37UHRDmxGluA0p317gtNvhJByN1wskEc9AhCcLiUUfINbQuBi7KDIx/mrCmFQ1gAGyCcuH/D9ftn+hp4HTLtvCGI="),
               var2.Xqedii_1o5on6t
            );
         }

         if (var2.Xqedii_2t5cmze != null) {
            var1.put(
               Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("x3lWeQonHYTs8X73kuUVmtLCEHV+5oEllrb7BKREEUsT5vs0+YCDn8ccWf1ER9zkwf0ItZR9Iv2iWogRJ8KQ8A=="),
               var2.Xqedii_2t5cmze
            );
         }

         if (var2.Xqedii_3hvw0gz != null) {
            var1.put(
               Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("u08U1N+MeOsAr6g/GFXO6qEzjRjQ1aEUjgKou3e0It30bxpLKKpm/jFmd+MeVDyoF8MGRQpEYaUW9w7SME45Pw=="),
               var2.Xqedii_3hvw0gz
            );
         }

         if (var2.Xqedii_37hl8ey != null) {
            var1.put(
               Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("aP6BRoV9puQJWr8WtwkJuT6BY9ij5aW3i0xu9SZKeY/3OTGsj/wrByM+fkKJCnyWhuQHxEV/0PpvlV8668g2SSggpn1QDu0i"),
               var2.Xqedii_37hl8ey
            );
         }

         if (var2.Xqedii_w154bro != null) {
            var1.put(
               Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("QUmZJhmjV8RAhNKogdvFMCamx0QSC0DxVXen3S03o1UAHmCrt8Ketdt1JUaCalM9N7PwPkAjBqX7G6zxkvcsxHSTVVQvR3ZvWuY="),
               var2.Xqedii_w154bro
            );
         }
      }
   }

   public String Xqedii_1racy9r(String var1, String var2) {
      if ((492750201 * 492750201 + 492750201 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = var1 == null ? Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("46qB8JvxQYJeqPKI9f5o5x0S5Pb79LGsvrNLkg==") : var1.trim();
         String var4 = var2 == null ? Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("46qB8JvxQYJeqPKI9f5o5x0S5Pb79LGsvrNLkg==") : var2.trim();
         if (var3.isEmpty()) {
            return var4;
         } else {
            return var4.isEmpty() ? var3 : Xqedii_13gxs7z7ox8ok(var3, var4);
         }
      }
   }

   public Map<String, Object> Xqedii_6uvwydj(YamlConfiguration var1, Map<String, Object> var2, Map<String, Object> var3) {
      if ((1953684167 * 1953684167 + 1953684167 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var4 = new LinkedHashMap();
         if (var3 != null) {
            var4.putAll(var3);
         }

         ConfigurationSection var5 = var1.getConfigurationSection(
            Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("FvkJ7NCTLpvHOktQbnDsgEbj/F9bTwrkzdG8b6kbwYfCk8RmHUKvMw==")
         );
         if (var5 != null) {
            var4.putAll(this.Xqedii_2rxl8fy(this.Xqedii_2uqaav9(var5), var4));
         }

         Map var6 = this.Xqedii_2uqaav9(var2.get(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("FvkJ7NCTLpvHOktQbnDsgEbj/F9bTwrkzdG8b6kbwYfCk8RmHUKvMw==")));
         if (var6 != null) {
            var4.putAll(this.Xqedii_2rxl8fy(var6, var4));
         }

         for (Entry var8 : var2.entrySet()) {
            if (!this.Xqedii_1f4d5wn((String)var8.getKey())) {
               var4.put((String)var8.getKey(), this.Xqedii_35v0pb4(var8.getValue(), var4));
            }
         }

         return var4;
      }
   }

   public boolean Xqedii_maoe58x(YamlConfiguration var1, Map<String, Object> var2, Map<String, Object> var3, Xqedii_1tv8uy8 var4) {
      if ((1417588173 * 1417588173 + 1417588173 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null
         && var3 != null
         && var1.contains(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("We4yvdfzWVyk8rvyaxSvX0tsas3BqsE7EYQ4T2ELeX5Fndq19hkW4nV/EAae6svNkK1ksuYP1LU="))) {
         Map var5 = this.Xqedii_2uqaav9(
            var2 == null ? null : var2.get(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("FvkJ7NCTLpvHOktQbnDsgEbj/F9bTwrkzdG8b6kbwYfCk8RmHUKvMw=="))
         );
         int var6 = (var2 == null || !var2.containsKey(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("1dI2JIRK/0mDL+DwllV1mKq2pOSgMrelsKea4ZCI+8jgPWLLqmT1FrHL")))
               && (var5 == null || !var5.containsKey(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("1dI2JIRK/0mDL+DwllV1mKq2pOSgMrelsKea4ZCI+8jgPWLLqmT1FrHL")))
            ? Xqedii_1nx7dg7.Xqedii_19qsgi4hhnw2j(992672549, 6)
            : Xqedii_1nx7dg7.Xqedii_3v40ka0i939za(-1019710731, 7);
         if (var6 != 0) {
            return (Xqedii_1nx7dg7.Xqedii_yiq0awjg49vv(1783452008, 12) != 0);
         } else {
            ScrollViewState var7 = this.Xqedii_366lbqj();
            int var8 = var7 != null && var4 != null && var7.isHoveredTarget(var4.Xqedii_25epiou)
               ? Xqedii_1nx7dg7.Xqedii_19qsgi4hhnw2j(992672551, 1)
               : Xqedii_1nx7dg7.Xqedii_yiq0awjg49vv(1365797453, 28);
            var3.put(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("1dI2JIRK/0mDL+DwllV1mKq2pOSgMrelsKea4ZCI+8jgPWLLqmT1FrHL"), Boolean.valueOf((var8 != 0)));
            return (Xqedii_1nx7dg7.Xqedii_35u6q3ynfe40m(-1916708642, 6) != 0);
         }
      } else {
         return (Xqedii_1nx7dg7.Xqedii_3v40ka0i939za(1019710730, 17) != 0);
      }
   }

   public boolean Xqedii_1f4d5wn(String var1) {
      if (((-703104582 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_1nx7dg7.Xqedii_3v40ka0i939za(-1019710731, 0) != 0);
      } else {
         String var2 = var1.trim().toLowerCase(Locale.ROOT);
         return ((!var2.equals(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("Ms9J6JK65+PI4fp8iAlznUZo7aVUhVD+OgHetwnkg/ZYm48DRZSpdDeBRhb7yg=="))
               && !var2.equals(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("oSR6IlNEdhAtfAQzdYThn/Ojpzp02Sc9KiQ+kNB7onTh0cEGNWB84deo"))
               && !var2.equals(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("bA5SLFvoWJgAnxoBvRBQhtd5J40eIJB4EHTlhs+K4HNODWZ3"))
               && !var2.equals(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("qWGh7y+9/Pxi/DMVuMtwRJNAS0mpiHUg3zJjIBuFpeOqjMOJ"))
               && !var2.equals(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("FvkJ7NCTLpvHOktQbnDsgEbj/F9bTwrkzdG8b6kbwYfCk8RmHUKvMw=="))
               && !var2.equals(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("24RnaBQ+x55h7umCr96gwoYjfXJyqVhGNilWoIYQIGHMPYTpG0j+OIPYLD0="))
               && !var2.equals(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("XXs8UKIN6jlKRjhwfuWX4m57pDA1KeJJhjDdt/2SBY2QPvKMRKBr4YCToCHwwHohvfAAGJuFRUQ="))
               && !var2.equals(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("BSwH78OOV97v2+2vNIMZxLJdErbbfKYTPrt3/j+wPpRSdJ/+AGN3cBhCSzI54YjmwTJ3OmA3GJaRdw=="))
               && !var2.equals(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("k+2ysHChICs3FEDPMMlud/Fkq83p/p3pUdy6zw0CK2gDAgLnVnfbhhz2M3zdxzGSOFQq2uh3kFmGLw=="))
            ? Xqedii_1nx7dg7.Xqedii_35u6q3ynfe40m(2050426210, 0)
            : Xqedii_1nx7dg7.Xqedii_3v40ka0i939za(-1019710731, 11)) != 0);
      }
   }

   public void Xqedii_orz68kt(List<Map<String, Object>> var1, Map<String, Object> var2, String var3) {
      if ((1945294478 * 1945294478 + 1945294478 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null) {
         double var4 = this.Xqedii_3iba6vo(
            var2.get(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("BSwH78OOV97v2+2vNIMZxLJdErbbfKYTPrt3/j+wPpRSdJ/+AGN3cBhCSzI54YjmwTJ3OmA3GJaRdw==")),
            Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_3har33el1aazu(2489323975718397451L, 62))
         );
         double var6 = this.Xqedii_3iba6vo(
            var2.get(Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("k+2ysHChICs3FEDPMMlud/Fkq83p/p3pUdy6zw0CK2gDAgLnVnfbhhz2M3zdxzGSOFQq2uh3kFmGLw==")),
            Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_2hgo8plxi1qgb(-5255695132309488474L, 54))
         );
         if (Double.isFinite(var4) || Double.isFinite(var6)) {
            Xqedii_1f8fvac var8 = this.Xqedii_mmox1zo(var1, var3);
            if (var8 == null) {
               var8 = this.Xqedii_1u294kd(var1);
            }

            if (var8 != null) {
               double var9 = Double.isFinite(var4)
                  ? var4 - var8.Xqedii_3bid2iw
                  : Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_3har33el1aazu(-610362105807073830L, 22));
               double var11 = Double.isFinite(var6)
                  ? var6 - var8.Xqedii_dt6p3ln
                  : Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_3iksbd5is28hw(-2752697928143283566L, 55));
               if (!(Math.abs(var9) < Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_3har33el1aazu(6350404208892127796L, 21)))
                  || !(Math.abs(var11) < Double.longBitsToDouble(Xqedii_1nx7dg7.Xqedii_3har33el1aazu(-5362497316650445443L, 52)))) {
                  this.Xqedii_nmw5ujl(var1, var9, var11);
               }
            }
         }
      }
   }

   private static /* synthetic */ String Xqedii_8hwgeu74haqd(String string) {
        return Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("XCUKZmyY6jEjI5AdWciVpzSPS94nHYOe/zF5oJyD8c2yM8l7MATIi79d") + string;
    }

    private static /* synthetic */ String Xqedii_24tueqelhbv20(String string) {
        return Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("XCUKZmyY6jEjI5AdWciVpzSPS94nHYOe/zF5oJyD8c2yM8l7MATIi79d") + string;
    }

    private static /* synthetic */ String Xqedii_13gxs7z7ox8ok(String string, String string2) {
        return string + Xqedii_1nx7dg7.Xqedii_1npm5hl6yhcl1("e5fWDH3Ttd//F7N/1SWvua8RvoRGdwD5UkLnmlIb") + string2;
    }
}
