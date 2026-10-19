package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1fvvoau {
   private static final ConcurrentHashMap<String, String> Xqedii_1uflt6j3vtzao = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1gv3ttlgzh91l = -530315133;
   private static volatile int Xqedii_qj42aimhgj2w = -1119001296;
   private static volatile int Xqedii_n4dqf2k0rpky = 333847021;
   private static volatile int Xqedii_1eyjmclty2g7x = -33750758;
   private static volatile long Xqedii_24pwzt2jmvcta = -1224707775990617600L;
   private static volatile long Xqedii_18z6qz4p36ra5 = 4100668045676907968L;
   private static volatile long Xqedii_2ouvcyhbf3zhu = -8666486346982460702L;
   private static volatile long Xqedii_13wy2vjuh8k1l = 4938607190552977610L;

   public static int Xqedii_k43ljzkiinzv(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1gv3ttlgzh91l, var1);
   }

   public static int Xqedii_m5wsj1srt8hr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_qj42aimhgj2w;
   }

   public static int Xqedii_rppss6iv3po5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_n4dqf2k0rpky;
   }

   public static int Xqedii_1t22wteyrgjv(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1eyjmclty2g7x, var1);
   }

   public static long Xqedii_awid9as3n3iv(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_24pwzt2jmvcta, var2);
   }

   public static long Xqedii_39gntpemeddjc(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_18z6qz4p36ra5;
   }

   public static long Xqedii_15jp0z2adnea4(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2ouvcyhbf3zhu;
   }

   public static long Xqedii_32kmlx43oyu3j(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_13wy2vjuh8k1l, var2);
   }

   public static String Xqedii_5skpuh92vqjq(String var0) {
      String var1 = Xqedii_1uflt6j3vtzao.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Hs8B9evvBwHzxP/I4WRl2S8KiljsNvGDA6tmx0PZXF4=");
            int var3 = 375020934;

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
            String var9 = Xqedii_1uflt6j3vtzao.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1npywfxzov9j3() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_qwm8eshvtqy6() {
   }

   private static int Xqedii_x9d1lm6f8z4i(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_10rbwhbuu20zg(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
