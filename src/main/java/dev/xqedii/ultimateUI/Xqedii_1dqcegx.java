package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1dqcegx {
   private static final ConcurrentHashMap<String, String> Xqedii_39q253azd1nyw = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2fphabd2ijtlk = -157831818;
   private static volatile int Xqedii_2j9564t3a1mfe = -1312356564;
   private static volatile int Xqedii_2uzyfy3f46reg = -489331275;
   private static volatile int Xqedii_13wji26jlj5bl = 245274425;
   private static volatile long Xqedii_2cwv2d2wee9wo = 6327183369545030606L;
   private static volatile long Xqedii_2fb2uzhv7nz16 = -4306525638133779996L;
   private static volatile long Xqedii_14opkyglpob8l = -5555245342901018727L;
   private static volatile long Xqedii_24xy4v7s24e3t = 2825473865543820404L;

   public static int Xqedii_2wr9aqfmjlu3g(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2fphabd2ijtlk, var1);
   }

   public static int Xqedii_3w367ws5wwr44(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2j9564t3a1mfe;
   }

   public static int Xqedii_2xh0om66o7u0i(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2uzyfy3f46reg;
   }

   public static int Xqedii_7sa8irvjp30j(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_13wji26jlj5bl, var1);
   }

   public static long Xqedii_2zmanxnrc2mqi(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2cwv2d2wee9wo, var2);
   }

   public static long Xqedii_2wel9oyvvhflg(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2fb2uzhv7nz16;
   }

   public static long Xqedii_2z5qm5eraf2yp(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_14opkyglpob8l;
   }

   public static long Xqedii_7676w5s3uggr(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_24xy4v7s24e3t, var2);
   }

   public static String Xqedii_2e6bb8bfmuhn5(String var0) {
      String var1 = Xqedii_39q253azd1nyw.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("/I6G/Q5aVLVhvejyHIltAV0APV4zrtrQPV7cgiN/9KI=");
            int var3 = 1414408772;

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
            String var9 = Xqedii_39q253azd1nyw.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_a6bg9h0xy0t9() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1axnqz1k38m6d() {
   }

   private static int Xqedii_2wyorn97hios1(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1lyv8dj7cqhj3(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
