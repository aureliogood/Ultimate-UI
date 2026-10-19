package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1ctakye {
   private static final ConcurrentHashMap<String, String> Xqedii_2a9cou5b9jmep = new ConcurrentHashMap<>();
   private static volatile int Xqedii_34j2s8xd6m1hr = 193759844;
   private static volatile int Xqedii_ssqd54ex8edw = -622169570;
   private static volatile int Xqedii_13d5hwci0yfpr = -278709013;
   private static volatile int Xqedii_2k79dc5nz46y9 = -1466294731;
   private static volatile long Xqedii_bvn7gaeagxex = -4760387284809110457L;
   private static volatile long Xqedii_2z46vn5md1ugv = -3873895496970452829L;
   private static volatile long Xqedii_1bzwzsyxfyrc = 9065380468098394910L;
   private static volatile long Xqedii_1ht12sskpkxz1 = -1452534866751221641L;

   public static int Xqedii_28551wuytj37w(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_34j2s8xd6m1hr, var1);
   }

   public static int Xqedii_2pw42rfis4z0v(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_ssqd54ex8edw;
   }

   public static int Xqedii_x3rbnsvjgjts(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_13d5hwci0yfpr;
   }

   public static int Xqedii_3gb7e1zdiypu4(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2k79dc5nz46y9, var1);
   }

   public static long Xqedii_1m3ymu5pbxwc4(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_bvn7gaeagxex, var2);
   }

   public static long Xqedii_2s7neqv9i1b50(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2z46vn5md1ugv;
   }

   public static long Xqedii_3rda2hfl0l96v(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1bzwzsyxfyrc;
   }

   public static long Xqedii_3pdd3vd4zozeg(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1ht12sskpkxz1, var2);
   }

   public static String Xqedii_1y0vxqqqsfh84(String var0) {
      String var1 = Xqedii_2a9cou5b9jmep.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ffVL7SfyK0QIpznjEWzAl8BeFlIQADkxJmigrp70UFo=");
            int var3 = 1620115347;

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
            String var9 = Xqedii_2a9cou5b9jmep.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_rt7wsaluxe0s() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_zgaayuvjjkob() {
   }

   private static int Xqedii_28rfabnhe35e1(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_15523ty5ub4df(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
