package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2ayqyy7 {
   private static final ConcurrentHashMap<String, String> Xqedii_37785hkgx1m1g = new ConcurrentHashMap<>();
   private static volatile int Xqedii_140wqrx650lea = -2009636246;
   private static volatile int Xqedii_1g0o2ylm6jpwh = -190915046;
   private static volatile int Xqedii_3u9bs7tgyuy4p = 2130857369;
   private static volatile int Xqedii_12qekzlk0ihz8 = -1701469845;
   private static volatile long Xqedii_rbp8464ri5r8 = -2031654517917221061L;
   private static volatile long Xqedii_1e7eg4vahz6e9 = -4327483150672194849L;
   private static volatile long Xqedii_2hngvyv6w5ovw = 2467169988115060862L;
   private static volatile long Xqedii_3bgm8u7axac2n = 751333800413916525L;

   public static int Xqedii_2m4vuxsphj9dj(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_140wqrx650lea, var1);
   }

   public static int Xqedii_22c2769wdafbe(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1g0o2ylm6jpwh;
   }

   public static int Xqedii_1k1fmi9rbhb4k(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3u9bs7tgyuy4p;
   }

   public static int Xqedii_3o0po34674po9(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_12qekzlk0ihz8, var1);
   }

   public static long Xqedii_4pip5wgswqwu(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_rbp8464ri5r8, var2);
   }

   public static long Xqedii_3jek80lf6elzr(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1e7eg4vahz6e9;
   }

   public static long Xqedii_r7cjc25ulwrn(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2hngvyv6w5ovw;
   }

   public static long Xqedii_7cesl4i2vgbr(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3bgm8u7axac2n, var2);
   }

   public static String Xqedii_54qlapv2v6dp(String var0) {
      String var1 = Xqedii_37785hkgx1m1g.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Q4tS6rp0XffihpAG+d6hdhgh9YHwoEWsV7GlU5Xkq0M=");
            int var3 = -405752243;

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
            String var9 = Xqedii_37785hkgx1m1g.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2mfwfjnw6dtmb() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_fc6bqfgqq1n1() {
   }

   private static int Xqedii_1jviqj6ypeq5g(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_s1fm35b7mta0(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
