package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_8fmiqiq {
   private static final ConcurrentHashMap<String, String> Xqedii_39wtxwfyqiesl = new ConcurrentHashMap<>();
   private static volatile int Xqedii_37czy45u8opjj = -759949147;
   private static volatile int Xqedii_23crwbru3wbum = -1145309801;
   private static volatile int Xqedii_2nqvlvgr3y858 = 1863966860;
   private static volatile int Xqedii_37dpjy0e8pl7r = 1139352219;
   private static volatile long Xqedii_a27cfp523pr7 = 9104072845273263111L;
   private static volatile long Xqedii_w7c21a4nws5d = 8563468060617856200L;
   private static volatile long Xqedii_1j9akjaijxs2n = 5261079957439364625L;
   private static volatile long Xqedii_19vslm2b6mlxx = 1616328380934970125L;

   public static int Xqedii_cvp26r6qp1fq(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_37czy45u8opjj, var1);
   }

   public static int Xqedii_x2e1xl4mysig(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_23crwbru3wbum;
   }

   public static int Xqedii_2hw83e38vx5pl(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2nqvlvgr3y858;
   }

   public static int Xqedii_32emloq0fwvyy(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_37dpjy0e8pl7r, var1);
   }

   public static long Xqedii_32j3sg8lfqgse(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_a27cfp523pr7, var2);
   }

   public static long Xqedii_3ijj9ao4osjeh(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_w7c21a4nws5d;
   }

   public static long Xqedii_2ylus8m5ofehq(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1j9akjaijxs2n;
   }

   public static long Xqedii_3h93hne7wly3z(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_19vslm2b6mlxx, var2);
   }

   public static String Xqedii_3cen1pdfrbrn5(String var0) {
      String var1 = Xqedii_39wtxwfyqiesl.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Vm1LBSHzK49GYD/SKv7FfUSjA6LNaVsLSeS6Xftex/Y=");
            int var3 = -2011444475;

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
            String var9 = Xqedii_39wtxwfyqiesl.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1to8cvu35b0tk() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1r8beoq1c0ccg() {
   }

   private static int Xqedii_1to8pckklinji(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3f7ugtvvzl64n(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
