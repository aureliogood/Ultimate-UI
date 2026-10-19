package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2ci3yhi {
   private static final ConcurrentHashMap<String, String> Xqedii_p46z9p1lnp93 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_98lxfww1tvie = 825203843;
   private static volatile int Xqedii_1impwp6ipbiyq = -556039592;
   private static volatile int Xqedii_mwjz2ut4hszg = 1320710409;
   private static volatile int Xqedii_1k3bcctywoppa = -808797007;
   private static volatile long Xqedii_3hreegxt7l2my = -853392396744374337L;
   private static volatile long Xqedii_1j1po5j7i2tc8 = -4449888165722227804L;
   private static volatile long Xqedii_1budnwwrekxp2 = 5233461086640071450L;
   private static volatile long Xqedii_13mi4rrl8g1zu = 1060174131782750538L;

   public static int Xqedii_2ocvsb4q51jbf(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_98lxfww1tvie, var1);
   }

   public static int Xqedii_2yowd8wvhue5m(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1impwp6ipbiyq;
   }

   public static int Xqedii_pw4qxh0ajkm8(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_mwjz2ut4hszg;
   }

   public static int Xqedii_1i8zrk7qq0dae(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1k3bcctywoppa, var1);
   }

   public static long Xqedii_18goqj1akom2r(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3hreegxt7l2my, var2);
   }

   public static long Xqedii_389iwzdko0ryi(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1j1po5j7i2tc8;
   }

   public static long Xqedii_2kwlcpv71c6rk(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1budnwwrekxp2;
   }

   public static long Xqedii_otifdfsvt4i1(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_13mi4rrl8g1zu, var2);
   }

   public static String Xqedii_33qruxpiusioj(String var0) {
      String var1 = Xqedii_p46z9p1lnp93.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("B3aVcLkPYY6EskVbY1dbhqzzF/0d89CTmUOJNz+QxFw=");
            int var3 = 759547116;

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
            String var9 = Xqedii_p46z9p1lnp93.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_yharcmo6z4d4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2ekn95eptuhcz() {
   }

   private static int Xqedii_2mgpuxbigq0(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1fdds0z9lcysv(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
