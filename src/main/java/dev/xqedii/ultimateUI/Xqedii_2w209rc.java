package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2w209rc {
   private static final ConcurrentHashMap<String, String> Xqedii_1oaw4j8wswp0x = new ConcurrentHashMap<>();
   private static volatile int Xqedii_ejusewafsz5k = 566717556;
   private static volatile int Xqedii_1pxv7ps19bt6d = 145571834;
   private static volatile int Xqedii_2x7c38gc72fmz = -328840800;
   private static volatile int Xqedii_1lz3xrw21z4ue = -1619131389;
   private static volatile long Xqedii_3hrg276vmachx = -7557267571199193210L;
   private static volatile long Xqedii_1xp0at18s3blt = -2612972733175394985L;
   private static volatile long Xqedii_36lomlafhmaqg = 4072972561727606687L;
   private static volatile long Xqedii_tfoya7b9u1dx = 513896541994999878L;

   public static int Xqedii_31ok3t86y56l(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_ejusewafsz5k, var1);
   }

   public static int Xqedii_3s6h52hn5jmzv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1pxv7ps19bt6d;
   }

   public static int Xqedii_2l26sdx9pu31a(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2x7c38gc72fmz;
   }

   public static int Xqedii_1t4sioo367pzv(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1lz3xrw21z4ue, var1);
   }

   public static long Xqedii_2i36vu5raefr9(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3hrg276vmachx, var2);
   }

   public static long Xqedii_3riypq2yviy03(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1xp0at18s3blt;
   }

   public static long Xqedii_3eq18bvsu2h3x(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_36lomlafhmaqg;
   }

   public static long Xqedii_1xtsm4zrsz73w(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_tfoya7b9u1dx, var2);
   }

   public static String Xqedii_3v99ncf39ej1g(String var0) {
      String var1 = Xqedii_1oaw4j8wswp0x.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("XuWxjGnG0OkxsHPSa/daAl+srftsqcCOw3NnVlPBx4g=");
            int var3 = 844930400;

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
            String var9 = Xqedii_1oaw4j8wswp0x.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2kqo2f3xq15ew() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1jaqoj5xz1pd2() {
   }

   private static int Xqedii_38b4gf6u07q4q(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1sjdcxkkkb3am(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
