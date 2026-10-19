package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_15pfltm {
   private static final ConcurrentHashMap<String, String> Xqedii_1d4imxd0qjy42 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_zd7x1omcas1e = -1785500855;
   private static volatile int Xqedii_31v3ffmqrxpvi = 741742354;
   private static volatile int Xqedii_244s7vbensm4l = -1659056168;
   private static volatile int Xqedii_of40wz9uwtws = -537760778;
   private static volatile long Xqedii_3ckvscholm1sd = -6452463521970446558L;
   private static volatile long Xqedii_14c7aqwxj62b0 = -1053892829411563008L;
   private static volatile long Xqedii_2tgwfs26y7ytk = -7319258822428669103L;
   private static volatile long Xqedii_14i4r9ltknt0w = -4891618627345560459L;

   public static int Xqedii_249m5gehcttgt(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_zd7x1omcas1e, var1);
   }

   public static int Xqedii_2qux4adtfndxb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_31v3ffmqrxpvi;
   }

   public static int Xqedii_xakhmc5z1jq2(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_244s7vbensm4l;
   }

   public static int Xqedii_2bmbe0y7ixc05(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_of40wz9uwtws, var1);
   }

   public static long Xqedii_1xxgu7c89yio9(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3ckvscholm1sd, var2);
   }

   public static long Xqedii_yzlxj8j65ugk(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_14c7aqwxj62b0;
   }

   public static long Xqedii_3vgitkyhgl382(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2tgwfs26y7ytk;
   }

   public static long Xqedii_23ibkoqdrktyl(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_14i4r9ltknt0w, var2);
   }

   public static String Xqedii_32x853vbmcimx(String var0) {
      String var1 = Xqedii_1d4imxd0qjy42.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ae2a8+Rtc2ymojAr6c9uro29DNHP6hu6U0uh61CBU+s=");
            int var3 = 43831737;

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
            String var9 = Xqedii_1d4imxd0qjy42.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2qm3y3cg2eu6y() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1qtzdezdw6dgf() {
   }

   private static int Xqedii_10g1dken628tk(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1pmb2waahob85(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
