package dev.xqedii.ultimateUI.gui.parser;

import dev.xqedii.ultimateUI.Xqedii_1pg98y7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;

public abstract class TemplateParams extends TemplateBlockValues {
   public static final String Xqedii_2e5c5wkp9lzjg = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public Map<String, Object> Xqedii_2rxl8fy(Map<String, Object> var1, Map<String, Object> var2) {
      if ((2091251326 ^ 2091251326) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var3 = new LinkedHashMap();
         if (var1 == null) {
            return var3;
         } else {
            for (Entry var5 : var1.entrySet()) {
               var3.put((String)var5.getKey(), this.Xqedii_35v0pb4(var5.getValue(), var2));
            }

            return var3;
         }
      }
   }

   public Object Xqedii_35v0pb4(Object var1, Map<String, Object> var2) {
      if ((-1718740125 ^ -1718740125) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof String var8) {
         return this.Xqedii_2yf011p(var8, var2);
      } else {
         Map var3 = this.Xqedii_2uqaav9(var1);
         if (var3 != null) {
            return this.Xqedii_2rxl8fy(var3, var2);
         } else if (!(var1 instanceof List var4)) {
            return var1;
         } else {
            ArrayList var5 = new ArrayList();

            for (Object var7 : var4) {
               var5.add(this.Xqedii_35v0pb4(var7, var2));
            }

            return var5;
         }
      }
   }

   public Object Xqedii_2yf011p(String var1, Map<String, Object> var2) {
      if ((405748397 * 405748397 + 405748397 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_1pg98y7.Xqedii_2ea1z6psrudog("vgT3i36p9Bes8N5udxqxdISmJ7AEy/pS8SMt0w==");
      } else if (var1.indexOf(Xqedii_1pg98y7.Xqedii_3boxiavk3txo6(-781123121, 5)) < 0 && var1.indexOf(Xqedii_1pg98y7.Xqedii_3boxiavk3txo6(-1016000849, 23)) < 0
         )
       {
         return var1;
      } else {
         Matcher var3 = Xqedii_3fa20jc.matcher(var1);
         if (!var3.find()) {
            return var1;
         } else if (var3.start() == 0 && var3.end() == var1.length()) {
            String var8 = this.Xqedii_1g4lkir(var3);
            if (!this.Xqedii_2euns8j(var8, var2)) {
               return var1;
            } else {
               Object var9 = var2.get(var8);
               return var9 == null ? Xqedii_1pg98y7.Xqedii_2ea1z6psrudog("vgT3i36p9Bes8N5udxqxdISmJ7AEy/pS8SMt0w==") : var9;
            }
         } else {
            StringBuffer var4 = new StringBuffer();

            do {
               String var5 = this.Xqedii_1g4lkir(var3);
               String var6;
               if (this.Xqedii_2euns8j(var5, var2)) {
                  Object var7 = var2.get(var5);
                  var6 = var7 == null ? Xqedii_1pg98y7.Xqedii_2ea1z6psrudog("vgT3i36p9Bes8N5udxqxdISmJ7AEy/pS8SMt0w==") : var7.toString();
               } else {
                  var6 = var3.group();
               }

               var3.appendReplacement(var4, Matcher.quoteReplacement(var6));
            } while (var3.find());

            var3.appendTail(var4);
            return var4.toString();
         }
      }
   }

   public boolean Xqedii_2euns8j(String var1, Map<String, Object> var2) {
      if ((1178987899 * 1178987899 - 1178987899 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && var2 != null && var2.containsKey(var1)
            ? Xqedii_1pg98y7.Xqedii_3boxiavk3txo6(-783216977, 21)
            : Xqedii_1pg98y7.Xqedii_3boxiavk3txo6(-781119825, 11)) != 0);
      }
   }

   public String Xqedii_1g4lkir(Matcher var1) {
      if ((38201196 * 38201196 + 38201196 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         for (int var2 = Xqedii_1pg98y7.Xqedii_1kgb30li26e5f(1415892807, 20); var2 <= var1.groupCount(); var2++) {
            String var3 = var1.group(var2);
            if (var3 != null) {
               return var3;
            }
         }

         return null;
      }
   }
}
