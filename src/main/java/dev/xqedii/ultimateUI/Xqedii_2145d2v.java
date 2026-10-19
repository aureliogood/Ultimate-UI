package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2145d2v {
   private static final ConcurrentHashMap<String, String> Xqedii_1iy6rnw8baifd = new ConcurrentHashMap<>();
   private static volatile int Xqedii_32ulopndnqy5s = -1327956233;
   private static volatile int Xqedii_24kksnt8cy401 = -567583868;
   private static volatile int Xqedii_mld8xt3dqkp7 = 489761065;
   private static volatile int Xqedii_2ynbkjz6vrc5s = 515634468;
   private static volatile long Xqedii_35f31g0p2lzzk = -4978753785760169274L;
   private static volatile long Xqedii_2d3a9s4ad9rq2 = 4305082454052556017L;
   private static volatile long Xqedii_1oqkm7oaz4uzy = 8094440393224813894L;
   private static volatile long Xqedii_21mqqfn35rbxs = 5006700341177825839L;

   public static int Xqedii_2zwq8nxkaxwy(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_32ulopndnqy5s, var1);
   }

   public static int Xqedii_avh8pklonqq4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_24kksnt8cy401;
   }

   public static int Xqedii_2j3evkyoicz03(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_mld8xt3dqkp7;
   }

   public static int Xqedii_2vk8f73vxfamb(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2ynbkjz6vrc5s, var1);
   }

   public static long Xqedii_xcx5eouxau92(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_35f31g0p2lzzk, var2);
   }

   public static long Xqedii_1bruli5ewg7a(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2d3a9s4ad9rq2;
   }

   public static long Xqedii_3opj8tagrapy9(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1oqkm7oaz4uzy;
   }

   public static long Xqedii_3jfqiqxdqnu1q(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_21mqqfn35rbxs, var2);
   }

   public static String Xqedii_1srgjgjeaaf0w(String var0) {
      String var1 = Xqedii_1iy6rnw8baifd.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("rs/zYMP+ZpvZkwuArSgl19KrbSCEfMB7q1N/ED2lC6g=");
            int var3 = 1523059757;

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
            String var9 = Xqedii_1iy6rnw8baifd.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1lhuafmeevmxa() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_dbiokh5o31s9() {
   }

   private static int Xqedii_3ka9vfqt1z9s3(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2810uaq8tiy59(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
