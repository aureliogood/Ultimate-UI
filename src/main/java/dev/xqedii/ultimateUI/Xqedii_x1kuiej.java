package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_x1kuiej {
   private static final ConcurrentHashMap<String, String> Xqedii_2lvtsvw514a20 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_pai95j178mzf = -983401405;
   private static volatile int Xqedii_2a2u3yl9roltb = 327859790;
   private static volatile int Xqedii_12n9pytsph5k3 = -1945622976;
   private static volatile int Xqedii_2mwvaxat0t7ah = -2054488791;
   private static volatile long Xqedii_eaxq846ktlp2 = -6663581762746276246L;
   private static volatile long Xqedii_1v1hd1jz9n4re = -2143374321351234708L;
   private static volatile long Xqedii_14x4kfiu2io3b = 6051839415473186745L;
   private static volatile long Xqedii_s9icqh62583m = 6847802838459289097L;

   public static int Xqedii_3gi9jln5bgc2o(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_pai95j178mzf, var1);
   }

   public static int Xqedii_2ts11ydlox4d6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2a2u3yl9roltb;
   }

   public static int Xqedii_e9bgqqxv3cw5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_12n9pytsph5k3;
   }

   public static int Xqedii_37plutzfbkecn(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2mwvaxat0t7ah, var1);
   }

   public static long Xqedii_3qpe5fjv4b33g(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_eaxq846ktlp2, var2);
   }

   public static long Xqedii_1c7n49w8paskc(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1v1hd1jz9n4re;
   }

   public static long Xqedii_1lek79hv2gj54(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_14x4kfiu2io3b;
   }

   public static long Xqedii_1aw772jnt7iq3(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_s9icqh62583m, var2);
   }

   public static String Xqedii_257ehj7e8qw7x(String var0) {
      String var1 = Xqedii_2lvtsvw514a20.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("9wbzPuyifhr4LzcGV7nNjfccynVQhM/q81SH1FU0Ip4=");
            int var3 = 1740727790;

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
            String var9 = Xqedii_2lvtsvw514a20.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1e8ngxmnvjxfq() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2x2khyt2ttvjl() {
   }

   private static int Xqedii_3f64i4lrqm9pw(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1zusypxa71283(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
