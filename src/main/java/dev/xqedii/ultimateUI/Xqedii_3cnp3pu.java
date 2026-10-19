package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3cnp3pu {
   private static final ConcurrentHashMap<String, String> Xqedii_a9b7ssoc8he7 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3oevccdlntped = 1167470209;
   private static volatile int Xqedii_25a7vevwfx6jl = -373337205;
   private static volatile int Xqedii_3mezeqaovmpjr = -1210651876;
   private static volatile int Xqedii_mnwe8smu902p = -1358559349;
   private static volatile long Xqedii_2u6deji8w90kt = 5088802401817051781L;
   private static volatile long Xqedii_1ts66t6f3lk7m = 8324593530114504648L;
   private static volatile long Xqedii_3rwojm63lkip = -6372210786490911980L;
   private static volatile long Xqedii_2qjsh4dbwne3u = -6240577076918359689L;

   public static int Xqedii_27e2uz7wnr479(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3oevccdlntped, var1);
   }

   public static int Xqedii_16c0nfli1urox(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_25a7vevwfx6jl;
   }

   public static int Xqedii_193pag5i5e2gn(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3mezeqaovmpjr;
   }

   public static int Xqedii_1215tr8qp7y9u(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_mnwe8smu902p, var1);
   }

   public static long Xqedii_2fc1aw7wla3st(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2u6deji8w90kt, var2);
   }

   public static long Xqedii_382pfuvuuzr7r(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1ts66t6f3lk7m;
   }

   public static long Xqedii_xzu7eonyxs8b(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3rwojm63lkip;
   }

   public static long Xqedii_17vycx3vmwd8z(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2qjsh4dbwne3u, var2);
   }

   public static String Xqedii_2w0zypiwmpkpd(String var0) {
      String var1 = Xqedii_a9b7ssoc8he7.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("q4mkrMVDSnv/gUPXLfcjxd9+huHUA4hmjfZZMbmAxmg=");
            int var3 = 578237516;

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
            String var9 = Xqedii_a9b7ssoc8he7.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_w22jh0f9omyc() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_qzamelbxojs() {
   }

   private static int Xqedii_1dsag878o2q20(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2v2pzh2mzxqj2(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
