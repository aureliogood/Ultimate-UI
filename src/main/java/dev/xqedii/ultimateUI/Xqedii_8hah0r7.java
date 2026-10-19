package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_8hah0r7 {
   private static final ConcurrentHashMap<String, String> Xqedii_11m7aavra4xas = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3278s3v01pcu7 = -385234207;
   private static volatile int Xqedii_3432s5kjyqtpv = 1115452409;
   private static volatile int Xqedii_1jtt22dtq8wjl = 499444269;
   private static volatile int Xqedii_32k6wo9nm7jp8 = -337271442;
   private static volatile long Xqedii_2ud0zr2bco4hh = -2078674689491139805L;
   private static volatile long Xqedii_3if3wvn007rvm = -8659590427813750622L;
   private static volatile long Xqedii_9x5mcslrjasa = 1337775176873120020L;
   private static volatile long Xqedii_3vqpma7powsp7 = 9221157457424429577L;

   public static int Xqedii_2f4fvidqenx0h(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3278s3v01pcu7, var1);
   }

   public static int Xqedii_4w5aqnct9cyf(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3432s5kjyqtpv;
   }

   public static int Xqedii_hwj7nqvdg0s0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1jtt22dtq8wjl;
   }

   public static int Xqedii_3iorrjcsxuv17(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_32k6wo9nm7jp8, var1);
   }

   public static long Xqedii_263x7fa9a3oav(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2ud0zr2bco4hh, var2);
   }

   public static long Xqedii_dkcj8qdypxh5(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3if3wvn007rvm;
   }

   public static long Xqedii_3npzqel591twt(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_9x5mcslrjasa;
   }

   public static long Xqedii_33fuu5vmvhbq9(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3vqpma7powsp7, var2);
   }

   public static String Xqedii_lq74qrytquq(String var0) {
      String var1 = Xqedii_11m7aavra4xas.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("gAvyz6aALXDgHE+FzRIXKEX8p2tbrYnRFfUGuwDM9+Q=");
            int var3 = -1028198674;

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
            String var9 = Xqedii_11m7aavra4xas.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_11wxcma7d8tq6() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_bsq6it3zwbc0() {
   }

   private static int Xqedii_1xq3pt2542oav(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_27nhdbznds65s(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
