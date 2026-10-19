package dev.xqedii.ultimateUI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.imageio.ImageIO;

public final class Xqedii_3boar8q {
   public static final String Xqedii_3hh2tp0atrksa = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final int Xqedii_2902yfg = 8;
   public final File Xqedii_26uwye0;
   public final File Xqedii_czix6ch;
   public int Xqedii_6ya1vvr;
   public int Xqedii_1veedra;
   public final Set<String> Xqedii_1k02n8a = new HashSet<>();
   public static final int Xqedii_2mjif7l = 512;

   public Xqedii_3boar8q(File var1, File var2) {
      this.Xqedii_26uwye0 = var1;
      this.Xqedii_czix6ch = var2;
   }

   public int Xqedii_i0mc3tn() {
      if ((1608065847 * 1608065847 - 1608065847 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_6ya1vvr;
      }
   }

   public int Xqedii_3b5wyon() {
      if ((-1042536139 * -1042536139 + -1042536139 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1veedra;
      }
   }

   public int Xqedii_lgiu7qj() {
      if ((294373860 * 294373860 - 294373860 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1k02n8a.size();
      }
   }

   public String Xqedii_2uhab9t(String var1) throws IOException {
      if ((-885734979 * -885734979 + -885734979 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         File var2 = this.Xqedii_37cef9s(var1);
         if (var2 == null) {
            return Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("sdpCr1vzw2uhOPEWISVrFE3Lvo1PIDNOTq4lvA==");
         } else {
            File var3 = new File(this.Xqedii_czix6ch, Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("4GosR9KrbSu/NiInh7m12k3TCTI6quWpp+6AlhldaU0Djw=="));
            if (!var3.isDirectory() && !var3.mkdirs()) {
               throw new IOException(Xqedii_3isgtnulz59hi(String.valueOf(var3)));
            } else {
               File var4 = new File(var3, Xqedii_1pwry4lrt5d55(var1));
               this.Xqedii_1k02n8a.add(Xqedii_33nbru9hjhlqk(var1));
               if (var4.isFile() && var4.lastModified() >= var2.lastModified()) {
                  return Xqedii_1yai9u4d2twyj(var1);
               } else {
                  if (var2.getName().toLowerCase(Locale.ROOT).endsWith(Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("OzInpFMWahbw9YnanZq4thzhGtNXauHNvUcnx5G07xsAKoGn"))
                     )
                   {
                     Path var10000 = var2.toPath();
                     Path var10001 = var4.toPath();
                     CopyOption[] var10002 = new CopyOption[Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(-49934399, 16)];
                     var10002[Xqedii_3fb3sd8.Xqedii_3h3r8rn69ro1l(184570184, 16)] = StandardCopyOption.REPLACE_EXISTING;
                     Files.copy(var10000, var10001, var10002);
                  } else {
                     BufferedImage var5 = ImageIO.read(var2);
                     if (var5 == null) {
                        return Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("sdpCr1vzw2uhOPEWISVrFE3Lvo1PIDNOTq4lvA==");
                     }

                     BufferedImage var6 = new BufferedImage(var5.getWidth(), var5.getHeight(), Xqedii_3fb3sd8.Xqedii_3h3r8rn69ro1l(-184572233, 11));
                     Graphics2D var7 = var6.createGraphics();

                     try {
                        var7.drawImage(var5, Xqedii_3fb3sd8.Xqedii_36y2cgz23svvo(1033616486, 8), Xqedii_3fb3sd8.Xqedii_3h3r8rn69ro1l(184570184, 12), null);
                     } finally {
                        var7.dispose();
                     }

                     ImageIO.write(var6, Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("CW9GE9I0gKtPf5HS3rAk3oGFplomImdNANyKXmvieJDhpw=="), var4);
                  }

                  this.Xqedii_6ya1vvr = this.Xqedii_6ya1vvr + Xqedii_3fb3sd8.Xqedii_3h3r8rn69ro1l(-184570185, 6);
                  return Xqedii_3rtou2ccxvept(var1);
               }
            }
         }
      } else {
         return Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("sdpCr1vzw2uhOPEWISVrFE3Lvo1PIDNOTq4lvA==");
      }
   }

   public File Xqedii_37cef9s(String var1) {
      if (((-894505784 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         File[] var2 = this.Xqedii_26uwye0 == null ? null : this.Xqedii_26uwye0.listFiles();
         if (var2 == null) {
            return null;
         } else {
            File[] var3 = var2;
            int var4 = var2.length;

            for (int var5 = Xqedii_3fb3sd8.Xqedii_36y2cgz23svvo(1033616486, 29); var5 < var4; var5++) {
               File var6 = var3[var5];
               if (var6 != null && var6.isFile()) {
                  String var7 = var6.getName();
                  int var8 = var7.lastIndexOf(Xqedii_3fb3sd8.Xqedii_36y2cgz23svvo(-1113867155, 30));
                  if (var8 > 0 && Xqedii_wq55eud.Xqedii_2xjes65(var7.substring(Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(-1040382705, 8), var8)).equals(var1)) {
                     return var6;
                  }
               }
            }

            return null;
         }
      }
   }

   public String Xqedii_12hok2s() throws IOException {
      if ((1396842779 * (1396842779 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File var1 = new File(this.Xqedii_czix6ch, Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("fDtDjf6cOSJMHV7VjliB1JZEve25B6B0E1xRrw+nd2yPbsHp78H+5iBrGM8WWg=="));
         this.Xqedii_1k02n8a.add(Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("fDtDjf6cOSJMHV7VjliB1JZEve25B6B0E1xRrw+nd2yPbsHp78H+5iBrGM8WWg=="));
         if (!var1.isFile()) {
            BufferedImage var2 = new BufferedImage(
               Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(264371469, 0),
               Xqedii_3fb3sd8.Xqedii_y1prptdu9kpo(-1429913319, 26),
               Xqedii_3fb3sd8.Xqedii_36y2cgz23svvo(1033616614, 6)
            );
            Graphics2D var3 = var2.createGraphics();

            try {
               var3.setColor(Color.WHITE);
               var3.fillRect(
                  Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(-1577566304, 29),
                  Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(-520191353, 7),
                  Xqedii_3fb3sd8.Xqedii_3h3r8rn69ro1l(-83906889, 25),
                  Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(219136509, 24)
               );
            } finally {
               var3.dispose();
            }

            this.Xqedii_2cmz1id(var1);
            ImageIO.write(var2, Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("CW9GE9I0gKtPf5HS3rAk3oGFplomImdNANyKXmvieJDhpw=="), var1);
            this.Xqedii_1veedra = this.Xqedii_1veedra + Xqedii_3fb3sd8.Xqedii_y1prptdu9kpo(-1474088488, 7);
         }

         return Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("A5GCcl3IWfZ4o30B4C2DCSdzylEq+uLeUQTFuNfkS+a2z6+p/vW5z12W4NfY7lXhoDrj7D3AFBTZfCN1WU34s/czo/NhVQ==");
      }
   }

   public String Xqedii_3hykzkc(double var1, double var3, double var5, boolean var7, boolean var8, boolean var9, boolean var10) throws IOException {
      if (((1804840893 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double var11 = Math.max(Double.longBitsToDouble(Xqedii_3fb3sd8.Xqedii_p0aegcqq80e2(2534305081689872873L, 26)), var1);
         double var13 = Math.max(Double.longBitsToDouble(Xqedii_3fb3sd8.Xqedii_p0aegcqq80e2(-3294850067293982925L, 19)), var3);
         double var15 = Double.longBitsToDouble(Xqedii_3fb3sd8.Xqedii_3ikxg5flrpsnz(3479356964151924384L, 2)) / Math.max(var11, var13);
         int var17 = Math.max(Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(118473213, 24), (int)Math.round(var11 * var15));
         int var18 = Math.max(Xqedii_3fb3sd8.Xqedii_y1prptdu9kpo(705219606, 5), (int)Math.round(var13 * var15));
         int var19 = (int)Math.round(
            Math.min(var5, Math.min(var11, var13) / Double.longBitsToDouble(Xqedii_3fb3sd8.Xqedii_3ikxg5flrpsnz(-1627484859728685200L, 46))) * var15
         );
         var19 = Math.max(
            Xqedii_3fb3sd8.Xqedii_y1prptdu9kpo(836282403, 23), Math.min(var19, Math.min(var17, var18) / Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(236946426, 25))
         );
         String var20 = Xqedii_1b3b9rfp0y7k1(
            var7
               ? Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("nliww8ewM3g0mKrUXX4CRxj5nUZ2rvemAuW8HxHA")
               : Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("oBnmOPYxlcPg7fbvAC0oEEiaDubAU0kqN/RIaiTb"),
            var8
               ? Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("nliww8ewM3g0mKrUXX4CRxj5nUZ2rvemAuW8HxHA")
               : Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("oBnmOPYxlcPg7fbvAC0oEEiaDubAU0kqN/RIaiTb"),
            var9
               ? Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("nliww8ewM3g0mKrUXX4CRxj5nUZ2rvemAuW8HxHA")
               : Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("oBnmOPYxlcPg7fbvAC0oEEiaDubAU0kqN/RIaiTb"),
            var10
               ? Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("nliww8ewM3g0mKrUXX4CRxj5nUZ2rvemAuW8HxHA")
               : Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("oBnmOPYxlcPg7fbvAC0oEEiaDubAU0kqN/RIaiTb")
         );
         String var21 = Xqedii_32ym35xbh2isj(var17, var18, var19, var20);
         String var22 = Xqedii_2fo7m9ov7asl9(var21);
         File var23 = new File(this.Xqedii_czix6ch, Xqedii_9ijys8dxytwb(var21));
         this.Xqedii_1k02n8a.add(Xqedii_3tjnfvh0h8cty(var21));
         if (var23.isFile()) {
            return var22;
         } else {
            BufferedImage var24 = new BufferedImage(var17, var18, Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(-797901793, 20));
            Graphics2D var25 = var24.createGraphics();

            try {
               var25.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
               var25.setColor(Color.WHITE);
               Area var26 = new Area(
                  new java.awt.geom.RoundRectangle2D.Double(
                     Double.longBitsToDouble(Xqedii_3fb3sd8.Xqedii_p0aegcqq80e2(9051833047637341721L, 6)),
                     Double.longBitsToDouble(Xqedii_3fb3sd8.Xqedii_3ikxg5flrpsnz(-6831317245508514154L, 58)),
                     var17,
                     var18,
                     var19 * Double.longBitsToDouble(Xqedii_3fb3sd8.Xqedii_3pgsen6ath93i(7251004740026437723L, 15)),
                     var19 * Double.longBitsToDouble(Xqedii_3fb3sd8.Xqedii_p0aegcqq80e2(7805577344208696609L, 55))
                  )
               );
               if (!var7) {
                  var26.add(
                     new Area(
                        new java.awt.geom.Rectangle2D.Double(
                           Double.longBitsToDouble(Xqedii_3fb3sd8.Xqedii_3pgsen6ath93i(7251004740026445915L, 63)),
                           Double.longBitsToDouble(Xqedii_3fb3sd8.Xqedii_3pgsen6ath93i(7251004740026445915L, 31)),
                           var19,
                           var19
                        )
                     )
                  );
               }

               if (!var8) {
                  var26.add(
                     new Area(
                        new java.awt.geom.Rectangle2D.Double(
                           var17 - var19, Double.longBitsToDouble(Xqedii_3fb3sd8.Xqedii_3ikxg5flrpsnz(-1288824155179691662L, 35)), var19, var19
                        )
                     )
                  );
               }

               if (!var9) {
                  var26.add(new Area(new java.awt.geom.Rectangle2D.Double(var17 - var19, var18 - var19, var19, var19)));
               }

               if (!var10) {
                  var26.add(
                     new Area(
                        new java.awt.geom.Rectangle2D.Double(
                           Double.longBitsToDouble(Xqedii_3fb3sd8.Xqedii_3ikxg5flrpsnz(4784109582692523309L, 59)), var18 - var19, var19, var19
                        )
                     )
                  );
               }

               var25.fill(var26);
            } finally {
               var25.dispose();
            }

            this.Xqedii_2cmz1id(var23);
            ImageIO.write(var24, Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("CW9GE9I0gKtPf5HS3rAk3oGFplomImdNANyKXmvieJDhpw=="), var23);
            this.Xqedii_1veedra = this.Xqedii_1veedra + Xqedii_3fb3sd8.Xqedii_3h3r8rn69ro1l(-184570185, 4);
            return var22;
         }
      }
   }

   public int Xqedii_2uqsfny() {
      if (((-1945215179 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var1 = new ArrayList();
         Xqedii_1g1e2p1(this.Xqedii_czix6ch, var1);
         int var2 = Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(1057485844, 2);

         for (File var4 : (Iterable<File>) (var1)) {

            String var5 = this.Xqedii_czix6ch
               .toPath()
               .relativize(var4.toPath())
               .toString()
               .replace(File.separatorChar, (char)Xqedii_3fb3sd8.Xqedii_3h3r8rn69ro1l(-190599497, 17));
            if (!this.Xqedii_1k02n8a.contains(var5) && var4.delete()) {
               var2++;
            }
         }

         return var2;
      }
   }

   public static void Xqedii_1g1e2p1(File var0, List<File> var1) {
      if ((-960944159 ^ -960944159) != 0) {
         throw new IllegalStateException();
      } else {
         File[] var2 = var0 == null ? null : var0.listFiles();
         if (var2 != null) {
            File[] var3 = var2;
            int var4 = var2.length;

            for (int var5 = Xqedii_3fb3sd8.Xqedii_3h3r8rn69ro1l(184570184, 0); var5 < var4; var5++) {
               File var6 = var3[var5];
               if (var6.isDirectory()) {
                  Xqedii_1g1e2p1(var6, var1);
               } else if (var6.isFile()) {
                  var1.add(var6);
               }
            }
         }
      }
   }

   public void Xqedii_weheyl6(File var1) throws IOException {
      if (((1265767102 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         File var2 = new File(var1, Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("Kr2NNFldnp4XRfsKnDDfjdsG3Es+wLlHpZoOFaYS6BfuVqF9q6qadVIffTCd7/0cK2Ar+m+p"));
         if (!var2.isFile()) {
            int var3 = Xqedii_3fb3sd8.Xqedii_36y2cgz23svvo(1033616484, 27);
            BufferedImage var4 = new BufferedImage(var3, var3, Xqedii_3fb3sd8.Xqedii_36y2cgz23svvo(1037810790, 21));
            Graphics2D var5 = var4.createGraphics();

            try {
               var5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
               var5.setColor(
                  new Color(
                     Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(-65023440, 4),
                     Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(2114971928, 3),
                     Xqedii_3fb3sd8.Xqedii_36y2cgz23svvo(1033477222, 12)
                  )
               );
               var5.fillRoundRect(
                  Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(-799998945, 20),
                  Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(-2015297918, 31),
                  var3,
                  var3,
                  Xqedii_3fb3sd8.Xqedii_3h3r8rn69ro1l(-184930633, 15),
                  Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(-787416033, 20)
               );
               var5.setColor(
                  new Color(
                     Xqedii_3fb3sd8.Xqedii_y1prptdu9kpo(-1238759224, 29),
                     Xqedii_3fb3sd8.Xqedii_y1prptdu9kpo(1092344517, 10),
                     Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(-133153017, 18)
                  )
               );
               var5.fillRoundRect(
                  Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(-2015297912, 31),
                  Xqedii_3fb3sd8.Xqedii_y1prptdu9kpo(1181659472, 16),
                  var3 - Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(-48427071, 16),
                  var3 - Xqedii_3fb3sd8.Xqedii_2o6bzpu9bo5zm(-1577566301, 29),
                  Xqedii_3fb3sd8.Xqedii_3h3r8rn69ro1l(-184570169, 4),
                  Xqedii_3fb3sd8.Xqedii_36y2cgz23svvo(1033550950, 13)
               );
            } finally {
               var5.dispose();
            }

            this.Xqedii_2cmz1id(var2);
            ImageIO.write(var4, Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("CW9GE9I0gKtPf5HS3rAk3oGFplomImdNANyKXmvieJDhpw=="), var2);
         }
      }
   }

   public void Xqedii_2cmz1id(File var1) throws IOException {
      if (((-1756467434 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         File var2 = var1.getParentFile();
         if (var2 != null && !var2.isDirectory() && !var2.mkdirs()) {
            throw new IOException(Xqedii_2u7w9ycixey0p(String.valueOf(var2)));
         }
      }
   }

   private static /* synthetic */ String Xqedii_3isgtnulz59hi(String string) {
        return Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("HcXJ4rstdQwGoNreIddpcwFCd2lrBI481Q5n/+C/VyfAH5lj9+h5UlVIM1j0kUfkLgb1Dms97N/4Ks/EWPk=") + string;
    }

    private static /* synthetic */ String Xqedii_1pwry4lrt5d55(String string) {
        return string + Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("OzInpFMWahbw9YnanZq4thzhGtNXauHNvUcnx5G07xsAKoGn");
    }

    private static /* synthetic */ String Xqedii_33nbru9hjhlqk(String string) {
        return Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("58iLTdpBvWdha5VIlLZOu7xRspuinRs4CbIjVGUffzsi7nl7") + string + Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("OzInpFMWahbw9YnanZq4thzhGtNXauHNvUcnx5G07xsAKoGn");
    }

    private static /* synthetic */ String Xqedii_1yai9u4d2twyj(String string) {
        return Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("tywr8NlPX6eYGvV/jfJZUlH/l/EENYMKQY5NTVnJXm4AX+A+iiDJR6ue4h7boobTNJRwdFKyEhaat5haCxP7+waAIkE=") + string;
    }

    private static /* synthetic */ String Xqedii_3rtou2ccxvept(String string) {
        return Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("tywr8NlPX6eYGvV/jfJZUlH/l/EENYMKQY5NTVnJXm4AX+A+iiDJR6ue4h7boobTNJRwdFKyEhaat5haCxP7+waAIkE=") + string;
    }

    private static /* synthetic */ String Xqedii_1b3b9rfp0y7k1(String string, String string2, String string3, String string4) {
        return string + string2 + string3 + string4;
    }

    private static /* synthetic */ String Xqedii_32ym35xbh2isj(int n, int n2, int n3, String string) {
        return Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("plXlqfLEz3GIkfExrpK7TNiQffpelhAaO/p5IWjHBVNsB72neARLhQ==") + n + Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("cD1eDD5frxDBt+t0rXT3ymVPwaU433Kj78oBJ27x") + n2 + Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("U8G94VBfB+wInXczHqtgVDZBN52VFNgt1z5GtBiq") + n3 + Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("U8G94VBfB+wInXczHqtgVDZBN52VFNgt1z5GtBiq") + string;
    }

    private static /* synthetic */ String Xqedii_2fo7m9ov7asl9(String string) {
        return Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("ZMEXW8ja5XzNpbY+ZyBaNkKuMMLkzc+T12pqrCVDmIsH+dZ8o0UkS2sq8LMvv9LXndpdpL+DQepxSuD7") + string;
    }

    private static /* synthetic */ String Xqedii_9ijys8dxytwb(String string) {
        return string + Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("OzInpFMWahbw9YnanZq4thzhGtNXauHNvUcnx5G07xsAKoGn");
    }

    private static /* synthetic */ String Xqedii_3tjnfvh0h8cty(String string) {
        return string + Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("OzInpFMWahbw9YnanZq4thzhGtNXauHNvUcnx5G07xsAKoGn");
    }

    private static /* synthetic */ String Xqedii_2u7w9ycixey0p(String string) {
        return Xqedii_3fb3sd8.Xqedii_39xle82m1o0jk("HcXJ4rstdQwGoNreIddpcwFCd2lrBI481Q5n/+C/VyfAH5lj9+h5UlVIM1j0kUfkLgb1Dms97N/4Ks/EWPk=") + string;
    }
}
