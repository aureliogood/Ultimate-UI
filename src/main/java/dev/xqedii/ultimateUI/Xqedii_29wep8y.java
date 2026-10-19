package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_29wep8y {
   private static final ConcurrentHashMap<String, String> Xqedii_jzou3q6e52q3 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3afsh4ikaml65 = -1614879988;
   private static volatile int Xqedii_26imsw09stdfu = -103966701;
   private static volatile int Xqedii_b3d6tshvuq0j = -269223644;
   private static volatile int Xqedii_3afcksziocx1u = -2030016134;
   private static volatile long Xqedii_2msb4mx23q0im = -6195579212637103467L;
   private static volatile long Xqedii_k1xa2ebexn0w = -2495701684202364997L;
   private static volatile long Xqedii_b8rb56ow7d0a = -1339064858142474867L;
   private static volatile long Xqedii_23wgqaxc2qvor = -7759081897801231949L;

   public static int Xqedii_8aqgza52d005(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3afsh4ikaml65, var1);
   }

   public static int Xqedii_20ki7vt43prk6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_26imsw09stdfu;
   }

   public static int Xqedii_lj8b04dt4esv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_b3d6tshvuq0j;
   }

   public static int Xqedii_13uea31yimkp8(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3afcksziocx1u, var1);
   }

   public static long Xqedii_2jixcklk30lh8(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2msb4mx23q0im, var2);
   }

   public static long Xqedii_cbxpomagr5wh(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_k1xa2ebexn0w;
   }

   public static long Xqedii_x73zj6eedzai(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_b8rb56ow7d0a;
   }

   public static long Xqedii_16ugqtfrecz25(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_23wgqaxc2qvor, var2);
   }

   public static String Xqedii_3r5g1ekisfirn(String var0) {
      String var1 = Xqedii_jzou3q6e52q3.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ZlcHl6PLADaCfZBr1HBOpfWtFK0a5o26J8SBfUrVzWo=");
            int var3 = 494343411;

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
            String var9 = Xqedii_jzou3q6e52q3.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3ukaplchhbyvw() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_pmakp78k86dy() {
   }

   private static int Xqedii_1e2m00oqrwkzy(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_t1opsndzjjvt(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
