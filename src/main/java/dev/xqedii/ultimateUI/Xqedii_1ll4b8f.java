package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1ll4b8f {
   private static final ConcurrentHashMap<String, String> Xqedii_2ozj9dvlcbooh = new ConcurrentHashMap<>();
   private static volatile int Xqedii_sm32uequexw = 172534716;
   private static volatile int Xqedii_1j0znduq6vcxn = -411834032;
   private static volatile int Xqedii_whk8zjcnjz8u = 643146879;
   private static volatile int Xqedii_2qcvisoovk7uy = -478510107;
   private static volatile long Xqedii_ui2o1vadqjqc = -5527237623840067867L;
   private static volatile long Xqedii_u49xtn0zmgrs = -4146830289713129736L;
   private static volatile long Xqedii_1hebioy72wnrg = -2164679916371380947L;
   private static volatile long Xqedii_1e3rj0djhfv1t = 2394938660650987646L;

   public static int Xqedii_2nd4srw9ua8mw(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_sm32uequexw, var1);
   }

   public static int Xqedii_3b5h0kv1nj529(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1j0znduq6vcxn;
   }

   public static int Xqedii_qlyptkcxe126(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_whk8zjcnjz8u;
   }

   public static int Xqedii_3cgrum3jpxx6i(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2qcvisoovk7uy, var1);
   }

   public static long Xqedii_2f0bds29lduvx(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_ui2o1vadqjqc, var2);
   }

   public static long Xqedii_3sfzfq03j3v37(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_u49xtn0zmgrs;
   }

   public static long Xqedii_9ysrjbgsa9up(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1hebioy72wnrg;
   }

   public static long Xqedii_16nax65bki5yd(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1e3rj0djhfv1t, var2);
   }

   public static String Xqedii_e7m7vl9xym69(String var0) {
      String var1 = Xqedii_2ozj9dvlcbooh.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("IJwlbKL8YhS2K6Qylan2wCiAwml+hkYevrL7gTpgTOk=");
            int var3 = -448152490;

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
            String var9 = Xqedii_2ozj9dvlcbooh.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_35o23q1zxcxnj() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2lg8vxacqifjg() {
   }

   private static int Xqedii_1yhpklul6bqe6(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_27qstym1mv3vl(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
