package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_n2jcre8 {
   private static final ConcurrentHashMap<String, String> Xqedii_1yu5u3mpir3ek = new ConcurrentHashMap<>();
   private static volatile int Xqedii_18gig8gq75na1 = -1199598748;
   private static volatile int Xqedii_26lox2sm69vke = 125841072;
   private static volatile int Xqedii_2q7jexo7gtatn = 638168962;
   private static volatile int Xqedii_2vs7t1150qgt4 = 388705038;
   private static volatile long Xqedii_3plz7yi88ftau = -3650378876173032072L;
   private static volatile long Xqedii_3mkf0pfjwzis5 = 2051848511390143890L;
   private static volatile long Xqedii_rleh5bn0eewx = -4462800363382751883L;
   private static volatile long Xqedii_2z7bfrxwpei94 = 1158250189378447308L;

   public static int Xqedii_1r8xnv0vbutuq(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_18gig8gq75na1, var1);
   }

   public static int Xqedii_jadvr1i8ywgo(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_26lox2sm69vke;
   }

   public static int Xqedii_30vkvass5pe5x(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2q7jexo7gtatn;
   }

   public static int Xqedii_etnojfjjhdwd(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2vs7t1150qgt4, var1);
   }

   public static long Xqedii_9ghvb8qzudj7(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3plz7yi88ftau, var2);
   }

   public static long Xqedii_12stkspf5776q(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3mkf0pfjwzis5;
   }

   public static long Xqedii_1qbs06of1j060(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_rleh5bn0eewx;
   }

   public static long Xqedii_1noec345lxn3l(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2z7bfrxwpei94, var2);
   }

   public static String Xqedii_2rjhj38xw8cit(String var0) {
      String var1 = Xqedii_1yu5u3mpir3ek.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("rIrfHNUS9RWU/xSs5OSzzQChR2VkjCEYP0p/9/393wg=");
            int var3 = -207881803;

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
            String var9 = Xqedii_1yu5u3mpir3ek.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2r127pujymclr() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2ckb1d91lf75e() {
   }

   private static int Xqedii_5i0fjjvsdl1(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_34fug4d1ofzrn(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
