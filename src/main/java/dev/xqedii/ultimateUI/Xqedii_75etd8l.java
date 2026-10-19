package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_75etd8l {
   private static final ConcurrentHashMap<String, String> Xqedii_1av4qk5k960ex = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2ao1k0cpj431 = -268043788;
   private static volatile int Xqedii_1juphaqv71xco = 199362034;
   private static volatile int Xqedii_1gzk0ev25y3yx = 744133144;
   private static volatile int Xqedii_1xow2cppp613b = -1859432062;
   private static volatile long Xqedii_1ibkfdwtokx5i = -4395874893805606845L;
   private static volatile long Xqedii_1w3wz1ubsutng = -5271225663714208387L;
   private static volatile long Xqedii_2d7tetyh89ra = 4537152892835957150L;
   private static volatile long Xqedii_2jn790marvpwl = 4799996895807368245L;

   public static int Xqedii_23f5ptl1ppkg(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2ao1k0cpj431, var1);
   }

   public static int Xqedii_23e4eucqckfaq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1juphaqv71xco;
   }

   public static int Xqedii_dff8m4mifwxc(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1gzk0ev25y3yx;
   }

   public static int Xqedii_37pgjmwox4te3(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1xow2cppp613b, var1);
   }

   public static long Xqedii_1fvk0d8qohvms(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1ibkfdwtokx5i, var2);
   }

   public static long Xqedii_1h2foxq4t34oj(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1w3wz1ubsutng;
   }

   public static long Xqedii_1y3u41sde7eo0(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2d7tetyh89ra;
   }

   public static long Xqedii_bilzrvzr3x8e(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2jn790marvpwl, var2);
   }

   public static String Xqedii_z8be8lnflyc8(String var0) {
      String var1 = Xqedii_1av4qk5k960ex.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Lbn7r1uP85WbanMVSZARNQo3jlHSLWqvKC7K8SeRLWk=");
            int var3 = 944218874;

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
            String var9 = Xqedii_1av4qk5k960ex.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2pbmellvmmlbb() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2ieq53ukostdi() {
   }

   private static int Xqedii_1os8okyj76mm4(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_zni0iag65uzx(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
