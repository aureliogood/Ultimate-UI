package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_fgjx9wa {
   private static final ConcurrentHashMap<String, String> Xqedii_mzr9ahtg1mh0 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_140fblu36zxjj = 819554883;
   private static volatile int Xqedii_x6qooxqf4xla = 1185994337;
   private static volatile int Xqedii_gkrqujviinwi = 1704714852;
   private static volatile int Xqedii_1jkw4csexpe4j = -1868899920;
   private static volatile long Xqedii_1hj7w8ctlm2hu = 3830126516024639060L;
   private static volatile long Xqedii_3ior9uycv7jac = -1262430273377039979L;
   private static volatile long Xqedii_8td8nhuff6os = 9097767100785493300L;
   private static volatile long Xqedii_2esosqv9kns83 = -9163787265657131838L;

   public static int Xqedii_theiuu3nrmch(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_140fblu36zxjj, var1);
   }

   public static int Xqedii_vs3tkuiqfknh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_x6qooxqf4xla;
   }

   public static int Xqedii_3ny0osubqpgi4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_gkrqujviinwi;
   }

   public static int Xqedii_1but7k7w6oeto(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1jkw4csexpe4j, var1);
   }

   public static long Xqedii_1eyytyiglmh7v(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1hj7w8ctlm2hu, var2);
   }

   public static long Xqedii_273ezm3vnno6f(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3ior9uycv7jac;
   }

   public static long Xqedii_18uexckwh0agk(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_8td8nhuff6os;
   }

   public static long Xqedii_2d75oujd3y9zf(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2esosqv9kns83, var2);
   }

   public static String Xqedii_1s747t5zb65is(String var0) {
      String var1 = Xqedii_mzr9ahtg1mh0.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("JXUwNZ0k4omSB3hiMJMFXXKw41A6Uci2Syb7sVQ5Seo=");
            int var3 = -933364292;

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
            String var9 = Xqedii_mzr9ahtg1mh0.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_rx1ccd09rul4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1nnf5i9cx4126() {
   }

   private static int Xqedii_2szvixldk34v0(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1i8ueqxvnrnhi(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
