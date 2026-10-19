package dev.xqedii.ultimateUI;

import java.util.Locale;

public final class Xqedii_170zfgx {
   public static final String Xqedii_1iobj4p3yqy7d = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public static double Xqedii_5d87122(double var0) {
      if ((1998392654 * (1998392654 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (!Double.isFinite(var0)) {
         return Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(-2051889855569761903L, 44));
      } else {
         double var2 = var0 % Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(8797396024338663180L, 61));
         if (var2 < Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3ee3ckdz6pv40(-6968906750898834183L, 11))) {
            var2 += Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(-7934350521755727511L, 36));
         }

         return var2;
      }
   }

   public static double Xqedii_12k2o8j(String var0) {
      if (((-669155970 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var1 = Xqedii_4ea1q5n(var0);
         if (var1.length() != Xqedii_r15g1rt.Xqedii_2lemon9c5m9s5(-580386757, 24)) {
            return Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3ee3ckdz6pv40(4296392765473769848L, 35));
         } else {
            int var2;
            try {
               var2 = Integer.parseInt(var1, Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(186485391, 12));
            } catch (NumberFormatException var17) {
               return Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(1793612299452696462L, 54));
            }

            double var3 = (var2 >> Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(-985168498, 27) & Xqedii_r15g1rt.Xqedii_3hb59cs971lly(-227107192, 11))
               / Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2375633199931369299L, 13));
            double var5 = (var2 >> Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(1491620984, 15) & Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(-730310301, 31))
               / Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2663863576107127009L, 25));
            double var7 = (var2 & Xqedii_r15g1rt.Xqedii_2lemon9c5m9s5(677904444, 27))
               / Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_9t5v8xgqmiyq(4428822143070800111L, 14));
            double var9 = Math.max(var3, Math.max(var5, var7));
            double var11 = Math.min(var3, Math.min(var5, var7));
            double var13 = var9 - var11;
            if (var13 < Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(-1515646844457149227L, 47))) {
               return Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3ee3ckdz6pv40(-7116136207979976714L, 57));
            } else {
               double var15;
               if (Math.abs(var9 - var3) < Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2161638232767033840L, 16))) {
                  var15 = (var5 - var7) / var13 % Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(-5419816331207320508L, 27));
               } else if (Math.abs(var9 - var5) < Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(5006347532844116189L, 9))) {
                  var15 = (var7 - var3) / var13 + Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3ee3ckdz6pv40(-5044691909818935421L, 39));
               } else {
                  var15 = (var3 - var5) / var13 + Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3ee3ckdz6pv40(-5409399027811715265L, 52));
               }

               return Xqedii_5d87122(var15 * Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(5099283470280831464L, 7)));
            }
         }
      }
   }

   public static String Xqedii_2p150sg(double var0) {
      if ((-164275516 * -164275516 + -164275516 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var2 = Xqedii_5d87122(var0) / Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3ee3ckdz6pv40(8357360255380303623L, 40));
         int var4 = (int)Math.floor(var2) % Xqedii_r15g1rt.Xqedii_eyeo0lsh96ej(2147349687, 26);
         if (var4 < 0) {
            var4 += 6;
         }

         double var5 = var2 - Math.floor(var2);
         double var7;
         double var9;
         double var11;
         switch (var4) {
            case 0:
               var7 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-1509816171569393825L, 62));
               var9 = var5;
               var11 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2663863576083083425L, 7));
               break;
            case 1:
               var7 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2663441501056970913L, 49)) - var5;
               var9 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2663863524560253089L, 36));
               var11 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2663863576083083425L, 21));
               break;
            case 2:
               var7 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3ee3ckdz6pv40(5735884532020280743L, 63));
               var9 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(8147806826483447270L, 13));
               var11 = var5;
               break;
            case 3:
               var7 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_9t5v8xgqmiyq(-4218089141480548108L, 2));
               var9 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2879965989452689569L, 58)) - var5;
               var11 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_9t5v8xgqmiyq(-4218089141482462988L, 23));
               break;
            case 4:
               var7 = var5;
               var9 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2663863576083083425L, 52));
               var11 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(-1025943881960344376L, 43));
               break;
            default:
               var7 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2663863576086230177L, 22));
               var9 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2663863576083083425L, 45));
               var11 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2663652538570027169L, 48)) - var5;
         }

         int var13 = Xqedii_1ud4czg.Xqedii_3773gw7(
            (int)Math.round(var7 * Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2807978764158942042L, 12))),
            Xqedii_r15g1rt.Xqedii_eyeo0lsh96ej(1744696503, 27),
            Xqedii_r15g1rt.Xqedii_3hb59cs971lly(-227107192, 11)
         );
         int var14 = Xqedii_1ud4czg.Xqedii_3773gw7(
            (int)Math.round(var9 * Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(-7413425935251380074L, 32))),
            Xqedii_r15g1rt.Xqedii_3hb59cs971lly(375951143, 23),
            Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(1703891425, 17)
         );
         int var15 = Xqedii_1ud4czg.Xqedii_3773gw7(
            (int)Math.round(var11 * Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(5516659069229085771L, 31))),
            Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(-1460620856, 0),
            Xqedii_r15g1rt.Xqedii_2lemon9c5m9s5(-664272699, 0)
         );
         Locale var10000 = Locale.ROOT;
         String var10001 = Xqedii_r15g1rt.Xqedii_3vao8hav0jomk("HTF5wUprpDs/87zIYHBoZ2MjgY1D3tUhjjmVUqzEDNhCJsczPj75VWIuKuLKPUD3AVZWCg==");
         Object[] var10002 = new Object[Xqedii_r15g1rt.Xqedii_eyeo0lsh96ej(1744696455, 4)];
         var10002[Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(-1970336996, 28)] = var13;
         var10002[Xqedii_r15g1rt.Xqedii_2lemon9c5m9s5(-664272837, 11)] = var14;
         var10002[Xqedii_r15g1rt.Xqedii_2lemon9c5m9s5(-664272709, 7)] = var15;
         return String.format(var10000, var10001, var10002);
      }
   }

   public static double[] Xqedii_3c7y13v(String var0) {
      if ((377113929 * 377113929 - 377113929 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var1 = Xqedii_4ea1q5n(var0);
         if (var1.length() != Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(745777724, 14)) {
            double[] var24 = new double[Xqedii_r15g1rt.Xqedii_3hb59cs971lly(802233934, 24)];
            var24[Xqedii_r15g1rt.Xqedii_2lemon9c5m9s5(664272836, 18)] = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_9t5v8xgqmiyq(-4218089141480548108L, 41));
            var24[Xqedii_r15g1rt.Xqedii_2lemon9c5m9s5(-664272837, 21)] = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_9t5v8xgqmiyq(-4218089141480548108L, 62));
            var24[Xqedii_r15g1rt.Xqedii_3hb59cs971lly(1754212119, 31)] = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_9t5v8xgqmiyq(4248678157975984373L, 3));
            return var24;
         } else {
            int var2;
            try {
               var2 = Integer.parseInt(var1, Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(1672565217, 17));
            } catch (NumberFormatException var21) {
               double[] var10000 = new double[Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(372864286, 13)];
               var10000[Xqedii_r15g1rt.Xqedii_3hb59cs971lly(-454898415, 12)] = Double.longBitsToDouble(
                  Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(3587224598905392924L, 55)
               );
               var10000[Xqedii_r15g1rt.Xqedii_eyeo0lsh96ej(1744696471, 5)] = Double.longBitsToDouble(
                  Xqedii_r15g1rt.Xqedii_9t5v8xgqmiyq(-4218089141480548108L, 59)
               );
               var10000[Xqedii_r15g1rt.Xqedii_3hb59cs971lly(1016880546, 9)] = Double.longBitsToDouble(
                  Xqedii_r15g1rt.Xqedii_9t5v8xgqmiyq(-4218088644338083596L, 42)
               );
               return var10000;
            }

            double var3 = (var2 >> Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(-660016975, 24) & Xqedii_r15g1rt.Xqedii_eyeo0lsh96ej(1744571063, 9))
               / Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2663863571557396641L, 34));
            double var5 = (var2 >> Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(354293306, 29) & Xqedii_r15g1rt.Xqedii_3hb59cs971lly(1016965026, 9))
               / Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2663863577470869665L, 31));
            double var7 = (var2 & Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(-1295537936, 16))
               / Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_9t5v8xgqmiyq(5005282895374293323L, 18));
            double var9 = Math.max(var3, Math.max(var5, var7));
            double var11 = Math.min(var3, Math.min(var5, var7));
            double var13 = var9 - var11;
            double var17 = var9 < Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(4551295448315873891L, 18))
               ? Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_9t5v8xgqmiyq(-4218089141480548108L, 9))
               : var13 / var9;
            double var19 = Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3ee3ckdz6pv40(8993588108743142714L, 2));
            if (var13 > Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3ee3ckdz6pv40(-3936061066922838085L, 9))) {
               if (Math.abs(var9 - var3) < Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_9t5v8xgqmiyq(-8441320220140510313L, 62))) {
                  var19 = (var5 - var7) / var13 % Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(-8604521682970619685L, 16));
               } else if (Math.abs(var9 - var5) < Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_9t5v8xgqmiyq(3663365673681168434L, 24))) {
                  var19 = (var7 - var3) / var13 + Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3ee3ckdz6pv40(-7858650234259377346L, 20));
               } else {
                  var19 = (var3 - var5) / var13 + Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_9t5v8xgqmiyq(-4218089003907376908L, 39));
               }

               var19 = (
                     var19 * Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2663863576077730465L, 24))
                        + Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3ee3ckdz6pv40(-3083673252825028753L, 7))
                  )
                  % Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3ee3ckdz6pv40(-84521749751021092L, 46));
            }

            double[] var23 = new double[Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(1491457144, 15)];
            var23[Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(1417173220, 31)] = var19;
            var23[Xqedii_r15g1rt.Xqedii_eyeo0lsh96ej(1740502199, 22)] = var17;
            var23[Xqedii_r15g1rt.Xqedii_eyeo0lsh96ej(1736307895, 22)] = var9;
            return var23;
         }
      }
   }

   public static String Xqedii_1273r4j(double var0, double var2, double var4) {
      if ((-1730629936 * -1730629936 + -1730629936 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var6 = Xqedii_5d87122(var0) / Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(2578043030115259091L, 37));
         double var8 = Xqedii_1ud4czg.Xqedii_gu7txdi(var2);
         double var10 = Xqedii_1ud4czg.Xqedii_gu7txdi(var4);
         int var12 = (int)var6;
         double var13 = var6 - var12;
         double var15 = var10 * (Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_1v51e1ydye8k5(3619892202083651885L, 33)) - var8);
         double var17 = var10 * (Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_9t5v8xgqmiyq(-4218089141480495244L, 19)) - var8 * var13);
         double var19 = var10
            * (
               Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2663876765927649441L, 44))
                  - var8 * (Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2663861927352512673L, 41)) - var13)
            );
         double var21;
         double var23;
         double var25;
         switch (var12 % Xqedii_r15g1rt.Xqedii_eyeo0lsh96ej(1743123639, 18)) {
            case 0:
               var21 = var10;
               var23 = var19;
               var25 = var15;
               break;
            case 1:
               var21 = var17;
               var23 = var10;
               var25 = var15;
               break;
            case 2:
               var21 = var15;
               var23 = var10;
               var25 = var19;
               break;
            case 3:
               var21 = var15;
               var23 = var17;
               var25 = var10;
               break;
            case 4:
               var21 = var19;
               var23 = var15;
               var25 = var10;
               break;
            default:
               var21 = var10;
               var23 = var15;
               var25 = var17;
         }

         int var27 = Xqedii_1ud4czg.Xqedii_3773gw7(
            (int)Math.round(var21 * Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3gfqifc43bjoe(-2807978764158942042L, 12))),
            Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(-256784216, 8),
            Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(-1547515106, 2)
         );
         int var28 = Xqedii_1ud4czg.Xqedii_3773gw7(
            (int)Math.round(var23 * Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3ee3ckdz6pv40(-7899860306923503801L, 17))),
            Xqedii_r15g1rt.Xqedii_3hb59cs971lly(751902286, 24),
            Xqedii_r15g1rt.Xqedii_3hb59cs971lly(-454214383, 12)
         );
         int var29 = Xqedii_1ud4czg.Xqedii_3773gw7(
            (int)Math.round(var25 * Double.longBitsToDouble(Xqedii_r15g1rt.Xqedii_3ee3ckdz6pv40(-830591008268916261L, 5))),
            Xqedii_r15g1rt.Xqedii_3hb59cs971lly(1148795059, 2),
            Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(-730310301, 31)
         );
         Locale var10000 = Locale.ROOT;
         String var10001 = Xqedii_r15g1rt.Xqedii_3vao8hav0jomk("HTF5wUprpDs/87zIYHBoZ2MjgY1D3tUhjjmVUqzEDNhCJsczPj75VWIuKuLKPUD3AVZWCg==");
         Object[] var10002 = new Object[Xqedii_r15g1rt.Xqedii_3hb59cs971lly(-1573086113, 1)];
         var10002[Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(-954031166, 18)] = var27;
         var10002[Xqedii_r15g1rt.Xqedii_3hb59cs971lly(-786543059, 0)] = var28;
         var10002[Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(1009545898, 6)] = var29;
         return String.format(var10000, var10001, var10002);
      }
   }

   public static String Xqedii_4ea1q5n(String var0) {
      if ((703958245 * 703958245 + 703958245 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 == null) {
         return Xqedii_r15g1rt.Xqedii_3vao8hav0jomk("TqdcuVa2TQmcgs/m2yt/TPatCe6OASq/Fb9eLA==");
      } else {
         String var1 = var0.trim();
         if (var1.startsWith(Xqedii_r15g1rt.Xqedii_3vao8hav0jomk("pTE+KCAuLEKjLgU7Go3jZlURD6lGHZfao5fBMoS7"))) {
            var1 = var1.substring(Xqedii_r15g1rt.Xqedii_eyeo0lsh96ej(1744696499, 2));
         }

         if (var1.length() != Xqedii_r15g1rt.Xqedii_eyeo0lsh96ej(1744696535, 4)) {
            return Xqedii_r15g1rt.Xqedii_3vao8hav0jomk("TqdcuVa2TQmcgs/m2yt/TPatCe6OASq/Fb9eLA==");
         } else {
            for (int var2 = Xqedii_r15g1rt.Xqedii_3hb59cs971lly(877106059, 30); var2 < var1.length(); var2++) {
               char var3 = var1.charAt(var2);
               int var4 = var3 >= Xqedii_r15g1rt.Xqedii_2lemon9c5m9s5(-578289605, 21) && var3 <= Xqedii_r15g1rt.Xqedii_eyeo0lsh96ej(1744693303, 7)
                  ? Xqedii_r15g1rt.Xqedii_2lemon9c5m9s5(-664272837, 25)
                  : Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(-256784216, 8);
               int var5 = var3 >= Xqedii_r15g1rt.Xqedii_2lemon9c5m9s5(-664260549, 7) && var3 <= Xqedii_r15g1rt.Xqedii_2lemon9c5m9s5(308805691, 25)
                  ? Xqedii_r15g1rt.Xqedii_eyeo0lsh96ej(1744696499, 2)
                  : Xqedii_r15g1rt.Xqedii_3hb59cs971lly(1902545138, 19);
               int var6 = var3 >= Xqedii_r15g1rt.Xqedii_eyeo0lsh96ej(670954663, 30) && var3 <= Xqedii_r15g1rt.Xqedii_eyeo0lsh96ej(1866331319, 21)
                  ? Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(959782422, 21)
                  : Xqedii_r15g1rt.Xqedii_2kdh6lghqryfi(1199935045, 3);
               if (var4 == 0 && var5 == 0 && var6 == 0) {
                  return Xqedii_r15g1rt.Xqedii_3vao8hav0jomk("TqdcuVa2TQmcgs/m2yt/TPatCe6OASq/Fb9eLA==");
               }
            }

            return var1.toLowerCase(Locale.ROOT);
         }
      }
   }
}
