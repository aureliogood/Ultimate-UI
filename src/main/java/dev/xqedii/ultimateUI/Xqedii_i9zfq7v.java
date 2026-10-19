package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_i9zfq7v {
   private static final ConcurrentHashMap<String, String> Xqedii_13gfzgxztgh8m = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1jz5zfi9u5w65 = -216537526;
   private static volatile int Xqedii_3g2zz2ibyli1r = -1120845570;
   private static volatile int Xqedii_15v9qsmrhl518 = 1333925618;
   private static volatile int Xqedii_2zhwxkwro4l8h = -1814759375;
   private static volatile long Xqedii_682cvozpl6wu = -5435567026938582981L;
   private static volatile long Xqedii_1pk3rwudvqf0p = -1650680577217173941L;
   private static volatile long Xqedii_2ol5sxthrdoa2 = -1299976426067334044L;
   private static volatile long Xqedii_dypxa48pt8ax = 5228769950973026917L;

   public static int Xqedii_3vmu0z2f13p8s(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1jz5zfi9u5w65, var1);
   }

   public static int Xqedii_156wt8a6bux88(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3g2zz2ibyli1r;
   }

   public static int Xqedii_f2pl35tgp96l(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_15v9qsmrhl518;
   }

   public static int Xqedii_2ugldmtwfz2df(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2zhwxkwro4l8h, var1);
   }

   public static long Xqedii_2chj5bls35xgt(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_682cvozpl6wu, var2);
   }

   public static long Xqedii_14525afbu8pf6(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1pk3rwudvqf0p;
   }

   public static long Xqedii_xcbsak74vwha(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2ol5sxthrdoa2;
   }

   public static long Xqedii_134rpwi78y4qf(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_dypxa48pt8ax, var2);
   }

   public static String Xqedii_1uocowrann8i1(String var0) {
      String var1 = Xqedii_13gfzgxztgh8m.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("dzcUo825YfluANHRTuQHuIKsHy/sldUqUX2PhJWzo2Y=");
            int var3 = -2102846702;

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
            String var9 = Xqedii_13gfzgxztgh8m.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_12vqe5z6gepoa() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1ricdyj2w9w6() {
   }

   private static int Xqedii_360iwzxc5sly(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3oz2n8qbc8219(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
