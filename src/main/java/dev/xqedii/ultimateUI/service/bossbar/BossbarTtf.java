package dev.xqedii.ultimateUI.service.bossbar;

import dev.xqedii.ultimateUI.Xqedii_3nbnz2g;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public final class BossbarTtf {
   public static final String Xqedii_2d7qd0zp49r66 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final byte[] Xqedii_umd1298;
   public final int Xqedii_1ztg5i4;
   public final Map<Integer, Integer> Xqedii_1mxhs9g;
   public final int[] Xqedii_2r2nmrc;
   public final int Xqedii_2gz7txh;
   public final int Xqedii_1n8y7jf;

   public BossbarTtf(byte[] var1, int var2, Map<Integer, Integer> var3, int[] var4, int var5, int var6) {
      this.Xqedii_umd1298 = var1;
      this.Xqedii_1ztg5i4 = var2;
      this.Xqedii_1mxhs9g = var3;
      this.Xqedii_2r2nmrc = var4;
      this.Xqedii_2gz7txh = var5;
      this.Xqedii_1n8y7jf = var6;
   }

   public static BossbarTtf parse(byte[] var0) {
      if ((2145188407 ^ 2145188407) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && var0.length >= Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(907499693, 0)) {
         int var1 = Xqedii_ovwle6v(var0, Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-685762104, 8));
         HashMap var2 = new HashMap();

         for (int var3 = Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(-1024167350, 20); var3 < var1; var3++) {
            int var4 = Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(1629108517, 19) + var3 * Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-682091832, 19);
            if (var4 + Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(530813526, 23) > var0.length) {
               return null;
            }

            String var5 = new String(var0, var4, Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(1184386937, 11), StandardCharsets.ISO_8859_1);
            int[] var10002 = new int[Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(1482329673, 17)];
            var10002[Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(-1024167350, 20)] = (int)Xqedii_2uq7eee(
               var0, var4 + Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(1481543241, 17)
            );
            var10002[Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(958751090, 3)] = (int)Xqedii_2uq7eee(var0, var4 + Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(1279769763, 18));
            var2.put(var5, var10002);
         }

         int[] var15 = (int[])var2.get(Xqedii_3nbnz2g.Xqedii_1bhz5qo8w7avc("2agEoFZ4Zmo9fPXtV49oIhZyGB6TvocyYABiQSae4hs2rU03"));
         int[] var16 = (int[])var2.get(Xqedii_3nbnz2g.Xqedii_1bhz5qo8w7avc("94B0w1iDt0v4SQJKGN0be0pddetVXwapPTX2elHmcaCcPrTj"));
         int[] var17 = (int[])var2.get(Xqedii_3nbnz2g.Xqedii_1bhz5qo8w7avc("SLp/1YMbDti3Z0wAug8xM8z6sVLi7OMQOlGwiYtOLnGcUwHO"));
         int[] var6 = (int[])var2.get(Xqedii_3nbnz2g.Xqedii_1bhz5qo8w7avc("cVnfooRuuj+K+848ctvVGtUn4O7OimDDtR/wB1Rq+FsHFazC"));
         int[] var7 = (int[])var2.get(Xqedii_3nbnz2g.Xqedii_1bhz5qo8w7avc("6jkRQ3CCsxvx8UbKfJtzTXQcwK5DncuzkoVgtZoYefHLfhky"));
         if (var15 != null && var16 != null && var17 != null && var6 != null && var7 != null) {
            int var8 = Xqedii_ovwle6v(var0, var15[Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(-2097703831, 23)] + Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(-1009487286, 20));
            if (var8 <= 0) {
               return null;
            } else {
               int var9 = Xqedii_ovwle6v(var0, var6[Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(685761847, 10)] + Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-685761800, 4));
               int var10 = Xqedii_ovwle6v(var0, var16[Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(907499681, 3)] + Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(1230510734, 9));
               if (var10 > 0 && var9 > 0) {
                  int[] var11 = new int[var9];
                  int var12 = Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(958751098, 3);

                  for (int var13 = Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(907499681, 25); var13 < var9; var13++) {
                     if (var13 < var10) {
                        int var14 = var17[Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(685761847, 30)] + var13 * Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-686810424, 20);
                        if (var14 + Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(1064912536, 27) > var0.length) {
                           break;
                        }

                        var12 = Xqedii_ovwle6v(var0, var14);
                     }

                     var11[var13] = var12;
                  }

                  Map var18 = Xqedii_25ye1eh(var0, var7[Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(907499681, 19)]);
                  return var18 != null && !var18.isEmpty()
                     ? new BossbarTtf(var0, var8, var18, var11, var17[Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(685761847, 30)], var10)
                     : null;
               } else {
                  return null;
               }
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public byte[] withZeroAdvances() {
      if ((-1299161908 * -1299161908 - -1299161908 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         byte[] var1 = (byte[])this.Xqedii_umd1298.clone();

         for (int var2 = Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(907499681, 11); var2 < this.Xqedii_1n8y7jf; var2++) {
            int var3 = this.Xqedii_2gz7txh + var2 * Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(-141268604, 31);
            if (var3 + Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-685761592, 8) > var1.length) {
               break;
            }

            var1[var3] = (byte)Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(685761847, 23);
            var1[var3 + Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(1254286450, 12)] = (byte)Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(907499681, 28);
         }

         return var1;
      }
   }

   public boolean hasCodepoint(int var1) {
      if (((1457630891 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1mxhs9g.containsKey(var1);
      }
   }

   public double advanceEm(int var1) {
      if (((1229585019 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Integer var2 = this.Xqedii_1mxhs9g.get(var1);
         return var2 != null && var2 >= 0 && var2 < this.Xqedii_2r2nmrc.length
            ? (double)this.Xqedii_2r2nmrc[var2] / this.Xqedii_1ztg5i4
            : Double.longBitsToDouble(Xqedii_3nbnz2g.Xqedii_18n9xk8n63xiw(-6927383325802548580L, 50));
      }
   }

   public static Map<Integer, Integer> Xqedii_25ye1eh(byte[] var0, int var1) {
      if (((-316942660 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 + Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-685761845, 0) > var0.length) {
         return null;
      } else {
         int var2 = Xqedii_ovwle6v(var0, var1 + Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-551544120, 27));
         int var3 = Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(551544119, 27);
         int var4 = Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(-1635399974, 19);

         for (int var5 = Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(-1048851916, 22); var5 < var2; var5++) {
            int var6 = var1 + Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-685762040, 6) + var5 * Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(-2030594967, 23);
            if (var6 + Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-887088440, 26) > var0.length) {
               break;
            }

            int var7 = Xqedii_ovwle6v(var0, var6);
            int var8 = Xqedii_ovwle6v(var0, var6 + Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-551544120, 27));
            int var9 = var1 + (int)Xqedii_2uq7eee(var0, var6 + Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(885160906, 14));
            int var10 = Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(-1482591818, 17);
            if (var7 == Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-685761976, 6) && var8 == Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(156354859, 22)) {
               var10 = Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(1193585707, 0);
            } else if (var7 == Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(-1740146362, 19) && var8 == Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(1254286450, 12)) {
               var10 = Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(907503777, 12);
            } else if (var7 == 0) {
               var10 = Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(907237537, 17);
            } else if (var7 == Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-685761976, 6) && var8 == 0) {
               var10 = Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(1482460745, 17);
            }

            if (var10 > var4) {
               var4 = var10;
               var3 = var9;
            }
         }

         if (var3 >= 0 && var3 + Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(907237537, 17) <= var0.length) {
            HashMap var21 = new HashMap();
            int var22 = Xqedii_ovwle6v(var0, var3);
            if (var22 == Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(907532449, 13)) {
               int var24 = Xqedii_ovwle6v(var0, var3 + Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(817820301, 20));
               int var25 = var24 / Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(-1239983967, 30);
               int var27 = var3 + Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(-1907795902, 1);
               int var28 = var27 + var24 + Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(1277148323, 18);
               int var29 = var28 + var24;
               int var30 = var29 + var24;

               for (int var13 = Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(-1509171631, 17); var13 < var25; var13++) {
                  int var31 = Xqedii_ovwle6v(var0, var27 + var13 * Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(-919925935, 6));
                  int var15 = Xqedii_ovwle6v(var0, var28 + var13 * Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(-459962968, 5));
                  int var32 = Xqedii_ovwle6v(var0, var29 + var13 * Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(1770256276, 15));
                  int var17 = Xqedii_ovwle6v(var0, var30 + var13 * Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-719316280, 25));
                  if (var15 <= var31) {
                     for (int var33 = var15; var33 <= var31 && var33 != Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(1403390430, 9); var33++) {
                        int var19;
                        if (var17 == 0) {
                           var19 = var33 + var32 & Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(1324522800, 28);
                        } else {
                           int var20 = var30
                              + var13 * Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(627141177, 11)
                              + var17
                              + (var33 - var15) * Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-685765944, 12);
                           if (var20 + Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(906451105, 19) > var0.length) {
                              continue;
                           }

                           var19 = Xqedii_ovwle6v(var0, var20);
                           if (var19 != 0) {
                              var19 = var19 + var32 & Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(908633953, 6);
                           }
                        }

                        if (var19 != 0) {
                           var21.put(var33, var19);
                        }
                     }
                  }
               }

               return var21;
            } else if (var22 != Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-685761928, 4)) {
               return var21;
            } else {
               long var23 = Xqedii_2uq7eee(var0, var3 + Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-761259320, 23));

               for (long var26 = Xqedii_3nbnz2g.Xqedii_kfgycxhcbgo0(-9042905197173002954L, 15);
                  var26 < var23;
                  var26 += Xqedii_3nbnz2g.Xqedii_kfgycxhcbgo0(9042905197173002953L, 54)
               ) {
                  int var11 = var3
                     + Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(1643788581, 19)
                     + (int)(var26 * Xqedii_3nbnz2g.Xqedii_18n9xk8n63xiw(-3087669197952910558L, 19));
                  if (var11 + Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(1038424674, 29) > var0.length) {
                     break;
                  }

                  long var12 = Xqedii_2uq7eee(var0, var11);
                  long var14 = Xqedii_2uq7eee(var0, var11 + Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(840390817, 24));
                  long var16 = Xqedii_2uq7eee(var0, var11 + Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(329486934, 23));
                  if (var14 - var12 > Xqedii_3nbnz2g.Xqedii_3b4oq45qvku94(453420413891931411L, 57)) {
                     var14 = var12 + Xqedii_3nbnz2g.Xqedii_tpx6o5uigyfv(-6097728377699594241L, 6);
                  }

                  for (long var18 = var12; var18 <= var14; var18 += Xqedii_3nbnz2g.Xqedii_tpx6o5uigyfv(3206407662490464322L, 29)) {
                     var21.put((int)var18, (int)(var16 + (var18 - var12)));
                  }
               }

               return var21;
            }
         } else {
            return null;
         }
      }
   }

   public static int Xqedii_ovwle6v(byte[] var0, int var1) {
      if ((-1134732464 * -1134732464 - -1134732464 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 + Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-685761816, 5) <= var0.length && var1 >= 0
            ? (var0[var1] & Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(1184900985, 11)) << Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(907497633, 8)
               | var0[var1 + Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(907499553, 7)] & Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(907503457, 6)
            : Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(-1024167350, 20);
      }
   }

   public static long Xqedii_2uq7eee(byte[] var0, int var1) {
      if ((670892344 * (670892344 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 + Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-684975416, 18) <= var0.length && var1 >= 0
            ? (long)(var0[var1] & Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(1092391603, 26)) << Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(-1405663452, 16)
               | (long)(var0[var1 + Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(615263815, 8)] & Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(723524297, 25))
                  << Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(907500193, 5)
               | (long)(var0[var1 + Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-685761976, 7)] & Xqedii_3nbnz2g.Xqedii_213rdwe1paokz(-225623986, 4))
                  << Xqedii_3nbnz2g.Xqedii_30cacuyy0z6dz(-1833919204, 10)
               | var0[var1 + Xqedii_3nbnz2g.Xqedii_2hes9lnle93nu(-685729080, 14)] & Xqedii_3nbnz2g.Xqedii_i9s3np25sgwr(-904439646, 26)
            : Xqedii_3nbnz2g.Xqedii_kfgycxhcbgo0(-9042905197173002954L, 40);
      }
   }
}
