package dev.xqedii.ultimateUI;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.Plugin;

public final class Xqedii_1nc5hgr {
   public static final String Xqedii_2rmt912izj35u = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final Pattern Xqedii_375l6vf;
   public static final Pattern Xqedii_16fy7xn;
   public static final Pattern Xqedii_28kmq82;
   public final Map<UUID, Map<String, String>> Xqedii_318l4nb = new ConcurrentHashMap<>();
   public final Map<UUID, Map<String, String>> Xqedii_2u0o0nz = new ConcurrentHashMap<>();
   public volatile Boolean Xqedii_2119p6e;
   public volatile Method Xqedii_osks008;

   public void Xqedii_1anj7is(Player var1, Map<String, String> var2) {
      if ((-1399025043 * -1399025043 - -1399025043 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         ConcurrentHashMap var3 = new ConcurrentHashMap();
         if (var2 != null) {
            var3.putAll(var2);
         }

         this.Xqedii_318l4nb.put(var1.getUniqueId(), var3);
      }
   }

   public void Xqedii_1smopsn(Player var1, Map<String, String> var2) {
      if ((-767982967 * (-767982967 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isEmpty()) {
         Map var3 = this.Xqedii_2u0o0nz.computeIfAbsent(var1.getUniqueId(), var0 -> {
            if (((661111710 << 1 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               return new ConcurrentHashMap<>();
            }
         });

         for (Entry var5 : var2.entrySet()) {
            var3.putIfAbsent(
               (String)var5.getKey(),
               var5.getValue() == null ? Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("70O+G79SNYbXV4RYrD2LryhiWkPxfl8LSy3OEA==") : (String)var5.getValue()
            );
         }
      }
   }

   public void Xqedii_1dxyjeo(Player var1, String var2, String var3) {
      if ((1125313964 ^ 1125313964) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         String var4 = var2.trim();
         int var5 = !var4.startsWith(Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("JvqvPG2Gas5KzbkQRWYuam6/9Wpag+auIkgD0mYs"))
               && !var4.startsWith(Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("YN59Cus/qsDsgvD4QrdqrR5rXYgZSL/Dc/NHXW07"))
            ? Xqedii_1dqcegx.Xqedii_2xh0om66o7u0i(-244665638, 31)
            : Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(-245274426, 30);
         if (var5 != 0) {
            var4 = var4.substring(Xqedii_1dqcegx.Xqedii_3w367ws5wwr44(477131483, 4)).trim();
         }

         if (!var4.isBlank()) {
            Map var6 = this.Xqedii_2u0o0nz.get(var1.getUniqueId());
            Map var7;
            if (var5 == 0 && (var6 == null || !var6.containsKey(var4))) {
               var7 = this.Xqedii_318l4nb.computeIfAbsent(var1.getUniqueId(), var0 -> {
                  if ((-1209624272 * -1209624272 + -1209624272 & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     return new ConcurrentHashMap<>();
                  }
               });
            } else {
               var7 = this.Xqedii_2u0o0nz.computeIfAbsent(var1.getUniqueId(), var0 -> {
                  if (((367085568 << 1 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else {
                     return new ConcurrentHashMap<>();
                  }
               });
            }

            var7.put(var4, var3 == null ? Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("70O+G79SNYbXV4RYrD2LryhiWkPxfl8LSy3OEA==") : var3);
         }
      }
   }

   public boolean Xqedii_1fgvpt1(Player var1, String var2) {
      if (((-2097008860 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String var3 = Xqedii_1t9ph7e(var2);
         Map var4 = this.Xqedii_318l4nb.get(var1.getUniqueId());
         Map var5 = this.Xqedii_2u0o0nz.get(var1.getUniqueId());
         return (((var4 == null || !var4.containsKey(var3)) && (var5 == null || !var5.containsKey(var3))
            ? Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-157831818, 3)
            : Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(-245274426, 28)) != 0);
      } else {
         return (Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-157831818, 20) != 0);
      }
   }

   public String Xqedii_15lmxhq(Player var1, String var2) {
      if ((1777943789 * (1777943789 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         String var3 = Xqedii_1t9ph7e(var2);
         Map var4 = this.Xqedii_318l4nb.get(var1.getUniqueId());
         if (var4 != null && var4.containsKey(var3)) {
            return (String)var4.get(var3);
         } else {
            Map var5 = this.Xqedii_2u0o0nz.get(var1.getUniqueId());
            return var5 != null && var5.containsKey(var3)
               ? (String)var5.get(var3)
               : Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("70O+G79SNYbXV4RYrD2LryhiWkPxfl8LSy3OEA==");
         }
      } else {
         return Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("70O+G79SNYbXV4RYrD2LryhiWkPxfl8LSy3OEA==");
      }
   }

   public static String Xqedii_1t9ph7e(String var0) {
      if ((-1969794872 * -1969794872 + -1969794872 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var1 = var0.trim();
         return !var1.startsWith(Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("JvqvPG2Gas5KzbkQRWYuam6/9Wpag+auIkgD0mYs"))
               && !var1.startsWith(Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("YN59Cus/qsDsgvD4QrdqrR5rXYgZSL/Dc/NHXW07"))
            ? var1
            : var1.substring(Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(-245274426, 11)).trim();
      }
   }

   public void Xqedii_z4f1nd9(UUID var1) {
      if ((1628258422 ^ 1628258422) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null) {
            this.Xqedii_318l4nb.remove(var1);
            this.Xqedii_2u0o0nz.remove(var1);
         }
      }
   }

   public void Xqedii_3czb6zz(UUID var1) {
      if (((-892052181 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null) {
            this.Xqedii_318l4nb.remove(var1);
         }
      }
   }

   public String Xqedii_1kcsuri(Player var1, String var2) {
      if (((1839056671 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null && !var2.isEmpty()) {
         String var3 = this.Xqedii_3gtcmss(var2);
         var3 = this.Xqedii_33cck0y(var1, var3);
         var3 = this.Xqedii_3ptslxz(var1, var3);
         if (var3.indexOf(Xqedii_1dqcegx.Xqedii_3w367ws5wwr44(909697249, 29)) >= 0) {
            var3 = this.Xqedii_3mj6713(var1, var3);
         }

         return var3;
      } else {
         return var2 == null ? Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("70O+G79SNYbXV4RYrD2LryhiWkPxfl8LSy3OEA==") : var2;
      }
   }

   public String Xqedii_3gtcmss(String var1) {
      if (((1170560043 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!var1.contains(Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("oYCQdOHobBrFDBNfiaukViUMQNyizW9NmJpa6X1PaCw="))) {
         return var1;
      } else {
         Matcher var2 = Xqedii_375l6vf.matcher(var1);
         StringBuilder var3 = new StringBuilder();

         while (var2.find()) {
            var2.appendReplacement(var3, Matcher.quoteReplacement(Xqedii_3cy3gr8bnubyz(var2.group(Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-157962890, 17)))));
         }

         var2.appendTail(var3);
         return var3.toString();
      }
   }

   public String Xqedii_33cck0y(Player var1, String var2) {
      if (((-1335024010 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null
         && (var2.indexOf(Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(-264148794, 19)) >= 0 || var2.indexOf(Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-887640714, 23)) >= 0)) {
         String var3 = var2;

         for (Map var5 : List.of(this.Xqedii_318l4nb.getOrDefault(var1.getUniqueId(), Map.of()), this.Xqedii_2u0o0nz.getOrDefault(var1.getUniqueId(), Map.of()))) {
            for (Entry var7 : (Iterable<Entry>) (var5.entrySet())) {

               String var8 = var7.getValue() == null
                  ? Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("70O+G79SNYbXV4RYrD2LryhiWkPxfl8LSy3OEA==")
                  : (String)var7.getValue();
               String var9 = (String)var7.getKey();
               var3 = var3.replace(Xqedii_25fhet77fvsr6(var9), var8).replace(Xqedii_2hfovvgx4634u(var9), var8).replace(Xqedii_1nhxja6p1k5dk(var9), var8);
            }
         }

         return var3;
      } else {
         return var2;
      }
   }

   public String Xqedii_3ptslxz(Player var1, String var2) {
      if (((-2102446934 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2.indexOf(Xqedii_1dqcegx.Xqedii_3w367ws5wwr44(477130907, 4)) >= 0) {
         String var3 = var2.replace(Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("9qpJ75x66sD4ifmVZreNhqDmYxUO0zHTeXHGpQvFoud9dqQmMAk0NtxTlsw="), var1.getName());
         var3 = var3.replace(Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("NORKsc1mFzIiuplvsJFSO+n5Sx8yMuvL6qkkzyLeriw6fwBQBNTxmPDHw3s9xoJhu+ZqIp1K"), var1.getName());
         var3 = var3.replace(Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("KBgPgB9z0v/KL7pVfJv8JcgkBZV/6uSbMUyViRj80CjJRz7f7CwOuc4nhat3yyHi4JQQzQ=="), var1.getName());
         var3 = var3.replace(Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("+fHwplF10J7i8rBIUa1eAG4bw3W2kEJJIhBxBuvi7TucenAcu4Uwnw=="), var1.getUniqueId().toString());
         var3 = var3.replace(
            Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("9T45lJgidOfVEUONxgoUsVdXNPShNjsww/0/jrYfkGqzojM+N4cdOd3rp16LhU4AYPBu3hbd"), var1.getUniqueId().toString()
         );
         var3 = var3.replace(Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("7ReZjQBLg+Nma9hNdK93SFM0t84WEYr9Klel8ss7kPHcRzwCWNJ8OTgF"), var1.getWorld().getName());
         return this.Xqedii_ildkt08(var1, var3);
      } else {
         return var2;
      }
   }

   public String Xqedii_ildkt08(Player var1, String var2) {
      if (((1712947903 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2.indexOf(Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-156062346, 16)) < 0) {
         return var2;
      } else {
         Matcher var3 = Xqedii_28kmq82.matcher(var2);
         StringBuilder var4 = new StringBuilder();
         int var5 = Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(245274425, 10);

         while (var3.find()) {
            var5 = Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-157832074, 8);
            int var6 = Xqedii_fzj0fe5(var3.group(Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(-249468730, 22)));
            String var7;
            if (var6 < 0) {
               var7 = var3.group();
            } else {
               PlayerInventory var8 = var1.getInventory();
               int var9 = var6 == Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-157832130, 3) ? var8.getHeldItemSlot() : var6;
               ItemStack var10 = var8.getItem(var9);
               int var11 = var10 != null && !var10.getType().isAir() ? var10.getAmount() : Xqedii_1dqcegx.Xqedii_2xh0om66o7u0i(1448828461, 12);
               boolean var12 = Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("pSoGUfu8gXXx0nJalXrrwTq338UjkEfMdozIKQrqSrlTBy/fzN0=")
                  .equalsIgnoreCase(var3.group(Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-157897354, 16)));
               var7 = var12 && var11 <= Xqedii_1dqcegx.Xqedii_2xh0om66o7u0i(-1397302182, 13)
                  ? Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("70O+G79SNYbXV4RYrD2LryhiWkPxfl8LSy3OEA==")
                  : Integer.toString(var11);
            }

            var3.appendReplacement(var4, Matcher.quoteReplacement(var7));
         }

         if (var5 == 0) {
            return var2;
         } else {
            var3.appendTail(var4);
            return var4.toString();
         }
      }
   }

   public static int Xqedii_fzj0fe5(String var0) {
      if (((-1664238085 | 1) & 1) == 0) {
         throw new IllegalStateException();
      }
      String var1 = var0 == null ? "" : var0.trim().toLowerCase(Locale.ROOT);
      switch (var1) {
         case "hand":
         case "mainhand":
         case "main_hand":
            return 41;
         case "offhand":
         case "off_hand":
            return 40;
         case "helmet":
         case "head":
            return 39;
         case "chestplate":
         case "chest":
            return 38;
         case "leggings":
         case "legs":
            return 37;
         case "boots":
         case "feet":
            return 36;
         default:
            try {
               int var5 = Integer.parseInt(var1);
               if (var5 >= 0 && var5 <= 40) {
                  return var5;
               }
               return -1;
            } catch (Throwable var6) {
               return -1;
            }
      }
   }

   public String Xqedii_3mj6713(Player var1, String var2) {
      if (((193017134 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Boolean var3 = this.Xqedii_2119p6e;
         if (var3 == null) {
            Plugin var4 = Bukkit.getPluginManager()
               .getPlugin(Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("7N3g2XFb3zJdRrEtPg1VFLGa4QafaU2wFsVV6LXvM+Vq80uUoyGdSDeLs7AC2Y8Qr3dhPCXt028="));
            var3 = Boolean.valueOf(
               ((var4 != null && var4.isEnabled()
                  ? Xqedii_1dqcegx.Xqedii_3w367ws5wwr44(477131483, 4)
                  : Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(245274425, 29)) != 0)
            );
            if (var3) {
               try {
                  Class var10001 = Class.forName(
                     Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5(
                        "LVQyXjSwK6MrIgD+bF/uhoKkKyb8tis9IBQg2wKAaMCoXc2O4BKcX3W2gFRF07tZwGYlrHBPnJ6XCgj8Uy0XCTanLDEeOqqZtlLdWPUbW7X1K5Gp+s7reJ0hvb3+ENdXmvqSriBD"
                     )
                  );
                  String var10002 = Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("jHWG2QtVkGxEqDlUdK55KB1jk9Javnywb4Eny2lXpUqxYv/nMpRgSD0GMn0SqS4XBkV2GBsBkrg+hA==");
                  Class[] var10003 = new Class[Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-157831834, 3)];
                  var10003[Xqedii_1dqcegx.Xqedii_3w367ws5wwr44(1886571292, 12)] = Player.class;
                  var10003[Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-157831690, 7)] = String.class;
                  this.Xqedii_osks008 = var10001.getMethod(var10002, var10003);
               } catch (Throwable var7) {
                  var3 = Boolean.valueOf((Xqedii_1dqcegx.Xqedii_3w367ws5wwr44(-1295573988, 26) != 0));
               }
            }

            this.Xqedii_2119p6e = var3;
         }

         Method var8 = this.Xqedii_osks008;
         if (var3 && var8 != null) {
            try {
               Object[] var9 = new Object[Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(-178165562, 26)];
               var9[Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-157831818, 28)] = var1;
               var9[Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(-245274426, 5)] = var2;
               Object var5 = var8.invoke(null, var9);
               return var5 == null ? var2 : var5.toString();
            } catch (Throwable var6) {
               return var2;
            }
         } else {
            return var2;
         }
      }
   }

   public static String Xqedii_2jht1ka(String var0) {
      if (((-1855996357 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var0 != null && !var0.isEmpty()) {
         String var1 = Xqedii_16fy7xn.matcher(var0).replaceAll(Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("70O+G79SNYbXV4RYrD2LryhiWkPxfl8LSy3OEA=="));
         StringBuilder var2 = new StringBuilder(var1.length());

         for (int var3 = Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(245274425, 8); var3 < var1.length(); var3++) {
            char var4 = var1.charAt(var3);
            if (var4 == Xqedii_1dqcegx.Xqedii_2xh0om66o7u0i(-1104325027, 28)
               && var3 + Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-191386250, 25) < var1.length()
               && Xqedii_2pc5uej(var1.charAt(var3 + Xqedii_1dqcegx.Xqedii_2xh0om66o7u0i(-1763996843, 18)))) {
               var2.append((char)Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-157842250, 6));
            } else {
               var2.append(var4);
            }
         }

         return var2.toString();
      } else {
         return Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("70O+G79SNYbXV4RYrD2LryhiWkPxfl8LSy3OEA==");
      }
   }

   public static boolean Xqedii_2pc5uej(char var0) {
      if ((-1567346017 * (-1567346017 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         char var1 = Character.toLowerCase(var0);
         return (((var1 < Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(-266770234, 19) || var1 > Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-157832002, 3))
               && (var1 < Xqedii_1dqcegx.Xqedii_2xh0om66o7u0i(-1422870762, 11) || var1 > Xqedii_1dqcegx.Xqedii_2xh0om66o7u0i(-868760150, 17))
               && var1 != Xqedii_1dqcegx.Xqedii_2xh0om66o7u0i(1645096278, 20)
               && var1 != Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(-231118650, 19)
               && var1 != Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(-245273082, 4)
               && var1 != Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(-245235514, 11)
               && var1 != Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-76042890, 21)
               && var1 != Xqedii_1dqcegx.Xqedii_2wr9aqfmjlu3g(-157838218, 7)
            ? Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(245274425, 18)
            : Xqedii_1dqcegx.Xqedii_7sa8irvjp30j(-245274426, 31)) != 0);
      }
   }

   static {
      if ((-317262919 * -317262919 - -317262919 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_375l6vf = Pattern.compile(Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("BGh/W18mYH5MQXFgQsrsETW9L0hjAx5zN1/hETl+v3VCZ9SwWyC0QTjJyzL5ascBGys="));
         Xqedii_16fy7xn = Pattern.compile(
            Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("vxHb6XZxQ5ALKd0I6I/B/vJdzm3D/w7PSu2WZpCtaYYlc7vLthhzVEr8Leic7F0IdaS12jLrBR16GixxqwNCdhNmYvL9/tVN")
         );
         Xqedii_28kmq82 = Pattern.compile(
            Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5(
               "PovaEJVrsObbnMiIDLKMM7iU5AR8dyE0PkaarCua3eKAryjk6TBOyz7H7vu5QRcnv3LimJ2RunvAUCmNHkhAYDWAtHiA85nQL/K++zXmisU5Hi9eKw45IlXtTNJ1I83EIwGqaYYHTMg="
            )
         );
      }
   }

   private static /* synthetic */ String Xqedii_3cy3gr8bnubyz(String string) {
        return Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("yCL/UHZrMiB3QuKTn33DC54G55S+zGFZURvyBQek") + string + Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("yCL/UHZrMiB3QuKTn33DC54G55S+zGFZURvyBQek");
    }

    private static /* synthetic */ String Xqedii_25fhet77fvsr6(String string) {
        return Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("O0Xi9ZRMGnvWmbMTV+caeEsOP1HhifWFyOSlXY/gjJQ=") + string + Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("KdelyaUYPfxrPo2S4ejS33MkNQ40bw9veYSC0buQ");
    }

    private static /* synthetic */ String Xqedii_2hfovvgx4634u(String string) {
        return Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("bRE3zSoEeKTg0V2qp6irU1LLi9xOstAW2pMPCC4D") + string + Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("KdelyaUYPfxrPo2S4ejS33MkNQ40bw9veYSC0buQ");
    }

    private static /* synthetic */ String Xqedii_1nhxja6p1k5dk(String string) {
        return Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("yCL/UHZrMiB3QuKTn33DC54G55S+zGFZURvyBQek") + string + Xqedii_1dqcegx.Xqedii_2e6bb8bfmuhn5("yCL/UHZrMiB3QuKTn33DC54G55S+zGFZURvyBQek");
    }
}
