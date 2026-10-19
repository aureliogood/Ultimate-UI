package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1qmlm39 {
   private static final ConcurrentHashMap<String, String> Xqedii_34onh185lmrjk = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2kyncsk0nxmaq = -158161459;
   private static volatile int Xqedii_kk2bncl0yq2e = 71292454;
   private static volatile int Xqedii_1dzizfbxf5qas = -1698334795;
   private static volatile int Xqedii_2v3lslid9kqo9 = -561909727;
   private static volatile long Xqedii_11pl62xo11596 = -1427047686341278803L;
   private static volatile long Xqedii_21i7mmj2n3vmg = -2603070717479486603L;
   private static volatile long Xqedii_3jgnmtyn51hv9 = -4602362374344225632L;
   private static volatile long Xqedii_3n04p5msqnzd5 = -2947597002013138010L;

   public static int Xqedii_3ox6xyrq6mgmb(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2kyncsk0nxmaq, var1);
   }

   public static int Xqedii_12omjf4fdc7jl(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_kk2bncl0yq2e;
   }

   public static int Xqedii_vwhnqh0oa07j(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1dzizfbxf5qas;
   }

   public static int Xqedii_ivyp954l0qt9(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2v3lslid9kqo9, var1);
   }

   public static long Xqedii_2um5890acq8d0(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_11pl62xo11596, var2);
   }

   public static long Xqedii_1sm9ac5p20mli(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_21i7mmj2n3vmg;
   }

   public static long Xqedii_2dnk8ok6iqkog(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3jgnmtyn51hv9;
   }

   public static long Xqedii_1ebgmxqss3knp(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3n04p5msqnzd5, var2);
   }

   public static String Xqedii_3ourd8rcjycht(String var0) {
      String var1 = Xqedii_34onh185lmrjk.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("FuL1ppRR8NCrJofAc6dAxye3GReHkUyB5P1OE+Zw354=");
            int var3 = 1971495716;

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
            String var9 = Xqedii_34onh185lmrjk.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2rxh803jl09ri() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_akun6s6t3n2r() {
   }

   private static int Xqedii_oh1tyr8eya6k(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1jovloq06jofu(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
