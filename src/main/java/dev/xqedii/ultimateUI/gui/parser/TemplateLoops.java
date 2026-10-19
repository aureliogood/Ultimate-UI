package dev.xqedii.ultimateUI.gui.parser;

import dev.xqedii.ultimateUI.Xqedii_1tv8uy8;
import dev.xqedii.ultimateUI.Xqedii_1w9jp40;
import dev.xqedii.ultimateUI.Xqedii_2ankine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.configuration.file.YamlConfiguration;

public abstract class TemplateLoops extends TemplateCases {
   public static final String Xqedii_3g0naqkgs8byl = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public List<Map<String, Object>> Xqedii_38nl1ea(
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
      if ((-852238201 ^ -852238201) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.containsKey(Xqedii_2ankine.Xqedii_1mtdapu2aw162("1tCPX0qkCeW7jhQ3wYPKTMWE2hPbsJHLQ3ZSUrPQn2Ist+Bx"))) {
         Object var12 = var1.get(Xqedii_2ankine.Xqedii_1mtdapu2aw162("MkRvEQAdoNszgMeJC4xYtmVmTVJ02/gEWHNwQ3iyGWgaSJrd6OKrYIvc"));
         if (var12 != null && !this.Xqedii_20ypwqo(this.Xqedii_35v0pb4(var12, var3), (Xqedii_2ankine.Xqedii_2fcmao9j2zkxs(1215162877, 12) != 0))) {
            return Collections.emptyList();
         } else {
            Xqedii_1w9jp40 var13 = this.Xqedii_3s5dyrm(var1.get(Xqedii_2ankine.Xqedii_1mtdapu2aw162("1tCPX0qkCeW7jhQ3wYPKTMWE2hPbsJHLQ3ZSUrPQn2Ist+Bx")), var3);
            if (var13.Xqedii_28g4212()) {
               return Collections.emptyList();
            } else {
               List var14 = this.Xqedii_27jger8(var1);
               if (var14.isEmpty()) {
                  return Collections.emptyList();
               } else {
                  ArrayList var15 = new ArrayList();

                  for (int var16 = Xqedii_2ankine.Xqedii_1ndt2t2yqpd9g(400128958, 20); var16 < var13.Xqedii_12y9lp5(); var16++) {
                     LinkedHashMap var17 = new LinkedHashMap();
                     if (var3 != null) {
                        var17.putAll(var3);
                     }

                     this.Xqedii_3oeaezs(var17, var13.Xqedii_h0g3k9q(var16));
                     String var18 = this.Xqedii_1racy9r(
                        var9,
                        this.Xqedii_1racy9r(Xqedii_2ankine.Xqedii_1mtdapu2aw162("1tCPX0qkCeW7jhQ3wYPKTMWE2hPbsJHLQ3ZSUrPQn2Ist+Bx"), String.valueOf(var16))
                     );

                     for (int var19 = Xqedii_2ankine.Xqedii_qxnhy8ajuajr(-1010460541, 10); var19 < var14.size(); var19++) {
                        Object var20 = var14.get(var19);
                        String var21 = var14.size() == Xqedii_2ankine.Xqedii_2fcmao9j2zkxs(1215162877, 28)
                           ? var18
                           : this.Xqedii_1racy9r(var18, String.valueOf(var19));
                        var15.addAll(
                           this.Xqedii_301griu(var20, var2, var17, var4, var6, var8 + Xqedii_2ankine.Xqedii_qxnhy8ajuajr(-473589629, 29), var21, var10, var11)
                        );
                     }
                  }

                  return var15;
               }
            }
         }
      } else {
         return null;
      }
   }

