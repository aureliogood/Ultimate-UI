package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2k0ieod {
   private static final ConcurrentHashMap<String, String> Xqedii_j3mymhtlz1qi = new ConcurrentHashMap<>();
   private static volatile int Xqedii_efrfebxs3lqz = -546525958;
   private static volatile int Xqedii_2p6bnl222ukqe = 71763622;
   private static volatile int Xqedii_3v68u7wrbhbpq = -2003410201;
   private static volatile int Xqedii_2qyxczpywqb1u = 1056193583;
   private static volatile long Xqedii_17p8i40o2lho9 = 1846876868630362314L;
   private static volatile long Xqedii_1xxc9siqxu9v2 = -4705488026434592745L;
   private static volatile long Xqedii_1znuubhhf60w2 = 2770670294192222157L;
   private static volatile long Xqedii_3c1h9tt607pxg = -2417501815254355387L;

   public static int Xqedii_1r93z3zbojih4(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_efrfebxs3lqz, var1);
   }

   public static int Xqedii_32cqz2k6icn49(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2p6bnl222ukqe;
   }

   public static int Xqedii_3mk1maa2e9wls(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3v68u7wrbhbpq;
   }

   public static int Xqedii_2vttf5mr45abz(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2qyxczpywqb1u, var1);
   }

   public static long Xqedii_1nl7goactz75(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_17p8i40o2lho9, var2);
   }

   public static long Xqedii_1vtifk1mwxojt(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1xxc9siqxu9v2;
   }

   public static long Xqedii_1vc20isbhty1f(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1znuubhhf60w2;
   }

   public static long Xqedii_2bfnxfq9k9jh0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3c1h9tt607pxg, var2);
   }

   public static String Xqedii_2b9iyvnr5n78c(String var0) {
      String var1 = Xqedii_j3mymhtlz1qi.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("RFKPwVaGSE3yhqy8B+cNyIs2knxCyGw+UFepbqeaZz8=");
            int var3 = 830074091;

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
            String var9 = Xqedii_j3mymhtlz1qi.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_cxqshltgwgu4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1bbzm67johucm() {
   }

   private static int Xqedii_30coamu6twgnp(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3bfz5wfuoi4z6(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
