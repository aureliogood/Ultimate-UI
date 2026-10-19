package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_260tehb {
   private static final ConcurrentHashMap<String, String> Xqedii_13x54hbmqr2ku = new ConcurrentHashMap<>();
   private static volatile int Xqedii_10gt7faupt3p3 = -1007170221;
   private static volatile int Xqedii_w8jc6gyuotu6 = 353750140;
   private static volatile int Xqedii_1mp64rxx2xp55 = 1481475095;
   private static volatile int Xqedii_28qm8nacebowf = 1467247841;
   private static volatile long Xqedii_agxwb5gu20zp = -2477287480473275481L;
   private static volatile long Xqedii_2j7lywejqlmty = -6851589876987906283L;
   private static volatile long Xqedii_2b4locp0nmtmv = -4844995877043051215L;
   private static volatile long Xqedii_186tnvxw692hc = 68979512345997033L;

   public static int Xqedii_257oluj6i1j6i(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_10gt7faupt3p3, var1);
   }

   public static int Xqedii_2e1i88ulzzbuk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_w8jc6gyuotu6;
   }

   public static int Xqedii_efpiqnt1scp6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1mp64rxx2xp55;
   }

   public static int Xqedii_258ww4nfxmxxw(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_28qm8nacebowf, var1);
   }

   public static long Xqedii_17qqq8zrwnjiy(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_agxwb5gu20zp, var2);
   }

   public static long Xqedii_1j0e4yw6stug(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2j7lywejqlmty;
   }

   public static long Xqedii_u9ao1gj2a92(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2b4locp0nmtmv;
   }

   public static long Xqedii_3kka651c9ej3u(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_186tnvxw692hc, var2);
   }

   public static String Xqedii_wixg1knmyxft(String var0) {
      String var1 = Xqedii_13x54hbmqr2ku.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("5PlWM2rW9TGLqraJ5xgtzjkPUZhg1YLECTzokTipo9Y=");
            int var3 = -1211359512;

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
            String var9 = Xqedii_13x54hbmqr2ku.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2q8oghwb2do9n() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2xrxkmitubc0f() {
   }

   private static int Xqedii_1p7vxgp9r0roh(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1cjw8171xzj8v(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
