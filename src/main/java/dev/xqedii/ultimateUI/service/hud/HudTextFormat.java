package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_x6q94jb;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class HudTextFormat extends HudAnchors {
   public static final String Xqedii_2fr0qoz73hu9h = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final Pattern Xqedii_3jjftk8;
   public static final Pattern Xqedii_26mkbzf;

   public HudTextFormat(UltimateUI var1) {
      super(var1);
   }

   public String Xqedii_wgkgkwo(String var1) {
      if (((1288550621 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var2 = var1 == null ? Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("OkC2yLl81XjWAmLHt9MzYJFblVtDrHyMbVY8VA==") : var1;
         String var3 = this.Xqedii_2pjnnkj(
            var2.indexOf(Xqedii_x6q94jb.Xqedii_3kpbc7ap2w9x8(-590686161, 18)) >= 0
               ? var2.replace((char)Xqedii_x6q94jb.Xqedii_3kpbc7ap2w9x8(-564928465, 11), (char)Xqedii_x6q94jb.Xqedii_1ad6vbbn8p1ix(691892939, 28))
               : var2
         );
         return Xqedii_1tif368j0v1e1(Xqedii_3asppgu, this.Xqedii_1ucep5a(this.Xqedii_1mvufoz(var3)));
      }
   }

   public String Xqedii_1mvufoz(String var1) {
      if ((39927128 ^ 39927128) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && Xqedii_3jjftk8.matcher(var1).find()) {
         String var2 = Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("OkC2yLl81XjWAmLHt9MzYJFblVtDrHyMbVY8VA==");
         String var3 = Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("OkC2yLl81XjWAmLHt9MzYJFblVtDrHyMbVY8VA==");
         Matcher var4 = Xqedii_26mkbzf.matcher(var1);

         while (var4.find()) {
            String var5 = var4.group(Xqedii_x6q94jb.Xqedii_3kpbc7ap2w9x8(-564733841, 6));
            if (var5.regionMatches(
               (Xqedii_x6q94jb.Xqedii_3jarjljou4ynb(-950023722, 27) != 0),
               Xqedii_x6q94jb.Xqedii_3kpbc7ap2w9x8(-564733905, 11),
               Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("1O5b7W+7t7P1tUYxtH9hc0qO+2FYuIXV5ZnflTbj2Iah3UWrRRt05Q=="),
               Xqedii_x6q94jb.Xqedii_2i5nfay7sed7h(-981265859, 14),
               Xqedii_x6q94jb.Xqedii_3jarjljou4ynb(-28395654, 6)
            )) {
               if (var2.isEmpty()) {
                  var2 = var5;
               }
            } else if (var3.isEmpty()) {
               var3 = var5;
            }
         }

         return var2.isEmpty() && var3.isEmpty() ? var1 : Xqedii_3jjftk8.matcher(var1).replaceAll(Matcher.quoteReplacement(Xqedii_1qqlkewvng2wb(var2, var3)));
      } else {
         return var1;
      }
   }

   public String Xqedii_2pjnnkj(String var1) {
      if ((-824784757 * (-824784757 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank() && var1.indexOf(Xqedii_x6q94jb.Xqedii_2i5nfay7sed7h(1380432049, 27)) >= 0) {
         StringBuilder var2 = new StringBuilder(var1.length() + Xqedii_x6q94jb.Xqedii_3kpbc7ap2w9x8(-566831057, 18));

         for (int var3 = Xqedii_x6q94jb.Xqedii_3kpbc7ap2w9x8(-564733905, 31); var3 < var1.length(); var3++) {
            char var4 = var1.charAt(var3);
            if (var4 == Xqedii_x6q94jb.Xqedii_3jarjljou4ynb(2133286845, 5) && var3 + Xqedii_x6q94jb.Xqedii_3kpbc7ap2w9x8(-564209617, 19) < var1.length()) {
               char var5 = Character.toLowerCase(var1.charAt(var3 + Xqedii_x6q94jb.Xqedii_1ad6vbbn8p1ix(2034070217, 1)));
               if (var5 == Xqedii_x6q94jb.Xqedii_3jarjljou4ynb(989522937, 16) && var3 + Xqedii_x6q94jb.Xqedii_3kpbc7ap2w9x8(509007918, 30) < var1.length()) {
                  String var6 = var1.substring(
                     var3 + Xqedii_x6q94jb.Xqedii_1ad6vbbn8p1ix(2034070216, 0), var3 + Xqedii_x6q94jb.Xqedii_3kpbc7ap2w9x8(-564733649, 5)
                  );
                  int var7 = Xqedii_x6q94jb.Xqedii_3kpbc7ap2w9x8(-564733913, 3);

                  for (int var8 = Xqedii_x6q94jb.Xqedii_2i5nfay7sed7h(2072708644, 7); var8 < Xqedii_x6q94jb.Xqedii_3jarjljou4ynb(-335988003, 0); var8++) {
                     char var9 = var6.charAt(var8);
                     if ((var9 < Xqedii_x6q94jb.Xqedii_3kpbc7ap2w9x8(-565258193, 15) || var9 > Xqedii_x6q94jb.Xqedii_1ad6vbbn8p1ix(2034059977, 8))
                        && (var9 < Xqedii_x6q94jb.Xqedii_1ad6vbbn8p1ix(2034135753, 11) || var9 > Xqedii_x6q94jb.Xqedii_3kpbc7ap2w9x8(-540092369, 18))
                        && (var9 < Xqedii_x6q94jb.Xqedii_2i5nfay7sed7h(-728796828, 28) || var9 > Xqedii_x6q94jb.Xqedii_3jarjljou4ynb(991816697, 16))) {
                        var7 = Xqedii_x6q94jb.Xqedii_1ad6vbbn8p1ix(-2034070218, 13);
                        break;
                     }
                  }

                  if (var7 != 0) {
                     var2.append(Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("h76ziFOei7s1GFp33pkWOISugKq/zOz6trcQ3xgn5h4="))
                        .append(var6.toLowerCase(Locale.ROOT))
                        .append((char)Xqedii_x6q94jb.Xqedii_3kpbc7ap2w9x8(-564781009, 10));
                     var3 += 7;
                     continue;
                  }
               }
               String var10 = switch (var5) {
                  case '0' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("mbQ1yohYL7mzkIq2zkxiwojqRowoOXcHWZhmKwWfe4/jWBr6cfc2RGmzI+7Tsg==");
                  case '1' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("1eWvJWEpabrbQIScQje+5eU9TvKlb6rPZXpRSE0ZPKkdl7x51BlK7ij2TnMepg==");
                  case '2' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("YBF1dSaOPb/+iFjpwAuaxv4ZVd01zoLib5DzF6T+Db6C85Ux8CrYgwEQk0oVAA==");
                  case '3' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("ApPI22taUIaC2V8wPyLW8WQPa1wmNa8fbeMqQea1iuNOBQ1xT2AmVFOm3eDbLQ==");
                  case '4' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("ZN1dElWQtF/FO6IPa52yF6a2hy7eHURbyQ2ANkNN3Fvz0Sbz6OOAiA+HwlHpuQ==");
                  case '5' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("JpwJLumuCSxb3EGv8+F3jZ4k3M9qIA79AomPKqbJ0aGaHCu4Eq7cDAgCjteodg==");
                  case '6' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("+wjXO4q7Ool2RXY95u0zNGm23XONpgCaFtEyc2bVQoJTUmDDiK+Jen0al3nMbw==");
                  case '7' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("us8IB/W3zXCK51RBmifqPsVmDk9QDcJzT+ObnfEag4j37ornBkLGB+9+/E6qwQ==");
                  case '8' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("5hUnBgDlHOJfiX+A4ihLtmjuwu1hBcNITjoycBuggla+HVzvkEbBViVnH95gZA==");
                  case '9' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("o+m/PFu2i782Ijgujoc2wQwcvn7i8TlA52hrCdFpXkpodo279L6P4IfHHv9bug==");
                  default -> null;
                  case 'a' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("49UwyTlvYyi3LWX40ZfxmDhiEF5x4E7vstzBlFllYnmz/4npk6BUxVi2XmaDBg==");
                  case 'b' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("qX1QM1u8u0H2QQwpJzhaoY3bPImgDILI6oTJQ2p6e1Rwa0e4kbzyqrCprSA8iA==");
                  case 'c' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("Wtfdt9PbTkhZGLjJ4g/Icw55vcyxXCRoE+EC9YZrfBxAWHDF8wKviUurt2VYow==");
                  case 'd' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("z5cyaKwBf673IRfEl/rTcz/YnZTCH3EDSGwCJ1qE7t2iI2nGFNtAgnAO2VFAdQ==");
                  case 'e' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("RyE3z6PjPaQDTVQIWWrwJ0/xTOqWmgSTt5NO3a/8D5KVu3vgYiCnew1E/Y96vw==");
                  case 'f' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("IQqZzHNTOGImmP6XzBLWtYtbOqErAVoDmxjoB1x4iElniLATZccAtmNO2pA/iA==");
                  case 'k' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("XpjyMMFzdRfLO3aVvFkP0eWU+XBcTEvvfq/Ss/N4jFlsdUAArqHlpiD4NeZExEiFGwNpFA==");
                  case 'l' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("fG/ODJUx24qEui2YhuH1WfWkkAfArj3a53CVnN7wBcUltcCh/zShPQ==");
                  case 'm' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("KpHM6WAcqD7xNCyhiRdq0ok0RIpcn+jtJFO/imhD9ZlYbqzqubWEpsDDawyVWRO3OVjt7U3IlTentw==");
                  case 'n' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("3EFQdjy6ED0BdT6+2hwCYSzj6ps31wzYxZuhXwXvvrT1uDMojVsIY+LNzzWTDgF5477BVg==");
                  case 'o' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("m/DHoGpJeLYPWbzDyJV8HNCOVfOPFtqlwEg2sQ5xNN3J/RaBXHHuc+iEqhc=");
                  case 'r' -> Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("HcroZJ6ZtJDYhdP89iwybtI8erV474Q0XTQiaP/+PDr45yiuW2I68Ja/");
               };
               if (var10 == null) {
                  var2.append(var4);
               } else {
                  var2.append(var10);
                  var3++;
               }
            } else {
               var2.append(var4);
            }
         }

         return var2.toString();
      } else {
         return var1;
      }
   }

   public String Xqedii_1ucep5a(String var1) {
      if ((131731543 * (131731543 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         Matcher var2 = Xqedii_1e8ic6a.matcher(var1);
         if (!var2.find()) {
            return var1;
         } else {
            var2.reset();
            StringBuffer var3 = new StringBuffer(var1.length() + Xqedii_x6q94jb.Xqedii_3jarjljou4ynb(-1652820484, 15));

            while (var2.find()) {
               String var4 = var2.group(Xqedii_x6q94jb.Xqedii_2i5nfay7sed7h(369969399, 16)).toLowerCase(Locale.ROOT);
               String var5 = var2.group(Xqedii_x6q94jb.Xqedii_1ad6vbbn8p1ix(2042458825, 23));
               String var6 = var2.group(Xqedii_x6q94jb.Xqedii_3jarjljou4ynb(-113583381, 8)).toLowerCase(Locale.ROOT);
               String var7 = Xqedii_3dnnghlhuq8gp(var4, var6, var5);
               var2.appendReplacement(var3, Matcher.quoteReplacement(var7));
            }

            var2.appendTail(var3);
            return var3.toString();
         }
      } else {
         return var1;
      }
   }

   public String Xqedii_3oiuki3(String var1) {
      if ((778522228 ^ 778522228) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var1.isEmpty()) {
         return Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("OkC2yLl81XjWAmLHt9MzYJFblVtDrHyMbVY8VA==");
      } else if (var1.startsWith(Xqedii_3asppgu)) {
         return var1.substring(Xqedii_3asppgu.length());
      } else {
         int var2 = var1.indexOf(Xqedii_x6q94jb.Xqedii_3kpbc7ap2w9x8(2119620655, 28));
         if (var2 >= 0 && var2 + Xqedii_x6q94jb.Xqedii_1ad6vbbn8p1ix(2034070217, 14) < var1.length()) {
            return var1.substring(var2 + Xqedii_x6q94jb.Xqedii_1ad6vbbn8p1ix(2034070217, 21));
         } else {
            return var2 >= 0 ? Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("OkC2yLl81XjWAmLHt9MzYJFblVtDrHyMbVY8VA==") : var1;
         }
      }
   }

   static {
      if ((443798473 ^ 443798473) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_3jjftk8 = Pattern.compile(Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("MSqWKSJ7l5e6nxEYVCHywTCm2d9uXRjtPfE6rfe/fcdQgDyZZYbl2dt4VFQ0mwiPALI="));
         Xqedii_26mkbzf = Pattern.compile(
            Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9(
               "xhhfbGoNpfjdAtc5O/MukWQfN7sF/n98nhgEOP96orH1j/hZoxCNbl9AprbqB2bmDv8JyclliACQsISN3sf3qCQx1ewLFsqvZrFRlxDZ35pzAAIsJkoQr0Nv20tlTiGqValHpJkJ3WYl4UbzcYvrKHDMPdpqwHEPw7F05bQjL1rdz3oPCpkBTqwtE6fuaAOJ5MaFs5CqfVmRoprk"
            )
         );
      }
   }

   private static /* synthetic */ String Xqedii_1tif368j0v1e1(String string, String string2) {
        return string + string2;
    }

    private static /* synthetic */ String Xqedii_1qqlkewvng2wb(String string, String string2) {
        return Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("HcroZJ6ZtJDYhdP89iwybtI8erV474Q0XTQiaP/+PDr45yiuW2I68Ja/") + string + string2;
    }

    private static /* synthetic */ String Xqedii_3dnnghlhuq8gp(String string, String string2, String string3) {
        return Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("Si+mHrjhgc6VsaZNphgfqVQauoz/uX0/PDe9UhtHTv+Hp+Z2QO4jddGbHd/W78wMMck=") + string + Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("rSqWCRNTg4Ysd1DWnk3m9KB0+0XE4fHyP6TO/D4KI1M=") + string2 + Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("l0LVpckZntakpTNG0fo+lfwXnt4ZolS0oi1aAT9U") + string3 + Xqedii_x6q94jb.Xqedii_2qwfvu4gnfzn9("Pyx7WZNq/owCXUjUXgLmk2HRYUTTzv0C7ptheAhkau8Ie0NHbm9HnoTcEZ4fI0VaGqQ=");
    }
}
