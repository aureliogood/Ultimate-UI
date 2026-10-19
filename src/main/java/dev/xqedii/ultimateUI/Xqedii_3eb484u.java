package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3eb484u {
   private static final ConcurrentHashMap<String, String> Xqedii_151pg06pshpcm = new ConcurrentHashMap<>();
   private static volatile int Xqedii_28v1axz8309em = 1527412244;
   private static volatile int Xqedii_3egn3i7yjftp6 = -275936441;
   private static volatile int Xqedii_2aq59uwzqn1ux = 574133312;
   private static volatile int Xqedii_serff76y5wib = -1240274638;
   private static volatile long Xqedii_3itaipe4dj5fe = -7182524678028683631L;
   private static volatile long Xqedii_n8riyyw499aw = -4970845215223961734L;
   private static volatile long Xqedii_3pfhw4vkwc0db = -959180637475917034L;
   private static volatile long Xqedii_1qa8hov15p8u7 = -4056859422403603498L;

   public static int Xqedii_2q11emos1bdue(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_28v1axz8309em, var1);
   }

   public static int Xqedii_3jm36cek4tgkk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3egn3i7yjftp6;
   }

   public static int Xqedii_147orvu4bgzt5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2aq59uwzqn1ux;
   }

   public static int Xqedii_1xl7umneqpl08(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_serff76y5wib, var1);
   }

   public static long Xqedii_ipcy7hqwn48w(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3itaipe4dj5fe, var2);
   }

   public static long Xqedii_m0fw9utw9xfp(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_n8riyyw499aw;
   }

   public static long Xqedii_3dhoa7onqvyot(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3pfhw4vkwc0db;
   }

   public static long Xqedii_22esxt33rv3kb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1qa8hov15p8u7, var2);
   }

   public static String Xqedii_zav2l3hwql4b(String var0) {
      String var1 = Xqedii_151pg06pshpcm.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("6UXk90i/RhIofxVGuFET3q90cgRrdxd3OtEq24euxmo=");
            int var3 = -476596958;

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
            String var9 = Xqedii_151pg06pshpcm.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2g64kx28xu0wh() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2kowpsdmu75gq() {
   }

   private static int Xqedii_2w945rzv7e12x(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1ysp2r49dgovf(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
