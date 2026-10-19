package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1nos6ee {
   private static final ConcurrentHashMap<String, String> Xqedii_2mjsbxx197fqi = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2syu5lli1a2r9 = 190647919;
   private static volatile int Xqedii_1rj0zkf9u61og = -339608790;
   private static volatile int Xqedii_23yklpjoqk2qv = -487844725;
   private static volatile int Xqedii_2w4lq7av8hj57 = 1576949694;
   private static volatile long Xqedii_35z2l7k7fnboh = -5962999950559247280L;
   private static volatile long Xqedii_296pbma7tt07w = 6033620330085498052L;
   private static volatile long Xqedii_2cxt2ld2okxzh = -6725850701907433508L;
   private static volatile long Xqedii_2qsizhea1ufho = -2677586914968576110L;

   public static int Xqedii_1bmt0h62zz3cf(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2syu5lli1a2r9, var1);
   }

   public static int Xqedii_1jd7j2gnk1get(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1rj0zkf9u61og;
   }

   public static int Xqedii_2l30t0nsm6zp9(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_23yklpjoqk2qv;
   }

   public static int Xqedii_hsfhr5pbqh1i(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2w4lq7av8hj57, var1);
   }

   public static long Xqedii_3dbu34wz2vqs9(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_35z2l7k7fnboh, var2);
   }

   public static long Xqedii_3s0qsvc9mvpru(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_296pbma7tt07w;
   }

   public static long Xqedii_1q1lw87lzmb8u(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2cxt2ld2okxzh;
   }

   public static long Xqedii_3rx2pqgm86y2i(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2qsizhea1ufho, var2);
   }

   public static String Xqedii_36tikklulfrw3(String var0) {
      String var1 = Xqedii_2mjsbxx197fqi.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("NbYqRoudpDUvLX+zr+zF+F3h/7l9YPc0K5rB0J7MVro=");
            int var3 = -1455015687;

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
            String var9 = Xqedii_2mjsbxx197fqi.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1sqhb0loi24ow() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2vgsb8ydmq4n4() {
   }

   private static int Xqedii_1lp6seg2vavah(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3a2zqdmqdytk4(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
