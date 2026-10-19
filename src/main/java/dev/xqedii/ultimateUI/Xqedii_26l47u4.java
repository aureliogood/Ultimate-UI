package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_26l47u4 {
   private static final ConcurrentHashMap<String, String> Xqedii_yz90vkz9zmdf = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2kbgwl4y03o8i = 1090525075;
   private static volatile int Xqedii_1hxagkcujoqpf = -198734793;
   private static volatile int Xqedii_101l61y2rkap = 1546358506;
   private static volatile int Xqedii_21f5wpa9r1813 = 2128778278;
   private static volatile long Xqedii_290e7jyk56uyd = 5374853770157468907L;
   private static volatile long Xqedii_mnz7odf0mg7t = -8183464105190375039L;
   private static volatile long Xqedii_3kbma14ahaz4b = -5624989904928853628L;
   private static volatile long Xqedii_ji8ap3wgrjq9 = -3054503997186542200L;

   public static int Xqedii_i5sk0if78zyn(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2kbgwl4y03o8i, var1);
   }

   public static int Xqedii_62a961jt53zl(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1hxagkcujoqpf;
   }

   public static int Xqedii_35fp0eig9b29f(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_101l61y2rkap;
   }

   public static int Xqedii_2fs1acsoasit5(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_21f5wpa9r1813, var1);
   }

   public static long Xqedii_31v1hupub6e8q(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_290e7jyk56uyd, var2);
   }

   public static long Xqedii_2l9w1tdrh2xi7(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_mnz7odf0mg7t;
   }

   public static long Xqedii_2hg0z60yrv4c8(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3kbma14ahaz4b;
   }

   public static long Xqedii_2dkb2zh4nfvvn(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_ji8ap3wgrjq9, var2);
   }

   public static String Xqedii_1vi84d3mj0lze(String var0) {
      String var1 = Xqedii_yz90vkz9zmdf.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("uglCdmNXTt3UYvGZoMwY+u1RxMN5yFSXg9R6ru2otpg=");
            int var3 = -1675246251;

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
            String var9 = Xqedii_yz90vkz9zmdf.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_z3sjj8zt4kz4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_28qmo6sldyuzo() {
   }

   private static int Xqedii_5pi7wn1hkymi(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_23bokdc8t443p(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
