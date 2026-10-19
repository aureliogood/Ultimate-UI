package dev.xqedii.ultimateUI.gui.parser;

import dev.xqedii.ultimateUI.Xqedii_3ttuaja;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.bukkit.configuration.ConfigurationSection;

public abstract class TemplateExpressions extends TemplateBase {
   public static final String Xqedii_tqsqozsg14eb = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public double Xqedii_3iba6vo(Object var1, double var2) {
      if (((-61645968 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return var2;
      } else if (var1 instanceof Number var8) {
         return var8.doubleValue();
      } else {
         String var4 = var1.toString().trim();
         if (var4.isEmpty()) {
            return var2;
         } else {
            String var5 = this.Xqedii_21dpotd(var4);

            try {
               return Double.parseDouble(var5);
            } catch (Exception var7) {
               return this.Xqedii_3uzrpjh(var5, var2);
            }
         }
      }
   }

   public String Xqedii_21dpotd(String var1) {
      if (((572684589 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank() && var1.indexOf(Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(-1130660813, 15)) >= 0) {
         StringBuilder var2 = new StringBuilder(var1.length());

         for (int var3 = Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(1131480012, 19); var3 < var1.length(); var3++) {
            char var4 = var1.charAt(var3);
            if (var4 != Xqedii_3ttuaja.Xqedii_8508dod8u6m(-1420866045, 29)) {
               var2.append(var4);
            } else {
               int var5 = var3 - Xqedii_3ttuaja.Xqedii_8508dod8u6m(2054156890, 8);

               while (var5 >= 0 && Character.isWhitespace(var1.charAt(var5))) {
                  var5--;
               }

               int var6 = var3 + Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(1666937991, 22);

               while (var6 < var1.length() && Character.isWhitespace(var1.charAt(var6))) {
                  var6++;
               }

               int var7 = var5 >= 0 && var6 < var1.length() && Character.isDigit(var1.charAt(var5)) && Character.isDigit(var1.charAt(var6))
                  ? Xqedii_3ttuaja.Xqedii_25uokmtcxle3w(-1351307457, 18)
                  : Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(-384907722, 7);
               var2.append((char)(var7 != 0 ? Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(-1131441101, 11) : Xqedii_3ttuaja.Xqedii_25uokmtcxle3w(-1351569921, 4)));
            }
         }

         return var2.toString();
      } else {
         return var1;
      }
   }

   public double Xqedii_3uzrpjh(String var1, double var2) {
      if ((-1830035375 * (-1830035375 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            int[] var10000 = new int[Xqedii_3ttuaja.Xqedii_25uokmtcxle3w(-1351569602, 0)];
            var10000[Xqedii_3ttuaja.Xqedii_25uokmtcxle3w(-1351569601, 27)] = Xqedii_3ttuaja.Xqedii_25uokmtcxle3w(-1351569601, 7);
            int[] var4 = var10000;
            double var5 = this.Xqedii_kno1ts3(var1, var4);
            this.Xqedii_3a8eqj2(var1, var4);
            return var4[Xqedii_3ttuaja.Xqedii_8508dod8u6m(1027078317, 7)] == var1.length() && Double.isFinite(var5) ? var5 : var2;
         } catch (Exception var7) {
            return var2;
         }
      }
   }

   public double Xqedii_kno1ts3(String var1, int[] var2) {
      if ((-1677954171 * -1677954171 + -1677954171 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var3 = this.Xqedii_f87o6na(var1, var2);

         while (true) {
            this.Xqedii_3a8eqj2(var1, var2);
            if (var2[Xqedii_3ttuaja.Xqedii_8508dod8u6m(-1965829249, 27)] >= var1.length()) {
               return var3;
            }

            char var5 = var1.charAt(var2[Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(1131480012, 15)]);
            if (var5 != Xqedii_3ttuaja.Xqedii_25uokmtcxle3w(-1351569559, 1) && var5 != Xqedii_3ttuaja.Xqedii_8508dod8u6m(-186630988, 9)) {
               return var3;
            }

            var2[Xqedii_3ttuaja.Xqedii_25uokmtcxle3w(-1351569601, 8)] += Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(-1131480013, 25);
            double var6 = this.Xqedii_f87o6na(var1, var2);
            var3 = var5 == Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(997101805, 27) ? var3 + var6 : var3 - var6;
         }
      }
   }

   public double Xqedii_f87o6na(String var1, int[] var2) {
      if ((-1498138097 ^ -1498138097) != 0) {
         throw new IllegalStateException();
      } else {
         double var3 = this.Xqedii_1zwb0t9(var1, var2);

         while (true) {
            this.Xqedii_3a8eqj2(var1, var2);
            if (var2[Xqedii_3ttuaja.Xqedii_8508dod8u6m(2139804627, 19)] >= var1.length()) {
               return var3;
            }

            char var5 = var1.charAt(var2[Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(921243334, 31)]);
            if (var5 != Xqedii_3ttuaja.Xqedii_8508dod8u6m(2054167386, 8) && var5 != Xqedii_3ttuaja.Xqedii_25uokmtcxle3w(1332784954, 29)) {
               return var3;
            }

            var2[Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(1131480012, 22)] += Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(-1131480013, 19);
            double var6 = this.Xqedii_1zwb0t9(var1, var2);
            if (var5 == Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(-1131479685, 3)) {
               var3 *= var6;
            } else {
               if (var6 == Double.longBitsToDouble(Xqedii_3ttuaja.Xqedii_3ocfdqmppxyyx(-1429901229990513629L, 52))) {
                  throw new IllegalArgumentException(
                     Xqedii_3ttuaja.Xqedii_24u7eco6n9vpx("lKRNQfXkSWiaWmVl5VPjS+14KsePbo1tfJuJ+eRUATqUpIxA2nD2rv59RXD1Olc8dZ4UynG2XdF4B8F/")
                  );
               }

               var3 /= var6;
            }
         }
      }
   }

   public double Xqedii_1zwb0t9(String var1, int[] var2) {
      if ((255058022 * 255058022 - 255058022 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3a8eqj2(var1, var2);
         if (var2[Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(1131480012, 14)] >= var1.length()) {
            throw new IllegalArgumentException(
               Xqedii_3ttuaja.Xqedii_24u7eco6n9vpx(
                  "tTxy1lymT3hy3rpfffl/nnkANZsPACxIPwqx2/9a9EPdNli1QCx8/L0ItO8xqKZ26Tws11uj1VYv5IMOeOMEmUJpD42Z3cW8MiACbIhPKecZ32Fl"
               )
            );
         } else {
            char var3 = var1.charAt(var2[Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(417047611, 25)]);
            if (var3 == Xqedii_3ttuaja.Xqedii_25uokmtcxle3w(795914026, 31)) {
               var2[Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(460621667, 30)] += Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(-1131480013, 30);
               return this.Xqedii_1zwb0t9(var1, var2);
            } else if (var3 == Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(-584984042, 4)) {
               var2[Xqedii_3ttuaja.Xqedii_8508dod8u6m(1453235196, 30)] += Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(-1131480013, 30);
               return -this.Xqedii_1zwb0t9(var1, var2);
            } else if (var3 == Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(567953117, 12)) {
               var2[Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(-1938959843, 24)] += Xqedii_3ttuaja.Xqedii_8508dod8u6m(631744255, 28);
               double var4 = this.Xqedii_kno1ts3(var1, var2);
               this.Xqedii_3a8eqj2(var1, var2);
               if (var2[Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(-658055903, 20)] < var1.length()
                  && var1.charAt(var2[Xqedii_3ttuaja.Xqedii_25uokmtcxle3w(-1351569601, 6)]) == Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(-57738190, 27)) {
                  var2[Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(-1539630885, 9)] += Xqedii_3ttuaja.Xqedii_8508dod8u6m(-1077319191, 18);
                  return var4;
               } else {
                  throw new IllegalArgumentException(
                     Xqedii_3ttuaja.Xqedii_24u7eco6n9vpx(
                        "Baosf+ndk3064qmpN4drgmGwutIYdCF5VWfIy/hELoHCqupPeN3btyrnwph69dIT5dp/Tkxh1gsyDuhmWgzOri9CnrCGjBuKW7hSYIeSJFdTaQ=="
                     )
                  );
               }
            } else {
               return this.Xqedii_2svx16a(var1, var2);
            }
         }
      }
   }

   public double Xqedii_2svx16a(String var1, int[] var2) {
      if ((726279963 ^ 726279963) != 0) {
         throw new IllegalStateException();
      } else {
         int var3 = var2[Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(-1169968755, 5)];
         int var4 = Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(1955029787, 6);

         while (var2[Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(-1938959843, 24)] < var1.length()) {
            char var5 = var1.charAt(var2[Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(1131480012, 13)]);
            if (Character.isDigit(var5)) {
               var2[Xqedii_3ttuaja.Xqedii_25uokmtcxle3w(-1351569601, 12)] += Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(-1131480013, 21);
            } else {
               if (var5 != Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(-1131480034, 0) || var4 != 0) {
                  break;
               }

               var4 = Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(-1131480013, 13);
               var2[Xqedii_3ttuaja.Xqedii_8508dod8u6m(1776926661, 2)] += Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(-1131480013, 16);
            }
         }

         if (var3 == var2[Xqedii_3ttuaja.Xqedii_25uokmtcxle3w(-1351569601, 6)]) {
            throw new IllegalArgumentException(
               Xqedii_3ttuaja.Xqedii_24u7eco6n9vpx("b7kkxAPozmq+Tt5KVsSD3hGsyPvwgp4vf5qC6rs91wwp85zV0MRLGv6Z02FtbB6z83pogxQFuPZzWg==")
            );
         } else {
            return Double.parseDouble(var1.substring(var3, var2[Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(1131480012, 23)]));
         }
      }
   }

   public void Xqedii_3a8eqj2(String var1, int[] var2) {
      if ((90449326 ^ 90449326) != 0) {
         throw new IllegalStateException();
      } else {
         while (
            var2[Xqedii_3ttuaja.Xqedii_z2q13a7xmv4g(-658055903, 20)] < var1.length()
               && Character.isWhitespace(var1.charAt(var2[Xqedii_3ttuaja.Xqedii_25uokmtcxle3w(-1351569601, 4)]))
         ) {
            var2[Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(1131480012, 11)] += Xqedii_3ttuaja.Xqedii_1mnkcat5luh1p(-1131480013, 11);
         }
      }
   }

   public Object Xqedii_jufpfzb(Object var1, Object var2) {
      if ((-1241260987 ^ -1241260987) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null ? var1 : var2;
      }
   }

   public Map<String, Object> Xqedii_2uqaav9(Object var1) {
      if (((1904970335 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         Map var2;
         if (var1 instanceof Map var4) {
            var2 = var4;
         } else {
            if (!(var1 instanceof ConfigurationSection var3)) {
               return null;
            }

            var2 = var3.getValues((Xqedii_3ttuaja.Xqedii_8508dod8u6m(-122864329, 23) != 0));
         }

         LinkedHashMap var7 = new LinkedHashMap();

         for (Entry var6 : (Iterable<Entry>) (var2.entrySet())) {

            if (var6.getKey() != null) {
               var7.put(var6.getKey().toString(), var6.getValue());
            }
         }

         return var7;
      }
   }

   public Map<String, Object> Xqedii_2j81b8f(Map<String, Object> var1) {
      if (((310446902 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var2 = new LinkedHashMap();

         for (Entry var4 : var1.entrySet()) {
            var2.put((String)var4.getKey(), this.Xqedii_7v0t8w0(var4.getValue()));
         }

         return var2;
      }
   }

   public Object Xqedii_7v0t8w0(Object var1) {
      if ((-1936026954 * (-1936026954 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof Map var6) {
         LinkedHashMap var7 = new LinkedHashMap();

         for (Entry var9 : (Iterable<Entry>) (var6.entrySet())) {

            if (var9.getKey() != null) {
               var7.put(var9.getKey().toString(), this.Xqedii_7v0t8w0(var9.getValue()));
            }
         }

         return var7;
      } else if (!(var1 instanceof List var2)) {
         return var1;
      } else {
         ArrayList var3 = new ArrayList();

         for (Object var5 : var2) {
            var3.add(this.Xqedii_7v0t8w0(var5));
         }

         return var3;
      }
   }
}
