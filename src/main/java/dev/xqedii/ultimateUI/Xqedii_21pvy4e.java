package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_21pvy4e {
   private static final ConcurrentHashMap<String, String> Xqedii_1l7jngrrcwvh6 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1vye00xszuwrh = -963794408;
   private static volatile int Xqedii_78npkrmd337b = -1895155350;
   private static volatile int Xqedii_33f8jz267vchf = -565552451;
   private static volatile int Xqedii_2q8zsxj0tiij1 = 1632861502;
   private static volatile long Xqedii_slmfs6mturkg = -197513347525565773L;
   private static volatile long Xqedii_35i8nycg20159 = 1653661193294728899L;
   private static volatile long Xqedii_1zsn7xi74ebwl = 5678604376290000945L;
   private static volatile long Xqedii_352kf8b4sxd6z = -4873155521335302472L;

   public static int Xqedii_1m2ie2mgc531z(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1vye00xszuwrh, var1);
   }

   public static int Xqedii_2a9zs4eaj7mhr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_78npkrmd337b;
   }

   public static int Xqedii_2dpwzxxlxkdll(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_33f8jz267vchf;
   }

   public static int Xqedii_2bfvhy2yj102j(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2q8zsxj0tiij1, var1);
   }

   public static long Xqedii_30l3aae326hn5(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_slmfs6mturkg, var2);
   }

   public static long Xqedii_y915tu8p9hnv(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_35i8nycg20159;
   }

   public static long Xqedii_3gq8vg4pglg6j(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1zsn7xi74ebwl;
   }

   public static long Xqedii_16jw7awz1hkkx(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_352kf8b4sxd6z, var2);
   }

   public static String Xqedii_9emh7rlcgmak(String var0) {
      String var1 = Xqedii_1l7jngrrcwvh6.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("OuDI7uckgfE3f3z7DRmwPnOIIqfVXrlkpQI+ZcEYwNk=");
            int var3 = 1532772935;

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
            String var9 = Xqedii_1l7jngrrcwvh6.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2v9o0ahkg85ru() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2og36cbxil09j() {
   }

   private static int Xqedii_1oh5gwcbr359u(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3juqcs6az955r(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
