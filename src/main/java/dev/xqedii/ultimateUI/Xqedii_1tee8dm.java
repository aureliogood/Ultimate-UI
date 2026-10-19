package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1tee8dm {
   private static final ConcurrentHashMap<String, String> Xqedii_2u1xppu0k9fi8 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2n54l3uduztkn = 1056544056;
   private static volatile int Xqedii_37pt1a9mbtqoi = 304222234;
   private static volatile int Xqedii_3hc94vfvyr3k5 = -1522861031;
   private static volatile int Xqedii_1tbz254yqdwyo = 1581189786;
   private static volatile long Xqedii_nfdk87rd3joc = 5156919707594171324L;
   private static volatile long Xqedii_353efyu09rtx8 = -8877372216175622622L;
   private static volatile long Xqedii_2pv2lywm4h9y8 = 6541251524611044165L;
   private static volatile long Xqedii_374l5wl3zbk6w = -3434337637988067393L;

   public static int Xqedii_3sr8plfy02nin(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2n54l3uduztkn, var1);
   }

   public static int Xqedii_2f1jgld0hv7mt(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_37pt1a9mbtqoi;
   }

   public static int Xqedii_9kfpwkuqa98z(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3hc94vfvyr3k5;
   }

   public static int Xqedii_fo0yiqsnv3m4(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1tbz254yqdwyo, var1);
   }

   public static long Xqedii_btcfr5d83wqa(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_nfdk87rd3joc, var2);
   }

   public static long Xqedii_37412zpemsphd(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_353efyu09rtx8;
   }

   public static long Xqedii_3qk8rcwj816i3(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2pv2lywm4h9y8;
   }

   public static long Xqedii_3cqr8rc1swppv(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_374l5wl3zbk6w, var2);
   }

   public static String Xqedii_imcfkyuodidt(String var0) {
      String var1 = Xqedii_2u1xppu0k9fi8.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("kTO3Si987Vvv1tmQ4jD0NWWs8DqTsQkv8zmZBR8p3lE=");
            int var3 = 583105708;

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
            String var9 = Xqedii_2u1xppu0k9fi8.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_a6zqrkwmk7bt() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3m5l5w279kl8i() {
   }

   private static int Xqedii_1du8ltwweccg6(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2o4daskzdpz1b(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
