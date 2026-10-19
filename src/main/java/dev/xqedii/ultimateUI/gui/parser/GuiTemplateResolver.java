package dev.xqedii.ultimateUI.gui.parser;

import dev.xqedii.ultimateUI.Xqedii_1tv8uy8;
import dev.xqedii.ultimateUI.Xqedii_1wll257;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import org.bukkit.configuration.file.YamlConfiguration;

public class GuiTemplateResolver extends TemplateLoops {
   public static final String Xqedii_2s4sznz3lsrcf = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public List<Map<String, Object>> resolveBlocks(List<?> var1, Map<String, YamlConfiguration> var2) {
      if (((-2126611288 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var3 = new ArrayList();
         this.Xqedii_36bgtf6(
            var1,
            var2 == null ? Collections.emptyMap() : var2,
            new LinkedHashMap<>(),
            Double.longBitsToDouble(Xqedii_1wll257.Xqedii_235f5obrywt1f(-8378017783016217904L, 32)),
            Double.longBitsToDouble(Xqedii_1wll257.Xqedii_18lzytki4culb(5146780684112117187L, 0)),
            var3,
            Xqedii_1wll257.Xqedii_1vitaa2a4aly2(-419193861, 30),
            Xqedii_1wll257.Xqedii_iong8pxmca0x("6Jt0+xHdUN0JDBxVKglrs0jF83fYCtCNtpAm6A=="),
            null,
            Xqedii_1wll257.Xqedii_iong8pxmca0x("6Jt0+xHdUN0JDBxVKglrs0jF83fYCtCNtpAm6A==")
         );
         return var3;
      }
   }

   public List<Map<String, Object>> resolveBlocks(List<?> var1, Map<String, YamlConfiguration> var2, ScrollViewState var3) {
      if ((-19085016 * -19085016 - -19085016 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var3 == null) {
         return this.resolveBlocks(var1, var2);
      } else {
         ScrollViewState var4 = Xqedii_2i0gm4h.get();
         var3.clearMetrics();
         Xqedii_2i0gm4h.set(var3);

         List var5;
         try {
            var5 = this.resolveBlocks(var1, var2);
         } finally {
            if (var4 == null) {
               Xqedii_2i0gm4h.remove();
            } else {
               Xqedii_2i0gm4h.set(var4);
            }
         }

         return var5;
      }
   }

   @Override
   public void Xqedii_36bgtf6(
      List<?> var1,
      Map<String, YamlConfiguration> var2,
      Map<String, Object> var3,
      double var4,
      double var6,
      List<Map<String, Object>> var8,
      int var9,
      String var10,
      Xqedii_1tv8uy8 var11,
      String var12
   ) {
      if (((-157523312 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var9 <= Xqedii_1wll257.Xqedii_27wk02sre0216(521849058, 9)) {
         for (int var13 = Xqedii_1wll257.Xqedii_1j6f11hjkf8jt(-1671511695, 22); var13 < var1.size(); var13++) {
            String var14 = this.Xqedii_1racy9r(var10, String.valueOf(var13));
            var8.addAll(this.Xqedii_301griu(var1.get(var13), var2, var3, var4, var6, var9, var14, var11, var12));
         }
      }
   }

   @Override
   public List<Map<String, Object>> Xqedii_301griu(
      Object var1,
      Map<String, YamlConfiguration> var2,
      Map<String, Object> var3,
      double var4,
      double var6,
      int var8,
      String var9,
      Xqedii_1tv8uy8 var10,
      String var11
   ) {
      if (((1741885869 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var8 <= Xqedii_1wll257.Xqedii_27wk02sre0216(-1399971343, 21)) {
         Map var12 = this.Xqedii_2uqaav9(var1);
         if (var12 == null) {
            return Collections.emptyList();
         } else {
            List var13 = this.Xqedii_38nl1ea(var12, var2, var3, var4, var6, var8, var9, var10, var11);
            if (var13 != null) {
               return var13;
            } else {
               List var14 = this.Xqedii_11pztk2(var12, var2, var3, var4, var6, var8, var9, var10, var11);
               if (var14 != null) {
                  return var14;
               } else {
                  Map var15 = this.Xqedii_8lgsu0t(var12, var3);
                  if (!this.Xqedii_sndwmaa(var15)) {
                     return Collections.emptyList();
                  } else {
                     String var16 = this.Xqedii_2c9pq3h(var15);
                     if (var16 != null && !var16.isBlank()) {
                        YamlConfiguration var17 = (YamlConfiguration)var2.get(var16);
                        if (var17 == null) {
                           return Collections.emptyList();
                        } else {
                           Map var18 = this.Xqedii_6uvwydj(var17, var15, var3);
                           ArrayList var19 = new ArrayList();
                           Xqedii_1tv8uy8 var20 = var10 != null ? var10 : this.Xqedii_1ghaeeo(var17, var15, var9, var16);
                           boolean var21 = this.Xqedii_maoe58x(var17, var15, var18, var20);
                           String var22 = this.Xqedii_2phlsv6(this.Xqedii_2tsjzsv(var15), var11);
                           this.Xqedii_36bgtf6(
                              var17.getList(Xqedii_1wll257.Xqedii_iong8pxmca0x("Pi+B6o3DBYB8pVte39X5AyelUap3mnAui0fH3ajVvme6WXMN7hp/SA==")),
                              var2,
                              var18,
                              var4,
                              var6,
                              var19,
                              var8 + Xqedii_1wll257.Xqedii_27wk02sre0216(569486126, 5),
                              this.Xqedii_1racy9r(var9, Xqedii_1wll257.Xqedii_iong8pxmca0x("z/hLYxzwVp8Bl/ZbjAQETMfxf5sFDyYLz26ZNuj1drhTW69+xrG+lKBgSCn9Kw==")),
                              var20,
                              var22
                           );
                           this.Xqedii_orz68kt(var19, var15, var9);
                           if (var21) {
                              for (Map var24 : (Iterable<Map>) (var19)) {

                                 var24.put(
                                    Xqedii_1wll257.Xqedii_iong8pxmca0x(
                                       "Qd3U9/FRvBFl7IX+KU61MdQLx20ClkZ7wqSxCfdl3NAGii3vhsf7Yfd3Q6qmt5KwdpcZzk+fjf35UvdOjJlJYpiK1cU="
                                    ),
                                    Boolean.valueOf((Xqedii_1wll257.Xqedii_1vitaa2a4aly2(419193860, 22) != 0))
                                 );
                              }
                           }

                           return var19;
                        }
                     } else {
                        return this.Xqedii_3n7vuje(var15, var2, var3, var4, var6, var8, var9, var10, var11);
                     }
                  }
               }
            }
         }
      } else {
         return Collections.emptyList();
      }
   }

   public Map<String, Object> Xqedii_8lgsu0t(Map<String, Object> var1, Map<String, Object> var2) {
      if (((397957806 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var3 = new LinkedHashMap();
         if (var1 == null) {
            return var3;
         } else {
            for (Entry var5 : var1.entrySet()) {
               String var6 = (String)var5.getKey();
               Object var7 = var5.getValue();
               if (this.Xqedii_n8zsr9a(var6)) {
                  var3.put(var6, this.Xqedii_7v0t8w0(var7));
               } else {
                  var3.put(var6, this.Xqedii_35v0pb4(var7, var2));
               }
            }

            return var3;
         }
      }
   }

   public boolean Xqedii_n8zsr9a(String var1) {
      if ((-401731453 * -401731453 - -401731453 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim().toLowerCase(Locale.ROOT);
         return ((!var2.equals(Xqedii_1wll257.Xqedii_iong8pxmca0x("fr9FA0GC8aKDVpzCNTgYqaoZmgd1xY/4o8im4pt1OFvqpPTiYoSW8WyYq7I="))
               && !var2.equals(Xqedii_1wll257.Xqedii_iong8pxmca0x("Qe88CX6dndSurMGuHyzyawBquXF+3RvhTuenaPv31sjqcZouMrQ="))
               && !var2.equals(Xqedii_1wll257.Xqedii_iong8pxmca0x("Pi+B6o3DBYB8pVte39X5AyelUap3mnAui0fH3ajVvme6WXMN7hp/SA=="))
            ? Xqedii_1wll257.Xqedii_1j6f11hjkf8jt(-668060789, 3)
            : Xqedii_1wll257.Xqedii_34w5zwg3u0kib(-109001362, 16)) != 0);
      } else {
         return (Xqedii_1wll257.Xqedii_34w5zwg3u0kib(-108935826, 28) != 0);
      }
   }
}
