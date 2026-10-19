package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3fzcruq {
   private static final ConcurrentHashMap<String, String> Xqedii_2lx5j0s5p18jp = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3hw23up9cpenf = -2113460905;
   private static volatile int Xqedii_1lldxw7ljo0ec = 901364557;
   private static volatile int Xqedii_29bcm8qijj4zx = 1554165645;
   private static volatile int Xqedii_148f333d3cv50 = 172586262;
   private static volatile long Xqedii_387ce1gcdojec = 1067443309591156807L;
   private static volatile long Xqedii_1icaix8gga1pg = -5518698173608854221L;
   private static volatile long Xqedii_1s290fj9lsi8j = -8651694276661933837L;
   private static volatile long Xqedii_34amfjqccr9nx = -4652977471949825696L;

   public static int Xqedii_1u9vewkp2ry9b(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3hw23up9cpenf, var1);
   }

   public static int Xqedii_3tx8zyxs03ro8(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1lldxw7ljo0ec;
   }

   public static int Xqedii_2rn6x3mg1gf2s(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_29bcm8qijj4zx;
   }

   public static int Xqedii_2wd1g9vhv7tmt(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_148f333d3cv50, var1);
   }

   public static long Xqedii_16klg37sik1or(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_387ce1gcdojec, var2);
   }

   public static long Xqedii_346y5rjs942tn(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1icaix8gga1pg;
   }

   public static long Xqedii_1ezagcbu4c6bs(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1s290fj9lsi8j;
   }

   public static long Xqedii_3q79j4f56l8vf(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_34amfjqccr9nx, var2);
   }

   public static String Xqedii_1j7cxw8ukpyeo(String var0) {
      String var1 = Xqedii_2lx5j0s5p18jp.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("lz/uInY1Pkr1cm0y8Lt8o3a2TDEvtoTJNMCaIajoTVQ=");
            int var3 = 1125303676;

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
            String var9 = Xqedii_2lx5j0s5p18jp.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_38yf30ebcewic() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_5x9a69cud86n() {
   }

   private static int Xqedii_3eseow26llrq9(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2lt9gg0j6xvr(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
