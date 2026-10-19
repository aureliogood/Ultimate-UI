package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1gibrpy {
   private static final ConcurrentHashMap<String, String> Xqedii_3tuc0ruo0s4yq = new ConcurrentHashMap<>();
   private static volatile int Xqedii_cfbq3u96l2c4 = 1960252017;
   private static volatile int Xqedii_388ulh2kbl422 = 428504962;
   private static volatile int Xqedii_2x3kjf62tbmwl = 262936295;
   private static volatile int Xqedii_3he64tpjxvcbm = -1284710565;
   private static volatile long Xqedii_15i2c07v4cwot = 2478339322310240957L;
   private static volatile long Xqedii_1r781m724kqte = 3656657905351345874L;
   private static volatile long Xqedii_kp98kneux7o2 = 343250054325268955L;
   private static volatile long Xqedii_ayh4mapgnj5x = 5565771422300618829L;

   public static int Xqedii_3rbxxiinilq1i(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_cfbq3u96l2c4, var1);
   }

   public static int Xqedii_32qu5b3d1iav0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_388ulh2kbl422;
   }

   public static int Xqedii_ltu9f6ueuw27(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2x3kjf62tbmwl;
   }

   public static int Xqedii_2dhtbk8lwavny(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3he64tpjxvcbm, var1);
   }

   public static long Xqedii_3e7hupjs8qixw(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_15i2c07v4cwot, var2);
   }

   public static long Xqedii_2if61rmgqelns(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1r781m724kqte;
   }

   public static long Xqedii_1yqrjhx0wwuvq(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_kp98kneux7o2;
   }

   public static long Xqedii_1c96bnbw17cia(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_ayh4mapgnj5x, var2);
   }

   public static String Xqedii_2wvag7qh4vnxt(String var0) {
      String var1 = Xqedii_3tuc0ruo0s4yq.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("6zaDa0IQ05oOWF7i3X+2gBWdFLSURXnDkvc+zwWc034=");
            int var3 = 1894191340;

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
            String var9 = Xqedii_3tuc0ruo0s4yq.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1p6rv4r16134w() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_ddkm06ykffkt() {
   }

   private static int Xqedii_1djmm4dyujioz(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_38v0hmoqxb1is(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
