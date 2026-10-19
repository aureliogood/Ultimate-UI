package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3hlwcol {
   private static final ConcurrentHashMap<String, String> Xqedii_utl4l201dg5h = new ConcurrentHashMap<>();
   private static volatile int Xqedii_savbut8ytnz0 = -1325615006;
   private static volatile int Xqedii_1qpoladjl6ixi = 266383039;
   private static volatile int Xqedii_2z4af7x6ar54p = -1669584713;
   private static volatile int Xqedii_2gy49q5fc023g = 1653322053;
   private static volatile long Xqedii_29bug9krwtros = -4934679838280818712L;
   private static volatile long Xqedii_37jao0fhel0ob = -8260592600319670606L;
   private static volatile long Xqedii_i0ygzi66ey1m = 5693295514761312706L;
   private static volatile long Xqedii_2myeu1hbmpy09 = -2760233279629110131L;

   public static int Xqedii_2bokftna8rgf0(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_savbut8ytnz0, var1);
   }

   public static int Xqedii_2il3wqqnk0c53(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1qpoladjl6ixi;
   }

   public static int Xqedii_ama4nzr4c5ka(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2z4af7x6ar54p;
   }

   public static int Xqedii_3q8cd5arkw0hs(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2gy49q5fc023g, var1);
   }

   public static long Xqedii_3vyjawqh0fh4p(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_29bug9krwtros, var2);
   }

   public static long Xqedii_25algdoswnfqk(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_37jao0fhel0ob;
   }

   public static long Xqedii_v5x9y5cl6iou(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_i0ygzi66ey1m;
   }

   public static long Xqedii_23zgwsvrd70hg(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2myeu1hbmpy09, var2);
   }

   public static String Xqedii_1x8ue5gfndbna(String var0) {
      String var1 = Xqedii_utl4l201dg5h.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("5PuuOVUHFvvKwS4wTWovXNWP6TMFauSJTSqsS6T/jQs=");
            int var3 = 1331029646;

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
            String var9 = Xqedii_utl4l201dg5h.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3apixep5e6tgr() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_he16osm5ozkx() {
   }

   private static int Xqedii_nhkdgtxj81zs(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2t4gpc5ywosvk(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
