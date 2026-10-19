package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_32drtqx {
   private static final ConcurrentHashMap<String, String> Xqedii_3r79g0ywcr4fc = new ConcurrentHashMap<>();
   private static volatile int Xqedii_239czq0bklqr0 = -1489245122;
   private static volatile int Xqedii_2k612omalgb1i = 1919536566;
   private static volatile int Xqedii_2uoj1hglcik2k = 1147894127;
   private static volatile int Xqedii_3s67rk3jjy9wp = -300459016;
   private static volatile long Xqedii_2okwvfkvzjwpr = 4708403336739758278L;
   private static volatile long Xqedii_3v13b03akdw24 = 6689382106320252322L;
   private static volatile long Xqedii_2ksumuhfxolx4 = 584678402124382174L;
   private static volatile long Xqedii_ay44ury8gllu = -4287169801647030027L;

   public static int Xqedii_c2fgut1zn61r(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_239czq0bklqr0, var1);
   }

   public static int Xqedii_3h0mif43akudp(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2k612omalgb1i;
   }

   public static int Xqedii_ffzx1ycco61l(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2uoj1hglcik2k;
   }

   public static int Xqedii_7vm0r9mn9af1(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3s67rk3jjy9wp, var1);
   }

   public static long Xqedii_21g2noaw1sppa(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2okwvfkvzjwpr, var2);
   }

   public static long Xqedii_3mgxqiqcmcm83(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3v13b03akdw24;
   }

   public static long Xqedii_3lmn1g5e4vgc(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2ksumuhfxolx4;
   }

   public static long Xqedii_yv80h3m059sy(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_ay44ury8gllu, var2);
   }

   public static String Xqedii_fhnlr7gyhp63(String var0) {
      String var1 = Xqedii_3r79g0ywcr4fc.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("c76WDtdDssy0H4bMha1fURfiIkGcLdHd5oWkH0MbS/c=");
            int var3 = 1238984305;

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
            String var9 = Xqedii_3r79g0ywcr4fc.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_5f3imej4v8d3() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3de9of9hxsbnp() {
   }

   private static int Xqedii_3bjy3atfubh9u(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_o4xy7hmwe44(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
