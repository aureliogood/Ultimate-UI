package dev.xqedii.ultimateUI.gui.parser;

import dev.xqedii.ultimateUI.Xqedii_1tv8uy8;
import dev.xqedii.ultimateUI.Xqedii_5ts6g93;
import dev.xqedii.ultimateUI.Xqedii_h8ljzyd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import org.bukkit.configuration.file.YamlConfiguration;

public abstract class TemplateCases extends TemplateComponents {
   public static final String Xqedii_2o56v5e8k105g = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public List<Map<String, Object>> Xqedii_11pztk2(
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
      if ((-611345498 * -611345498 + -611345498 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_h8ljzyd var12 = this.Xqedii_1d4lchs(var1);
         if (var12 == null) {
            return null;
         } else {
            Object var13 = var1.get(Xqedii_5ts6g93.Xqedii_1lm433jucxd77("ErZR+aIzwQlI6b6WoEmNb6qIQxgXJOd2uMhT0VlMiFYgw5l+BwaYw7sN"));
            if (var13 != null && !this.Xqedii_20ypwqo(this.Xqedii_35v0pb4(var13, var3), (Xqedii_5ts6g93.Xqedii_3kfxlsk5ta9se(1838178802, 6) != 0))) {
               return Collections.emptyList();
            } else {
               Object var14 = this.Xqedii_35v0pb4(var12.Xqedii_mmdh1eb, var3);
               Entry var15 = this.Xqedii_6ikbart(var12.Xqedii_3kybzn8, var14);
               if (var15 == null) {
                  return Collections.emptyList();
               } else {
                  List var16 = this.Xqedii_2h1uyi5(var15.getValue());
                  if (var16.isEmpty()) {
                     return Collections.emptyList();
                  } else {
                     ArrayList var17 = new ArrayList();
                     String var18 = this.Xqedii_1racy9r(
                        var9,
                        this.Xqedii_1racy9r(
                           Xqedii_5ts6g93.Xqedii_1lm433jucxd77("ro12H7LDWrOqlnDAVr+61CNJTa+eGPhu0vwg25QKsfDmVMVs"), this.Xqedii_366baea((String)var15.getKey())
                        )
                     );
                     this.Xqedii_36bgtf6(var16, var2, var3, var4, var6, var17, var8 + Xqedii_5ts6g93.Xqedii_18vdmgwsuc3hv(-428730907, 6), var18, var10, var11);
                     return var17;
                  }
               }
            }
         }
      }
   }

   public Xqedii_h8ljzyd Xqedii_1d4lchs(Map<String, Object> var1) {
      if ((239596406 * 239596406 - 239596406 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         Object var2 = var1.get(Xqedii_5ts6g93.Xqedii_1lm433jucxd77("ro12H7LDWrOqlnDAVr+61CNJTa+eGPhu0vwg25QKsfDmVMVs"));
         if (var2 != null) {
            LinkedHashMap var9 = new LinkedHashMap();

            for (Entry var11 : var1.entrySet()) {
               String var12 = (String)var11.getKey();
               if (var12 != null
                  && !var12.equalsIgnoreCase(Xqedii_5ts6g93.Xqedii_1lm433jucxd77("ro12H7LDWrOqlnDAVr+61CNJTa+eGPhu0vwg25QKsfDmVMVs"))
                  && !var12.equalsIgnoreCase(Xqedii_5ts6g93.Xqedii_1lm433jucxd77("ErZR+aIzwQlI6b6WoEmNb6qIQxgXJOd2uMhT0VlMiFYgw5l+BwaYw7sN"))) {
                  var9.put(var12, var11.getValue());
               }
            }

            return new Xqedii_h8ljzyd(var2, var9);
         } else {
            for (Entry var4 : var1.entrySet()) {
               String var5 = (String)var4.getKey();
               if (var5 != null) {
                  Matcher var6 = Xqedii_3bp13i7.matcher(var5.trim());
                  if (var6.matches()) {
                     Object var7 = var4.getValue();
                     Object var8 = this.Xqedii_2uqaav9(var7);
                     if (var8 == null) {
                        var8 = new LinkedHashMap();
                     }

                     return new Xqedii_h8ljzyd(var6.group(Xqedii_5ts6g93.Xqedii_23lkbw7p8cem0(734144099, 15)).trim(), (Map<String, Object>)var8);
                  }
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   public Entry<String, Object> Xqedii_6ikbart(Map<String, Object> var1, Object var2) {
      if ((1743390508 ^ 1743390508) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         for (String var4 : this.Xqedii_1y4oc2f(var2)) {
            Entry var5 = this.Xqedii_1dylk02(var1, var4);
            if (var5 != null) {
               return var5;
            }
         }

         return this.Xqedii_3n3k8y4(var1);
      } else {
         return null;
      }
   }

   public List<String> Xqedii_1y4oc2f(Object var1) {
      if (((359412644 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var2 = new ArrayList();
         if (var1 == null) {
            this.Xqedii_1r8mkph(var2, Xqedii_5ts6g93.Xqedii_1lm433jucxd77("gOuM9MRRLm7j/cftwHONy5V+P00DN2xAWiccKCFHAPQ9Ms4z"));
            this.Xqedii_1r8mkph(var2, Xqedii_5ts6g93.Xqedii_1lm433jucxd77("OxRKN1U1l77ZAzACTNph6mdUYoQNEZBcFPF0tJOWV7CtO1+h"));
            this.Xqedii_1r8mkph(var2, Xqedii_5ts6g93.Xqedii_1lm433jucxd77("Dj5uRK7ofwAoOI9/hsyNilS9AuZdbu6a+cCHMg=="));
            return var2;
         } else if (var1 instanceof Boolean var8) {
            this.Xqedii_1r8mkph(var2, var8.toString());
            return var2;
         } else if (var1 instanceof Number var3) {
            double var4 = var3.doubleValue();
            if (Double.isFinite(var4)) {
               this.Xqedii_1r8mkph(var2, this.Xqedii_2ykik6x(var4));
               long var6 = Math.round(var4);
               if (Math.abs(var4 - var6) < Double.longBitsToDouble(Xqedii_5ts6g93.Xqedii_2hxat01v2p5y5(6482068546219334840L, 43))) {
                  this.Xqedii_1r8mkph(var2, Long.toString(var6));
               }
            }

            this.Xqedii_1r8mkph(var2, var3.toString());
            return var2;
         } else {
            this.Xqedii_1r8mkph(var2, var1.toString());
            return var2;
         }
      }
   }

   public void Xqedii_1r8mkph(List<String> var1, String var2) {
      if ((1628470481 ^ 1628470481) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String var3 = var2.trim();
         if (!var1.contains(var3)) {
            var1.add(var3);
         }

         String var4 = var3.toLowerCase(Locale.ROOT);
         if (!var4.equals(var3) && !var1.contains(var4)) {
            var1.add(var4);
         }
      }
   }

   public String Xqedii_2ykik6x(double var1) {
      if (((1223155825 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         long var3 = Math.round(var1);
         return Math.abs(var1 - var3) < Double.longBitsToDouble(Xqedii_5ts6g93.Xqedii_2ysot0i08fgqd(3611580655150340140L, 4))
            ? Long.toString(var3)
            : Double.toString(var1);
      }
   }

   public Entry<String, Object> Xqedii_1dylk02(Map<String, Object> var1, String var2) {
      if ((-22011741 * -22011741 - -22011741 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null) {
         String var3 = var2.trim();

         for (Entry var5 : var1.entrySet()) {
            String var6 = (String)var5.getKey();
            if (var6 != null && var6.trim().equalsIgnoreCase(var3)) {
               return var5;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public Entry<String, Object> Xqedii_3n3k8y4(Map<String, Object> var1) {
      if (((-1569700611 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10000 = new String[Xqedii_5ts6g93.Xqedii_18vdmgwsuc3hv(560619111, 18)];
         var10000[Xqedii_5ts6g93.Xqedii_kowup088vgfv(1104598166, 1)] = Xqedii_5ts6g93.Xqedii_1lm433jucxd77(
            "VMQ591IzikIGJUPLZ74D3Qnr6rENHwnYmCnDWl4wYoZaN7L3C5579uBa"
         );
         var10000[Xqedii_5ts6g93.Xqedii_3kfxlsk5ta9se(1838178802, 2)] = Xqedii_5ts6g93.Xqedii_1lm433jucxd77("ft0uvUAlhpJwSahwhNu4mMxTTaM0RGoJGkbPBIB4AKj6DCiG");
         var10000[Xqedii_5ts6g93.Xqedii_18vdmgwsuc3hv(-834485060, 11)] = Xqedii_5ts6g93.Xqedii_1lm433jucxd77("sbPwVGU70pAHyO+8APaJav/fP8DzJjjqi2BSxfhw");
         var10000[Xqedii_5ts6g93.Xqedii_3kfxlsk5ta9se(1838178674, 6)] = Xqedii_5ts6g93.Xqedii_1lm433jucxd77("Cyzgs8P6b7X6Hh/GBQAl5LCO5QjL17KCYq2NOfDr");
         String[] var2 = var10000;
         String[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = Xqedii_5ts6g93.Xqedii_23lkbw7p8cem0(734176867, 0); var5 < var4; var5++) {
            String var6 = var3[var5];
            Entry var7 = this.Xqedii_1dylk02(var1, var6);
            if (var7 != null) {
               return var7;
            }
         }

         return null;
      }
   }

   public List<?> Xqedii_2h1uyi5(Object var1) {
      if ((-407036829 * -407036829 + -407036829 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof List var3) {
         return var3;
      } else {
         Map var2 = this.Xqedii_2uqaav9(var1);
         return var2 != null && !var2.isEmpty() ? Collections.singletonList(var2) : Collections.emptyList();
      }
   }

   public String Xqedii_366baea(String var1) {
      if ((231877966 * 231877966 - 231877966 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         StringBuilder var2 = new StringBuilder();
         char[] var3 = var1.trim().toLowerCase(Locale.ROOT).toCharArray();
         int var4 = var3.length;

         for (int var5 = Xqedii_5ts6g93.Xqedii_23lkbw7p8cem0(734176867, 23); var5 < var4; var5++) {
            char var6 = var3[var5];
            if (!Character.isLetterOrDigit(var6)
               && var6 != Xqedii_5ts6g93.Xqedii_kowup088vgfv(276149514, 31)
               && var6 != Xqedii_5ts6g93.Xqedii_23lkbw7p8cem0(1027778147, 23)) {
               var2.append((char)Xqedii_5ts6g93.Xqedii_kowup088vgfv(-1381478269, 10));
            } else {
               var2.append(var6);
            }
         }

         return var2.isEmpty() ? Xqedii_5ts6g93.Xqedii_1lm433jucxd77("VMQ591IzikIGJUPLZ74D3Qnr6rENHwnYmCnDWl4wYoZaN7L3C5579uBa") : var2.toString();
      } else {
         return Xqedii_5ts6g93.Xqedii_1lm433jucxd77("VMQ591IzikIGJUPLZ74D3Qnr6rENHwnYmCnDWl4wYoZaN7L3C5579uBa");
      }
   }
}
