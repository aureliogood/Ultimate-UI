package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_19v4mxu {
   private static final ConcurrentHashMap<String, String> Xqedii_k3mm3e7s8nzl = new ConcurrentHashMap<>();
   private static volatile int Xqedii_8kf7vtd925ln = -1133058898;
   private static volatile int Xqedii_1704a9dcuizip = 48068442;
   private static volatile int Xqedii_41kfon06y34 = -263230817;
   private static volatile int Xqedii_35yo1wq5swet7 = -6668656;
   private static volatile long Xqedii_26hqb4flznbpw = -1132591536446310453L;
   private static volatile long Xqedii_7bjxikf21ir1 = 967761410850315016L;
   private static volatile long Xqedii_1jgd4bvtbd0v5 = 8721188893164715071L;
   private static volatile long Xqedii_6ixk73tc7zfg = -2399646524353546783L;

   public static int Xqedii_vviqdp0yy8yp(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_8kf7vtd925ln, var1);
   }

   public static int Xqedii_3gzywcvgcplh7(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1704a9dcuizip;
   }

   public static int Xqedii_17s2ld5lforg(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_41kfon06y34;
   }

   public static int Xqedii_8o8jyfz1u6i4(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_35yo1wq5swet7, var1);
   }

   public static long Xqedii_2ld7avupiygj(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_26hqb4flznbpw, var2);
   }

   public static long Xqedii_1k8w50u9db3nx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_7bjxikf21ir1;
   }

   public static long Xqedii_3oemmvw17vrjn(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1jgd4bvtbd0v5;
   }

   public static long Xqedii_1nfuxl2gve1ra(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_6ixk73tc7zfg, var2);
   }

   public static String Xqedii_20zsqaeg0vm48(String var0) {
      String var1 = Xqedii_k3mm3e7s8nzl.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("GLXxXIisy80grLX/NLU7xPAqFQHq+4MD/8yHnylprlY=");
            int var3 = -940826958;

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
            String var9 = Xqedii_k3mm3e7s8nzl.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_26ji8gspnp4qr() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1ml8k0p22n7dr() {
   }

   private static int Xqedii_3ivorhuk0zzes(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_17wulzmkd7hkw(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
