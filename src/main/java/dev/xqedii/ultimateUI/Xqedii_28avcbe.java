package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_28avcbe {
   private static final ConcurrentHashMap<String, String> Xqedii_3lddcbf40415i = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3qkhtsfbanm5y = -425825655;
   private static volatile int Xqedii_yj83dbad2nz5 = -78559401;
   private static volatile int Xqedii_1ytlj8xs2mdo9 = -614217214;
   private static volatile int Xqedii_1m6z1g310uoh3 = -359018863;
   private static volatile long Xqedii_25bdemzv8i8ik = -525445961540941808L;
   private static volatile long Xqedii_10j1k7jp2f8r2 = -1377869121212538134L;
   private static volatile long Xqedii_2be1dl8t6q9s9 = -1775591045767813074L;
   private static volatile long Xqedii_3pea6vl86fjij = -1672377053705631450L;

   public static int Xqedii_9nmrk8mhjopj(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3qkhtsfbanm5y, var1);
   }

   public static int Xqedii_14m2j5952uvg6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_yj83dbad2nz5;
   }

   public static int Xqedii_1x86i0q6xlcqq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1ytlj8xs2mdo9;
   }

   public static int Xqedii_1h3g4w5nnxl59(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1m6z1g310uoh3, var1);
   }

   public static long Xqedii_akqqyhim5j43(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_25bdemzv8i8ik, var2);
   }

   public static long Xqedii_144h34z2v841n(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_10j1k7jp2f8r2;
   }

   public static long Xqedii_14s27h3scp5rb(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2be1dl8t6q9s9;
   }

   public static long Xqedii_1tbd8lupkt2y0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3pea6vl86fjij, var2);
   }

   public static String Xqedii_beguow7h551q(String var0) {
      String var1 = Xqedii_3lddcbf40415i.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("cPmkB/lAmm/FmUuGkjhBRqX5S5EhIuAM+BQF1TiSUBg=");
            int var3 = 240650977;

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
            String var9 = Xqedii_3lddcbf40415i.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3kfywdguzfb9r() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_xt5h1b7x9ji4() {
   }

   private static int Xqedii_3gze7upn8v3hx(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3psates0122sw(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
