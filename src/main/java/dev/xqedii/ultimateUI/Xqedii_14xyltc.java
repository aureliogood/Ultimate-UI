package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_14xyltc {
   private static final ConcurrentHashMap<String, String> Xqedii_1mzolqe1cy6gt = new ConcurrentHashMap<>();
   private static volatile int Xqedii_ddggmiv8sr8w = -136735107;
   private static volatile int Xqedii_ehtx7l1t3tum = -1253258945;
   private static volatile int Xqedii_298xdnf059sxy = 1741578193;
   private static volatile int Xqedii_3i3hxblrltt69 = -1169899949;
   private static volatile long Xqedii_q9tf5dikwgka = 2167226279274719260L;
   private static volatile long Xqedii_jql5rbbihlis = 8454607702212331521L;
   private static volatile long Xqedii_volrj08kom57 = -5559393337458487947L;
   private static volatile long Xqedii_2x4r9ze793gx3 = -3818294644163826610L;

   public static int Xqedii_1477s3vox0691(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_ddggmiv8sr8w, var1);
   }

   public static int Xqedii_3g6q57pcgf017(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_ehtx7l1t3tum;
   }

   public static int Xqedii_dpupniznyqof(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_298xdnf059sxy;
   }

   public static int Xqedii_2zn6noi0gc6sz(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3i3hxblrltt69, var1);
   }

   public static long Xqedii_1x345cqr7nd9y(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_q9tf5dikwgka, var2);
   }

   public static long Xqedii_3q6ynt02t992y(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_jql5rbbihlis;
   }

   public static long Xqedii_3bn2x1nrp1qar(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_volrj08kom57;
   }

   public static long Xqedii_1d9y0gmswzy3b(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2x4r9ze793gx3, var2);
   }

   public static String Xqedii_1n1jc3lzg2g8m(String var0) {
      String var1 = Xqedii_1mzolqe1cy6gt.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("s/LdJV/QP21jjiZD8DmnY6B4FcVj0ZwpHX1v+GC1e8I=");
            int var3 = -794013288;

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
            String var9 = Xqedii_1mzolqe1cy6gt.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3tjpcky0dm3y() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_l6e3x8mx2zx5() {
   }

   private static int Xqedii_2cavadfhy0on3(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_39q1kgnqs3p4(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
