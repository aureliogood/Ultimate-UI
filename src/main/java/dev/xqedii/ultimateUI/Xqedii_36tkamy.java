package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_36tkamy {
   private static final ConcurrentHashMap<String, String> Xqedii_1c648my1no8lf = new ConcurrentHashMap<>();
   private static volatile int Xqedii_4ok0t47665m2 = -1134973258;
   private static volatile int Xqedii_3er7qeczptxho = 1660540670;
   private static volatile int Xqedii_1neyltmbeznb = 731269062;
   private static volatile int Xqedii_635o1t5394q3 = 2080083051;
   private static volatile long Xqedii_gliy281zndjc = 2251341958598317125L;
   private static volatile long Xqedii_2ys1yan992xbe = -4649624622337244901L;
   private static volatile long Xqedii_30jz7by93qnme = -8245831693679066310L;
   private static volatile long Xqedii_3tfsx8pe1biy5 = -5906228922314713083L;

   public static int Xqedii_1nt47jj9bobiy(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_4ok0t47665m2, var1);
   }

   public static int Xqedii_2qrdj0ydyjf1k(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3er7qeczptxho;
   }

   public static int Xqedii_vplyqmukj3i3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1neyltmbeznb;
   }

   public static int Xqedii_3l1o07mruyyg7(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_635o1t5394q3, var1);
   }

   public static long Xqedii_2caewnkwy82ik(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_gliy281zndjc, var2);
   }

   public static long Xqedii_2e7hz816sqtd9(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2ys1yan992xbe;
   }

   public static long Xqedii_2nueaacvpu5oo(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_30jz7by93qnme;
   }

   public static long Xqedii_x7fnasdye975(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3tfsx8pe1biy5, var2);
   }

   public static String Xqedii_2l47bwei2wf94(String var0) {
      String var1 = Xqedii_1c648my1no8lf.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("QpX4p8Kw6W/cUiWwyfqElC/IKpAjcC4MISJcEyCpUOE=");
            int var3 = 929126280;

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
            String var9 = Xqedii_1c648my1no8lf.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1mowmi1937gr() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2ej4nnkbl6u6i() {
   }

   private static int Xqedii_m4uxhwuanhu1(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1pggexyn0qo5s(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
