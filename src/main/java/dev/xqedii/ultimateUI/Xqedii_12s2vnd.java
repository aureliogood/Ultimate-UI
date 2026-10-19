package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_12s2vnd {
   private static final ConcurrentHashMap<String, String> Xqedii_2p0sl6vsfd2qp = new ConcurrentHashMap<>();
   private static volatile int Xqedii_80trpooklbzq = 1358608810;
   private static volatile int Xqedii_1lrxufrn5e81t = 1442849744;
   private static volatile int Xqedii_39mgmyhtwan1l = -758264579;
   private static volatile int Xqedii_egm3oiiyrxwm = 1566749215;
   private static volatile long Xqedii_3ir0nbzcsv7n5 = -5736218564723013056L;
   private static volatile long Xqedii_2p0mvhjpkp9ks = -320827720025297019L;
   private static volatile long Xqedii_2jcoklqdvje9i = 3305648452561610025L;
   private static volatile long Xqedii_2cjizly0s6zs8 = 8741590980727309088L;

   public static int Xqedii_x5rpltpji9jh(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_80trpooklbzq, var1);
   }

   public static int Xqedii_1706nt4klhsdi(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1lrxufrn5e81t;
   }

   public static int Xqedii_kfptsxlgb199(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_39mgmyhtwan1l;
   }

   public static int Xqedii_35nst96xyg70u(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_egm3oiiyrxwm, var1);
   }

   public static long Xqedii_gk87c8yzk9uj(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3ir0nbzcsv7n5, var2);
   }

   public static long Xqedii_1tyfb7s1j8ncl(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2p0mvhjpkp9ks;
   }

   public static long Xqedii_2mgi34i9bms3m(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2jcoklqdvje9i;
   }

   public static long Xqedii_1pzkbfh6p5eso(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2cjizly0s6zs8, var2);
   }

   public static String Xqedii_c19smo985bnv(String var0) {
      String var1 = Xqedii_2p0sl6vsfd2qp.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("lwCPRtcOGy+iFTInrCZU/toUbQXD38gP47yyOVVfxs0=");
            int var3 = 1365544075;

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
            String var9 = Xqedii_2p0sl6vsfd2qp.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3mkm1zsw66g6t() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2a17vokclrclj() {
   }

   private static int Xqedii_25ptz8lgfomoy(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1e5elaq9xoawe(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
