package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2ze73vg {
   private static final ConcurrentHashMap<String, String> Xqedii_3cogun5zmlml1 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_5dibu0biulbl = 1681221206;
   private static volatile int Xqedii_3495wdct79hkc = -598401807;
   private static volatile int Xqedii_2mimroejr1k8m = -136595987;
   private static volatile int Xqedii_2iisv5we03nyd = -830855171;
   private static volatile long Xqedii_1w878hwckvcmd = -5902012699518298545L;
   private static volatile long Xqedii_9biw8vcwdc5w = -813613247560151655L;
   private static volatile long Xqedii_669xozv5h39j = 2287458650728328269L;
   private static volatile long Xqedii_fabjqev3de4r = 7819561285544889370L;

   public static int Xqedii_18u831nn38lo(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_5dibu0biulbl, var1);
   }

   public static int Xqedii_14pdpm3hddrn8(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3495wdct79hkc;
   }

   public static int Xqedii_13jq3c36au68f(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2mimroejr1k8m;
   }

   public static int Xqedii_9l9vlchy5lmc(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2iisv5we03nyd, var1);
   }

   public static long Xqedii_33sqz5sig1kb9(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1w878hwckvcmd, var2);
   }

   public static long Xqedii_24apgtc0fhlub(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_9biw8vcwdc5w;
   }

   public static long Xqedii_ma8as72z1ida(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_669xozv5h39j;
   }

   public static long Xqedii_1rl77af7rf40c(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_fabjqev3de4r, var2);
   }

   public static String Xqedii_2lfqnb3fhydq(String var0) {
      String var1 = Xqedii_3cogun5zmlml1.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("bkiwTxxbz3JeGPsoVlameuGP/IwrdrbR9aVtAltqY9c=");
            int var3 = -216946492;

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
            String var9 = Xqedii_3cogun5zmlml1.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3k4d6pm4jt4ys() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2y30g8oa7ws91() {
   }

   private static int Xqedii_1nu1zxhvlx120(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_7d4d5q5vlawc(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
