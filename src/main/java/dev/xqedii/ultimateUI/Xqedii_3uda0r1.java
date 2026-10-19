package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3uda0r1 {
   private static final ConcurrentHashMap<String, String> Xqedii_32fw33zp1k4mx = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1wczxf5b75h8h = 929138953;
   private static volatile int Xqedii_pfq0jqc0ahrz = 1784492957;
   private static volatile int Xqedii_3bk4i0wuk1uu3 = -462329146;
   private static volatile int Xqedii_2bxg8nhx1l0zq = 1398473182;
   private static volatile long Xqedii_mhd0pr1m80wc = 7508447490631426215L;
   private static volatile long Xqedii_2xwwzdrxwtri3 = -7897860281978136954L;
   private static volatile long Xqedii_1mlbvy8bocnml = -6023845552066747399L;
   private static volatile long Xqedii_1mf4jdk43b26r = 4107824397342964237L;

   public static int Xqedii_wo5ybj3zqyvp(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1wczxf5b75h8h, var1);
   }

   public static int Xqedii_3od41vn937o8f(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_pfq0jqc0ahrz;
   }

   public static int Xqedii_6z8xd8to1qvq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3bk4i0wuk1uu3;
   }

   public static int Xqedii_v4dt3bur1ayz(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2bxg8nhx1l0zq, var1);
   }

   public static long Xqedii_1b1hct9s0z9oh(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_mhd0pr1m80wc, var2);
   }

   public static long Xqedii_60y7uyra38kj(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2xwwzdrxwtri3;
   }

   public static long Xqedii_fy11nrx7pdz9(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1mlbvy8bocnml;
   }

   public static long Xqedii_2y666h5gduyuu(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1mf4jdk43b26r, var2);
   }

   public static String Xqedii_2be8uc9r3pwie(String var0) {
      String var1 = Xqedii_32fw33zp1k4mx.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("JmpRyde5eVr8PZOC/Apk9sbZkuXEnbAzV3+Nkn7p650=");
            int var3 = -704027731;

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
            String var9 = Xqedii_32fw33zp1k4mx.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2rce9unmjzus8() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3h1pxefgkz8wt() {
   }

   private static int Xqedii_10c1xvb4r1ft2(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_196yj1n2hq8z3(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
