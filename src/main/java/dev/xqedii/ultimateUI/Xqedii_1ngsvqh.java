package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1ngsvqh {
   private static final ConcurrentHashMap<String, String> Xqedii_16zywicpuz8ju = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2y00mb5lrtlrp = 1212154369;
   private static volatile int Xqedii_3cgiutofai6cf = -56924464;
   private static volatile int Xqedii_e5b4fvc8601y = 1103755760;
   private static volatile int Xqedii_1cmhyewhmn02q = 1631477210;
   private static volatile long Xqedii_3u9h6df3so5lt = 2560282402383084372L;
   private static volatile long Xqedii_1fcq02yiam25m = 3196265079877526996L;
   private static volatile long Xqedii_e54muux49boi = -7564910493580313532L;
   private static volatile long Xqedii_2bojs692czvx6 = -8415039778305751527L;

   public static int Xqedii_1wcgb5j8feiy2(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2y00mb5lrtlrp, var1);
   }

   public static int Xqedii_vytu321nwfx8(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3cgiutofai6cf;
   }

   public static int Xqedii_ymjvxxs2erqv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_e5b4fvc8601y;
   }

   public static int Xqedii_2vfjyylx2plh7(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1cmhyewhmn02q, var1);
   }

   public static long Xqedii_mi80jgy204s3(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3u9h6df3so5lt, var2);
   }

   public static long Xqedii_2qa45g9bz9lxg(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1fcq02yiam25m;
   }

   public static long Xqedii_7moitoed2efy(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_e54muux49boi;
   }

   public static long Xqedii_1e7enf1t4vudr(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2bojs692czvx6, var2);
   }

   public static String Xqedii_1nhaxsrgmisp2(String var0) {
      String var1 = Xqedii_16zywicpuz8ju.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("JjI20e9L16Qp5QGzxCy3wbn7jEvNUiCYY+o7cvB3d6U=");
            int var3 = 274936807;

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
            String var9 = Xqedii_16zywicpuz8ju.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2kthpmn14hw94() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_160bh012godnl() {
   }

   private static int Xqedii_3pxs0ozt05ra9(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1j5kblvc9pzbx(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
