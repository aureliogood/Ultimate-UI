package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2j3b4yz {
   private static final ConcurrentHashMap<String, String> Xqedii_124ctz6ymetry = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1t4zvg6gty29o = 1904112600;
   private static volatile int Xqedii_3klktoxx8e2di = 546450587;
   private static volatile int Xqedii_saz7ksvlq5v4 = 116253246;
   private static volatile int Xqedii_233nq99yavjyd = 670544882;
   private static volatile long Xqedii_2he06av3lb4rm = 8554639117855814974L;
   private static volatile long Xqedii_1hil18qi9viug = 1725114871845595773L;
   private static volatile long Xqedii_1j50qqd3qvu3j = 3680548458178750187L;
   private static volatile long Xqedii_3v212e719svqy = 7153175684300277227L;

   public static int Xqedii_qsruujqux2pw(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1t4zvg6gty29o, var1);
   }

   public static int Xqedii_5exqlg7jb2fr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3klktoxx8e2di;
   }

   public static int Xqedii_1mfdrl5h0r4np(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_saz7ksvlq5v4;
   }

   public static int Xqedii_2uggl4atld1dc(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_233nq99yavjyd, var1);
   }

   public static long Xqedii_2go5qbd1l639t(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2he06av3lb4rm, var2);
   }

   public static long Xqedii_2gkxiqnev8pnb(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1hil18qi9viug;
   }

   public static long Xqedii_c96sr5k8o0jj(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1j50qqd3qvu3j;
   }

   public static long Xqedii_2418xixoyw8k4(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3v212e719svqy, var2);
   }

   public static String Xqedii_2s06c5b6ujpcs(String var0) {
      String var1 = Xqedii_124ctz6ymetry.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("edNOFGv/XlBkQoJYQkvZNldh8+q0dUAs/ZC4NwuSruk=");
            int var3 = 1986972577;

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
            String var9 = Xqedii_124ctz6ymetry.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_30w0gxk5yqy3b() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3skqy3q6zbple() {
   }

   private static int Xqedii_14nfvqc63i39s(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2ku0hgv4uzcdk(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