   public Xqedii_1w9jp40 Xqedii_3s5dyrm(Object var1, Map<String, Object> var2) {
      if (((-1298253943 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1w9jp40.Xqedii_230714b();
      } else {
         Object var3 = this.Xqedii_35v0pb4(var1, var2);
         if (var3 instanceof Iterable var5) {
            return Xqedii_1w9jp40.Xqedii_1pluau6(var5);
         } else {
            int var4 = this.Xqedii_26bcukl(var3);
            return var4 <= 0 ? Xqedii_1w9jp40.Xqedii_230714b() : Xqedii_1w9jp40.Xqedii_30u3vow(var4);
         }
      }
   }

   public int Xqedii_26bcukl(Object var1) {
      if ((1263371418 * (1263371418 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var2;
         if (var1 instanceof Number var4) {
            var2 = var4.doubleValue();
         } else if (var1 instanceof Boolean var5) {
            var2 = var5
               ? Double.longBitsToDouble(Xqedii_2ankine.Xqedii_3ivukcdlxr2p(3311934799209298002L, 55))
               : Double.longBitsToDouble(Xqedii_2ankine.Xqedii_3ivukcdlxr2p(3308354789349259346L, 42));
         } else {
            var2 = this.Xqedii_3iba6vo(var1, Double.longBitsToDouble(Xqedii_2ankine.Xqedii_otbe8owaj7eq(-6830568827546486267L, 5)));
         }

         if (!Double.isFinite(var2)) {
            return Xqedii_2ankine.Xqedii_qxnhy8ajuajr(-1010460541, 4);
         } else {
            int var6 = (int)Math.floor(var2);
            return var6 <= 0 ? Xqedii_2ankine.Xqedii_2fcmao9j2zkxs(-1215162878, 1) : Math.min(var6, Xqedii_2ankine.Xqedii_1yrdj00nnc98t(687569271, 25));
         }
      }
   }

   public List<?> Xqedii_27jger8(Map<String, Object> var1) {
      if ((-1822764559 ^ -1822764559) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         if (var1.get(Xqedii_2ankine.Xqedii_1mtdapu2aw162("hu7G6quiktVyqWDx0BxtA2qQKXh0PRathUx2i915Q5nUGxVmIlKvSw==")) instanceof List var5) {
            return var5;
         } else {
            Object var3 = var1.get(Xqedii_2ankine.Xqedii_1mtdapu2aw162("4bKEDjBuCP/KqZGtX2tvfLchAIA3HFscM9JEAYcGn1JxP/cnzZQ="));
            if (var3 != null) {
               return Collections.singletonList(var3);
            } else {
               Map var4 = this.Xqedii_2j81b8f(var1);
               var4.remove(Xqedii_2ankine.Xqedii_1mtdapu2aw162("1tCPX0qkCeW7jhQ3wYPKTMWE2hPbsJHLQ3ZSUrPQn2Ist+Bx"));
               return var4.isEmpty() ? Collections.emptyList() : Collections.singletonList(var4);
            }
         }
      } else {
         return Collections.emptyList();
      }
   }

   public void Xqedii_3oeaezs(Map<String, Object> var1, Object var2) {
      if ((1343879231 * 1343879231 - 1343879231 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         var1.put(Xqedii_2ankine.Xqedii_1mtdapu2aw162("RdOgOqnKgLbW6IzPaxzR1ZzhvVxsvroBL1nqazmzZnNxzJbeYcBQXCoV"), var2);
         var1.put(Xqedii_2ankine.Xqedii_1mtdapu2aw162("uHv5z5o494eh9gmmRg4B32aku0ZAADvoGvUWaz1BFsPaCzN9DIY="), var2);
         var1.put(Xqedii_2ankine.Xqedii_1mtdapu2aw162("IonTA3wyFTfsx8O3l2BwUHTWip1E//b33ZLgGSzfZhcuTGSI7e+rbydBVfmXdrCR"), var2);
         var1.put(Xqedii_2ankine.Xqedii_1mtdapu2aw162("Q5GTnlWhr67nyDq6DBzScnR9GVoxZaFVjIHtVMWUtA4eyC9O9/oSyzsmcU75uTey"), var2);
      }
   }
}
