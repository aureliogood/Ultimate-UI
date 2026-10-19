package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2rxmnaj {
   private static final ConcurrentHashMap<String, String> Xqedii_1yjjxrdei23hg = new ConcurrentHashMap<>();
   private static volatile int Xqedii_q4qvqxim7nkf = 1137646691;
   private static volatile int Xqedii_1q2m5tow9hft5 = 987856957;
   private static volatile int Xqedii_29osxas5kqgyu = 1686062576;
   private static volatile int Xqedii_2hzpgvlj8pbip = -1558537689;
   private static volatile long Xqedii_1s2553obis4t5 = 8718434393476116837L;
   private static volatile long Xqedii_16zbqggdu9r8s = 3711246446664259054L;
   private static volatile long Xqedii_27xyy91smmycl = -1775213997907361706L;
   private static volatile long Xqedii_3ah0gtknvo82o = 3121864311266166530L;

   public static int Xqedii_1dmx7s2wrloia(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_q4qvqxim7nkf, var1);
   }

   public static int Xqedii_5b0xjhoqu4vm(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1q2m5tow9hft5;
   }

   public static int Xqedii_1lulb3nx8to77(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_29osxas5kqgyu;
   }

   public static int Xqedii_3q77qbgjau90r(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2hzpgvlj8pbip, var1);
   }

   public static long Xqedii_174texh2paxu8(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1s2553obis4t5, var2);
   }

   public static long Xqedii_3g4wz27wcl61s(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_16zbqggdu9r8s;
   }

   public static long Xqedii_15q1uxbebch0p(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_27xyy91smmycl;
   }

   public static long Xqedii_k1nuorn5dhou(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3ah0gtknvo82o, var2);
   }

   public static String Xqedii_2ev1il4podre(String var0) {
      String var1 = Xqedii_1yjjxrdei23hg.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("tA9wJ0EUqXTi9jOqM5TcOnbGiyoqjGMr8sU3tnZ8BXs=");
            int var3 = 238748643;

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
            String var9 = Xqedii_1yjjxrdei23hg.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1rv0o861qefyp() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_12bcy4l1ovh90() {
   }

   private static int Xqedii_3edoz3l2l8lfe(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1cgs7vh8cehof(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
