package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_ntttel8 {
   private static final ConcurrentHashMap<String, String> Xqedii_daypx2ca1dpu = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2vnlmw6wbi9y8 = 1425387836;
   private static volatile int Xqedii_1n1gd5n3f3zih = -511137242;
   private static volatile int Xqedii_3ta3md4nkqrwy = 1530897098;
   private static volatile int Xqedii_amd7o1soupqa = -182310646;
   private static volatile long Xqedii_lrlqlrwkohst = -8640318790750469372L;
   private static volatile long Xqedii_p32nw6kp6ch4 = 2123280874630648001L;
   private static volatile long Xqedii_3sqzms54xpn3s = -2749903146364757316L;
   private static volatile long Xqedii_3u5s42vno1hf8 = 3072444534204937198L;

   public static int Xqedii_34ayrbfd0brsl(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2vnlmw6wbi9y8, var1);
   }

   public static int Xqedii_2d77kqauxzceu(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1n1gd5n3f3zih;
   }

   public static int Xqedii_b04l01r82a2w(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3ta3md4nkqrwy;
   }

   public static int Xqedii_2zfwg8zmzer91(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_amd7o1soupqa, var1);
   }

   public static long Xqedii_vf5x7ee2i72b(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_lrlqlrwkohst, var2);
   }

   public static long Xqedii_g28b6aytxs56(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_p32nw6kp6ch4;
   }

   public static long Xqedii_3qlw24zzq0fs5(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3sqzms54xpn3s;
   }

   public static long Xqedii_1czyztif8jmqg(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3u5s42vno1hf8, var2);
   }

   public static String Xqedii_3y0j7qsxes8x(String var0) {
      String var1 = Xqedii_daypx2ca1dpu.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ySxymYJvcArXL14stPkwz54VrD+74V+DKbHTOx74CJY=");
            int var3 = 1317195721;

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
            String var9 = Xqedii_daypx2ca1dpu.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2sbs9pbxv1xrs() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1os7xn4plbp5i() {
   }

   private static int Xqedii_28nb719vc2xyn(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1p451aht0gjj0(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
