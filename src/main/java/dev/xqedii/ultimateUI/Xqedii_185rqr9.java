package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_185rqr9 {
   private static final ConcurrentHashMap<String, String> Xqedii_2kfx5gd8kentt = new ConcurrentHashMap<>();
   private static volatile int Xqedii_zjb564q9q4o9 = 596064734;
   private static volatile int Xqedii_ealuoaoxz295 = 646652130;
   private static volatile int Xqedii_23i6m1m7msfz7 = -842399611;
   private static volatile int Xqedii_36y22jf0mdvir = 812875105;
   private static volatile long Xqedii_38uqy4hmlpwbe = 5144342841841787921L;
   private static volatile long Xqedii_2ynzaitj86kjp = 8781295018396609346L;
   private static volatile long Xqedii_1k2t6wc3x6hrd = -2526008592487830371L;
   private static volatile long Xqedii_lt8wuwzywg9z = 6380655498179434242L;

   public static int Xqedii_31khpfb2ibhqz(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_zjb564q9q4o9, var1);
   }

   public static int Xqedii_30y0laybleuix(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_ealuoaoxz295;
   }

   public static int Xqedii_1paboqodvuq6j(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_23i6m1m7msfz7;
   }

   public static int Xqedii_2uvy449v2v79f(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_36y22jf0mdvir, var1);
   }

   public static long Xqedii_1ygm0g9ht7z44(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_38uqy4hmlpwbe, var2);
   }

   public static long Xqedii_1bc77z0yyf7ya(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2ynzaitj86kjp;
   }

   public static long Xqedii_1jt42fakqgsmw(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1k2t6wc3x6hrd;
   }

   public static long Xqedii_ibibk6y8qam0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_lt8wuwzywg9z, var2);
   }

   public static String Xqedii_2l56hgjv49mrm(String var0) {
      String var1 = Xqedii_2kfx5gd8kentt.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("nykxk5OI2g6jNQC2cHdpmcqmIxBwS4SQm7B+pR9T3NE=");
            int var3 = -2010574663;

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
            String var9 = Xqedii_2kfx5gd8kentt.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_39tt4rs6qf997() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_9ug6tj4y09rn() {
   }

   private static int Xqedii_eaufmyq2om8u(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2ocethiyre7je(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
