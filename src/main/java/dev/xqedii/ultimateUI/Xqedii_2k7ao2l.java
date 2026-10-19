package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2k7ao2l {
   private static final ConcurrentHashMap<String, String> Xqedii_to9b1ylfwggz = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2jw8r839rfbae = -1378848135;
   private static volatile int Xqedii_mwawyhy2hf87 = -1107975757;
   private static volatile int Xqedii_2532zaoslxy4k = -1492173455;
   private static volatile int Xqedii_2mji3udiztx7e = -693666681;
   private static volatile long Xqedii_31rrzsffobrvt = -1797557348890315115L;
   private static volatile long Xqedii_y55ovdt4y075 = -4672065497571516803L;
   private static volatile long Xqedii_2qeuai9vdzj91 = 8075297164148252394L;
   private static volatile long Xqedii_17fv9bc9m6ki9 = 3774970551711673271L;

   public static int Xqedii_748jgerh0374(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2jw8r839rfbae, var1);
   }

   public static int Xqedii_1w7hctn893qiz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_mwawyhy2hf87;
   }

   public static int Xqedii_30ok2nm2156v5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2532zaoslxy4k;
   }

   public static int Xqedii_177djdl6erwf3(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2mji3udiztx7e, var1);
   }

   public static long Xqedii_1zfbi4mgoqjpr(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_31rrzsffobrvt, var2);
   }

   public static long Xqedii_1nmu1ee4hi183(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_y55ovdt4y075;
   }

   public static long Xqedii_1yynfp8wdwgqr(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2qeuai9vdzj91;
   }

   public static long Xqedii_3ha8ig8bdqxco(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_17fv9bc9m6ki9, var2);
   }

   public static String Xqedii_22jyq4pe3odor(String var0) {
      String var1 = Xqedii_to9b1ylfwggz.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("xkKDHW+E5crn05ug/lpRIyDyMQLz6YamqI4IOZcot0k=");
            int var3 = -2032643261;

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
            String var9 = Xqedii_to9b1ylfwggz.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_n3f95jvoatlj() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1elsczsrruwr6() {
   }

   private static int Xqedii_dr4jc0skw8y0(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3fe37vf3vbzn6(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
