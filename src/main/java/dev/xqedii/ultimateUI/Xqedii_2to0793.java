package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2to0793 {
   private static final ConcurrentHashMap<String, String> Xqedii_jb1m0fv7ams2 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_14a40z92ap6v0 = 1289447381;
   private static volatile int Xqedii_uq22oszko2jq = 1501643782;
   private static volatile int Xqedii_lcr46u60yhrm = 171697068;
   private static volatile int Xqedii_222fesy4o2irb = 2110680083;
   private static volatile long Xqedii_2o9240yuy9r5j = 92114889658538683L;
   private static volatile long Xqedii_cx5yqykx5y69 = 950267380529512633L;
   private static volatile long Xqedii_240w6b7ym63yb = 8563213359627145441L;
   private static volatile long Xqedii_31mtluq6on2xw = -4658791017400234066L;

   public static int Xqedii_3qrx6wv8cwrsl(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_14a40z92ap6v0, var1);
   }

   public static int Xqedii_86b6cevpxtix(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_uq22oszko2jq;
   }

   public static int Xqedii_tj25ih9e0ig1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_lcr46u60yhrm;
   }

   public static int Xqedii_jz6nqgw14xys(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_222fesy4o2irb, var1);
   }

   public static long Xqedii_uaa22wsq48wi(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2o9240yuy9r5j, var2);
   }

   public static long Xqedii_1kljjla7cayut(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_cx5yqykx5y69;
   }

   public static long Xqedii_1nvehob3ds4l7(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_240w6b7ym63yb;
   }

   public static long Xqedii_2mofpp046573v(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_31mtluq6on2xw, var2);
   }

   public static String Xqedii_11hwb93nfgqwe(String var0) {
      String var1 = Xqedii_jb1m0fv7ams2.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("PzuotG6f2aKQIFw0wHRfCKLnu+bfw6gU9gsbew/X+4s=");
            int var3 = 1512707541;

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
            String var9 = Xqedii_jb1m0fv7ams2.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_bkhipi7azxdh() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1385kjk7kbn9l() {
   }

   private static int Xqedii_3bc766n2qsztd(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_cm110j1anmy8(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
