package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2bch2cw {
   private static final ConcurrentHashMap<String, String> Xqedii_xmnrvc08evbo = new ConcurrentHashMap<>();
   private static volatile int Xqedii_197xqpmdm0ija = 2052935736;
   private static volatile int Xqedii_38nbvczxdbmlo = -242848736;
   private static volatile int Xqedii_2907ozfjwjly9 = 8435851;
   private static volatile int Xqedii_2sf5rzt4exgey = -241461989;
   private static volatile long Xqedii_2o8lelopb0nwb = 8434498949731062112L;
   private static volatile long Xqedii_1uzwbw0a3gvpa = 7310481427761943375L;
   private static volatile long Xqedii_38wce4t0sp08h = 8205518693663194441L;
   private static volatile long Xqedii_t2xhm0rggkn4 = 3895250221093758090L;

   public static int Xqedii_3v10ikgkh1ng0(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_197xqpmdm0ija, var1);
   }

   public static int Xqedii_2frdxp78jgfv8(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_38nbvczxdbmlo;
   }

   public static int Xqedii_1xiq3xptfseou(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2907ozfjwjly9;
   }

   public static int Xqedii_2lrvp1s00qucf(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2sf5rzt4exgey, var1);
   }

   public static long Xqedii_2wk5193jkv3hy(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2o8lelopb0nwb, var2);
   }

   public static long Xqedii_3ojd45vbzm5hf(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1uzwbw0a3gvpa;
   }

   public static long Xqedii_2q59rxnk2xns2(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_38wce4t0sp08h;
   }

   public static long Xqedii_1wd3osxg7nync(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_t2xhm0rggkn4, var2);
   }

   public static String Xqedii_sqklmrx8mjk8(String var0) {
      String var1 = Xqedii_xmnrvc08evbo.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("0rtrbGvEwvAhr7QwtYHWLKLGudah4tm/Rzsi0YG8Zx4=");
            int var3 = 567087755;

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
            String var9 = Xqedii_xmnrvc08evbo.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2hq64mkc9yjgh() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1zmks0afifsu() {
   }

   private static int Xqedii_2lencbp0iayjm(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3h455v2ndieym(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
