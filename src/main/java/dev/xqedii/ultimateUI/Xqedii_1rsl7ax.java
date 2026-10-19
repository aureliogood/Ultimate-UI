package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1rsl7ax {
   private static final ConcurrentHashMap<String, String> Xqedii_3rclkm9px8esu = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3m1wl7tvrw5ni = 817773907;
   private static volatile int Xqedii_1bf3bo5qq8ogz = -476377685;
   private static volatile int Xqedii_1f2ics5vyc5d2 = 1697064065;
   private static volatile int Xqedii_1vq3n722d1t0g = -287218344;
   private static volatile long Xqedii_22umwghkq6as5 = -6506907116499023613L;
   private static volatile long Xqedii_3gi923hf6w9s3 = -7878144090828927049L;
   private static volatile long Xqedii_3mtm6h0lk1scs = 5472190817769144702L;
   private static volatile long Xqedii_1xdqhbc364vc4 = -7591591155589185679L;

   public static int Xqedii_1z0lt00opc16v(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3m1wl7tvrw5ni, var1);
   }

   public static int Xqedii_71rfpatvahv2(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1bf3bo5qq8ogz;
   }

   public static int Xqedii_m4h24kpojswk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1f2ics5vyc5d2;
   }

   public static int Xqedii_2q3rddkjleqk7(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1vq3n722d1t0g, var1);
   }

   public static long Xqedii_1kv1mk3dd70pp(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_22umwghkq6as5, var2);
   }

   public static long Xqedii_32qswi6kndcmw(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3gi923hf6w9s3;
   }

   public static long Xqedii_blv3146z405t(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3mtm6h0lk1scs;
   }

   public static long Xqedii_vlx9m85mpd3d(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1xdqhbc364vc4, var2);
   }

   public static String Xqedii_30h87jyj24la4(String var0) {
      String var1 = Xqedii_3rclkm9px8esu.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("uJiLNrX70nh7ezn9feeYofef44NokjhurawzJFgCtrs=");
            int var3 = 737752140;

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
            String var9 = Xqedii_3rclkm9px8esu.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1xwwlv626fp1c() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_aw6ft9f1xek() {
   }

   private static int Xqedii_3m9eqhb39vl3(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_30hp4u1xwtsj7(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
