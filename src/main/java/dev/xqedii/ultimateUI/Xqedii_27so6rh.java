package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_27so6rh {
   private static final ConcurrentHashMap<String, String> Xqedii_1ghrq6e5eix8c = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1vzounesmh44h = -1636145042;
   private static volatile int Xqedii_qg1vxwk5qhg5 = -88864551;
   private static volatile int Xqedii_1wx4pdqozti5v = 1188911913;
   private static volatile int Xqedii_31jrku8wdg4no = -2099015134;
   private static volatile long Xqedii_j1qma1cyn14m = -4442449956671198116L;
   private static volatile long Xqedii_rsup7saaim48 = 1732716873977835844L;
   private static volatile long Xqedii_9tqep8aqc28h = -8939989681966395860L;
   private static volatile long Xqedii_3eeog390u3vg2 = 8528540457721440263L;

   public static int Xqedii_xizf0o2o8vhw(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1vzounesmh44h, var1);
   }

   public static int Xqedii_3tg9195vquf51(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_qg1vxwk5qhg5;
   }

   public static int Xqedii_1l7gbr6ugjek6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1wx4pdqozti5v;
   }

   public static int Xqedii_1ht48s9wq59qz(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_31jrku8wdg4no, var1);
   }

   public static long Xqedii_2djv48e3kw485(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_j1qma1cyn14m, var2);
   }

   public static long Xqedii_1sljdm1ej4o2d(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_rsup7saaim48;
   }

   public static long Xqedii_3kjhiobspfxu(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_9tqep8aqc28h;
   }

   public static long Xqedii_3lhonnksen2xt(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3eeog390u3vg2, var2);
   }

   public static String Xqedii_63lzjsvprix4(String var0) {
      String var1 = Xqedii_1ghrq6e5eix8c.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("vCS6NY0zfkKuR/eXCnFuKvPuQnPRBl1aUMLaY6ut2AM=");
            int var3 = -2049265501;

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
            String var9 = Xqedii_1ghrq6e5eix8c.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_35uadwbdf0z7u() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1z2la0nw7334u() {
   }

   private static int Xqedii_1q31wn78w7qx6(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1xviz4idndvf0(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
