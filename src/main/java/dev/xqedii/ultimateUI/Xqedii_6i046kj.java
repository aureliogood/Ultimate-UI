package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_6i046kj {
   private static final ConcurrentHashMap<String, String> Xqedii_oy829x1kqq3h = new ConcurrentHashMap<>();
   private static volatile int Xqedii_me2306mzb29b = 1832978271;
   private static volatile int Xqedii_347d3cacn3vff = -1607252172;
   private static volatile int Xqedii_213p73a2a9651 = -120249392;
   private static volatile int Xqedii_3v4s8kf4j516i = 814822391;
   private static volatile long Xqedii_1n6wy16pcmwfe = 695362989495542897L;
   private static volatile long Xqedii_otodjf9otexw = -963221576940658577L;
   private static volatile long Xqedii_29hcpohl58938 = -6773859595231783095L;
   private static volatile long Xqedii_2xkbls5injjbd = 8089823228003571120L;

   public static int Xqedii_p1agktzrvp8e(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_me2306mzb29b, var1);
   }

   public static int Xqedii_ik936kiei9ms(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_347d3cacn3vff;
   }

   public static int Xqedii_1rh256c5b3a4j(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_213p73a2a9651;
   }

   public static int Xqedii_2piwh3vb570x(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3v4s8kf4j516i, var1);
   }

   public static long Xqedii_jrpgn0jshztm(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1n6wy16pcmwfe, var2);
   }

   public static long Xqedii_2prwj7tkrnudw(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_otodjf9otexw;
   }

   public static long Xqedii_d5t0hgbm1xva(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_29hcpohl58938;
   }

   public static long Xqedii_1dn0q93gmbznh(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2xkbls5injjbd, var2);
   }

   public static String Xqedii_2vhr03cpmx0ud(String var0) {
      String var1 = Xqedii_oy829x1kqq3h.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("cbaQ+Wl4hpeDsO9tcB7dLxk/mXoKPhfJP6JqZKvTkEM=");
            int var3 = -736031787;

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
            String var9 = Xqedii_oy829x1kqq3h.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1pozc6omap7t1() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_29g5o2r60zhwl() {
   }

   private static int Xqedii_1dk281v5y8iyy(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_jjaloeds8t5h(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
