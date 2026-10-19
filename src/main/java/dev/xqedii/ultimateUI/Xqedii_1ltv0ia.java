package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1ltv0ia {
   private static final ConcurrentHashMap<String, String> Xqedii_12jzyf6g808v6 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_23s0tcgqlsjib = 2059242259;
   private static volatile int Xqedii_ahebcxoccxc8 = -894241653;
   private static volatile int Xqedii_1ao5c1lj3u6mj = 1972157079;
   private static volatile int Xqedii_15q1nboojpl10 = -1272627210;
   private static volatile long Xqedii_24n94mtltf87h = 7773675180483366135L;
   private static volatile long Xqedii_bpe5c0nh4ogs = 6157890473895993981L;
   private static volatile long Xqedii_srxwnic2zdw6 = -1463323362720042900L;
   private static volatile long Xqedii_ekr1gt7v9hrl = -7882569615152123420L;

   public static int Xqedii_h1tf52x3jcen(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_23s0tcgqlsjib, var1);
   }

   public static int Xqedii_rhwkqee3zvb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_ahebcxoccxc8;
   }

   public static int Xqedii_1qq33vqprcdwc(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1ao5c1lj3u6mj;
   }

   public static int Xqedii_zmfn2i7mtvj9(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_15q1nboojpl10, var1);
   }

   public static long Xqedii_26i51uvtvlfkx(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_24n94mtltf87h, var2);
   }

   public static long Xqedii_2w5pr9ima2jfl(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_bpe5c0nh4ogs;
   }

   public static long Xqedii_h4h87a8tku9t(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_srxwnic2zdw6;
   }

   public static long Xqedii_oc3kdvudqv5g(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_ekr1gt7v9hrl, var2);
   }

   public static String Xqedii_1f4ixkr3jov2p(String var0) {
      String var1 = Xqedii_12jzyf6g808v6.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("3i9MWGq5+otbboRqvlL/zGd/9PSJKk1X8uQnHd06J6Q=");
            int var3 = -985195245;

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
            String var9 = Xqedii_12jzyf6g808v6.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1757f7gxmthse() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3hnl6fvq143z() {
   }

   private static int Xqedii_3i7vve42gn6t2(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2exr0puuukdqq(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
