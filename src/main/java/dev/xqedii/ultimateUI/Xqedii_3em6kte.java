package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3em6kte {
   private static final ConcurrentHashMap<String, String> Xqedii_1ffd2m0tmcwp9 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1pkvoihfvciyf = 1645348056;
   private static volatile int Xqedii_nk1q43rbuq9w = 1432051907;
   private static volatile int Xqedii_2qz1q1go13mvp = 164841303;
   private static volatile int Xqedii_196ynqxcmqcj5 = -241308775;
   private static volatile long Xqedii_2p1lka3kw5qa = -4099126891786221302L;
   private static volatile long Xqedii_2pmjic24k09sg = -9031786169496255158L;
   private static volatile long Xqedii_3f7s5fymfe668 = -2698053862405636106L;
   private static volatile long Xqedii_2o8mi0zzjleg3 = -2462938889033602150L;

   public static int Xqedii_17e0100cvjqdg(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1pkvoihfvciyf, var1);
   }

   public static int Xqedii_2r1rpgy1pvd8k(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_nk1q43rbuq9w;
   }

   public static int Xqedii_yzn1e7ze697t(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2qz1q1go13mvp;
   }

   public static int Xqedii_11y4mtq66jekg(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_196ynqxcmqcj5, var1);
   }

   public static long Xqedii_sn1kr0v3g4y2(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2p1lka3kw5qa, var2);
   }

   public static long Xqedii_xmdcthuwoq62(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2pmjic24k09sg;
   }

   public static long Xqedii_1dzqte8w4xxdz(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3f7s5fymfe668;
   }

   public static long Xqedii_10h2enckwn4pl(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2o8mi0zzjleg3, var2);
   }

   public static String Xqedii_2y2vklw72iuu9(String var0) {
      String var1 = Xqedii_1ffd2m0tmcwp9.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("MLYDPRGU0nEK7OjXUpAGNMc4+wBiz5+Lkwkjm60Owk8=");
            int var3 = 358333956;

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
            String var9 = Xqedii_1ffd2m0tmcwp9.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3c1qzkidbx6qd() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1zai11m07v7qj() {
   }

   private static int Xqedii_20ctw1wwhm4qx(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_aj4y1io58ni8(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
