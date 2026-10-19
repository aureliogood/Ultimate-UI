package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1kcytww {
   private static final ConcurrentHashMap<String, String> Xqedii_2lyjl31le7jwh = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2uc09nazgdaew = -1994806786;
   private static volatile int Xqedii_31rytrld6wc2q = -2008965519;
   private static volatile int Xqedii_1ka7uddigdq5m = 913723490;
   private static volatile int Xqedii_1shruuq6t8h1f = -1856399082;
   private static volatile long Xqedii_16otwy166pm57 = 6935779310475790596L;
   private static volatile long Xqedii_h3lzur1i29j8 = 7848590326337664596L;
   private static volatile long Xqedii_3j88bep1vnoki = -7944831301371902833L;
   private static volatile long Xqedii_jkz71zhcb2uk = -2401325961779531056L;

   public static int Xqedii_2uigtr0t2voto(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2uc09nazgdaew, var1);
   }

   public static int Xqedii_u3oiq8ofotau(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_31rytrld6wc2q;
   }

   public static int Xqedii_3k7ak9gq98m4j(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1ka7uddigdq5m;
   }

   public static int Xqedii_cf2r1iuslns9(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1shruuq6t8h1f, var1);
   }

   public static long Xqedii_25va77heelb8q(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_16otwy166pm57, var2);
   }

   public static long Xqedii_3i4stpaeq5q9q(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_h3lzur1i29j8;
   }

   public static long Xqedii_12n0sb200lyd4(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3j88bep1vnoki;
   }

   public static long Xqedii_1do5pixst7v8i(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_jkz71zhcb2uk, var2);
   }

   public static String Xqedii_37vtz773yce2t(String var0) {
      String var1 = Xqedii_2lyjl31le7jwh.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("xPfFTPCQHx+rgwESQkJiCpQhHQ7fSbPjInHSJb4kKZY=");
            int var3 = 900266867;

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
            String var9 = Xqedii_2lyjl31le7jwh.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2e7avnjcu5s2c() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3to1rnr78rxeh() {
   }

   private static int Xqedii_32f8yhfa4fnys(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2n29nnmqxrkrq(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
