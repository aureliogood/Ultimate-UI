package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1qge8du {
   private static final ConcurrentHashMap<String, String> Xqedii_nn6wunahg141 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_skueyegcv9qi = -1999195072;
   private static volatile int Xqedii_pqz38vjrsx1y = -1284471811;
   private static volatile int Xqedii_13jumwdzmko00 = -29270499;
   private static volatile int Xqedii_114pjthmw9mlw = 261482120;
   private static volatile long Xqedii_1gytbe5x1uj2r = 8731701567519299198L;
   private static volatile long Xqedii_3e1d8np4l67nr = -645116044480095616L;
   private static volatile long Xqedii_16pj68vxrov6n = 3284726427522337041L;
   private static volatile long Xqedii_34p3xhqz7y56r = 7776464838806143739L;

   public static int Xqedii_2tz247gd9p7ri(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_skueyegcv9qi, var1);
   }

   public static int Xqedii_1rrh5lt3mbgzx(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_pqz38vjrsx1y;
   }

   public static int Xqedii_7ej46kw2rebd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_13jumwdzmko00;
   }

   public static int Xqedii_393fven43ccxi(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_114pjthmw9mlw, var1);
   }

   public static long Xqedii_1lxmpyea0baoo(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1gytbe5x1uj2r, var2);
   }

   public static long Xqedii_14haelqocqwr(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3e1d8np4l67nr;
   }

   public static long Xqedii_8qvvb2ijtukr(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_16pj68vxrov6n;
   }

   public static long Xqedii_19gx94lo4kisk(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_34p3xhqz7y56r, var2);
   }

   public static String Xqedii_3iejmhm8m5i1w(String var0) {
      String var1 = Xqedii_nn6wunahg141.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("iREEehemhh0zDhyRYSymcNGogvuPqo0HbR39OVgLoAE=");
            int var3 = -1670884827;

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
            String var9 = Xqedii_nn6wunahg141.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_38q883bf5vc34() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1doojhdk6g6m2() {
   }

   private static int Xqedii_2p5w6d16ds8at(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1lp5cpllm73wd(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
