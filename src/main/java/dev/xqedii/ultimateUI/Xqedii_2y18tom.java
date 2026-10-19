package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2y18tom {
   private static final ConcurrentHashMap<String, String> Xqedii_1b3r2uhuk7cmb = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1cqjndkrvkz9e = 327671996;
   private static volatile int Xqedii_1idbyo3v1ul80 = -1100251508;
   private static volatile int Xqedii_ve3zlgeamkrr = -1632628396;
   private static volatile int Xqedii_148xeqadtwb73 = 934160186;
   private static volatile long Xqedii_382tftngktztx = -3918891813447244086L;
   private static volatile long Xqedii_2bbaj1ee6wgv8 = 132682710518783713L;
   private static volatile long Xqedii_oe1daim0upjj = -3276738144259075200L;
   private static volatile long Xqedii_3l2sp3sbktf4f = -4456752821680099587L;

   public static int Xqedii_1dzpti4gnrqty(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1cqjndkrvkz9e, var1);
   }

   public static int Xqedii_292l7iyizu4fg(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1idbyo3v1ul80;
   }

   public static int Xqedii_20vbg5hpub4aw(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_ve3zlgeamkrr;
   }

   public static int Xqedii_1py39zs0294c4(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_148xeqadtwb73, var1);
   }

   public static long Xqedii_2ijmmvikf4u6u(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_382tftngktztx, var2);
   }

   public static long Xqedii_12eg56qq1j1pd(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2bbaj1ee6wgv8;
   }

   public static long Xqedii_276m0o4hcska4(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_oe1daim0upjj;
   }

   public static long Xqedii_mkfevw7l2swh(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3l2sp3sbktf4f, var2);
   }

   public static String Xqedii_2a8i0bnyk8e6l(String var0) {
      String var1 = Xqedii_1b3r2uhuk7cmb.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("/3eS5n46tneH1uITQoY1mt+U+ipQ4+DpvR7udirOu2E=");
            int var3 = -1928962993;

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
            String var9 = Xqedii_1b3r2uhuk7cmb.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2lj1b66ldj9m4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1dkqr8nw0okwa() {
   }

   private static int Xqedii_2tqilpk4hlp11(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_28my3mfhybtdc(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
