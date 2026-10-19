package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_pmc8aoi {
   private static final ConcurrentHashMap<String, String> Xqedii_2ybrqjrsh7k9s = new ConcurrentHashMap<>();
   private static volatile int Xqedii_kji8kjp1v9hh = -223389424;
   private static volatile int Xqedii_pl2sh4l2n0bo = 211477355;
   private static volatile int Xqedii_1ep5nwgcsyi0h = -1970291195;
   private static volatile int Xqedii_39xpjmd4w9dlx = 1187257252;
   private static volatile long Xqedii_ongel0xcneab = -2779811122962402501L;
   private static volatile long Xqedii_36mb6ajspm46z = 258491880557143045L;
   private static volatile long Xqedii_2ahmpqn55l8wy = 4024736902458905396L;
   private static volatile long Xqedii_2qlaijlzgg6t4 = -5680343374078790092L;

   public static int Xqedii_1914lzc9892bd(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_kji8kjp1v9hh, var1);
   }

   public static int Xqedii_57t50raqp7pd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_pl2sh4l2n0bo;
   }

   public static int Xqedii_3thqdcjs34b8k(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1ep5nwgcsyi0h;
   }

   public static int Xqedii_34d530ey9mt4(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_39xpjmd4w9dlx, var1);
   }

   public static long Xqedii_255f7a4a88uzz(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_ongel0xcneab, var2);
   }

   public static long Xqedii_2zka5dx0veka1(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_36mb6ajspm46z;
   }

   public static long Xqedii_4aer9no8g676(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2ahmpqn55l8wy;
   }

   public static long Xqedii_26ucpb96iae61(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2qlaijlzgg6t4, var2);
   }

   public static String Xqedii_1n3w8jv5x2qfq(String var0) {
      String var1 = Xqedii_2ybrqjrsh7k9s.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("4bneLFACPNtpmHOl9n0nQWlAodxynFPxgPUQl8Hbj9Y=");
            int var3 = -1591487833;

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
            String var9 = Xqedii_2ybrqjrsh7k9s.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_23e539pt63xu5() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2kzyirfw68llx() {
   }

   private static int Xqedii_2z1hnazp8s17n(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2m8aatpfoj9gg(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
