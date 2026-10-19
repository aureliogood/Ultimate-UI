package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1zrrgg4 {
   private static final ConcurrentHashMap<String, String> Xqedii_1qbwb5bp1wn7y = new ConcurrentHashMap<>();
   private static volatile int Xqedii_139uzpopbsqfn = -1776416881;
   private static volatile int Xqedii_2i3ma956ipog9 = -1734858625;
   private static volatile int Xqedii_9pfo36ztpmb5 = -523581670;
   private static volatile int Xqedii_3m8nr0l4b6uvx = 913860255;
   private static volatile long Xqedii_134y13qxlfqur = -6445615691434121933L;
   private static volatile long Xqedii_n59hoh2dycbj = 4824381694494220365L;
   private static volatile long Xqedii_1ibr8nepeacoq = 4577748255998149317L;
   private static volatile long Xqedii_2ibcd7nmcbhn = -7038420045620522938L;

   public static int Xqedii_33ao5dwmfawha(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_139uzpopbsqfn, var1);
   }

   public static int Xqedii_1wkiu1xidjsbh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2i3ma956ipog9;
   }

   public static int Xqedii_muhupzl1kr4a(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_9pfo36ztpmb5;
   }

   public static int Xqedii_20qingxhjmrwc(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3m8nr0l4b6uvx, var1);
   }

   public static long Xqedii_3cchaqg9puord(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_134y13qxlfqur, var2);
   }

   public static long Xqedii_2zzwqjt08o8e7(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_n59hoh2dycbj;
   }

   public static long Xqedii_1oqgus8wdxxsp(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1ibr8nepeacoq;
   }

   public static long Xqedii_1t7cgxpbxs30j(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2ibcd7nmcbhn, var2);
   }

   public static String Xqedii_2t8qhmp8mc079(String var0) {
      String var1 = Xqedii_1qbwb5bp1wn7y.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("qIsF9Nwg/orLRefz0WKl/0gYMOcEiC3L0dovNiaIPWI=");
            int var3 = 622912632;

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
            String var9 = Xqedii_1qbwb5bp1wn7y.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2g8cfdwo5sict() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3cbu0a0f2yu4n() {
   }

   private static int Xqedii_3earbrj0r1bev(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2rz56dn9pxru2(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
