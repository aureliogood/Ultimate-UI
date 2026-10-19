package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3qwiyoa {
   private static final ConcurrentHashMap<String, String> Xqedii_2dnua9svg219t = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2yypl02bu8vla = 306037906;
   private static volatile int Xqedii_3pmmcwvk8audk = 721031743;
   private static volatile int Xqedii_3sqle0hot4bs7 = -1340902954;
   private static volatile int Xqedii_gtl2ozqrkwy5 = 1189354167;
   private static volatile long Xqedii_21qobh4byrak1 = -2618692521310444185L;
   private static volatile long Xqedii_3469g9h4yjk76 = 4221191719728008591L;
   private static volatile long Xqedii_1zpyvdfeoys56 = -4750055897840757676L;
   private static volatile long Xqedii_2izap8l9uzd21 = -2302916520308137460L;

   public static int Xqedii_28i15ueko3idg(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2yypl02bu8vla, var1);
   }

   public static int Xqedii_3sjt5pffqmy4l(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3pmmcwvk8audk;
   }

   public static int Xqedii_3fmj5pczfs1h5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3sqle0hot4bs7;
   }

   public static int Xqedii_2ijyx50qvv2bc(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_gtl2ozqrkwy5, var1);
   }

   public static long Xqedii_3m30jgp3jwn7r(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_21qobh4byrak1, var2);
   }

   public static long Xqedii_3fvxubfp9n3m3(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3469g9h4yjk76;
   }

   public static long Xqedii_1j6gdn63lwbs2(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1zpyvdfeoys56;
   }

   public static long Xqedii_1i37rzvf6vquj(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2izap8l9uzd21, var2);
   }

   public static String Xqedii_2n58b9hqql8t3(String var0) {
      String var1 = Xqedii_2dnua9svg219t.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ZbC7XUv8iPGJ54i5fhiPX9KpP2Je956HMl7r6v0Yg3s=");
            int var3 = -1810066348;

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
            String var9 = Xqedii_2dnua9svg219t.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_329iuq6vx32pk() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2u019q62biopo() {
   }

   private static int Xqedii_2w4mjd2w3d64h(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_xk55o821g55v(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
