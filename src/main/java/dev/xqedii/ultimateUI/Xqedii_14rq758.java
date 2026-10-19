package dev.xqedii.ultimateUI;

import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public final class Xqedii_14rq758 {
   public static final String Xqedii_1fuln09grwfcr = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final MiniMessage Xqedii_369g29m;
   public static final Map<Character, String> Xqedii_1xbmm5i;

   public static Component Xqedii_g673f8i(String var0) {
      if ((1656377258 * (1656377258 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var1 = Xqedii_1dorkas(var0 == null ? Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("sI0V4kZ2xDSrHV14PEJrCS+czwnZXQrZAI3EwQ==") : var0);

         try {
            return Xqedii_369g29m.deserialize(var1);
         } catch (Exception var3) {
            return Component.text(var0 == null ? Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("sI0V4kZ2xDSrHV14PEJrCS+czwnZXQrZAI3EwQ==") : var0);
         }
      }
   }

   public static String Xqedii_1dorkas(String var0) {
      if ((-108312746 * (-108312746 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0.indexOf(Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1076009489, 22)) < 0
         && var0.indexOf(Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1455763740, 15)) < 0) {
         return var0;
      } else {
         StringBuilder var1 = new StringBuilder(var0.length() + Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231186449, 12));

         for (int var2 = Xqedii_2yx8910.Xqedii_ad9jkb7r3the(-1585631343, 31); var2 < var0.length(); var2++) {
            char var3 = var0.charAt(var2);
            if ((var3 == Xqedii_2yx8910.Xqedii_ad9jkb7r3the(-1097346480, 6) || var3 == Xqedii_2yx8910.Xqedii_embrlqflclbb(-190213390, 12))
               && var2 + Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(-694767332, 31) < var0.length()) {
               char var4 = Character.toLowerCase(var0.charAt(var2 + Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231198737, 26)));
               if (var4 == Xqedii_2yx8910.Xqedii_ad9jkb7r3the(-755355113, 11)
                  && var2 + Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231985169, 17) < var0.length()
                  && Xqedii_mb90a9e(var0, var2 + Xqedii_2yx8910.Xqedii_embrlqflclbb(-512132527, 27), Xqedii_2yx8910.Xqedii_embrlqflclbb(-762442805, 14))) {
                  var1.append(Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("729fzyFxaeeRvgSIYDUUnjQtHup3dg2nEFQH/m/UOzE="))
                     .append(var0, var2 + Xqedii_2yx8910.Xqedii_embrlqflclbb(-218848318, 4), var2 + Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231199505, 8))
                     .append((char)Xqedii_2yx8910.Xqedii_embrlqflclbb(1546149, 23));
                  var2 += 7;
                  continue;
               }

               String var5 = Xqedii_1xbmm5i.get(var4);
               if (var5 != null) {
                  var1.append(var5);
                  var2++;
                  continue;
               }
            }

            var1.append(var3);
         }

         return var1.toString();
      }
   }

   public static boolean Xqedii_mb90a9e(String var0, int var1, int var2) {
      if ((176108900 * 176108900 - 176108900 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         for (int var3 = var1; var3 < var1 + var2; var3++) {
            if (Character.digit(var0.charAt(var3), Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1452716348, 1)) < 0) {
               return (Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1452716316, 7) != 0);
            }
         }

         return (Xqedii_2yx8910.Xqedii_embrlqflclbb(2038059513, 3) != 0);
      }
   }

   public static String Xqedii_jsswoik(String var0) {
      if ((-435269882 ^ -435269882) != 0) {
         throw new IllegalStateException();
      } else {
         return var0 == null
            ? Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("sI0V4kZ2xDSrHV14PEJrCS+czwnZXQrZAI3EwQ==")
            : var0.replaceAll(
                  Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("TF65kCCija0F/2eMgWKUB0D/ooDxO3f+DBqlLzFhhg2tQB4AEAUCOXPp7UABKu4MYf6bbMKmjUOMnC4dgGfJrE5wiY8="),
                  Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("sI0V4kZ2xDSrHV14PEJrCS+czwnZXQrZAI3EwQ==")
               )
               .toLowerCase(Locale.ROOT);
      }
   }

   static {
      if ((655877443 * (655877443 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_369g29m = MiniMessage.miniMessage();
         Entry[] var10000 = new Entry[Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-425892370, 28)];
         var10000[Xqedii_2yx8910.Xqedii_ad9jkb7r3the(2089618409, 18)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231205649, 8)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("X/Bafj9AvY1PNes6Cp/onUtwVk60nvFrt/ZgN6X/Fuzvr6L/MvsIMrIa")
         );
         var10000[Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231198737, 8)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_embrlqflclbb(-1809949090, 17)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("0xn8f4hG4y4l04F/cQIxOWx9/9njG99UyQtP2o6KeHFm93m3DdZgV5oChOXWvklteeo=")
         );
         var10000[Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1298307601, 26)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_ad9jkb7r3the(1598810792, 5)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("l99C1xBwibdfeg01LRy3l6bPeoD3ZN1a/SRlLiU8EJQLk5g5EH8fvdWi+CZJoUWgWHCTrg==")
         );
         var10000[Xqedii_2yx8910.Xqedii_ad9jkb7r3the(-913260905, 22)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231180305, 10)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("5Bj1JXPDCgoofQOue6TOj4lEApJ1v/JlrHEjB3Lqc6NHM/jnKglLVrbTKOMMCO27DOs=")
         );
         var10000[Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1452781852, 14)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_ad9jkb7r3the(-1095858700, 17)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("JeQXJl5hhD4PT49AV4PNwWDowHQv+qNmWQusPpG7RMbf7wUyJbGwRPZ4dcNcSWav")
         );
         var10000[Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1768069649, 27)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_embrlqflclbb(-218849102, 4)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("+UHG6lSTwMqgkcFnJ45Rn79RwxTBeryrrdfWgV38ao98gZ2GVxJp7YmcszhNspxwPxgguQcW")
         );
         var10000[Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1452716188, 6)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_ad9jkb7r3the(-87418926, 19)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("9mhptM6G+LTjwJ2XdGHTmNPHb6hhasVaURzM3ynvcm6TxqIZ32ovoA==")
         );
         var10000[Xqedii_2yx8910.Xqedii_embrlqflclbb(2052180345, 11)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(-694767353, 31)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("Ajcb4gUBvvlLr0siYEPrnmE730HTjFBo4DKVy0uJ5QUeYgV7ONXJQA==")
         );
         var10000[Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231193617, 10)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1452716700, 4)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("VHibZKxx+RYtPQXNthzmdnrgaIssG604e4DXqJmKj1pVsl8wkkysJz7b/p63JyO5BQ0=")
         );
         var10000[Xqedii_2yx8910.Xqedii_embrlqflclbb(685554877, 18)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_ad9jkb7r3the(-94413758, 8)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("MW6Sx2UNvYSbargdOwTrFC/fw0CjPXoZiK8OhfJvcZ6qZ4kxzm+vcA==")
         );
         var10000[Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1410773276, 22)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_ad9jkb7r3the(-518996329, 22)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("X8ul27+ETl+BC5KZFHR1bGj89OzBqQ3LE6Szqk6FqEgxQ8KRvd7WbA0V")
         );
         var10000[Xqedii_2yx8910.Xqedii_embrlqflclbb(-762491957, 14)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231181841, 9)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("WaHN874jSNrMgO8aS+4KvVwpqWsEQ/mGmp+MiC5H1CPuZhiRqZA7Rw==")
         );
         var10000[Xqedii_2yx8910.Xqedii_embrlqflclbb(1244802863, 16)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-157456925, 29)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("p4hxhqHcOlxowNa5Hw3Ldjju1w+SKR5bgb/38/Z/5lxlB+HlvfI=")
         );
         var10000[Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231985169, 16)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1453633820, 15)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("lgMa7iGQJWJ2YGyBEa2FipwvLqItoJb5r9q0JVZ6eISf70qJNWjzCnQFLYBesfbS+Bnqkjer58k=")
         );
         var10000[Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1452691740, 12)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1452716502, 1)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("nvrQ1TarYF+CMHGbsFdcwQxVZszu0OWXixl8990DJNCtL4ckyjkJDn0h1Po=")
         );
         var10000[Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1452722460, 11)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231228433, 10)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("jtVuv/4y5LgBcEErlH/OuBusdHUPQ0wxDR/xFKMdtmUbDbFGyrPmjQjU")
         );
         var10000[Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1451667740, 16)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1452306716, 12)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("EMwjHhkKdATF0mkwwl4O0pHi9t5GZJflusOHDlkdhLAPuFXL0iGBxw==")
         );
         var10000[Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231067665, 13)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1333959185, 20)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("ufF5vyTgLRMa90ydDAweCt+fUYLPcapenskLzb7vx7uGQ58MF1j7eJzpmMI=")
         );
         var10000[Xqedii_2yx8910.Xqedii_embrlqflclbb(1583256664, 1)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1453437212, 15)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("zqsznGsy9qtJTOd53594bjc+uahpqDXK0FZt1rdK7yEw9of2q+EQ2ER4Hzc7KGlA6F8/kw==")
         );
         var10000[Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231161873, 11)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1236965905, 17)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("zk54Wg05qnpZsDp8Cbm8uJtvXL2cWw0GBaqOdt45Wlu5h+9eOh0ysPfESEcfz4xMa4eUiNwCH4WUnQ==")
         );
         var10000[Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231755793, 15)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(915845393, 29)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("MG3tuloIYNFVps9AsUE/qsUQjyuxbQtmF3ue+4Mkl2Lp9ZTqqA29ijM0mHYX/3qAKLFJYg==")
         );
         var10000[Xqedii_2yx8910.Xqedii_3jffohw4bhb4m(1446949148, 19)] = Map.entry(
            Character.valueOf((char)Xqedii_2yx8910.Xqedii_3gvpm1ul97gne(-1231190033, 9)),
            Xqedii_2yx8910.Xqedii_1dnp5fzgvc2wm("tAxAziNUmak0rgnydbTOK4S7QNRDz07bC+udysDy89Ykgibd6jsxpaIz")
         );
         Xqedii_1xbmm5i = Map.ofEntries(var10000);
      }
   }
}
