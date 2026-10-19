package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_hh1t3jt {
   private static final ConcurrentHashMap<String, String> Xqedii_erbsqasdavox = new ConcurrentHashMap<>();
   private static volatile int Xqedii_10vv1llt3ndny = 2050805092;
   private static volatile int Xqedii_d27h1ultlnat = -1939540102;
   private static volatile int Xqedii_21lt8qj7s5g3h = 1212069379;
   private static volatile int Xqedii_1lw9aozuqtzyq = 2116599848;
   private static volatile long Xqedii_33malj5ovefon = 7077836913622863689L;
   private static volatile long Xqedii_1s2sxehmydz5c = 5196877622885780667L;
   private static volatile long Xqedii_1bbuqa5xt5bg4 = -3811475826199063973L;
   private static volatile long Xqedii_dyxuf2teuib = -2710341348431284126L;

   public static int Xqedii_182qcz32dk3av(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_10vv1llt3ndny, var1);
   }

   public static int Xqedii_1r6lbp4zblm4b(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_d27h1ultlnat;
   }

   public static int Xqedii_1by2frulmlaf6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_21lt8qj7s5g3h;
   }

   public static int Xqedii_20dgjsenbino3(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1lw9aozuqtzyq, var1);
   }

   public static long Xqedii_26bb6vr3fxj4y(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_33malj5ovefon, var2);
   }

   public static long Xqedii_2lokc7flqd0o2(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1s2sxehmydz5c;
   }

   public static long Xqedii_3tdod7lbk2je8(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1bbuqa5xt5bg4;
   }

   public static long Xqedii_37wczzubqqnj0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_dyxuf2teuib, var2);
   }

   public static String Xqedii_2s7jjys5aojrn(String var0) {
      String var1 = Xqedii_erbsqasdavox.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("EOKHHeibnSgmLznYLidVKdBRnLtVEtQjSa8yINnIPPs=");
            int var3 = 17376851;

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
            String var9 = Xqedii_erbsqasdavox.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_thvgi7ngem2g() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_91hepro5gza() {
   }

   private static int Xqedii_3c78m99wafd8j(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_9flp5mi069a2(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
