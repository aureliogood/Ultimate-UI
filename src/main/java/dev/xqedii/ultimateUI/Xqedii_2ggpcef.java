package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2ggpcef {
   private static final ConcurrentHashMap<String, String> Xqedii_10dtc9dzksov7 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2qvu0mbmku09s = 1967820719;
   private static volatile int Xqedii_1ofq46h9hmi7i = -1057416480;
   private static volatile int Xqedii_13a5yhqzdfso9 = 1598888889;
   private static volatile int Xqedii_1e540x30m8vg3 = 1535797912;
   private static volatile long Xqedii_30zu2jdxevv1u = 2482744545951738925L;
   private static volatile long Xqedii_1u70nfcnlmrcl = 2086587314172333257L;
   private static volatile long Xqedii_30p4x5z9qv75x = -1583861788336159908L;
   private static volatile long Xqedii_28qwfxnlnzz55 = 2742549595552187347L;

   public static int Xqedii_22fxp35cwvfzl(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2qvu0mbmku09s, var1);
   }

   public static int Xqedii_3jsaib1o3c48c(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1ofq46h9hmi7i;
   }

   public static int Xqedii_2hacao6ls7ugl(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_13a5yhqzdfso9;
   }

   public static int Xqedii_2l8wye6vp1v8v(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1e540x30m8vg3, var1);
   }

   public static long Xqedii_1zxzcqagf5it6(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_30zu2jdxevv1u, var2);
   }

   public static long Xqedii_34tyeuh2s97xt(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1u70nfcnlmrcl;
   }

   public static long Xqedii_xu4smzgky6dv(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_30p4x5z9qv75x;
   }

   public static long Xqedii_1narjmry822f9(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_28qwfxnlnzz55, var2);
   }

   public static String Xqedii_2zuo566x395lc(String var0) {
      String var1 = Xqedii_10dtc9dzksov7.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("fmdYypKhRvwuy6hOHfL2UIb0O6C5qBZNdLp66ZxH55Y=");
            int var3 = 1360583879;

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
            String var9 = Xqedii_10dtc9dzksov7.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_150wclhvr74aj() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_15uohu5yw7b0q() {
   }

   private static int Xqedii_1iumdxeblh9lc(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_20om6yi2m8sjj(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
