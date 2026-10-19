package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1inaono {
   private static final ConcurrentHashMap<String, String> Xqedii_z8otf2tk1bjx = new ConcurrentHashMap<>();
   private static volatile int Xqedii_6t958qw7mo52 = 1782538194;
   private static volatile int Xqedii_981prlrh3293 = 1975071326;
   private static volatile int Xqedii_36qq30cgrhjai = -419289221;
   private static volatile int Xqedii_xf6nyw6d6fin = -1801841603;
   private static volatile long Xqedii_15zv969dcldeh = 4212985749692139937L;
   private static volatile long Xqedii_1884uv9u550di = 1948239446755064934L;
   private static volatile long Xqedii_a6r1vea6i0ak = -658849355572900697L;
   private static volatile long Xqedii_2o4mt5rvpngwi = 3169092778296880733L;

   public static int Xqedii_sizk9trgf3m8(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_6t958qw7mo52, var1);
   }

   public static int Xqedii_36jb5p7g7kzd6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_981prlrh3293;
   }

   public static int Xqedii_m5utbpv24tsz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_36qq30cgrhjai;
   }

   public static int Xqedii_1331axjh6j5sa(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_xf6nyw6d6fin, var1);
   }

   public static long Xqedii_3thz1topbamu8(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_15zv969dcldeh, var2);
   }

   public static long Xqedii_ocmawjc0ca7g(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1884uv9u550di;
   }

   public static long Xqedii_2dkds7crnvb4d(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_a6r1vea6i0ak;
   }

   public static long Xqedii_1go4wmtid2gdw(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2o4mt5rvpngwi, var2);
   }

   public static String Xqedii_2bazjbgr7gsmg(String var0) {
      String var1 = Xqedii_z8otf2tk1bjx.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("DPqj+Dy8f7rujsylBUUMBNMM+ZME6QJNA25fWtouXCI=");
            int var3 = 1200684706;

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
            String var9 = Xqedii_z8otf2tk1bjx.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_26jmc4wvz90v4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2umv4epu5jj98() {
   }

   private static int Xqedii_1fcjgy02e7qu6(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1cgt0281ld5dh(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
