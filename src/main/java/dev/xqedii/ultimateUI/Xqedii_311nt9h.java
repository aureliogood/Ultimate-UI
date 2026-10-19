package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_311nt9h {
   private static final ConcurrentHashMap<String, String> Xqedii_20m5ynoa51j14 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1qpgefoeysel4 = 1868309412;
   private static volatile int Xqedii_1p6dtb74srktt = 1027230558;
   private static volatile int Xqedii_2fu3yqmynfaxn = 935949178;
   private static volatile int Xqedii_r1jflwtcy9xc = -136471932;
   private static volatile long Xqedii_349hdvxeu82km = -4199432749497201517L;
   private static volatile long Xqedii_3fig64k3dk33p = -5406896358360247621L;
   private static volatile long Xqedii_w7gij9st8nh4 = 7799684407779506271L;
   private static volatile long Xqedii_1kywwwk555yf7 = 3017058175881276661L;

   public static int Xqedii_24h1o6q2h0ed5(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1qpgefoeysel4, var1);
   }

   public static int Xqedii_26ki2u7g3vtfe(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1p6dtb74srktt;
   }

   public static int Xqedii_bekp7e82um21(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2fu3yqmynfaxn;
   }

   public static int Xqedii_2ivfl8jansiz8(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_r1jflwtcy9xc, var1);
   }

   public static long Xqedii_kgadb4okshxr(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_349hdvxeu82km, var2);
   }

   public static long Xqedii_1rcv8h3aue0q5(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3fig64k3dk33p;
   }

   public static long Xqedii_1x7x05wb0ugjn(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_w7gij9st8nh4;
   }

   public static long Xqedii_ta9is0s00w9v(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1kywwwk555yf7, var2);
   }

   public static String Xqedii_1d0ad55vo2i5m(String var0) {
      String var1 = Xqedii_20m5ynoa51j14.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("pDnMlkHVtcvoaWnwphh96si/QnwyJcJOF1YFoNe+X+A=");
            int var3 = -263549295;

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
            String var9 = Xqedii_20m5ynoa51j14.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_30mxntnk51gi() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_birh59332sar() {
   }

   private static int Xqedii_2yckmiyugy1g4(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1bro29ibb2a68(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
