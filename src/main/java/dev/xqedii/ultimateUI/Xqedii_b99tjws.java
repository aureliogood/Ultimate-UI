package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_b99tjws {
   private static final ConcurrentHashMap<String, String> Xqedii_14k08i1bmpq0g = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3vqt70zu53b1n = -2058245594;
   private static volatile int Xqedii_13g580zb7sdxd = -1426139514;
   private static volatile int Xqedii_18mguacuuph2z = -861471549;
   private static volatile int Xqedii_1wtrkjc7e321h = 506778026;
   private static volatile long Xqedii_2e9mt7ek893o6 = 1137013215227849253L;
   private static volatile long Xqedii_pssy4jed1coi = 3110382644041242545L;
   private static volatile long Xqedii_2fxf77oqnqn3b = 8808632916005120121L;
   private static volatile long Xqedii_2h4km6cp9ksbt = -8354762083212878174L;

   public static int Xqedii_1zn4pckbdbsr7(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3vqt70zu53b1n, var1);
   }

   public static int Xqedii_32rj6u68ux2y(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_13g580zb7sdxd;
   }

   public static int Xqedii_3e4qekg73980w(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_18mguacuuph2z;
   }

   public static int Xqedii_rjskhwvo3xmn(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1wtrkjc7e321h, var1);
   }

   public static long Xqedii_3skengpp4myb3(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2e9mt7ek893o6, var2);
   }

   public static long Xqedii_2svzy6419672f(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_pssy4jed1coi;
   }

   public static long Xqedii_2ytfsqwdqxqa5(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2fxf77oqnqn3b;
   }

   public static long Xqedii_37299vj0trbk4(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2h4km6cp9ksbt, var2);
   }

   public static String Xqedii_i4e9d8cyfvxi(String var0) {
      String var1 = Xqedii_14k08i1bmpq0g.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("JXTgvWzNvUjxdhBV/n6P921dFKJDegZQqJXzLcmh20Q=");
            int var3 = 781397568;

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
            String var9 = Xqedii_14k08i1bmpq0g.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_132cd887x3fzv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_ae3zht785856() {
   }

   private static int Xqedii_1j4wshcxjxjtg(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_35qs7lnx3c6kw(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
