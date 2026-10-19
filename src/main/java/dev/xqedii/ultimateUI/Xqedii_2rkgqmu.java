package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2rkgqmu {
   private static final ConcurrentHashMap<String, String> Xqedii_2wixmftfixlbr = new ConcurrentHashMap<>();
   private static volatile int Xqedii_qluynnr0e18c = 1469038956;
   private static volatile int Xqedii_19r2pcskdpfpp = 1725397381;
   private static volatile int Xqedii_18ln8re5xtnjy = 584010291;
   private static volatile int Xqedii_3kq4ln52fgfxs = 1985222229;
   private static volatile long Xqedii_1zyt2w65n68u4 = 7406652277335998640L;
   private static volatile long Xqedii_198ul4fvnlaaf = -4677143732113340611L;
   private static volatile long Xqedii_2un16sqpmnus7 = 3749115172794562996L;
   private static volatile long Xqedii_2pvr5k10c8x79 = -5331267987854995522L;

   public static int Xqedii_1z9ml6wjaans7(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_qluynnr0e18c, var1);
   }

   public static int Xqedii_hjoa3j051fh6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_19r2pcskdpfpp;
   }

   public static int Xqedii_2vim377gtp21b(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_18ln8re5xtnjy;
   }

   public static int Xqedii_1hdgk40thrpul(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3kq4ln52fgfxs, var1);
   }

   public static long Xqedii_36omcsb5tto38(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1zyt2w65n68u4, var2);
   }

   public static long Xqedii_24lhyrfw4lt9l(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_198ul4fvnlaaf;
   }

   public static long Xqedii_18k848042mwz0(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2un16sqpmnus7;
   }

   public static long Xqedii_30hch54qumulk(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2pvr5k10c8x79, var2);
   }

   public static String Xqedii_3mrgknk6xp7a5(String var0) {
      String var1 = Xqedii_2wixmftfixlbr.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("+W9SEYdbHkaKu7C0oYDooK8t+1y+tO/ngNSoj7V0dQ4=");
            int var3 = 1915833743;

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
            String var9 = Xqedii_2wixmftfixlbr.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3debyc8xsnmb0() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_234cb9xirqlbr() {
   }

   private static int Xqedii_1lgpr6phitk3j(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_38fkeej8eyckj(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
