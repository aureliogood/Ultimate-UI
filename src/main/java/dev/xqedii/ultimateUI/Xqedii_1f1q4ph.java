package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1f1q4ph {
   private static final ConcurrentHashMap<String, String> Xqedii_vgsq1lkza4ds = new ConcurrentHashMap<>();
   private static volatile int Xqedii_33v36bfxye4bw = -973209054;
   private static volatile int Xqedii_3c6fd483u0wy2 = 1704681825;
   private static volatile int Xqedii_326xdejdfpvi7 = -2058991481;
   private static volatile int Xqedii_bv88n603nbho = -19436552;
   private static volatile long Xqedii_2apk082cyjgvp = 2060492761474919619L;
   private static volatile long Xqedii_3l1brkt81rtof = -1212790337740347102L;
   private static volatile long Xqedii_15o9o3tq4we1j = 9002000274139167916L;
   private static volatile long Xqedii_26gkne4v8xy1c = 6252969954560028414L;

   public static int Xqedii_8kvf7vx3ct30(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_33v36bfxye4bw, var1);
   }

   public static int Xqedii_2c5vgcnkfh9w0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3c6fd483u0wy2;
   }

   public static int Xqedii_c8uf3e8v91q3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_326xdejdfpvi7;
   }

   public static int Xqedii_s7xwjojrarpg(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_bv88n603nbho, var1);
   }

   public static long Xqedii_3hujlmhn1ja1v(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2apk082cyjgvp, var2);
   }

   public static long Xqedii_13wtaeia6pumj(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3l1brkt81rtof;
   }

   public static long Xqedii_1rz4kun1ifiwo(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_15o9o3tq4we1j;
   }

   public static long Xqedii_2uj09sne8e22n(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_26gkne4v8xy1c, var2);
   }

   public static String Xqedii_axpj5w52k5ux(String var0) {
      String var1 = Xqedii_vgsq1lkza4ds.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("oCAX3amsQ4RZsy9DnAXS64xL3uJkQ54TkLzRtkJ0rPM=");
            int var3 = 837185401;

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
            String var9 = Xqedii_vgsq1lkza4ds.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_13mijs760cgme() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_vr1hj330aeu6() {
   }

   private static int Xqedii_3ljmi8suyjk4k(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1y4e17yv3anpx(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
