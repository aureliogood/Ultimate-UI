package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1cdo9of {
   private static final ConcurrentHashMap<String, String> Xqedii_ddqekgvxohsa = new ConcurrentHashMap<>();
   private static volatile int Xqedii_18bfj1dk0003g = 339358841;
   private static volatile int Xqedii_3ugdgi0wn3ofu = 1617624413;
   private static volatile int Xqedii_2x8bar03u2dj = -1141859802;
   private static volatile int Xqedii_2ogs2a5x03n1b = 1975959862;
   private static volatile long Xqedii_2emcqvx26geen = -5957934619285582827L;
   private static volatile long Xqedii_rjizsr5qgbbs = 138056990335332725L;
   private static volatile long Xqedii_at3o7xbc9ob4 = -8692802486778786372L;
   private static volatile long Xqedii_2w4h2h0ozdmc1 = -7923555986700633167L;

   public static int Xqedii_26nkdbhyic9iw(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_18bfj1dk0003g, var1);
   }

   public static int Xqedii_1jwwa8z38sjmd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3ugdgi0wn3ofu;
   }

   public static int Xqedii_kdd9gv2goer9(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2x8bar03u2dj;
   }

   public static int Xqedii_3iohekrejtgx8(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2ogs2a5x03n1b, var1);
   }

   public static long Xqedii_329whs3sig7h2(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2emcqvx26geen, var2);
   }

   public static long Xqedii_pk4puxocvlbv(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_rjizsr5qgbbs;
   }

   public static long Xqedii_25dpe7323ehsu(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_at3o7xbc9ob4;
   }

   public static long Xqedii_2g007sgi2qnjn(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2w4h2h0ozdmc1, var2);
   }

   public static String Xqedii_14qao9c2g96j7(String var0) {
      String var1 = Xqedii_ddqekgvxohsa.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("qahFpzgg8wTD2chT72Cvg3EtsAgfvAPWc0CftSyu38E=");
            int var3 = 1006939457;

            for (int var4 = 0; var4 < var2.length; var4++) {
               var2[var4] ^= (byte)(var3 >>> (var4 & 3) * 8);
            }

            byte[] var11 = Base64.getDecoder().decode(var0);
            Cipher var5 = Cipher.getInstance("AES/GCM/NoPadding");
            var5.init(2, new SecretKeySpec(var2, "AES"), new GCMParameterSpec(128, var11, 0, 12));
            byte[] var6 = var5.doFinal(var11, 12, var11.length - 12);
            char[] var7 = new char[var6.length / 2];

            for (int var8 = 0; var8 < var7.length; var8++) {
               var7[var8] = (char)((var6[var8 * 2] & 255) << 8 | var6[var8 * 2 + 1] & 255);
            }

            String var12 = new String(var7).intern();
            Arrays.fill(var2, (byte)0);
            String var9 = Xqedii_ddqekgvxohsa.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_8381bnxifh0e() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_wh5zxu7h0q5w() {
   }

   private static int Xqedii_1fh1qw4c6bsdn(byte[] var0, byte[] var1) {
      if (var1.length != 0 && var0.length >= var1.length) {
         label27:
         for (int var2 = 0; var2 + var1.length <= var0.length; var2++) {
            for (int var3 = 0; var3 < var1.length; var3++) {
               if (var0[var2 + var3] != var1[var3]) {
                  continue label27;
               }
            }

            return var2;
         }

         return -1;
      } else {
         return -1;
      }
   }

   private static /* synthetic */ void Xqedii_1ou2025ww676x(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
