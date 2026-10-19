package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_321waiy {
   private static final ConcurrentHashMap<String, String> Xqedii_17hatxnk6yl79 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_35wa1hepjn6wt = -427772789;
   private static volatile int Xqedii_1oy9kowlp96fx = 145223344;
   private static volatile int Xqedii_2ju5bnm1jvlbu = 750440728;
   private static volatile int Xqedii_2dmuxernb5dq0 = 1124763288;
   private static volatile long Xqedii_1oyk00lelgwp7 = 7020077201517650168L;
   private static volatile long Xqedii_2xswvb2x7v6x8 = -3659240625057463500L;
   private static volatile long Xqedii_63kiypmrf0ga = 4302315490779533475L;
   private static volatile long Xqedii_302aa9ma9camt = 7642979556081788152L;

   public static int Xqedii_134r7h1hqphku(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_35wa1hepjn6wt, var1);
   }

   public static int Xqedii_64fpjnanj7er(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1oy9kowlp96fx;
   }

   public static int Xqedii_3scuoq033m1k0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2ju5bnm1jvlbu;
   }

   public static int Xqedii_2lq4edv49ytx3(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2dmuxernb5dq0, var1);
   }

   public static long Xqedii_6t29kpiy8lav(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1oyk00lelgwp7, var2);
   }

   public static long Xqedii_2d3c8v2x11g6s(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2xswvb2x7v6x8;
   }

   public static long Xqedii_22sp0bsb6rje2(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_63kiypmrf0ga;
   }

   public static long Xqedii_309k1b9luwg7a(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_302aa9ma9camt, var2);
   }

   public static String Xqedii_2j11vc74vnld9(String var0) {
      String var1 = Xqedii_17hatxnk6yl79.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("4XH7qdNVQDHAZWbvL9lNWSsZQ55sesV1bjSIgiu5CzI=");
            int var3 = -344850005;

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
            String var9 = Xqedii_17hatxnk6yl79.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3bfzpf52dvm39() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_19udw1cu2wcs1() {
   }

   private static int Xqedii_3ltqpnkkutu4a(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_34gxqgxsht7b1(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
