package dev.xqedii.ultimateUI;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

public final class Xqedii_29ge1r6 {
   public static final String Xqedii_2axfa1z6zwyon = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public static Map<String, Object> Xqedii_15tec8i() {
      if ((-1611256790 * -1611256790 - -1611256790 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return new LinkedHashMap<>();
      }
   }

   public static List<Object> Xqedii_2fhwu22(Object... var0) {
      if (((1627312768 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var1 = new ArrayList();
         if (var0 != null) {
            Object[] var2 = var0;
            int var3 = var0.length;

            for (int var4 = Xqedii_20rrwm8.Xqedii_2cdsxb1mr397w(-856841900, 1); var4 < var3; var4++) {
               Object var5 = var2[var4];
               var1.add(var5);
            }
         }

         return var1;
      }
   }

   public static String Xqedii_zaf20q7(Object var0) {
      if ((-2031523823 * -2031523823 + -2031523823 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         StringBuilder var1 = new StringBuilder(Xqedii_20rrwm8.Xqedii_y5xn4e4yo9nm(-2040492282, 1));
         Xqedii_8xm44ki(var0, var1, Xqedii_20rrwm8.Xqedii_k5uipdp7pa7f(1584861228, 1));
         var1.append((char)Xqedii_20rrwm8.Xqedii_y5xn4e4yo9nm(-1369395450, 26));
         return var1.toString();
      }
   }

   public static void Xqedii_8xm44ki(Object var0, StringBuilder var1, int var2) {
      if ((-869681069 * -869681069 - -869681069 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 == null) {
         var1.append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("dcaEfmlgW7NLnmoD6krv65yMKxk7j80seSEVTAv0eN14MXmE"));
      } else if (var0 instanceof String var7) {
         Xqedii_24y5shs(var7, var1);
      } else if (var0 instanceof Boolean var6) {
         var1.append(
            var6
               ? Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("IWROYdKFWsUum2a31ig6/hZvmQGl2QncsSCI5PGMhOOOfw0+")
               : Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("OE5O0/0ubieKCHXPbiUJMQqSSbJeL4xF1Fz/p4EUhXj5Sy3giF4=")
         );
      } else if (var0 instanceof Number var5) {
         Xqedii_6gqidxn(var5, var1);
      } else if (var0 instanceof Map var4) {
         writeObject(var4, var1, var2);
      } else if (var0 instanceof List var3) {
         Xqedii_3eacz4p(var3, var1, var2);
      } else {
         Xqedii_24y5shs(String.valueOf(var0), var1);
      }
   }

   public static void Xqedii_6gqidxn(Number var0, StringBuilder var1) {
      if (((1733602812 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double var2 = var0.doubleValue();
         if (var0 instanceof Integer || var0 instanceof Long || var0 instanceof Short) {
            var1.append(var0.longValue());
         } else if (var2 == Math.rint(var2) && !Double.isInfinite(var2)) {
            var1.append((long)var2).append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("QF3/dKAWHwHkeTooYkYxtSb+yMzXZ7xvEpR/Yny8JMQ="));
         } else {
            Locale var10001 = Locale.ROOT;
            String var10002 = Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("gcHAS0DrqI6LNrAI/qG1JTuzi4bbMgOC31UjCUXovK6EBp3K");
            Object[] var10003 = new Object[Xqedii_20rrwm8.Xqedii_2cdsxb1mr397w(856841899, 1)];
            var10003[Xqedii_20rrwm8.Xqedii_2cdsxb1mr397w(-856841900, 11)] = var2;
            var1.append(String.format(var10001, var10002, var10003));
         }
      }
   }

   public static void writeObject(Map<?, ?> var0, StringBuilder var1, int var2) {
      if ((-1045905288 * (-1045905288 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0.isEmpty()) {
         var1.append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("Xyq2Rz3CKQ4Si72iDfAc8dt5z8mZFgZmksrzRtWJFks="));
      } else {
         var1.append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("RAmixAM64fXWmtUrVX2EKbfTJfXyIaEBoRcuIGm3IV8="));
         int var3 = var0.size();

         for (Entry var5 : var0.entrySet()) {
            Xqedii_2zbtpko(var1, var2 + Xqedii_20rrwm8.Xqedii_k5uipdp7pa7f(194485700, 23));
            Xqedii_24y5shs(String.valueOf(var5.getKey()), var1);
            var1.append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("oJiNzQClf1apYoE6nz0InI3L40Gj1cS+Uv0/Wdqvgv0="));
            Xqedii_8xm44ki(var5.getValue(), var1, var2 + Xqedii_20rrwm8.Xqedii_2cdsxb1mr397w(856841899, 30));
            if (--var3 > 0) {
               var1.append((char)Xqedii_20rrwm8.Xqedii_2cdsxb1mr397w(856153771, 15));
            }

            var1.append((char)Xqedii_20rrwm8.Xqedii_3qdpuz5slr7zx(1067614716, 25));
         }

         Xqedii_2zbtpko(var1, var2);
         var1.append((char)Xqedii_20rrwm8.Xqedii_2cdsxb1mr397w(858545835, 15));
      }
   }

   public static void Xqedii_3eacz4p(List<?> var0, StringBuilder var1, int var2) {
      if ((-1962002983 * -1962002983 - -1962002983 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0.isEmpty()) {
         var1.append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("GikmW335VRwhwlviI+LGS4fUNfzX0zV70N7OVVzWykE="));
      } else {
         int var3 = Xqedii_20rrwm8.Xqedii_3qdpuz5slr7zx(1346340276, 6);

         for (Object var5 : var0) {
            if (var5 instanceof Map || var5 instanceof List) {
               var3 = Xqedii_20rrwm8.Xqedii_y5xn4e4yo9nm(-2040484090, 8);
               break;
            }
         }

         if (var3 != 0) {
            var1.append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("X2hQr+kUJGUzn4a4z0yOQl6Q0RTYv5/0OCIbPC0TR3I="));

            for (int var7 = Xqedii_20rrwm8.Xqedii_k5uipdp7pa7f(-824048245, 6); var7 < var0.size(); var7++) {
               if (var7 > 0) {
                  var1.append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("r4Dz/oNt5OPafqxAnBOVww7SNpCSATFBYFt0WtuZI5Q="));
               }

               Xqedii_8xm44ki(var0.get(var7), var1, var2);
            }

            var1.append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("C+q/jw6nc4lo1/VtnDSAjx7qiq41JFMrotd77xZQNFs="));
         } else {
            var1.append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("vxwSBDUMitBx8doue9ASxDtoADMwPEQXYeFrpCovdIk="));

            for (int var6 = Xqedii_20rrwm8.Xqedii_3qdpuz5slr7zx(-1979191122, 3); var6 < var0.size(); var6++) {
               Xqedii_2zbtpko(var1, var2 + Xqedii_20rrwm8.Xqedii_2cdsxb1mr397w(856841899, 31));
               Xqedii_8xm44ki(var0.get(var6), var1, var2 + Xqedii_20rrwm8.Xqedii_y5xn4e4yo9nm(-2032095482, 23));
               if (var6 < var0.size() - Xqedii_20rrwm8.Xqedii_k5uipdp7pa7f(-1199475981, 12)) {
                  var1.append((char)Xqedii_20rrwm8.Xqedii_k5uipdp7pa7f(-599666311, 11));
               }

               var1.append((char)Xqedii_20rrwm8.Xqedii_k5uipdp7pa7f(236428740, 23));
            }

            Xqedii_2zbtpko(var1, var2);
            var1.append((char)Xqedii_20rrwm8.Xqedii_y5xn4e4yo9nm(-2040486746, 5));
         }
      }
   }

