package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.api.UiElementCreate;
import dev.xqedii.ultimateUI.api.UiElementWrite;
import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import dev.xqedii.ultimateUI.api.event.UltimateUIInputSubmitEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import net.kyori.adventure.title.Title;
import net.kyori.adventure.title.Title.Times;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public final class Xqedii_2d07ocz {
   public static final String Xqedii_3bmalnsw6i5q9 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final Set<String> Xqedii_2pbhzqx;
   public static final String Xqedii_2uy90gt = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("KAbWBDIIs8O+FK/3UAHoJS3PQ9JD5VojZXk82iwT");
   public static final Set<String> Xqedii_1g7vacg;

   public static UltimateUIAPI api(int var0) {
      if ((534691227 * 534691227 - 534691227 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!UltimateUIAPI.isAvailable()) {
         throw new Xqedii_3vsk7zm(
            Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
               "R4dEvHYI5uIwLvq1HkCh26pAl/rJ2F9zN92W7pNInFt8ttfLqVev+th7otSxrpCCmWAl/Z+EIOs9OcdHrKQAs33nu1eIEkwkKYinXRRONtSYZg=="
            ),
            var0
         );
      } else {
         return UltimateUIAPI.get();
      }
   }

   public static boolean Xqedii_2b8p7zx(String var0) {
      if ((-2096943952 * -2096943952 - -2096943952 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_2pbhzqx.contains(var0);
      }
   }

   public static Object Xqedii_2pszqr1(Xqedii_y5pr2ec var0, String var1, int var2) {
      if ((608975142 * (608975142 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1yqm9k3 var3 = var0.Xqedii_3a9kp91;
         int var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714491369, 18);
         switch (var1.hashCode()) {
            case -1349119146:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("fW2PcfkVs+2ec6041nXLvXv6ONhc7yKjkkujbL5u2IPVQu2mg6cOig=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(497165005, 17);
               }
               break;
            case -1243020381:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("wZQRS/RX3/RB4CZEarX9rsERRBoQ8jQMZZ/VXqRhJuTlUMjLX8Lfyg=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(915333406, 21);
               }
               break;
            case -985752863:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("t9XMe34/ON+aqpFS3rX21SkfrBkwHhN33PSOhJRhqRTrAI2v+wmvFg=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1181253354, 12);
               }
               break;
            case -905962955:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("pXYKUyb0vOdYLtWdsa+opUQNDc6XkudcsziMRHjEzV+7ll/7ifQvcA=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(1984880927, 29);
               }
               break;
            case -905826493:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("w4IWk/zjH8KD648ZZu51cABnCsqKp/bb6OtcziaEGjkhCdETbane2g=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753482, 2);
               }
               break;
            case -493567566:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("bYnH3hjTwNpEvxvLhCtzLn+mhAuhWVY+tOC3PPb05O2hIb13PPJG+SvB"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(145966957, 31);
               }
               break;
            case 3577:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("K0OaiaxvASLhMn0kVoGFnuAKsnyDECRzIzvWBtxeYSw="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714794474, 12);
               }
               break;
            case 3002589:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("53iE6U0Uo6cAehbkie1Ybfly66sUXK/XiAFexOQi8323rgPv"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-429931430, 14);
               }
               break;
            case 3076010:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("79BhZgEOQfGKuwsjFMkvxfMMAnQ7wvlfHjPFYbi87bW1/DDX"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714757610, 10);
               }
               break;
            case 3433103:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("3TqKqF0bK36EKEz9RXELH3gVtvBQLLn90WZAT0rLvm5Pt8uT"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(-1236344546, 30);
               }
               break;
            case 3556308:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("oetMU/eMubflKY1WUU/yMuT2EQRW+khyAFnNJWjxU8zZ8R16"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1480956475, 26);
               }
               break;
            case 96891546:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("xOqjV1BjXwxOah2KAq4B3X5bd5KzmEpkH3gEqVWW/fuVCuDt7Fc="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911130910, 13);
               }
         }

         switch (var5) {
            case 0:
               return var3.Xqedii_1v4ue4a;
            case 1:
               if (var3.Xqedii_34yybpr == null) {
                  throw new Xqedii_3vsk7zm(
                     Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("KApALjwHt4ePagKjNHU5sHelE99qraVsOePB42yPQfSJRNKebIEryTJ+1D8TS8zPNNpope2FL1kUP31H7dDNVBgCZ8GGUPjO"),
                     var2
                  );
               }

               return var3.Xqedii_34yybpr;
            case 2:
               return var3.Xqedii_1r9cm9n();
            case 3:
               Player var9 = var3.Xqedii_25ge4f1(var2);
               LinkedHashMap var10 = new LinkedHashMap();
               var10.put(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21"), api(var2).getCursorPageX(var9));
               var10.put(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jx8MAgAnVRyTuYKQTkWuW6E/5+kzRBeY29B35Ve2"), api(var2).getCursorPageY(var9));
               var10.put(
                  Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("J5SHBdvyo2NtQbcWqR1IA0I7zJa/50iOUmmUCkN7t1LiW1X/zofxV45I"),
                  Xqedii_2e6m2vk(api(var2).getHoveredElement(var9))
               );
               return var10;
            case 4:
               return var3.Xqedii_2fi2lg1.Xqedii_1u89z52(var3.Xqedii_25ge4f1(var2));
            case 5:
               return var3.Xqedii_2fi2lg1.Xqedii_nm0vadd(var3.Xqedii_25ge4f1(var2));
            case 6:
               return var3.Xqedii_2fi2lg1.Xqedii_2e6s6rg();
            case 7:
               return var3.Xqedii_1v9t8lx == null ? new ArrayList() : var3.Xqedii_1v9t8lx;
            case 8:
               return new ArrayList(Bukkit.getOnlinePlayers());
            case 9:
               LinkedHashMap var8 = new LinkedHashMap();
               var8.put(
                  Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("hcHSQBWiakZKyZhKVHUmWzKFSe9OO8hDB5YPk19+llYvpBZm3SRNXQ=="), (double)Bukkit.getOnlinePlayers().size()
               );
               var8.put(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("ES6eAFO//SPMEBZYAeFR/kaxsR+CwaMDi9bMjfEIQUQYNw=="), (double)Bukkit.getMaxPlayers());
               var8.put(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("rGztH9EUJJ4HrOOR1uKwperv7NaqErinYKPden4YkOpOOJPnwo45phbD"), Bukkit.getBukkitVersion());
               var8.put(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("MmBuRmDjAJr+/muc/6sSDr3K/yAGKv5r+XBpaoZb4MBA0qJrGNw="), (double)Xqedii_38o2zes.Xqedii_316oplq());
               return var8;
            case 10:
               return var3.Xqedii_3cp8md6 instanceof Player var6 ? var6 : (var3.Xqedii_3cp8md6 == null ? null : var3.Xqedii_3cp8md6.getName());
            case 11:
               return Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_3acgm3uupz46n(-1485973704259603201L, 53));
            default:
               throw new Xqedii_3vsk7zm(Xqedii_32wj88dr8h8rr(var1, var1), var2);
         }
      }
   }

   public static String Xqedii_2e6m2vk(String var0) {
      if (((1838523096 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var0 == null ? Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("tDZDvNax8keQcXDRvxlPTRR08puTeeq6Iz33yw==") : var0;
      }
   }

   public static Object Xqedii_207muaz(Object var0) {
      if (((1535127765 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var0 instanceof Number var1 && !(var0 instanceof Double) ? var1.doubleValue() : var0;
      }
   }

   public static Object get(Xqedii_y5pr2ec var0, Object var1, String var2, int var3) {
      if (((1148127927 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var4 = var2.toLowerCase(Locale.ROOT);
         if (var1 instanceof Xqedii_11itj63 var12) {
            return Xqedii_1javj6e(var0, var12.id(), var2, var3);
         } else if (!(var1 instanceof Map var5)) {
            if (var1 instanceof List var11) {
               int var13 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-877098148, 19);
               switch (var4.hashCode()) {
                  case -1106363674:
                     if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("kcjWAxKoopMV/A5Nu/0YAzkjjvhpzgdobInO+gXA5QJvyOhJZC+cMA=="))) {
                        var13 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-430029734, 14);
                     }
                     break;
                  case 3314326:
                     if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("AADZZGQGgcQWS5o/pDHJjJCPI631/orV01jUynXwxR0h/sm0"))) {
                        var13 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(751950530, 5);
                     }
                     break;
                  case 3530753:
                     if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("BlGpykbvf6ieBTFxdM3+cuLscsxqwQVohZq6VSXL3Nyy7i3A"))) {
                        var13 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 29);
                     }
                     break;
                  case 94851343:
                     if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("c4oaw24TH1Hs/0jgfHedHndwWLpaGNgOkPrOs93SwjIhO+dvMMU="))) {
                        var13 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1723142122, 23);
                     }
                     break;
                  case 96634189:
                     if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("6Zq0GQSAbaKO0Gjhr49rRmRNKpwPR5kE7tWzBJdqSb+StTD/kyk="))) {
                        var13 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1707385787, 10);
                     }
                     break;
                  case 97440432:
                     if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("N8VU3wdzrE9N4C3F3kyVutMBfBWKeFqTlLrv9pYUi/3Laz1icJI="))) {
                        var13 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139090, 2);
                     }
                     break;
                  case 2087592547:
                     if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("JPGTeOgLhVXfDX4rWplUUy+Bw9CI2+T9ZvbfH9VaIsLWTk8cc2hKqU0j"))) {
                        var13 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1815416810, 25);
                     }
               }
               return switch (var13) {
                  case 0, 1, 2 -> (double)var11.size();
                  case 3 -> var11.isEmpty() ? null : var11.get(Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1956852800, 3));
                  case 4 -> var11.isEmpty() ? null : var11.get(var11.size() - Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(497427149, 17));
                  case 5, 6 -> var11.isEmpty();
                  default -> throw new Xqedii_3vsk7zm(Xqedii_2k9w5y9stitdd(var2), var3);
               };
            } else if (var1 instanceof String var10) {
               int var7 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1548450726, 14);
               switch (var4.hashCode()) {
                  case -1106363674:
                     if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("kcjWAxKoopMV/A5Nu/0YAzkjjvhpzgdobInO+gXA5QJvyOhJZC+cMA=="))) {
                        var7 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 1);
                     }
                     break;
                  case 3530753:
                     if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("BlGpykbvf6ieBTFxdM3+cuLscsxqwQVohZq6VSXL3Nyy7i3A"))) {
                        var7 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(910876958, 18);
                     }
                     break;
                  case 96634189:
                     if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("6Zq0GQSAbaKO0Gjhr49rRmRNKpwPR5kE7tWzBJdqSb+StTD/kyk="))) {
                        var7 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(72983476, 30);
                     }
                     break;
                  case 103164673:
                     if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("t6wsaNHQgCQQwcT4ys/SeaFRPk2Zb3nN+qgDyidWl+LUnPOJuyE="))) {
                        var7 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(291933911, 0);
                     }
                     break;
                  case 111499426:
                     if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("i0jwj5bkXluu3EqMV68X6xRcj2Xok43meSkIAvgzSbZaGkTRc6Y="))) {
                        var7 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753510, 2);
                     }
                     break;
                  case 2087592547:
                     if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("JPGTeOgLhVXfDX4rWplUUy+Bw9CI2+T9ZvbfH9VaIsLWTk8cc2hKqU0j"))) {
                        var7 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1525046980, 6);
                     }
               }
               return switch (var7) {
                  case 0, 1 -> (double)var10.length();
                  case 2, 3 -> var10.isEmpty();
                  case 4 -> var10.toUpperCase(Locale.ROOT);
                  case 5 -> var10.toLowerCase(Locale.ROOT);
                  default -> Xqedii_1javj6e(var0, var10, var2, var3);
               };
            } else if (var1 instanceof Player var9) {
               return Xqedii_266bjwx(var0, var9, var4, var3);
            } else if (var1 instanceof Xqedii_36oytze var8) {
               return Xqedii_2j653hv(var8, var4, var3);
            } else if (var1 == null) {
               throw new Xqedii_3vsk7zm(Xqedii_3en6apxrvep60(var2), var3);
            } else {
               throw new Xqedii_3vsk7zm(Xqedii_27orwbso07q2y(Xqedii_z4wg071.Xqedii_28xo6uq(var1), var2), var3);
            }
         } else {
            Object var6 = var5.get(var2);
            if (var6 == null && !var5.containsKey(var2)) {
               if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("BlGpykbvf6ieBTFxdM3+cuLscsxqwQVohZq6VSXL3Nyy7i3A"))
                  || var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("kcjWAxKoopMV/A5Nu/0YAzkjjvhpzgdobInO+gXA5QJvyOhJZC+cMA=="))) {
                  return (double)var5.size();
               }

               if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("XgOPfZCiahvrmL81172idmcEMWa874+OrhPc3wC4s5oASKdF"))) {
                  return new ArrayList(var5.keySet());
               }

               if (var4.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("JrzfTNWltv44iSqf5UTFrILuQpj/BFuPhZWyweUruIAd453Z/ZosLQ=="))) {
                  return new ArrayList(var5.values());
               }
            }

            return var6;
         }
      }
   }

   public static void Xqedii_2a9tfw6(Xqedii_y5pr2ec var0, Object var1, String var2, Object var3, int var4) {
      if ((206743848 * 206743848 - 206743848 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof Xqedii_11itj63 var12) {
         Xqedii_3j2drjj(var0, var12.id(), var2, var3, var4);
      } else if (var1 instanceof Map var11) {
         var11.put(var2, var3);
      } else if (var1 instanceof String var10) {
         Xqedii_3j2drjj(var0, var10, var2, var3, var4);
      } else if (var1 instanceof Player var9) {
         Xqedii_23nr37w(var9, var2.toLowerCase(Locale.ROOT), var3, var4);
      } else {
         if (var1 instanceof Xqedii_36oytze var5) {
            String var6 = var2.toLowerCase(Locale.ROOT);
            if ((
                  var6.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("h2jWbpfMoUWP9QnmhWO/Cq41uoLoK4LfztIr1xyBc0RT7LZL"))
                     || var6.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("p9wyJ31BpR2fVfgZqWAjnuzibvJLfdYCD2VhsiVZGybC31UBWzE="))
               )
               && var5.Xqedii_11wuen3 instanceof UltimateUIInputSubmitEvent var7) {
               var7.setValue(Xqedii_z4wg071.Xqedii_2mlipa7(var3));
               var5.Xqedii_a9in0yy = Xqedii_z4wg071.Xqedii_2mlipa7(var3);
               return;
            }

            if (var6.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("qVd7LqWtBN3+H4KLMhqLDutsDZORoeWs+y/hwa6v2Hhe8VkjsVnBMFS3tdZRNg=="))) {
               var5.cancel(Xqedii_z4wg071.Xqedii_2od1ceu(var3));
               return;
            }
         }

         throw new Xqedii_3vsk7zm(Xqedii_13qgd86wp1cq2(var2, Xqedii_z4wg071.Xqedii_28xo6uq(var1)), var4);
      }
   }

   public static Object Xqedii_1sr2hld(Xqedii_y5pr2ec var0, Object var1, String var2, Object[] var3, int var4) {
      if ((1339000796 * (1339000796 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var5 = var2.toLowerCase(Locale.ROOT);
         if (var1 instanceof Xqedii_11itj63 var15) {
            return Xqedii_200p8tk(var0, var15.id(), var5, var3, var4);
         } else if (var1 instanceof String var14) {
            return Xqedii_2q74yw2(var0, var14, var5, var3, var4);
         } else if (var1 instanceof List var13) {
            return Xqedii_306mg5g(var13, var5, var3, var4);
         } else {
            if (var1 instanceof Map var6) {
               int var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(-911139103, 10);
               switch (var5.hashCode()) {
                  case -1335458389:
                     if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("XYUM+tWTfdvIajYSamakbF5WiTGdcoonZRmH+6mb93y24/8ecCP7pQ=="))) {
                        var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753258, 6);
                     }
                     break;
                  case -934610812:
                     if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("pJGtsxrQjGVfz9kF1KeOoS/G5FdoEQRTlfOtdx9zH60tjmHwM55fdQ=="))) {
                        var9 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(880193675, 11);
                     }
                     break;
                  case -823812830:
                     if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("JrzfTNWltv44iSqf5UTFrILuQpj/BFuPhZWyweUruIAd453Z/ZosLQ=="))) {
                        var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1181220586, 12);
                     }
                     break;
                  case -567445985:
                     if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("5+67wTIcnVDOwdfUTHyheleiPgjEnNvr24nZ2uFseFABSswW8QwIovOp8Qw="))) {
                        var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(762523426, 5);
                     }
                     break;
                  case 102230:
                     if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("HpPCfIJTyfKiezG7k/NN1gvaf7+1CHzXONCtwkYODXcP4A=="))) {
                        var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-199043278, 25);
                     }
                     break;
                  case 103066:
                     if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("yCnFHNZtjPD4qa1uCISPaTzJpt3iT8qhqM+a7+jIdnpRcQ=="))) {
                        var9 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(555116781, 28);
                     }
                     break;
                  case 113762:
                     if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("sGPrO85c06yrwnosyznaUAudksBZwplVyW4I7vPpFPgpDA=="))) {
                        var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1589926630, 22);
                     }
                     break;
                  case 3288564:
                     if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("XgOPfZCiahvrmL81172idmcEMWa874+OrhPc3wC4s5oASKdF"))) {
                        var9 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1287165304, 7);
                     }
                     break;
                  case 3530753:
                     if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("BlGpykbvf6ieBTFxdM3+cuLscsxqwQVohZq6VSXL3Nyy7i3A"))) {
                        var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1956852728, 3);
                     }
                     break;
                  case 94746189:
                     if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("fx5NoOPdK6MYawMrTA8D6WjjNTlqaRzDbWHPjW7EW9vDg5MQnIA="))) {
                        var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139101, 31);
                     }
               }

               switch (var9) {
                  case 0:
                  case 1:
                     return var6.containsKey(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1167735624, 2), var4));
                  case 2:
                     return var6.getOrDefault(
                        Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1898835610, 16), var4)),
                        var3.length > Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139098, 2) ? var3[Xqedii_yp12iz0.Xqedii_38076oheu1krt(912187678, 20)] : null
                     );
                  case 3:
                     var6.put(
                        Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 22), var4)),
                        var3.length > Xqedii_yp12iz0.Xqedii_38076oheu1krt(374268190, 29) ? var3[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1760375062, 12)] : null
                     );
                     return null;
                  case 4:
                  case 5:
                     return var6.remove(Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-430046118, 14), var4)));
                  case 6:
                     var6.clear();
                     return null;
                  case 7:
                     return new ArrayList(var6.keySet());
                  case 8:
                     return new ArrayList(var6.values());
                  case 9:
                     return (double)var6.size();
               }
            }

            if (var1 instanceof Number var12) {
               return Xqedii_1iw7g71.Xqedii_2xeqrwc(var0, var5, Xqedii_4a5wk96(var12, var3), var4);
            } else {
               if (var1 instanceof Player var10) {
                  int var8 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1805219601, 8);
                  switch (var5.hashCode()) {
                     case -1821614103:
                        if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("//qY5a0twLme51RN6q/RlH4eR3xMe3KxAfxAAK7X1Dc5UEVgZffGSpysAoVkTIQlUmGr4GWo"))) {
                           var8 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1577343718, 22);
                        }
                        break;
                     case 98256:
                        if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("+whkjdZbS5muCFRk8ZcvP/QCMktlKGARkUU0OWlWgOhJzw=="))) {
                           var8 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(919527710, 22);
                        }
                        break;
                     case 103066:
                        if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("yCnFHNZtjPD4qa1uCISPaTzJpt3iT8qhqM+a7+jIdnpRcQ=="))) {
                           var8 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(2031184793, 24);
                        }
                        break;
                     case 3417674:
                        if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("POg0Lu58WmEhVitPDeHt8hUJmxrB2uHrVF9eOSmii7V+/cjv"))) {
                           var8 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753354, 5);
                        }
                        break;
                     case 3526536:
                        if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("ZhZIOCbdZI4nPI+JeI5qRYKXSn4xMuiuIwUKaAaAmCDOLcu4"))) {
                           var8 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-2001516696, 31);
                        }
                        break;
                     case 94756344:
                        if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("tCMUfUbTUufloLDqcX8P/twn8BWvx0+b0pMpYvhIYfYJTjV7X8s="))) {
                           var8 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-429931430, 14);
                        }
                        break;
                     case 198298141:
                        if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("kZhAY/TANBU54e0dzaUV29Y5d+BqKEdiF4FIdovP1bRQikI86Jcb8DppJswciQ=="))) {
                           var8 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1245423197, 22);
                        }
                        break;
                     case 954925063:
                        if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Sj9jdIL9a5IT5lzMcnbOi71rEv0yMG+nTHqpb7GHlSzC7RGQgefT6GeS"))) {
                           var8 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911130910, 11);
                        }
                  }

                  switch (var8) {
                     case 0:
                     case 1:
                     case 2:
                        return var10.hasPermission(
                           Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 18), var4))
                        );
                     case 3:
                     case 4:
                        Xqedii_2ol0jxi(var10, Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 29), var4)));
                        return null;
                     case 5:
                        Xqedii_nd6rkr3.Xqedii_2n2p2n9(
                           var10,
                           Xqedii_14rq758.Xqedii_g673f8i(
                              Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 3), var4))
                           )
                        );
                        return null;
                     case 6:
                        api(var4)
                           .openGui(var10, Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 12), var4)));
                        return null;
                     case 7:
                        api(var4).closeGui(var10);
                        return null;
                  }
               }

               if (var1 instanceof Xqedii_36oytze var11) {
                  if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("/fJUn9vnTkuNP9bxCl1ZKcdxKk0bsOHVYbmfpFwoyj9sJv2+lfcaRQ=="))) {
                     var0.Xqedii_3a9kp91.Xqedii_3dy3w3c = (Xqedii_yp12iz0.Xqedii_38076oheu1krt(911122718, 14) != 0);
                     var11.cancel((Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1198098611, 15) != 0));
                     return null;
                  }

                  if (var5.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("OEcoUfmWU/Z6nEkgMawH2L+Zrf/TuwIcKGYyHQYBc+z03OQa9wBUSWPVYGE="))) {
                     var0.Xqedii_3a9kp91.Xqedii_3dy3w3c = (Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 28) != 0);
                     var11.cancel((Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 27) != 0));
                     return null;
                  }
               }

               if (var1 == null) {
                  throw new Xqedii_3vsk7zm(Xqedii_1l750eeybvls4(var2), var4);
               } else {
                  throw new Xqedii_3vsk7zm(Xqedii_ej4oup67z9in(Xqedii_z4wg071.Xqedii_28xo6uq(var1), var2), var4);
               }
            }
         }
      }
   }

   public static Object[] Xqedii_4a5wk96(Object var0, Object[] var1) {
      if ((1657871102 * 1657871102 + 1657871102 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Object[] var2 = new Object[var1.length + Xqedii_yp12iz0.Xqedii_38076oheu1krt(911130910, 13)];
         var2[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 28)] = var0;
         System.arraycopy(var1, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-532304283, 26), var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1581538022, 22), var1.length);
         return var2;
      }
   }

   public static Object Xqedii_1k661t2(Object[] var0, int var1, int var2) {
      if (((2128811711 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 >= var0.length) {
         throw new Xqedii_3vsk7zm(Xqedii_b0t15qhwpot6(var1 + Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 29)), var2);
      } else {
         return var0[var1];
      }
   }

   public static Object Xqedii_1javj6e(Xqedii_y5pr2ec var0, String var1, String var2, int var3) {
      if ((1897167220 * 1897167220 - 1897167220 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1yqm9k3 var4 = var0.Xqedii_3a9kp91;
         Player var5 = var4.Xqedii_25ge4f1(var3);
         var4.Xqedii_3u9m9cl();
         UltimateUIAPI var6 = api(var3);
         String var7 = var2.toLowerCase(Locale.ROOT);
         int var9 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(316598679, 20);
         switch (var7.hashCode()) {
            case -1289358244:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("xbAssGqMCB2G7c8DNtUqHlNskxJ+1GNxK3CZnGrJhYuUiIMGiULfWQ=="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911106334, 15);
               }
               break;
            case -1221029593:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("nzZebb9xumLu/XMXKdRa6YvPhxDNhvO/OF2Yj3wUoZj79kT31YZrKA=="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1713180650, 18);
               }
               break;
            case -1217487446:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("1/B9iN0GzaZ7+joI7QebjxGUBDlcScbDw6PpOPIj6tl8kNbPO77bgA=="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1014450740, 23);
               }
               break;
            case -995424086:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("XGPISsS97eppD4bdHrwk0p4RR9nSTjmMAJHRfAiaoj6fAyPZMuqLpQ=="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(880148619, 11);
               }
               break;
            case -304480883:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("LgD4QrYfNvrAnIhahqPgbbmazjpmQ96CroFa+XXQNbeZnnU3VegdeFikju/f/A=="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753528, 1);
               }
               break;
            case 120:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(910745886, 17);
               }
               break;
            case 121:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jx8MAgAnVRyTuYKQTkWuW6E/5+kzRBeY29B35Ve2"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(432730135, 31);
               }
               break;
            case 3355:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("hC2fBlZKYfvEeHbJ598hX4PBCTCcOrrpTdV+D8P8A+I="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1932460589, 13);
               }
               break;
            case 2987590:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("4TUru7GKNfDgG7iHwKY/vYQOjfheoFeN1zsp8U07D34HpHkQ"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911138974, 6);
               }
               break;
            case 2987591:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("NfWNRMDsBcn6MTzcn6+6TFWYR2P2KkU8NsYFuveOqH7UmiSQ"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139230, 4);
               }
               break;
            case 3530753:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("BlGpykbvf6ieBTFxdM3+cuLscsxqwQVohZq6VSXL3Nyy7i3A"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(936304926, 21);
               }
               break;
            case 3556653:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("h2jWbpfMoUWP9QnmhWO/Cq41uoLoK4LfztIr1xyBc0RT7LZL"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1715277802, 19);
               }
               break;
            case 100346066:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("8atMLw5KMfe+criadRzEBJt2VVePTthblacWaBvi+KjSSr1Cvi8="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753394, 3);
               }
               break;
            case 100358090:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("ec3DKoSV/FCweFVsAOQnloWl3FhEu2W+8DVlOzL9WaOoNCs0/QE="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1959496136, 3);
               }
               break;
            case 106426313:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Os/iaCGY7E9tex4Lz+6i1kYuUWMMxplHZNd8FXSuQp+SO/xnvxY="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1739919338, 22);
               }
               break;
            case 106426314:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("RzJFEpkbhpm2iJaHbTN3Fi3tBbeEDg8P1Fak4Q2vouisRXIyAzM="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1647644650, 23);
               }
               break;
            case 109413649:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("ElXYUcYbe+qD9X8LnuLEZvp+R/fDg2kAK945HtC/BgUuwHm984k="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1798639594, 24);
               }
               break;
            case 111972721:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("p9wyJ31BpR2fVfgZqWAjnuzibvJLfdYCD2VhsiVZGybC31UBWzE="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-859371339, 15);
               }
               break;
            case 113126854:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Fg6Wz5j5B+SyZz7GEm7f8gUnQpqwG+bWB5eqzqRrZlIqT5JnpRE="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1287164920, 7);
               }
               break;
            case 466743410:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("PtFHslL9MyGefd5UOSu1zxiaT0sHK9y4rSml+RTBdQOFOEElklHhZT/l"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(908517662, 19);
               }
               break;
            case 747804969:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IyYYanQ+rI74n596/IQPrh1KPugQnzCpMKBYGfidq/TQOhHkZ8hA57TLXZs="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-98379982, 25);
               }
               break;
            case 1101035227:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("J5SHBdvyo2NtQbcWqR1IA0I7zJa/50iOUmmUCkN7t1LiW1X/zofxV45I"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1648646886, 22);
               }
               break;
            case 1435972967:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("HBc4hEqCKHb2Zm5lt3E/NmytvmVj3xyV9bi2+Pq3FtgpYK2WGoE3VRNvzrhT958E"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714751978, 6);
               }
               break;
            case 1435972968:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("SJx1WvCCUD29Fwy4yLs8aUXtv9+uygsQEe68wzwwP1fx/lZqJZa6cbDzrOa0dA0C"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1716588522, 18);
               }
               break;
            case 1659526655:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("3/V4X401I5/rDK7W8Cl+GDOWiN7GQ0rT9B+2i6gQsPyortmgWNAJswWS89c="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(910983454, 13);
               }
               break;
            case 1926689611:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("YA8ce+2PEePa5wVNMbxFTTdB5UqXuJ6tcgRpSLX8Vkv2Kdp8QM/YWGa8"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753370, 3);
               }
               break;
            case 1926689612:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("W0QQKHr2dxFCuDCUrLPe9kUb9z7BAqYYgRJ73CJ3qLd/kuVR6ho5VfLE"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1287166712, 7);
               }
         }

         switch (var9) {
            case 0:
               return var1;
            case 1:
               return var6.hasElement(var5, var1);
            case 2:
               return Xqedii_2e6m2vk(var6.getElementText(var5, var1));
            case 3:
            case 4:
               double[] var20 = var6.getElementPosition(var5, var1);
               return var20 == null
                  ? null
                  : var20[var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21"))
                     ? Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1753147719, 20)
                     : Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(2031184793, 24)];
            case 5:
               double[] var19 = var6.getElementPosition(var5, var1);
               return var19 == null
                  ? null
                  : new ArrayList<>(
                     List.of(var19[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1956852800, 3)], var19[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 5)])
                  );
            case 6:
            case 7:
            case 8:
            case 9:
               double[] var18 = var6.getElementAbsolutePosition(var5, var1);
               return var18 == null
                  ? null
                  : var18[var7.endsWith(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21"))
                     ? Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1709196718, 18)
                     : Xqedii_yp12iz0.Xqedii_38076oheu1krt(911141150, 11)];
            case 10:
            case 11:
               double[] var17 = var6.getElementSize(var5, var1);
               return var17 == null
                  ? null
                  : var17[var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Fg6Wz5j5B+SyZz7GEm7f8gUnQpqwG+bWB5eqzqRrZlIqT5JnpRE="))
                     ? Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 5)
                     : Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-465195419, 26)];
            case 12:
               double[] var16 = var6.getElementSize(var5, var1);
               return var16 == null
                  ? null
                  : new ArrayList<>(
                     List.of(var16[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 20)], var16[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1581538022, 22)])
                  );
            case 13:
            case 14:
               return var6.isElementVisible(var5, var1);
            case 15:
               return Boolean.valueOf(
                  ((!var6.isElementVisible(var5, var1)
                     ? Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 6)
                     : Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 19)) != 0)
               );
            case 16:
               return var6.isElementDraggable(var5, var1);
            case 17:
               return var6.isHovering(var5, var1);
            case 18:
               String var15 = var6.getElementParent(var5, var1);
               return var15 != null && !var15.isEmpty() ? new Xqedii_11itj63(var15) : null;
            case 19:
               ArrayList var14 = new ArrayList();

               for (String var12 : var6.getElementChildren(var5, var1)) {
                  var14.add(new Xqedii_11itj63(var12));
               }

               return var14;
            case 20:
               return (double)var6.getElementIndex(var5, var1);
            case 21:
            case 22:
               return Xqedii_2e6m2vk(var6.getInputValue(var5, var1));
            case 23:
            case 24:
            case 25:
            case 26:
               double[] var10 = var6.getScroll(var5, var1);
               if (var10 == null) {
                  return Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_3acgm3uupz46n(5217635594261396602L, 46));
               }

               int var13 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1997630361, 24);
               switch (var7.hashCode()) {
                  case 1435972967:
                     if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("HBc4hEqCKHb2Zm5lt3E/NmytvmVj3xyV9bi2+Pq3FtgpYK2WGoE3VRNvzrhT958E"))) {
                        var13 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1556861067, 11);
                     }
                     break;
                  case 1926689611:
                     if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("YA8ce+2PEePa5wVNMbxFTTdB5UqXuJ6tcgRpSLX8Vkv2Kdp8QM/YWGa8"))) {
                        var13 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1577343718, 22);
                     }
                     break;
                  case 1926689612:
                     if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("W0QQKHr2dxFCuDCUrLPe9kUb9z7BAqYYgRJ73CJ3qLd/kuVR6ho5VfLE"))) {
                        var13 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 24);
                     }
               }
               int var11 = switch (var13) {
                  case 0 -> Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 10);
                  case 1 -> Xqedii_yp12iz0.Xqedii_38076oheu1krt(642703646, 28);
                  case 2 -> Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(291933904, 0);
                  default -> Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139294, 6);
               };
               return var10[var11];
            default:
               return Xqedii_207muaz(var6.getElementValue(var5, var1, var2));
         }
      }
   }

   public static void Xqedii_3j2drjj(Xqedii_y5pr2ec var0, String var1, String var2, Object var3, int var4) {
      if ((1860133881 * 1860133881 - 1860133881 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1yqm9k3 var5 = var0.Xqedii_3a9kp91;
         Player var6 = var5.Xqedii_25ge4f1(var4);
         String var7 = var2.toLowerCase(Locale.ROOT);
         if (Xqedii_2awqdkk.Xqedii_1wy8z23.contains(var7)) {
            String[] var10002 = new String[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 13)];
            var10002[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1198065843, 15)] = var7;
            Xqedii_1qsxv8z(var5, var1, var10002);
         } else if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IyYYanQ+rI74n596/IQPrh1KPugQnzCpMKBYGfidq/TQOhHkZ8hA57TLXZs="))) {
            String[] var20 = new String[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1712656362, 21)];
            var20[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 16)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21");
            var20[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-876049572, 19)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jx8MAgAnVRyTuYKQTkWuW6E/5+kzRBeY29B35Ve2");
            Xqedii_1qsxv8z(var5, var1, var20);
         } else if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("BlGpykbvf6ieBTFxdM3+cuLscsxqwQVohZq6VSXL3Nyy7i3A"))) {
            String[] var21 = new String[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714751466, 11)];
            var21[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-430046118, 14)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
               "Fg6Wz5j5B+SyZz7GEm7f8gUnQpqwG+bWB5eqzqRrZlIqT5JnpRE="
            );
            var21[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 14)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
               "nzZebb9xumLu/XMXKdRa6YvPhxDNhvO/OF2Yj3wUoZj79kT31YZrKA=="
            );
            Xqedii_1qsxv8z(var5, var1, var21);
         }

         int var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(-911139103, 2);
         switch (var7.hashCode()) {
            case -1267206133:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("diToJO5NEaFto1zr1BB0PJZKtY0pcthKUnxOYBru3W3AEtHR0gYUWMh+"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911122718, 11);
               }
               break;
            case -1221029593:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("nzZebb9xumLu/XMXKdRa6YvPhxDNhvO/OF2Yj3wUoZj79kT31YZrKA=="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-873952420, 19);
               }
               break;
            case -1217487446:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("1/B9iN0GzaZ7+joI7QebjxGUBDlcScbDw6PpOPIj6tl8kNbPO77bgA=="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139486, 6);
               }
               break;
            case -304480883:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("LgD4QrYfNvrAnIhahqPgbbmazjpmQ96CroFa+XXQNbeZnnU3VegdeFikju/f/A=="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(898556190, 22);
               }
               break;
            case -40300674:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("YhOiI8fG1ozMw6kWLzXBOZf4dRyc3EO8VvTLehLL7TGvOhru4fDGNSU0QAE="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-2001516691, 31);
               }
               break;
            case 120:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(762523458, 5);
               }
               break;
            case 121:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jx8MAgAnVRyTuYKQTkWuW6E/5+kzRBeY29B35Ve2"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(2064739225, 24);
               }
               break;
            case 3242771:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("BjmG/6ylGhDJBZaVbc1Kz1RYNTJP+6iXYiM0pJWqPothKiR8"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911128862, 11);
               }
               break;
            case 3530753:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("BlGpykbvf6ieBTFxdM3+cuLscsxqwQVohZq6VSXL3Nyy7i3A"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1956852744, 3);
               }
               break;
            case 3556653:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("h2jWbpfMoUWP9QnmhWO/Cq41uoLoK4LfztIr1xyBc0RT7LZL"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1548450727, 14);
               }
               break;
            case 94842723:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IImnEqUwJJlnYCH1LqIWHEFRkD+HaiBYMADnbhUpCIihU56PeRw="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 31);
               }
               break;
            case 100358090:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("ec3DKoSV/FCweFVsAOQnloWl3FhEu2W+8DVlOzL9WaOoNCs0/QE="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1765085162, 24);
               }
               break;
            case 102749521:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("OzqrGWzvW2nJphuaub2YSnolwWJvhmXhY1bsm8l7p5QaZ0WiCk8="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1898442394, 16);
               }
               break;
            case 109413649:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("ElXYUcYbe+qD9X8LnuLEZvp+R/fDg2kAK945HtC/BgUuwHm984k="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1167735676, 2);
               }
               break;
            case 111972721:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("p9wyJ31BpR2fVfgZqWAjnuzibvJLfdYCD2VhsiVZGybC31UBWzE="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1369037755, 10);
               }
               break;
            case 113126854:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Fg6Wz5j5B+SyZz7GEm7f8gUnQpqwG+bWB5eqzqRrZlIqT5JnpRE="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139134, 3);
               }
               break;
            case 466743410:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("PtFHslL9MyGefd5UOSu1zxiaT0sHK9y4rSml+RTBdQOFOEElklHhZT/l"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-259312522, 27);
               }
               break;
            case 747804969:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IyYYanQ+rI74n596/IQPrh1KPugQnzCpMKBYGfidq/TQOhHkZ8hA57TLXZs="))) {
                  var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1932509741, 13);
               }
               break;
            case 1926689611:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("YA8ce+2PEePa5wVNMbxFTTdB5UqXuJ6tcgRpSLX8Vkv2Kdp8QM/YWGa8"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(-1504780002, 27);
               }
               break;
            case 1926689612:
               if (var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("W0QQKHr2dxFCuDCUrLPe9kUb9z7BAqYYgRJ73CJ3qLd/kuVR6ho5VfLE"))) {
                  var9 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714757098, 8);
               }
         }

         switch (var9) {
            case 0:
               var5.Xqedii_x5301uw(UiElementWrite.text(var1, Xqedii_z4wg071.Xqedii_2mlipa7(var3)));
               break;
            case 1:
               var5.Xqedii_x5301uw(UiElementWrite.color(var1, Xqedii_z4wg071.Xqedii_2mlipa7(var3)));
               break;
            case 2:
            case 3:
            case 4:
            case 5:
               var5.Xqedii_x5301uw(new UiElementWrite(var1, var7, Xqedii_z4wg071.Xqedii_3c9epia(var3, var4), null));
               break;
            case 6:
               double[] var19 = Xqedii_1qq2p2k(var3, var4);
               var5.Xqedii_x5301uw(
                  UiElementWrite.position(
                     var1, var19[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-633197359, 21)], var19[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 25)]
                  )
               );
               break;
            case 7:
               double[] var18 = Xqedii_1qq2p2k(var3, var4);
               var5.Xqedii_x5301uw(
                  UiElementWrite.size(var1, var18[Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 30)], var18[Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139100, 1)])
               );
               break;
            case 8:
               var5.Xqedii_x5301uw(
                  UiElementWrite.value(
                     var1,
                     Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("diToJO5NEaFto1zr1BB0PJZKtY0pcthKUnxOYBru3W3AEtHR0gYUWMh+"),
                     (int)Math.max(
                        Xqedii_yp12iz0.Xqedii_1hdn7q9m99fqg(8439045491827999362L, 45),
                        Math.min(Xqedii_yp12iz0.Xqedii_uq8eyn3tpt3o(-4397091117646770195L, 13), Math.round(Xqedii_z4wg071.Xqedii_3c9epia(var3, var4)))
                     )
                  )
               );
               break;
            case 9:
            case 10:
               var5.Xqedii_x5301uw(UiElementWrite.value(var1, var7, Xqedii_z4wg071.Xqedii_3c9epia(var3, var4)));
               break;
            case 11:
               var5.Xqedii_3u9m9cl();
               api(var4).setElementItem(var6, var1, Xqedii_z4wg071.Xqedii_2mlipa7(var3));
               break;
            case 12:
            case 13:
            case 14:
               var5.Xqedii_3u9m9cl();
               int var17 = Xqedii_z4wg071.Xqedii_2od1ceu(var3)
                     != var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("1/B9iN0GzaZ7+joI7QebjxGUBDlcScbDw6PpOPIj6tl8kNbPO77bgA=="))
                  ? Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-930390837, 27)
                  : Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(788671859, 21);
               api(var4).setElementVisible(var6, var1, (var17 != 0));
               break;
            case 15:
               var5.Xqedii_3u9m9cl();
               api(var4).setElementDraggable(var6, var1, Xqedii_z4wg071.Xqedii_2od1ceu(var3));
               break;
            case 16:
            case 17:
               var5.Xqedii_3u9m9cl();
               api(var4).setInputValue(var6, var1, Xqedii_z4wg071.Xqedii_2mlipa7(var3));
               break;
            case 18:
            case 19:
               var5.Xqedii_3u9m9cl();
               double[] var10 = api(var4).getScroll(var6, var1);
               double var11 = Xqedii_z4wg071.Xqedii_3c9epia(var3, var4);
               double var13 = var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("YA8ce+2PEePa5wVNMbxFTTdB5UqXuJ6tcgRpSLX8Vkv2Kdp8QM/YWGa8"))
                  ? var11
                  : (
                     var10 == null
                        ? Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_1hdn7q9m99fqg(-1568653090053552892L, 46))
                        : var10[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1169057248, 2)]
                  );
               double var15 = var7.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("W0QQKHr2dxFCuDCUrLPe9kUb9z7BAqYYgRJ73CJ3qLd/kuVR6ho5VfLE"))
                  ? var11
                  : (
                     var10 == null
                        ? Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_3acgm3uupz46n(5217635594261396602L, 7))
                        : var10[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1507668707, 25)]
                  );
               api(var4).setScroll(var6, var1, var13, var15);
               break;
            default:
               var5.Xqedii_x5301uw(UiElementWrite.value(var1, var2, Xqedii_tydjfwf(var3)));
         }
      }
   }

   public static Object Xqedii_tydjfwf(Object var0) {
      if ((305612696 * 305612696 - 305612696 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var0 instanceof Double var1
               && var1 == Math.rint(var1)
               && Math.abs(var1) < Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_8sy2u3uh2ey7(-1844358667809427107L, 46))
            ? (int)Math.round(var1)
            : Xqedii_z4wg071.Xqedii_3ujolw5(var0);
      }
   }

   public static double[] Xqedii_1qq2p2k(Object var0, int var1) {
      if ((1124307846 * (1124307846 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 instanceof List var2 && var2.size() >= Xqedii_yp12iz0.Xqedii_38076oheu1krt(642703646, 27)) {
         double[] var10000 = new double[Xqedii_yp12iz0.Xqedii_38076oheu1krt(911204638, 15)];
         var10000[Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 29)] = Xqedii_z4wg071.Xqedii_3c9epia(
            var2.get(Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(146132156, 31)), var1
         );
         var10000[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1860781673, 28)] = Xqedii_z4wg071.Xqedii_3c9epia(
            var2.get(Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-430029734, 14)), var1
         );
         return var10000;
      } else {
         throw new Xqedii_3vsk7zm(Xqedii_3eufpwv72dpmh(Xqedii_z4wg071.Xqedii_yl2qf35(var0)), var1);
      }
   }

   public static Object Xqedii_200p8tk(Xqedii_y5pr2ec var0, String var1, String var2, Object[] var3, int var4) {
      if (((1015574014 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1yqm9k3 var5 = var0.Xqedii_3a9kp91;
         int var7 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-500337874, 29);
         switch (var2.hashCode()) {
            case -1335458389:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("XYUM+tWTfdvIajYSamakbF5WiTGdcoonZRmH+6mb93y24/8ecCP7pQ=="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-429882278, 14);
               }
               break;
            case -1068263448:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("YFKMALqgIwTusNMFC50T6lLi4PNy90ksELLtfPG+BSiP853bu6nL/Q=="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(1716445470, 28);
               }
               break;
            case -1068262900:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("RzN3u6eNevy+Suiq9BNM6Yapt7xL/UWUNo91hF2CLXqq7mIps/S2Lg=="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1181236970, 12);
               }
               break;
            case -934610812:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("pJGtsxrQjGVfz9kF1KeOoS/G5FdoEQRTlfOtdx9zH60tjmHwM55fdQ=="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139095, 0);
               }
               break;
            case -934437708:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("F3j5eX+qGnbWSpQbSkTos0o/P0Y6oqH9q3JAKFEywM2DZEAYIVzvGQ=="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753466, 4);
               }
               break;
            case -868304044:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("UHw5qUbKu2yrZZGWx/Twfk41WD1yNkV48nuWyjSiocOkv7rkYgL5jQ=="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1181245162, 12);
               }
               break;
            case -402164764:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("1N/2f+4FzZPilMLR/C7jin7DYDm+jdYX3ny3yDBdMNkctHC6j2fqsxlnYlk="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911141406, 8);
               }
               break;
            case -402164216:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("MWPRKGiW/vb300gV8vf+Bmjn6W5LJXjqdBBnQr9OD7ZgdqOPLtrrL0t4qos="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1760420118, 12);
               }
               break;
            case -86611405:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("KXf+gyVG2Z9HxszLaAi4QIEwh2T+4xerZBpf49dr6pE3ynsHJGwCErPo96LGgFiHLuBXjd4rg1M="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1167735664, 2);
               }
               break;
            case 102230:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("HpPCfIJTyfKiezG7k/NN1gvaf7+1CHzXONCtwkYODXcP4A=="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-989284916, 23);
               }
               break;
            case 113762:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("sGPrO85c06yrwnosyznaUAudksBZwplVyW4I7vPpFPgpDA=="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(608546406, 26);
               }
               break;
            case 3202370:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("bcukKUdVuS2z0xSAmEqazAi4tgMUJxnY8oa1Kf2egWFw55Ty"))) {
                  var7 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1581538022, 22);
               }
               break;
            case 3357649:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("F1PPWr+SmMNyMCSxSad/aMHMxGAyMRxk4Rl7fcQChKWSFBlL"))) {
                  var7 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714751466, 10);
               }
               break;
            case 3529469:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("8oO+O/xXNaXBYrhZZsL9OK9jOAPn8/FV6Adym453CYEEBJjK"))) {
                  var7 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(555116781, 28);
               }
               break;
            case 94750088:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("TW4Ql/ENRADs1zyWL3W/cds4kSzfvytQRPyRqS0865yDk1q5vqk="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1715015658, 17);
               }
               break;
            case 94756189:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("KCeYFUTbkrhjd1/neWbBkJb1olyWZ/qYaOgXr741SB+ILFU6K94="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1110233563, 29);
               }
               break;
            case 97604824:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("6IqW6uupmSERL02koiYRxt59fhI3F0/9EA7BFIOI3X72dDVuCro="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(822226291, 21);
               }
               break;
            case 1555402688:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("/HscSsrQAXyXUSzGjhaayFYD7xyyx3C2TvdMZVpRV2cOZCghWuBohRDZ8XF1Tg=="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(2043342870, 28);
               }
               break;
            case 2084712013:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("pNeFKAA5sjbghSbP7l5HN8vjrOYhO0cVRQmqSlPiCE0FAChPelDDvftaXdgJUv1W/fg="))) {
                  var7 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(1582227742, 27);
               }
         }

         switch (var7) {
            case 0:
               int var13 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1279629883, 26);
               Object[] var19 = new Object[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-684527070, 9)];
               var19[Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 30)] = var1;
               Xqedii_37nn7q1(var0, var13, var19, var4);
               break;
            case 1:
               int var12 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(145966952, 31);
               Object[] var18 = new Object[Xqedii_yp12iz0.Xqedii_38076oheu1krt(374268190, 29)];
               var18[Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 23)] = var1;
               Xqedii_37nn7q1(var0, var12, var18, var4);
               break;
            case 2:
               int var11 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714687978, 15);
               Object[] var17 = new Object[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1169057252, 2)];
               var17[Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 16)] = var1;
               Xqedii_37nn7q1(var0, var11, var17, var4);
               break;
            case 3:
            case 4:
               Xqedii_37nn7q1(var0, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911143198, 10), Xqedii_4a5wk96(var1, var3), var4);
               break;
            case 5:
               Xqedii_37nn7q1(var0, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139742, 7), Xqedii_4a5wk96(var1, var3), var4);
               break;
            case 6:
               Xqedii_37nn7q1(var0, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-684524510, 9), Xqedii_4a5wk96(var1, var3), var4);
               break;
            case 7:
               int var10 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753536, 0);
               Object[] var16 = new Object[Xqedii_yp12iz0.Xqedii_38076oheu1krt(910614814, 19)];
               var16[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1110233562, 29)] = var1;
               Xqedii_37nn7q1(var0, var10, var16, var4);
               break;
            case 8:
               Xqedii_37nn7q1(var0, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1005492594, 24), Xqedii_4a5wk96(var1, var3), var4);
               break;
            case 9:
            case 10:
               Xqedii_1rx201x(var0, var1, var4);
               break;
            case 11:
               Xqedii_37nn7q1(var0, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(18245868, 28), Xqedii_4a5wk96(var1, var3), var4);
               break;
            case 12:
               if (var3.length == Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1525046852, 6)) {
                  Xqedii_37nn7q1(var0, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(858530519, 17), Xqedii_4a5wk96(var1, var3), var4);
               } else {
                  Xqedii_37nn7q1(var0, Xqedii_yp12iz0.Xqedii_38076oheu1krt(-1370562274, 27), Xqedii_4a5wk96(var1, var3), var4);
               }
               break;
            case 13:
               int var9 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1945015399, 24);
               Object[] var15 = new Object[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1548434343, 14)];
               var15[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 9)] = var1;
               Xqedii_37nn7q1(var0, var9, var15, var4);
               break;
            case 14:
               int var8 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-2001351482, 31);
               Object[] var14 = new Object[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 30)];
               var14[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(291933906, 0)] = var1;
               Xqedii_37nn7q1(var0, var8, var14, var4);
               break;
            case 15:
            case 16:
               int var10001 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753258, 4);
               Object[] var10002 = new Object[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(994854298, 18)];
               var10002[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1869925258, 27)] = var1;
               Xqedii_37nn7q1(var0, var10001, var10002, var4);
               break;
            case 17:
               Xqedii_3j2drjj(
                  var0,
                  var1,
                  Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1369055163, 10), var4)),
                  var3.length > Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1000758348, 30) ? var3[Xqedii_yp12iz0.Xqedii_38076oheu1krt(-1236344546, 31)] : null,
                  var4
               );
               break;
            case 18:
               return Xqedii_1javj6e(
                  var0, var1, Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(994592154, 18), var4)), var4
               );
            default:
               throw new Xqedii_3vsk7zm(Xqedii_cphtb7fherrv(var2), var4);
         }

         var5.Xqedii_3u9m9cl();
         return null;
      }
   }

   public static Object Xqedii_2q74yw2(Xqedii_y5pr2ec var0, String var1, String var2, Object[] var3, int var4) {
      if (((89728126 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         int var6 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1731530729, 24);
         switch (var2.hashCode()) {
            case -1765638420:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("7rZ9me9dmNbBOVtZMyhU+dtQs9H3zjTDrEg/ZMWCJe2U16FCSrLL5BWmoGfXgrv8"))) {
                  var6 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(915333406, 20);
               }
               break;
            case -1554585449:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Ce8+uwkTeMtwsSfaRvUdc0jwMOywNgCu9ju5syj8Qlp/GbGAtuba2e8C5QMUSxog"))) {
                  var6 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-703502706, 24);
               }
               break;
            case -1034364087:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("SoXnGaiXjScpjlrtJy+6rsMiGf21mviXsOwvF8uC7rlhkEchPd23pQ=="))) {
                  var6 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1716850666, 19);
               }
               break;
            case -1003167356:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("LHjtPDuWfmL+3tc5EyUxGMveQX2dfH7Pv/cB3hJjFzCD2Owe8JeuLLNCqIc="))) {
                  var6 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(1179574558, 27);
               }
               break;
            case -934531685:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("ycj0UyV4D5rb32FvpoyK3EQ2PBHz2uHcu4xytdON6YwB9E0o6PS1zg=="))) {
                  var6 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(102946611, 25);
               }
               break;
            case -567445985:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("5+67wTIcnVDOwdfUTHyheleiPgjEnNvr24nZ2uFseFABSswW8QwIovOp8Qw="))) {
                  var6 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(894361886, 24);
               }
               break;
            case 3568674:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("HSHGfeDbZ8ff5xWVM29sbdiNfGdXMVVGLM0sqxNinKKyyxmc"))) {
                  var6 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753518, 2);
               }
               break;
            case 103164673:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("t6wsaNHQgCQQwcT4ys/SeaFRPk2Zb3nN+qgDyidWl+LUnPOJuyE="))) {
                  var6 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911204638, 16);
               }
               break;
            case 109526418:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("iW4iclpUw2VlH3+zFzxSIDTPl9ddybl/CQyU6iB2x6AZn2IEHXs="))) {
                  var6 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1805222161, 8);
               }
               break;
            case 109648666:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("qR8t/VcSjHP01HnCrN9cDaAdOUv22pYNX2j0XNPwAy+/6jaZ0n0="))) {
                  var6 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1503900996, 6);
               }
               break;
            case 111499426:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("i0jwj5bkXluu3EqMV68X6xRcj2Xok43meSkIAvgzSbZaGkTRc6Y="))) {
                  var6 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 22);
               }
               break;
            case 530542161:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("0PC/H5NozalL37oStk5Ecr7ctORagkyYHffTrQyDHKUuanpdkMjK6R8CkmtvDQ=="))) {
                  var6 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(4566630, 26);
               }
               break;
            case 1094496948:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("FlEkcLny2eYlUt001YdX1vyIU/id04CQFwWn8J8zBn8xg5b5/+sFxi54"))) {
                  var6 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1346738747, 26);
               }
               break;
            case 1744111550:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("g0nTDxKlFyJKqU2IdmQ+vlHnGGYKB7/k96YowU3vfz5e35EtRkbpnOirygQ="))) {
                  var6 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139099, 0);
               }
               break;
            case 1943292457:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("/oOli8GWJEsktlETWRrAq14fphT5bVLvDo6fIShbFP9Vw7LeVGxBG+Ul"))) {
                  var6 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1805222417, 8);
               }
         }

         switch (var6) {
            case 0:
               return var1.toUpperCase(Locale.ROOT);
            case 1:
               return var1.toLowerCase(Locale.ROOT);
            case 2:
               return var1.trim();
            case 3:
               return var1.toLowerCase(Locale.ROOT)
                  .contains(
                     Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 24), var4)).toLowerCase(Locale.ROOT)
                  );
            case 4:
               return var1.toLowerCase(Locale.ROOT)
                  .startsWith(
                     Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 23), var4)).toLowerCase(Locale.ROOT)
                  );
            case 5:
               return var1.toLowerCase(Locale.ROOT)
                  .endsWith(
                     Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 5), var4)).toLowerCase(Locale.ROOT)
                  );
            case 6:
               return var1.replace(
                  Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1753147719, 20), var4)),
                  Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_38076oheu1krt(1045356830, 27), var4))
               );
            case 7:
               String var13 = var3.length > 0
                  ? Xqedii_z4wg071.Xqedii_2mlipa7(var3[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 10)])
                  : Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("OC10pIpa7gCIafsMYxU0jvmJ+kk3xdala+Lam1J/");
               ArrayList var14 = new ArrayList();
               String[] var9 = var1.split(Pattern.quote(var13), Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753505, 3));
               int var10 = var9.length;

               for (int var11 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(497296077, 17); var11 < var10; var11++) {
                  String var12 = var9[var11];
                  var14.add(var12);
               }

               return var14;
            case 8:
            case 9:
               int var7 = Xqedii_uza1kxc(
                  Xqedii_z4wg071.Xqedii_1x518al(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 26), var4), var4), var1.length()
               );
               int var8 = var3.length > Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 31)
                  ? Xqedii_uza1kxc(Xqedii_z4wg071.Xqedii_1x518al(var3[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-876049572, 19)], var4), var1.length())
                  : var1.length();
               return var8 <= var7 ? Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("tDZDvNax8keQcXDRvxlPTRR08puTeeq6Iz33yw==") : var1.substring(var7, var8);
            case 10:
               return (double)var1.indexOf(Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-860092235, 15), var4)));
            case 11:
               return var1.repeat(
                  Math.max(
                     Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1110233562, 29),
                     Xqedii_z4wg071.Xqedii_1x518al(Xqedii_1k661t2(var3, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 12), var4), var4)
                  )
               );
            case 12:
               return var1.isEmpty()
                  ? var1
                  : Xqedii_3177aa0o9dmnd(
                     var1.substring(Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1956852800, 3), Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 5))
                        .toUpperCase(Locale.ROOT),
                     var1.substring(Xqedii_yp12iz0.Xqedii_38076oheu1krt(913236254, 21))
                  );
            case 13:
            case 14:
               return Xqedii_z4wg071.Xqedii_3c9epia(var1, var4);
            default:
               return Xqedii_200p8tk(var0, var1, var2, var3, var4);
         }
      }
   }

   public static int Xqedii_uza1kxc(int var0, int var1) {
      if ((1646768816 * 1646768816 - 1646768816 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var2 = var0 < 0 ? var1 + var0 : var0;
         return Math.max(Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 19), Math.min(var1, var2));
      }
   }

   public static Object Xqedii_306mg5g(List<Object> var0, String var1, Object[] var2, int var3) {
      if ((-493345853 * (-493345853 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(762523362, 5);
         switch (var1.hashCode()) {
            case -1183792455:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("iWqS7Hwj37MIrG7NSu8h/nqB24Rsq2wj/2YIN1aiiznZ2bAztfrVEA=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714757610, 12);
               }
               break;
            case -938285885:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("TKDz0cpwRt1Xm91VFy3yZ8WqT0Kr1uktnt9RJzy2qyaNytbpsgIbMQ=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1805222673, 8);
               }
               break;
            case -934610812:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("pJGtsxrQjGVfz9kF1KeOoS/G5FdoEQRTlfOtdx9zH60tjmHwM55fdQ=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(762523490, 5);
               }
               break;
            case -567445985:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("5+67wTIcnVDOwdfUTHyheleiPgjEnNvr24nZ2uFseFABSswW8QwIovOp8Qw="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753508, 1);
               }
               break;
            case -512822345:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("0OMTqandZCNXRSvQw3aXtt1y78DxB4ShBXDYgyTVzxKa5qmdc9r5a12NkUg="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1407005411, 25);
               }
               break;
            case 96417:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("OrlYE+tEn03xdO9s4PTLxO6XGGQOwbPca6CDGYq09CXojw=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 29);
               }
               break;
            case 102230:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("HpPCfIJTyfKiezG7k/NN1gvaf7+1CHzXONCtwkYODXcP4A=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753386, 4);
               }
               break;
            case 103066:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("yCnFHNZtjPD4qa1uCISPaTzJpt3iT8qhqM+a7+jIdnpRcQ=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(855515863, 17);
               }
               break;
            case 111185:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Xtu7haJmr1LSGE8dlE6rjvUp/Xfppxi8h2UtOlt+qJCdpQ=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1932501549, 13);
               }
               break;
            case 114251:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("kgZq5qDWAb/MjZmc1qnhEyUbCFrXuUqOG6/1SoAOwtlIeA=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-332327320, 20);
               }
               break;
            case 3059573:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("vyWw9fqK0q+UETOjTBI/9VAqAqMsdaUqD/poYH6PgF0fLluj"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1932567085, 13);
               }
               break;
            case 3267882:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("8Lykbzioo070PWCvndBYcC0T2Zn51ETU2QQwXWovs3LaFVSP"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-684522462, 9);
               }
               break;
            case 3452698:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("A3pxr7w77xGR7qSQPAkBKEXTC9H3ildieN1MCKPfOzXwAFK2"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 2);
               }
               break;
            case 3536286:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("t2Hah3lefJ60tE7TURopKy76q3pUor/3RBNhJ3HZSY60UApP"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911024414, 14);
               }
               break;
            case 94746189:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("fx5NoOPdK6MYawMrTA8D6WjjNTlqaRzDbWHPjW7EW9vDg5MQnIA="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(546004172, 27);
               }
               break;
            case 109526418:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("iW4iclpUw2VlH3+zFzxSIDTPl9ddybl/CQyU6iB2x6AZn2IEHXs="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1883609659, 26);
               }
               break;
            case 1099846370:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("FbNquh0BPC3FTr7Zr5IDsGE7ff97FmFwuuZgQwVWsK3qkvV6kt2SD8eE"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(584528656, 1);
               }
               break;
            case 1943292457:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("/oOli8GWJEsktlETWRrAq14fphT5bVLvDo6fIShbFP9Vw7LeVGxBG+Ul"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714782186, 12);
               }
               break;
            case 2072332025:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Sny4mgaeZisoqjMa0oB31Jz1OaxaVL7seUF03AqZH+DkBNYTWHZezqdx"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714692074, 12);
               }
         }

         switch (var5) {
            case 0:
            case 1:
               Collections.addAll(var0, var2);
               return null;
            case 2:
               var0.add(
                  Xqedii_uza1kxc(
                     Xqedii_z4wg071.Xqedii_1x518al(Xqedii_1k661t2(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(291933906, 0), var3), var3), var0.size()
                  ),
                  Xqedii_1k661t2(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911130910, 13), var3)
               );
               return null;
            case 3:
               Object var13 = Xqedii_1k661t2(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 30), var3);

               for (int var17 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 20); var17 < var0.size(); var17++) {
                  if (Xqedii_z4wg071.Xqedii_zxgkysn(var0.get(var17), var13)) {
                     return var0.remove(var17);
                  }
               }

               return null;
            case 4:
               int var12 = Xqedii_uza1kxc(
                  Xqedii_z4wg071.Xqedii_1x518al(Xqedii_1k661t2(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(2014407577, 24), var3), var3), var0.size()
               );
               return var12 < var0.size() ? var0.remove(var12) : null;
            case 5:
               return var0.isEmpty() ? null : var0.remove(var0.size() - Xqedii_yp12iz0.Xqedii_38076oheu1krt(911141150, 11));
            case 6:
            case 7:
               return Xqedii_z4wg071.Xqedii_1lmv6tt(var0, Xqedii_1k661t2(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1212521019, 26), var3));
            case 8:
               Object var11 = Xqedii_1k661t2(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 30), var3);

               for (int var16 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(584528624, 1); var16 < var0.size(); var16++) {
                  if (Xqedii_z4wg071.Xqedii_zxgkysn(var0.get(var16), var11)) {
                     return (double)var16;
                  }
               }

               return Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_1hdn7q9m99fqg(5666570002367029328L, 42));
            case 9:
               int var10 = Xqedii_z4wg071.Xqedii_1x518al(Xqedii_1k661t2(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1548450727, 14), var3), var3);
               int var15 = var10 < 0 ? var0.size() + var10 : var10;
               return var15 >= 0 && var15 < var0.size() ? var0.get(var15) : null;
            case 10:
               String var9 = var2.length > 0
                  ? Xqedii_z4wg071.Xqedii_2mlipa7(var2[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(788671859, 21)])
                  : Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("eC1P3Gm7W5fg67hUvGqd6YeBOC0/BfjdAYz6ADeM1AA=");
               StringBuilder var14 = new StringBuilder();

               for (int var8 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(292264312, 0); var8 < var0.size(); var8++) {
                  if (var8 > 0) {
                     var14.append(var9);
                  }

                  var14.append(Xqedii_z4wg071.Xqedii_2mlipa7(var0.get(var8)));
               }

               return var14.toString();
            case 11:
               return var0.isEmpty() ? null : var0.get(ThreadLocalRandom.current().nextInt(var0.size()));
            case 12:
               var0.clear();
               return null;
            case 13:
               return new ArrayList(var0);
            case 14:
               int var6 = Xqedii_uza1kxc(
                  Xqedii_z4wg071.Xqedii_1x518al(Xqedii_1k661t2(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 8), var3), var3), var0.size()
               );
               int var7 = var2.length > Xqedii_yp12iz0.Xqedii_38076oheu1krt(911141150, 11)
                  ? Xqedii_uza1kxc(Xqedii_z4wg071.Xqedii_1x518al(var2[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1167735628, 2)], var3), var0.size())
                  : var0.size();
               return var7 <= var6 ? new ArrayList() : new ArrayList(var0.subList(var6, var7));
            case 15:
            case 16:
            case 17:
            case 18:
               Object[] var10002 = new Object[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 18)];
               var10002[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 20)] = var0;
               return Xqedii_1iw7g71.Xqedii_2xeqrwc(null, var1, var10002, var3);
            default:
               throw new Xqedii_3vsk7zm(Xqedii_2fymnobm4f2w3(var1), var3);
         }
      }
   }

   public static Object Xqedii_266bjwx(Xqedii_y5pr2ec var0, Player var1, String var2, int var3) {
      if ((-1460999374 * (-1460999374 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753515, 1);
         switch (var2.hashCode()) {
            case -1768407915:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("3z9m50AKmV8jXAOODzh2fXKzFjO0u8Q90dpHmZPW6VjyNXUp/3pyL9VSSi8="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1574120997, 29);
               }
               break;
            case -1271344497:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Xy3ZZu1+m9X8lYbAjvF8o/89nQQN0H4LsFHxG3yKE78cgH/Yk2pRuA=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(608546406, 26);
               }
               break;
            case -1221262756:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Iup0jETbqVh5rIAwDWLfHJoSFNWXc3u67rzfNrAAsmjebeMofRkkig=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753482, 4);
               }
               break;
            case -1206104397:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("DdeEnwBk2E9pvnRXDvIVjB8YhEhw0XtqjkVGx7ZUubDoqimCw4mtGw=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714884586, 15);
               }
               break;
            case -1012222381:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("hcHSQBWiakZKyZhKVHUmWzKFSe9OO8hDB5YPk19+llYvpBZm3SRNXQ=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1956852640, 3);
               }
               break;
            case 120:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(873390366, 22);
               }
               break;
            case 121:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jx8MAgAnVRyTuYKQTkWuW6E/5+kzRBeY29B35Ve2"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(145966956, 31);
               }
               break;
            case 122:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("hshVAPtrvAg+FpxEb2BBc+Z520kJ1zbHL6zLkRV+"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1992854324, 19);
               }
               break;
            case 3553:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("/mDOSrJnZ6JuFKAF3Xgpb1Ag+xMBbdO1UqdN58Dhqfs="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(541437542, 26);
               }
               break;
            case 3732:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("aC6En86ANZ2bYCDnfBBWUtbDEHJBFBtZBWgOQ/6ykFE="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1351300214, 27);
               }
               break;
            case 3832:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("R/pDjtVVINVYJbCLHUaCuhNzavd7V/Hp8FMm8ffOrfU="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-853691358, 9);
               }
               break;
            case 100893:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("04M9CKWzSD9indqEdsJUpaZAL4/5gHyfaABixEEFrmjvTw=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-104140778, 28);
               }
               break;
            case 119407:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("APnm84fdCdY/i6LPCrKnkIR7OLWDGHq5IuRatgqii4wwCA=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1506471956, 30);
               }
               break;
            case 3076010:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("79BhZgEOQfGKuwsjFMkvxfMMAnQ7wvlfHjPFYbi87bW1/DDX"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1805225233, 8);
               }
               break;
            case 3148894:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("+HZcp+5kgWTAjcE5/y9Ktuws9Z3sch4GAiOTP+4+Nj8idmhj"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911140126, 8);
               }
               break;
            case 3373707:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("wTZjo8bk01Up7+rAL+PX2WY+AUcje0Y4T+MUafqmN8rjlVZ/"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-876573860, 19);
               }
               break;
            case 3433103:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("3TqKqF0bK36EKEz9RXELH3gVtvBQLLn90WZAT0rLvm5Pt8uT"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-864515236, 19);
               }
               break;
            case 3556308:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("oetMU/eMubflKY1WUU/yMuT2EQRW+khyAFnNJWjxU8zZ8R16"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911133982, 9);
               }
               break;
            case 3601339:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("O4a/4QzSRdKQ5vRx61hwrQJLtSppXGAjFmNPcwJsWP5VGHHl"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(1984880926, 30);
               }
               break;
            case 102865796:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("hT+3+mVcgN2oLHAfS8yLDrCg9eztoj3C1m757SohKrUKOUYKy98="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911663390, 18);
               }
               break;
            case 106677056:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("NmohmXB95w/Rj+S1EQvFcdp4sIN0FbvFgE5LmLmpHqk+oI/kP0M="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1707377595, 10);
               }
               break;
            case 113318802:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("7P+jEBn+p/y5W2LrWS0xkTw47VPuSWWqH4CNew58MnZ6ANjmaYo="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(145966958, 31);
               }
               break;
            case 385300558:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("C0dv+pXe80p1PLL7rzen+1tm6qjoyIcdFaX7Vhq4nvjKiWOQ5HmoUHEbfhI="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1707409339, 10);
               }
               break;
            case 1429809032:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("K6qJM1aRRh4cVh4jdW8MJnr2rOVO3NywuEBYOhpc2P4HB5oe/ohrqEAi9aBDTA=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1619571527, 23);
               }
               break;
            case 1715102285:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2lKIzNM0epaxqx5PB+ReNOJpNMHuHgQgP5mFLVBksWyae+iO5BdkTp9/BuNOFBWtiyM="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1548483495, 14);
               }
         }

         switch (var5) {
            case 0:
               return var1.getName();
            case 1:
               return var1.getUniqueId().toString();
            case 2:
               return var1.getDisplayName();
            case 3:
               return var1.getHealth();
            case 4:
            case 5:
               return (double)var1.getFoodLevel();
            case 6:
               return (double)var1.getLevel();
            case 7:
            case 8:
               return (double)var1.getExp();
            case 9:
               return var1.getLocation().getX();
            case 10:
               return var1.getLocation().getY();
            case 11:
               return var1.getLocation().getZ();
            case 12:
               return (double)var1.getLocation().getYaw();
            case 13:
               return (double)var1.getLocation().getPitch();
            case 14:
               return var1.getWorld().getName();
            case 15:
               return var1.getGameMode().name().toLowerCase(Locale.ROOT);
            case 16:
               return var1.isOp();
            case 17:
               return var1.isFlying();
            case 18:
               return var1.isSneaking();
            case 19:
               return var1.isSprinting();
            case 20:
               return var1.isOnline();
            case 21:
               return var0.Xqedii_3a9kp91.Xqedii_2fi2lg1.Xqedii_nm0vadd(var1);
            case 22:
               return var0.Xqedii_3a9kp91.Xqedii_2fi2lg1.Xqedii_1u89z52(var1);
            case 23:
            case 24:
               String var6 = api(var3).getOpenGuiName(var1);
               return var6 == null ? Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("tDZDvNax8keQcXDRvxlPTRR08puTeeq6Iz33yw==") : var6;
            default:
               throw new Xqedii_3vsk7zm(Xqedii_38ghdp1cxzx5b(var2), var3);
         }
      }
   }

   public static void Xqedii_23nr37w(Player var0, String var1, Object var2, int var3) {
      if (((-896830425 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         int var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(854467287, 17);
         switch (var1.hashCode()) {
            case -1768407915:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("3z9m50AKmV8jXAOODzh2fXKzFjO0u8Q90dpHmZPW6VjyNXUp/3pyL9VSSi8="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1664421866, 24);
               }
               break;
            case -1271344497:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Xy3ZZu1+m9X8lYbAjvF8o/89nQQN0H4LsFHxG3yKE78cgH/Yk2pRuA=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753130, 6);
               }
               break;
            case -1221262756:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Iup0jETbqVh5rIAwDWLfHJoSFNWXc3u67rzfNrAAsmjebeMofRkkig=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 20);
               }
               break;
            case -1206104397:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("DdeEnwBk2E9pvnRXDvIVjB8YhEhw0XtqjkVGx7ZUubDoqimCw4mtGw=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-2074417570, 30);
               }
               break;
            case 3832:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("R/pDjtVVINVYJbCLHUaCuhNzavd7V/Hp8FMm8ffOrfU="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753002, 7);
               }
               break;
            case 100893:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("04M9CKWzSD9indqEdsJUpaZAL4/5gHyfaABixEEFrmjvTw=="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1614090218, 25);
               }
               break;
            case 3148894:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("+HZcp+5kgWTAjcE5/y9Ktuws9Z3sch4GAiOTP+4+Nj8idmhj"))) {
                  var5 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-315550104, 20);
               }
               break;
            case 102865796:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("hT+3+mVcgN2oLHAfS8yLDrCg9eztoj3C1m757SohKrUKOUYKy98="))) {
                  var5 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1369052091, 10);
               }
         }

         switch (var5) {
            case 0:
               var0.setHealth(
                  Math.max(
                     Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_3acgm3uupz46n(5217635594261396602L, 29)),
                     Math.min(var0.getMaxHealth(), Xqedii_z4wg071.Xqedii_3c9epia(var2, var3))
                  )
               );
               break;
            case 1:
            case 2:
               var0.setFoodLevel(
                  Math.max(
                     Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(497296077, 17),
                     Math.min(Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-866088100, 19), Xqedii_z4wg071.Xqedii_1x518al(var2, var3))
                  )
               );
               break;
            case 3:
               var0.setLevel(Math.max(Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(788671859, 21), Xqedii_z4wg071.Xqedii_1x518al(var2, var3)));
               break;
            case 4:
            case 5:
               var0.setExp(
                  (float)Math.max(
                     Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_uq8eyn3tpt3o(4397091117645148178L, 58)),
                     Math.min(Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_1hdn7q9m99fqg(2887954877292035454L, 24)), Xqedii_z4wg071.Xqedii_3c9epia(var2, var3))
                  )
               );
               break;
            case 6:
               try {
                  var0.setGameMode(GameMode.valueOf(Xqedii_z4wg071.Xqedii_2mlipa7(var2).trim().toUpperCase(Locale.ROOT)));
                  break;
               } catch (IllegalArgumentException var7) {
                  throw new Xqedii_3vsk7zm(Xqedii_1n98m4mgetpvl(Xqedii_z4wg071.Xqedii_2mlipa7(var2)), var3);
               }
            case 7:
               boolean var6 = Xqedii_z4wg071.Xqedii_2od1ceu(var2);
               if (var6) {
                  var0.setAllowFlight((Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(381261713, 4) != 0));
               }

               var0.setFlying(var6);
               break;
            default:
               throw new Xqedii_3vsk7zm(Xqedii_1xd0w9g2p5mj4(var1), var3);
         }
      }
   }

   public static Object Xqedii_2j653hv(Xqedii_36oytze var0, String var1, int var2) {
      if ((-17433149 * -17433149 - -17433149 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var4 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1713704937, 20);
         switch (var1.hashCode()) {
            case -1662836996:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("TUKkwORsqqCKDP0qG5yNCC/q3bj7hbtKlkgFgFlre4WD1VQB97IRfwva"))) {
                  var4 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(374268190, 28);
               }
               break;
            case -1377687758:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("MuNlhPodhufPvIrwf5CzpHw5ROWhnDmhFxFcr1OkoQ5vJBhjgA6YjQ=="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(880154763, 11);
               }
               break;
            case -1273775369:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("kWBUE5/Rwxi5ymniSgMDbTBG7hVpCyMCqgPYxRCyzmwsXauGse0YAS37tIM="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(272996923, 26);
               }
               break;
            case -1068263387:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("9W0wSw8x7n3W4SGvx8SZ0jVTF86Dx2NQFhFCN4OBB9CyAWuLaL90kg=="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1760424214, 12);
               }
               break;
            case -1068263386:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("lnZtGpgoxhqMV+j0hA80jcWhIo7bg3BMTQ1QyZ6T0rGYKWYBpemgXA=="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-787060499, 28);
               }
               break;
            case -892483498:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("NcZMT6AXstw+u52GAZh1yGD7Cc2C1eHC7aQiKLChgerLzIKZq+4M7w=="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714769898, 11);
               }
               break;
            case -892483497:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("tlXfsLqB8MHYuuksiiA87uSvee0r/oKO1u7JXf22BHJsZHTCurk+XA=="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1720637457, 8);
               }
               break;
            case -880905839:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("dMCrcl0tMSsaN4okMJCrLF/YCiEoY9uXqmWz8AKfpxY7dlOn9cZbPg=="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1988660020, 19);
               }
               break;
            case -867922508:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("G0RuumyPOkbls5Va9O/JBy/RfGFwUZ5NXa90CBA8pAsQqydZZSS3tA=="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1760411926, 12);
               }
               break;
            case -867922507:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Yd3kSm7RYmGhaP2vC/5oMVPZjeBdDe0c6sdwsKKOci0H7W03eAYYhw=="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(495198925, 17);
               }
               break;
            case -283739534:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("6a9UYuEuR3c+X/RSXoxLIbmC2quojzkeDARQZXkiXF2UW+76FeqP0npzOrs1fO96wF0spBL+"))) {
                  var4 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(910745886, 14);
               }
               break;
            case 120:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21"))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-500379174, 29);
               }
               break;
            case 121:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jx8MAgAnVRyTuYKQTkWuW6E/5+kzRBeY29B35Ve2"))) {
                  var4 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753517, 0);
               }
               break;
            case 3220:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("fdxu8BrJWOa3h/m/3Ds5Dau8rWO83O1/lLp20EXAV6I="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-618517295, 21);
               }
               break;
            case 3221:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("T+yeAsR3LqEq8EEeQYDaj82JtTv9ZKsTMK30k9xmM1I="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(1448010014, 27);
               }
               break;
            case 3355:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("hC2fBlZKYfvEeHbJ598hX4PBCTCcOrrpTdV+D8P8A+I="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1647104474, 29);
               }
               break;
            case 3707:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Gl4yz5nDjDwrkFmpZTW3RAwZ50M+vJxmnmapHwDzlOY="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(-296820450, 27);
               }
               break;
            case 103671:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("QttDdI2SpbjHhMy07HGf/aWw0Vl/pxWyhkLKDsmfsl6QAQ=="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1345654762, 25);
               }
               break;
            case 106079:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("sTIn2Pug2Xmv4nHtLDLC+4qYp9fbLxDhMWLbxvGogyzPsQ=="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(143340662, 27);
               }
               break;
            case 3092207:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("LdUAshc6gIp0G5MhE+nSQwg4nJLJDwTwMObnFDc5dVJ7HNZu"))) {
                  var4 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139138, 2);
               }
               break;
            case 3151786:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("h+12iMNyL27Awog30EkQNBM1weS7nh8UW+m8Nvd+aPQMj+VJ"))) {
                  var4 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(606263091, 25);
               }
               break;
            case 3433103:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("3TqKqF0bK36EKEz9RXELH3gVtvBQLLn90WZAT0rLvm5Pt8uT"))) {
                  var4 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714778090, 13);
               }
               break;
            case 3556653:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("h2jWbpfMoUWP9QnmhWO/Cq41uoLoK4LfztIr1xyBc0RT7LZL"))) {
                  var4 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-429718438, 14);
               }
               break;
            case 3575610:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("CSdPkP2MNtxYaW53tjJXQwDIGrXq7TOf+yyxJSeezEu/lKC0"))) {
                  var4 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 16);
               }
               break;
            case 106629499:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("pOfoscsjavXmz838JpvZzuAI+Lu8Ac2Tdl13TD1Kp5lmc5EOGEY="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(375975089, 4);
               }
               break;
            case 109407362:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("FOyBy8b7RZbeW3P6c9FcfB4G15QV4yJNe/eKwAHlIgt6EV2fa8E="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1760297238, 12);
               }
               break;
            case 111972721:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("p9wyJ31BpR2fVfgZqWAjnuzibvJLfdYCD2VhsiVZGybC31UBWzE="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1720633105, 8);
               }
               break;
            case 476588369:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("qVd7LqWtBN3+H4KLMhqLDutsDZORoeWs+y/hwa6v2Hhe8VkjsVnBMFS3tdZRNg=="))) {
                  var4 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-429570982, 14);
               }
               break;
            case 1126979554:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("xnQocnhitJQRCVAHzhDg+BU4zFotSSt8/77yhmdw+uFj43+OltRdXTtq"))) {
                  var4 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-31271118, 25);
               }
               break;
            case 1126979555:
               if (var1.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Avc8Wl+vQqwPXExl3KYN1GGe8rA18+QNiI/p/25/TWKLV3kwxaKOz2vO"))) {
                  var4 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(432730133, 31);
               }
         }
         return switch (var4) {
            case 0 -> var0.Xqedii_1x9ad7s;
            case 1, 2 -> var0.Xqedii_lc1i2g8;
            case 3 -> var0.Xqedii_1z2rxkd.isEmpty() ? var0.Xqedii_lc1i2g8 : var0.Xqedii_1z2rxkd;
            case 4 -> var0.Xqedii_3rt5h0f;
            case 5 -> var0.Xqedii_vkzqb40;
            case 6 -> var0.Xqedii_yhwhrno;
            case 7 -> var0.Xqedii_2rqqsu9;
            case 8 -> var0.Xqedii_2qxc6az;
            case 9 -> var0.Xqedii_pxsnga0;
            case 10 -> var0.Xqedii_25xm6yv;
            case 11 -> var0.Xqedii_jq9ubxh;
            case 12 -> var0.Xqedii_1t9vphc;
            case 13, 14 -> Double.isNaN(var0.Xqedii_pxsnga0)
               ? Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_3acgm3uupz46n(5217635594261396602L, 62))
               : var0.Xqedii_vkzqb40 - var0.Xqedii_pxsnga0;
            case 15, 16 -> Double.isNaN(var0.Xqedii_25xm6yv)
               ? Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_3acgm3uupz46n(5217635594261396602L, 32))
               : var0.Xqedii_yhwhrno - var0.Xqedii_25xm6yv;
            case 17 -> var0.Xqedii_16npco2;
            case 18 -> var0.Xqedii_19v5iy3;
            case 19 -> var0.Xqedii_2afs9at;
            case 20, 21 -> var0.Xqedii_a9in0yy;
            case 22 -> var0.Xqedii_1p91ipf;
            case 23 -> var0.Xqedii_3464tdf;
            case 24 -> var0.Xqedii_35rn1ti;
            case 25 -> var0.Xqedii_17k9l69;
            case 26 -> var0.Xqedii_12aqqzl;
            case 27 -> var0.Xqedii_2f19s3n;
            case 28 -> var0.Xqedii_1zx8kgx;
            case 29 -> var0.Xqedii_2edjbb0();
            default -> throw new Xqedii_3vsk7zm(Xqedii_1vg1j9tmk6knx(var1), var2);
         };
      }
   }

   public static void Xqedii_biyycmb(Xqedii_1yqm9k3 var0, String var1, String var2, double[] var3, Object var4, Object var5, int var6) {
      if ((-938576293 * -938576293 + -938576293 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Player var7 = var0.Xqedii_25ge4f1(var6);
         String var8 = var5 == null
            ? Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("LtZq7CE7TylqEb2OtdRB1v5ojIa1TrgumfK1o2fPsyOavmVUSmx64Q==")
            : Xqedii_2awqdkk.Xqedii_1uh18ch(Xqedii_z4wg071.Xqedii_2mlipa7(var5));
         if (var8 == null) {
            throw new Xqedii_3vsk7zm(Xqedii_2awqdkk.Xqedii_pzxldhl(Xqedii_z4wg071.Xqedii_2mlipa7(var5)), var6);
         } else {
            long var9 = Math.max(
               Xqedii_yp12iz0.Xqedii_3acgm3uupz46n(5217565225517218938L, 46),
               Math.round(
                  var4 == null
                     ? Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_1hdn7q9m99fqg(8439054307248374402L, 45))
                     : Xqedii_z4wg071.Xqedii_3c9epia(var4, var6)
               )
            );
            var0.Xqedii_3u9m9cl();
            double[] var11 = Xqedii_17ofwhd(var7, var1, var2, var6);
            if (var0.Xqedii_2fi2lg1 != null) {
               var0.Xqedii_2fi2lg1.Xqedii_3uyxvgz(var7, new Xqedii_2awqdkk(var1, var2, var11, var3, var0.Xqedii_2fi2lg1.Xqedii_3b3clqv(), var9, var8));
            }
         }
      }
   }

   public static double[] Xqedii_17ofwhd(Player var0, String var1, String var2, int var3) {
      if ((-568257324 * -568257324 - -568257324 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         UltimateUIAPI var4 = api(var3);
         int var6 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1707390906, 10);
         switch (var2.hashCode()) {
            case -1267206133:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("diToJO5NEaFto1zr1BB0PJZKtY0pcthKUnxOYBru3W3AEtHR0gYUWMh+"))) {
                  var6 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-624808751, 21);
               }
               break;
            case -1221029593:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("nzZebb9xumLu/XMXKdRa6YvPhxDNhvO/OF2Yj3wUoZj79kT31YZrKA=="))) {
                  var6 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1932485165, 13);
               }
               break;
            case -40300674:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("YhOiI8fG1ozMw6kWLzXBOZf4dRyc3EO8VvTLehLL7TGvOhru4fDGNSU0QAE="))) {
                  var6 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-774184404, 13);
               }
               break;
            case 120:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21"))) {
                  var6 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 4);
               }
               break;
            case 121:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jx8MAgAnVRyTuYKQTkWuW6E/5+kzRBeY29B35Ve2"))) {
                  var6 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(-1236344546, 31);
               }
               break;
            case 94842723:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IImnEqUwJJlnYCH1LqIWHEFRkD+HaiBYMADnbhUpCIihU56PeRw="))) {
                  var6 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911171870, 14);
               }
               break;
            case 113126854:
               if (var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Fg6Wz5j5B+SyZz7GEm7f8gUnQpqwG+bWB5eqzqRrZlIqT5JnpRE="))) {
                  var6 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714884586, 17);
               }
         }

         switch (var6) {
            case 0:
            case 1:
               double[] var12 = var4.getElementPosition(var0, var1);
               if (var12 == null) {
                  throw new Xqedii_3vsk7zm(Xqedii_3m0c77eyl2f6c(var1), var3);
               }

               double[] var14 = new double[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1244873592, 7)];
               var14[Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 3)] = var12[var2.equals(
                     Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21")
                  )
                  ? Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(994592154, 18)
                  : Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1167735628, 2)];
               return var14;
            case 2:
            case 3:
               double[] var11 = var4.getElementSize(var0, var1);
               if (var11 == null) {
                  throw new Xqedii_3vsk7zm(Xqedii_12gp7dojfpzr2(var1), var3);
               }

               double[] var13 = new double[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1507668707, 25)];
               var13[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 22)] = var11[var2.equals(
                     Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Fg6Wz5j5B+SyZz7GEm7f8gUnQpqwG+bWB5eqzqRrZlIqT5JnpRE=")
                  )
                  ? Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 4)
                  : Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(573403951, 29)];
               return var13;
            case 4:
            case 5:
               Object var10 = var4.getElementValue(var0, var1, var2);
               double var8 = var2.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("diToJO5NEaFto1zr1BB0PJZKtY0pcthKUnxOYBru3W3AEtHR0gYUWMh+"))
                  ? Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_3acgm3uupz46n(5411008903261617272L, 3))
                  : Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_8sy2u3uh2ey7(-3823091215290666189L, 61));
               double[] var10000 = new double[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1548434343, 14)];
               var10000[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1140279860, 23)] = var10 == null ? var8 : Xqedii_z4wg071.Xqedii_3pdnyon(var10, var8);
               return var10000;
            case 6:
               Object var7 = var4.getElementValue(var0, var1, Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IImnEqUwJJlnYCH1LqIWHEFRkD+HaiBYMADnbhUpCIihU56PeRw="));
               return Xqedii_2awqdkk.Xqedii_1ugf7tn(
                  var7 == null ? Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("DcGz/7YP4Yhqnb4MWrSdnT/q5E0LG1PkqBkXs7fqAdo6cJckWa7gMQ==") : String.valueOf(var7), var3
               );
            default:
               throw new Xqedii_3vsk7zm(
                  Xqedii_1oguuispvnqzj(
                     var2, String.join(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("eC1P3Gm7W5fg67hUvGqd6YeBOC0/BfjdAYz6ADeM1AA="), Xqedii_2awqdkk.Xqedii_1wy8z23)
                  ),
                  var3
               );
         }
      }
   }

   public static void Xqedii_1qsxv8z(Xqedii_1yqm9k3 var0, String var1, String... var2) {
      if ((1085920092 ^ 1085920092) != 0) {
         throw new IllegalStateException();
      } else {
         if (var0.Xqedii_2fi2lg1 != null && var0.Xqedii_1v4ue4a != null) {
            var0.Xqedii_2fi2lg1.Xqedii_3032p5i(var0.Xqedii_1v4ue4a, var1, var2);
         }
      }
   }

   public static void Xqedii_1b5cndg(Xqedii_1yqm9k3 var0, Object[] var1, int var2) {
      if (((1872125714 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var3 = Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var1, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 2))).trim().toLowerCase(Locale.ROOT);
         String var4 = Xqedii_11itj63.idOf(Xqedii_25b6ies(var1, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139094, 3)), var2);
         if (var4.isBlank()) {
            throw new Xqedii_3vsk7zm(
               Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
                  "pkuOjWkK5y6u0qDOHhciVkXbB4YYOaKUqPQhSpg6QB6jmsVTJn9dUq7FLmg4Odbaz6AeJsvnzXHQBC7jucZHSof5QQP0m6yjKYl3iwbOwUAJxC4EPMCCYSO+KZq2y7qbhr261JPBBA+aDwuGqHAxnIXbk+N6Qfu2BKG/mWIxZpTu24VGrS6elcF4"
               ),
               var2
            );
         } else {
            boolean var5 = var3.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("h2jWbpfMoUWP9QnmhWO/Cq41uoLoK4LfztIr1xyBc0RT7LZL"));
            LinkedHashMap var6 = new LinkedHashMap();
            var6.put(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("CSdPkP2MNtxYaW53tjJXQwDIGrXq7TOf+yyxJSeezEu/lKC0"), var3);
            var6.put(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("hC2fBlZKYfvEeHbJ598hX4PBCTCcOrrpTdV+D8P8A+I="), var4);
            var6.put(
               Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("diToJO5NEaFto1zr1BB0PJZKtY0pcthKUnxOYBru3W3AEtHR0gYUWMh+"),
               Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1525063108, 6)
            );
            var6.put(
               Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IImnEqUwJJlnYCH1LqIWHEFRkD+HaiBYMADnbhUpCIihU56PeRw="),
               Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("DcGz/7YP4Yhqnb4MWrSdnT/q5E0LG1PkqBkXs7fqAdo6cJckWa7gMQ==")
            );
            LinkedHashMap var7 = new LinkedHashMap();
            var7.put(
               Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21"),
               Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_1hdn7q9m99fqg(-1062672914691601813L, 19))
            );
            var7.put(
               Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jx8MAgAnVRyTuYKQTkWuW6E/5+kzRBeY29B35Ve2"),
               Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_3acgm3uupz46n(5217635594261396602L, 54))
            );
            var6.put(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IyYYanQ+rI74n596/IQPrh1KPugQnzCpMKBYGfidq/TQOhHkZ8hA57TLXZs="), var7);
            LinkedHashMap var8 = new LinkedHashMap();
            var8.put(
               Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Fg6Wz5j5B+SyZz7GEm7f8gUnQpqwG+bWB5eqzqRrZlIqT5JnpRE="),
               var5
                  ? Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_1hdn7q9m99fqg(-1415893082929097816L, 56))
                  : Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_3acgm3uupz46n(5217635043129851002L, 41))
            );
            var8.put(
               Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("nzZebb9xumLu/XMXKdRa6YvPhxDNhvO/OF2Yj3wUoZj79kT31YZrKA=="),
               var5
                  ? Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_uq8eyn3tpt3o(4397091118038231058L, 29))
                  : Double.longBitsToDouble(Xqedii_yp12iz0.Xqedii_uq8eyn3tpt3o(-1259430014332194739L, 7))
            );
            var6.put(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("BlGpykbvf6ieBTFxdM3+cuLscsxqwQVohZq6VSXL3Nyy7i3A"), var8);
            if (var5) {
               var6.put(
                  Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("4BK+0Q0Uyo3aTXwnzaA/BgK6ZBO4/ArJAqzYeoRAkyjlvPnS"),
                  Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("g6B8DuBEYqt5kkCNsLZ81xm0fXLyFoWOLYRQTAO2HA9NbRaMsi7rh2TP")
               );
               var6.put(
                  Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("kqXk659xni+Ax8t8k+WnpiiJ3ETBiOBHPdp9VCXXBwQYAu4tTr8="),
                  Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Tkq+ouRfZI4WbRExjNsVPQCadY6MLJ+0TjlG4u68/p4qbZcP")
               );
               var6.put(
                  Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("h2jWbpfMoUWP9QnmhWO/Cq41uoLoK4LfztIr1xyBc0RT7LZL"),
                  Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("tDZDvNax8keQcXDRvxlPTRR08puTeeq6Iz33yw==")
               );
            } else if (Xqedii_1g7vacg.contains(var3)) {
               var6.put(
                  Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("tLfqjGci8rQ2O/PKGem0R+lDSYVFURG231+qR0XClWP8sVjQA2jgheAP"),
                  Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("KAbWBDIIs8O+FK/3UAHoJS3PQ9JD5VojZXk82iwT")
               );
            }

            if (var3.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("TXNCbxS8yY0H4zPd/fMRdBW1Q/O87LJJYKxjNg/z1mML8sT1PVxgIVtN"))) {
               var6.put(
                  Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Qi4gcrrAkD2SnlqYAjjWQ3OHmzm1SNs+jt+dtqxZ3hQxxRFo0r6CSXC50RY="),
                  Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("JIkfeHUseewymOMEjKMyvSa5jm0X8nunNN1PO9miUfIAKqZ4s7yRtzA8")
               );
            }

            String var9 = null;

            for (int var10 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753482, 5);
               var10 + Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139614, 9) < var1.length;
               var10 += 2
            ) {
               String var11 = String.valueOf(var1[var10]);
               Object var12 = var1[var10 + Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1760375062, 12)];
               int var14 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753385, 7);
               switch (var11.hashCode()) {
                  case -1267206133:
                     if (var11.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("diToJO5NEaFto1zr1BB0PJZKtY0pcthKUnxOYBru3W3AEtHR0gYUWMh+"))) {
                        var14 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-98379982, 25);
                     }
                     break;
                  case -1221029593:
                     if (var11.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("nzZebb9xumLu/XMXKdRa6YvPhxDNhvO/OF2Yj3wUoZj79kT31YZrKA=="))) {
                        var14 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1270589021, 22);
                     }
                     break;
                  case -1217487446:
                     if (var11.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("1/B9iN0GzaZ7+joI7QebjxGUBDlcScbDw6PpOPIj6tl8kNbPO77bgA=="))) {
                        var14 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1169057280, 2);
                     }
                     break;
                  case 120:
                     if (var11.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21"))) {
                        var14 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1956852800, 3);
                     }
                     break;
                  case 121:
                     if (var11.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jx8MAgAnVRyTuYKQTkWuW6E/5+kzRBeY29B35Ve2"))) {
                        var14 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911140126, 10);
                     }
                     break;
                  case 3365:
                     if (var11.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jdMOfbyorb3dMQZf4tkIjBoAdSEKMj7BXzmeEzGdzF4="))) {
                        var14 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911124766, 11);
                     }
                     break;
                  case 3556653:
                     if (var11.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("h2jWbpfMoUWP9QnmhWO/Cq41uoLoK4LfztIr1xyBc0RT7LZL"))) {
                        var14 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911155486, 14);
                     }
                     break;
                  case 3649734:
                     if (var11.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("AKABOjPskAZlmseqrKjKhKQ3ojpQ+83Wrn6Fl0qsFFieFOyq"))) {
                        var14 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911138910, 5);
                     }
                     break;
                  case 94842723:
                     if (var11.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IImnEqUwJJlnYCH1LqIWHEFRkD+HaiBYMADnbhUpCIihU56PeRw="))) {
                        var14 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139198, 4);
                     }
                     break;
                  case 102749521:
                     if (var11.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("OzqrGWzvW2nJphuaub2YSnolwWJvhmXhY1bsm8l7p5QaZ0WiCk8="))) {
                        var14 = Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(381261761, 4);
                     }
                     break;
                  case 113126854:
                     if (var11.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Fg6Wz5j5B+SyZz7GEm7f8gUnQpqwG+bWB5eqzqRrZlIqT5JnpRE="))) {
                        var14 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-2138360714, 27);
                     }
               }

               switch (var14) {
                  case 0:
                  case 1:
                     var7.put(var11, Xqedii_z4wg071.Xqedii_3c9epia(var12, var2));
                     break;
                  case 2:
                  case 3:
                     var8.put(var11, Xqedii_z4wg071.Xqedii_3c9epia(var12, var2));
                     break;
                  case 4:
                     var6.put(
                        Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("OzqrGWzvW2nJphuaub2YSnolwWJvhmXhY1bsm8l7p5QaZ0WiCk8="), Xqedii_z4wg071.Xqedii_3c9epia(var12, var2)
                     );
                     break;
                  case 5:
                     var6.put(
                        Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("diToJO5NEaFto1zr1BB0PJZKtY0pcthKUnxOYBru3W3AEtHR0gYUWMh+"),
                        (int)Math.max(
                           Xqedii_yp12iz0.Xqedii_8sy2u3uh2ey7(-3518500314059457588L, 55),
                           Math.min(Xqedii_yp12iz0.Xqedii_uq8eyn3tpt3o(-4397091117645185043L, 11), Math.round(Xqedii_z4wg071.Xqedii_3c9epia(var12, var2)))
                        )
                     );
                     break;
                  case 6:
                     String var21 = Xqedii_z4wg071.Xqedii_2mlipa7(var12).trim();
                     var6.put(
                        Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IImnEqUwJJlnYCH1LqIWHEFRkD+HaiBYMADnbhUpCIihU56PeRw="),
                        var21.startsWith(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("8kA4L22MFIYBZyV2X+pVGGP++Cswj2Xa6vlzDxgD"))
                           ? var21.substring(Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 24))
                           : var21
                     );
                     break;
                  case 7:
                     var6.put(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("h2jWbpfMoUWP9QnmhWO/Cq41uoLoK4LfztIr1xyBc0RT7LZL"), Xqedii_z4wg071.Xqedii_2mlipa7(var12));
                     break;
                  case 8:
                     if (Xqedii_z4wg071.Xqedii_2od1ceu(var12)) {
                        var6.put(
                           Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("PtFHslL9MyGefd5UOSu1zxiaT0sHK9y4rSml+RTBdQOFOEElklHhZT/l"),
                           Boolean.valueOf((Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 24) != 0))
                        );
                     }
                     break;
                  case 9:
                     var9 = var12 == null ? null : Xqedii_11itj63.idOf(var12, var2);
                     break;
                  case 10:
                     if (!(var12 instanceof Map var15)) {
                        throw new Xqedii_3vsk7zm(
                           Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
                              "XvHvSkQsZENihogaEb/iFY7roXwUgYEdx7xG2BL5w5/jiu4SdX9jmQnUJ7QRPm2+4qJrZtpzInSJsIvFXpu16n1LNewRw0U4CtyvcR7+jMTFSszuFbS4koWQpLKZ3hUzOHjVFqqpKsQb9zx/TBK1MA=="
                           ),
                           var2
                        );
                     }

                     for (Entry var17 : (Iterable<Entry>) (var15.entrySet())) {

                        String var18 = String.valueOf(var17.getKey());
                        Object var19 = Xqedii_tydjfwf(var17.getValue());
                        if ((
                              var18.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IyYYanQ+rI74n596/IQPrh1KPugQnzCpMKBYGfidq/TQOhHkZ8hA57TLXZs="))
                                 || var18.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("BlGpykbvf6ieBTFxdM3+cuLscsxqwQVohZq6VSXL3Nyy7i3A"))
                           )
                           && var19 instanceof Map var20) {
                           ((Map)var6.get(var18)).putAll(var20);
                        } else {
                           var6.put(var18, var19);
                        }
                     }
                     break;
                  default:
                     var6.put(var11, Xqedii_tydjfwf(var12));
               }
            }

            var0.Xqedii_2504ge3(new UiElementCreate(var9, var6));
         }
      }
   }

   public static void Xqedii_1rx201x(Xqedii_y5pr2ec var0, String var1, int var2) {
      if ((763014493 * 763014493 + 763014493 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1yqm9k3 var3 = var0.Xqedii_3a9kp91;
         var3.Xqedii_25ge4f1(var2);
         var3.Xqedii_o19wdzr(var1);
      }
   }

   public static void Xqedii_2ol0jxi(CommandSender var0, String var1) {
      if ((1859129110 * 1859129110 - 1859129110 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null) {
         Component var2 = Xqedii_14rq758.Xqedii_g673f8i(var1);
         if (var0 instanceof Player var3) {
            Xqedii_nd6rkr3.Xqedii_3s7zz34(var3, var2);
         } else {
            var0.sendMessage(PlainTextComponentSerializer.plainText().serialize(var2));
         }
      }
   }

   public static List<CommandSender> Xqedii_33lch1h(Xqedii_1yqm9k3 var0, Object var1, int var2) {
      if ((-1015945594 ^ -1015945594) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var3 = new ArrayList();
         if (var1 == null) {
            if (var0.Xqedii_1v4ue4a != null) {
               var3.add(var0.Xqedii_1v4ue4a);
            } else if (var0.Xqedii_3cp8md6 != null) {
               var3.add(var0.Xqedii_3cp8md6);
            }

            return var3;
         } else if (!(var1 instanceof List)) {
            if (var1 instanceof Player var8) {
               var3.add(var8);
               return var3;
            } else {
               Player var7 = Bukkit.getPlayerExact(Xqedii_z4wg071.Xqedii_2mlipa7(var1));
               if (var7 == null) {
                  throw new Xqedii_3vsk7zm(Xqedii_3uqj3wah1qjf0(Xqedii_z4wg071.Xqedii_2mlipa7(var1)), var2);
               } else {
                  var3.add(var7);
                  return var3;
               }
            }
         } else {
            for (Object var6 : (List)var1) {
               var3.addAll(Xqedii_33lch1h(var0, var6, var2));
            }

            return var3;
         }
      }
   }

   public static List<Player> Xqedii_3671f3l(Xqedii_1yqm9k3 var0, Object var1, int var2) {
      if ((692751507 * 692751507 + 692751507 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return List.of(var0.Xqedii_25ge4f1(var2));
      } else {
         ArrayList var3 = new ArrayList();

         for (CommandSender var5 : Xqedii_33lch1h(var0, var1, var2)) {
            if (var5 instanceof Player var6) {
               var3.add(var6);
            }
         }

         return var3;
      }
   }

   public static Player Xqedii_18aycvq(Xqedii_1yqm9k3 var0, Object var1, int var2) {
      if (((789969547 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return var0.Xqedii_25ge4f1(var2);
      } else {
         for (CommandSender var4 : Xqedii_33lch1h(var0, var1, var2)) {
            if (var4 instanceof Player var5) {
               return var5;
            }
         }

         throw new Xqedii_3vsk7zm(
            Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("useczaDY8M+LgyJRLf5kTarOjTZbn29zaHbFBgJZlDdMX06IC0MS7Uo0wKyaZL1aI0boyMHgCLdGqynf7z0="), var2
         );
      }
   }

   public static Object Xqedii_25b6ies(Object[] var0, int var1) {
      if ((1170736324 * 1170736324 - 1170736324 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 < var0.length ? var0[var1] : null;
      }
   }

   public static void Xqedii_37nn7q1(Xqedii_y5pr2ec var0, int var1, Object[] var2, int var3) {
      if ((-517415216 * -517415216 - -517415216 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1yqm9k3 var4 = var0.Xqedii_3a9kp91;
         switch (var1) {
            case 1:
            case 2:
            case 3:
               Player var42 = var4.Xqedii_25ge4f1(var3);
               var4.Xqedii_3u9m9cl();
               String var59 = Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1167735624, 2)), var3);
               int var72 = var1 != Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(375975217, 4)
                     && (var1 != Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(2064739225, 24) || api(var3).isElementVisible(var42, var59))
                  ? Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(375975201, 4)
                  : Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1503900868, 6);
               api(var3).setElementVisible(var42, var59, (var72 != 0));
               break;
            case 4:
               var4.Xqedii_25ge4f1(var3);
               String var41 = Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 12)), var3);
               double var58 = Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(584528626, 1)), var3);
               double var82 = Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139098, 1)), var3);
               if (Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-2001516696, 31)) != null) {
                  String var104 = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21");
                  double[] var115 = new double[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1279629883, 26)];
                  var115[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1541223139, 25)] = var58;
                  Xqedii_biyycmb(
                     var4,
                     var41,
                     var104,
                     var115,
                     Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1723142122, 22)),
                     Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753522, 3)),
                     var3
                  );
                  var104 = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jx8MAgAnVRyTuYKQTkWuW6E/5+kzRBeY29B35Ve2");
                  var115 = new double[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1198098611, 15)];
                  var115[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-684527582, 9)] = var82;
                  Xqedii_biyycmb(
                     var4,
                     var41,
                     var104,
                     var115,
                     Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753002, 8)),
                     Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139166, 4)),
                     var3
                  );
               } else {
                  String[] var106 = new String[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1751050567, 20)];
                  var106[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-774225364, 13)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21");
                  var106[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-774217172, 13)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jx8MAgAnVRyTuYKQTkWuW6E/5+kzRBeY29B35Ve2");
                  Xqedii_1qsxv8z(var4, var41, var106);
                  var4.Xqedii_x5301uw(UiElementWrite.position(var41, var58, var82));
               }
               break;
            case 5:
               Player var40 = var4.Xqedii_25ge4f1(var3);
               String var57 = Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 15)), var3);
               var4.Xqedii_3u9m9cl();
               double[] var71 = api(var3).getElementPosition(var40, var57);
               if (var71 == null) {
                  throw new Xqedii_3vsk7zm(Xqedii_155kzkdiknxdf(var57), var3);
               }

               double var81 = var71[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1956852800, 3)]
                  + Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-753834354, 24)), var3);
               double var93 = var71[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(854729431, 17)]
                  + Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1608332003, 25)), var3);
               if (Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753258, 7)) != null) {
                  String var101 = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21");
                  double[] var113 = new double[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 7)];
                  var113[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 15)] = var81;
                  Xqedii_biyycmb(
                     var4,
                     var57,
                     var101,
                     var113,
                     Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-317647256, 20)),
                     Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911204638, 14)),
                     var3
                  );
                  var101 = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jx8MAgAnVRyTuYKQTkWuW6E/5+kzRBeY29B35Ve2");
                  var113 = new double[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-774217172, 13)];
                  var113[Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 2)] = var93;
                  Xqedii_biyycmb(
                     var4,
                     var57,
                     var101,
                     var113,
                     Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(291933905, 0)),
                     Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139094, 1)),
                     var3
                  );
               } else {
                  String[] var103 = new String[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-641011690, 30)];
                  var103[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 3)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21");
                  var103[Xqedii_yp12iz0.Xqedii_38076oheu1krt(913236254, 21)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jx8MAgAnVRyTuYKQTkWuW6E/5+kzRBeY29B35Ve2");
                  Xqedii_1qsxv8z(var4, var57, var103);
                  var4.Xqedii_x5301uw(UiElementWrite.position(var57, var81, var93));
               }
               break;
            case 6:
               var4.Xqedii_25ge4f1(var3);
               String var39 = Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(584528624, 1)), var3);
               double var56 = Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1262200413, 22)), var3);
               double var80 = Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753518, 2)), var3);
               if (Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(854991575, 17)) != null) {
                  String var98 = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Fg6Wz5j5B+SyZz7GEm7f8gUnQpqwG+bWB5eqzqRrZlIqT5JnpRE=");
                  double[] var111 = new double[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 29)];
                  var111[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-633197359, 21)] = var56;
                  Xqedii_biyycmb(
                     var4,
                     var39,
                     var98,
                     var111,
                     Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1369052091, 10)),
                     Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753522, 3)),
                     var3
                  );
                  var98 = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("nzZebb9xumLu/XMXKdRa6YvPhxDNhvO/OF2Yj3wUoZj79kT31YZrKA==");
                  var111 = new double[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1287165560, 7)];
                  var111[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(146132156, 31)] = var80;
                  Xqedii_biyycmb(
                     var4,
                     var39,
                     var98,
                     var111,
                     Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1760366870, 12)),
                     Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(880193675, 11)),
                     var3
                  );
               } else {
                  String[] var100 = new String[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1078303291, 26)];
                  var100[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1932460589, 13)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
                     "Fg6Wz5j5B+SyZz7GEm7f8gUnQpqwG+bWB5eqzqRrZlIqT5JnpRE="
                  );
                  var100[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1167735628, 2)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
                     "nzZebb9xumLu/XMXKdRa6YvPhxDNhvO/OF2Yj3wUoZj79kT31YZrKA=="
                  );
                  Xqedii_1qsxv8z(var4, var39, var100);
                  var4.Xqedii_x5301uw(UiElementWrite.size(var39, var56, var80));
               }
               break;
            case 7:
               String var38 = Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 22)));

               for (CommandSender var70 : Xqedii_33lch1h(var4, Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-684527070, 9)), var3)) {
                  Xqedii_2ol0jxi(var70, var38);
               }
               break;
            case 8:
               String var37 = Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1064608565, 27)));

               for (Player var69 : Bukkit.getOnlinePlayers()) {
                  Xqedii_2ol0jxi(var69, var37);
               }

               Xqedii_2ol0jxi(Bukkit.getConsoleSender(), var37);
               break;
            case 9:
               Component var36 = Xqedii_14rq758.Xqedii_g673f8i(
                  Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 8)))
               );

               for (CommandSender var68 : Xqedii_33lch1h(var4, Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 12)), var3)) {
                  if (var68 instanceof Player var79) {
                     Xqedii_nd6rkr3.Xqedii_2n2p2n9(var79, var36);
                  }
               }
               break;
            case 10:
               Component var35 = Xqedii_14rq758.Xqedii_g673f8i(
                  Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 21)))
               );
               Object var52 = Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1503900868, 6)) == null
                  ? Component.empty()
                  : Xqedii_14rq758.Xqedii_g673f8i(Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1956852792, 3))));
               Times var67 = Times.times(
                  Duration.ofMillis(Xqedii_yp12iz0.Xqedii_3acgm3uupz46n(5217644802671279226L, 36)),
                  Duration.ofMillis(Xqedii_yp12iz0.Xqedii_1hdn7q9m99fqg(1823252134755545776L, 0)),
                  Duration.ofMillis(Xqedii_yp12iz0.Xqedii_3acgm3uupz46n(-7464500956413920131L, 58))
               );

               for (CommandSender var89 : Xqedii_33lch1h(var4, Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(-1236344546, 30)), var3)) {
                  if (var89 instanceof Player var92) {
                     Xqedii_nd6rkr3.Xqedii_303uu75(var92, Title.title(var35, (Component)var52, var67));
                  }
               }
               break;
            case 11:
               Player var34 = var4.Xqedii_25ge4f1(var3);
               String var51 = Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 28))).trim();
               float var66 = Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 9)) == null
                  ? Float.intBitsToFloat(Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1760371438, 12))
                  : (float)Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(292264313, 0)), var3);
               float var77 = Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(145966952, 31)) == null
                  ? Float.intBitsToFloat(Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1180453749, 6))
                  : (float)Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1751050567, 20)), var3);
               Sound var88 = var51.equals(var51.toUpperCase(Locale.ROOT)) ? Xqedii_38o2zes.Xqedii_ruc2zei(var51) : null;
               if (var88 != null) {
                  var34.playSound(var34.getLocation(), var88, var66, var77);
               } else {
                  var34.playSound(var34.getLocation(), var51.toLowerCase(Locale.ROOT), var66, var77);
               }
               break;
            case 12:
               Player var33 = var4.Xqedii_25ge4f1(var3);
               String var50 = Xqedii_3niuv0w(Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 6))));
               var33.performCommand(var50);
               break;
            case 13:
               String var32 = Xqedii_3niuv0w(Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 13))));
               Xqedii_38o2zes.Xqedii_34mipix(var4.Xqedii_2fi2lg1.Xqedii_3892wz7(), () -> {
                  if (((-376051448 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else {
                     Bukkit.dispatchCommand(Bukkit.getConsoleSender(), var32);
                  }
               });
               break;
            case 14:
            case 15:
               var4.Xqedii_3u9m9cl();
               String var31 = Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 31)));

               for (Player var65 : Xqedii_3671f3l(var4, Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 25)), var3)) {
                  if (var1 == Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1956852680, 3)) {
                     api(var3).openGuiHud(var65, var31);
                  } else {
                     api(var3).openGui(var65, var31);
                  }
               }
               break;
            case 16:
               var4.Xqedii_3u9m9cl();
               String var30 = Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1720636177, 8)) == null
                  ? null
                  : Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1503900868, 6)));

               for (Player var64 : Xqedii_3671f3l(var4, Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(583867812, 1)), var3)) {
                  if (var30 == null) {
                     api(var3).closeGui(var64);
                  } else {
                     api(var3).closeGui(var64, var30);
                  }
               }
               break;
            case 17:
               Player var29 = var4.Xqedii_25ge4f1(var3);
               var4.Xqedii_3u9m9cl();
               api(var3).openInput(var29, Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1869925258, 27)), var3));
               break;
            case 18:
               Player var28 = var4.Xqedii_25ge4f1(var3);
               var4.Xqedii_3u9m9cl();
               api(var3)
                  .scrollBox(
                     var28,
                     Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 18)), var3),
                     Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1525046852, 6)), var3),
                     Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1959496064, 3)), var3)
                  );
               break;
            case 19:
               Player var27 = var4.Xqedii_25ge4f1(var3);
               var4.Xqedii_3u9m9cl();
               api(var3)
                  .setScroll(
                     var27,
                     Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-266152142, 25)), var3),
                     Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(854729431, 17)), var3),
                     Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-804166002, 24)), var3)
                  );
               break;
            case 20:
               Player var26 = var4.Xqedii_25ge4f1(var3);
               var4.Xqedii_3u9m9cl();
               api(var3).scrollToTop(var26, Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 30)), var3));
               break;
            case 21:
               Player var25 = var4.Xqedii_25ge4f1(var3);
               var4.Xqedii_3u9m9cl();
               api(var3).scrollToBottom(var25, Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-633197359, 21)), var3));
               break;
            case 22:
               Player var24 = var4.Xqedii_25ge4f1(var3);
               var4.Xqedii_3u9m9cl();
               String var47 = Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(555116781, 28)), var3);
               String var63 = Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-753834354, 24)), var3);
               String var76 = Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1198000307, 15)) == null
                  ? null
                  : Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1681199082, 25)), var3);
               int var87 = Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1723142122, 22)) == null
                  ? Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1169057244, 2)
                  : Xqedii_z4wg071.Xqedii_1x518al(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1720635665, 8)), var3);
               if (var76 == null) {
                  api(var3).cloneElement(var24, var47, var63);
               } else {
                  api(var3).cloneElement(var24, var47, var63, var76, var87);
               }
               break;
            case 23:
               Player var23 = var4.Xqedii_25ge4f1(var3);
               var4.Xqedii_3u9m9cl();
               api(var3).clickElement(var23, Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 9)), var3));
               break;
            case 24:
               Player var22 = var4.Xqedii_25ge4f1(var3);
               var4.Xqedii_3u9m9cl();
               Object var46 = Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(751950434, 5));
               if (Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 23)) instanceof List var62) {
                  ArrayList var84 = new ArrayList();

                  for (Object var11 : var62) {
                     if (!(var11 instanceof Map var12)) {
                        throw new Xqedii_3vsk7zm(
                           Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
                              "vichDtTSTGTtaPimyoaJ/Gr+Se4XUxYSNhRghZGRuA8n/nWxUrqYL/0nv8Mqj/764439S//kkrd0C+BlRQkeEyQBOR2f1lU3jIVwGm4Af3UJjaGPjIO+4lsWUCjk0rzvHEP/tzkyFuvKjeb0qzwF4OxjoZMCmBSRHeHjbKtbPXBP49zlnZdJZviv7jaYayI9hmgVBKu2ItyZuQ=="
                           ),
                           var3
                        );
                     }

                     LinkedHashMap var13 = new LinkedHashMap();

                     for (Entry var15 : (Iterable<Entry>) (var12.entrySet())) {

                        var13.put(String.valueOf(var15.getKey()), Xqedii_z4wg071.Xqedii_3ujolw5(var15.getValue()));
                     }

                     var84.add(var13);
                  }

                  api(var3).runActions(var22, var84);
               } else if (Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 20)) instanceof Map var75) {
                  LinkedHashMap var86 = new LinkedHashMap();

                  for (Entry var94 : (Iterable<Entry>) (var75.entrySet())) {

                     var86.put(String.valueOf(var94.getKey()), Xqedii_z4wg071.Xqedii_3ujolw5(var94.getValue()));
                  }

                  api(var3).runAction(var22, var86);
               } else {
                  api(var3)
                     .runAction(
                        var22,
                        Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-430046118, 14))),
                        var46 == null ? null : Xqedii_z4wg071.Xqedii_2mlipa7(var46)
                     );
               }
               break;
            case 25:
               Player var21 = var4.Xqedii_25ge4f1(var3);
               World var45 = Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(936304926, 23)) == null
                  ? var21.getWorld()
                  : Bukkit.getWorld(Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-2004142986, 27))));
               if (var45 == null) {
                  throw new Xqedii_3vsk7zm(
                     Xqedii_14881br2ajd2g(Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1287165816, 7)))), var3
                  );
               }

               Location var61 = new Location(
                  var45,
                  Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 29)), var3),
                  Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139103, 0)), var3),
                  Xqedii_z4wg071.Xqedii_3c9epia(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(375975169, 4)), var3),
                  var21.getLocation().getYaw(),
                  var21.getLocation().getPitch()
               );
               Xqedii_38o2zes.Xqedii_fxq2htx(var21, var61);
               break;
            case 26:
               Player var20 = var4.Xqedii_25ge4f1(var3);
               String var44 = Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 31)))
                  .trim()
                  .toUpperCase(Locale.ROOT)
                  .replace((char)Xqedii_yp12iz0.Xqedii_38076oheu1krt(912187678, 15), (char)Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714755690, 6))
                  .replace(
                     Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("/nLq+/L9/ksMqKYl7tyKm2I9q0+NxAvOP2o75lw0jB5GkGBMDhWi844uHJ0ZjmgY"),
                     Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("tDZDvNax8keQcXDRvxlPTRR08puTeeq6Iz33yw==")
                  );
               Material var60 = Material.matchMaterial(var44);
               if (var60 == null || var60.isAir()) {
                  throw new Xqedii_3vsk7zm(
                     Xqedii_22t96nuch9ayo(Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(762523394, 5)))), var3
                  );
               }

               int var74 = Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1581538022, 22)) == null
                  ? Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 12)
                  : Math.max(
                     Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 28),
                     Xqedii_z4wg071.Xqedii_1x518al(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 3)), var3)
                  );
               PlayerInventory var10000 = var20.getInventory();
               ItemStack[] var10001 = new ItemStack[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 29)];
               var10001[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(994592154, 18)] = new ItemStack(var60, var74);

               for (ItemStack var10 : var10000.addItem(var10001).values()) {
                  var20.getWorld().dropItemNaturally(var20.getLocation(), var10);
               }
               break;
            case 27:
               var4.Xqedii_2fi2lg1
                  .Xqedii_34ytbys(
                     var4.Xqedii_2q97y6i, var3, Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1212521019, 26)))
                  );
               break;
            case 28:
            case 29:
               int var19 = var1 == Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714804714, 11)
                  ? Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139614, 9)
                  : Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 8);
               var4.Xqedii_3dy3w3c = (var19 != 0);
               if (var4.Xqedii_34yybpr != null) {
                  var4.Xqedii_34yybpr.cancel((var19 != 0));
               }
               break;
            case 30:
               Player var18 = var4.Xqedii_25ge4f1(var3);
               var4.Xqedii_3u9m9cl();
               api(var3)
                  .scrollToElement(
                     var18,
                     Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-316598680, 20)), var3),
                     Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 5)), var3)
                  );
               break;
            case 31:
               var4.Xqedii_25ge4f1(var3);
               Xqedii_1b5cndg(var4, var2, var3);
               break;
            case 32:
               Player var17 = var4.Xqedii_25ge4f1(var3);
               var4.Xqedii_3u9m9cl();
               String var43 = Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 12)), var3);
               String var7 = Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911122718, 14)) == null
                  ? Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("tDZDvNax8keQcXDRvxlPTRR08puTeeq6Iz33yw==")
                  : Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139614, 9)), var3);
               int var73 = Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(880181387, 11)) == null
                  ? Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1548450726, 14)
                  : Xqedii_z4wg071.Xqedii_1x518al(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1745400647, 23)), var3);
               api(var3).moveElement(var17, var43, var7, var73);
               break;
            case 33:
               var4.Xqedii_25ge4f1(var3);
               String var16 = Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 4)), var3);
               String var6 = Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 4)));
               int var8 = Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1723142121, 23);
               switch (var6.hashCode()) {
                  case 3530753:
                     if (var6.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("BlGpykbvf6ieBTFxdM3+cuLscsxqwQVohZq6VSXL3Nyy7i3A"))) {
                        var8 = Xqedii_yp12iz0.Xqedii_38076oheu1krt(911106334, 15);
                     }
                     break;
                  case 94842723:
                     if (var6.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IImnEqUwJJlnYCH1LqIWHEFRkD+HaiBYMADnbhUpCIihU56PeRw="))) {
                        var8 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-318695832, 20);
                     }
                     break;
                  case 747804969:
                     if (var6.equals(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IyYYanQ+rI74n596/IQPrh1KPugQnzCpMKBYGfidq/TQOhHkZ8hA57TLXZs="))) {
                        var8 = Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(994592154, 18);
                     }
               }

               switch (var8) {
                  case 0:
                     String var96 = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("2KOk5CrzSXZIlqYzunxyK7v1r87RBIsa2qvkOQ21");
                     double[] var109 = new double[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1287165560, 7)];
                     var109[Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 12)] = Xqedii_z4wg071.Xqedii_3c9epia(
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-796173109, 27)), var3
                     );
                     Xqedii_biyycmb(
                        var4,
                        var16,
                        var96,
                        var109,
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753418, 5)),
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911126814, 12)),
                        var3
                     );
                     var96 = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("jx8MAgAnVRyTuYKQTkWuW6E/5+kzRBeY29B35Ve2");
                     var109 = new double[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1167735628, 2)];
                     var109[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-430046118, 14)] = Xqedii_z4wg071.Xqedii_3c9epia(
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1681199082, 24)), var3
                     );
                     Xqedii_biyycmb(
                        var4,
                        var16,
                        var96,
                        var109,
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-1407005411, 25)),
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(-1574079697, 29)),
                        var3
                     );
                     return;
                  case 1:
                     String var10002 = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Fg6Wz5j5B+SyZz7GEm7f8gUnQpqwG+bWB5eqzqRrZlIqT5JnpRE=");
                     double[] var107 = new double[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-753834354, 24)];
                     var107[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(1714753513, 23)] = Xqedii_z4wg071.Xqedii_3c9epia(
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(994067866, 18)), var3
                     );
                     Xqedii_biyycmb(
                        var4,
                        var16,
                        var10002,
                        var107,
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(880193675, 11)),
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1556867211, 11)),
                        var3
                     );
                     var10002 = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("nzZebb9xumLu/XMXKdRa6YvPhxDNhvO/OF2Yj3wUoZj79kT31YZrKA==");
                     var107 = new double[Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139614, 9)];
                     var107[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(291933906, 0)] = Xqedii_z4wg071.Xqedii_3c9epia(
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753516, 0)), var3
                     );
                     Xqedii_biyycmb(
                        var4,
                        var16,
                        var10002,
                        var107,
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714229226, 19)),
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(910975262, 15)),
                        var3
                     );
                     return;
                  case 2:
                     Xqedii_biyycmb(
                        var4,
                        var16,
                        Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IImnEqUwJJlnYCH1LqIWHEFRkD+HaiBYMADnbhUpCIihU56PeRw="),
                        Xqedii_2awqdkk.Xqedii_1ugf7tn(
                           Xqedii_z4wg071.Xqedii_2mlipa7(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1760362774, 12))), var3
                        ),
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139100, 31)),
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(1556867211, 11)),
                        var3
                     );
                     return;
                  default:
                     double[] var10003 = new double[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 29)];
                     var10003[Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 31)] = Xqedii_z4wg071.Xqedii_3c9epia(
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139614, 8)), var3
                     );
                     Xqedii_biyycmb(
                        var4,
                        var16,
                        var6,
                        var10003,
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911122718, 12)),
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911126814, 12)),
                        var3
                     );
                     return;
               }
            case 34:
               Player var5 = var4.Xqedii_25ge4f1(var3);
               if (var4.Xqedii_2fi2lg1 != null) {
                  var4.Xqedii_2fi2lg1
                     .Xqedii_3032p5i(
                        var5,
                        Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 13)) == null
                           ? null
                           : Xqedii_11itj63.idOf(Xqedii_25b6ies(var2, Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139102, 24)), var3)
                     );
               }
               break;
            default:
               throw new Xqedii_3vsk7zm(
                  Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("a80ifkaAQRMByo7GteOqL4/6XBxQdW5fFK4wwd3kGF9QJq+N8t3OWw+ou8jcED95UUbgdXaojhoy8g=="), var3
               );
         }
      }
   }

   public static String Xqedii_3niuv0w(String var0) {
      if ((1834582857 * 1834582857 + 1834582857 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var1 = var0.trim();
         return var1.startsWith(Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("mSSDfQEI2TvJpSwav0EIJ6n2NeLuUzL3MJf4GyR7"))
            ? var1.substring(Xqedii_yp12iz0.Xqedii_38076oheu1krt(911130910, 13))
            : var1;
      }
   }

   static {
      if ((1792746128 * (1792746128 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10000 = new String[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-853689310, 9)];
         var10000[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1167735624, 2)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
            "t9XMe34/ON+aqpFS3rX21SkfrBkwHhN33PSOhJRhqRTrAI2v+wmvFg=="
         );
         var10000[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714753514, 29)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
            "xOqjV1BjXwxOah2KAq4B3X5bd5KzmEpkH3gEqVWW/fuVCuDt7Fc="
         );
         var10000[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(-637391663, 21)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("3TqKqF0bK36EKEz9RXELH3gVtvBQLLn90WZAT0rLvm5Pt8uT");
         var10000[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1714687978, 15)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
            "fW2PcfkVs+2ec6041nXLvXv6ONhc7yKjkkujbL5u2IPVQu2mg6cOig=="
         );
         var10000[Xqedii_yp12iz0.Xqedii_38076oheu1krt(1984880926, 28)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("oetMU/eMubflKY1WUU/yMuT2EQRW+khyAFnNJWjxU8zZ8R16");
         var10000[Xqedii_yp12iz0.Xqedii_38076oheu1krt(921624862, 21)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("79BhZgEOQfGKuwsjFMkvxfMMAnQ7wvlfHjPFYbi87bW1/DDX");
         var10000[Xqedii_yp12iz0.Xqedii_38076oheu1krt(105832734, 27)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
            "wZQRS/RX3/RB4CZEarX9rsERRBoQ8jQMZZ/VXqRhJuTlUMjLX8Lfyg=="
         );
         var10000[Xqedii_yp12iz0.Xqedii_38076oheu1krt(911139088, 1)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("53iE6U0Uo6cAehbkie1Ybfly66sUXK/XiAFexOQi8323rgPv");
         var10000[Xqedii_yp12iz0.Xqedii_2yzw9x8fxfdex(-1715146730, 17)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
            "bYnH3hjTwNpEvxvLhCtzLn+mhAuhWVY+tOC3PPb05O2hIb13PPJG+SvB"
         );
         var10000[Xqedii_yp12iz0.Xqedii_35l4uqxul72dj(1198360755, 15)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
            "w4IWk/zjH8KD648ZZu51cABnCsqKp/bb6OtcziaEGjkhCdETbane2g=="
         );
         var10000[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(292264322, 0)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv(
            "pXYKUyb0vOdYLtWdsa+opUQNDc6XkudcsziMRHjEzV+7ll/7ifQvcA=="
         );
         var10000[Xqedii_yp12iz0.Xqedii_3ekywfqzdh6hq(856040151, 17)] = Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("K0OaiaxvASLhMn0kVoGFnuAKsnyDECRzIzvWBtxeYSw=");
         Xqedii_2pbhzqx = Set.of(var10000);
         Xqedii_1g7vacg = Set.of(
            Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("HvqsDYjc1WNYhlaMOYyB+iHl744It2A181TQTFiECWv4+NsxR5s="),
            Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("TXNCbxS8yY0H4zPd/fMRdBW1Q/O87LJJYKxjNg/z1mML8sT1PVxgIVtN"),
            Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("BjmG/6ylGhDJBZaVbc1Kz1RYNTJP+6iXYiM0pJWqPothKiR8"),
            Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("ec3DKoSV/FCweFVsAOQnloWl3FhEu2W+8DVlOzL9WaOoNCs0/QE="),
            Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("4AbfVcVUYSfNa8dJLbdza9FrhJjOCePb/vP/LBbVWuZHyOkV"),
            Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("MuNlhPodhufPvIrwf5CzpHw5ROWhnDmhFxFcr1OkoQ5vJBhjgA6YjQ==")
         );
      }
   }

   private static /* synthetic */ String Xqedii_32wj88dr8h8rr(String string, String string2) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Vfdf+VgD+3k7aokJKg84Adiw7vwG0cJeEObUsM/fP9oV1tnmZ1yps/s9IO8XkHMRVuLobNq4D0QYwBn9SYuylg==") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("+iN/X7tJztbmesgzvKs6F+4DX+k18XllbZHDWlnn01263WlOd7x57KAm1zJesDM9lOYbB4LHtQ90I/JBQFacJAgVBKEz4LrVywsRduXkKlqVhoS9Qs4=") + string2 + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("3Eg+XNMdg3QnKn3trZpucajja/jOG3fXeisDU/HNgmpNRkhcBCtsOg==");
    }

    private static /* synthetic */ String Xqedii_2k9w5y9stitdd(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("fD0lvwW27KeUZlyyBHBVC0EGQlRpq7MaBqgN6GEyE6gIIZ3nLeiHhWuYk75Sha5JmE5wyvTi6FR2Uw==") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("dWJghVsWHhwy5j7+jeB17Ol3fUb/KgOI2mKFcVl0CwDjR7ssq9vz1HW0LM4ky1GGuEymO1yLHRTOwcOME23BvtUQ7ipPdZKXypoXBIB5v7U2qg==");
    }

    private static /* synthetic */ String Xqedii_3en6apxrvep60(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("SpHQQjPGTtQmta9Yn9xpadooviNGvV9rdKLXxhYiubvqH9rMtI4Ptlm+JJ6Q8sO1OK6wzA==") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("v+N5uiXC0+1N/94Wl6SODMwcHPDKVIPuVkMgT2gZipevWxYD08bGYmzCdw9Diw==");
    }

    private static /* synthetic */ String Xqedii_27orwbso07q2y(String string, String string2) {
        return string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("j6eSjNf0XKCBmxI8OajVMTXdYAeQR8X4j1WQNGKh6LOyl2Ixjr0XbDR9pPL13Q==") + string2 + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("oCSA74OFGjJFqtgM3/ZTFsbDtp4IA8GH/4guAniu");
    }

    private static /* synthetic */ String Xqedii_13qgd86wp1cq2(String string, String string2) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Ogm9BLVZpYzN6c3LJgrQBfZRCZT6iXUcLQZ/c+YDcGKgNkF0gk7vt0LKBuL8GmnbdnPFlovyADnTx85J1fzZ9Q==") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("S+JI243rU1wBUlTedBLHshI97CcCzbUXRwAto1ARYpZtC1voWgw=") + string2;
    }

    private static /* synthetic */ String Xqedii_1l750eeybvls4(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Bw0ga9ls8durzVbg0BRTEiE+UdJj1L82YELlRQSQijr8sJfj267bzsRbYhLsmQB8a+c=") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("8lOtfQGtXm19SjaLtZi7H0c5wjsLBOSghrlL8mIKPEoKJuHBpPQ1UN6HCd2x9qiV");
    }

    private static /* synthetic */ String Xqedii_ej4oup67z9in(String string, String string2) {
        return string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("bl1Za7fXvYbQgR/YjrhI9ooWEEpYVvtZi7az9mJ1aUnGBFGIwoJr7cmHt++6nw==") + string2 + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("PkBM5MP90PqssjvcTfKRYmHcudquNW3D7Ho9563bHXU=");
    }

    private static /* synthetic */ String Xqedii_b0t15qhwpot6(int n) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("IhDQmyKZLYsA1AY4TA5vaHD5aOTdKURaEi2/GMB8InvuIKbe4EwywyVyJboxVMM2sEffw+MerlquljIPtuHKiZxJPMCS2g==") + n;
    }

    private static /* synthetic */ String Xqedii_3eufpwv72dpmh(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("cBNSLQIzFh/DO+92YgCoQqraeVtlCT0npsjxLJYRi3PhZc6kC/Lk3pQ/ptu5vzWhM5cPkpuUmd4GnZLtIjqc3KsiocyHtQIgRk9fwhMTpsjcM31M/rKRvsJ7YxTM/Mm/EMKBIppv53auZvAL7AY=") + string;
    }

    private static /* synthetic */ String Xqedii_cphtb7fherrv(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("/5ADzXPlNhF0SCYxVj0xJ1vknDMJfXrw1gS32yQrvU8YCKGiBrSoeShmhfvuXZgoF9mN7pdp6v+7MexEfJZDH97x") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("PkBM5MP90PqssjvcTfKRYmHcudquNW3D7Ho9563bHXU=");
    }

    private static /* synthetic */ String Xqedii_3177aa0o9dmnd(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_2fymnobm4f2w3(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("95WO+48wh5AhtXppLkgb2UQsdJkpHXPywYyBxd4EgPE8sJLNVRZk9RFEHr1KHd/OpAPhGq033c1Xyg==") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("PkBM5MP90PqssjvcTfKRYmHcudquNW3D7Ho9563bHXU=");
    }

    private static /* synthetic */ String Xqedii_38ghdp1cxzx5b(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("zrUroDiCl5gSR6GFb0yoBZsJZQy0jOnVl8yngrghTpZjJx2q5qGkB2dtKj0ACD7d8/yKADskVmLkpYQUnkc=") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("oCSA74OFGjJFqtgM3/ZTFsbDtp4IA8GH/4guAniu");
    }

    private static /* synthetic */ String Xqedii_1n98m4mgetpvl(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("zVi8lQdF8OyYPW42+S5mc7yNhIQZctZV3oe7T6Jag1hXw2Bievy7MjAxV9Ff76ieOgFBN1Rdqn4+uN6523Fv3w==") + string;
    }

    private static /* synthetic */ String Xqedii_1xd0w9g2p5mj4(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Ogm9BLVZpYzN6c3LJgrQBfZRCZT6iXUcLQZ/c+YDcGKgNkF0gk7vt0LKBuL8GmnbdnPFlovyADnTx85J1fzZ9Q==") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("Sm+IonygUgMIbSIP9Cen3bpzbMXp5WBMT5zYebQs7+eSmVzo4GrC1NHFYrlu6oYqyfjFsD+U");
    }

    private static /* synthetic */ String Xqedii_1vg1j9tmk6knx(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("/AlXc6dWUjmRhk1hDgBhhmH3CDSIJXKeTwfbYqGIrtNSN/f0NhYKSxcmzZJc6vwyWdlycAKrsgLj2vx2lwA=") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("oCSA74OFGjJFqtgM3/ZTFsbDtp4IA8GH/4guAniu");
    }

    private static /* synthetic */ String Xqedii_3m0c77eyl2f6c(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("hWgrl6k5jVsLzSaDaq/0VNgL25I0jxhZR9dh+G7KRy0HC7KpFv/ZRJgrp+nL9hi76zvY5A==") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("3z4+pOJxdFzTpkDb3/gxZFct/VT6Oxu01NuEfqOOrr2umCU9oapMq8B0YYRBwHA3WJW5S+Hq5Ss3FxIUjUiSigZhqA+mLI8jdDxFrW/Z9OaG9nOX");
    }

    private static /* synthetic */ String Xqedii_12gp7dojfpzr2(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("hWgrl6k5jVsLzSaDaq/0VNgL25I0jxhZR9dh+G7KRy0HC7KpFv/ZRJgrp+nL9hi76zvY5A==") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("3z4+pOJxdFzTpkDb3/gxZFct/VT6Oxu01NuEfqOOrr2umCU9oapMq8B0YYRBwHA3WJW5S+Hq5Ss3FxIUjUiSigZhqA+mLI8jdDxFrW/Z9OaG9nOX");
    }

    private static /* synthetic */ String Xqedii_1oguuispvnqzj(String string, String string2) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("rkqIDohCqv3OxVFXwBPtTnVkV5ZkT2kfGyMiogn9acgMCFGDbUWN19ihhHRH3Ps8rRJN0LCc6bP6F6kU") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("3As6rDX5eNCB/PfAT9iMfUknZ21qQnFLM7rrJHAwYoiRhpy40nAk9Ufa3tg=") + string2 + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("YEurWU/2twXbDxljPzYM2+cQnNuRiFi6/tpy1zwaQzO7HxMDzQpYtweDiFY+Ug0gIwgPtbeEt/Y6yVnPlAq++A==");
    }

    private static /* synthetic */ String Xqedii_3uqj3wah1qjf0(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("8/XI200pwi1Y7Wr3TrPV8PB9Lb+g6Zjh/7sHfj4b1H6CVejwuAm7PKt2fijH6NB9cnw=") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("MEDoYH7YzwJEfDr5H6CKA2QRlZa5QB8fOdVdY+9YXV1tk8VTNPIJbe500EAwKL1c8NQbg4bv1I0=");
    }

    private static /* synthetic */ String Xqedii_155kzkdiknxdf(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("hWgrl6k5jVsLzSaDaq/0VNgL25I0jxhZR9dh+G7KRy0HC7KpFv/ZRJgrp+nL9hi76zvY5A==") + string + Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("3z4+pOJxdFzTpkDb3/gxZFct/VT6Oxu01NuEfqOOrr2umCU9oapMq8B0YYRBwHA3WJW5S+Hq5Ss3FxIUjUiSigZhqA+mLI8jdDxFrW/Z9OaG9nOX");
    }

    private static /* synthetic */ String Xqedii_14881br2ajd2g(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("NSzYd5nnC3njoVUCB+ysNKFxMTgBF5LwleVp2DH+CWhcjQRUzOLLnEE9bsnS9Umd73xbKttS6Cu1ZlFdcVnE90oNBD1LOJsymuRgxdlp") + string;
    }

    private static /* synthetic */ String Xqedii_22t96nuch9ayo(String string) {
        return Xqedii_yp12iz0.Xqedii_gww1z0gwk8uv("nkD1lx6qGP0n8UeGCDzI8qw40PMlZZ988rjJfsWYKyF74kXNCVtgF0CxZIdlfQfTvo2UnTyO") + string;
    }
}
