package dev.xqedii.ultimateUI;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import org.bukkit.entity.Player;

public final class Xqedii_z4wg071 {
   public static final String Xqedii_1i4db3v4wkll3 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public static Object Xqedii_1w9icqw(double var0) {
      if ((1219427087 * (1219427087 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var0;
      }
   }

   public static String Xqedii_2mlipa7(Object var0) {
      if ((90717955 * (90717955 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 == null) {
         return Xqedii_3fg560p.Xqedii_otm6tff6cmz7("BEwGZ7beBQWw0JL5GNrHjbYrx27ajbd4LUzUsdWXA3eZO4Lk");
      } else if (var0 instanceof String var12) {
         return var12;
      } else if (var0 instanceof Double var11) {
         return Xqedii_1vloe0f(var11);
      } else if (var0 instanceof Number var10) {
         return Xqedii_1vloe0f(var10.doubleValue());
      } else if (var0 instanceof Boolean var9) {
         return var9
            ? Xqedii_3fg560p.Xqedii_otm6tff6cmz7("EIiYxmx2ogqV2HjmmBtApf8SuhIiVyZpkmTdveU47u1DOdTN")
            : Xqedii_3fg560p.Xqedii_otm6tff6cmz7("pkVebFAdbsx2bB4VmFyhsyf7+ykjIvrwegprW3u995hg8J5lMgo=");
      } else if (var0 instanceof Xqedii_11itj63 var8) {
         return var8.id();
      } else if (var0 instanceof Player var7) {
         return var7.getName();
      } else if (var0 instanceof List var6) {
         StringBuilder var13 = new StringBuilder(Xqedii_3fg560p.Xqedii_otm6tff6cmz7("q+idtH7f3IPazWVKpmcK3Jsv7ky6Ddzz4PXmZq6o"));

         for (int var14 = Xqedii_3fg560p.Xqedii_xgr0nkekpheo(865570462, 17); var14 < var6.size(); var14++) {
            if (var14 > 0) {
               var13.append(Xqedii_3fg560p.Xqedii_otm6tff6cmz7("l4Kc0PjLSE6ipCKVn8C0rqGFozIEHBs30w56U0kXgLA="));
            }

            var13.append(Xqedii_2mlipa7(var6.get(var14)));
         }

         return var13.append((char)Xqedii_3fg560p.Xqedii_2elwh5vtzszj3(-705137387, 11)).toString();
      } else if (var0 instanceof Map var1) {
         StringBuilder var2 = new StringBuilder(Xqedii_3fg560p.Xqedii_otm6tff6cmz7("5lX7r4emuTyQUJWFET5xd1zhmRmDsSgtq5g4O+yL"));
         int var3 = Xqedii_3fg560p.Xqedii_2vtx6s49qrnww(94291263, 23);

         for (Entry var5 : (Iterable<Entry>) (var1.entrySet())) {

            if (var3 == 0) {
               var2.append(Xqedii_3fg560p.Xqedii_otm6tff6cmz7("l4Kc0PjLSE6ipCKVn8C0rqGFozIEHBs30w56U0kXgLA="));
            }

            var3 = Xqedii_3fg560p.Xqedii_2elwh5vtzszj3(-704996075, 14);
            var2.append(var5.getKey())
               .append(Xqedii_3fg560p.Xqedii_otm6tff6cmz7("R3iWEYkMo7gzdLxhhX5v502uzncwWMVRk7aBdOjiFyU="))
               .append(Xqedii_2mlipa7(var5.getValue()));
         }

         return var2.append((char)Xqedii_3fg560p.Xqedii_xgr0nkekpheo(1840370630, 22)).toString();
      } else {
         return String.valueOf(var0);
      }
   }

   public static String Xqedii_1vloe0f(double var0) {
      if ((474972119 * 474972119 - 474972119 & 1) != 0) {
         throw new IllegalStateException();
      } else if (Double.isNaN(var0)) {
         return Xqedii_3fg560p.Xqedii_otm6tff6cmz7("c6yVAFlH6OvgSmFdbil++4STZFPKO+D76wTwdHOMWLn4Sg==");
      } else if (Double.isInfinite(var0)) {
         return var0 > Double.longBitsToDouble(Xqedii_3fg560p.Xqedii_4xlcoxmf3e3n(8625678056188566193L, 3))
            ? Xqedii_3fg560p.Xqedii_otm6tff6cmz7("Eo1cQxOLf8DOB8L39ANvdOZyVAEoCwzX7Yw7Sp7yhQMIL9DoKU7josLKG8g=")
            : Xqedii_3fg560p.Xqedii_otm6tff6cmz7("SlSWNYg9lauRajQ/JqLjpVc+uhzFsH5oZWZkvIfKN48BD9tPnu66Qx/pxuQjXg==");
      } else {
         return var0 == Math.rint(var0) && Math.abs(var0) < Double.longBitsToDouble(Xqedii_3fg560p.Xqedii_2674i012xemcy(-6573015773400454535L, 12))
            ? Long.toString((long)var0)
            : BigDecimal.valueOf(var0).setScale(Xqedii_3fg560p.Xqedii_2vtx6s49qrnww(94291359, 5), RoundingMode.HALF_UP).stripTrailingZeros().toPlainString();
      }
   }

   public static double Xqedii_3c9epia(Object var0, int var1) {
      if ((-459165484 * -459165484 + -459165484 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 instanceof Number var7) {
         return var7.doubleValue();
      } else if (var0 instanceof Boolean var6) {
         return var6
            ? Double.longBitsToDouble(Xqedii_3fg560p.Xqedii_3nvuouhg0cemj(7111468883680816576L, 62))
            : Double.longBitsToDouble(Xqedii_3fg560p.Xqedii_4xlcoxmf3e3n(-5134091110419361265L, 32));
      } else if (var0 == null) {
         return Double.longBitsToDouble(Xqedii_3fg560p.Xqedii_4xlcoxmf3e3n(5205847809187167194L, 18));
      } else if (var0 instanceof String var2) {
         String var3 = var2.trim();
         if (var3.isEmpty()) {
            return Double.longBitsToDouble(Xqedii_3fg560p.Xqedii_3nvuouhg0cemj(7875954920426958272L, 32));
         } else {
            try {
               return Double.parseDouble(
                  var3.replace((char)Xqedii_3fg560p.Xqedii_2elwh5vtzszj3(-704996066, 30), (char)Xqedii_3fg560p.Xqedii_1j219bly2h8vj(116461420, 28))
               );
            } catch (NumberFormatException var5) {
               throw new Xqedii_3vsk7zm(Xqedii_1dah1d1cgaw0h(var2), var1);
            }
         }
      } else {
         throw new Xqedii_3vsk7zm(Xqedii_h925o1abzntk(Xqedii_yl2qf35(var0)), var1);
      }
   }

   public static double Xqedii_3pdnyon(Object var0, double var1) {
      if ((-488283702 ^ -488283702) != 0) {
         throw new IllegalStateException();
      } else if (var0 instanceof Number var7) {
         return var7.doubleValue();
      } else if (var0 instanceof String var6) {
         try {
            return Double.parseDouble(
               var6.trim().replace((char)Xqedii_3fg560p.Xqedii_2vtx6s49qrnww(1570686270, 27), (char)Xqedii_3fg560p.Xqedii_2elwh5vtzszj3(-1510302444, 27))
            );
         } catch (NumberFormatException var5) {
            return var1;
         }
      } else if (var0 instanceof Boolean var3) {
         return var3
            ? Double.longBitsToDouble(Xqedii_3fg560p.Xqedii_4xlcoxmf3e3n(408481159493180512L, 47))
            : Double.longBitsToDouble(Xqedii_3fg560p.Xqedii_2674i012xemcy(-7095604391206641226L, 7));
      } else {
         return var1;
      }
   }

   public static int Xqedii_1x518al(Object var0, int var1) {
      if ((420512918 * 420512918 - 420512918 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var2 = Xqedii_3c9epia(var0, var1);
         return (int)Math.max(
            Double.longBitsToDouble(Xqedii_3fg560p.Xqedii_3nvuouhg0cemj(7875981532044324288L, 45)),
            Math.min(Double.longBitsToDouble(Xqedii_3fg560p.Xqedii_2jesmtvkptylp(-3580163168472624811L, 2)), Math.floor(var2))
         );
      }
   }

   public static boolean Xqedii_2od1ceu(Object var0) {
      if ((1487978132 * 1487978132 - 1487978132 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 == null) {
         return (Xqedii_3fg560p.Xqedii_xgr0nkekpheo(964225507, 21) != 0);
      } else if (var0 instanceof Boolean var7) {
         return var7;
      } else if (var0 instanceof Number var6) {
         double var2 = var6.doubleValue();
         return ((var2 != Double.longBitsToDouble(Xqedii_3fg560p.Xqedii_2674i012xemcy(-7095604391206641226L, 26)) && !Double.isNaN(var2)
            ? Xqedii_3fg560p.Xqedii_2elwh5vtzszj3(-705127147, 17)
            : Xqedii_3fg560p.Xqedii_2vtx6s49qrnww(-94291264, 14)) != 0);
      } else if (!(var0 instanceof String var1)) {
         if (var0 instanceof Collection var5) {
            return ((!var5.isEmpty() ? Xqedii_3fg560p.Xqedii_2vtx6s49qrnww(94291263, 10) : Xqedii_3fg560p.Xqedii_2elwh5vtzszj3(-704996075, 5)) != 0);
         } else if (var0 instanceof Map var4) {
            return ((!var4.isEmpty() ? Xqedii_3fg560p.Xqedii_2vtx6s49qrnww(94291263, 8) : Xqedii_3fg560p.Xqedii_2vtx6s49qrnww(-94291264, 22)) != 0);
         } else {
            return (Xqedii_3fg560p.Xqedii_xgr0nkekpheo(-833209736, 19) != 0);
         }
      } else {
         return ((!var1.isEmpty() && !var1.equalsIgnoreCase(Xqedii_3fg560p.Xqedii_otm6tff6cmz7("pkVebFAdbsx2bB4VmFyhsyf7+ykjIvrwegprW3u995hg8J5lMgo="))
            ? Xqedii_3fg560p.Xqedii_2elwh5vtzszj3(-1778737899, 30)
            : Xqedii_3fg560p.Xqedii_2elwh5vtzszj3(-704996075, 13)) != 0);
      }
   }

   public static boolean Xqedii_zxgkysn(Object var0, Object var1) {
      if ((1569599685 * 1569599685 + 1569599685 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 == var1) {
         return (Xqedii_3fg560p.Xqedii_2elwh5vtzszj3(-704733931, 18) != 0);
      } else if (var0 != null && var1 != null) {
         if (var0 instanceof Number var2 && var1 instanceof Number var3) {
            return ((var2.doubleValue() == var3.doubleValue()
               ? Xqedii_3fg560p.Xqedii_xgr0nkekpheo(-1483938461, 7)
               : Xqedii_3fg560p.Xqedii_2vtx6s49qrnww(-94291264, 30)) != 0);
         } else if (var0 instanceof Xqedii_11itj63 || var1 instanceof Xqedii_11itj63 || var0 instanceof Player || var1 instanceof Player) {
            return Xqedii_2mlipa7(var0).equals(Xqedii_2mlipa7(var1));
         } else if (var0 instanceof Number && var1 instanceof String var5) {
            return Xqedii_2mlipa7(var0).equals(var5);
         } else {
            return var0 instanceof String var4 && var1 instanceof Number ? var4.equals(Xqedii_2mlipa7(var1)) : var0.equals(var1);
         }
      } else {
         return (Xqedii_3fg560p.Xqedii_2elwh5vtzszj3(-704996075, 24) != 0);
      }
   }

   public static boolean Xqedii_2lutf1l(Object var0, Object var1) {
      if ((-1761203020 * (-1761203020 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 instanceof String var2 && var1 instanceof String var3) {
         return var2.equalsIgnoreCase(var3);
      } else {
         return !(var0 instanceof String) && !(var1 instanceof String)
            ? Xqedii_zxgkysn(var0, var1)
            : Xqedii_2mlipa7(var0).equalsIgnoreCase(Xqedii_2mlipa7(var1));
      }
   }

   public static int Xqedii_eqxwxh9(Object var0, Object var1, int var2) {
      if ((220810538 * 220810538 - 220810538 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var0 instanceof String var3 && var1 instanceof String var4
            ? var3.compareToIgnoreCase(var4)
            : Double.compare(Xqedii_3c9epia(var0, var2), Xqedii_3c9epia(var1, var2));
      }
   }

   public static Object Xqedii_hbc7zbp(Object var0, Object var1, int var2) {
      if ((-1664882415 * -1664882415 + -1664882415 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 instanceof String || var1 instanceof String || var0 instanceof Xqedii_11itj63 || var1 instanceof Xqedii_11itj63) {
         return Xqedii_2v540j9kktkzw(Xqedii_2mlipa7(var0), Xqedii_2mlipa7(var1));
      } else if (var0 instanceof List var3) {
         ArrayList var4 = new ArrayList(var3);
         if (var1 instanceof List var5) {
            var4.addAll(var5);
         } else {
            var4.add(var1);
         }

         return var4;
      } else {
         return Xqedii_3c9epia(var0, var2) + Xqedii_3c9epia(var1, var2);
      }
   }

   public static boolean Xqedii_1lmv6tt(Object var0, Object var1) {
      if (((879276237 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var0 == null) {
         return (Xqedii_3fg560p.Xqedii_2vtx6s49qrnww(-94291264, 7) != 0);
      } else if (var0 instanceof Collection) {
         for (Object var4 : (Collection)var0) {
            if (Xqedii_zxgkysn(var4, var1)) {
               return (Xqedii_3fg560p.Xqedii_2vtx6s49qrnww(94291263, 6) != 0);
            }
         }

         return (Xqedii_3fg560p.Xqedii_2elwh5vtzszj3(-704996075, 21) != 0);
      } else {
         return var0 instanceof Map var2
            ? var2.containsKey(Xqedii_2mlipa7(var1))
            : Xqedii_2mlipa7(var0).toLowerCase(Locale.ROOT).contains(Xqedii_2mlipa7(var1).toLowerCase(Locale.ROOT));
      }
   }

   public static String Xqedii_yl2qf35(Object var0) {
      if ((-1369241565 * -1369241565 + -1369241565 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 == null) {
         return Xqedii_3fg560p.Xqedii_otm6tff6cmz7("BEwGZ7beBQWw0JL5GNrHjbYrx27ajbd4LUzUsdWXA3eZO4Lk");
      } else {
         return var0 instanceof String var1 ? Xqedii_2vns54m9uglrg(var1) : Xqedii_3ck2y1a5g43qo(Xqedii_28xo6uq(var0), Xqedii_2mlipa7(var0));
      }
   }

   public static String Xqedii_28xo6uq(Object var0) {
      if ((-226497198 * -226497198 + -226497198 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 == null) {
         return Xqedii_3fg560p.Xqedii_otm6tff6cmz7("BEwGZ7beBQWw0JL5GNrHjbYrx27ajbd4LUzUsdWXA3eZO4Lk");
      } else if (var0 instanceof Number) {
         return Xqedii_3fg560p.Xqedii_otm6tff6cmz7("Gy90NudIxlAXV34AlpQar1Bb4OxJQ+Efx7ftTgyE1yUwNyrGTYHRdg==");
      } else if (var0 instanceof String) {
         return Xqedii_3fg560p.Xqedii_otm6tff6cmz7("UzSYsOx1B/ATACDOIHBwByL47y6VkxXwyQ5AfI7sZEBPA3Fs");
      } else if (var0 instanceof Boolean) {
         return Xqedii_3fg560p.Xqedii_otm6tff6cmz7("/nOThKLLuTFLuLxE/pVrWwiaHD6848G3h/gCLyA7nDgE6hs8dTfbjKpy");
      } else if (var0 instanceof List) {
         return Xqedii_3fg560p.Xqedii_otm6tff6cmz7("X3DVar42xnHBbroKtRcrk2v+ZFtZAMf9BJkZuDj/816s91zj");
      } else if (var0 instanceof Map) {
         return Xqedii_3fg560p.Xqedii_otm6tff6cmz7("IQKaqoSSe2jk3xxsBDYej+MORMfat1rTaSzj7ASOttfq3lC5HKOR1g==");
      } else if (var0 instanceof Xqedii_11itj63) {
         return Xqedii_3fg560p.Xqedii_otm6tff6cmz7("uHC9AGps7Vk36blmofwwzqS1A6Ay8QJo/sQVFOSI/LVXnuw1c/rit9DC");
      } else if (var0 instanceof Player) {
         return Xqedii_3fg560p.Xqedii_otm6tff6cmz7("DSIzUdBEkM/H/UPCUmZ8zvpO7cRAghStzT6QJB3yhzyJee6Yh/HYpQ==");
      } else {
         return var0 instanceof Xqedii_36oytze
            ? Xqedii_3fg560p.Xqedii_otm6tff6cmz7("90fIWuJJj+qHdPkhaIa2F9sfvTrUwRPYxdOZbjOn16CAssy5bX4=")
            : Xqedii_3fg560p.Xqedii_otm6tff6cmz7("6MqzeDGaf4QvXC70npVD8cEeQ2PjobXSZBWfW7niQgm/qsLaW5I=");
      }
   }

   public static Object Xqedii_3ujolw5(Object var0) {
      if ((1553980747 ^ 1553980747) != 0) {
         throw new IllegalStateException();
      } else if (var0 instanceof Number var6) {
         return var6.doubleValue();
      } else if (var0 instanceof String || var0 instanceof Boolean || var0 == null) {
         return var0;
      } else if (var0 instanceof List var5) {
         ArrayList var7 = new ArrayList(var5.size());

         for (Object var9 : var5) {
            var7.add(Xqedii_3ujolw5(var9));
         }

         return var7;
      } else if (!(var0 instanceof Map var1)) {
         return Xqedii_2mlipa7(var0);
      } else {
         LinkedHashMap var2 = new LinkedHashMap();

         for (Entry var4 : (Iterable<Entry>) (var1.entrySet())) {

            var2.put(String.valueOf(var4.getKey()), Xqedii_3ujolw5(var4.getValue()));
         }

         return var2;
      }
   }

   private static /* synthetic */ String Xqedii_1dah1d1cgaw0h(String string) {
        return Xqedii_3fg560p.Xqedii_otm6tff6cmz7("Yq2u+xPjxKS3NsSjYz2L3Cr3XE59p+KW2Pg45Mit") + string + Xqedii_3fg560p.Xqedii_otm6tff6cmz7("rmMux/EZqCxUPfcZjunhnS/E55cgmFCFbIXcZ7HqMmg/tOb0/P1pjiMCcBhQSQAEJwPggF17PyXT5Imr4SQ=");
    }

    private static /* synthetic */ String Xqedii_h925o1abzntk(String string) {
        return string + Xqedii_3fg560p.Xqedii_otm6tff6cmz7("Wxp6OpD3RsHoUvC98vNr9G5K0+UiKfZqE819EUaUfQixp9PBj/T7eL/33nQRRj0pY1y9QjqqpoaV7Zq0");
    }

    private static /* synthetic */ String Xqedii_2v540j9kktkzw(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_2vns54m9uglrg(String string) {
        return Xqedii_3fg560p.Xqedii_otm6tff6cmz7("N4a2r7cCt928Rksoq1llgwZYgtKevxaghSrbXPud8vuQDZqiWsM72g9oHtzZIzek") + string + Xqedii_3fg560p.Xqedii_otm6tff6cmz7("Yq2u+xPjxKS3NsSjYz2L3Cr3XE59p+KW2Pg45Mit");
    }

    private static /* synthetic */ String Xqedii_3ck2y1a5g43qo(String string, String string2) {
        return string + Xqedii_3fg560p.Xqedii_otm6tff6cmz7("x8tUYzR1FWDuKW+oE19Hh1UuIQPGmmT41v1w8L9/") + string2;
    }
}
