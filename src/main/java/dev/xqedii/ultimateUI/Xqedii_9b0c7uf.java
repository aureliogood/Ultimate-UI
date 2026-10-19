package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_9b0c7uf {
   private static final ConcurrentHashMap<String, String> Xqedii_13g0xgugyi62g = new ConcurrentHashMap<>();
   private static volatile int Xqedii_cpg89bpzruw1 = -15160504;
   private static volatile int Xqedii_58x7fqwm5no = -1334063938;
   private static volatile int Xqedii_1bg4e8azf0ov7 = 1276397837;
   private static volatile int Xqedii_8r4f1glfx6r1 = -1335778151;
   private static volatile long Xqedii_3q9h3d9eoavol = -1784941442744092549L;
   private static volatile long Xqedii_3da00oizml91d = -8061402414577706654L;
   private static volatile long Xqedii_2rwmxaukbkpku = 6854986971963419372L;
   private static volatile long Xqedii_2l52yfzrd1l8j = -6407664678123077720L;

   public static int Xqedii_3rzivhsoof8nd(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_cpg89bpzruw1, var1);
   }

   public static int Xqedii_1y6g7735lot2u(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_58x7fqwm5no;
   }

   public static int Xqedii_3dwwt11dmnjm9(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1bg4e8azf0ov7;
   }

   public static int Xqedii_3ab21nqahmuzo(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_8r4f1glfx6r1, var1);
   }

   public static long Xqedii_1bdzcn0t3x2iu(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3q9h3d9eoavol, var2);
   }

   public static long Xqedii_3ga6rdsn4b2b2(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3da00oizml91d;
   }

   public static long Xqedii_38lhitlzkrn60(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2rwmxaukbkpku;
   }

   public static long Xqedii_3hypwyzg9f2q8(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2l52yfzrd1l8j, var2);
   }

   public static String Xqedii_25ggc5kf08bci(String var0) {
      String var1 = Xqedii_13g0xgugyi62g.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("736M461gCQDR79VItFG/ad+2uGaK+WRLJV2PTUsJTIA=");
            int var3 = -418120318;

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
            String var9 = Xqedii_13g0xgugyi62g.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3qkuc79pulwuf() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1hybdya0ia7qj() {
   }

   private static int Xqedii_lfh3euatw8vv(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2446nkv5429x7(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
