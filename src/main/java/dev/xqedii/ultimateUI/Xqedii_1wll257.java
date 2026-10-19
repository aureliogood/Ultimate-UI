package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1wll257 {
   private static final ConcurrentHashMap<String, String> Xqedii_2r09ganjicwxn = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3q196c5i2105y = -108935826;
   private static volatile int Xqedii_fkwmxoptikeb = 2063976049;
   private static volatile int Xqedii_xcet9lw09ntm = 1896844632;
   private static volatile int Xqedii_3aotrphdrdlau = -419193861;
   private static volatile long Xqedii_1rdzt5ne7t94 = -8378017783016217904L;
   private static volatile long Xqedii_29zfvubyosxrh = 6738476403509157729L;
   private static volatile long Xqedii_vco55hqduqj8 = 5355544795207355966L;
   private static volatile long Xqedii_ieise0z6v8gm = 5146780684112117187L;

   public static int Xqedii_34w5zwg3u0kib(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3q196c5i2105y, var1);
   }

   public static int Xqedii_1j6f11hjkf8jt(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_fkwmxoptikeb;
   }

   public static int Xqedii_27wk02sre0216(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_xcet9lw09ntm;
   }

   public static int Xqedii_1vitaa2a4aly2(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3aotrphdrdlau, var1);
   }

   public static long Xqedii_235f5obrywt1f(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1rdzt5ne7t94, var2);
   }

   public static long Xqedii_1sixb6ios8fhc(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_29zfvubyosxrh;
   }

   public static long Xqedii_1worluwq9n6nn(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_vco55hqduqj8;
   }

   public static long Xqedii_18lzytki4culb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_ieise0z6v8gm, var2);
   }

   public static String Xqedii_iong8pxmca0x(String var0) {
      String var1 = Xqedii_2r09ganjicwxn.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("e1/D5HiHlC3UPIg2xoSMhuQJmbPM8U+Liy3WDzzbyik=");
            int var3 = 1384459219;

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
            String var9 = Xqedii_2r09ganjicwxn.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_28fdmlsymij23() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2ilkex67wt4l0() {
   }

   private static int Xqedii_29gvf6o0wm9ji(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_212n7smqwa6i4(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
