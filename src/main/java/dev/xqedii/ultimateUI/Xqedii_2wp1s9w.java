package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2wp1s9w {
   private static final ConcurrentHashMap<String, String> Xqedii_md0ijzwgr96a = new ConcurrentHashMap<>();
   private static volatile int Xqedii_zimzmy7em2sy = -10605769;
   private static volatile int Xqedii_249pypol3kmnj = -292060149;
   private static volatile int Xqedii_2akjxr2peelm4 = 1863203991;
   private static volatile int Xqedii_3ds4nziojfs8y = -1125437278;
   private static volatile long Xqedii_irfsf5opexr7 = 5929957036633518011L;
   private static volatile long Xqedii_1tergh6dtvwen = 9160221778686829356L;
   private static volatile long Xqedii_41zq5q6p4wzp = -5419967313633691270L;
   private static volatile long Xqedii_ffbx2w3dumgw = 5503752283752832874L;

   public static int Xqedii_3vpb2p26tmtbv(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_zimzmy7em2sy, var1);
   }

   public static int Xqedii_1594t5y4co522(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_249pypol3kmnj;
   }

   public static int Xqedii_bs12cdwpthji(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2akjxr2peelm4;
   }

   public static int Xqedii_1bokz0ze0nj5x(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3ds4nziojfs8y, var1);
   }

   public static long Xqedii_1bih21njey0if(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_irfsf5opexr7, var2);
   }

   public static long Xqedii_msxkpnhove0(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1tergh6dtvwen;
   }

   public static long Xqedii_3kagbv4rduzmr(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_41zq5q6p4wzp;
   }

   public static long Xqedii_76m871uu9wfz(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_ffbx2w3dumgw, var2);
   }

   public static String Xqedii_3oo49ifcq92ei(String var0) {
      String var1 = Xqedii_md0ijzwgr96a.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("d7K2B1ZpTKvoZczLPYapxUmcQfLAZP+dFxLTNw7OLr4=");
            int var3 = -1246896681;

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
            String var9 = Xqedii_md0ijzwgr96a.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_eg701rezlnh1() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3ach4vgmx4qcp() {
   }

   private static int Xqedii_2w8exd7nrhi49(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3swzg41w8i88e(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
