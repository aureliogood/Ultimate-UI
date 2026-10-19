package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_x6q94jb {
   private static final ConcurrentHashMap<String, String> Xqedii_c6i78gsblgec = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1i4aoktifxrx3 = -564733905;
   private static volatile int Xqedii_qcwghlki5t33 = 1224152588;
   private static volatile int Xqedii_rkklmda0hsns = -335988009;
   private static volatile int Xqedii_19q8o9vrs21qg = -2034070218;
   private static volatile long Xqedii_2d4flokb7bcfp = 623318652161075678L;
   private static volatile long Xqedii_59b0ohp67xsd = 7683259610978010492L;
   private static volatile long Xqedii_3m4qozvhc9sny = -8137646877885404L;
   private static volatile long Xqedii_3lnnu3vmcsosr = 2213343641336646021L;

   public static int Xqedii_3kpbc7ap2w9x8(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1i4aoktifxrx3, var1);
   }

   public static int Xqedii_2i5nfay7sed7h(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_qcwghlki5t33;
   }

   public static int Xqedii_3jarjljou4ynb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_rkklmda0hsns;
   }

   public static int Xqedii_1ad6vbbn8p1ix(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_19q8o9vrs21qg, var1);
   }

   public static long Xqedii_1jzenz7qna9s7(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2d4flokb7bcfp, var2);
   }

   public static long Xqedii_2gipka1e5u8hx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_59b0ohp67xsd;
   }

   public static long Xqedii_4d4gz2yfbnsf(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3m4qozvhc9sny;
   }

   public static long Xqedii_3dm0qf2iikjgk(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3lnnu3vmcsosr, var2);
   }

   public static String Xqedii_2qwfvu4gnfzn9(String var0) {
      String var1 = Xqedii_c6i78gsblgec.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("pR/qom2i042kQxxjY+NrOIEC2pnxNyr7ZCr1eFW3BoM=");
            int var3 = 1522100700;

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
            String var9 = Xqedii_c6i78gsblgec.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3fohswiw9pnda() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_137mh93le2qaw() {
   }

   private static int Xqedii_oxiq1li7fsdg(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_19x5wza7c1cw0(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
