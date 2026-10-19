package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_302h8u3 {
   private static final ConcurrentHashMap<String, String> Xqedii_8o9672gthsok = new ConcurrentHashMap<>();
   private static volatile int Xqedii_q9q3tkdu0vfi = 1065538576;
   private static volatile int Xqedii_227nqetvwhqus = -1256783215;
   private static volatile int Xqedii_26us8s1luy0mj = -1412608714;
   private static volatile int Xqedii_2z6saj7kp6kea = 622111707;
   private static volatile long Xqedii_38pgcwcpn3som = -7539251415532453033L;
   private static volatile long Xqedii_2rzchexw2eb37 = -8201971792403994730L;
   private static volatile long Xqedii_1lfqa50skp35x = 3755082711105118920L;
   private static volatile long Xqedii_3jy3n4q3yl3gf = -6571913878266642261L;

   public static int Xqedii_1ekqv625e0rat(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_q9q3tkdu0vfi, var1);
   }

   public static int Xqedii_14bti07kcokaw(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_227nqetvwhqus;
   }

   public static int Xqedii_2yzin6yo6stx7(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_26us8s1luy0mj;
   }

   public static int Xqedii_cbabkstomtqj(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2z6saj7kp6kea, var1);
   }

   public static long Xqedii_2h1bei65ip942(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_38pgcwcpn3som, var2);
   }

   public static long Xqedii_23l96c4zw4668(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2rzchexw2eb37;
   }

   public static long Xqedii_2w0me19jqjmcq(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1lfqa50skp35x;
   }

   public static long Xqedii_34rn38hja2mqj(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3jy3n4q3yl3gf, var2);
   }

   public static String Xqedii_3opb193qrhry5(String var0) {
      String var1 = Xqedii_8o9672gthsok.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("PMsvGDLKzu21F2nlf/QxtPlWtxCriMm44V36xcGqhwU=");
            int var3 = -557026189;

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
            String var9 = Xqedii_8o9672gthsok.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2wmv7dixg1ge7() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1pvcgb4s4pthd() {
   }

   private static int Xqedii_1ml1wzqapl4tn(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2zkco2m15fr71(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
