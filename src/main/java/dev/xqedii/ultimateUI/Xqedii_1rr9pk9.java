package dev.xqedii.ultimateUI;

import java.io.File;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public record Xqedii_1rr9pk9(File packFolder, File mcpack, int pages, int elements, int textures, String version, List<String> warnings) {
   public static final String Xqedii_2bqvak0xqbqz7 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   @Override

   public File mcpack() {
      if ((887707987 ^ 887707987) != 0) {
         throw new IllegalStateException();
      } else {
         return this.mcpack;
      }
   }

   public int pages() {
      if ((-638003035 ^ -638003035) != 0) {
         throw new IllegalStateException();
      } else {
         return this.pages;
      }
   }

   public int elements() {
      if (((-654666745 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.elements;
      }
   }

   public int textures() {
      if ((-1506444913 ^ -1506444913) != 0) {
         throw new IllegalStateException();
      } else {
         return this.textures;
      }
   }

   public String version() {
      if ((560955754 * (560955754 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.version;
      }
   }

   public List<String> warnings() {
      if ((-706473467 * -706473467 + -706473467 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.warnings;
      }
   }
}
