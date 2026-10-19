package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3tzr4xm {
   private static final ConcurrentHashMap<String, String> Xqedii_13amlqg7msgt7 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2v951h760ws23 = -1983787627;
   private static volatile int Xqedii_14odr91stjoss = -315403422;
   private static volatile int Xqedii_glw6zw2yyn2s = 906015865;
   private static volatile int Xqedii_2yg46kbwzlz2p = 900185756;
   private static volatile long Xqedii_a6cu8uwr08t9 = 2429751863424180230L;
   private static volatile long Xqedii_37kq86h9l0yd2 = -3756810239776272456L;
   private static volatile long Xqedii_1vpyovwauqawh = -4346953292138714361L;
   private static volatile long Xqedii_365q69is0fqf5 = -7455397998873749867L;

   public static int Xqedii_117ooe60tme8x(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2v951h760ws23, var1);
   }

   public static int Xqedii_2na3d58targxk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_14odr91stjoss;
   }

   public static int Xqedii_1k4odu4ug2au1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_glw6zw2yyn2s;
   }

   public static int Xqedii_2zt0xnm6r3v11(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2yg46kbwzlz2p, var1);
   }

   public static long Xqedii_7gg5kr2i4cxa(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_a6cu8uwr08t9, var2);
   }

   public static long Xqedii_14ovp24sx5byi(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_37kq86h9l0yd2;
   }

   public static long Xqedii_17gtr94idaz7h(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1vpyovwauqawh;
   }

   public static long Xqedii_1u8yv4i980tkh(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_365q69is0fqf5, var2);
   }

   public static String Xqedii_1umz40h707b5e(String var0) {
      String var1 = Xqedii_13amlqg7msgt7.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("YQIHdezz6W42s4JJb8m2fvv6rMqQp1D1GDeAVuGaCRU=");
            int var3 = -635233939;

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
            String var9 = Xqedii_13amlqg7msgt7.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3bgroih35gckl() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3b60u0b7op3sq() {
   }

   private static int Xqedii_3jrlfp8i1xiz9(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_33lq9206n3rwd(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
