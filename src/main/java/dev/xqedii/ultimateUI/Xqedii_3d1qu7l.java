package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3d1qu7l {
   private static final ConcurrentHashMap<String, String> Xqedii_2nsyfrpsk4s23 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_35id4nq4ffsbh = -1382330628;
   private static volatile int Xqedii_2q5eq3ao1g48b = -1059647069;
   private static volatile int Xqedii_36o4j7bqx9u3e = -365796144;
   private static volatile int Xqedii_27tv9fmixe8qb = -1981582062;
   private static volatile long Xqedii_11y8eyo57cpar = 3551152486712082344L;
   private static volatile long Xqedii_269jd4kwhhvva = -3641088139405383334L;
   private static volatile long Xqedii_1a3klkrdmegkz = -6162928248825575020L;
   private static volatile long Xqedii_22awj8amqich7 = -8051649253046209769L;

   public static int Xqedii_34l9tgj9x80qg(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_35id4nq4ffsbh, var1);
   }

   public static int Xqedii_123ykryxtx5wk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2q5eq3ao1g48b;
   }

   public static int Xqedii_1t4uamdt2319h(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_36o4j7bqx9u3e;
   }

   public static int Xqedii_2kwbdcticxba(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_27tv9fmixe8qb, var1);
   }

   public static long Xqedii_1afpu33xn9tcl(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_11y8eyo57cpar, var2);
   }

   public static long Xqedii_dhub2x6rgyke(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_269jd4kwhhvva;
   }

   public static long Xqedii_14blrkckprkhd(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1a3klkrdmegkz;
   }

   public static long Xqedii_33fd5sze8e854(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_22awj8amqich7, var2);
   }

   public static String Xqedii_1v2wfx2pqisvl(String var0) {
      String var1 = Xqedii_2nsyfrpsk4s23.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("iNIxa++jL8Rbtw2CAMBNdzHVoYmcT6OcZ/gMWQPY6qc=");
            int var3 = 354525873;

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
            String var9 = Xqedii_2nsyfrpsk4s23.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_e0lr048aajbf() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3bbodnj7tpxbi() {
   }

   private static int Xqedii_1iebedrkxl4uu(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2cuhn0le0noxg(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
