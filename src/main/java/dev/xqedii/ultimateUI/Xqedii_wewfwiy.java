package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_wewfwiy {
   private static final ConcurrentHashMap<String, String> Xqedii_2jayabthkpx7h = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2bgvw3qih03cu = -827169269;
   private static volatile int Xqedii_91l4kfd5n6ke = 1227427933;
   private static volatile int Xqedii_1ah6hwsxd9tbt = -1531679451;
   private static volatile int Xqedii_1361madru33gl = 774402021;
   private static volatile long Xqedii_37vzn0eitn8kp = 770984920982001816L;
   private static volatile long Xqedii_1twnho9tbwi0s = 6936784100843994240L;
   private static volatile long Xqedii_3ibqrqcxjouhc = 5587568714806317346L;
   private static volatile long Xqedii_313wexixo4q4z = 2114657557310578392L;

   public static int Xqedii_ctwqyn205krc(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2bgvw3qih03cu, var1);
   }

   public static int Xqedii_1j5p9arcikent(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_91l4kfd5n6ke;
   }

   public static int Xqedii_21qsoqztgwihb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1ah6hwsxd9tbt;
   }

   public static int Xqedii_2v91pyy2hc3pf(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1361madru33gl, var1);
   }

   public static long Xqedii_voull7hgtkpn(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_37vzn0eitn8kp, var2);
   }

   public static long Xqedii_10xu7olr92laq(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1twnho9tbwi0s;
   }

   public static long Xqedii_1mhnvvlzvqj3x(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3ibqrqcxjouhc;
   }

   public static long Xqedii_c07haaw7a5dz(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_313wexixo4q4z, var2);
   }

   public static String Xqedii_30prj8wfox1vo(String var0) {
      String var1 = Xqedii_2jayabthkpx7h.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("xpgdVikMt8k33w7N43JsxUFi53WIK4ylWdD2i1Q3lc0=");
            int var3 = 877534459;

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
            String var9 = Xqedii_2jayabthkpx7h.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_19eysp88n7cz7() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_dn1r01cybfkx() {
   }

   private static int Xqedii_8nwu2zrvkzbg(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2y42qwe6vymd6(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
