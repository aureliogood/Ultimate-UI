package dev.xqedii.ultimateUI;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public record Xqedii_q3cx0a5(File source, boolean zip) {
   public static final String Xqedii_vyswfy9wxeuq = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public String signature() {
      if (((773831606 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (this.zip) {
         return Xqedii_toi3u78s0ui9(this.source.getAbsolutePath(), this.source.lastModified(), this.source.length());
      } else {
         long var1 = Xqedii_382spr8.Xqedii_37cfzjwvzpuk0(507586204702062480L, 1);

         try (Stream<Path> var3 = Files.walk(this.source.toPath())) {
            for (Path var5 : var3.filter(var0 -> {
               if ((-316050843 * -316050843 - -316050843 & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  return Files.isRegularFile(var0);
               }
            }).sorted().toList()) {
               File var6 = var5.toFile();
               var1 = Xqedii_382spr8.Xqedii_2e6i0b5lc5mpr(-8329199311767524813L, 23) * var1 + var5.toString().hashCode();
               var1 = Xqedii_382spr8.Xqedii_37cfzjwvzpuk0(507586204701841330L, 13) * var1 + Long.hashCode(var6.lastModified());
               var1 = Xqedii_382spr8.Xqedii_2e6i0b5lc5mpr(-3588908253066908504L, 17) * var1 + Long.hashCode(var6.length());
            }
         } catch (IOException var9) {
            var1 = System.currentTimeMillis();
         }

         return Xqedii_200x8sd075b7j(this.source.getAbsolutePath(), var1);
      }
   }

   public Map<String, byte[]> read() throws IOException {
      if (((-1208701621 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var1 = new LinkedHashMap();
         if (this.zip) {
            try (ZipFile var14 = new ZipFile(this.source)) {
               Enumeration var15 = var14.entries();

               while (var15.hasMoreElements()) {
                  ZipEntry var16 = (ZipEntry)var15.nextElement();
                  if (!var16.isDirectory()) {
                     try (InputStream var17 = var14.getInputStream(var16)) {
                        var1.put(var16.getName(), var17.readAllBytes());
                     }
                  }
               }
            }

            return var1;
         } else {
            Path var2 = this.source.toPath();

            try (Stream<Path> var3 = Files.walk(var2)) {
               for (Path var5 : var3.filter(var0 -> {
                  if ((-1210630126 * (-1210630126 + 1) & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     return Files.isRegularFile(var0);
                  }
               }).toList()) {
                  var1.put(Xqedii_3s68w2g.Xqedii_3c4jmju(var2, var5), Files.readAllBytes(var5));
               }
            }

            return var1;
         }
      }
   }

   @Override

   public boolean zip() {
      if (((706473545 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.zip;
      }
   }

   private static /* synthetic */ String Xqedii_toi3u78s0ui9(String string, long l, long l2) {
        return Xqedii_382spr8.Xqedii_3sd3arclbx0w9((String)"MSAlro2zXD++bMCnCN23avsgyr2dd2BG+Wqf1oYYQwCgHxzS") + string + Xqedii_382spr8.Xqedii_3sd3arclbx0w9((String)"Q2MLY1VjivAxTnTa2edBZmdUZALEZxivr/BUFFQw") + l + Xqedii_382spr8.Xqedii_3sd3arclbx0w9((String)"Q2MLY1VjivAxTnTa2edBZmdUZALEZxivr/BUFFQw") + l2;
    }

    private static /* synthetic */ String Xqedii_200x8sd075b7j(String string, long l) {
        return Xqedii_382spr8.Xqedii_3sd3arclbx0w9((String)"NXFuGvcmPl6auAbWZoxWoWXuNxLHJRD9YThPL9d2CLs9g9Ceau7RtsUE") + string + Xqedii_382spr8.Xqedii_3sd3arclbx0w9((String)"Q2MLY1VjivAxTnTa2edBZmdUZALEZxivr/BUFFQw") + l;
    }
}
