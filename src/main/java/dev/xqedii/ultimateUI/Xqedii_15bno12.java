package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_15bno12 {
   private static final ConcurrentHashMap<String, String> Xqedii_167mklixsu24o = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3lddfd8wlqst5 = 1674442377;
   private static volatile int Xqedii_2efxhjwv6e9mu = 46526662;
   private static volatile int Xqedii_1mjo2vjmlxe6v = 1307052262;
   private static volatile int Xqedii_d5emhh8dnpfp = 415711106;
   private static volatile long Xqedii_2e4ylk2nr96sa = 9182770911384395853L;
   private static volatile long Xqedii_xtp1c8g2us6r = 6566236180221734624L;
   private static volatile long Xqedii_1tf4rllbjp13 = -3868158297294171190L;
   private static volatile long Xqedii_lb1gmjlv0ynn = 8185240577087186262L;

   public static int Xqedii_2lv87xylmdlqj(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3lddfd8wlqst5, var1);
   }

   public static int Xqedii_3lwvmiqtn1k7g(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2efxhjwv6e9mu;
   }

   public static int Xqedii_16lutgode19h0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1mjo2vjmlxe6v;
   }

   public static int Xqedii_4dyk7s1acm9h(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_d5emhh8dnpfp, var1);
   }

   public static long Xqedii_3iagd2cp492rx(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2e4ylk2nr96sa, var2);
   }

   public static long Xqedii_18a23n0xf8hek(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_xtp1c8g2us6r;
   }

   public static long Xqedii_2z36jkx7lq92v(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1tf4rllbjp13;
   }

   public static long Xqedii_1lc0kyrj4smyp(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_lb1gmjlv0ynn, var2);
   }

   public static String Xqedii_2ideyc20wnzny(String var0) {
      String var1 = Xqedii_167mklixsu24o.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("oEOEKW454SPHmJqLd96V1O9hyzqPV57/pEw4peKKzAo=");
            int var3 = 1613409653;

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
            String var9 = Xqedii_167mklixsu24o.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1w3o56zke03z2() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1xxbh93x0a92v() {
   }

   private static int Xqedii_104d4xpwdt198(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_26vbuv543f0aj(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
