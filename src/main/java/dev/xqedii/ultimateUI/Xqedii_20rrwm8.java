package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_20rrwm8 {
   private static final ConcurrentHashMap<String, String> Xqedii_34o5nxtz6tnfo = new ConcurrentHashMap<>();
   private static volatile int Xqedii_7zkryutaryr9 = -2040484090;
   private static volatile int Xqedii_2biqw1n8m1fwz = 792430614;
   private static volatile int Xqedii_2m183ph93alcb = -784269803;
   private static volatile int Xqedii_tesq9120f4ig = -856841900;
   private static volatile long Xqedii_14zp9vabw0453 = 5373071993845371846L;
   private static volatile long Xqedii_27cpripfbzpbj = -1357916691354787164L;
   private static volatile long Xqedii_3hbknr6m9am6o = 978873072045351936L;
   private static volatile long Xqedii_pxge57wnwjsv = -3030322496159655702L;

   public static int Xqedii_y5xn4e4yo9nm(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_7zkryutaryr9, var1);
   }

   public static int Xqedii_k5uipdp7pa7f(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2biqw1n8m1fwz;
   }

   public static int Xqedii_3qdpuz5slr7zx(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2m183ph93alcb;
   }

   public static int Xqedii_2cdsxb1mr397w(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_tesq9120f4ig, var1);
   }

   public static long Xqedii_2ofd389tk2k1s(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_14zp9vabw0453, var2);
   }

   public static long Xqedii_2cqr1bwucpd7s(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_27cpripfbzpbj;
   }

   public static long Xqedii_3ok0te7ep6k5f(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3hbknr6m9am6o;
   }

   public static long Xqedii_1figpzsr8f8za(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_pxge57wnwjsv, var2);
   }

   public static String Xqedii_15bhx0cb5jwmh(String var0) {
      String var1 = Xqedii_34o5nxtz6tnfo.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("g/yBEPXgAFqa9VfMdD/tj6E95dZuSvXYVmFfiJyWjtw=");
            int var3 = -1032332705;

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
            String var9 = Xqedii_34o5nxtz6tnfo.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1cb7yhirstjdn() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2ul627yq2rzxx() {
   }

   private static int Xqedii_18enz1ru174qo(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3txp044fqtur(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
