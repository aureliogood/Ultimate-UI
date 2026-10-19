package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3z7pamv {
   private static final ConcurrentHashMap<String, String> Xqedii_2uml2djtyf47g = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2ug8jjpw725dd = -707222276;
   private static volatile int Xqedii_15l57y0cdtnm0 = -1623690269;
   private static volatile int Xqedii_pgtj7cy5d1x9 = 269014364;
   private static volatile int Xqedii_50idkzrs09rs = -1815597442;
   private static volatile long Xqedii_5r9u45rmds4h = 7723767180677447348L;
   private static volatile long Xqedii_2adke75r2yu0r = -8056724541335313355L;
   private static volatile long Xqedii_1djq92v5g09u3 = -2912278206685954187L;
   private static volatile long Xqedii_22mpxvqc73gdc = -6135544102907551926L;

   public static int Xqedii_3vlkw1pzn7iif(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2ug8jjpw725dd, var1);
   }

   public static int Xqedii_q0f5wdorjp6g(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_15l57y0cdtnm0;
   }

   public static int Xqedii_zpib2eupaqq7(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_pgtj7cy5d1x9;
   }

   public static int Xqedii_b4pd13xzovtc(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_50idkzrs09rs, var1);
   }

   public static long Xqedii_367f4cnsyc85k(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_5r9u45rmds4h, var2);
   }

   public static long Xqedii_38q83hggmc9te(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2adke75r2yu0r;
   }

   public static long Xqedii_3v2fofpxiqh7b(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1djq92v5g09u3;
   }

   public static long Xqedii_ygw4sts4mwwi(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_22mpxvqc73gdc, var2);
   }

   public static String Xqedii_3ep58b3s2mz8(String var0) {
      String var1 = Xqedii_2uml2djtyf47g.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("nX3B0DBg2ABcXXCQbYk4alceXYPUcXJSlWI2/7a1qgg=");
            int var3 = 1614976435;

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
            String var9 = Xqedii_2uml2djtyf47g.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_304l8kcuq75ga() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3gteddx03w1v5() {
   }

   private static int Xqedii_ejflvkf6o54u(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_ibcfxyiun0br(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
