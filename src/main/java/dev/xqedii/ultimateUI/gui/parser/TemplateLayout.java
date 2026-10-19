package dev.xqedii.ultimateUI.gui.parser;

import dev.xqedii.ultimateUI.Xqedii_1f8fvac;
import dev.xqedii.ultimateUI.Xqedii_2aqdh8l;
import dev.xqedii.ultimateUI.Xqedii_3nizpcl;
import dev.xqedii.ultimateUI.Xqedii_mbeu089;
import dev.xqedii.ultimateUI.service.head.PlayerHeadFontService;
import java.util.List;
import java.util.Map;

public abstract class TemplateLayout extends TemplateOptions {
   public static final String Xqedii_3m3gq6h57lk5i = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final double Xqedii_3w494gx = 0.11666666666666667;

   public void Xqedii_12yv702(List<Xqedii_2aqdh8l> var1, double var2, double var4, Xqedii_3nizpcl var6, List<Map<String, Object>> var7) {
      if (((967679848 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!var1.isEmpty()) {
         if (Xqedii_mbeu089.Xqedii_1p7fwokzu46ad("mRRZxV/M0B6TN+tqa9It2mwJkBDxoS9MaTqxTcNr4eSzX21PNzmjbg==").equals(var6.Xqedii_g2awayo)) {
            this.Xqedii_2hfrde6(var1, var2, var4, var6, var7);
         } else {
            this.Xqedii_320dg4x(var1, var2, var4, var6, var7);
         }
      }
   }

   public void Xqedii_320dg4x(List<Xqedii_2aqdh8l> var1, double var2, double var4, Xqedii_3nizpcl var6, List<Map<String, Object>> var7) {
      if ((1205314060 * (1205314060 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var8 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_lk98gu92058r(-3738603064624188499L, 14));
         double var10 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_2dtb9de0tyilv(4935503523619884248L, 57));
         double var12 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_2dtb9de0tyilv(6994646270197642547L, 51));
         int var14 = Xqedii_mbeu089.Xqedii_2k2zastcbaqfc(-674298316, 16);

         for (Xqedii_2aqdh8l var16 : var1) {
            if (var14 >= var6.Xqedii_1t7whbb) {
               var8 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_1ejz4hi7obhdm(2632496005979610306L, 41));
               var10 += var12 + var6.Xqedii_3804lg3;
               var12 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_lk98gu92058r(5915728196527726032L, 38));
               var14 = Xqedii_mbeu089.Xqedii_37dem9dkrwqay(2011280762, 17);
            }

            this.Xqedii_nmw5ujl(var16.Xqedii_8lku9e2, var2 + var8, var4 + var10);
            var7.addAll(var16.Xqedii_8lku9e2);
            var8 += var16.Xqedii_1twpnbn + var6.Xqedii_3804lg3;
            var12 = Math.max(var12, this.Xqedii_2npd5e6(var16, var6));
            var14++;
         }
      }
   }

   public void Xqedii_2hfrde6(List<Xqedii_2aqdh8l> var1, double var2, double var4, Xqedii_3nizpcl var6, List<Map<String, Object>> var7) {
      if ((75555778 * (75555778 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var8 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_1ejz4hi7obhdm(2632496005979610306L, 59));
         double var10 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_2dtb9de0tyilv(7948335529456059518L, 9));
         double var12 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_2azqp9s8n7uah(-8792339401409059740L, 29));
         int var14 = Xqedii_mbeu089.Xqedii_37dem9dkrwqay(-1644663458, 15);

         for (Xqedii_2aqdh8l var16 : var1) {
            if (var14 >= var6.Xqedii_1t7whbb) {
               var10 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_2dtb9de0tyilv(-1809072038622690233L, 5));
               var8 += var12 + var6.Xqedii_3804lg3;
               var12 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_lk98gu92058r(-4477416812858361124L, 18));
               var14 = Xqedii_mbeu089.Xqedii_2k2zastcbaqfc(-674298316, 19);
            }

            this.Xqedii_nmw5ujl(var16.Xqedii_8lku9e2, var2 + var8, var4 + var10);
            var7.addAll(var16.Xqedii_8lku9e2);
            var10 += this.Xqedii_2npd5e6(var16, var6) + var6.Xqedii_3804lg3;
            var12 = Math.max(var12, var16.Xqedii_1twpnbn);
            var14++;
         }
      }
   }

   public double Xqedii_2npd5e6(Xqedii_2aqdh8l var1, Xqedii_3nizpcl var2) {
      if ((-97164044 * -97164044 + -97164044 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var2 != null && Double.isFinite(var2.Xqedii_3a27l09) ? var2.Xqedii_3a27l09 : var1.Xqedii_1gzzfwi;
      }
   }

   public double Xqedii_1qqbufd(Map<String, Object> var1) {
      if ((1453448673 * 1453448673 + 1453448673 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var2 = this.Xqedii_10dn06d(var1);
         if (!Xqedii_mbeu089.Xqedii_1p7fwokzu46ad("HFnnhEwoa+LsAFtpUUr1TfrjeNqpukR0+raDz3velF0BDP6j").equals(this.Xqedii_n1b0nzi(var1))) {
            return var2;
         } else {
            return this.Xqedii_1ijhail(var1)
               ? this.Xqedii_2c2l5vv(var1)
               : Math.max(
                  Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_2dtb9de0tyilv(3587615326547413120L, 6)),
                  var2 * Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_lk98gu92058r(-6788433285301313074L, 13))
               );
         }
      }
   }

   public boolean Xqedii_1ijhail(Map<String, Object> var1) {
      if ((-1091632245 * (-1091632245 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Object var2 = var1 == null ? null : var1.get(Xqedii_mbeu089.Xqedii_1p7fwokzu46ad("HFnnhEwoa+LsAFtpUUr1TfrjeNqpukR0+raDz3velF0BDP6j"));
         return ((var2 != null && PlayerHeadFontService.containsPlaceholder(var2.toString())
            ? Xqedii_mbeu089.Xqedii_57urrhmsv3ff(-1246475696, 14)
            : Xqedii_mbeu089.Xqedii_57urrhmsv3ff(-691001022, 16)) != 0);
      }
   }

   public Xqedii_1f8fvac Xqedii_1u294kd(List<Map<String, Object>> var1) {
      if ((-342801735 * -342801735 - -342801735 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_gsfp0rq(var1, (Xqedii_mbeu089.Xqedii_276oiw4a0ik20(-53938435, 21) != 0));
      }
   }

   public Xqedii_1f8fvac Xqedii_gsfp0rq(List<Map<String, Object>> var1, boolean var2) {
      if ((692457428 * (692457428 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var3 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_2azqp9s8n7uah(431032635445716891L, 11));
         double var5 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_2dtb9de0tyilv(-2120961445338801948L, 21));
         double var7 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_1ejz4hi7obhdm(2632496005979610818L, 21));
         double var9 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_1ejz4hi7obhdm(2632496005979086018L, 31));

         for (Map var12 : var1) {
            double var13 = this.Xqedii_32d72vu(var12);
            double var15 = this.Xqedii_1eo8rog(var12);
            double var17 = this.Xqedii_2c2l5vv(var12);
            double var19 = var2 ? this.Xqedii_1qqbufd(var12) : this.Xqedii_10dn06d(var12);
            var3 = Math.min(var3, var13);
            var5 = Math.min(var5, var15);
            var7 = Math.max(var7, var13 + var17);
            var9 = Math.max(var9, var15 + var19);
         }

         return Double.isFinite(var3) && Double.isFinite(var5) && Double.isFinite(var7) && Double.isFinite(var9)
            ? new Xqedii_1f8fvac(var3, var5, var7, var9)
            : new Xqedii_1f8fvac(
               Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_2dtb9de0tyilv(5632047432700558958L, 17)),
               Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_1ejz4hi7obhdm(2632496005979610306L, 63)),
               Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_lk98gu92058r(7173617067658527048L, 48)),
               Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_lk98gu92058r(-8014406648906846590L, 41))
            );
      }
   }

   public Xqedii_1f8fvac Xqedii_mmox1zo(List<Map<String, Object>> var1, String var2) {
      if ((-604612838 * -604612838 + -604612838 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3cz6pxk(var1, var2, (Xqedii_mbeu089.Xqedii_2k2zastcbaqfc(-674298316, 31) != 0));
      }
   }

   public Xqedii_1f8fvac Xqedii_3cz6pxk(List<Map<String, Object>> var1, String var2, boolean var3) {
      if (((-1517755494 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null && !var2.isBlank()) {
         double var4 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_1ejz4hi7obhdm(3209238233259744450L, 60));
         double var6 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_2dtb9de0tyilv(5218096102276625009L, 28));
         double var8 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_2azqp9s8n7uah(-8792339401409012892L, 20));
         double var10 = Double.longBitsToDouble(Xqedii_mbeu089.Xqedii_lk98gu92058r(-2520571521748263743L, 26));

         for (Map var13 : var1) {
            if (var13 != null) {
               Object var14 = var13.get(
                  Xqedii_mbeu089.Xqedii_1p7fwokzu46ad("d1zN6P+doJ595v7ZuCszqWo1iCQI/xL9z7DxTrVk0o6kknpi6Y3hEfhPqY7u/kdlIj5/7QYFVz0hUErnJ64VJ+qsiHE=")
               );
               if (var14 != null && var2.equals(var14.toString())) {
                  double var15 = this.Xqedii_32d72vu(var13);
                  double var17 = this.Xqedii_1eo8rog(var13);
                  double var19 = this.Xqedii_2c2l5vv(var13);
                  double var21 = var3 ? this.Xqedii_1qqbufd(var13) : this.Xqedii_10dn06d(var13);
                  var4 = Math.min(var4, var15);
                  var6 = Math.min(var6, var17);
                  var8 = Math.max(var8, var15 + var19);
                  var10 = Math.max(var10, var17 + var21);
               }
            }
         }

         return Double.isFinite(var4) && Double.isFinite(var6) && Double.isFinite(var8) && Double.isFinite(var10)
            ? new Xqedii_1f8fvac(var4, var6, var8, var10)
            : null;
      } else {
         return null;
      }
   }

   public void Xqedii_nmw5ujl(List<Map<String, Object>> var1, double var2, double var4) {
      if ((-1061337307 ^ -1061337307) != 0) {
         throw new IllegalStateException();
      } else {
         for (Map var7 : var1) {
            Object var8 = this.Xqedii_132c64o(
               var7,
               Xqedii_mbeu089.Xqedii_1p7fwokzu46ad("qu0y0h09tDok732RYTpJkt0pUAspRdvgg88ijk3l01ZYxPssQCaEz2jr23hhDnD1"),
               Xqedii_mbeu089.Xqedii_1p7fwokzu46ad("yf7101E0VzmKlex0yzuLKBx8Z8CYZkGV5nZCVgNI")
            );
            Object var9 = this.Xqedii_132c64o(
               var7,
               Xqedii_mbeu089.Xqedii_1p7fwokzu46ad("1H6igOmWDXEvQyQbtMxWteR9zojCRRuqLGFl5k7jc6TiNA0Ij9dgesW5YwDGjDGk"),
               Xqedii_mbeu089.Xqedii_1p7fwokzu46ad("ZSLWyC3kL4BVQa41sk82+ySRPzARvLMRzf1HdDIB")
            );
            Object var10 = this.Xqedii_1woo5bh(var8) ? this.Xqedii_2ueoawo(var2, var8.toString()) : this.Xqedii_32d72vu(var7) + var2;
            Object var11 = this.Xqedii_1woo5bh(var9) ? this.Xqedii_2ueoawo(var4, var9.toString()) : this.Xqedii_1eo8rog(var7) + var4;
            this.Xqedii_37smwmg(var7, var10, var11);
         }
      }
   }

   public boolean Xqedii_19quu1d(String var1) {
      if (((-2026402761 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((!Xqedii_mbeu089.Xqedii_1p7fwokzu46ad("EWphbnjUkPZRbyqySK52J9IlQPU3r5GMNmtjTJyIDVVH87ksWntejHxqgMWbaBb3").equals(var1)
            ? Xqedii_mbeu089.Xqedii_57urrhmsv3ff(190530725, 10)
            : Xqedii_mbeu089.Xqedii_37dem9dkrwqay(-1089623085, 20)) != 0);
      }
   }
}
