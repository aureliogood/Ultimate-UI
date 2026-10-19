package dev.xqedii.ultimateUI.gui.parser;

import dev.xqedii.ultimateUI.Xqedii_1zr86ti;
import dev.xqedii.ultimateUI.Xqedii_2vjvrsx;
import dev.xqedii.ultimateUI.Xqedii_2znhms7;
import dev.xqedii.ultimateUI.Xqedii_ewno2jh;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class TemplateScrollWindow extends TemplateScroll {
   public static final String Xqedii_s2x3cnhjscrg = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public void Xqedii_3aoxm1o(
      String var1,
      Map<String, Object> var2,
      List<List<Map<String, Object>>> var3,
      double var4,
      double var6,
      double var8,
      double var10,
      Xqedii_1zr86ti var12,
      List<Map<String, Object>> var13
   ) {
      if (((328286198 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2znhms7 var14 = this.Xqedii_1ududu2(var1, var3, var4, var6, var8, var10, var12);
         if (var12.Xqedii_d3kjwjf || var12.Xqedii_34krcn4) {
            this.Xqedii_1u5fiud(var2, var12, var14);
         }

         ScrollViewState var15 = this.Xqedii_366lbqj();
         if (var15 != null && var15.isExportAll()) {
            this.Xqedii_33oh0xh(var1, var2, var3, var14, var12, var13);
         } else {
            for (List var17 : var3) {
               if (var17 != null && !var17.isEmpty()) {
                  this.Xqedii_nmw5ujl(var17, -var14.Xqedii_25sy0w0, -var14.Xqedii_3v9exli);
                  double var18 = this.Xqedii_i78w2uq(var17, var14, var12);
                  if (!(var18 <= Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(4237781214164680082L, 5)))) {
                     if (var18 < Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117166394026946532L, 43))) {
                        this.Xqedii_3ny38uo(var17, var18);
                     }

                     if (Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("heaNYABRVPtLhrz8k6yKPelVrcI/+HFl/6+pgqCe6MKIo+luEnxVAKnN").equals(var12.Xqedii_3jkkyat)) {
                        this.Xqedii_2hvgwq1(var17, var14, var12);
                     }

                     if (this.Xqedii_3bu9uu0(var17, var14)) {
                        var14.Xqedii_1jjooe1 = var14.Xqedii_1jjooe1 + Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1773977470, 12);
                     }

                     var13.addAll(var17);
                  }
               }
            }

            this.Xqedii_3c6i6pf(var1, var2, var14, var12, var13);
            this.Xqedii_3c27uwl(var1, var14, var12);
         }
      }
   }

   public void Xqedii_33oh0xh(
      String var1, Map<String, Object> var2, List<List<Map<String, Object>>> var3, Xqedii_2znhms7 var4, Xqedii_1zr86ti var5, List<Map<String, Object>> var6
   ) {
      if ((-553263379 * (-553263379 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         for (List var8 : var3) {
            if (var8 != null && !var8.isEmpty()) {
               for (Map var10 : (Iterable<Map>) (var8)) {

                  if (var10 != null) {
                     var10.putIfAbsent(
                        Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("NQKaKb7r4NMjPx3+XurhIqPn/qXgpH+FbM1IJG3towzXSsYTmNLvHpIIJNdxgpQkzAvvHYtJfgjBk3Ni"), var1
                     );
                  }
               }

               if (this.Xqedii_3bu9uu0(var8, var4)) {
                  var4.Xqedii_1jjooe1 = var4.Xqedii_1jjooe1 + Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(878420652, 22);
               }

               var6.addAll(var8);
            }
         }

         if (var2 != null) {
            LinkedHashMap var11 = new LinkedHashMap();
            var11.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("qVPJo7sS3rwmi2GMkzEHHrPcAM8NjzdndUF4aFlGCJo="), var1);
            var11.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("W6pETsUrJ/hKVDN3azBqF61enT5Kz6gke5eN6ny+"), var4.Xqedii_3hshg7e);
            var11.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("3qcmxLgr0q5FdvjkWU3J7UruPvIz94wNDQpKxiSg"), var4.Xqedii_3o2vu3n);
            var11.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("sXEFpN7cvbZ9AlqT2ZoDivl+xJKGD8zwjSfKYfb1FdDC486ItTA="), var4.Xqedii_431s80n);
            var11.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("C+6M5HQj7broE6flUIhy6x7pFCPDWoRA7qwCx2nOPCYsihOQLiJefQ=="), var4.Xqedii_3704t95);
            var11.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("nvmkM4Kd77Jv4FA58fS3MjZxjBHyPlmw7STt1K6m4dp3ibm9uYDK6u4Q0nQhPRHRLEPxSQ=="), var4.Xqedii_30spwua);
            var11.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("ZSHwejZHNpHkcX60V09U62gHwxU0ydE9gd213s3PaeFxDNTofTtfs5o4eaNf8QdC/oVph9qf"), var4.Xqedii_3sst8gc);
            var11.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("GF5qh8neZ8q6CVrGh7o+JlrxBZ6v851lH6SrEAyijLzN0hZU7LKG/T6P78g="), var5.Xqedii_3aklg7x);
            var11.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("m+wbaRH+TwKkVh+ZHyWUBiyWc0G/ChVAqi+ki96cW/BTRtSlXsVi6xB3gghK9wcr"), var5.Xqedii_c1ai8e2);
            var11.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("TXyl4dtJpIDcO2x/0lMoncFE4Z7VvCjtQZTDozhWyAAV13Zt"), var5.Xqedii_3jkkyat);
            Xqedii_2vjvrsx var12 = var5.Xqedii_3l1dp4p;
            var11.put(
               Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("+eW8yhftkP/sbH1mdqt/v4gUxDxRnTNvs/9GID8ZMkfxTcDhxvb7IxXUYhOm2w=="),
               Boolean.valueOf(
                  ((var12 != null && var12.Xqedii_10277dd
                     ? Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(-738577468, 21)
                     : Xqedii_ewno2jh.Xqedii_2ky4yuiwpmr91(1661127126, 13)) != 0)
               )
            );
            if (var12 != null) {
               var11.put(
                  Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("/ZYnBkPeFhfSZtg/ulfJNOIONAVBQjdWokokBAZ8FzBTxL+blYWvNBWLHSHOA8Wdj6bsUKjl0MI="), var12.Xqedii_3azj9ba
               );
               var11.put(
                  Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("Ykg9LETMqq9jyiPfoeUANaCbH7SXS4Vl77kuQGFJFrxfPiy1Dd87Xu3vllt84yTiVc5QXhPrhro="), var12.Xqedii_2f8emgi
               );
               var11.put(
                  Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("/S2hqX6tmQS0uH10ZMIMEicoHx+ydbjeUnNb5Ry0GM7KKKbJy7scz4KBWxlKkO9GoowBqvpuTvyNVda5xbSLiPRh"),
                  var12.Xqedii_w3p8o4e
               );
               var11.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("CZszvZ4Dz9NQrpdd/cmvnjtfHEnmo+VQQ2JV59FQAvT5XW2qT2zUtnWoL3CQXJuhstnFXyd2"), var12.Xqedii_3jr6i1u);
            }

            var2.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("dH56ojw1qo5J828A0gBECw/Ldx4Wlna1rFXvOO1k8Pg+1NnAfmagb6hutWJaCd7zn43gQ2S4suYsMTxTuO4="), var11);
         }

         this.Xqedii_3c27uwl(var1, var4, var5);
      }
   }

   public Xqedii_2znhms7 Xqedii_1ududu2(
      String var1, List<List<Map<String, Object>>> var2, double var3, double var5, double var7, double var9, Xqedii_1zr86ti var11
   ) {
      if (((-305463013 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2znhms7 var12 = new Xqedii_2znhms7();
         var12.Xqedii_3hshg7e = var3;
         var12.Xqedii_3o2vu3n = var5;
         double var13 = var3;
         double var15 = var5;
         int var17 = Xqedii_ewno2jh.Xqedii_2ky4yuiwpmr91(-1654247380, 1);

         for (List var19 : var2) {
            if (var19 != null && !var19.isEmpty()) {
               var17++;

               for (Map var21 : (Iterable<Map>) (var19)) {

                  var13 = Math.max(var13, this.Xqedii_32d72vu(var21) + this.Xqedii_2c2l5vv(var21));
                  var15 = Math.max(var15, this.Xqedii_1eo8rog(var21) + this.Xqedii_1qqbufd(var21));
               }
            }
         }

         var12.Xqedii_i3fznt7 = var17;
         var12.Xqedii_30spwua = Math.max(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581220L, 40)), var13 - var3);
         var12.Xqedii_3sst8gc = Math.max(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581220L, 14)), var15 - var5);
         var12.Xqedii_431s80n = var11.Xqedii_34krcn4
            ? this.Xqedii_1wdysp1(var12.Xqedii_30spwua, var11.Xqedii_1jtzk4u, var11.Xqedii_3gnmce6)
            : (var7 > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(-1400102176835104545L, 56)) ? var7 : var12.Xqedii_30spwua);
         var12.Xqedii_3704t95 = var11.Xqedii_d3kjwjf
            ? this.Xqedii_1wdysp1(var12.Xqedii_3sst8gc, var11.Xqedii_yx67ho2, var11.Xqedii_2c57ir0)
            : (var9 > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(-5600408707340418177L, 58)) ? var9 : var12.Xqedii_3sst8gc);
         var12.Xqedii_cmfbm86 = var11.Xqedii_c1ai8e2
            ? Math.max(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(3997107899168028559L, 12)), var12.Xqedii_30spwua - var12.Xqedii_431s80n)
            : Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581220L, 7));
         var12.Xqedii_c4nkc85 = var11.Xqedii_3aklg7x
            ? Math.max(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823856507431974L, 33)), var12.Xqedii_3sst8gc - var12.Xqedii_3704t95)
            : Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581220L, 41));
         ScrollViewState var24 = this.Xqedii_366lbqj();
         double var25 = var24 == null ? Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581220L, 35)) : var24.offsetX(var1);
         double var26 = var24 == null ? Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823856507431974L, 9)) : var24.offsetY(var1);
         var12.Xqedii_25sy0w0 = Math.max(
            Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(-350025544208776137L, 54)),
            Math.min(
               var12.Xqedii_cmfbm86, Double.isFinite(var25) ? var25 : Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581220L, 59))
            )
         );
         var12.Xqedii_3v9exli = Math.max(
            Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581220L, 12)),
            Math.min(
               var12.Xqedii_c4nkc85, Double.isFinite(var26) ? var26 : Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581220L, 5))
            )
         );
         if (var24 != null) {
            var24.putOffset(var1, var12.Xqedii_25sy0w0, var12.Xqedii_3v9exli);
            double[] var23 = var24.Xqedii_2nms0jn(var1, var12.Xqedii_25sy0w0, var12.Xqedii_3v9exli);
            var12.Xqedii_1vtwtkk = var23[Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(738577467, 16)]
                  > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581220L, 8))
               ? var23[Xqedii_ewno2jh.Xqedii_2ky4yuiwpmr91(748512816, 25)]
                  + Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167427100798948L, 29))
               : Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(2674358300071677406L, 26));
            var12.Xqedii_hiay8qz = var23[Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(-391443178, 4)]
                  > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(4385910453200176606L, 6))
               ? var23[Xqedii_ewno2jh.Xqedii_2ky4yuiwpmr91(-1945393319, 15)]
                  + Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(6481790337302901575L, 10))
               : Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(-1219755742589947418L, 17));
         }

         return var12;
      }
   }

   public double Xqedii_1wdysp1(double var1, double var3, double var5) {
      if ((-42728567 * (-42728567 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var7 = Math.max(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823856507431974L, 42)), var1);
         if (Double.isFinite(var3)) {
            var7 = Math.max(var7, var3);
         }

         if (Double.isFinite(var5)) {
            var7 = Math.min(var7, var5);
         }

         return var7;
      }
   }

   public void Xqedii_1u5fiud(Map<String, Object> var1, Xqedii_1zr86ti var2, Xqedii_2znhms7 var3) {
      if ((-849906189 * (-849906189 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         double var4 = var2.Xqedii_34krcn4 ? var3.Xqedii_431s80n : this.Xqedii_2c2l5vv(var1);
         double var6 = var2.Xqedii_d3kjwjf ? var3.Xqedii_3704t95 : this.Xqedii_10dn06d(var1);
         this.Xqedii_22aiz8y(
            var1,
            Math.max(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9185425108818915300L, 59)), var4),
            Math.max(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(-6971819045410884495L, 14)), var6)
         );
      }
   }

   public void Xqedii_22aiz8y(Map<String, Object> var1, double var2, double var4) {
      if ((52049985 * (52049985 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Map var7 = (Map) (Object) var1.get(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("flE2kGvOwwQHU8LaLBQerbrK+fF3v8nCTWgXJPPngINlCNnL")) instanceof Map var8
            ? this.Xqedii_2uqaav9(var8)
            : new LinkedHashMap();
         if (var7 == null) {
            var7 = new LinkedHashMap();
         }

         var7.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("sXEFpN7cvbZ9AlqT2ZoDivl+xJKGD8zwjSfKYfb1FdDC486ItTA="), var2);
         var7.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("C+6M5HQj7broE6flUIhy6x7pFCPDWoRA7qwCx2nOPCYsihOQLiJefQ=="), var4);
         var1.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("flE2kGvOwwQHU8LaLBQerbrK+fF3v8nCTWgXJPPngINlCNnL"), var7);
         var1.remove(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("sXEFpN7cvbZ9AlqT2ZoDivl+xJKGD8zwjSfKYfb1FdDC486ItTA="));
         var1.remove(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("C+6M5HQj7broE6flUIhy6x7pFCPDWoRA7qwCx2nOPCYsihOQLiJefQ=="));
      }
   }

   public double Xqedii_i78w2uq(List<Map<String, Object>> var1, Xqedii_2znhms7 var2, Xqedii_1zr86ti var3) {
      if ((-1384722363 * -1384722363 - -1384722363 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var4 = Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(6236222702248829863L, 47));
         double var6 = Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(-5744594264160451713L, 58));
         double var8 = Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1536105331484142630L, 60));
         double var10 = Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(2948122326893358833L, 29));

         for (Map var13 : var1) {
            double var14 = this.Xqedii_32d72vu(var13);
            double var16 = this.Xqedii_1eo8rog(var13);
            var4 = Math.min(var4, var14);
            var6 = Math.min(var6, var16);
            var8 = Math.max(var8, var14 + this.Xqedii_2c2l5vv(var13));
            var10 = Math.max(var10, var16 + this.Xqedii_1qqbufd(var13));
         }

         if (Double.isFinite(var4) && Double.isFinite(var6)) {
            double var23 = var2.Xqedii_3hshg7e;
            double var24 = var2.Xqedii_3o2vu3n;
            double var25 = var2.Xqedii_3hshg7e + var2.Xqedii_431s80n;
            double var18 = var2.Xqedii_3o2vu3n + var2.Xqedii_3704t95;
            boolean var20 = Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("dy7vSQLuw3pIdJKLM2BLIPQdIphUsVVX0Xh5PRMeD4DnD9yFSBkuiA==").equals(var3.Xqedii_3jkkyat);
            if (!Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("QlyqSHdTKXEmbwr6moVB3KyMmHtViUUw/6iHaOmw6FbzLK0a").equals(var3.Xqedii_3jkkyat)) {
               int var21 = !(var2.Xqedii_3704t95 > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823856507431974L, 12)))
                     || (
                        var20
                           ? !(var6 < var24 - Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(6624881588913134665L, 36)))
                              && !(var10 > var18 + Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(2973512819330554749L, 26)))
                           : !(var10 <= var24 - var2.Xqedii_hiay8qz) && !(var6 >= var18 + var2.Xqedii_hiay8qz)
                     )
                  ? Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1773973374, 11)
                  : Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1773449086, 19);
               int var22 = !(var2.Xqedii_431s80n > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823856507431974L, 1)))
                     || (
                        var20
                           ? !(var4 < var23 - Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(2328709664824093002L, 37)))
                              && !(var8 > var25 + Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(7891619598724958924L, 39)))
                           : !(var8 <= var23 - var2.Xqedii_1vtwtkk) && !(var4 >= var25 + var2.Xqedii_1vtwtkk)
                     )
                  ? Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(-798061904, 24)
                  : Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(-738577468, 11);
               if (var21 != 0 || var22 != 0) {
                  return Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(-4277391230918428229L, 23));
               }

               if (!var20 && (var10 <= var24 || var6 >= var18 || var8 <= var23 || var4 >= var25)) {
                  return Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(7480417275502054684L, 12));
               }
            }

            double var26 = Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(1870104318875513671L, 10));
            if (var3.Xqedii_3aklg7x) {
               var26 = var20
                  ? Math.min(var26, Math.min(this.Xqedii_3bewubf(var6 - var24, var3.Xqedii_2is5f94), this.Xqedii_3bewubf(var18 - var10, var3.Xqedii_3kn0m5u)))
                  : Math.min(var26, Math.min(this.Xqedii_3bewubf(var10 - var24, var3.Xqedii_2is5f94), this.Xqedii_3bewubf(var18 - var6, var3.Xqedii_3kn0m5u)));
            }

            if (var3.Xqedii_c1ai8e2) {
               var26 = var20
                  ? Math.min(var26, Math.min(this.Xqedii_3bewubf(var4 - var23, var3.Xqedii_2is5f94), this.Xqedii_3bewubf(var25 - var8, var3.Xqedii_3kn0m5u)))
                  : Math.min(var26, Math.min(this.Xqedii_3bewubf(var8 - var23, var3.Xqedii_2is5f94), this.Xqedii_3bewubf(var25 - var4, var3.Xqedii_3kn0m5u)));
            }

            if (var26 < var3.Xqedii_3orlqju) {
               var26 = var3.Xqedii_3orlqju;
            }

            return var26;
         } else {
            return Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(-9113403864629186585L, 4));
         }
      }
   }

   public void Xqedii_2hvgwq1(List<Map<String, Object>> var1, Xqedii_2znhms7 var2, Xqedii_1zr86ti var3) {
      if ((-1245269699 * (-1245269699 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var4 = var2.Xqedii_3hshg7e;
         double var6 = var2.Xqedii_3o2vu3n;
         double var8 = var2.Xqedii_3hshg7e + var2.Xqedii_431s80n;
         double var10 = var2.Xqedii_3o2vu3n + var2.Xqedii_3704t95;
         int var12 = var3.Xqedii_3aklg7x && var2.Xqedii_3704t95 > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823856507431974L, 1))
            ? Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(1444556241, 13)
            : Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(738577467, 19);
         int var13 = var3.Xqedii_c1ai8e2 && var2.Xqedii_431s80n > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581220L, 18))
            ? Xqedii_ewno2jh.Xqedii_2ky4yuiwpmr91(-1654247378, 1)
            : Xqedii_ewno2jh.Xqedii_2ky4yuiwpmr91(-1817393659, 30);
         if (var13 != 0 || var12 != 0) {
            for (Map var15 : var1) {
               if (var15 != null
                  && !var15.containsKey(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("PCM7zYGuW9E4PjWvzXO83BmbDGGzCBTgSvQG5GxPWoiLg+SUZwg8SXWngOMVzXbmK2wXTcOjHywVRQ=="))
                  )
                {
                  double[] var16 = this.Xqedii_wan0ct2(var15);
                  double var17 = var6 - var16[Xqedii_ewno2jh.Xqedii_2ky4yuiwpmr91(-743651835, 30)];
                  double var19 = var16[Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1772400510, 19)] - var10;
                  double var21 = var4 - var16[Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(-2038205355, 19)];
                  double var23 = var16[Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(-391443162, 4)] - var8;
                  int var25 = var13 == 0
                        || var12 != 0
                           && !(
                              Math.max(var21, var23)
                                 > Math.max(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581220L, 61)), Math.max(var17, var19))
                           )
                     ? Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(-1405871198, 14)
                     : Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1773973366, 3);
                  double var26 = var25 != 0 ? var4 : var6;
                  double var28 = var25 != 0 ? var8 : var10;
                  double var30 = var25 != 0 ? var21 : var17;
                  double var32 = var25 != 0 ? var23 : var19;
                  double var34 = var25 != 0
                     ? (var16[Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(115911437, 28)] + var16[Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(1854582994, 0)])
                        / Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(-1495619217050831256L, 7))
                     : (var16[Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(-738577468, 23)] + var16[Xqedii_ewno2jh.Xqedii_2ky4yuiwpmr91(53073507, 21)])
                        / Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823890867170342L, 37));
                  int var36;
                  if (!(var30 > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823856507431974L, 52)))
                     && !(var32 > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(-8719139789499538448L, 43)))) {
                     var36 = var34 - var26 <= var28 - var34
                        ? Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1773973374, 6)
                        : Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(-738577468, 31);
                  } else {
                     var36 = var30 >= var32 ? Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(738577467, 0) : Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(1537387572, 30);
                  }

                  var15.put(
                     Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("PCM7zYGuW9E4PjWvzXO83BmbDGGzCBTgSvQG5GxPWoiLg+SUZwg8SXWngOMVzXbmK2wXTcOjHywVRQ=="),
                     var25 != 0 ? Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1639755646, 27) : Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(738577467, 7)
                  );
                  var15.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("ZwYyOmq6p9ldKxih2ADSnvMNGsIx5CuCJd5dE04B8Ui3m9P08UsqFnpOd6hl5WRTECQ784vk3sW6uA=="), var36);
                  var15.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("uu5AzbJtAaEzNsTpd3Qa8roaxP3N7Ch7VuSwxaiqsGoMrtypDqQyoyCAEPSsLJKTO8FmRAiZGXijQ+i/"), var26);
                  var15.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("160iIHNj6UjN5WkJprVis2uCqMym1xtEEb0DNuy/kOUXkxNwxsKq2gJ64UxtZUFbb7gG1BRHPmc="), var28);
               }
            }
         }
      }
   }

   public double[] Xqedii_wan0ct2(Map<String, Object> var1) {
      if ((-1884972347 * (-1884972347 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var2 = this.Xqedii_32d72vu(var1);
         double var4 = this.Xqedii_1eo8rog(var1);
         double var6 = this.Xqedii_2c2l5vv(var1);
         double var8 = this.Xqedii_10dn06d(var1);
         if (!Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("o4cg2mhh1BZQxPWc0f6WCDd5qDLBftEtzBgnVQycRroXkPCi").equals(this.Xqedii_n1b0nzi(var1))) {
            double[] var21 = new double[Xqedii_ewno2jh.Xqedii_2ky4yuiwpmr91(1714435229, 9)];
            var21[Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(437113174, 21)] = var2;
            var21[Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(-738577468, 11)] = var4;
            var21[Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(-671468604, 26)] = var2 + var6;
            var21[Xqedii_ewno2jh.Xqedii_2ky4yuiwpmr91(-1945327783, 15)] = var4 + var8;
            return var21;
         } else if (this.Xqedii_1ijhail(var1)) {
            double[] var20 = new double[Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1773940606, 13)];
            var20[Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(738577467, 11)] = var2;
            var20[Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(-1328451958, 16)] = var4;
            var20[Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(-391443162, 4)] = var2 + var6;
            var20[Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1773186942, 18)] = var4 + var6;
            return var20;
         } else {
            Object var10 = var1.get(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("o4cg2mhh1BZQxPWc0f6WCDd5qDLBftEtzBgnVQycRroXkPCi"));
            String var11 = var10 == null
               ? Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("qYSbSCoWCLpEDA+O3U2b1O/C2ckF4cTnGAa/Gw==")
               : Xqedii_38h3euk.matcher(var10.toString()).replaceAll(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("qYSbSCoWCLpEDA+O3U2b1O/C2ckF4cTnGAa/Gw=="));
            double var12 = Math.max(
               var6, this.Xqedii_2eu2b6m(var11).length() * var8 * Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(-7749310873474893960L, 28))
            );
            String var14 = this.Xqedii_4rolssi(var1.get(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("n9HVBbe+H0e1ukyVCHxiqamm9QEEKdx26QWGjaFVbNPpMr/wB3w=")));
            int var18 = Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(1773973373, 0);
            switch (var14.hashCode()) {
               case 100571:
                  if (var14.equals(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("LKUxtrYPvRHoMEFa3bVbHbnb7sJ5iMr/SCcByZwp20dZDg=="))) {
                     var18 = Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1774006142, 15);
                  }
                  break;
               case 3317767:
                  if (var14.equals(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("DV9Z2wFMWSZDXW77cJZk+CugNbMiVbCd73AF39HC8RXEsZt1"))) {
                     var18 = Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(738577467, 20);
                  }
                  break;
               case 108511772:
                  if (var14.equals(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("ZFdGL6ottK2jl+nEanrc+OLgnC42AG9kDLA4ywNE3hMpsqNX/3k="))) {
                     var18 = Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(1444564433, 13);
                  }
                  break;
               case 109757538:
                  if (var14.equals(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("B/5Fv38T4LuQr0y10LtJPqdJz3R+juYWuD1kl9LHfyJsnovN4r0="))) {
                     var18 = Xqedii_ewno2jh.Xqedii_2ky4yuiwpmr91(-1945393319, 15);
                  }
            }
            double var15 = switch (var18) {
               case 0, 1 -> var2;
               case 2, 3 -> var2 + var6 - var12;
               default -> var2 + (var6 - var12) / Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-2688745361114278950L, 62));
            };
            double[] var19 = new double[Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(-738576956, 9)];
            var19[Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1773973374, 22)] = var15;
            var19[Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-2042408830, 28)] = var4
               - var8 * Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(-4370180247113756207L, 14));
            var19[Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(-738581564, 12)] = var15 + var12;
            var19[Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(-671468604, 25)] = var4
               + var8 * Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(-6229445033068093625L, 48));
            return var19;
         }
      }
   }

   public boolean Xqedii_3bu9uu0(List<Map<String, Object>> var1, Xqedii_2znhms7 var2) {
      if ((-687918206 * -687918206 + -687918206 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         for (Map var4 : var1) {
            double var5 = this.Xqedii_32d72vu(var4);
            double var7 = this.Xqedii_1eo8rog(var4);
            int var9 = !(var2.Xqedii_431s80n <= Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581220L, 20)))
                  && (!(var5 + this.Xqedii_2c2l5vv(var4) > var2.Xqedii_3hshg7e) || !(var5 < var2.Xqedii_3hshg7e + var2.Xqedii_431s80n))
               ? Xqedii_ewno2jh.Xqedii_2ky4yuiwpmr91(748512816, 25)
               : Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1773973342, 5);
            int var10 = !(var2.Xqedii_3704t95 <= Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823856507431974L, 61)))
                  && (!(var7 + this.Xqedii_1qqbufd(var4) > var2.Xqedii_3o2vu3n) || !(var7 < var2.Xqedii_3o2vu3n + var2.Xqedii_3704t95))
               ? Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(738577467, 17)
               : Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1772924798, 20);
            if (var9 != 0 && var10 != 0) {
               return (Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(-738577468, 22) != 0);
            }
         }

         return (Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(-1328517494, 16) != 0);
      }
   }

   public double Xqedii_3bewubf(double var1, double var3) {
      if ((-36219471 * -36219471 - -36219471 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var3 <= Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(8475562428329360164L, 6))) {
         return Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(-3353932438935669526L, 52));
      } else {
         return var1 <= Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823856507431974L, 60))
            ? Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(4863802142105006584L, 42))
            : Math.min(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(-1219755742589972986L, 17)), var1 / var3);
      }
   }

   public void Xqedii_3ny38uo(List<Map<String, Object>> var1, double var2) {
      if (((2008733869 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         for (Map var5 : var1) {
            double var6 = this.Xqedii_3iba6vo(
               var5.get(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("KQcy5HZxNnhXXiJcMUWU2bX7sRYSMl0goEEX7kX+eOPvvKht8M2WK/Vl")),
               Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-382902351900603374L, 15))
            );
            if (!Double.isFinite(var6)) {
               var6 = Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1706326773894097958L, 58));
            }

            int var8 = (int)Math.round(
               Math.max(
                  Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(9006211965775548886L, 16)),
                  Math.min(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(8972807047797731300L, 59)), var6 * var2)
               )
            );
            var5.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("KQcy5HZxNnhXXiJcMUWU2bX7sRYSMl0goEEX7kX+eOPvvKht8M2WK/Vl"), var8);
            var5.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("etPB1Tp10xfZ3QrZDwfSweHvuORR5SKRIH2ZzHsE262h1KeqcxC9gqbtFsYywIqc"), var2);
         }
      }
   }

   public void Xqedii_3c6i6pf(String var1, Map<String, Object> var2, Xqedii_2znhms7 var3, Xqedii_1zr86ti var4, List<Map<String, Object>> var5) {
      if (((200217641 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2vjvrsx var6 = var4.Xqedii_3l1dp4p;
         if (var6 != null && var6.Xqedii_10277dd) {
            double var7 = this.Xqedii_s4d4tdk(
                  var2,
                  Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("6xPYj6DrLC2C0MmP4vpFTMZaqfCP6TzbhCw1/TOAdwNoMc9kcf0="),
                  Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("6xPYj6DrLC2C0MmP4vpFTMZaqfCP6TzbhCw1/TOAdwNoMc9kcf0="),
                  Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823856507431974L, 40))
               )
               + var6.Xqedii_34je6jm;
            if (var4.Xqedii_3aklg7x
               && (var3.Xqedii_c4nkc85 > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(-3485909522705444294L, 13)) || !var6.Xqedii_2ixflic)) {
               this.Xqedii_iz06pym(var1, var3, var4, var6, var7, (Xqedii_ewno2jh.Xqedii_2nu4in3bz3uyp(-738577468, 26) != 0), var5);
            }

            if (var4.Xqedii_c1ai8e2
               && (var3.Xqedii_cmfbm86 > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(-1400102176835104545L, 56)) || !var6.Xqedii_2ixflic)) {
               this.Xqedii_iz06pym(var1, var3, var4, var6, var7, (Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1773973374, 25) != 0), var5);
            }
         }
      }
   }

   public void Xqedii_iz06pym(
      String var1, Xqedii_2znhms7 var2, Xqedii_1zr86ti var3, Xqedii_2vjvrsx var4, double var5, boolean var7, List<Map<String, Object>> var8
   ) {
      if ((-873040282 * -873040282 - -873040282 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var9 = this.Xqedii_19fcb7t(var4.Xqedii_3jr6i1u, var7);
         double var10 = var4.Xqedii_3azj9ba;
         double var12;
         double var14;
         double var16;
         double var18;
         if (var7) {
            var16 = var10;
            var18 = Math.max(
               Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823856503241766L, 24)),
               var2.Xqedii_3704t95 - Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(-3585747239188583611L, 62)) * var4.Xqedii_ebn04ch
            );
            var14 = var2.Xqedii_3o2vu3n + var4.Xqedii_ebn04ch;
            var12 = Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("DV9Z2wFMWSZDXW77cJZk+CugNbMiVbCd73AF39HC8RXEsZt1").equals(var9)
               ? var2.Xqedii_3hshg7e + var4.Xqedii_2emm0aq
               : var2.Xqedii_3hshg7e + var2.Xqedii_431s80n - var4.Xqedii_2emm0aq - var10;
         } else {
            var18 = var10;
            var16 = Math.max(
               Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1526825453345713190L, 55)),
               var2.Xqedii_431s80n - Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167444146450404L, 36)) * var4.Xqedii_ebn04ch
            );
            var12 = var2.Xqedii_3hshg7e + var4.Xqedii_ebn04ch;
            var14 = Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("CxCv7ZFUb47SMxRb3IW/0CFBlseGHdTf5W4Usfb8ZtRxZw==").equals(var9)
               ? var2.Xqedii_3o2vu3n + var4.Xqedii_2emm0aq
               : var2.Xqedii_3o2vu3n + var2.Xqedii_3704t95 - var4.Xqedii_2emm0aq - var10;
         }

         String var20 = var7
            ? Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("qYSbSCoWCLpEDA+O3U2b1O/C2ckF4cTnGAa/Gw==")
            : Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("wRzvjN1CW42tFkbIqMOFom17uox4VoBp1J8oXbrwvj4=");
         if (var4.Xqedii_fgk95sd) {
            var8.add(
               this.Xqedii_2lkredy(
                  Xqedii_32yh4ob2la2ty(var1, var20), var4.Xqedii_w3p8o4e, var4.Xqedii_17whbq4, var4.Xqedii_2btvpd9, var5, var12, var14, var16, var18
               )
            );
         }

         double var21 = var7 ? var2.Xqedii_3704t95 : var2.Xqedii_431s80n;
         double var23 = var7 ? var2.Xqedii_3sst8gc : var2.Xqedii_30spwua;
         double var25 = var7 ? var2.Xqedii_c4nkc85 : var2.Xqedii_cmfbm86;
         double var27 = var7 ? var2.Xqedii_3v9exli : var2.Xqedii_25sy0w0;
         double var29 = var7 ? var18 : var16;
         double var31 = var23 <= Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(-252745975153437060L, 24))
            ? Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(499638487396003470L, 9))
            : Math.min(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823856503241766L, 24)), var21 / var23);
         double var33 = Math.max(Math.min(var4.Xqedii_2m9v5zv, var29), var29 * var31);
         double var35 = var25 <= Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823856507431974L, 19))
            ? Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(1215950535526251646L, 40))
            : Math.max(
               Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(9096999049278057278L, 23)),
               Math.min(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(-1382105370511666977L, 56)), var27 / var25)
            );
         double var37 = Math.max(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581220L, 62)), var29 - var33) * var35;
         double var39 = var7 ? var12 : var12 + var37;
         double var41 = var7 ? var14 + var37 : var14;
         double var43 = var7 ? var16 : var33;
         double var45 = var7 ? var33 : var18;
         var8.add(
            this.Xqedii_2lkredy(
               Xqedii_uepzo99sftln(var1, var20),
               var4.Xqedii_2f8emgi,
               var4.Xqedii_1jg3rhk,
               var4.Xqedii_2btvpd9,
               var5 + Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(3929212092222143961L, 11)),
               var39,
               var41,
               var43,
               var45
            )
         );
         ScrollViewState var47 = this.Xqedii_366lbqj();
         if (var47 != null && var4.Xqedii_3j43z8s && var25 > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581220L, 54))) {
            ScrollViewState.Bar var48 = var47.Xqedii_2z4uqla(var7, var12, var14, var16, var18, var7 ? var41 : var39, var33, var4.Xqedii_2x0r0fw);
            if (var7) {
               var2.Xqedii_208z1jj = var48;
            } else {
               var2.Xqedii_5l4r4s9 = var48;
            }
         }
      }
   }

   public String Xqedii_19fcb7t(String var1, boolean var2) {
      if (((-221313335 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2) {
         return Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("DV9Z2wFMWSZDXW77cJZk+CugNbMiVbCd73AF39HC8RXEsZt1").equals(var1)
            ? Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("DV9Z2wFMWSZDXW77cJZk+CugNbMiVbCd73AF39HC8RXEsZt1")
            : Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("ZFdGL6ottK2jl+nEanrc+OLgnC42AG9kDLA4ywNE3hMpsqNX/3k=");
      } else {
         return Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("CxCv7ZFUb47SMxRb3IW/0CFBlseGHdTf5W4Usfb8ZtRxZw==").equals(var1)
            ? Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("CxCv7ZFUb47SMxRb3IW/0CFBlseGHdTf5W4Usfb8ZtRxZw==")
            : Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("oFEAssueVK0wpxDhb64El6cVMRvRMpAvR93UwlMGFfDm+LXTe7HGDQ==");
      }
   }

   public Map<String, Object> Xqedii_2lkredy(
      String var1, String var2, int var3, double var4, double var6, double var8, double var10, double var12, double var14
   ) {
      if ((290086712 * (290086712 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var16 = Math.max(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(-8087871204775899233L, 29)), var12);
         double var18 = Math.max(Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(7546405817386941045L, 51)), var14);
         double var20 = Math.min(
            Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117185012710174692L, 46)),
            Math.min(var16, var18) / Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3ie139ifrxxbi(-8170274993454256366L, 33))
         );
         double var22 = Math.min(
            var20,
            var4
               * Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(3075862161919951906L, 13))
               / Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_3bkz0hor4np0z(-1535823710260440102L, 38))
         );
         LinkedHashMap var24 = new LinkedHashMap();
         int var25 = var4 > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_qlznhxdytier(-868640284316907687L, 18))
               && var22 > Double.longBitsToDouble(Xqedii_ewno2jh.Xqedii_2rob42q3rr7n3(9117167426966581268L, 15))
            ? Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(-781284688, 24)
            : Xqedii_ewno2jh.Xqedii_6u06pk1qh6md(-1405871198, 14);
         var24.put(
            Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("WPjl2Akaz3gWFKmv0zbxTXkAE5UbJLHvSVInW0DT65b/lP33"),
            var25 != 0
               ? Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("1HLfcWAbnghn8jsb0PM1JT1CARPNXBvQ/35PG4xz5M4zCrVRel9MmOvw")
               : Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("gkledmOv1/lCjrlV77ibJCZNI2/Oc+V9gdlGvCgED/NwsFuFDtw=")
         );
         if (var25 != 0) {
            var24.put(
               Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("S5sYppEo5v30db28cPu5bG066+Vmf9C1kSIBnvZm9yqPbFV0hsrL6y7fAlM="),
               Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("iaIZ83G2w8hEGQvTkUV4xOc8tdMS43MdK9MCG8a23qEfSNINMR0=")
            );
            var24.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("/XxCvlZo8ZyX1sv7mIZbtLebaY6Tsh8iAvHTcsW99nthc5bIz0OAVw=="), var22);
         }

         var24.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("qVPJo7sS3rwmi2GMkzEHHrPcAM8NjzdndUF4aFlGCJo="), var1);
         var24.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("XNpm3QJzTl32MHJZugZZ9q4ZIEvf7HUSg/pU+Xh0wCJe/SjuDrU="), var2);
         var24.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("KQcy5HZxNnhXXiJcMUWU2bX7sRYSMl0goEEX7kX+eOPvvKht8M2WK/Vl"), var3);
         var24.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("6xPYj6DrLC2C0MmP4vpFTMZaqfCP6TzbhCw1/TOAdwNoMc9kcf0="), var6);
         var24.put(
            Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("6nCQGxU9YPP4OBzEkNUZNhEZMykvAi4VTMt/m88Yct6QBbkNTRPYIEANdbCH58g9iWpVuvtKUEs="),
            Boolean.valueOf((Xqedii_ewno2jh.Xqedii_14f5rgqqd6esf(-1773965182, 13) != 0))
         );
         var24.put(Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("VRpoNaGTPDL/zHbhwvuJwEhBN2vSyomMdE/+eyUlDxESSigX70BGfqEW8dfEoEJaAoGsiV1uBBnC6A=="), Boolean.TRUE);
         this.Xqedii_37smwmg(var24, var8, var10);
         this.Xqedii_22aiz8y(var24, var16, var18);
         return var24;
      }
   }

   public void Xqedii_3c27uwl(String var1, Xqedii_2znhms7 var2, Xqedii_1zr86ti var3) {
      if ((842101910 * (842101910 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ScrollViewState var4 = this.Xqedii_366lbqj();
         if (var4 != null) {
            var4.putMetrics(
               var1,
               var4.Xqedii_2xqb9v7(
                  var1,
                  var2.Xqedii_3hshg7e,
                  var2.Xqedii_3o2vu3n,
                  var2.Xqedii_431s80n,
                  var2.Xqedii_3704t95,
                  var2.Xqedii_30spwua,
                  var2.Xqedii_3sst8gc,
                  var2.Xqedii_25sy0w0,
                  var2.Xqedii_3v9exli,
                  var2.Xqedii_cmfbm86,
                  var2.Xqedii_c4nkc85,
                  var3.Xqedii_22h9srm,
                  var3.Xqedii_2j3wi0z,
                  var3.Xqedii_c1ai8e2,
                  var3.Xqedii_3aklg7x,
                  var2.Xqedii_i3fznt7,
                  var2.Xqedii_1jjooe1,
                  var3.Xqedii_13vra5b,
                  var2.Xqedii_208z1jj,
                  var2.Xqedii_5l4r4s9
               )
            );
         }
      }
   }

   public List<List<Map<String, Object>>> Xqedii_dcc14mx() {
      if ((990584785 * (990584785 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return new ArrayList<>();
      }
   }

   private static /* synthetic */ String Xqedii_32yh4ob2la2ty(String string, String string2) {
        return string + Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("KD3OJ7pFy3YDn2GbDJXCq/aVSJiFSwvSo4hpeXyTHmZa3YVNyDYpDuTw2pP0k93mDDV3dKwhm4U=") + string2;
    }

    private static /* synthetic */ String Xqedii_uepzo99sftln(String string, String string2) {
        return string + Xqedii_ewno2jh.Xqedii_3bigczepfpjkb("iW/QQmFCtAaQ9x9wKo85AkRSd8KQkpMXDx20Qwr9UUldlC8OfAIrkBwtc1ZQYfwx0xb6gTAQ9kw=") + string2;
    }
}
