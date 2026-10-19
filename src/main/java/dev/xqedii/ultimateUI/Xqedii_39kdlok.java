package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_39kdlok {
   private static final ConcurrentHashMap<String, String> Xqedii_ppjkyvwv5r2s = new ConcurrentHashMap<>();
   private static volatile int Xqedii_5r0589swd9rv = -1140755674;
   private static volatile int Xqedii_ixiismdp059u = -1548179824;
   private static volatile int Xqedii_1xr5omlr1fdtg = -1263122177;
   private static volatile int Xqedii_3de9owajclan2 = 2085509852;
   private static volatile long Xqedii_2mrkpn7pwnp7i = -8863731641206050217L;
   private static volatile long Xqedii_3rib5jvcrnmt6 = 383999748128558294L;
   private static volatile long Xqedii_jq8epa5w6slo = -4226198099878331040L;
   private static volatile long Xqedii_izfhtymp0hym = -1459225312585001854L;

   public static int Xqedii_3pzccztm080ie(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_5r0589swd9rv, var1);
   }

   public static int Xqedii_1c007dtdalu5e(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_ixiismdp059u;
   }

   public static int Xqedii_17w13dq81qraj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1xr5omlr1fdtg;
   }

   public static int Xqedii_3her6yaviroai(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3de9owajclan2, var1);
   }

   public static long Xqedii_2ngntunchcaer(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2mrkpn7pwnp7i, var2);
   }

   public static long Xqedii_y4iz0cbcox9r(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3rib5jvcrnmt6;
   }

   public static long Xqedii_1yi92i7orkezf(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_jq8epa5w6slo;
   }

   public static long Xqedii_2cc20m04tzuol(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_izfhtymp0hym, var2);
   }

   public static String Xqedii_20o2uyseymh23(String var0) {
      String var1 = Xqedii_ppjkyvwv5r2s.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("qjYzbwytvYhp8lcJLOVlKZOsChAITtzl8iMIXf8tCsg=");
            int var3 = 1979681754;

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
            String var9 = Xqedii_ppjkyvwv5r2s.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2rvo324ut1ytn() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2asykyleka4hy() {
   }

   private static int Xqedii_1hdd355fvihv4(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3t1n568bmu336(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
