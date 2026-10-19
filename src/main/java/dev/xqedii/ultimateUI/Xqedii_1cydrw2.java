package dev.xqedii.ultimateUI;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.function.Consumer;

public final class Xqedii_1cydrw2 extends Xqedii_1ks3mne {
   public static final String Xqedii_3iyy95rhr5eud = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public Xqedii_1cydrw2(File var1) {
      super(var1);
   }

   public Xqedii_1cydrw2 Xqedii_2vnohf3(double var1, double var3) {
      if (((-1445677338 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         if (var1 > Double.longBitsToDouble(Xqedii_3kxq725.Xqedii_xiny2onuxs8h(4460026172412932469L, 47))) {
            this.Xqedii_rnovv49 = var1;
         }

         if (var3 > Double.longBitsToDouble(Xqedii_3kxq725.Xqedii_da4f5xcv2vd(6815694979535579841L, 40))) {
            this.Xqedii_s1m6hrv = var3;
         }

         return this;
      }
   }

   public Xqedii_1cydrw2 Xqedii_1fyw0cu(double var1) {
      if ((-281284209 * -281284209 + -281284209 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1 > Double.longBitsToDouble(Xqedii_3kxq725.Xqedii_xiny2onuxs8h(-440482689572461882L, 19))) {
            this.Xqedii_3b5g09f = var1;
         }

         return this;
      }
   }

   public Xqedii_1cydrw2 Xqedii_32wrkf8(boolean var1) {
      if (((1932969779 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_13gj34d = var1;
         return this;
      }
   }

   public Xqedii_1cydrw2 Xqedii_tc5jj8a(boolean var1) {
      if ((1963429710 ^ 1963429710) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3ea0t6n = var1;
         return this;
      }
   }

   public Xqedii_1cydrw2 Xqedii_qa67ajl(boolean var1, Consumer<String> var2) {
      if ((-1348260288 * -1348260288 + -1348260288 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_1j61zx3 = var1;
         if (var2 != null) {
            this.Xqedii_31y3jzw = var2;
         }

         return this;
      }
   }

   public Xqedii_1cydrw2 Xqedii_ek6kcym(String var1) {
      if ((-1889826282 * -1889826282 - -1889826282 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null && !var1.isBlank()) {
            this.Xqedii_291jtfy = var1;
         }

         return this;
      }
   }

   public Xqedii_1cydrw2 Xqedii_2qflhka(int var1, int var2, int var3) {
      if ((-503027458 ^ -503027458) != 0) {
         throw new IllegalStateException();
      } else {
         int[] var10001 = new int[Xqedii_3kxq725.Xqedii_2d38ro98tsmqh(1256176602, 1)];
         var10001[Xqedii_3kxq725.Xqedii_2d38ro98tsmqh(2129613099, 11)] = Math.max(Xqedii_3kxq725.Xqedii_17tuii68gypp4(985738622, 5), var1);
         var10001[Xqedii_3kxq725.Xqedii_2d38ro98tsmqh(1689123773, 29)] = Math.max(Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(563633466, 14), var2);
         var10001[Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(-1915510247, 26)] = Math.max(Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(-2040433432, 16), var3);
         this.Xqedii_3tmaf8b = var10001;
         return this;
      }
   }

   public Xqedii_1rr9pk9 Xqedii_29hipmc(List<Xqedii_2kb1ns6> var1, List<String> var2) throws IOException {
      if ((-1827362103 * (-1827362103 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File var3 = new File(
            this.Xqedii_ef13m9a, Xqedii_3kxq725.Xqedii_fegndy6y367g("XE9yPQb+gZJmHwhgj4SSybe33Qtwgnq1n8cQsY9+7DjTTm3GMPUGCD4CQd2+cbnAO2sSsA==")
         );
         File var4 = new File(var3, Xqedii_3kxq725.Xqedii_fegndy6y367g("bFFkC2qsj8UFnVEjoZaq/Vfw2nHgBraBTms3DdipKaM="));
         File var5 = new File(var4, Xqedii_3kxq725.Xqedii_fegndy6y367g("QXVd3ZB9lG0fUW/p0ZUsVfDMP3FSIUgs/YsoK7Pl2Y/XWg=="));
         File var6 = new File(var3, Xqedii_3kxq725.Xqedii_fegndy6y367g("TcImhH+CzySi8pYSWH9zYLr3Guajdo3ieBRw5H7YSnAwRoUSwGyPCWkthQrOMZMAsINvxgNSBRUcog=="));

         for (File var8 : List.of(var3, var4, var5, var6)) {
            if (!var8.isDirectory() && !var8.mkdirs()) {
               throw new IOException(Xqedii_vflnl51bfyax(String.valueOf(var8)));
            }
         }

         Xqedii_3boar8q var17 = new Xqedii_3boar8q(
            new File(
               this.Xqedii_ef13m9a, Xqedii_3kxq725.Xqedii_fegndy6y367g("8dHyzNb1fJeM9p0DEHjNpCMDxkR7szNiFrKXn1DAXFyd7bSWSvTFogZev5TM5V9rKICMInbYmbJQtw==")
            ),
            var6
         );
         String var18 = var17.Xqedii_12hok2s();
         var17.Xqedii_weheyl6(var3);
         this.Xqedii_3153b6r(
            Xqedii_28rad3ts8dqak(
               String.valueOf(var3), var1.size(), Xqedii_2164tae(this.Xqedii_rnovv49), Xqedii_2164tae(this.Xqedii_s1m6hrv), this.Xqedii_3ea0t6n
            )
         );
         Map var9 = Xqedii_29ge1r6.Xqedii_15tec8i();
         var9.put(
            Xqedii_3kxq725.Xqedii_fegndy6y367g("CeNURSsssaCsK/wT7ukB/nuZR7I3SK+z0xxKY8qeIefd0NawbZBTtj0E8apJ5w=="),
            Xqedii_3kxq725.Xqedii_fegndy6y367g("QXVd3ZB9lG0fUW/p0ZUsVfDMP3FSIUgs/YsoK7Pl2Y/XWg==")
         );
         ArrayList var10 = new ArrayList();
         ArrayList var11 = new ArrayList();
         int var12 = Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(856401732, 19);

         for (Xqedii_2kb1ns6 var14 : var1) {
            String var15 = Xqedii_10r3ywpn999b8(var14.Xqedii_2kz3xjg);
            this.Xqedii_3153b6r(
               Xqedii_1j0ax1day6hfp(
                  var14.Xqedii_3j6s705,
                  var14.Xqedii_2kz3xjg,
                  var14.Xqedii_ggpkjmc.size(),
                  var14.Xqedii_b0fv9fz,
                  var14.Xqedii_1ei4hmh,
                  var14.Xqedii_1jqflox,
                  var14.Xqedii_sytzb79 >= 0
                     ? Xqedii_3kxq725.Xqedii_fegndy6y367g("0X9Lt8IYcc2XCmPcidcsFArJjo2K/Z2qcAd+105HL43QPCxqbsZK2Fboc8gYng==")
                     : Xqedii_3kxq725.Xqedii_fegndy6y367g("8syrNsIxg6ssOjPTOk3A+xyqlhTV1tyLi78rNA=="),
                  var14.Xqedii_1mt8sib(),
                  var14.Xqedii_3omdmsa,
                  var14.Xqedii_3ow3583.size(),
                  Xqedii_28xaqz0(var14.Xqedii_s8xbs95())
               )
            );
            var9.put(var15, this.Xqedii_36hjqhg(var14, var17, var18, var2, var9, (Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(-869360368, 21) != 0)));
            var10.add(Xqedii_2dr0g9h(Xqedii_3imp9514dtcwq(var15, var15), Xqedii_29ge1r6.Xqedii_15tec8i()));
            if (this.Xqedii_3ea0t6n && var14.Xqedii_3w4yc84()) {
               String var16 = Xqedii_1sv7s94na7mey(var14.Xqedii_2kz3xjg);
               var9.put(var16, this.Xqedii_36hjqhg(var14, var17, var18, var2, var9, (Xqedii_3kxq725.Xqedii_2d38ro98tsmqh(1496022767, 27) != 0)));
               var11.add(Xqedii_2dr0g9h(Xqedii_b1s4psiplauj(var16, var16), Xqedii_29ge1r6.Xqedii_15tec8i()));
            }

            var12 += var14.Xqedii_ggpkjmc.size();
         }

         var9.put(Xqedii_3kxq725.Xqedii_fegndy6y367g("ewnMBw0as3cteDX35Q7jKzIE2+RBOyNrMPhYdbvnZwo5NMr8laE118kMSMwwLQ=="), this.Xqedii_1kzuvnb(var10));
         var9.put(Xqedii_3kxq725.Xqedii_fegndy6y367g("ySJsQQTGJ1IQCb7/EeZEVPDke/lJ2ZVbSXQnFrkGs+VUZQKOhBUUs8fFhuu2QjEt"), this.Xqedii_1kzuvnb(var11));
         int var19 = var17.Xqedii_2uqsfny();
         if (var19 > 0) {
            this.Xqedii_3153b6r(Xqedii_1ie4bz1reg095(var19));
         }

         this.Xqedii_3297wz8(
            new File(var5, Xqedii_3kxq725.Xqedii_fegndy6y367g("7/POdikFQBsqBYp33p7+F5TsN269l3g2o2hq1Pic52DJki9tbYxiufGIO9YcbxZuxpbQAsEynwBltS3Y")),
            Xqedii_29ge1r6.Xqedii_zaf20q7(var9)
         );
         this.Xqedii_3297wz8(
            new File(var4, Xqedii_3kxq725.Xqedii_fegndy6y367g("Hw0f9owGqrGsuAcHtWiUxKPLdRAsbOdnw6M4AHs1KFZIV+fYdVQ89aMmH7vC/m+DOfO1n72xja7v8Ebu")),
            Xqedii_29ge1r6.Xqedii_zaf20q7(this.Xqedii_3o9nf7h())
         );
         this.Xqedii_3297wz8(
            new File(var4, Xqedii_3kxq725.Xqedii_fegndy6y367g("OrYGqGjIbvYRpe28JL3FxhkocB7q8bbv3OHMCw3WSXuj1ws4UZOG98m5cVjP1w19j41wnWW3")),
            Xqedii_29ge1r6.Xqedii_zaf20q7(this.Xqedii_3k9g5n8())
         );
         this.Xqedii_3hhz4ql = this.Xqedii_22cnhtn(var3);
         this.Xqedii_3297wz8(
            new File(var3, Xqedii_3kxq725.Xqedii_fegndy6y367g("xpoYHuGxydjv92CcJ4CLT99YbsiwMS+Bgh9MzHrf1NkTSSfVr1ihznSM7AXGH/G7XGw2b884")),
            Xqedii_29ge1r6.Xqedii_zaf20q7(this.Xqedii_3n33qm0())
         );
         this.Xqedii_1sv0x4x(var1);
         File var20 = this.Xqedii_1sujeju(var3);
         return new Xqedii_1rr9pk9(
            var3,
            var20,
            var1.size(),
            var12,
            var17.Xqedii_lgiu7qj(),
            Xqedii_2142hntwhbxm8(
               this.Xqedii_3hhz4ql[Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(1712803464, 20)],
               this.Xqedii_3hhz4ql[Xqedii_3kxq725.Xqedii_jto013pcop9d(-2011911029, 8)],
               this.Xqedii_3hhz4ql[Xqedii_3kxq725.Xqedii_2d38ro98tsmqh(1459478210, 4)]
            ),
            var2
         );
      }
   }

   public void Xqedii_1sv0x4x(List<Xqedii_2kb1ns6> var1) throws IOException {
      if (((-115272839 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         File var2 = new File(
            this.Xqedii_ef13m9a, Xqedii_3kxq725.Xqedii_fegndy6y367g("lAsCoqYz5hzak3/oKa2PXrfjeLIDRttD85SHEVq0+b9HbbjNomXyHmk5heIfQ6Pk4J+G8RyEdU99wD7CpWA=")
         );
         if (!var2.isDirectory() && !var2.mkdirs()) {
            throw new IOException(Xqedii_2e9x183nhdx66(String.valueOf(var2)));
         } else {
            Properties var3 = new Properties();

            for (Xqedii_2kb1ns6 var5 : var1) {
               var3.setProperty(
                  var5.Xqedii_3j6s705.toLowerCase(Locale.ROOT),
                  Xqedii_1m597i4nkfkih(
                     var5.Xqedii_2kz3xjg,
                     var5.Xqedii_b0fv9fz,
                     var5.Xqedii_1ei4hmh,
                     var5.Xqedii_1jqflox,
                     var5.Xqedii_12px6oi(),
                     var5.Xqedii_sytzb79,
                     this.Xqedii_3c97ne5(var5) ? Xqedii_3kxq725.Xqedii_17tuii68gypp4(987835742, 21) : Xqedii_3kxq725.Xqedii_jto013pcop9d(2011911028, 15)
                  )
               );
            }

            try (OutputStream var9 = Files.newOutputStream(
                  new File(var2, Xqedii_3kxq725.Xqedii_fegndy6y367g("S2vOWAPlAGRHHI2eRvMCeCBMrpLzpK2Pf/bmGc10yF3mR1xbuTre625gLOWH/aqIginxc1CF36BvLVUV"))
                     .toPath()
               )) {
               var3.store(
                  var9,
                  Xqedii_3kxq725.Xqedii_fegndy6y367g(
                     "baHUK4D2Wvc10IOpnJTIzwS6BXai8/MqBVOqsFgbcWrLOGKofbUxc6Xa0OJGECTMhTA2j7b8x5cIYLuDdl09vbfrhHhSgB+0ixUI9J+nVoMala/xABY/B3QkecMx3C9u2bx14GlvLdXNlNqBkkf2z4QDuH1nUNQXGMLtnaBfwxSBBAuyE9bnv2042KIboGnc8dpSwefVFcpQYafqsrYnhXC4Z1V26TW/fUHSVLZYoc3KTKLy2fzOy1LDJ0DeDIWgt7W0mYiqvRqyYal+J9N6PoeK78Lld8QPS6uGOSAbZMPfU2cNCM41nxxUDbvMho07FGAwQUyqtYg="
                  )
               );
            }
         }
      }
   }

   public boolean Xqedii_3c97ne5(Xqedii_2kb1ns6 var1) {
      if (((788714628 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_3ea0t6n && var1 != null && var1.Xqedii_3w4yc84()
            ? Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(-1575386669, 10)
            : Xqedii_3kxq725.Xqedii_2d38ro98tsmqh(1459478178, 4)) != 0);
      }
   }

   public Map<String, int[]> Xqedii_25ymzyo() {
      if (((204264461 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var1 = new LinkedHashMap();
         File var2 = new File(
            new File(
               this.Xqedii_ef13m9a, Xqedii_3kxq725.Xqedii_fegndy6y367g("lAsCoqYz5hzak3/oKa2PXrfjeLIDRttD85SHEVq0+b9HbbjNomXyHmk5heIfQ6Pk4J+G8RyEdU99wD7CpWA=")
            ),
            Xqedii_3kxq725.Xqedii_fegndy6y367g("S2vOWAPlAGRHHI2eRvMCeCBMrpLzpK2Pf/bmGc10yF3mR1xbuTre625gLOWH/aqIginxc1CF36BvLVUV")
         );
         if (!var2.isFile()) {
            return var1;
         } else {
            Properties var3 = new Properties();

            try (InputStream var4 = Files.newInputStream(var2.toPath())) {
               var3.load(var4);
            } catch (IOException var11) {
               return var1;
            }

            for (String var5 : var3.stringPropertyNames()) {
               String[] var6 = var3.getProperty(var5, Xqedii_3kxq725.Xqedii_fegndy6y367g("8syrNsIxg6ssOjPTOk3A+xyqlhTV1tyLi78rNA=="))
                  .split(Xqedii_3kxq725.Xqedii_fegndy6y367g("xVc+b9odF66W6gNjEaRM92Jn1l72q7WFyKcnKOSr"));
               if (var6.length >= Xqedii_3kxq725.Xqedii_17tuii68gypp4(2059480414, 28) && var6.length <= Xqedii_3kxq725.Xqedii_jto013pcop9d(-2012042101, 16)) {
                  try {
                     String var10001 = var5.toLowerCase(Locale.ROOT);
                     int[] var10002 = new int[Xqedii_3kxq725.Xqedii_2d38ro98tsmqh(-541334966, 9)];
                     var10002[Xqedii_3kxq725.Xqedii_jto013pcop9d(2011911028, 6)] = Integer.parseInt(
                        var6[Xqedii_3kxq725.Xqedii_jto013pcop9d(2011911028, 20)].trim()
                     );
                     var10002[Xqedii_3kxq725.Xqedii_jto013pcop9d(-2011911029, 15)] = Integer.parseInt(
                        var6[Xqedii_3kxq725.Xqedii_2d38ro98tsmqh(-558737667, 20)].trim()
                     );
                     var10002[Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(-865166064, 21)] = Integer.parseInt(
                        var6[Xqedii_3kxq725.Xqedii_jto013pcop9d(-2009813877, 21)].trim()
                     );
                     var10002[Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(-2006571186, 12)] = Integer.parseInt(
                        var6[Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(1950560570, 7)].trim()
                     );
                     var10002[Xqedii_3kxq725.Xqedii_2d38ro98tsmqh(-541336502, 9)] = var6.length >= Xqedii_3kxq725.Xqedii_2d38ro98tsmqh(-458359875, 29)
                        ? Integer.parseInt(var6[Xqedii_3kxq725.Xqedii_17tuii68gypp4(-1161745058, 29)].trim())
                        : Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(1144197031, 11);
                     var10002[Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(1196329062, 28)] = var6.length >= Xqedii_3kxq725.Xqedii_2d38ro98tsmqh(2009109951, 18)
                        ? Integer.parseInt(var6[Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(1317561927, 4)].trim())
                        : Xqedii_3kxq725.Xqedii_jto013pcop9d(1743475572, 29);
                     var10002[Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(1000817715, 27)] = var6.length >= Xqedii_3kxq725.Xqedii_2d38ro98tsmqh(-996819081, 26)
                        ? Integer.parseInt(var6[Xqedii_3kxq725.Xqedii_z5hawwfhx1yy(1735714950, 24)].trim())
                        : Xqedii_3kxq725.Xqedii_17tuii68gypp4(1002515806, 25);
                     var1.put(var10001, var10002);
                  } catch (NumberFormatException var9) {
                  }
               }
            }

            return var1;
         }
      }
   }

   private static /* synthetic */ String Xqedii_vflnl51bfyax(String string) {
        return Xqedii_3kxq725.Xqedii_fegndy6y367g("pChHXuaiPBF4hNKL1Sa1FaOXmb+GnvufKTRdH8gk/Pr2mkbcsj4Q7mM7+Y91zUqICYk4wWtEV/D8b26PVyc=") + string;
    }

    private static /* synthetic */ String Xqedii_28rad3ts8dqak(String string, int n, String string2, String string3, boolean bl) {
        return Xqedii_3kxq725.Xqedii_fegndy6y367g("oBD3ADaBRVNY4x/Jkv+guV0YVcbQCl34heOmpJo+CI1g5LogAY3IpD7jLXxiqR2pwWZvIe6xljtWs5+qBaMxYGdae/k=") + string + Xqedii_3kxq725.Xqedii_fegndy6y367g("LjuGSLCIRcNei2hk+jnubU1u0XBYubbtbMxTfBD8KYS3eoFwpQ0qgmFF") + n + Xqedii_3kxq725.Xqedii_fegndy6y367g("Lss6DaGuiBNJD2htIulsqxG71Uc31+Mid4IAGt/5tO7xKhXxCPU98C8Yd5fFJ2lr0/A=") + string2 + Xqedii_3kxq725.Xqedii_fegndy6y367g("4bba6Ci0cwo6W+dOmXFCsgKNF2NNEfNIGGHvIIOr") + string3 + Xqedii_3kxq725.Xqedii_fegndy6y367g("dLUiWP7V2Ati66NLFfR0nrXAU6rknlvqI86Z7CP4/tK4hej7D1UEBmX7RXD9BRc9vB644fb2duw=") + bl;
    }

    private static /* synthetic */ String Xqedii_10r3ywpn999b8(int n) {
        return Xqedii_3kxq725.Xqedii_fegndy6y367g("VYmksE1wXlVzIoOBKiVwWL7GTHFC8WwZiAeqkGDuHDitreiXs3c=") + n;
    }

    private static /* synthetic */ String Xqedii_1j0ax1day6hfp(String string, int n, int n2, int n3, int n4, int n5, String string2, int n6, int n7, int n8, String string3) {
        return Xqedii_3kxq725.Xqedii_fegndy6y367g("QHTFM6AYjaMbyeOcCPX56X2Yl/fNpePRDMerKSB42ManaRYo3/HOpg==") + string + Xqedii_3kxq725.Xqedii_fegndy6y367g("yrCpaegPA5LKXYgMWnWriFlfGhH+Mhxi5aGYOOkXTry/b7b9dez5/u+MCCg=") + n + Xqedii_3kxq725.Xqedii_fegndy6y367g("aig0SW8TSTaDf6RtfCgxU5oLxsp4St3oLTywTYmvKS+XCliwdJJfg4Vs3ID+H3b1") + n2 + Xqedii_3kxq725.Xqedii_fegndy6y367g("cqju9c+QVDiksEUuUhDe2cY6X6QF6bvKtFvEIp71nvCY6sDZa2dbwCa6mgDivA==") + n3 + Xqedii_3kxq725.Xqedii_fegndy6y367g("mCaw6HpzRJ231ToHkZRIvpfN2b6BBNhhF8yg+S5vON9B8hXDfDDwojhwtYk=") + n4 + Xqedii_3kxq725.Xqedii_fegndy6y367g("6eGWn9z5sAMBZgOCZySpn2hpVLYuhxXxko76ZHHeJW9trFamgOku4UIF") + n5 + Xqedii_3kxq725.Xqedii_fegndy6y367g("7XrXd6x1HoF2gYuif73rbgY+rM+TGwAsuN9Zyy+AkxwX5XMYcfu2mDeM") + string2 + Xqedii_3kxq725.Xqedii_fegndy6y367g("KcF9IW4pzCidvbj9r5p6a4buEWQqquItqx/IPDc88hrmcw==") + n6 + Xqedii_3kxq725.Xqedii_fegndy6y367g("xLqukVxeQHM1H5pZzWD60RnszVZ4+pBGgthYWda7GnKLcCLR97+T4vVyEwI=") + n7 + Xqedii_3kxq725.Xqedii_fegndy6y367g("W0JhNguSMyyNmhvz8cCr2D8ryaxYX2SBJz1/Bt6s7adAeDoJTzGeNKNs5eDz54w+pUAjRA1g") + n8 + Xqedii_3kxq725.Xqedii_fegndy6y367g("rAWvUBS5Ik/M0xrzI/t0Dhx5pj2yQ4bGAK0W1DO8W//gMPy1AXsUEaBAPaQ=") + string3;
    }

    private static /* synthetic */ String Xqedii_3imp9514dtcwq(String string, String string2) {
        return string + Xqedii_3kxq725.Xqedii_fegndy6y367g("46w/o7O2y5oF7nQ/eHYFdZeWRXkrJReaJSaWcn83GIzO2KT8vXhn/yZvbRkO8bGd") + string2;
    }

    private static /* synthetic */ String Xqedii_1sv7s94na7mey(int n) {
        return Xqedii_3kxq725.Xqedii_fegndy6y367g("R/33uCqwgtuED6/Qc3D4pw+Gnzr/jBMkxFhbT0lnRIbtPmy427+tYR+hCpktC7GG7OY=") + n;
    }

    private static /* synthetic */ String Xqedii_b1s4psiplauj(String string, String string2) {
        return string + Xqedii_3kxq725.Xqedii_fegndy6y367g("46w/o7O2y5oF7nQ/eHYFdZeWRXkrJReaJSaWcn83GIzO2KT8vXhn/yZvbRkO8bGd") + string2;
    }

    private static /* synthetic */ String Xqedii_1ie4bz1reg095(int n) {
        return Xqedii_3kxq725.Xqedii_fegndy6y367g("lnNkGUOj70GWobu7l5rDUKFqOnm5KPSxg907OwZS7DOHHLJreQx+I4/Cbsg=") + n + Xqedii_3kxq725.Xqedii_fegndy6y367g("Ik9JBZK1knD4zcLEVvtEPu+UENLWkgT2Koc0F22AuOBXHBcia/ta0qztNaQAWRHzVMbz2IJGfkethbBaYDm7/Rqut5GyD52/UOjjt6HKRXG/5g4pj3GqSiVhDMCaWnSiTy2sA7XTzZ4=");
    }

    private static /* synthetic */ String Xqedii_2142hntwhbxm8(int n, int n2, int n3) {
        return n + Xqedii_3kxq725.Xqedii_fegndy6y367g("YuuYfoIHv+dbI9EVhjJ6Ny0XBfPNwOMukduW4ugs") + n2 + Xqedii_3kxq725.Xqedii_fegndy6y367g("YuuYfoIHv+dbI9EVhjJ6Ny0XBfPNwOMukduW4ugs") + n3;
    }

    private static /* synthetic */ String Xqedii_2e9x183nhdx66(String string) {
        return Xqedii_3kxq725.Xqedii_fegndy6y367g("pChHXuaiPBF4hNKL1Sa1FaOXmb+GnvufKTRdH8gk/Pr2mkbcsj4Q7mM7+Y91zUqICYk4wWtEV/D8b26PVyc=") + string;
    }

    private static /* synthetic */ String Xqedii_1m597i4nkfkih(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        return n + Xqedii_3kxq725.Xqedii_fegndy6y367g("xVc+b9odF66W6gNjEaRM92Jn1l72q7WFyKcnKOSr") + n2 + Xqedii_3kxq725.Xqedii_fegndy6y367g("xVc+b9odF66W6gNjEaRM92Jn1l72q7WFyKcnKOSr") + n3 + Xqedii_3kxq725.Xqedii_fegndy6y367g("xVc+b9odF66W6gNjEaRM92Jn1l72q7WFyKcnKOSr") + n4 + Xqedii_3kxq725.Xqedii_fegndy6y367g("xVc+b9odF66W6gNjEaRM92Jn1l72q7WFyKcnKOSr") + n5 + Xqedii_3kxq725.Xqedii_fegndy6y367g("xVc+b9odF66W6gNjEaRM92Jn1l72q7WFyKcnKOSr") + n6 + Xqedii_3kxq725.Xqedii_fegndy6y367g("xVc+b9odF66W6gNjEaRM92Jn1l72q7WFyKcnKOSr") + n7;
    }
}
