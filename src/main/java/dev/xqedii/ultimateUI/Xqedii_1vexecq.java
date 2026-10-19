package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1vexecq {
   private static final ConcurrentHashMap<String, String> Xqedii_2ksmfwy67gp2s = new ConcurrentHashMap<>();
   private static volatile int Xqedii_36n9xacpzmfro = 1138606927;
   private static volatile int Xqedii_2gcht4mauh551 = -1965195102;
   private static volatile int Xqedii_p4l94i1edi32 = -1058987575;
   private static volatile int Xqedii_1veubkfhsjm1j = -393708544;
   private static volatile long Xqedii_277aplrphtsmr = -7473175302286601901L;
   private static volatile long Xqedii_2q7ywobn8g7yi = 8223768038187905941L;
   private static volatile long Xqedii_115uhgx4kyfhu = -211206521699733549L;
   private static volatile long Xqedii_pv7jfxv1c7y8 = -5143495027759292134L;

   public static int Xqedii_3tiyj0hqugkzq(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_36n9xacpzmfro, var1);
   }

   public static int Xqedii_1ladjox5782r3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2gcht4mauh551;
   }

   public static int Xqedii_kik1j7ap7ja0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_p4l94i1edi32;
   }

   public static int Xqedii_2slqwjpv0hm0f(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1veubkfhsjm1j, var1);
   }

   public static long Xqedii_1ilnvus8pee1f(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_277aplrphtsmr, var2);
   }

   public static long Xqedii_27pvak85fi5zs(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2q7ywobn8g7yi;
   }

   public static long Xqedii_1h446ynobcybk(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_115uhgx4kyfhu;
   }

   public static long Xqedii_3uav6xocqpksa(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_pv7jfxv1c7y8, var2);
   }

   public static String Xqedii_2ow587hjypp0y(String var0) {
      String var1 = Xqedii_2ksmfwy67gp2s.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("IT6ssyE091jP1/GDq2Ek0A9TbXMX0GLnXln/fvlP8PI=");
            int var3 = 865448739;

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
            String var9 = Xqedii_2ksmfwy67gp2s.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_swnd5bpggmr4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3auqshslb4es9() {
   }

   private static int Xqedii_3i0teypn8okus(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2x3t908oyfazb(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
