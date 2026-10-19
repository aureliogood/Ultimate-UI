package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_nmny202 {
   private static final ConcurrentHashMap<String, String> Xqedii_2yi4aruzkkl5p = new ConcurrentHashMap<>();
   private static volatile int Xqedii_26c5r4s4dfgh2 = 1650724688;
   private static volatile int Xqedii_2mflh197bmuuj = -1559926852;
   private static volatile int Xqedii_so3cuux1hg99 = -2094572123;
   private static volatile int Xqedii_2dlsxbcy16m5m = -1644652152;
   private static volatile long Xqedii_2ayxv2ta468zg = -8423699285483317292L;
   private static volatile long Xqedii_313gvpp4mxo1j = -6197250656944736657L;
   private static volatile long Xqedii_xalvbjshyud0 = -540543120021728721L;
   private static volatile long Xqedii_1kun4xdb79f3s = 7187120396556207569L;

   public static int Xqedii_12jsqa942le67(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_26c5r4s4dfgh2, var1);
   }

   public static int Xqedii_2nr0ax05iwuol(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2mflh197bmuuj;
   }

   public static int Xqedii_wpfb1kjjo28t(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_so3cuux1hg99;
   }

   public static int Xqedii_uhp9fvkkj53(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2dlsxbcy16m5m, var1);
   }

   public static long Xqedii_3bezabhla3iy6(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2ayxv2ta468zg, var2);
   }

   public static long Xqedii_2fi90gbhudonj(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_313gvpp4mxo1j;
   }

   public static long Xqedii_3ijvs6sho8kt0(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_xalvbjshyud0;
   }

   public static long Xqedii_1yr7pq582y1yi(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1kun4xdb79f3s, var2);
   }

   public static String Xqedii_2mfabxmab914x(String var0) {
      String var1 = Xqedii_2yi4aruzkkl5p.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("vDrMh3y/N1MnIiQXbqHkQkXZ2cFqKn1htxi5mfbG3RY=");
            int var3 = -1419745034;

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
            String var9 = Xqedii_2yi4aruzkkl5p.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2y3dldvokocbq() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2p7mhjjx6fg5s() {
   }

   private static int Xqedii_3h8o2zvo4fo70(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3u8toym8uebrm(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
