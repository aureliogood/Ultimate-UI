package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_7q5l4nt {
   private static final ConcurrentHashMap<String, String> Xqedii_2cew1jm2kz1o2 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1uvm3wgvywboa = 1169076620;
   private static volatile int Xqedii_30eladbbjg40h = -1100318032;
   private static volatile int Xqedii_2g8zzt8rwuoon = 2114617214;
   private static volatile int Xqedii_3t64jovw6s11p = 1363508861;
   private static volatile long Xqedii_12vwc7bpj6xx8 = -9004247036575700433L;
   private static volatile long Xqedii_20woohpd3bf2e = -5113708701903072995L;
   private static volatile long Xqedii_1d4bfwownheaf = -5828482488001727949L;
   private static volatile long Xqedii_39e721a85e2ql = -6824957911395547582L;

   public static int Xqedii_ks3nc41dsn6q(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1uvm3wgvywboa, var1);
   }

   public static int Xqedii_mhrnam3yf82v(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_30eladbbjg40h;
   }

   public static int Xqedii_fgx4u9p369dg(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2g8zzt8rwuoon;
   }

   public static int Xqedii_1f197xxzobjv1(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3t64jovw6s11p, var1);
   }

   public static long Xqedii_2a18qapwj3f1m(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_12vwc7bpj6xx8, var2);
   }

   public static long Xqedii_3te5em37hvhmg(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_20woohpd3bf2e;
   }

   public static long Xqedii_6hobr8b0qtan(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1d4bfwownheaf;
   }

   public static long Xqedii_uoep3qsikdbr(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_39e721a85e2ql, var2);
   }

   public static String Xqedii_jm156fuutc39(String var0) {
      String var1 = Xqedii_2cew1jm2kz1o2.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("hJBz1isKaZ1A+7D32C6jsKb59ABX2GsDjzIfMhLWLPA=");
            int var3 = -2069754906;

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
            String var9 = Xqedii_2cew1jm2kz1o2.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1glwxiq1622hz() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_28n4wyu0cxwek() {
   }

   private static int Xqedii_16dj3lp5t0c4h(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_iteurb6klkae(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