   public static void Xqedii_2zbtpko(StringBuilder var0, int var1) {
      if ((-684955431 * -684955431 + -684955431 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         var0.append(
            Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("U2IUmfFKqUc1zwg64JdVHf0ai0OwCcHboOEM5be35VM=")
               .repeat(Math.max(Xqedii_20rrwm8.Xqedii_3qdpuz5slr7zx(66606917, 10), var1))
         );
      }
   }

   public static void Xqedii_24y5shs(String var0, StringBuilder var1) {
      if ((-1902826163 * -1902826163 + -1902826163 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         var1.append((char)Xqedii_20rrwm8.Xqedii_2cdsxb1mr397w(319970991, 29));

         for (int var2 = Xqedii_20rrwm8.Xqedii_3qdpuz5slr7zx(-128498429, 18); var2 < var0.length(); var2++) {
            char var3 = var0.charAt(var2);
            switch (var3) {
               case '\t':
                  var1.append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("jYcsQAK3IEFf8tFEX2tT3L7Yfl19+GTgbaNcbYkAZTs="));
                  break;
               case '\n':
                  var1.append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("UOAx3H2ErTnlBdwvTqq9TgR1FsoeZH2LoJPvxHVmckg="));
                  break;
               case '\r':
                  var1.append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("22sQ5xEFhqDV8sg/H4xzlcENAhWQjq5uxxdhc8oN/lg="));
                  break;
               case '"':
                  var1.append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("3kE75076g+2cDTagGMF0aEjQJl/WM5FO5JaSXKmFtGo="));
                  break;
               case '\\':
                  var1.append(Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("Lj1tVwRsKI0tbjQxAJlji5LgT64HpFYPf6vOMP279GM="));
                  break;
               default:
                  if (var3 >= Xqedii_20rrwm8.Xqedii_y5xn4e4yo9nm(-2107592954, 21) && var3 <= Xqedii_20rrwm8.Xqedii_3qdpuz5slr7zx(-784269677, 0)) {
                     var1.append(var3);
                  } else {
                     String var10001 = Xqedii_20rrwm8.Xqedii_15bhx0cb5jwmh("NGLEj1A+szjVsWkbGe+Hc1vKnnmFr2iKB3InyFXixla/8aMYyLfAmQ==");
                     Object[] var10002 = new Object[Xqedii_20rrwm8.Xqedii_2cdsxb1mr397w(856841899, 3)];
                     var10002[Xqedii_20rrwm8.Xqedii_k5uipdp7pa7f(-1199480077, 12)] = Integer.valueOf(var3);
                     var1.append(String.format(var10001, var10002));
                  }
            }
         }

         var1.append((char)Xqedii_20rrwm8.Xqedii_k5uipdp7pa7f(1584861288, 1));
      }
   }
}
