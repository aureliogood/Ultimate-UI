package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_16tq8zh {
   private static final ConcurrentHashMap<String, String> Xqedii_37z1q8l1ojrei = new ConcurrentHashMap<>();
   private static volatile int Xqedii_34rtgav9km74n = -1283901182;
   private static volatile int Xqedii_22d4m4n3q22x5 = 578274255;
   private static volatile int Xqedii_1vcrqk2a2i9pe = -1798383709;
   private static volatile int Xqedii_29ejj4wa1dgex = 1238912207;
   private static volatile long Xqedii_tdhwf51ernps = -2691295476475892957L;
   private static volatile long Xqedii_1iymyapdfw6f6 = 4094401098424301637L;
   private static volatile long Xqedii_2i9mpkej1dzm3 = -3073694627746245208L;
   private static volatile long Xqedii_324dr7jwu4mld = 8843928060895247249L;

   public static int Xqedii_1yofoys97mgzu(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_34rtgav9km74n, var1);
   }

   public static int Xqedii_1q1if0je66l3k(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_22d4m4n3q22x5;
   }

   public static int Xqedii_1dndoqm4xbwn4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1vcrqk2a2i9pe;
   }

   public static int Xqedii_3mpeuere3uqv5(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_29ejj4wa1dgex, var1);
   }

   public static long Xqedii_d2sxjj67nucz(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_tdhwf51ernps, var2);
   }

   public static long Xqedii_2y1dmegxm4qmt(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1iymyapdfw6f6;
   }

   public static long Xqedii_3p0qt6c9hpup3(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2i9mpkej1dzm3;
   }

   public static long Xqedii_350da5kffknwi(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_324dr7jwu4mld, var2);
   }

   public static String Xqedii_24lqvq8vcmbnd(String var0) {
      String var1 = Xqedii_37z1q8l1ojrei.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("0+xLlc/rW3A44wkJ3fCCkHGPQmDV2S1kzQ/LLy9s8bw=");
            int var3 = 1650778421;

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
            String var9 = Xqedii_37z1q8l1ojrei.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1f1ysso6oomvb() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1eekb6lnfk6q7() {
   }

   private static int Xqedii_lstge2z6kp4v(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2dgeh8vwjjuxc(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
