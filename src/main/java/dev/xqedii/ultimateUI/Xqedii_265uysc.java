package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_265uysc {
   private static final ConcurrentHashMap<String, String> Xqedii_3jsxrmsfrv7ra = new ConcurrentHashMap<>();
   private static volatile int Xqedii_28yqb6j82jfpt = 1181275143;
   private static volatile int Xqedii_2rvluuxmtse2x = -1646092321;
   private static volatile int Xqedii_3cahv2aka8fa7 = 399394145;
   private static volatile int Xqedii_2wulmnedc1h13 = -1090845292;
   private static volatile long Xqedii_1eh5gn24w9q8d = -8617072540830284945L;
   private static volatile long Xqedii_1blbj46ez05l5 = 3258280423064980012L;
   private static volatile long Xqedii_2jfyjjyl1g9q9 = 177761376568371386L;
   private static volatile long Xqedii_1wy8kwiapqzum = 4840388947216518415L;

   public static int Xqedii_1zynlfgw7u6ar(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_28yqb6j82jfpt, var1);
   }

   public static int Xqedii_h9c04oenhcp5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2rvluuxmtse2x;
   }

   public static int Xqedii_3liciy6u5l9ix(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3cahv2aka8fa7;
   }

   public static int Xqedii_2v5awgi90d4c5(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2wulmnedc1h13, var1);
   }

   public static long Xqedii_hj2o2sq9hh9e(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1eh5gn24w9q8d, var2);
   }

   public static long Xqedii_3vz50fgcviwx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1blbj46ez05l5;
   }

   public static long Xqedii_9sgi760d3xwh(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2jfyjjyl1g9q9;
   }

   public static long Xqedii_1edftkooh9i97(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1wy8kwiapqzum, var2);
   }

   public static String Xqedii_1dcyf9kldd2b8(String var0) {
      String var1 = Xqedii_3jsxrmsfrv7ra.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("6QtWY5VVYbam9wcNQsjSF47bxWNzIdIi4qxiHe62wNc=");
            int var3 = 1164114317;

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
            String var9 = Xqedii_3jsxrmsfrv7ra.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_10495oxca9dfi() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1abewtv06i9jd() {
   }

   private static int Xqedii_3qde0a9qe2y06(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_judx7qq2rq5s(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
