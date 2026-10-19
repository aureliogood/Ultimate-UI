package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1as73k7 {
   private static final ConcurrentHashMap<String, String> Xqedii_c9p0i0s0az35 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_28kjtaxejez26 = 349187188;
   private static volatile int Xqedii_nnmhdimkr32q = 1395475968;
   private static volatile int Xqedii_2u03yhvksfveh = -1282900056;
   private static volatile int Xqedii_2dhipofi49me3 = -769534789;
   private static volatile long Xqedii_3c0y7ljl2p5ml = 2910369332814887155L;
   private static volatile long Xqedii_38i9qjzyzhzn7 = 1018502541303776528L;
   private static volatile long Xqedii_3ratwt2m9pmsf = -1082609211738575339L;
   private static volatile long Xqedii_v1jhg59hwrm = 2939976914930298439L;

   public static int Xqedii_1loegwk964oc9(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_28kjtaxejez26, var1);
   }

   public static int Xqedii_3hkrzn3ojt0q7(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_nnmhdimkr32q;
   }

   public static int Xqedii_1nc45iibavbym(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2u03yhvksfveh;
   }

   public static int Xqedii_6s96e0m7981d(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2dhipofi49me3, var1);
   }

   public static long Xqedii_j39opfilg3vt(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3c0y7ljl2p5ml, var2);
   }

   public static long Xqedii_2sf44gybgk4ii(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_38i9qjzyzhzn7;
   }

   public static long Xqedii_182ii8ztnatmu(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3ratwt2m9pmsf;
   }

   public static long Xqedii_2z8r9m5d6urt6(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_v1jhg59hwrm, var2);
   }

   public static String Xqedii_3sg3wlcdsipy0(String var0) {
      String var1 = Xqedii_c9p0i0s0az35.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("I/cpwJKLa33wKmQIo569uaSbWEflLZy/BmwgDuQwWuo=");
            int var3 = -1635871144;

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
            String var9 = Xqedii_c9p0i0s0az35.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1coobmwrex6t5() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3gwpc8emcmyqi() {
   }

   private static int Xqedii_2ugdzqylpq1m3(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3jujl0qp3vaw3(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
