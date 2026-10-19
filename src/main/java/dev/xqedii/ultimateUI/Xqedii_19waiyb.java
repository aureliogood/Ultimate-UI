package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_19waiyb {
   private static final ConcurrentHashMap<String, String> Xqedii_eiwhugs5o59x = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2ybegzzidozq = -595982409;
   private static volatile int Xqedii_n34lb3ymmaj8 = 1208557078;
   private static volatile int Xqedii_3vzm1mg980rgb = -503987281;
   private static volatile int Xqedii_205rpf6xkoeob = -1100111260;
   private static volatile long Xqedii_1f8zfbyk3pxt2 = -8056164164930386863L;
   private static volatile long Xqedii_2xqyx6ya292hl = -2072118796321847515L;
   private static volatile long Xqedii_1p7bguo15lige = -5442973698420653850L;
   private static volatile long Xqedii_mpr9or57jdol = 9191683235191528792L;

   public static int Xqedii_2nh7tj5y9s9i2(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2ybegzzidozq, var1);
   }

   public static int Xqedii_kx1qo136dpxz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_n34lb3ymmaj8;
   }

   public static int Xqedii_2q2aujub2219t(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3vzm1mg980rgb;
   }

   public static int Xqedii_29jjbcnudavdx(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_205rpf6xkoeob, var1);
   }

   public static long Xqedii_3uirwo2bouc9f(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1f8zfbyk3pxt2, var2);
   }

   public static long Xqedii_2tot6gi1trekl(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2xqyx6ya292hl;
   }

   public static long Xqedii_b8d9lp7o9pvr(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1p7bguo15lige;
   }

   public static long Xqedii_2eyxeqo16nivj(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_mpr9or57jdol, var2);
   }

   public static String Xqedii_35u83bso47ghv(String var0) {
      String var1 = Xqedii_eiwhugs5o59x.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("7+tfurJwEdkb9G8/IyCcn0L30HqJ7Yz6VL20FW8wLmk=");
            int var3 = 1107706444;

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
            String var9 = Xqedii_eiwhugs5o59x.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_jy5ijv1jrmy2() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3x2l3yc72ywu() {
   }

   private static int Xqedii_kb47ulzbvz0g(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2dewo8f8g0bb6(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
