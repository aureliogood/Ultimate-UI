package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1w28rrn {
   private static final ConcurrentHashMap<String, String> Xqedii_2drnf4tnjrnvs = new ConcurrentHashMap<>();
   private static volatile int Xqedii_o9b9ushyegjn = -1863356354;
   private static volatile int Xqedii_3moipe6ei0okg = -1207798442;
   private static volatile int Xqedii_65y1vpmtdka7 = -1630128773;
   private static volatile int Xqedii_1czlvxln4xp6q = -1973076639;
   private static volatile long Xqedii_5xn7ctf1lrix = 1929441334943763979L;
   private static volatile long Xqedii_172g7gvguxdrc = 6380513929803416844L;
   private static volatile long Xqedii_1nl9c7zbu9ni1 = -8898260798015826387L;
   private static volatile long Xqedii_1qs4uo4b8x66n = -3927318928255464854L;

   public static int Xqedii_22o8ynywvcul7(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_o9b9ushyegjn, var1);
   }

   public static int Xqedii_24849lrydxm60(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3moipe6ei0okg;
   }

   public static int Xqedii_2jg7esa40p25x(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_65y1vpmtdka7;
   }

   public static int Xqedii_1gt87i3jex487(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1czlvxln4xp6q, var1);
   }

   public static long Xqedii_22cnbzcyrznnn(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_5xn7ctf1lrix, var2);
   }

   public static long Xqedii_v27pxfe7crxo(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_172g7gvguxdrc;
   }

   public static long Xqedii_10nc25mlgqr3v(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1nl9c7zbu9ni1;
   }

   public static long Xqedii_2qd3igfs4g55e(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1qs4uo4b8x66n, var2);
   }

   public static String Xqedii_395vvc0jokiwo(String var0) {
      String var1 = Xqedii_2drnf4tnjrnvs.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("RJxVHeBBUyzfBLYAGb3bfgG4GCTicXrjYpAP7YbRfTA=");
            int var3 = 280755492;

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
            String var9 = Xqedii_2drnf4tnjrnvs.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1lxnv41w06ivh() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_36620ll6wkh3p() {
   }

   private static int Xqedii_1l22lro96b982(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_ite59pvoi4am(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
