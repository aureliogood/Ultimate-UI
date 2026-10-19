package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2s7nlej {
   private static final ConcurrentHashMap<String, String> Xqedii_rtfszaaoio0c = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1y7lz5m3xa81g = -1282502844;
   private static volatile int Xqedii_2wgnh62h0mt48 = 1930582600;
   private static volatile int Xqedii_n4j0twlneznx = 835624105;
   private static volatile int Xqedii_364oco34abuxw = -1530095590;
   private static volatile long Xqedii_xfh4vez06uf0 = -1749464766335289575L;
   private static volatile long Xqedii_2kv5ggy41ybb2 = 6291190421845014866L;
   private static volatile long Xqedii_2rqo0vc5sp7zz = 1043876095801881900L;
   private static volatile long Xqedii_dy76hitlyiyp = -4771582377753391502L;

   public static int Xqedii_1dzlcea3m35m1(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1y7lz5m3xa81g, var1);
   }

   public static int Xqedii_124h184e9rigt(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2wgnh62h0mt48;
   }

   public static int Xqedii_fvmz1yn65jku(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_n4j0twlneznx;
   }

   public static int Xqedii_358adbopger8l(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_364oco34abuxw, var1);
   }

   public static long Xqedii_1zixicq4zlfyo(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_xfh4vez06uf0, var2);
   }

   public static long Xqedii_bb5q9hkbdcmm(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2kv5ggy41ybb2;
   }

   public static long Xqedii_1k0hai9klj65g(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2rqo0vc5sp7zz;
   }

   public static long Xqedii_130u1n4mqfbjf(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_dy76hitlyiyp, var2);
   }

   public static String Xqedii_3cp3u8hfycl32(String var0) {
      String var1 = Xqedii_rtfszaaoio0c.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ORna2IkhkThkUVZdIgaDC0XBWIqq9l9vlThs7ZMWV0M=");
            int var3 = 1088146915;

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
            String var9 = Xqedii_rtfszaaoio0c.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_vpn0pmqb96h0() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_298a9nvjfa4lb() {
   }

   private static int Xqedii_132fbzcml6v7u(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_168c175oqhoj2(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
