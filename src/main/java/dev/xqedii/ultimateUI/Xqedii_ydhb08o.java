package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_ydhb08o {
   private static final ConcurrentHashMap<String, String> Xqedii_pjvqf45np2yw = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3ibrk4tgsusi = -133617887;
   private static volatile int Xqedii_3bstdft28xt91 = 1726256654;
   private static volatile int Xqedii_b8comdu984o2 = 1912257465;
   private static volatile int Xqedii_qumy6szpxl2s = 407750312;
   private static volatile long Xqedii_27bmgnw5z48z7 = 3321644123919250701L;
   private static volatile long Xqedii_1jzggm1nx6329 = 7809942241627538447L;
   private static volatile long Xqedii_2iztwqy3dij6a = 1790188545949124983L;
   private static volatile long Xqedii_iaaudzq2cmyh = -6374295977982201984L;

   public static int Xqedii_2oq9g17yblp49(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3ibrk4tgsusi, var1);
   }

   public static int Xqedii_3oq0nbhxtekzg(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3bstdft28xt91;
   }

   public static int Xqedii_vn24e5ac54ld(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_b8comdu984o2;
   }

   public static int Xqedii_2gweygwiyt6co(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_qumy6szpxl2s, var1);
   }

   public static long Xqedii_2mzahignphcnb(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_27bmgnw5z48z7, var2);
   }

   public static long Xqedii_1oob63eyb55b0(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1jzggm1nx6329;
   }

   public static long Xqedii_2c0qi86imbsky(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2iztwqy3dij6a;
   }

   public static long Xqedii_2z5uiwjhj5236(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_iaaudzq2cmyh, var2);
   }

   public static String Xqedii_3g7y7sh7nil7z(String var0) {
      String var1 = Xqedii_pjvqf45np2yw.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("YwvTL+9AeXKe2kbQDPyW0Dic1y8Nsa3GXxsISO7ufjQ=");
            int var3 = 2025643416;

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
            String var9 = Xqedii_pjvqf45np2yw.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_gvx3fbjan9nt() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_29o3rvjry5r14() {
   }

   private static int Xqedii_3ge79bxkpzsch(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_ql6mxtw3srhh(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
