package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_382spr8 {
   private static final ConcurrentHashMap<String, String> Xqedii_1ipja3l629q6i = new ConcurrentHashMap<>();
   private static volatile int Xqedii_6uha5c77ecnd = 1597598217;
   private static volatile int Xqedii_35xhcr29tflf1 = -1137629339;
   private static volatile int Xqedii_1e6e5sgt81buo = 1790701557;
   private static volatile int Xqedii_27es49xs4nkde = -2014118811;
   private static volatile long Xqedii_2vdl2auki5k1j = 507586204702062514L;
   private static volatile long Xqedii_kjb98lnvj737 = 6220710341596853794L;
   private static volatile long Xqedii_1jes65hi0hlzz = 1007731200202297848L;
   private static volatile long Xqedii_u8ka0ntcp82u = -2905932184554240874L;

   public static int Xqedii_2j8yv3lhgiy7i(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_6uha5c77ecnd, var1);
   }

   public static int Xqedii_1xm3k02qdzgoi(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_35xhcr29tflf1;
   }

   public static int Xqedii_1d6359jfrmo32(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1e6e5sgt81buo;
   }

   public static int Xqedii_92y32znvry9z(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_27es49xs4nkde, var1);
   }

   public static long Xqedii_37cfzjwvzpuk0(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2vdl2auki5k1j, var2);
   }

   public static long Xqedii_2e6i0b5lc5mpr(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_kjb98lnvj737;
   }

   public static long Xqedii_12lhxatl90o3f(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1jes65hi0hlzz;
   }

   public static long Xqedii_3fkhtd07tc7pi(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_u8ka0ntcp82u, var2);
   }

   public static String Xqedii_3sd3arclbx0w9(String var0) {
      String var1 = Xqedii_1ipja3l629q6i.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("mbrMcw0KYbMocEXf5UFHyu0N0wfQt5F/5b4pheAy5vQ=");
            int var3 = -1265640955;

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
            String var9 = Xqedii_1ipja3l629q6i.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_32xui3lu8f8eo() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_33ah8u1ive516() {
   }

   private static int Xqedii_1jp25ks5dhmsp(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2rm2qe1jdqdho(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
