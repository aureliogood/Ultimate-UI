package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_gf40zrf {
   private static final ConcurrentHashMap<String, String> Xqedii_3ocmf4xiwm1ia = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1ted1871cmq5w = -1337326694;
   private static volatile int Xqedii_3a1y9ijg39zmv = -1530868977;
   private static volatile int Xqedii_26trgskunxnko = -60670668;
   private static volatile int Xqedii_2bzjfzo85ynut = -64078885;
   private static volatile long Xqedii_1h3ipt8jlaj8h = 6736402970074345658L;
   private static volatile long Xqedii_23wgek0u9sbm9 = 7142646416326418204L;
   private static volatile long Xqedii_24g3n59xldz2d = -3352667907260089495L;
   private static volatile long Xqedii_1e7y80zmhi0lc = -272829256847684925L;

   public static int Xqedii_3i8nd64hzket7(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1ted1871cmq5w, var1);
   }

   public static int Xqedii_3gew6s1zw119g(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3a1y9ijg39zmv;
   }

   public static int Xqedii_170rl4ak8wa34(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_26trgskunxnko;
   }

   public static int Xqedii_6pm7va7kszxu(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2bzjfzo85ynut, var1);
   }

   public static long Xqedii_2wnc02i40s38e(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1h3ipt8jlaj8h, var2);
   }

   public static long Xqedii_2xeax1qpceykh(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_23wgek0u9sbm9;
   }

   public static long Xqedii_13rwothyadyac(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_24g3n59xldz2d;
   }

   public static long Xqedii_oj2jen12ltfl(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1e7y80zmhi0lc, var2);
   }

   public static String Xqedii_3n7tuxabm7hug(String var0) {
      String var1 = Xqedii_3ocmf4xiwm1ia.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("3BYj3bDn1kHbgFVTGI8YpfxLyJ4j/RjzsKTrWPxx1O4=");
            int var3 = -2058272161;

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
            String var9 = Xqedii_3ocmf4xiwm1ia.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_a3hqe47x20g9() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3a4rivoet2myj() {
   }

   private static int Xqedii_3bwdkah1fbp2q(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1hrcelcgmor72(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
