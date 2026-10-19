package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3qt1z6k {
   private static final ConcurrentHashMap<String, String> Xqedii_7tac0bmnnz8a = new ConcurrentHashMap<>();
   private static volatile int Xqedii_24sy4fa5rl5l6 = -424917779;
   private static volatile int Xqedii_3q21ivtssulpq = 1739829111;
   private static volatile int Xqedii_fdd8fnmf4q5h = 278224544;
   private static volatile int Xqedii_37nzdxxkus0vv = 169398915;
   private static volatile long Xqedii_vklgmrq0x2ot = -5420533953573747902L;
   private static volatile long Xqedii_2mel33nycto2t = -7557377533787558300L;
   private static volatile long Xqedii_6d4ibil910k0 = -4139048962926204035L;
   private static volatile long Xqedii_3uzcngdjymlcv = -4798302993999893481L;

   public static int Xqedii_2z8imw0subq7o(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_24sy4fa5rl5l6, var1);
   }

   public static int Xqedii_1baisfwz1mx89(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3q21ivtssulpq;
   }

   public static int Xqedii_2zm2zox4m1t9s(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_fdd8fnmf4q5h;
   }

   public static int Xqedii_36bd1b1jdjydu(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_37nzdxxkus0vv, var1);
   }

   public static long Xqedii_2mjj59kqoiu32(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_vklgmrq0x2ot, var2);
   }

   public static long Xqedii_3vkadml17m9sx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2mel33nycto2t;
   }

   public static long Xqedii_28yu7n1rpug0k(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_6d4ibil910k0;
   }

   public static long Xqedii_8gsltcakkzd2(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3uzcngdjymlcv, var2);
   }

   public static String Xqedii_23iz0pzwqoxke(String var0) {
      String var1 = Xqedii_7tac0bmnnz8a.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("z8NYbJg6cc1oS3+NCyI38I2e6faqDuXl3/ZFivJFOHw=");
            int var3 = 540936698;

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
            String var9 = Xqedii_7tac0bmnnz8a.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1j0uj60gneohk() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_15q0frxh0uput() {
   }

   private static int Xqedii_35e6spflti53w(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_ngqonltwsbww(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
