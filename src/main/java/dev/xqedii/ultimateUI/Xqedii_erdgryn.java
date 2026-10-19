package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_erdgryn {
   private static final ConcurrentHashMap<String, String> Xqedii_3gtf9uf91y2h4 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_v8xa439ikdhw = -224074867;
   private static volatile int Xqedii_2dgmwtv5v4obk = 1921273705;
   private static volatile int Xqedii_2plblv6dwecsn = 1027827979;
   private static volatile int Xqedii_2yxiu8gutz18c = 457152608;
   private static volatile long Xqedii_3o25o9ci5hqob = -3789408227622095361L;
   private static volatile long Xqedii_1at6cbxjcb6j7 = 5304222961948065458L;
   private static volatile long Xqedii_2qsbwvaq088uy = -9022782515054435061L;
   private static volatile long Xqedii_4dyceec2sp9l = -3907361772531792325L;

   public static int Xqedii_x5gvlytivyf4(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_v8xa439ikdhw, var1);
   }

   public static int Xqedii_2egk40122q4gj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2dgmwtv5v4obk;
   }

   public static int Xqedii_2e2zsppexvbyd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2plblv6dwecsn;
   }

   public static int Xqedii_2joif5me8xnte(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2yxiu8gutz18c, var1);
   }

   public static long Xqedii_l8mawijrnalc(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3o25o9ci5hqob, var2);
   }

   public static long Xqedii_3tnpwl7cx5j4g(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1at6cbxjcb6j7;
   }

   public static long Xqedii_2b5yqlb6qwkdr(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2qsbwvaq088uy;
   }

   public static long Xqedii_13i7jck3i9nwm(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_4dyceec2sp9l, var2);
   }

   public static String Xqedii_1ibk8jiple36q(String var0) {
      String var1 = Xqedii_3gtf9uf91y2h4.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("nm9N6pGzROnlXMFkzfgPNUy7Q+UDU2+iSOmWpF0RSBw=");
            int var3 = -1491577192;

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
            String var9 = Xqedii_3gtf9uf91y2h4.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_dz08g55chsap() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_5jm48iip2lxp() {
   }

   private static int Xqedii_23i4itq996s0i(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2kquacby829xb(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
