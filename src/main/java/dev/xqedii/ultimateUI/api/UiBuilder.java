package dev.xqedii.ultimateUI.api;

import dev.xqedii.ultimateUI.Xqedii_11o45ft;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class UiBuilder {
   public static final String Xqedii_2vqbwllegabzl = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final String Xqedii_2of5vjj;
   public double Xqedii_23wc22e = Double.longBitsToDouble(Xqedii_11o45ft.Xqedii_3qninncgrvqtb(4560872003307507317L, 15));
   public double Xqedii_2p35d3c = Double.longBitsToDouble(Xqedii_11o45ft.Xqedii_3m9rvlceoyyqc(7659548329129944132L, 51));
   public final List<Map<String, Object>> Xqedii_2hf8ovc = new ArrayList<>();
   public double Xqedii_onu42z1 = Double.longBitsToDouble(Xqedii_11o45ft.Xqedii_i84o9gtbhcxq(3260545708329643536L, 61));

   public UiBuilder(String var1) {
      this.Xqedii_2of5vjj = var1;
   }

   public String getName() {
      if (((891448131 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2of5vjj;
      }
   }

   public UiBuilder screenSize(double var1, double var3) {
      if ((-1081127982 ^ -1081127982) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_23wc22e = var1;
         this.Xqedii_2p35d3c = var3;
         return this;
      }
   }

   public boolean hasScreenSize() {
      if ((1195000459 ^ 1195000459) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_23wc22e > Double.longBitsToDouble(Xqedii_11o45ft.Xqedii_3qninncgrvqtb(4560872003307515517L, 48))
               && this.Xqedii_2p35d3c > Double.longBitsToDouble(Xqedii_11o45ft.Xqedii_i84o9gtbhcxq(-8016707937705503820L, 17))
            ? Xqedii_11o45ft.Xqedii_wyrx3fxp4j9q(1230301686, 20)
            : Xqedii_11o45ft.Xqedii_3lx96nebszc42(-1158521619, 28)) != 0);
      }
   }

   public double getScreenWidth() {
      if ((-871342721 * (-871342721 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_23wc22e;
      }
   }

   public double getScreenHeight() {
      if (((-1794996910 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2p35d3c;
      }
   }

   public UiBuilder addText(String var1, String var2, double var3, double var5, double var7, double var9, String var11) {
      if ((430979576 * 430979576 - 430979576 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Map var12 = this.Xqedii_21mpclc(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("19FXFsRQf28KqLuuFPTMVlYvmOIsqmx57Fg/Y/v7HHI+Slnc"), var1, var3, var5, var7, var9);
         var12.put(
            Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("19FXFsRQf28KqLuuFPTMVlYvmOIsqmx57Fg/Y/v7HHI+Slnc"),
            var2 == null ? Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("fLTkRCTPzxi639kmRVoKvU3yktecoCRJx4ymYQ==") : var2
         );
         if (var11 != null && !var11.isBlank()) {
            var12.put(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("RVqWq4WhkwyReu8xd5MNlKtaIYO+TedhSrK8TE+zIg0zZudOm9I="), Xqedii_131h06n(var11));
         }

         this.Xqedii_2hf8ovc.add(var12);
         return this;
      }
   }

   public UiBuilder addText(String var1, String var2, double var3, double var5) {
      if ((472007627 ^ 472007627) != 0) {
         throw new IllegalStateException();
      } else {
         return this.addText(
            var1,
            var2,
            var3,
            var5,
            Double.longBitsToDouble(Xqedii_11o45ft.Xqedii_3m9rvlceoyyqc(7667912314082436164L, 55)),
            Double.longBitsToDouble(Xqedii_11o45ft.Xqedii_3m9rvlceoyyqc(5353039565625631844L, 7)),
            null
         );
      }
   }

   public UiBuilder addBlock(String var1, double var2, double var4, double var6, double var8, String var10) {
      if (((1991045290 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Map var11 = this.Xqedii_21mpclc(
            Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("nHW8NKiI4UXMDaZq5VAHz0jR4d766e9hvpeOl6DnYfs/EtKixcQ="), var1, var2, var4, var6, var8
         );
         var11.put(
            Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("RVqWq4WhkwyReu8xd5MNlKtaIYO+TedhSrK8TE+zIg0zZudOm9I="),
            Xqedii_131h06n(
               var10 != null && !var10.isBlank() ? var10 : Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("lWS7We/cKZ4ID+fAsE+rNOOjarya+BoMkGEZi7q+I7NoSqW3W4dXMg==")
            )
         );
         this.Xqedii_2hf8ovc.add(var11);
         return this;
      }
   }

   public UiBuilder addItem(String var1, String var2, double var3, double var5, double var7, double var9) {
      if ((840553168 * (840553168 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Map var11 = this.Xqedii_21mpclc(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("7FKUBu5JpBqrTM5dInhLQ1Sqit5O1pTNqpFeVLBDLciTqYzh"), var1, var3, var5, var7, var9);
         var11.put(
            Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("7FKUBu5JpBqrTM5dInhLQ1Sqit5O1pTNqpFeVLBDLciTqYzh"),
            var2 != null && !var2.isBlank() ? var2 : Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("tjLdEPqQ35bji6C2+QyrEZ4CQ4zeBQvecl0xgLSErKwGYuE/p1w=")
         );
         this.Xqedii_2hf8ovc.add(var11);
         return this;
      }
   }

   public UiBuilder addRaw(Map<String, Object> var1) {
      if ((-205126179 * -205126179 - -205126179 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null && !var1.isEmpty()) {
            this.Xqedii_2hf8ovc.add(new LinkedHashMap<>(var1));
         }

         return this;
      }
   }

   public UiBuilder property(String var1, String var2, Object var3) {
      if ((-334646881 * -334646881 - -334646881 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank() && var2 != null && !var2.isBlank()) {
         Map var4 = Xqedii_1gfe4vw(this.Xqedii_2hf8ovc, var1);
         if (var4 != null) {
            String[] var5 = var2.trim().split(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("+JlICRjBkkUOIbuLyPF5wnQV+gkKDfTGOwJjjihhY9Q="));
            Map var6 = var4;

            for (int var7 = Xqedii_11o45ft.Xqedii_wyrx3fxp4j9q(1229253110, 14); var7 < var5.length - Xqedii_11o45ft.Xqedii_3lx96nebszc42(1158521618, 2); var7++) {
               Object var8 = var6.get(var5[var7]);
               if (!(var8 instanceof Map)) {
                  var8 = new LinkedHashMap();
                  var6.put(var5[var7], var8);
               }

               var6 = (Map)var8;
            }

            var6.put(var5[var5.length - Xqedii_11o45ft.Xqedii_36rwjshpxj8iv(1704694450, 13)], var3);
         }

         return this;
      } else {
         return this;
      }
   }

   public UiBuilder draggable(String var1) {
      if ((855893213 * 855893213 + 855893213 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.property(
            var1,
            Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("ZuSBgKrbUfh28BzWOI0uD5bSEbSZrSRlqLtgD3ctY0idvI1ABBIAyFQCCzQlXg=="),
            Boolean.valueOf((Xqedii_11o45ft.Xqedii_3lx96nebszc42(1158521618, 19) != 0))
         );
      }
   }

   public UiBuilder listLayout(String var1, Map<String, Object> var2) {
      if ((-1659545993 * -1659545993 + -1659545993 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.property(
            var1,
            Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("PTJMPzGQsAXGg6NQjc2P5TsB/otHFEfO52wqJKd5hkGbCiFlHaMe/rxZD8p9Q3/c"),
            var2 == null ? new LinkedHashMap() : new LinkedHashMap(var2)
         );
      }
   }

   public UiBuilder listLayout(String var1, String var2, Object var3) {
      if ((-1381836259 ^ -1381836259) != 0) {
         throw new IllegalStateException();
      } else {
         return var2 != null && !var2.isBlank() ? this.property(var1, Xqedii_35z7nziuxsy5i(var2.trim()), var3) : this;
      }
   }

   public UiBuilder addChild(String var1, Map<String, Object> var2) {
      if (((-760826214 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isEmpty()) {
         Map var3 = Xqedii_1gfe4vw(this.Xqedii_2hf8ovc, var1);
         if (var3 == null) {
            return this;
         } else {
            ArrayList var5 = var3.get(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("3VpW70CPJvsNcOQTAFLh2ROFhmqysM+NcbWh5qR5ccmWDBlGxirKxG+Dr84=")) instanceof List var6
               ? new ArrayList(var6)
               : new ArrayList();
            var5.add(new LinkedHashMap(var2));
            var3.put(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("3VpW70CPJvsNcOQTAFLh2ROFhmqysM+NcbWh5qR5ccmWDBlGxirKxG+Dr84="), var5);
            return this;
         }
      } else {
         return this;
      }
   }

   public static Map<String, Object> Xqedii_1gfe4vw(List<?> var0, String var1) {
      if (((-1132661683 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         for (Object var3 : var0) {
            if (var3 instanceof Map var4) {
               if (var1.equals(String.valueOf(var4.get(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("RtdYio+2Dz82DHwA0QYRH5qnHIjGbV1Jaa4p50T43c4="))))) {
                  return var4;
               }

               if (var4.get(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("3VpW70CPJvsNcOQTAFLh2ROFhmqysM+NcbWh5qR5ccmWDBlGxirKxG+Dr84=")) instanceof List var5) {
                  Map var7 = Xqedii_1gfe4vw(var5, var1);
                  if (var7 != null) {
                     return var7;
                  }
               }
            }
         }

         return null;
      }
   }

   public List<Map<String, Object>> buildBlocks() {
      if ((1247812998 * (1247812998 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var1 = new ArrayList(this.Xqedii_2hf8ovc.size());

         for (Map var3 : this.Xqedii_2hf8ovc) {
            var1.add(new LinkedHashMap(var3));
         }

         return var1;
      }
   }

   public Map<String, Object> Xqedii_21mpclc(String var1, String var2, double var3, double var5, double var7, double var9) {
      if ((-920142617 ^ -920142617) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var11 = new LinkedHashMap();
         var11.put(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("NsxcAxublsre94TbiOlxhdsCJiwF7CRZ397Pi2BQNpDsq8q4"), var1);
         var11.put(
            Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("RtdYio+2Dz82DHwA0QYRH5qnHIjGbV1Jaa4p50T43c4="),
            var2 != null && !var2.isBlank() ? var2 : Xqedii_1xv3izv0dsaib(this.Xqedii_2hf8ovc.size() + Xqedii_11o45ft.Xqedii_36rwjshpxj8iv(-594177236, 24))
         );
         var11.put(
            Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("1FhV/x1rZyCpq2ocOVupXHql6FExK7EzW4FjkDv5vU83tMNTic9OlAan"),
            Boolean.valueOf((Xqedii_11o45ft.Xqedii_3lx96nebszc42(1158521618, 1) != 0))
         );
         var11.put(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("7WZ61JZ0BIJwO7gECfoEgH6vYWKCFHSNXbUz28kmpG5lUCPwiTA="), this.Xqedii_onu42z1);
         this.Xqedii_onu42z1 = this.Xqedii_onu42z1 + Double.longBitsToDouble(Xqedii_11o45ft.Xqedii_3m9rvlceoyyqc(7656635722827965508L, 53));
         var11.put(
            Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("i777Vmt5ocSAP9RTxBnkZauVnqSeSX6dNV6rgYx6BHW+TEUaOiothpK4"),
            Xqedii_11o45ft.Xqedii_3uuathz0dg8rg(1292988413, 15)
         );
         LinkedHashMap var12 = new LinkedHashMap();
         var12.put(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("Z1AT5GSsA1BiH/gu9mZPUGYofO9/SpqYdMQjI21A"), var3);
         var12.put(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("NYX5yefCSAQRA25qUzpNir4RUcliVpXvj7lxC3g2"), var5);
         var11.put(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("UzpnSmQnDf8OI8Ed9osmYVDQBXC6zcJzWSSgJxlvCEAXBmYexYLNvPQUhRk="), var12);
         LinkedHashMap var13 = new LinkedHashMap();
         var13.put(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("A/M/Ykz9PvATzh3ix6T+igwMKwoaA6lv9tqf0pEuKWMVFrpf/is="), var7);
         var13.put(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("mOND+DYoaooBpcXqpe6Gv5Bc/bdxUyQ58S+rW82Q/QPdnWdkb7d5aQ=="), var9);
         var11.put(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("EzUa3O0M90sTl+2EfUwTt6XQ/fFz2tm3OITjGtEb0OcuzErQ"), var13);
         return var11;
      }
   }

   public static String Xqedii_131h06n(String var0) {
      if (((-965258245 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var0.startsWith(Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("/IZTv3PEhqjlDD9O4f/RMLcHulHZY5z3A2qce+8J"))
            ? var0.substring(Xqedii_11o45ft.Xqedii_36rwjshpxj8iv(-885578396, 14))
            : var0;
      }
   }

   private static /* synthetic */ String Xqedii_35z7nziuxsy5i(String string) {
        return Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("X/vNyD62yMnUR6/2Q9fTiWoKpDJP9Ldkb0Adr27AHyremF1Yj3ZbASquiu7CRWsUXTo=") + string;
    }

    private static /* synthetic */ String Xqedii_1xv3izv0dsaib(int n) {
        return Xqedii_11o45ft.Xqedii_3bq1pb0dajh64("TRNrnE2UOoouRnCSJ6vUjI1Cj/L8qCi2B782XLconwPz32GJggZuKA7culA=") + n;
    }
}
