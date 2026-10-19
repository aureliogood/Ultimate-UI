package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2sgdc4v {
   private static final ConcurrentHashMap<String, String> Xqedii_31pd6h7yt7jth = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2c6hc9bzw1yek = 1873592491;
   private static volatile int Xqedii_1imo5da1xdneg = 830694932;
   private static volatile int Xqedii_g5w1hm5iznga = 87690936;
   private static volatile int Xqedii_bq4ovxxnp7p5 = -455253636;
   private static volatile long Xqedii_3n1obd14guqu2 = -6768376326669269521L;
   private static volatile long Xqedii_37tczeb2pqu4j = 7567252651114148127L;
   private static volatile long Xqedii_1kzp08y1dnwpj = -8603524962291296418L;
   private static volatile long Xqedii_2ny8umtf9bjil = 5173642002736176061L;

   public static int Xqedii_3d6m6ea1qw9wm(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2c6hc9bzw1yek, var1);
   }

   public static int Xqedii_3rg4ds3e4r2jo(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1imo5da1xdneg;
   }

   public static int Xqedii_eqig0bmkle7q(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_g5w1hm5iznga;
   }

   public static int Xqedii_1drdxnrfck81i(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_bq4ovxxnp7p5, var1);
   }

   public static long Xqedii_idstebl07tf1(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3n1obd14guqu2, var2);
   }

   public static long Xqedii_glwtuhx76h5s(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_37tczeb2pqu4j;
   }

   public static long Xqedii_6sx1meyneho9(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1kzp08y1dnwpj;
   }

   public static long Xqedii_24hks4ylvq7z5(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2ny8umtf9bjil, var2);
   }

   public static String Xqedii_1hj8ifa9w3wjx(String var0) {
      String var1 = Xqedii_31pd6h7yt7jth.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("LwhPU3/WvT1damXci5EvEN+HCQ8coOErW5hHF+2BaP4=");
            int var3 = -757190583;

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
            String var9 = Xqedii_31pd6h7yt7jth.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1gbuc5alogor0() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_9w0tyx5yy4lw() {
   }

   private static int Xqedii_2ekp6vyv0vj4w(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_8502xklhobj6(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
