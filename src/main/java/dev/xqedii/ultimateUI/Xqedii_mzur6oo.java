package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_mzur6oo {
   private static final ConcurrentHashMap<String, String> Xqedii_3db333sn3j9bm = new ConcurrentHashMap<>();
   private static volatile int Xqedii_fiu7iu9rjizp = 1335833459;
   private static volatile int Xqedii_1753z49e25wcv = -963365246;
   private static volatile int Xqedii_1pfek3a32gr11 = 120282815;
   private static volatile int Xqedii_1b5nstwxwyfd2 = 1786596917;
   private static volatile long Xqedii_15yr9j48moze2 = -2654103298939012896L;
   private static volatile long Xqedii_ahbazaftb99x = -2899653480469150130L;
   private static volatile long Xqedii_zfgjgog25862 = 2194277825115573859L;
   private static volatile long Xqedii_2o38k0ylpe5cc = -2197913285209938724L;

   public static int Xqedii_29z2enj5iypet(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_fiu7iu9rjizp, var1);
   }

   public static int Xqedii_36qmh3yt7fxu9(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1753z49e25wcv;
   }

   public static int Xqedii_ap3m4pmvdm8v(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1pfek3a32gr11;
   }

   public static int Xqedii_m31trakx6xep(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1b5nstwxwyfd2, var1);
   }

   public static long Xqedii_1j7ouof1qydfh(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_15yr9j48moze2, var2);
   }

   public static long Xqedii_2qy5cpnupd4wv(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_ahbazaftb99x;
   }

   public static long Xqedii_18u7uownsk2u8(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_zfgjgog25862;
   }

   public static long Xqedii_2pn6nim4gy9wm(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2o38k0ylpe5cc, var2);
   }

   public static String Xqedii_2035n8bhzw7v5(String var0) {
      String var1 = Xqedii_3db333sn3j9bm.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("wlYB10B028jC9bCxHl+xcfrfMEhFEUwwqjBo7j7Eqi0=");
            int var3 = -2138171427;

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
            String var9 = Xqedii_3db333sn3j9bm.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1zl189od4dsbv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2mzyy6js0goc5() {
   }

   private static int Xqedii_3sdfkbqlcglse(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1as1p6mnwsgvz(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
