package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1gx18br {
   private static final ConcurrentHashMap<String, String> Xqedii_10u32esihg0kf = new ConcurrentHashMap<>();
   private static volatile int Xqedii_17hzllwijs9yx = -456953411;
   private static volatile int Xqedii_1013kzs9ozkcu = 71321343;
   private static volatile int Xqedii_1y4irhfxv6mhl = -639566124;
   private static volatile int Xqedii_26jsy219u4zu6 = -405362130;
   private static volatile long Xqedii_3uc2bu4myin1g = -7215870203153056987L;
   private static volatile long Xqedii_2nhiaq6fc81j = 2794133297478448719L;
   private static volatile long Xqedii_355oitpngc134 = -9054465309176329157L;
   private static volatile long Xqedii_2f6ft8q04e7jy = 5734788663152704331L;

   public static int Xqedii_3l820b3waue73(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_17hzllwijs9yx, var1);
   }

   public static int Xqedii_1t65y1k4hdmnv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1013kzs9ozkcu;
   }

   public static int Xqedii_3p8u4saeaf16z(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1y4irhfxv6mhl;
   }

   public static int Xqedii_342dnqmpb4kt3(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_26jsy219u4zu6, var1);
   }

   public static long Xqedii_3401055eorpmy(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3uc2bu4myin1g, var2);
   }

   public static long Xqedii_bhd5sdfrakfe(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2nhiaq6fc81j;
   }

   public static long Xqedii_2gl8deuvgv25u(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_355oitpngc134;
   }

   public static long Xqedii_1s4nldgx1z34d(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2f6ft8q04e7jy, var2);
   }

   public static String Xqedii_1s2bd8c1j2wal(String var0) {
      String var1 = Xqedii_10u32esihg0kf.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("T+QwCRXeXA+jPWXdiPQABIsAt7LhbuWzEc8gu39ZcBk=");
            int var3 = -111106051;

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
            String var9 = Xqedii_10u32esihg0kf.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2t9vkcxzmpd4t() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1kgvyuur27li0() {
   }

   private static int Xqedii_3g4dr40qq5dou(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1l48u7qhrkcvv(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
