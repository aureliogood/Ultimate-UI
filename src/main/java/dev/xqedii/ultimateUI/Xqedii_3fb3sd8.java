package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3fb3sd8 {
   private static final ConcurrentHashMap<String, String> Xqedii_r1k1katskoim = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2ckoclwof0tao = 1033616486;
   private static volatile int Xqedii_3ecv4isk5fovv = -1320139166;
   private static volatile int Xqedii_kb1fieorf5t1 = 264371461;
   private static volatile int Xqedii_3hl3wyfqt4p58 = 184570184;
   private static volatile long Xqedii_1bk7kongkyuk2 = 7251004740026445915L;
   private static volatile long Xqedii_3uetnkyzkb152 = 5517554056484332968L;
   private static volatile long Xqedii_15f46572wwjlq = 7347194295162127064L;
   private static volatile long Xqedii_1e2bj54kj7grp = -6703482568987870973L;

   public static int Xqedii_36y2cgz23svvo(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2ckoclwof0tao, var1);
   }

   public static int Xqedii_y1prptdu9kpo(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3ecv4isk5fovv;
   }

   public static int Xqedii_2o6bzpu9bo5zm(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_kb1fieorf5t1;
   }

   public static int Xqedii_3h3r8rn69ro1l(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3hl3wyfqt4p58, var1);
   }

   public static long Xqedii_3pgsen6ath93i(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1bk7kongkyuk2, var2);
   }

   public static long Xqedii_3ikxg5flrpsnz(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3uetnkyzkb152;
   }

   public static long Xqedii_p0aegcqq80e2(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_15f46572wwjlq;
   }

   public static long Xqedii_2zw805a6gpxmf(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1e2bj54kj7grp, var2);
   }

   public static String Xqedii_39xle82m1o0jk(String var0) {
      String var1 = Xqedii_r1k1katskoim.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("LdCMpR5Qa0pQTtuUt9XPmGDn6T93JcSJ5uko4sGsYcw=");
            int var3 = -891039719;

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
            String var9 = Xqedii_r1k1katskoim.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3lt1ifjg79md() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_aiyoar1hh1rd() {
   }

   private static int Xqedii_lir3t26404uj(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2ycvo4zakv0j3(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
